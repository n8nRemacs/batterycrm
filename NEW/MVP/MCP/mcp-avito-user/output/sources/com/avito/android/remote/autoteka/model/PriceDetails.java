package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/autoteka/model/PriceDetails;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/autoteka/model/PromoCodeWidget;", "promoCodeWidget", "Lcom/avito/android/remote/autoteka/model/PriceWidget;", "priceWidget", "", "Lcom/avito/android/remote/autoteka/model/DiscountWidget;", "discountWidget", "dynamicDiscountWidget", "Lcom/avito/android/remote/autoteka/model/TotalWidget;", "totalWidget", "<init>", "(Lcom/avito/android/remote/autoteka/model/PromoCodeWidget;Lcom/avito/android/remote/autoteka/model/PriceWidget;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/autoteka/model/TotalWidget;)V", "Lcom/avito/android/remote/autoteka/model/PromoCodeWidget;", "f", "()Lcom/avito/android/remote/autoteka/model/PromoCodeWidget;", "Lcom/avito/android/remote/autoteka/model/PriceWidget;", "e", "()Lcom/avito/android/remote/autoteka/model/PriceWidget;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Lcom/avito/android/remote/autoteka/model/TotalWidget;", "g", "()Lcom/avito/android/remote/autoteka/model/TotalWidget;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceDetails> CREATOR = new a();

    @c("discounts")
    @k
    private final List<DiscountWidget> discountWidget;

    @c("dynamicDiscounts")
    @k
    private final List<DiscountWidget> dynamicDiscountWidget;

    @c("price")
    @k
    private final PriceWidget priceWidget;

    @c("promocodeWidget")
    @l
    private final PromoCodeWidget promoCodeWidget;

    @c("total")
    @k
    private final TotalWidget totalWidget;

    /* compiled from: AutotekaPurchaseResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceDetails> {
        @Override // android.os.Parcelable.Creator
        public final PriceDetails createFromParcel(Parcel parcel) {
            PromoCodeWidget promoCodeWidgetCreateFromParcel = parcel.readInt() == 0 ? null : PromoCodeWidget.CREATOR.createFromParcel(parcel);
            PriceWidget priceWidgetCreateFromParcel = PriceWidget.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(DiscountWidget.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(DiscountWidget.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new PriceDetails(promoCodeWidgetCreateFromParcel, priceWidgetCreateFromParcel, arrayList, arrayList2, TotalWidget.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PriceDetails[] newArray(int i12) {
            return new PriceDetails[i12];
        }
    }

    public PriceDetails(@l PromoCodeWidget promoCodeWidget, @k PriceWidget priceWidget, @k List<DiscountWidget> list, @k List<DiscountWidget> list2, @k TotalWidget totalWidget) {
        this.promoCodeWidget = promoCodeWidget;
        this.priceWidget = priceWidget;
        this.discountWidget = list;
        this.dynamicDiscountWidget = list2;
        this.totalWidget = totalWidget;
    }

    @k
    public final List<DiscountWidget> c() {
        return this.discountWidget;
    }

    @k
    public final List<DiscountWidget> d() {
        return this.dynamicDiscountWidget;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final PriceWidget getPriceWidget() {
        return this.priceWidget;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDetails)) {
            return false;
        }
        PriceDetails priceDetails = (PriceDetails) obj;
        return L.f(this.promoCodeWidget, priceDetails.promoCodeWidget) && L.f(this.priceWidget, priceDetails.priceWidget) && L.f(this.discountWidget, priceDetails.discountWidget) && L.f(this.dynamicDiscountWidget, priceDetails.dynamicDiscountWidget) && L.f(this.totalWidget, priceDetails.totalWidget);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final PromoCodeWidget getPromoCodeWidget() {
        return this.promoCodeWidget;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final TotalWidget getTotalWidget() {
        return this.totalWidget;
    }

    public final int hashCode() {
        PromoCodeWidget promoCodeWidget = this.promoCodeWidget;
        return this.totalWidget.hashCode() + H.e(H.e((this.priceWidget.hashCode() + ((promoCodeWidget == null ? 0 : promoCodeWidget.hashCode()) * 31)) * 31, 31, this.discountWidget), 31, this.dynamicDiscountWidget);
    }

    @k
    public final String toString() {
        return "PriceDetails(promoCodeWidget=" + this.promoCodeWidget + ", priceWidget=" + this.priceWidget + ", discountWidget=" + this.discountWidget + ", dynamicDiscountWidget=" + this.dynamicDiscountWidget + ", totalWidget=" + this.totalWidget + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        PromoCodeWidget promoCodeWidget = this.promoCodeWidget;
        if (promoCodeWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoCodeWidget.writeToParcel(parcel, i12);
        }
        this.priceWidget.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.discountWidget, parcel);
        while (itJ.hasNext()) {
            ((DiscountWidget) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.dynamicDiscountWidget, parcel);
        while (itJ2.hasNext()) {
            ((DiscountWidget) itJ2.next()).writeToParcel(parcel, i12);
        }
        this.totalWidget.writeToParcel(parcel, i12);
    }
}
