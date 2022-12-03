package com.example.mynote.model
import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Note(
    @PrimaryKey val nid: Int,
    @ColumnInfo(name = "NoteName") var notename: String?,
    @ColumnInfo(name = "ModifiedDate") var modifieddate: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(nid)
        parcel.writeString(notename)
        parcel.writeString(modifieddate)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<Category> {
        override fun createFromParcel(parcel: Parcel): Category {
            return Category(parcel)
        }
        override fun newArray(size: Int): Array<Category?> {
            return arrayOfNulls(size)
        }
    }
}
