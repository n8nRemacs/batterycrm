package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38861hl implements Parcelable {
    public static final Parcelable.Creator<C38861hl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f380733a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f380734b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f380735c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f380736d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f380737e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f380738f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f380739g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f380740h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f380741i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f380742j;

    /* renamed from: k, reason: collision with root package name */
    public final int f380743k;

    /* renamed from: l, reason: collision with root package name */
    public final int f380744l;

    /* renamed from: m, reason: collision with root package name */
    public final int f380745m;

    /* renamed from: n, reason: collision with root package name */
    public final int f380746n;

    /* renamed from: o, reason: collision with root package name */
    public final int f380747o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    public final List<C39299zl> f380748p;

    /* renamed from: com.yandex.metrica.impl.ob.hl$a */
    public class a implements Parcelable.Creator<C38861hl> {
        @Override // android.os.Parcelable.Creator
        public C38861hl createFromParcel(Parcel parcel) {
            return new C38861hl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C38861hl[] newArray(int i12) {
            return new C38861hl[i12];
        }
    }

    public C38861hl(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, boolean z23, int i12, int i13, int i14, int i15, int i16, @j.N List<C39299zl> list) {
        this.f380733a = z12;
        this.f380734b = z13;
        this.f380735c = z14;
        this.f380736d = z15;
        this.f380737e = z16;
        this.f380738f = z17;
        this.f380739g = z18;
        this.f380740h = z19;
        this.f380741i = z22;
        this.f380742j = z23;
        this.f380743k = i12;
        this.f380744l = i13;
        this.f380745m = i14;
        this.f380746n = i15;
        this.f380747o = i16;
        this.f380748p = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38861hl.class != obj.getClass()) {
            return false;
        }
        C38861hl c38861hl = (C38861hl) obj;
        if (this.f380733a == c38861hl.f380733a && this.f380734b == c38861hl.f380734b && this.f380735c == c38861hl.f380735c && this.f380736d == c38861hl.f380736d && this.f380737e == c38861hl.f380737e && this.f380738f == c38861hl.f380738f && this.f380739g == c38861hl.f380739g && this.f380740h == c38861hl.f380740h && this.f380741i == c38861hl.f380741i && this.f380742j == c38861hl.f380742j && this.f380743k == c38861hl.f380743k && this.f380744l == c38861hl.f380744l && this.f380745m == c38861hl.f380745m && this.f380746n == c38861hl.f380746n && this.f380747o == c38861hl.f380747o) {
            return this.f380748p.equals(c38861hl.f380748p);
        }
        return false;
    }

    public int hashCode() {
        return this.f380748p.hashCode() + ((((((((((((((((((((((((((((((this.f380733a ? 1 : 0) * 31) + (this.f380734b ? 1 : 0)) * 31) + (this.f380735c ? 1 : 0)) * 31) + (this.f380736d ? 1 : 0)) * 31) + (this.f380737e ? 1 : 0)) * 31) + (this.f380738f ? 1 : 0)) * 31) + (this.f380739g ? 1 : 0)) * 31) + (this.f380740h ? 1 : 0)) * 31) + (this.f380741i ? 1 : 0)) * 31) + (this.f380742j ? 1 : 0)) * 31) + this.f380743k) * 31) + this.f380744l) * 31) + this.f380745m) * 31) + this.f380746n) * 31) + this.f380747o) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UiCollectingConfig{textSizeCollecting=");
        sb2.append(this.f380733a);
        sb2.append(", relativeTextSizeCollecting=");
        sb2.append(this.f380734b);
        sb2.append(", textVisibilityCollecting=");
        sb2.append(this.f380735c);
        sb2.append(", textStyleCollecting=");
        sb2.append(this.f380736d);
        sb2.append(", infoCollecting=");
        sb2.append(this.f380737e);
        sb2.append(", nonContentViewCollecting=");
        sb2.append(this.f380738f);
        sb2.append(", textLengthCollecting=");
        sb2.append(this.f380739g);
        sb2.append(", viewHierarchical=");
        sb2.append(this.f380740h);
        sb2.append(", ignoreFiltered=");
        sb2.append(this.f380741i);
        sb2.append(", webViewUrlsCollecting=");
        sb2.append(this.f380742j);
        sb2.append(", tooLongTextBound=");
        sb2.append(this.f380743k);
        sb2.append(", truncatedTextBound=");
        sb2.append(this.f380744l);
        sb2.append(", maxEntitiesCount=");
        sb2.append(this.f380745m);
        sb2.append(", maxFullContentLength=");
        sb2.append(this.f380746n);
        sb2.append(", webViewUrlLimit=");
        sb2.append(this.f380747o);
        sb2.append(", filters=");
        return androidx.compose.foundation.H.p(sb2, this.f380748p, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeByte(this.f380733a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380734b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380735c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380736d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380737e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380738f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380739g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380740h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380741i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380742j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f380743k);
        parcel.writeInt(this.f380744l);
        parcel.writeInt(this.f380745m);
        parcel.writeInt(this.f380746n);
        parcel.writeInt(this.f380747o);
        parcel.writeList(this.f380748p);
    }

    public C38861hl(Parcel parcel) {
        this.f380733a = parcel.readByte() != 0;
        this.f380734b = parcel.readByte() != 0;
        this.f380735c = parcel.readByte() != 0;
        this.f380736d = parcel.readByte() != 0;
        this.f380737e = parcel.readByte() != 0;
        this.f380738f = parcel.readByte() != 0;
        this.f380739g = parcel.readByte() != 0;
        this.f380740h = parcel.readByte() != 0;
        this.f380741i = parcel.readByte() != 0;
        this.f380742j = parcel.readByte() != 0;
        this.f380743k = parcel.readInt();
        this.f380744l = parcel.readInt();
        this.f380745m = parcel.readInt();
        this.f380746n = parcel.readInt();
        this.f380747o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C39299zl.class.getClassLoader());
        this.f380748p = arrayList;
    }
}
