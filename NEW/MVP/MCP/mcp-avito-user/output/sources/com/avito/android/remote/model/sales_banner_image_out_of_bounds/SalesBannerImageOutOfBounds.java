package com.avito.android.remote.model.sales_banner_image_out_of_bounds;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesBannerImageOutOfBounds.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020 HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u0019R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010\u001b¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/SalesBannerImageOutOfBounds;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/ParametrizedEvent;", "showEvent", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Button;", "button", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "", "", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration;", "widthVariants", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Button;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Background;Ljava/util/Map;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "component4", "()Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Button;", "component5", "()Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Background;", "component6", "()Ljava/util/Map;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Button;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Background;Ljava/util/Map;)Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/SalesBannerImageOutOfBounds;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getShowEvent", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Button;", "getButton", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Background;", "getBackground", "Ljava/util/Map;", "getWidthVariants", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SalesBannerImageOutOfBounds implements Parcelable {

    @k
    public static final Parcelable.Creator<SalesBannerImageOutOfBounds> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @k
    private final Background background;

    @c("button")
    @l
    private final Button button;

    @c("showEvent")
    @l
    private final ParametrizedEvent showEvent;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    @c("widthVariants")
    @k
    private final Map<String, Configuration> widthVariants;

    /* compiled from: SalesBannerImageOutOfBounds.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SalesBannerImageOutOfBounds> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesBannerImageOutOfBounds createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SalesBannerImageOutOfBounds.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(SalesBannerImageOutOfBounds.class.getClassLoader());
            ParametrizedEvent parametrizedEvent = (ParametrizedEvent) parcel.readParcelable(SalesBannerImageOutOfBounds.class.getClassLoader());
            Button buttonCreateFromParcel = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            Background backgroundCreateFromParcel = Background.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), Configuration.CREATOR.createFromParcel(parcel));
            }
            return new SalesBannerImageOutOfBounds(attributedText, attributedText2, parametrizedEvent, buttonCreateFromParcel, backgroundCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesBannerImageOutOfBounds[] newArray(int i12) {
            return new SalesBannerImageOutOfBounds[i12];
        }
    }

    public SalesBannerImageOutOfBounds(@k AttributedText attributedText, @l AttributedText attributedText2, @l ParametrizedEvent parametrizedEvent, @l Button button, @k Background background, @k Map<String, Configuration> map) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.showEvent = parametrizedEvent;
        this.button = button;
        this.background = background;
        this.widthVariants = map;
    }

    public static /* synthetic */ SalesBannerImageOutOfBounds copy$default(SalesBannerImageOutOfBounds salesBannerImageOutOfBounds, AttributedText attributedText, AttributedText attributedText2, ParametrizedEvent parametrizedEvent, Button button, Background background, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = salesBannerImageOutOfBounds.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = salesBannerImageOutOfBounds.subtitle;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 4) != 0) {
            parametrizedEvent = salesBannerImageOutOfBounds.showEvent;
        }
        ParametrizedEvent parametrizedEvent2 = parametrizedEvent;
        if ((i12 & 8) != 0) {
            button = salesBannerImageOutOfBounds.button;
        }
        Button button2 = button;
        if ((i12 & 16) != 0) {
            background = salesBannerImageOutOfBounds.background;
        }
        Background background2 = background;
        if ((i12 & 32) != 0) {
            map = salesBannerImageOutOfBounds.widthVariants;
        }
        return salesBannerImageOutOfBounds.copy(attributedText, attributedText3, parametrizedEvent2, button2, background2, map);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @k
    public final Map<String, Configuration> component6() {
        return this.widthVariants;
    }

    @k
    public final SalesBannerImageOutOfBounds copy(@k AttributedText title, @l AttributedText subtitle, @l ParametrizedEvent showEvent, @l Button button, @k Background background, @k Map<String, Configuration> widthVariants) {
        return new SalesBannerImageOutOfBounds(title, subtitle, showEvent, button, background, widthVariants);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesBannerImageOutOfBounds)) {
            return false;
        }
        SalesBannerImageOutOfBounds salesBannerImageOutOfBounds = (SalesBannerImageOutOfBounds) other;
        return L.f(this.title, salesBannerImageOutOfBounds.title) && L.f(this.subtitle, salesBannerImageOutOfBounds.subtitle) && L.f(this.showEvent, salesBannerImageOutOfBounds.showEvent) && L.f(this.button, salesBannerImageOutOfBounds.button) && L.f(this.background, salesBannerImageOutOfBounds.background) && L.f(this.widthVariants, salesBannerImageOutOfBounds.widthVariants);
    }

    @k
    public final Background getBackground() {
        return this.background;
    }

    @l
    public final Button getButton() {
        return this.button;
    }

    @l
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final Map<String, Configuration> getWidthVariants() {
        return this.widthVariants;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.showEvent;
        int iHashCode3 = (iHashCode2 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        Button button = this.button;
        return this.widthVariants.hashCode() + ((this.background.hashCode() + ((iHashCode3 + (button != null ? button.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SalesBannerImageOutOfBounds(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", showEvent=");
        sb2.append(this.showEvent);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", widthVariants=");
        return r.w(sb2, this.widthVariants, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.showEvent, flags);
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
        this.background.writeToParcel(parcel, flags);
        Iterator itI = C0.i(parcel, this.widthVariants);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            ((Configuration) entry.getValue()).writeToParcel(parcel, flags);
        }
    }
}
