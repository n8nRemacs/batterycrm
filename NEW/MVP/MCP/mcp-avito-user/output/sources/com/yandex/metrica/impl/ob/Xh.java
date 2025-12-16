package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C42822w;

/* loaded from: classes7.dex */
public final class Xh implements Parcelable {

    @Y61.k
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final Boolean f379927a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final U0 f379928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final String f379929c;

    public static final class a implements Parcelable.Creator<Xh> {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        public Xh createFromParcel(Parcel parcel) {
            Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(value instanceof Boolean)) {
                value = null;
            }
            return new Xh((Boolean) value, U0.a(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public Xh[] newArray(int i12) {
            return new Xh[i12];
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public Xh(@Y61.l Boolean bool, @Y61.k U0 u02, @Y61.l String str) {
        this.f379927a = bool;
        this.f379928b = u02;
        this.f379929c = str;
    }

    @Y61.l
    public final String a() {
        return this.f379929c;
    }

    @Y61.l
    public final Boolean b() {
        return this.f379927a;
    }

    @Y61.k
    public final U0 c() {
        return this.f379928b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xh)) {
            return false;
        }
        Xh xh2 = (Xh) obj;
        return kotlin.jvm.internal.L.f(this.f379927a, xh2.f379927a) && kotlin.jvm.internal.L.f(this.f379928b, xh2.f379928b) && kotlin.jvm.internal.L.f(this.f379929c, xh2.f379929c);
    }

    public int hashCode() {
        Boolean bool = this.f379927a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        U0 u02 = this.f379928b;
        int iHashCode2 = (iHashCode + (u02 != null ? u02.hashCode() : 0)) * 31;
        String str = this.f379929c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FeaturesInternal(sslPinning=");
        sb2.append(this.f379927a);
        sb2.append(", status=");
        sb2.append(this.f379928b);
        sb2.append(", errorExplanation=");
        return AK.c.s(sb2, this.f379929c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeValue(this.f379927a);
        parcel.writeString(this.f379928b.a());
        parcel.writeString(this.f379929c);
    }

    public Xh() {
        this(null, U0.UNKNOWN, null);
    }
}
