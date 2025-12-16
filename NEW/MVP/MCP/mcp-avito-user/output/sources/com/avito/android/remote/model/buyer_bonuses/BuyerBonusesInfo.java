package com.avito.android.remote.model.buyer_bonuses;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: BuyerBonusesInfo.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonusesInfo;", "Landroid/os/Parcelable;", "", DeliverySubsidiesSlotKt.AMOUNT, "Lcom/avito/android/remote/model/buyer_bonuses/Icon;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/buyer_bonuses/Icon;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAmount", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/buyer_bonuses/Icon;", "getIcon", "()Lcom/avito/android/remote/model/buyer_bonuses/Icon;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuyerBonusesInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<BuyerBonusesInfo> CREATOR = new Creator();

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    @k
    private final String amount;

    @c("description")
    @k
    private final AttributedText description;

    @c("icon")
    @k
    private final Icon icon;

    @c("text")
    @k
    private final AttributedText text;

    /* compiled from: BuyerBonusesInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyerBonusesInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerBonusesInfo createFromParcel(@k Parcel parcel) {
            return new BuyerBonusesInfo(parcel.readString(), Icon.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(BuyerBonusesInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(BuyerBonusesInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerBonusesInfo[] newArray(int i12) {
            return new BuyerBonusesInfo[i12];
        }
    }

    public BuyerBonusesInfo(@k String str, @k Icon icon, @k AttributedText attributedText, @k AttributedText attributedText2) {
        this.amount = str;
        this.icon = icon;
        this.description = attributedText;
        this.text = attributedText2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getAmount() {
        return this.amount;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final Icon getIcon() {
        return this.icon;
    }

    @k
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.amount);
        this.icon.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.description, flags);
        parcel.writeParcelable(this.text, flags);
    }
}
