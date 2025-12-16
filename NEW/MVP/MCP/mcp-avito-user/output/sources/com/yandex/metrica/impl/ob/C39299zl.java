package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.zl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39299zl implements Parcelable {
    public static final Parcelable.Creator<C39299zl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final b f382327a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f382328b;

    /* renamed from: com.yandex.metrica.impl.ob.zl$a */
    public class a implements Parcelable.Creator<C39299zl> {
        @Override // android.os.Parcelable.Creator
        public C39299zl createFromParcel(Parcel parcel) {
            return new C39299zl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C39299zl[] newArray(int i12) {
            return new C39299zl[i12];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.zl$b */
    public enum b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f382334a;

        b(int i12) {
            this.f382334a = i12;
        }

        @j.N
        public static b a(int i12) {
            b[] bVarArrValues = values();
            for (int i13 = 0; i13 < 4; i13++) {
                b bVar = bVarArrValues[i13];
                if (bVar.f382334a == i12) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C39299zl(@j.N b bVar, @j.N String str) {
        this.f382327a = bVar;
        this.f382328b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39299zl.class != obj.getClass()) {
            return false;
        }
        C39299zl c39299zl = (C39299zl) obj;
        if (this.f382327a != c39299zl.f382327a) {
            return false;
        }
        return this.f382328b.equals(c39299zl.f382328b);
    }

    public int hashCode() {
        return this.f382328b.hashCode() + (this.f382327a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UiParsingFilter{type=");
        sb2.append(this.f382327a);
        sb2.append(", value='");
        return AK.c.s(sb2, this.f382328b, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f382327a.f382334a);
        parcel.writeString(this.f382328b);
    }

    public C39299zl(Parcel parcel) {
        this.f382327a = b.a(parcel.readInt());
        this.f382328b = (String) Tl.a(parcel.readString(), "");
    }
}
