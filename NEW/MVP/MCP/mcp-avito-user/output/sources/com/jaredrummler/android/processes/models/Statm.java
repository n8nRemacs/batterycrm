package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class Statm extends ProcFile {
    public static final Parcelable.Creator<Statm> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String[] f364313c;

    public static class a implements Parcelable.Creator<Statm> {
        @Override // android.os.Parcelable.Creator
        public final Statm createFromParcel(Parcel parcel) {
            return new Statm(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Statm[] newArray(int i12) {
            return new Statm[i12];
        }
    }

    public Statm(Parcel parcel, a aVar) {
        super(parcel);
        this.f364313c = parcel.createStringArray();
    }

    @Override // com.jaredrummler.android.processes.models.ProcFile, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        super.writeToParcel(parcel, i12);
        parcel.writeStringArray(this.f364313c);
    }
}
