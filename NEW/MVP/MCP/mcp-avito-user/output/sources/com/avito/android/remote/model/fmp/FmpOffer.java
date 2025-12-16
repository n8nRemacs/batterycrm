package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.FmpButton;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpOffer.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b.\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0014R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b1\u0010\u0011¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/fmp/FmpOffer;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/remote/model/fmp/OfferCondition;", "conditions", "legal", "Lcom/avito/android/remote/model/fmp/util/FmpButton;", "button", "Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "onAppear", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/fmp/util/FmpButton;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/remote/model/fmp/util/FmpButton;", "component5", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/fmp/util/FmpButton;Ljava/util/List;)Lcom/avito/android/remote/model/fmp/FmpOffer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Ljava/util/List;", "getConditions", "getLegal", "Lcom/avito/android/remote/model/fmp/util/FmpButton;", "getButton", "getOnAppear", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpOffer implements Parcelable {

    @k
    public static final Parcelable.Creator<FmpOffer> CREATOR = new Creator();

    @c("button")
    @l
    private final FmpButton button;

    @c("conditions")
    @l
    private final List<OfferCondition> conditions;

    @c("legal")
    @l
    private final AttributedText legal;

    @c("onAppear")
    @l
    private final List<FmpAnalyticsEvent> onAppear;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: FmpOffer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FmpOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpOffer createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FmpOffer.class.getClassLoader());
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(OfferCondition.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(FmpOffer.class.getClassLoader());
            FmpButton fmpButtonCreateFromParcel = parcel.readInt() == 0 ? null : FmpButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new FmpOffer(attributedText, arrayList, attributedText2, fmpButtonCreateFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpOffer[] newArray(int i12) {
            return new FmpOffer[i12];
        }
    }

    public FmpOffer(@l AttributedText attributedText, @l List<OfferCondition> list, @l AttributedText attributedText2, @l FmpButton fmpButton, @l List<FmpAnalyticsEvent> list2) {
        this.title = attributedText;
        this.conditions = list;
        this.legal = attributedText2;
        this.button = fmpButton;
        this.onAppear = list2;
    }

    public static /* synthetic */ FmpOffer copy$default(FmpOffer fmpOffer, AttributedText attributedText, List list, AttributedText attributedText2, FmpButton fmpButton, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = fmpOffer.title;
        }
        if ((i12 & 2) != 0) {
            list = fmpOffer.conditions;
        }
        List list3 = list;
        if ((i12 & 4) != 0) {
            attributedText2 = fmpOffer.legal;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 8) != 0) {
            fmpButton = fmpOffer.button;
        }
        FmpButton fmpButton2 = fmpButton;
        if ((i12 & 16) != 0) {
            list2 = fmpOffer.onAppear;
        }
        return fmpOffer.copy(attributedText, list3, attributedText3, fmpButton2, list2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final List<OfferCondition> component2() {
        return this.conditions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final FmpButton getButton() {
        return this.button;
    }

    @l
    public final List<FmpAnalyticsEvent> component5() {
        return this.onAppear;
    }

    @k
    public final FmpOffer copy(@l AttributedText title, @l List<OfferCondition> conditions, @l AttributedText legal, @l FmpButton button, @l List<FmpAnalyticsEvent> onAppear) {
        return new FmpOffer(title, conditions, legal, button, onAppear);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FmpOffer)) {
            return false;
        }
        FmpOffer fmpOffer = (FmpOffer) other;
        return L.f(this.title, fmpOffer.title) && L.f(this.conditions, fmpOffer.conditions) && L.f(this.legal, fmpOffer.legal) && L.f(this.button, fmpOffer.button) && L.f(this.onAppear, fmpOffer.onAppear);
    }

    @l
    public final FmpButton getButton() {
        return this.button;
    }

    @l
    public final List<OfferCondition> getConditions() {
        return this.conditions;
    }

    @l
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        List<OfferCondition> list = this.conditions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText2 = this.legal;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        FmpButton fmpButton = this.button;
        int iHashCode4 = (iHashCode3 + (fmpButton == null ? 0 : fmpButton.hashCode())) * 31;
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FmpOffer(title=");
        sb2.append(this.title);
        sb2.append(", conditions=");
        sb2.append(this.conditions);
        sb2.append(", legal=");
        sb2.append(this.legal);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", onAppear=");
        return H.p(sb2, this.onAppear, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        List<OfferCondition> list = this.conditions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((OfferCondition) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.legal, flags);
        FmpButton fmpButton = this.button;
        if (fmpButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fmpButton.writeToParcel(parcel, flags);
        }
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((FmpAnalyticsEvent) itA2.next()).writeToParcel(parcel, flags);
        }
    }
}
