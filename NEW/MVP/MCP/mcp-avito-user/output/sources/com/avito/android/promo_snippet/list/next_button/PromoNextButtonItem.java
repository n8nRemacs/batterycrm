package com.avito.android.promo_snippet.list.next_button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoNextButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo_snippet/list/next_button/PromoNextButtonItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PromoNextButtonItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PromoNextButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231740b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f231741c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f231742d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f231743e;

    /* compiled from: PromoNextButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoNextButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoNextButtonItem createFromParcel(Parcel parcel) {
            return new PromoNextButtonItem((DeepLink) parcel.readParcelable(PromoNextButtonItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoNextButtonItem[] newArray(int i12) {
            return new PromoNextButtonItem[i12];
        }
    }

    public PromoNextButtonItem(@k DeepLink deepLink, @k String str, @k String str2, boolean z12) {
        this.f231740b = str;
        this.f231741c = deepLink;
        this.f231742d = z12;
        this.f231743e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoNextButtonItem)) {
            return false;
        }
        PromoNextButtonItem promoNextButtonItem = (PromoNextButtonItem) obj;
        return L.f(this.f231740b, promoNextButtonItem.f231740b) && L.f(this.f231741c, promoNextButtonItem.f231741c) && this.f231742d == promoNextButtonItem.f231742d && L.f(this.f231743e, promoNextButtonItem.f231743e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return getF229164b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229164b() {
        return this.f231743e;
    }

    public final int hashCode() {
        return this.f231743e.hashCode() + r.i(com.avito.android.actions_sheet.a.e(this.f231741c, this.f231740b.hashCode() * 31, 31), 31, this.f231742d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoNextButtonItem(title=");
        sb2.append(this.f231740b);
        sb2.append(", deepLink=");
        sb2.append(this.f231741c);
        sb2.append(", useCustomCornerRadius=");
        sb2.append(this.f231742d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f231743e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231740b);
        parcel.writeParcelable(this.f231741c, i12);
        parcel.writeInt(this.f231742d ? 1 : 0);
        parcel.writeString(this.f231743e);
    }

    public /* synthetic */ PromoNextButtonItem(String str, DeepLink deepLink, boolean z12, String str2, int i12, C42822w c42822w) {
        this(deepLink, str, (i12 & 8) != 0 ? deepLink.toString() : str2, (i12 & 4) != 0 ? false : z12);
    }
}
