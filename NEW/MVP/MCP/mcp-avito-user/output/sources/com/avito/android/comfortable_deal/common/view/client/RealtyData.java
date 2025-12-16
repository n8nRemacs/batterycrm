package com.avito.android.comfortable_deal.common.view.client;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientCardData.kt */
@F3
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/common/view/client/RealtyData;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RealtyData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealtyData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Uri f120643b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f120644c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f120645d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f120646e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f120647f;

    /* renamed from: g, reason: collision with root package name */
    public final float f120648g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f120649h;

    /* compiled from: ClientCardData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyData> {
        @Override // android.os.Parcelable.Creator
        public final RealtyData createFromParcel(Parcel parcel) {
            return new RealtyData((Uri) parcel.readParcelable(RealtyData.class.getClassLoader()), (AttributedText) parcel.readParcelable(RealtyData.class.getClassLoader()), (AttributedText) parcel.readParcelable(RealtyData.class.getClassLoader()), parcel.readString(), (UniversalColor) parcel.readParcelable(RealtyData.class.getClassLoader()), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyData[] newArray(int i12) {
            return new RealtyData[i12];
        }
    }

    public RealtyData(@Y61.l Uri uri, @Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k String str, @Y61.k UniversalColor universalColor, float f12, boolean z12) {
        this.f120643b = uri;
        this.f120644c = attributedText;
        this.f120645d = attributedText2;
        this.f120646e = str;
        this.f120647f = universalColor;
        this.f120648g = f12;
        this.f120649h = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyData)) {
            return false;
        }
        RealtyData realtyData = (RealtyData) obj;
        return L.f(this.f120643b, realtyData.f120643b) && L.f(this.f120644c, realtyData.f120644c) && L.f(this.f120645d, realtyData.f120645d) && L.f(this.f120646e, realtyData.f120646e) && L.f(this.f120647f, realtyData.f120647f) && Float.compare(this.f120648g, realtyData.f120648g) == 0 && this.f120649h == realtyData.f120649h;
    }

    public final int hashCode() {
        Uri uri = this.f120643b;
        int iB2 = com.avito.android.actions_sheet.a.b((uri == null ? 0 : uri.hashCode()) * 31, 31, this.f120644c);
        AttributedText attributedText = this.f120645d;
        return Boolean.hashCode(this.f120649h) + androidx.appcompat.app.r.d(this.f120648g, com.avito.android.actions_sheet.a.i(this.f120647f, H.d((iB2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f120646e), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyData(photo=");
        sb2.append(this.f120643b);
        sb2.append(", stage=");
        sb2.append(this.f120644c);
        sb2.append(", status=");
        sb2.append(this.f120645d);
        sb2.append(", title=");
        sb2.append(this.f120646e);
        sb2.append(", progressColor=");
        sb2.append(this.f120647f);
        sb2.append(", progress=");
        sb2.append(this.f120648g);
        sb2.append(", hidePhoto=");
        return androidx.appcompat.app.r.x(sb2, this.f120649h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f120643b, i12);
        parcel.writeParcelable(this.f120644c, i12);
        parcel.writeParcelable(this.f120645d, i12);
        parcel.writeString(this.f120646e);
        parcel.writeParcelable(this.f120647f, i12);
        parcel.writeFloat(this.f120648g);
        parcel.writeInt(this.f120649h ? 1 : 0);
    }

    public /* synthetic */ RealtyData(Uri uri, AttributedText attributedText, AttributedText attributedText2, String str, UniversalColor universalColor, float f12, boolean z12, int i12, C42822w c42822w) {
        this(uri, attributedText, attributedText2, str, universalColor, f12, (i12 & 64) != 0 ? false : z12);
    }
}
