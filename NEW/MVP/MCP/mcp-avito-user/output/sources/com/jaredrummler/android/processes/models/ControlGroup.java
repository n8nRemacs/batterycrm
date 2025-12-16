package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes7.dex */
public class ControlGroup implements Parcelable {
    public static final Parcelable.Creator<ControlGroup> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f364308b;

    /* renamed from: c, reason: collision with root package name */
    public final String f364309c;

    /* renamed from: d, reason: collision with root package name */
    public final String f364310d;

    public static class a implements Parcelable.Creator<ControlGroup> {
        @Override // android.os.Parcelable.Creator
        public final ControlGroup createFromParcel(Parcel parcel) {
            return new ControlGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ControlGroup[] newArray(int i12) {
            return new ControlGroup[i12];
        }
    }

    public ControlGroup(String str) {
        String[] strArrSplit = str.split(":");
        this.f364308b = Integer.parseInt(strArrSplit[0]);
        this.f364309c = strArrSplit[1];
        this.f364310d = strArrSplit[2];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        return this.f364308b + ":" + this.f364309c + ":" + this.f364310d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f364308b);
        parcel.writeString(this.f364309c);
        parcel.writeString(this.f364310d);
    }

    public ControlGroup(Parcel parcel) {
        this.f364308b = parcel.readInt();
        this.f364309c = parcel.readString();
        this.f364310d = parcel.readString();
    }
}
