package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.ra, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39096ra implements Parcelable {
    public static final Parcelable.Creator<C39096ra> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final C39073qa f381733a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final C39073qa f381734b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final C39073qa f381735c;

    /* renamed from: com.yandex.metrica.impl.ob.ra$a */
    public class a implements Parcelable.Creator<C39096ra> {
        @Override // android.os.Parcelable.Creator
        public C39096ra createFromParcel(Parcel parcel) {
            return new C39096ra(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C39096ra[] newArray(int i12) {
            return new C39096ra[i12];
        }
    }

    public C39096ra() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfigsHolder{activationConfig=" + this.f381733a + ", clidsInfoConfig=" + this.f381734b + ", preloadInfoConfig=" + this.f381735c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeParcelable(this.f381733a, i12);
        parcel.writeParcelable(this.f381734b, i12);
        parcel.writeParcelable(this.f381735c, i12);
    }

    public C39096ra(@j.P C39073qa c39073qa, @j.P C39073qa c39073qa2, @j.P C39073qa c39073qa3) {
        this.f381733a = c39073qa;
        this.f381734b = c39073qa2;
        this.f381735c = c39073qa3;
    }

    public C39096ra(Parcel parcel) {
        this.f381733a = (C39073qa) parcel.readParcelable(C39073qa.class.getClassLoader());
        this.f381734b = (C39073qa) parcel.readParcelable(C39073qa.class.getClassLoader());
        this.f381735c = (C39073qa) parcel.readParcelable(C39073qa.class.getClassLoader());
    }
}
