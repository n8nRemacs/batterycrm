package com.avito.android.remote.model.buyer_bonuses;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: BuyerBonuses.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/buyer_bonuses/Icon;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonusesInfo;", "buyerBonusesInfo", "<init>", "(Lcom/avito/android/remote/model/buyer_bonuses/Icon;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonusesInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/buyer_bonuses/Icon;", "getIcon", "()Lcom/avito/android/remote/model/buyer_bonuses/Icon;", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonusesInfo;", "getBuyerBonusesInfo", "()Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonusesInfo;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuyerBonuses implements Parcelable {

    @k
    public static final Parcelable.Creator<BuyerBonuses> CREATOR = new Creator();

    @c("buyerBonusesInfo")
    @l
    private final BuyerBonusesInfo buyerBonusesInfo;

    @c("icon")
    @k
    private final Icon icon;

    @c("text")
    @k
    private final AttributedText text;

    /* compiled from: BuyerBonuses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyerBonuses> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerBonuses createFromParcel(@k Parcel parcel) {
            return new BuyerBonuses(Icon.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(BuyerBonuses.class.getClassLoader()), parcel.readInt() == 0 ? null : BuyerBonusesInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerBonuses[] newArray(int i12) {
            return new BuyerBonuses[i12];
        }
    }

    public BuyerBonuses(@k Icon icon, @k AttributedText attributedText, @l BuyerBonusesInfo buyerBonusesInfo) {
        this.icon = icon;
        this.text = attributedText;
        this.buyerBonusesInfo = buyerBonusesInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final BuyerBonusesInfo getBuyerBonusesInfo() {
        return this.buyerBonusesInfo;
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
        this.icon.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.text, flags);
        BuyerBonusesInfo buyerBonusesInfo = this.buyerBonusesInfo;
        if (buyerBonusesInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyerBonusesInfo.writeToParcel(parcel, flags);
        }
    }
}
