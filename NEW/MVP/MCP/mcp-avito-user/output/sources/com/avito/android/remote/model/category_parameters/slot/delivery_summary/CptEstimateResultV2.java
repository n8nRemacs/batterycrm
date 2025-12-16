package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliverySummarySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CptEstimateResultV2;", "Landroid/os/Parcelable;", "", "titleSlotId", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliveryData;", "deliveryData", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DbsData;", "dbsData", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "cptToken", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CncData;", "cncData", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/IncludingFeeData;", "includingFeeData", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliveryData;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DbsData;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CncData;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/IncludingFeeData;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitleSlotId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliveryData;", "getDeliveryData", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliveryData;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DbsData;", "getDbsData", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DbsData;", "Lcom/avito/android/remote/model/text/AttributedText;", "getAgreement", "()Lcom/avito/android/remote/model/text/AttributedText;", "getCptToken", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CncData;", "getCncData", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CncData;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/IncludingFeeData;", "getIncludingFeeData", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/IncludingFeeData;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CptEstimateResultV2 implements Parcelable {

    @k
    public static final Parcelable.Creator<CptEstimateResultV2> CREATOR = new Creator();

    @c("agreement")
    @k
    private final AttributedText agreement;

    @c("cncData")
    @l
    private final CncData cncData;

    @c("cptToken")
    @l
    private final String cptToken;

    @c("dbsData")
    @l
    private final DbsData dbsData;

    @c("deliveryData")
    @l
    private final DeliveryData deliveryData;

    @c("includingFeeWidget")
    @l
    private final IncludingFeeData includingFeeData;

    @c("titleSlotId")
    @k
    private final String titleSlotId;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CptEstimateResultV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CptEstimateResultV2 createFromParcel(@k Parcel parcel) {
            return new CptEstimateResultV2(parcel.readString(), parcel.readInt() == 0 ? null : DeliveryData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DbsData.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(CptEstimateResultV2.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : CncData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IncludingFeeData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CptEstimateResultV2[] newArray(int i12) {
            return new CptEstimateResultV2[i12];
        }
    }

    public CptEstimateResultV2(@k String str, @l DeliveryData deliveryData, @l DbsData dbsData, @k AttributedText attributedText, @l String str2, @l CncData cncData, @l IncludingFeeData includingFeeData) {
        this.titleSlotId = str;
        this.deliveryData = deliveryData;
        this.dbsData = dbsData;
        this.agreement = attributedText;
        this.cptToken = str2;
        this.cncData = cncData;
        this.includingFeeData = includingFeeData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @l
    public final CncData getCncData() {
        return this.cncData;
    }

    @l
    public final String getCptToken() {
        return this.cptToken;
    }

    @l
    public final DbsData getDbsData() {
        return this.dbsData;
    }

    @l
    public final DeliveryData getDeliveryData() {
        return this.deliveryData;
    }

    @l
    public final IncludingFeeData getIncludingFeeData() {
        return this.includingFeeData;
    }

    @k
    public final String getTitleSlotId() {
        return this.titleSlotId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.titleSlotId);
        DeliveryData deliveryData = this.deliveryData;
        if (deliveryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryData.writeToParcel(parcel, flags);
        }
        DbsData dbsData = this.dbsData;
        if (dbsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dbsData.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.agreement, flags);
        parcel.writeString(this.cptToken);
        CncData cncData = this.cncData;
        if (cncData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cncData.writeToParcel(parcel, flags);
        }
        IncludingFeeData includingFeeData = this.includingFeeData;
        if (includingFeeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            includingFeeData.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ CptEstimateResultV2(String str, DeliveryData deliveryData, DbsData dbsData, AttributedText attributedText, String str2, CncData cncData, IncludingFeeData includingFeeData, int i12, C42822w c42822w) {
        this(str, deliveryData, dbsData, attributedText, str2, cncData, (i12 & 64) != 0 ? null : includingFeeData);
    }
}
