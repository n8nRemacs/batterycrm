package com.avito.android.advert_core.offers.offer_bottomsheet.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OfferBottomSheetState.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/entity/OfferBottomSheetState;", "Landroid/os/Parcelable;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OfferBottomSheetState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<OfferItem> f83904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83905c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final OfferButton f83906d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f83902e = new a(null);

    @k
    public static final Parcelable.Creator<OfferBottomSheetState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final OfferBottomSheetState f83903f = new OfferBottomSheetState(C42784z0.f406748b, 0, null);

    /* compiled from: OfferBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/entity/OfferBottomSheetState$a;", "", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OfferBottomSheetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<OfferBottomSheetState> {
        @Override // android.os.Parcelable.Creator
        public final OfferBottomSheetState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(OfferBottomSheetState.class, parcel, arrayList, iL2, 1);
            }
            return new OfferBottomSheetState(arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : OfferButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OfferBottomSheetState[] newArray(int i12) {
            return new OfferBottomSheetState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfferBottomSheetState(@k List<? extends OfferItem> list, int i12, @l OfferButton offerButton) {
        this.f83904b = list;
        this.f83905c = i12;
        this.f83906d = offerButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferBottomSheetState)) {
            return false;
        }
        OfferBottomSheetState offerBottomSheetState = (OfferBottomSheetState) obj;
        return L.f(this.f83904b, offerBottomSheetState.f83904b) && this.f83905c == offerBottomSheetState.f83905c && L.f(this.f83906d, offerBottomSheetState.f83906d);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f83905c, this.f83904b.hashCode() * 31, 31);
        OfferButton offerButton = this.f83906d;
        return iE2 + (offerButton == null ? 0 : offerButton.hashCode());
    }

    @k
    public final String toString() {
        return "OfferBottomSheetState(offers=" + this.f83904b + ", startPosition=" + this.f83905c + ", button=" + this.f83906d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f83904b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f83905c);
        OfferButton offerButton = this.f83906d;
        if (offerButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerButton.writeToParcel(parcel, i12);
        }
    }
}
