package com.avito.android.autoteka.items.preview;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.remote.autoteka.model.AutotekaLink;
import com.avito.android.remote.autoteka.model.AutotekaMiniReport;
import com.avito.android.remote.autoteka.model.AutotekaReportFeatures;
import com.avito.android.remote.autoteka.model.DiscountBlock;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/preview/PreviewItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PreviewItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<PreviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96889b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f96890c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f96891d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f96892e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f96893f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AutotekaPurchaseAction f96894g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AutotekaChoosingPurchaseButtonParams f96895h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AutotekaLink f96896i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DiscountBlock f96897j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final AutotekaReportFeatures f96898k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final AutotekaMiniReport f96899l;

    /* compiled from: PreviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreviewItem> {
        @Override // android.os.Parcelable.Creator
        public final PreviewItem createFromParcel(Parcel parcel) {
            return new PreviewItem(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(PreviewItem.class.getClassLoader()), (Image) parcel.readParcelable(PreviewItem.class.getClassLoader()), (AutotekaPurchaseAction) parcel.readParcelable(PreviewItem.class.getClassLoader()), (AutotekaChoosingPurchaseButtonParams) parcel.readParcelable(PreviewItem.class.getClassLoader()), (AutotekaLink) parcel.readParcelable(PreviewItem.class.getClassLoader()), (DiscountBlock) parcel.readParcelable(PreviewItem.class.getClassLoader()), (AutotekaReportFeatures) parcel.readParcelable(PreviewItem.class.getClassLoader()), (AutotekaMiniReport) parcel.readParcelable(PreviewItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PreviewItem[] newArray(int i12) {
            return new PreviewItem[i12];
        }
    }

    public PreviewItem(@k String str, @k String str2, @k String str3, @l Image image, @l Image image2, @l AutotekaPurchaseAction autotekaPurchaseAction, @l AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams, @l AutotekaLink autotekaLink, @l DiscountBlock discountBlock, @l AutotekaReportFeatures autotekaReportFeatures, @l AutotekaMiniReport autotekaMiniReport) {
        this.f96889b = str;
        this.f96890c = str2;
        this.f96891d = str3;
        this.f96892e = image;
        this.f96893f = image2;
        this.f96894g = autotekaPurchaseAction;
        this.f96895h = autotekaChoosingPurchaseButtonParams;
        this.f96896i = autotekaLink;
        this.f96897j = discountBlock;
        this.f96898k = autotekaReportFeatures;
        this.f96899l = autotekaMiniReport;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewItem)) {
            return false;
        }
        PreviewItem previewItem = (PreviewItem) obj;
        return L.f(this.f96889b, previewItem.f96889b) && L.f(this.f96890c, previewItem.f96890c) && L.f(this.f96891d, previewItem.f96891d) && L.f(this.f96892e, previewItem.f96892e) && L.f(this.f96893f, previewItem.f96893f) && L.f(this.f96894g, previewItem.f96894g) && L.f(this.f96895h, previewItem.f96895h) && L.f(this.f96896i, previewItem.f96896i) && L.f(this.f96897j, previewItem.f96897j) && L.f(this.f96898k, previewItem.f96898k) && L.f(this.f96899l, previewItem.f96899l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84802c() {
        return this.f96889b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f96889b.hashCode() * 31, 31, this.f96890c), 31, this.f96891d);
        Image image = this.f96892e;
        int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f96893f;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        AutotekaPurchaseAction autotekaPurchaseAction = this.f96894g;
        int iHashCode3 = (iHashCode2 + (autotekaPurchaseAction == null ? 0 : autotekaPurchaseAction.hashCode())) * 31;
        AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams = this.f96895h;
        int iHashCode4 = (iHashCode3 + (autotekaChoosingPurchaseButtonParams == null ? 0 : autotekaChoosingPurchaseButtonParams.hashCode())) * 31;
        AutotekaLink autotekaLink = this.f96896i;
        int iHashCode5 = (iHashCode4 + (autotekaLink == null ? 0 : autotekaLink.hashCode())) * 31;
        DiscountBlock discountBlock = this.f96897j;
        int iHashCode6 = (iHashCode5 + (discountBlock == null ? 0 : discountBlock.hashCode())) * 31;
        AutotekaReportFeatures autotekaReportFeatures = this.f96898k;
        int iHashCode7 = (iHashCode6 + (autotekaReportFeatures == null ? 0 : autotekaReportFeatures.hashCode())) * 31;
        AutotekaMiniReport autotekaMiniReport = this.f96899l;
        return iHashCode7 + (autotekaMiniReport != null ? autotekaMiniReport.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PreviewItem(stringId=" + this.f96889b + ", previewTitle=" + this.f96890c + ", equipmentSummary=" + this.f96891d + ", image=" + this.f96892e + ", originalImage=" + this.f96893f + ", purchaseAction=" + this.f96894g + ", choosingPurchaseButtonParams=" + this.f96895h + ", reportExampleLink=" + this.f96896i + ", discountBlock=" + this.f96897j + ", reportFeatures=" + this.f96898k + ", miniReport=" + this.f96899l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96889b);
        parcel.writeString(this.f96890c);
        parcel.writeString(this.f96891d);
        parcel.writeParcelable(this.f96892e, i12);
        parcel.writeParcelable(this.f96893f, i12);
        parcel.writeParcelable(this.f96894g, i12);
        parcel.writeParcelable(this.f96895h, i12);
        parcel.writeParcelable(this.f96896i, i12);
        parcel.writeParcelable(this.f96897j, i12);
        parcel.writeParcelable(this.f96898k, i12);
        parcel.writeParcelable(this.f96899l, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreviewItem(String str, String str2, String str3, Image image, Image image2, AutotekaPurchaseAction autotekaPurchaseAction, AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams, AutotekaLink autotekaLink, DiscountBlock discountBlock, AutotekaReportFeatures autotekaReportFeatures, AutotekaMiniReport autotekaMiniReport, int i12, C42822w c42822w) {
        String str4;
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str4 = "ITEM_PREVIEW";
        } else {
            str4 = str;
        }
        this(str4, str2, str3, image, image2, autotekaPurchaseAction, autotekaChoosingPurchaseButtonParams, autotekaLink, discountBlock, autotekaReportFeatures, autotekaMiniReport);
    }
}
