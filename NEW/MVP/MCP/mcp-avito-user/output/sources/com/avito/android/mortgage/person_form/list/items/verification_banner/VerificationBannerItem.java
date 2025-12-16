package com.avito.android.mortgage.person_form.list.items.verification_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/VerificationBannerItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class VerificationBannerItem implements PersonFormItem {

    @k
    public static final Parcelable.Creator<VerificationBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200822b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200823c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f200824d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f200825e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f200826f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f200827g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f200828h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f200829i;

    /* compiled from: VerificationBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final VerificationBannerItem createFromParcel(Parcel parcel) {
            return new VerificationBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationBannerItem[] newArray(int i12) {
            return new VerificationBannerItem[i12];
        }
    }

    public VerificationBannerItem(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, boolean z12, boolean z13, boolean z14) {
        this.f200822b = str;
        this.f200823c = str2;
        this.f200824d = str3;
        this.f200825e = str4;
        this.f200826f = str5;
        this.f200827g = z12;
        this.f200828h = z13;
        this.f200829i = z14;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return new VerificationBannerItem(this.f200822b, this.f200823c, this.f200824d, this.f200825e, this.f200826f, this.f200827g, this.f200828h, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationBannerItem)) {
            return false;
        }
        VerificationBannerItem verificationBannerItem = (VerificationBannerItem) obj;
        return L.f(this.f200822b, verificationBannerItem.f200822b) && L.f(this.f200823c, verificationBannerItem.f200823c) && L.f(this.f200824d, verificationBannerItem.f200824d) && L.f(this.f200825e, verificationBannerItem.f200825e) && L.f(this.f200826f, verificationBannerItem.f200826f) && this.f200827g == verificationBannerItem.f200827g && this.f200828h == verificationBannerItem.f200828h && this.f200829i == verificationBannerItem.f200829i;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200731e() {
        return this.f200829i;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162964b() {
        return this.f200822b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f200822b.hashCode() * 31, 31, this.f200823c);
        String str = this.f200824d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f200825e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f200826f;
        return Boolean.hashCode(this.f200829i) + r.i(r.i((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f200827g), 31, this.f200828h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationBannerItem(stringId=");
        sb2.append(this.f200822b);
        sb2.append(", title=");
        sb2.append(this.f200823c);
        sb2.append(", description=");
        sb2.append(this.f200824d);
        sb2.append(", imageUrl=");
        sb2.append(this.f200825e);
        sb2.append(", actionTitle=");
        sb2.append(this.f200826f);
        sb2.append(", isActionLoading=");
        sb2.append(this.f200827g);
        sb2.append(", isActionEnabled=");
        sb2.append(this.f200828h);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200829i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200822b);
        parcel.writeString(this.f200823c);
        parcel.writeString(this.f200824d);
        parcel.writeString(this.f200825e);
        parcel.writeString(this.f200826f);
        parcel.writeInt(this.f200827g ? 1 : 0);
        parcel.writeInt(this.f200828h ? 1 : 0);
        parcel.writeInt(this.f200829i ? 1 : 0);
    }

    public /* synthetic */ VerificationBannerItem(String str, String str2, String str3, String str4, String str5, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, z12, z13, (i12 & 128) != 0 ? true : z14);
    }
}
