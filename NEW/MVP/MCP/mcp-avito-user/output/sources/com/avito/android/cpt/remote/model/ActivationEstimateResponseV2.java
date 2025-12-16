package com.avito.android.cpt.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ActivationEstimateResponseV2.kt */
@d
@P
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/cpt/remote/model/ActivationEstimateResponseV2;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/cpt/remote/model/ItemData;", "itemData", "Lcom/avito/android/cpt/remote/model/DeliveryData;", "deliveryData", "Lcom/avito/android/cpt/remote/model/DbsData;", "dbsData", "Lcom/avito/android/cpt/remote/model/CncData;", "cncData", "agreement", "Lcom/avito/android/remote/model/ButtonAction;", "button", "Lcom/avito/android/cpt/remote/model/ActivationAlertBanner;", "alertBanner", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/cpt/remote/model/ItemData;Lcom/avito/android/cpt/remote/model/DeliveryData;Lcom/avito/android/cpt/remote/model/DbsData;Lcom/avito/android/cpt/remote/model/CncData;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/cpt/remote/model/ActivationAlertBanner;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "j", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/cpt/remote/model/ItemData;", "i", "()Lcom/avito/android/cpt/remote/model/ItemData;", "Lcom/avito/android/cpt/remote/model/DeliveryData;", "h", "()Lcom/avito/android/cpt/remote/model/DeliveryData;", "Lcom/avito/android/cpt/remote/model/DbsData;", "g", "()Lcom/avito/android/cpt/remote/model/DbsData;", "Lcom/avito/android/cpt/remote/model/CncData;", "f", "()Lcom/avito/android/cpt/remote/model/CncData;", "c", "Lcom/avito/android/remote/model/ButtonAction;", "e", "()Lcom/avito/android/remote/model/ButtonAction;", "Lcom/avito/android/cpt/remote/model/ActivationAlertBanner;", "d", "()Lcom/avito/android/cpt/remote/model/ActivationAlertBanner;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActivationEstimateResponseV2 implements Parcelable {

    @k
    public static final Parcelable.Creator<ActivationEstimateResponseV2> CREATOR = new a();

    @c("agreement")
    @k
    private final AttributedText agreement;

    @c("alert")
    @l
    private final ActivationAlertBanner alertBanner;

    @c("button")
    @k
    private final ButtonAction button;

    @c("cncData")
    @l
    private final CncData cncData;

    @c("dbsData")
    @l
    private final DbsData dbsData;

    @c("deliveryData")
    @l
    private final DeliveryData deliveryData;

    @c("description")
    @l
    private final AttributedText description;

    @c("itemData")
    @k
    private final ItemData itemData;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: ActivationEstimateResponseV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActivationEstimateResponseV2> {
        @Override // android.os.Parcelable.Creator
        public final ActivationEstimateResponseV2 createFromParcel(Parcel parcel) {
            return new ActivationEstimateResponseV2((AttributedText) parcel.readParcelable(ActivationEstimateResponseV2.class.getClassLoader()), (AttributedText) parcel.readParcelable(ActivationEstimateResponseV2.class.getClassLoader()), ItemData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DeliveryData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DbsData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CncData.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ActivationEstimateResponseV2.class.getClassLoader()), (ButtonAction) parcel.readParcelable(ActivationEstimateResponseV2.class.getClassLoader()), parcel.readInt() != 0 ? ActivationAlertBanner.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivationEstimateResponseV2[] newArray(int i12) {
            return new ActivationEstimateResponseV2[i12];
        }
    }

    public ActivationEstimateResponseV2(@k AttributedText attributedText, @l AttributedText attributedText2, @k ItemData itemData, @l DeliveryData deliveryData, @l DbsData dbsData, @l CncData cncData, @k AttributedText attributedText3, @k ButtonAction buttonAction, @l ActivationAlertBanner activationAlertBanner) {
        this.title = attributedText;
        this.description = attributedText2;
        this.itemData = itemData;
        this.deliveryData = deliveryData;
        this.dbsData = dbsData;
        this.cncData = cncData;
        this.agreement = attributedText3;
        this.button = buttonAction;
        this.alertBanner = activationAlertBanner;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ActivationAlertBanner getAlertBanner() {
        return this.alertBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final CncData getCncData() {
        return this.cncData;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final DbsData getDbsData() {
        return this.dbsData;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final DeliveryData getDeliveryData() {
        return this.deliveryData;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final ItemData getItemData() {
        return this.itemData;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        this.itemData.writeToParcel(parcel, i12);
        DeliveryData deliveryData = this.deliveryData;
        if (deliveryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryData.writeToParcel(parcel, i12);
        }
        DbsData dbsData = this.dbsData;
        if (dbsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dbsData.writeToParcel(parcel, i12);
        }
        CncData cncData = this.cncData;
        if (cncData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cncData.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.agreement, i12);
        parcel.writeParcelable(this.button, i12);
        ActivationAlertBanner activationAlertBanner = this.alertBanner;
        if (activationAlertBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            activationAlertBanner.writeToParcel(parcel, i12);
        }
    }
}
