package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaPixels;", "Landroid/os/Parcelable;", "Lcom/avito/android/advertising/loaders/event_service/b;", "Lcom/avito/android/advertising/loaders/event_service/i;", "Lcom/avito/android/advertising/loaders/event_service/j;", "Lcom/avito/android/advertising/loaders/event_service/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaPixels implements Parcelable, com.avito.android.advertising.loaders.event_service.b, com.avito.android.advertising.loaders.event_service.i, com.avito.android.advertising.loaders.event_service.j, com.avito.android.advertising.loaders.event_service.a {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaPixels> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f88295b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<String> f88296c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<String> f88297d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f88298e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<String> f88299f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f88300g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f88301h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f88302i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f88303j;

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaPixels> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaPixels createFromParcel(Parcel parcel) {
            return new BuzzoolaPixels(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaPixels[] newArray(int i12) {
            return new BuzzoolaPixels[i12];
        }
    }

    public BuzzoolaPixels(@Y61.k List<String> list, @Y61.k List<String> list2, @Y61.k List<String> list3, @Y61.k String str, @Y61.k List<String> list4, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f88295b = list;
        this.f88296c = list2;
        this.f88297d = list3;
        this.f88298e = str;
        this.f88299f = list4;
        this.f88300g = z12;
        this.f88301h = z13;
        this.f88302i = z14;
        this.f88303j = z15;
    }

    @Override // com.avito.android.advertising.loaders.event_service.i
    @Y61.k
    public final List<String> D() {
        return this.f88296c;
    }

    @Override // com.avito.android.advertising.loaders.event_service.i
    public final void F() {
        this.f88301h = true;
    }

    @Override // com.avito.android.advertising.loaders.event_service.b
    @Y61.k
    public final List<String> K() {
        return this.f88297d;
    }

    @Override // com.avito.android.advertising.loaders.event_service.b
    public final void L() {
        this.f88302i = true;
    }

    @Override // com.avito.android.advertising.loaders.event_service.b
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF87989f() {
        return this.f88298e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaPixels)) {
            return false;
        }
        BuzzoolaPixels buzzoolaPixels = (BuzzoolaPixels) obj;
        return L.f(this.f88295b, buzzoolaPixels.f88295b) && L.f(this.f88296c, buzzoolaPixels.f88296c) && L.f(this.f88297d, buzzoolaPixels.f88297d) && L.f(this.f88298e, buzzoolaPixels.f88298e) && L.f(this.f88299f, buzzoolaPixels.f88299f) && this.f88300g == buzzoolaPixels.f88300g && this.f88301h == buzzoolaPixels.f88301h && this.f88302i == buzzoolaPixels.f88302i && this.f88303j == buzzoolaPixels.f88303j;
    }

    @Override // com.avito.android.advertising.loaders.event_service.a
    /* renamed from: f, reason: from getter */
    public final boolean getF88303j() {
        return this.f88303j;
    }

    @Override // com.avito.android.advertising.loaders.event_service.i
    /* renamed from: g, reason: from getter */
    public final boolean getF87986c() {
        return this.f88301h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88303j) + r.i(r.i(r.i(H.e(H.d(H.e(H.e(this.f88295b.hashCode() * 31, 31, this.f88296c), 31, this.f88297d), 31, this.f88298e), 31, this.f88299f), 31, this.f88300g), 31, this.f88301h), 31, this.f88302i);
    }

    @Override // com.avito.android.advertising.loaders.event_service.a
    public final void i() {
        this.f88303j = true;
    }

    @Override // com.avito.android.advertising.loaders.event_service.a
    @Y61.k
    public final List<String> j() {
        return this.f88299f;
    }

    @Override // com.avito.android.advertising.loaders.event_service.b
    /* renamed from: l0, reason: from getter */
    public final boolean getF87988e() {
        return this.f88302i;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuzzoolaPixels(loadUrls=");
        sb2.append(this.f88295b);
        sb2.append(", impressionUrls=");
        sb2.append(this.f88296c);
        sb2.append(", clickUrls=");
        sb2.append(this.f88297d);
        sb2.append(", networkName=");
        sb2.append(this.f88298e);
        sb2.append(", avitoImpressionUrls=");
        sb2.append(this.f88299f);
        sb2.append(", wasLoadTracked=");
        sb2.append(this.f88300g);
        sb2.append(", wasImpressionTracked=");
        sb2.append(this.f88301h);
        sb2.append(", wasClickTracked=");
        sb2.append(this.f88302i);
        sb2.append(", wasAvitoImpressionTracked=");
        return r.x(sb2, this.f88303j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeStringList(this.f88295b);
        parcel.writeStringList(this.f88296c);
        parcel.writeStringList(this.f88297d);
        parcel.writeString(this.f88298e);
        parcel.writeStringList(this.f88299f);
        parcel.writeInt(this.f88300g ? 1 : 0);
        parcel.writeInt(this.f88301h ? 1 : 0);
        parcel.writeInt(this.f88302i ? 1 : 0);
        parcel.writeInt(this.f88303j ? 1 : 0);
    }

    public BuzzoolaPixels(List list, List list2, List list3, String str, List list4, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this(list, list2, list3, (i12 & 8) != 0 ? "buzzoola" : str, (i12 & 16) != 0 ? C42784z0.f406748b : list4, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? false : z14, (i12 & 256) != 0 ? false : z15);
    }
}
