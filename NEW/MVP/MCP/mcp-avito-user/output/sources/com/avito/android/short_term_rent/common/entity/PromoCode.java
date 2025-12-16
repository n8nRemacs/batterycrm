package com.avito.android.short_term_rent.common.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CostInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoCode.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/common/entity/PromoCode;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromoCode implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoCode> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f282217b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f282218c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f282219d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f282220e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f282221f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<CostInfo> f282222g;

    /* compiled from: PromoCode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoCode> {
        @Override // android.os.Parcelable.Creator
        public final PromoCode createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(PromoCode.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CostInfo.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new PromoCode(string, string2, universalImage, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoCode[] newArray(int i12) {
            return new PromoCode[i12];
        }
    }

    public PromoCode() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCode)) {
            return false;
        }
        PromoCode promoCode = (PromoCode) obj;
        return L.f(this.f282217b, promoCode.f282217b) && L.f(this.f282218c, promoCode.f282218c) && L.f(this.f282219d, promoCode.f282219d) && L.f(this.f282220e, promoCode.f282220e) && L.f(this.f282221f, promoCode.f282221f) && L.f(this.f282222g, promoCode.f282222g);
    }

    public final int hashCode() {
        String str = this.f282217b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f282218c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f282219d;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.f282220e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f282221f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<CostInfo> list = this.f282222g;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoCode(percent=");
        sb2.append(this.f282217b);
        sb2.append(", text=");
        sb2.append(this.f282218c);
        sb2.append(", image=");
        sb2.append(this.f282219d);
        sb2.append(", code=");
        sb2.append(this.f282220e);
        sb2.append(", toastText=");
        sb2.append(this.f282221f);
        sb2.append(", costInfo=");
        return H.p(sb2, this.f282222g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f282217b);
        parcel.writeString(this.f282218c);
        parcel.writeParcelable(this.f282219d, i12);
        parcel.writeString(this.f282220e);
        parcel.writeString(this.f282221f);
        List<CostInfo> list = this.f282222g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((CostInfo) itA.next()).writeToParcel(parcel, i12);
        }
    }

    public PromoCode(@l String str, @l String str2, @l UniversalImage universalImage, @l String str3, @l String str4, @l List<CostInfo> list) {
        this.f282217b = str;
        this.f282218c = str2;
        this.f282219d = universalImage;
        this.f282220e = str3;
        this.f282221f = str4;
        this.f282222g = list;
    }

    public /* synthetic */ PromoCode(String str, String str2, UniversalImage universalImage, String str3, String str4, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : universalImage, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : list);
    }
}
