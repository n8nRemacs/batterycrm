package com.avito.android.auction.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionOfferResponse.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/auction/remote/model/AuctionOfferV2Response;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "", "Lcom/avito/android/beduin_models/BeduinModel;", "components", "Lcom/avito/android/auction/remote/model/AuctionFooter;", "footer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/auction/remote/model/AuctionFooter;)V", "Ljava/lang/String;", "getLocationId", "()Ljava/lang/String;", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Lcom/avito/android/auction/remote/model/AuctionFooter;", "c", "()Lcom/avito/android/auction/remote/model/AuctionFooter;", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionOfferV2Response implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionOfferV2Response> CREATOR = new a();

    @c("components")
    @k
    private final List<BeduinModel> components;

    @c("footer")
    @l
    private final AuctionFooter footer;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    /* compiled from: AuctionOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionOfferV2Response> {
        @Override // android.os.Parcelable.Creator
        public final AuctionOfferV2Response createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AuctionOfferV2Response.class, parcel, arrayList, iL2, 1);
            }
            return new AuctionOfferV2Response(string, arrayList, parcel.readInt() == 0 ? null : AuctionFooter.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionOfferV2Response[] newArray(int i12) {
            return new AuctionOfferV2Response[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuctionOfferV2Response(@l String str, @k List<? extends BeduinModel> list, @l AuctionFooter auctionFooter) {
        this.locationId = str;
        this.components = list;
        this.footer = auctionFooter;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AuctionFooter getFooter() {
        return this.footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionOfferV2Response)) {
            return false;
        }
        AuctionOfferV2Response auctionOfferV2Response = (AuctionOfferV2Response) obj;
        return L.f(this.locationId, auctionOfferV2Response.locationId) && L.f(this.components, auctionOfferV2Response.components) && L.f(this.footer, auctionOfferV2Response.footer);
    }

    @k
    public final List<BeduinModel> getComponents() {
        return this.components;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    public final int hashCode() {
        String str = this.locationId;
        int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.components);
        AuctionFooter auctionFooter = this.footer;
        return iE2 + (auctionFooter != null ? auctionFooter.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AuctionOfferV2Response(locationId=" + this.locationId + ", components=" + this.components + ", footer=" + this.footer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.locationId);
        Iterator itJ = C0.j(this.components, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        AuctionFooter auctionFooter = this.footer;
        if (auctionFooter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auctionFooter.writeToParcel(parcel, i12);
        }
    }
}
