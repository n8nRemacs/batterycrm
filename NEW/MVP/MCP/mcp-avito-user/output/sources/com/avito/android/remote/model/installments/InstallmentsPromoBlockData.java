package com.avito.android.remote.model.installments;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InstallmentsPromoBlockData.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/installments/InstallmentsPromoBlockData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/installments/InstallmentsSwitcherData;", "switcher", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/ParametrizedEvent;", "displayEvent", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/installments/InstallmentsSwitcherData;Lcom/avito/android/remote/model/vertical_main/PromoStyle;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/installments/InstallmentsSwitcherData;", "getSwitcher", "()Lcom/avito/android/remote/model/installments/InstallmentsSwitcherData;", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getStyle", "()Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getDisplayEvent", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InstallmentsPromoBlockData implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsPromoBlockData> CREATOR = new Creator();

    @c("displayEvent")
    @l
    private final ParametrizedEvent displayEvent;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final PromoStyle style;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("switcher")
    @l
    private final InstallmentsSwitcherData switcher;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: InstallmentsPromoBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsPromoBlockData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsPromoBlockData createFromParcel(@k Parcel parcel) {
            return new InstallmentsPromoBlockData((AttributedText) parcel.readParcelable(InstallmentsPromoBlockData.class.getClassLoader()), (AttributedText) parcel.readParcelable(InstallmentsPromoBlockData.class.getClassLoader()), parcel.readInt() == 0 ? null : InstallmentsSwitcherData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromoStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ParametrizedEvent.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsPromoBlockData[] newArray(int i12) {
            return new InstallmentsPromoBlockData[i12];
        }
    }

    public InstallmentsPromoBlockData() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ParametrizedEvent getDisplayEvent() {
        return this.displayEvent;
    }

    @l
    public final PromoStyle getStyle() {
        return this.style;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final InstallmentsSwitcherData getSwitcher() {
        return this.switcher;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        InstallmentsSwitcherData installmentsSwitcherData = this.switcher;
        if (installmentsSwitcherData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsSwitcherData.writeToParcel(parcel, flags);
        }
        PromoStyle promoStyle = this.style;
        if (promoStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoStyle.writeToParcel(parcel, flags);
        }
        ParametrizedEvent parametrizedEvent = this.displayEvent;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, flags);
        }
    }

    public InstallmentsPromoBlockData(@l AttributedText attributedText, @l AttributedText attributedText2, @l InstallmentsSwitcherData installmentsSwitcherData, @l PromoStyle promoStyle, @l ParametrizedEvent parametrizedEvent) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.switcher = installmentsSwitcherData;
        this.style = promoStyle;
        this.displayEvent = parametrizedEvent;
    }

    public /* synthetic */ InstallmentsPromoBlockData(AttributedText attributedText, AttributedText attributedText2, InstallmentsSwitcherData installmentsSwitcherData, PromoStyle promoStyle, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? null : attributedText2, (i12 & 4) != 0 ? null : installmentsSwitcherData, (i12 & 8) != 0 ? PromoStyle.VIOLET : promoStyle, (i12 & 16) != 0 ? null : parametrizedEvent);
    }
}
