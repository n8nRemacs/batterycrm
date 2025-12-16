package com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CptEstimateEditResult.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/CptEstimateEditResultV2;", "Landroid/os/Parcelable;", "", "cptToken", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FeeBlock;", "fee", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FbsFeeBlock;", "fbsFee", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "", NotificationsSettings.Section.SECTION_DELIVERY, "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/SellFasterBanner;", "sellFasterBanner", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FeeBlock;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FbsFeeBlock;Lcom/avito/android/remote/model/text/AttributedText;ZLcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/SellFasterBanner;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCptToken", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FeeBlock;", "getFee", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FeeBlock;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FbsFeeBlock;", "getFbsFee", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/FbsFeeBlock;", "Lcom/avito/android/remote/model/text/AttributedText;", "getAgreement", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "getDelivery", "()Z", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/SellFasterBanner;", "getSellFasterBanner", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/SellFasterBanner;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CptEstimateEditResultV2 implements Parcelable {

    @k
    public static final Parcelable.Creator<CptEstimateEditResultV2> CREATOR = new Creator();

    @c("agreement")
    @l
    private final AttributedText agreement;

    @c("cptToken")
    @l
    private final String cptToken;

    @c(NotificationsSettings.Section.SECTION_DELIVERY)
    private final boolean delivery;

    @c("fbsFee")
    @l
    private final FbsFeeBlock fbsFee;

    @c("fee")
    @l
    private final FeeBlock fee;

    @c("sellFasterBanner")
    @l
    private final SellFasterBanner sellFasterBanner;

    /* compiled from: CptEstimateEditResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CptEstimateEditResultV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CptEstimateEditResultV2 createFromParcel(@k Parcel parcel) {
            return new CptEstimateEditResultV2(parcel.readString(), parcel.readInt() == 0 ? null : FeeBlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FbsFeeBlock.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(CptEstimateEditResultV2.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? SellFasterBanner.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CptEstimateEditResultV2[] newArray(int i12) {
            return new CptEstimateEditResultV2[i12];
        }
    }

    public CptEstimateEditResultV2(@l String str, @l FeeBlock feeBlock, @l FbsFeeBlock fbsFeeBlock, @l AttributedText attributedText, boolean z12, @l SellFasterBanner sellFasterBanner) {
        this.cptToken = str;
        this.fee = feeBlock;
        this.fbsFee = fbsFeeBlock;
        this.agreement = attributedText;
        this.delivery = z12;
        this.sellFasterBanner = sellFasterBanner;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @l
    public final String getCptToken() {
        return this.cptToken;
    }

    public final boolean getDelivery() {
        return this.delivery;
    }

    @l
    public final FbsFeeBlock getFbsFee() {
        return this.fbsFee;
    }

    @l
    public final FeeBlock getFee() {
        return this.fee;
    }

    @l
    public final SellFasterBanner getSellFasterBanner() {
        return this.sellFasterBanner;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.cptToken);
        FeeBlock feeBlock = this.fee;
        if (feeBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeBlock.writeToParcel(parcel, flags);
        }
        FbsFeeBlock fbsFeeBlock = this.fbsFee;
        if (fbsFeeBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fbsFeeBlock.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.agreement, flags);
        parcel.writeInt(this.delivery ? 1 : 0);
        SellFasterBanner sellFasterBanner = this.sellFasterBanner;
        if (sellFasterBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellFasterBanner.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ CptEstimateEditResultV2(String str, FeeBlock feeBlock, FbsFeeBlock fbsFeeBlock, AttributedText attributedText, boolean z12, SellFasterBanner sellFasterBanner, int i12, C42822w c42822w) {
        this(str, feeBlock, (i12 & 4) != 0 ? null : fbsFeeBlock, attributedText, z12, sellFasterBanner);
    }
}
