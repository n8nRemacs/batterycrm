package com.avito.android.remote.model.credit_broker.installments_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.credit_broker.CreditProgress;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.remote.model.credit_broker.OfferDetailsItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlock.kt */
@d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010 J~\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\u001eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010 R$\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bA\u0010 ¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockStateDto;", "Landroid/os/Parcelable;", "", "planId", "title", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsIconDto;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;", "priceInfo", "Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "progress", "", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsButtonDto;", "buttons", "Lcom/avito/android/remote/model/credit_broker/OfferDetailsItem;", "creditOfferDetailsItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsIconDto;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;Lcom/avito/android/remote/model/credit_broker/CreditProgress;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsIconDto;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;", "component6", "()Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "component7", "()Ljava/util/List;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsIconDto;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;Lcom/avito/android/remote/model/credit_broker/CreditProgress;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockStateDto;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPlanId", "getTitle", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsIconDto;", "getIcon", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;", "getPriceInfo", "Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "getProgress", "Ljava/util/List;", "getButtons", "getCreditOfferDetailsItems", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InstallmentsBlockStateDto implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsBlockStateDto> CREATOR = new Creator();

    @c("buttons")
    @l
    private final List<InstallmentsButtonDto> buttons;

    @c("offerDetailsItems")
    @l
    private final List<OfferDetailsItem> creditOfferDetailsItems;

    @c("icon")
    @l
    private final InstallmentsIconDto icon;

    @c("planId")
    @l
    private final String planId;

    @c("priceInfo")
    @l
    private final LoanTerms.PriceInfo priceInfo;

    @c("progress")
    @l
    private final CreditProgress progress;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsBlockStateDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsBlockStateDto createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            InstallmentsIconDto installmentsIconDtoCreateFromParcel = parcel.readInt() == 0 ? null : InstallmentsIconDto.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(InstallmentsBlockStateDto.class.getClassLoader());
            LoanTerms.PriceInfo priceInfoCreateFromParcel = parcel.readInt() == 0 ? null : LoanTerms.PriceInfo.CREATOR.createFromParcel(parcel);
            CreditProgress creditProgressCreateFromParcel = parcel.readInt() == 0 ? null : CreditProgress.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(InstallmentsButtonDto.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList3.add(parcel.readInt() == 0 ? null : OfferDetailsItem.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new InstallmentsBlockStateDto(string, string2, installmentsIconDtoCreateFromParcel, attributedText, priceInfoCreateFromParcel, creditProgressCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsBlockStateDto[] newArray(int i12) {
            return new InstallmentsBlockStateDto[i12];
        }
    }

    public InstallmentsBlockStateDto(@l String str, @l String str2, @l InstallmentsIconDto installmentsIconDto, @l AttributedText attributedText, @l LoanTerms.PriceInfo priceInfo, @l CreditProgress creditProgress, @l List<InstallmentsButtonDto> list, @l List<OfferDetailsItem> list2) {
        this.planId = str;
        this.title = str2;
        this.icon = installmentsIconDto;
        this.subtitle = attributedText;
        this.priceInfo = priceInfo;
        this.progress = creditProgress;
        this.buttons = list;
        this.creditOfferDetailsItems = list2;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final InstallmentsIconDto getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final LoanTerms.PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final CreditProgress getProgress() {
        return this.progress;
    }

    @l
    public final List<InstallmentsButtonDto> component7() {
        return this.buttons;
    }

    @l
    public final List<OfferDetailsItem> component8() {
        return this.creditOfferDetailsItems;
    }

    @k
    public final InstallmentsBlockStateDto copy(@l String planId, @l String title, @l InstallmentsIconDto icon, @l AttributedText subtitle, @l LoanTerms.PriceInfo priceInfo, @l CreditProgress progress, @l List<InstallmentsButtonDto> buttons, @l List<OfferDetailsItem> creditOfferDetailsItems) {
        return new InstallmentsBlockStateDto(planId, title, icon, subtitle, priceInfo, progress, buttons, creditOfferDetailsItems);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsBlockStateDto)) {
            return false;
        }
        InstallmentsBlockStateDto installmentsBlockStateDto = (InstallmentsBlockStateDto) other;
        return L.f(this.planId, installmentsBlockStateDto.planId) && L.f(this.title, installmentsBlockStateDto.title) && L.f(this.icon, installmentsBlockStateDto.icon) && L.f(this.subtitle, installmentsBlockStateDto.subtitle) && L.f(this.priceInfo, installmentsBlockStateDto.priceInfo) && L.f(this.progress, installmentsBlockStateDto.progress) && L.f(this.buttons, installmentsBlockStateDto.buttons) && L.f(this.creditOfferDetailsItems, installmentsBlockStateDto.creditOfferDetailsItems);
    }

    @l
    public final List<InstallmentsButtonDto> getButtons() {
        return this.buttons;
    }

    @l
    public final List<OfferDetailsItem> getCreditOfferDetailsItems() {
        return this.creditOfferDetailsItems;
    }

    @l
    public final InstallmentsIconDto getIcon() {
        return this.icon;
    }

    @l
    public final String getPlanId() {
        return this.planId;
    }

    @l
    public final LoanTerms.PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    @l
    public final CreditProgress getProgress() {
        return this.progress;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.planId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        InstallmentsIconDto installmentsIconDto = this.icon;
        int iHashCode3 = (iHashCode2 + (installmentsIconDto == null ? 0 : installmentsIconDto.hashCode())) * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        LoanTerms.PriceInfo priceInfo = this.priceInfo;
        int iHashCode5 = (iHashCode4 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31;
        CreditProgress creditProgress = this.progress;
        int iHashCode6 = (iHashCode5 + (creditProgress == null ? 0 : creditProgress.hashCode())) * 31;
        List<InstallmentsButtonDto> list = this.buttons;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<OfferDetailsItem> list2 = this.creditOfferDetailsItems;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsBlockStateDto(planId=");
        sb2.append(this.planId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", priceInfo=");
        sb2.append(this.priceInfo);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", creditOfferDetailsItems=");
        return H.p(sb2, this.creditOfferDetailsItems, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.planId);
        parcel.writeString(this.title);
        InstallmentsIconDto installmentsIconDto = this.icon;
        if (installmentsIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsIconDto.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.subtitle, flags);
        LoanTerms.PriceInfo priceInfo = this.priceInfo;
        if (priceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceInfo.writeToParcel(parcel, flags);
        }
        CreditProgress creditProgress = this.progress;
        if (creditProgress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creditProgress.writeToParcel(parcel, flags);
        }
        List<InstallmentsButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((InstallmentsButtonDto) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<OfferDetailsItem> list2 = this.creditOfferDetailsItems;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            OfferDetailsItem offerDetailsItem = (OfferDetailsItem) itA2.next();
            if (offerDetailsItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                offerDetailsItem.writeToParcel(parcel, flags);
            }
        }
    }
}
