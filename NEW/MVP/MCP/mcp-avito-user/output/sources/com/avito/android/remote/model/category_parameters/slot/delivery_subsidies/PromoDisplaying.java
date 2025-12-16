package com.avito.android.remote.model.category_parameters.slot.delivery_subsidies;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySubsidySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/PromoDisplaying;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "promoValue", "", "originalValue", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/PromoDisplaying;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getPromoValue", "Ljava/lang/String;", "getOriginalValue", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoDisplaying implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoDisplaying> CREATOR = new Creator();

    @c("originalValue")
    @l
    private final String originalValue;

    @c("promoValue")
    @l
    private final AttributedText promoValue;

    /* compiled from: DeliverySubsidySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoDisplaying> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoDisplaying createFromParcel(@k Parcel parcel) {
            return new PromoDisplaying((AttributedText) parcel.readParcelable(PromoDisplaying.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoDisplaying[] newArray(int i12) {
            return new PromoDisplaying[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PromoDisplaying() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PromoDisplaying copy$default(PromoDisplaying promoDisplaying, AttributedText attributedText, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = promoDisplaying.promoValue;
        }
        if ((i12 & 2) != 0) {
            str = promoDisplaying.originalValue;
        }
        return promoDisplaying.copy(attributedText, str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getPromoValue() {
        return this.promoValue;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getOriginalValue() {
        return this.originalValue;
    }

    @k
    public final PromoDisplaying copy(@l AttributedText promoValue, @l String originalValue) {
        return new PromoDisplaying(promoValue, originalValue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoDisplaying)) {
            return false;
        }
        PromoDisplaying promoDisplaying = (PromoDisplaying) other;
        return L.f(this.promoValue, promoDisplaying.promoValue) && L.f(this.originalValue, promoDisplaying.originalValue);
    }

    @l
    public final String getOriginalValue() {
        return this.originalValue;
    }

    @l
    public final AttributedText getPromoValue() {
        return this.promoValue;
    }

    public int hashCode() {
        AttributedText attributedText = this.promoValue;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        String str = this.originalValue;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PromoDisplaying(promoValue=");
        sb2.append(this.promoValue);
        sb2.append(", originalValue=");
        return C22026a.c(sb2, this.originalValue, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.promoValue, flags);
        parcel.writeString(this.originalValue);
    }

    public PromoDisplaying(@l AttributedText attributedText, @l String str) {
        this.promoValue = attributedText;
        this.originalValue = str;
    }

    public /* synthetic */ PromoDisplaying(AttributedText attributedText, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? null : str);
    }
}
