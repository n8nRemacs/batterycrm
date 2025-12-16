package com.avito.android.advert_core.offers.offer_bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.remote.model.OffersPhoneParameters;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/OfferOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OfferOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<OfferOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final OffersPhoneParameters f83860b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<OfferItem> f83861c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83862d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleAdvertAction f83863e;

    /* compiled from: OfferOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OfferOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final OfferOpenParams createFromParcel(Parcel parcel) {
            OffersPhoneParameters offersPhoneParameters = (OffersPhoneParameters) parcel.readParcelable(OfferOpenParams.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(OfferOpenParams.class, parcel, arrayList, iL2, 1);
            }
            return new OfferOpenParams(offersPhoneParameters, arrayList, parcel.readInt(), (SimpleAdvertAction) parcel.readParcelable(OfferOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OfferOpenParams[] newArray(int i12) {
            return new OfferOpenParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfferOpenParams(@Y61.l OffersPhoneParameters offersPhoneParameters, @Y61.k List<? extends OfferItem> list, int i12, @Y61.k SimpleAdvertAction simpleAdvertAction) {
        this.f83860b = offersPhoneParameters;
        this.f83861c = list;
        this.f83862d = i12;
        this.f83863e = simpleAdvertAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferOpenParams)) {
            return false;
        }
        OfferOpenParams offerOpenParams = (OfferOpenParams) obj;
        return L.f(this.f83860b, offerOpenParams.f83860b) && L.f(this.f83861c, offerOpenParams.f83861c) && this.f83862d == offerOpenParams.f83862d && L.f(this.f83863e, offerOpenParams.f83863e);
    }

    public final int hashCode() {
        OffersPhoneParameters offersPhoneParameters = this.f83860b;
        return this.f83863e.hashCode() + r.e(this.f83862d, H.e((offersPhoneParameters == null ? 0 : offersPhoneParameters.hashCode()) * 31, 31, this.f83861c), 31);
    }

    @Y61.k
    public final String toString() {
        return "OfferOpenParams(offersPhoneParameters=" + this.f83860b + ", offers=" + this.f83861c + ", currentPosition=" + this.f83862d + ", callAction=" + this.f83863e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f83860b, i12);
        Iterator itJ = C0.j(this.f83861c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f83862d);
        parcel.writeParcelable(this.f83863e, i12);
    }
}
