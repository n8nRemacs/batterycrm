package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DataBuffer.java */
/* loaded from: classes7.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f363445a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f363446b;

    /* renamed from: c, reason: collision with root package name */
    private int f363447c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f363448d;

    /* compiled from: DataBuffer.java */
    public static class a implements Parcelable.Creator<b> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i12) {
            return new b[i12];
        }
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static ClassLoader a(Class cls) {
        return cls.getClassLoader();
    }

    public int b() {
        return this.f363448d == null ? 0 : 1;
    }

    public int c() {
        return this.f363447c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f363447c);
        parcel.writeString(this.f363445a);
        parcel.writeBundle(this.f363446b);
        parcel.writeBundle(this.f363448d);
    }

    private b(Parcel parcel) {
        this.f363446b = null;
        this.f363447c = 1;
        this.f363448d = null;
        a(parcel);
    }

    public b a(Bundle bundle) {
        this.f363448d = bundle;
        return this;
    }

    public Bundle a() {
        return this.f363448d;
    }

    private void a(Parcel parcel) {
        this.f363447c = parcel.readInt();
        this.f363445a = parcel.readString();
        this.f363446b = parcel.readBundle(a(Bundle.class));
        this.f363448d = parcel.readBundle(a(Bundle.class));
    }

    public b() {
        this.f363446b = null;
        this.f363447c = 1;
        this.f363448d = null;
    }

    public b(String str, int i12) {
        this.f363446b = null;
        this.f363448d = null;
        this.f363445a = str;
        this.f363447c = i12;
    }
}
