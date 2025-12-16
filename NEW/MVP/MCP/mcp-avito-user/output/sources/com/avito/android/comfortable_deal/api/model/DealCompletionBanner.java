package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/DealCompletionBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "backgroundGradient", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/comfortable_deal/api/model/DealIncome;", "dealIncome", "Lcom/avito/android/comfortable_deal/api/model/CalculationInfo;", "calculationInfo", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/comfortable_deal/api/model/DealIncome;Lcom/avito/android/comfortable_deal/api/model/CalculationInfo;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/comfortable_deal/api/model/DealIncome;", "e", "()Lcom/avito/android/comfortable_deal/api/model/DealIncome;", "Lcom/avito/android/comfortable_deal/api/model/CalculationInfo;", "d", "()Lcom/avito/android/comfortable_deal/api/model/CalculationInfo;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DealCompletionBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<DealCompletionBanner> CREATOR = new a();

    @c("backgroundGradient")
    @k
    private final String backgroundGradient;

    @c("calculationInfo")
    @k
    private final CalculationInfo calculationInfo;

    @c("dealIncome")
    @k
    private final DealIncome dealIncome;

    @c("description")
    @k
    private final AttributedText description;

    @c("image")
    @k
    private final Image image;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealCompletionBanner> {
        @Override // android.os.Parcelable.Creator
        public final DealCompletionBanner createFromParcel(Parcel parcel) {
            return new DealCompletionBanner((Image) parcel.readParcelable(DealCompletionBanner.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(DealCompletionBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(DealCompletionBanner.class.getClassLoader()), DealIncome.CREATOR.createFromParcel(parcel), CalculationInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DealCompletionBanner[] newArray(int i12) {
            return new DealCompletionBanner[i12];
        }
    }

    public DealCompletionBanner(@k Image image, @k String str, @k AttributedText attributedText, @k AttributedText attributedText2, @k DealIncome dealIncome, @k CalculationInfo calculationInfo) {
        this.image = image;
        this.backgroundGradient = str;
        this.title = attributedText;
        this.description = attributedText2;
        this.dealIncome = dealIncome;
        this.calculationInfo = calculationInfo;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final CalculationInfo getCalculationInfo() {
        return this.calculationInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final DealIncome getDealIncome() {
        return this.dealIncome;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealCompletionBanner)) {
            return false;
        }
        DealCompletionBanner dealCompletionBanner = (DealCompletionBanner) obj;
        return L.f(this.image, dealCompletionBanner.image) && L.f(this.backgroundGradient, dealCompletionBanner.backgroundGradient) && L.f(this.title, dealCompletionBanner.title) && L.f(this.description, dealCompletionBanner.description) && L.f(this.dealIncome, dealCompletionBanner.dealIncome) && L.f(this.calculationInfo, dealCompletionBanner.calculationInfo);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    public final int hashCode() {
        return this.calculationInfo.hashCode() + ((this.dealIncome.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(H.d(this.image.hashCode() * 31, 31, this.backgroundGradient), 31, this.title), 31, this.description)) * 31);
    }

    @k
    public final String toString() {
        return "DealCompletionBanner(image=" + this.image + ", backgroundGradient=" + this.backgroundGradient + ", title=" + this.title + ", description=" + this.description + ", dealIncome=" + this.dealIncome + ", calculationInfo=" + this.calculationInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.backgroundGradient);
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        this.dealIncome.writeToParcel(parcel, i12);
        this.calculationInfo.writeToParcel(parcel, i12);
    }
}
