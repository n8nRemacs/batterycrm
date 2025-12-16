package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: OfferDetailsItem.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/OfferDetailsItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/remote/model/credit_broker/Icon;", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/credit_broker/Icon;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/credit_broker/Icon;", "getIcon", "()Lcom/avito/android/remote/model/credit_broker/Icon;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OfferDetailsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<OfferDetailsItem> CREATOR = new Creator();

    @c("attributedText")
    @l
    private final AttributedText attributedText;

    @c("icon")
    @l
    private final Icon icon;

    /* compiled from: OfferDetailsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferDetailsItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OfferDetailsItem createFromParcel(@k Parcel parcel) {
            return new OfferDetailsItem((AttributedText) parcel.readParcelable(OfferDetailsItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OfferDetailsItem[] newArray(int i12) {
            return new OfferDetailsItem[i12];
        }
    }

    public OfferDetailsItem(@l AttributedText attributedText, @l Icon icon) {
        this.attributedText = attributedText;
        this.icon = icon;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @l
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.attributedText, flags);
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, flags);
        }
    }
}
