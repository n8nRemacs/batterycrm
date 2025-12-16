package com.avito.android.advert_amenities;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: SellerDetails.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B>\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/advert_amenities/SellerDetails;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/advert_amenities/Amenities;", "amenities", "Lcom/avito/android/advert_amenities/InteriorPhotosBlock;", "interiorPhotosBlock", "", "", "", "LK51/e;", "analytics", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/advert_amenities/Amenities;Lcom/avito/android/advert_amenities/InteriorPhotosBlock;Ljava/util/Map;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/advert_amenities/Amenities;", "c", "()Lcom/avito/android/advert_amenities/Amenities;", "Lcom/avito/android/advert_amenities/InteriorPhotosBlock;", "e", "()Lcom/avito/android/advert_amenities/InteriorPhotosBlock;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SellerDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerDetails> CREATOR = new a();

    @c("amenities")
    @l
    private final Amenities amenities;

    @c("analytics")
    @k
    private final Map<String, Object> analytics;

    @c("interiorPhotosBlock")
    @l
    private final InteriorPhotosBlock interiorPhotosBlock;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: SellerDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerDetails> {
        @Override // android.os.Parcelable.Creator
        public final SellerDetails createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SellerDetails.class.getClassLoader());
            Amenities amenitiesCreateFromParcel = parcel.readInt() == 0 ? null : Amenities.CREATOR.createFromParcel(parcel);
            InteriorPhotosBlock interiorPhotosBlockCreateFromParcel = parcel.readInt() != 0 ? InteriorPhotosBlock.CREATOR.createFromParcel(parcel) : null;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = h.c(SellerDetails.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new SellerDetails(attributedText, amenitiesCreateFromParcel, interiorPhotosBlockCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final SellerDetails[] newArray(int i12) {
            return new SellerDetails[i12];
        }
    }

    public SellerDetails(@l AttributedText attributedText, @l Amenities amenities, @l InteriorPhotosBlock interiorPhotosBlock, @k Map<String, ? extends Object> map) {
        this.title = attributedText;
        this.amenities = amenities;
        this.interiorPhotosBlock = interiorPhotosBlock;
        this.analytics = map;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Amenities getAmenities() {
        return this.amenities;
    }

    @k
    public final Map<String, Object> d() {
        return this.analytics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final InteriorPhotosBlock getInteriorPhotosBlock() {
        return this.interiorPhotosBlock;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerDetails)) {
            return false;
        }
        SellerDetails sellerDetails = (SellerDetails) obj;
        return L.f(this.title, sellerDetails.title) && L.f(this.amenities, sellerDetails.amenities) && L.f(this.interiorPhotosBlock, sellerDetails.interiorPhotosBlock) && L.f(this.analytics, sellerDetails.analytics);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        Amenities amenities = this.amenities;
        int iHashCode2 = (iHashCode + (amenities == null ? 0 : amenities.hashCode())) * 31;
        InteriorPhotosBlock interiorPhotosBlock = this.interiorPhotosBlock;
        return this.analytics.hashCode() + ((iHashCode2 + (interiorPhotosBlock != null ? interiorPhotosBlock.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerDetails(title=");
        sb2.append(this.title);
        sb2.append(", amenities=");
        sb2.append(this.amenities);
        sb2.append(", interiorPhotosBlock=");
        sb2.append(this.interiorPhotosBlock);
        sb2.append(", analytics=");
        return r.w(sb2, this.analytics, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        Amenities amenities = this.amenities;
        if (amenities == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amenities.writeToParcel(parcel, i12);
        }
        InteriorPhotosBlock interiorPhotosBlock = this.interiorPhotosBlock;
        if (interiorPhotosBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            interiorPhotosBlock.writeToParcel(parcel, i12);
        }
        Iterator itI = C0.i(parcel, this.analytics);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
