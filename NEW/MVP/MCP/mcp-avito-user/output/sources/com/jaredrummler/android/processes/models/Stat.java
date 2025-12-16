package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class Stat extends ProcFile {
    public static final Parcelable.Creator<Stat> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String[] f364312c;

    public static class a implements Parcelable.Creator<Stat> {
        @Override // android.os.Parcelable.Creator
        public final Stat createFromParcel(Parcel parcel) {
            return new Stat(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Stat[] newArray(int i12) {
            return new Stat[i12];
        }
    }

    public Stat(String str) {
        super(str);
        this.f364312c = this.f364311b.split("\\s+");
    }

    public static Stat b(int i12) {
        Locale locale = Locale.ENGLISH;
        return new Stat(G.e(i12, "/proc/", "/stat"));
    }

    @Override // com.jaredrummler.android.processes.models.ProcFile, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        super.writeToParcel(parcel, i12);
        parcel.writeStringArray(this.f364312c);
    }

    public Stat(Parcel parcel, a aVar) {
        super(parcel);
        this.f364312c = parcel.createStringArray();
    }
}
