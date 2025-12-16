package com.yandex.mobile.ads.base;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.l41;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.n6;
import com.yandex.mobile.ads.impl.rj1;
import com.yandex.mobile.ads.impl.v2;
import j.N;
import java.util.Locale;

/* loaded from: classes8.dex */
public class SizeInfo implements Parcelable {
    public static final Parcelable.Creator<SizeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f382620a;

    /* renamed from: b, reason: collision with root package name */
    private final int f382621b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final String f382622c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final int f382623d;

    public class a implements Parcelable.Creator<SizeInfo> {
        @Override // android.os.Parcelable.Creator
        public final SizeInfo createFromParcel(@N Parcel parcel) {
            return new SizeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SizeInfo[] newArray(int i12) {
            return new SizeInfo[i12];
        }
    }

    public SizeInfo(int i12, int i13, @N int i14) {
        this.f382620a = (i12 >= 0 || -1 == i12) ? i12 : 0;
        this.f382621b = (i13 >= 0 || -2 == i13) ? i13 : 0;
        this.f382623d = i14;
        Locale locale = Locale.US;
        this.f382622c = i12 + "x" + i13;
    }

    public final int a(@N Context context) {
        int i12 = this.f382621b;
        return -2 == i12 ? rj1.b(context) : i12;
    }

    public final int b(@N Context context) {
        int i12 = this.f382621b;
        if (-2 == i12) {
            int i13 = rj1.f389556b;
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        int i14 = rj1.f389556b;
        return l41.a(context, 1, i12);
    }

    public final int c() {
        return this.f382621b;
    }

    public final int d(@N Context context) {
        int i12 = this.f382620a;
        if (-1 == i12) {
            int i13 = rj1.f389556b;
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        int i14 = rj1.f389556b;
        return l41.a(context, 1, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f382620a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SizeInfo sizeInfo = (SizeInfo) obj;
        return this.f382620a == sizeInfo.f382620a && this.f382621b == sizeInfo.f382621b && this.f382623d == sizeInfo.f382623d;
    }

    public final int hashCode() {
        return n6.a(this.f382623d) + v2.a(this.f382622c, ((this.f382620a * 31) + this.f382621b) * 31, 31);
    }

    public final String toString() {
        return this.f382622c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeInt(this.f382620a);
        parcel.writeInt(this.f382621b);
        parcel.writeInt(n6.a(this.f382623d));
        parcel.writeString(this.f382622c);
    }

    public final int c(@N Context context) {
        int i12 = this.f382620a;
        return -1 == i12 ? rj1.c(context) : i12;
    }

    public SizeInfo(@N Parcel parcel) {
        this.f382620a = parcel.readInt();
        this.f382621b = parcel.readInt();
        this.f382623d = m41._values()[parcel.readInt()];
        this.f382622c = parcel.readString();
    }

    @N
    public final int d() {
        return this.f382623d;
    }
}
