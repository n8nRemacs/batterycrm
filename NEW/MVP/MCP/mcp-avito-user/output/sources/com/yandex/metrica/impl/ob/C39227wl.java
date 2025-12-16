package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39227wl implements Parcelable {
    public static final Parcelable.Creator<C39227wl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f382144a;

    /* renamed from: b, reason: collision with root package name */
    public final int f382145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f382146c;

    /* renamed from: d, reason: collision with root package name */
    public final long f382147d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f382148e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f382149f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f382150g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final List<C39299zl> f382151h;

    /* renamed from: com.yandex.metrica.impl.ob.wl$a */
    public class a implements Parcelable.Creator<C39227wl> {
        @Override // android.os.Parcelable.Creator
        public C39227wl createFromParcel(Parcel parcel) {
            return new C39227wl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C39227wl[] newArray(int i12) {
            return new C39227wl[i12];
        }
    }

    public C39227wl(int i12, int i13, int i14, long j12, boolean z12, boolean z13, boolean z14, @j.N List<C39299zl> list) {
        this.f382144a = i12;
        this.f382145b = i13;
        this.f382146c = i14;
        this.f382147d = j12;
        this.f382148e = z12;
        this.f382149f = z13;
        this.f382150g = z14;
        this.f382151h = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39227wl.class != obj.getClass()) {
            return false;
        }
        C39227wl c39227wl = (C39227wl) obj;
        if (this.f382144a == c39227wl.f382144a && this.f382145b == c39227wl.f382145b && this.f382146c == c39227wl.f382146c && this.f382147d == c39227wl.f382147d && this.f382148e == c39227wl.f382148e && this.f382149f == c39227wl.f382149f && this.f382150g == c39227wl.f382150g) {
            return this.f382151h.equals(c39227wl.f382151h);
        }
        return false;
    }

    public int hashCode() {
        int i12 = ((((this.f382144a * 31) + this.f382145b) * 31) + this.f382146c) * 31;
        long j12 = this.f382147d;
        return this.f382151h.hashCode() + ((((((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f382148e ? 1 : 0)) * 31) + (this.f382149f ? 1 : 0)) * 31) + (this.f382150g ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UiParsingConfig{tooLongTextBound=");
        sb2.append(this.f382144a);
        sb2.append(", truncatedTextBound=");
        sb2.append(this.f382145b);
        sb2.append(", maxVisitedChildrenInLevel=");
        sb2.append(this.f382146c);
        sb2.append(", afterCreateTimeout=");
        sb2.append(this.f382147d);
        sb2.append(", relativeTextSizeCalculation=");
        sb2.append(this.f382148e);
        sb2.append(", errorReporting=");
        sb2.append(this.f382149f);
        sb2.append(", parsingAllowedByDefault=");
        sb2.append(this.f382150g);
        sb2.append(", filters=");
        return androidx.compose.foundation.H.p(sb2, this.f382151h, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f382144a);
        parcel.writeInt(this.f382145b);
        parcel.writeInt(this.f382146c);
        parcel.writeLong(this.f382147d);
        parcel.writeByte(this.f382148e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f382149f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f382150g ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f382151h);
    }

    public C39227wl(Parcel parcel) {
        this.f382144a = parcel.readInt();
        this.f382145b = parcel.readInt();
        this.f382146c = parcel.readInt();
        this.f382147d = parcel.readLong();
        this.f382148e = parcel.readByte() != 0;
        this.f382149f = parcel.readByte() != 0;
        this.f382150g = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C39299zl.class.getClassLoader());
        this.f382151h = arrayList;
    }
}
