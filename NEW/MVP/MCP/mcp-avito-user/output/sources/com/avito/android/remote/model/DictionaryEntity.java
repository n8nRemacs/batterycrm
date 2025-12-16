package com.avito.android.remote.model;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes17.dex */
public class DictionaryEntity implements Parcelable, Entity<Long> {
    public static final Parcelable.Creator<DictionaryEntity> CREATOR = new Parcelable.Creator<DictionaryEntity>() { // from class: com.avito.android.remote.model.DictionaryEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DictionaryEntity createFromParcel(Parcel parcel) {
            return new DictionaryEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DictionaryEntity[] newArray(int i12) {
            return new DictionaryEntity[i12];
        }
    };

    /* renamed from: id, reason: collision with root package name */
    public final long f253609id;
    public String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.Entity
    public String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f253609id);
        parcel.writeString(this.name);
    }

    public DictionaryEntity(long j12) {
        this.f253609id = j12;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.Entity
    @N
    public Long getId() {
        return Long.valueOf(this.f253609id);
    }

    private DictionaryEntity(Parcel parcel) {
        this.f253609id = parcel.readLong();
        this.name = parcel.readString();
    }
}
