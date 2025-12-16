package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/DealIncome;", "Landroid/os/Parcelable;", "Lcom/avito/android/comfortable_deal/api/model/MultiThemeImage;", "image", "", "backgroundGradient", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "", "objectPriceByContract", "agentCommission", "productCommission", "productCommissionRate", "<init>", "(Lcom/avito/android/comfortable_deal/api/model/MultiThemeImage;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;IIII)V", "Lcom/avito/android/comfortable_deal/api/model/MultiThemeImage;", "e", "()Lcom/avito/android/comfortable_deal/api/model/MultiThemeImage;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "i", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "I", "f", "()I", "c", "g", "h", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DealIncome implements Parcelable {

    @k
    public static final Parcelable.Creator<DealIncome> CREATOR = new a();

    @c("agentCommission")
    private final int agentCommission;

    @c("backgroundGradient")
    @k
    private final String backgroundGradient;

    @c("description")
    @k
    private final AttributedText description;

    @c("image")
    @k
    private final MultiThemeImage image;

    @c("objectPriceByContract")
    private final int objectPriceByContract;

    @c("productCommission")
    private final int productCommission;

    @c("productCommissionRate")
    private final int productCommissionRate;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealIncome> {
        @Override // android.os.Parcelable.Creator
        public final DealIncome createFromParcel(Parcel parcel) {
            return new DealIncome(MultiThemeImage.CREATOR.createFromParcel(parcel), parcel.readString(), (AttributedText) parcel.readParcelable(DealIncome.class.getClassLoader()), (AttributedText) parcel.readParcelable(DealIncome.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DealIncome[] newArray(int i12) {
            return new DealIncome[i12];
        }
    }

    public DealIncome(@k MultiThemeImage multiThemeImage, @k String str, @k AttributedText attributedText, @k AttributedText attributedText2, int i12, int i13, int i14, int i15) {
        this.image = multiThemeImage;
        this.backgroundGradient = str;
        this.title = attributedText;
        this.description = attributedText2;
        this.objectPriceByContract = i12;
        this.agentCommission = i13;
        this.productCommission = i14;
        this.productCommissionRate = i15;
    }

    /* renamed from: c, reason: from getter */
    public final int getAgentCommission() {
        return this.agentCommission;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final MultiThemeImage getImage() {
        return this.image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealIncome)) {
            return false;
        }
        DealIncome dealIncome = (DealIncome) obj;
        return L.f(this.image, dealIncome.image) && L.f(this.backgroundGradient, dealIncome.backgroundGradient) && L.f(this.title, dealIncome.title) && L.f(this.description, dealIncome.description) && this.objectPriceByContract == dealIncome.objectPriceByContract && this.agentCommission == dealIncome.agentCommission && this.productCommission == dealIncome.productCommission && this.productCommissionRate == dealIncome.productCommissionRate;
    }

    /* renamed from: f, reason: from getter */
    public final int getObjectPriceByContract() {
        return this.objectPriceByContract;
    }

    /* renamed from: g, reason: from getter */
    public final int getProductCommission() {
        return this.productCommission;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    /* renamed from: h, reason: from getter */
    public final int getProductCommissionRate() {
        return this.productCommissionRate;
    }

    public final int hashCode() {
        return Integer.hashCode(this.productCommissionRate) + r.e(this.productCommission, r.e(this.agentCommission, r.e(this.objectPriceByContract, com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(H.d(this.image.hashCode() * 31, 31, this.backgroundGradient), 31, this.title), 31, this.description), 31), 31), 31);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealIncome(image=");
        sb2.append(this.image);
        sb2.append(", backgroundGradient=");
        sb2.append(this.backgroundGradient);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", objectPriceByContract=");
        sb2.append(this.objectPriceByContract);
        sb2.append(", agentCommission=");
        sb2.append(this.agentCommission);
        sb2.append(", productCommission=");
        sb2.append(this.productCommission);
        sb2.append(", productCommissionRate=");
        return r.t(sb2, this.productCommissionRate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.image.writeToParcel(parcel, i12);
        parcel.writeString(this.backgroundGradient);
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        parcel.writeInt(this.objectPriceByContract);
        parcel.writeInt(this.agentCommission);
        parcel.writeInt(this.productCommission);
        parcel.writeInt(this.productCommissionRate);
    }
}
