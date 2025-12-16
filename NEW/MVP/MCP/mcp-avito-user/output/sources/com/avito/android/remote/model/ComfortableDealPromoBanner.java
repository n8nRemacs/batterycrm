package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealPromoBanner.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJZ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020 HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010\u001c¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealPromoBanner;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/remote/model/ComfortableDealImageInformation;", "imageInformation", "Lcom/avito/android/remote/model/Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/remote/model/ComfortableDealButton;", "buttons", "Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "onShowEvent", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ComfortableDealImageInformation;Lcom/avito/android/remote/model/Style;Ljava/util/List;Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/ComfortableDealImageInformation;", "component4", "()Lcom/avito/android/remote/model/Style;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ComfortableDealImageInformation;Lcom/avito/android/remote/model/Style;Ljava/util/List;Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;)Lcom/avito/android/remote/model/ComfortableDealPromoBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/ComfortableDealImageInformation;", "getImageInformation", "Lcom/avito/android/remote/model/Style;", "getStyle", "Ljava/util/List;", "getButtons", "Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "getOnShowEvent", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComfortableDealPromoBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<ComfortableDealPromoBanner> CREATOR = new Creator();

    @c("buttons")
    @k
    private final List<ComfortableDealButton> buttons;

    @c("imageInformation")
    @l
    private final ComfortableDealImageInformation imageInformation;

    @c("onShowEvent")
    @l
    private final ComfortableDealAnalyticsEvent onShowEvent;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style style;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: ComfortableDealPromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComfortableDealPromoBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealPromoBanner createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ComfortableDealPromoBanner.class.getClassLoader());
            ComfortableDealImageInformation comfortableDealImageInformationCreateFromParcel = parcel.readInt() == 0 ? null : ComfortableDealImageInformation.CREATOR.createFromParcel(parcel);
            Style styleCreateFromParcel = parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(ComfortableDealButton.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ComfortableDealPromoBanner(string, attributedText, comfortableDealImageInformationCreateFromParcel, styleCreateFromParcel, arrayList, parcel.readInt() != 0 ? ComfortableDealAnalyticsEvent.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealPromoBanner[] newArray(int i12) {
            return new ComfortableDealPromoBanner[i12];
        }
    }

    public ComfortableDealPromoBanner(@k String str, @l AttributedText attributedText, @l ComfortableDealImageInformation comfortableDealImageInformation, @l Style style, @k List<ComfortableDealButton> list, @l ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent) {
        this.title = str;
        this.subtitle = attributedText;
        this.imageInformation = comfortableDealImageInformation;
        this.style = style;
        this.buttons = list;
        this.onShowEvent = comfortableDealAnalyticsEvent;
    }

    public static /* synthetic */ ComfortableDealPromoBanner copy$default(ComfortableDealPromoBanner comfortableDealPromoBanner, String str, AttributedText attributedText, ComfortableDealImageInformation comfortableDealImageInformation, Style style, List list, ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = comfortableDealPromoBanner.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = comfortableDealPromoBanner.subtitle;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 4) != 0) {
            comfortableDealImageInformation = comfortableDealPromoBanner.imageInformation;
        }
        ComfortableDealImageInformation comfortableDealImageInformation2 = comfortableDealImageInformation;
        if ((i12 & 8) != 0) {
            style = comfortableDealPromoBanner.style;
        }
        Style style2 = style;
        if ((i12 & 16) != 0) {
            list = comfortableDealPromoBanner.buttons;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            comfortableDealAnalyticsEvent = comfortableDealPromoBanner.onShowEvent;
        }
        return comfortableDealPromoBanner.copy(str, attributedText2, comfortableDealImageInformation2, style2, list2, comfortableDealAnalyticsEvent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ComfortableDealImageInformation getImageInformation() {
        return this.imageInformation;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    public final List<ComfortableDealButton> component5() {
        return this.buttons;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final ComfortableDealAnalyticsEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    @k
    public final ComfortableDealPromoBanner copy(@k String title, @l AttributedText subtitle, @l ComfortableDealImageInformation imageInformation, @l Style style, @k List<ComfortableDealButton> buttons, @l ComfortableDealAnalyticsEvent onShowEvent) {
        return new ComfortableDealPromoBanner(title, subtitle, imageInformation, style, buttons, onShowEvent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComfortableDealPromoBanner)) {
            return false;
        }
        ComfortableDealPromoBanner comfortableDealPromoBanner = (ComfortableDealPromoBanner) other;
        return L.f(this.title, comfortableDealPromoBanner.title) && L.f(this.subtitle, comfortableDealPromoBanner.subtitle) && L.f(this.imageInformation, comfortableDealPromoBanner.imageInformation) && L.f(this.style, comfortableDealPromoBanner.style) && L.f(this.buttons, comfortableDealPromoBanner.buttons) && L.f(this.onShowEvent, comfortableDealPromoBanner.onShowEvent);
    }

    @k
    public final List<ComfortableDealButton> getButtons() {
        return this.buttons;
    }

    @l
    public final ComfortableDealImageInformation getImageInformation() {
        return this.imageInformation;
    }

    @l
    public final ComfortableDealAnalyticsEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ComfortableDealImageInformation comfortableDealImageInformation = this.imageInformation;
        int iHashCode3 = (iHashCode2 + (comfortableDealImageInformation == null ? 0 : comfortableDealImageInformation.hashCode())) * 31;
        Style style = this.style;
        int iE2 = H.e((iHashCode3 + (style == null ? 0 : style.hashCode())) * 31, 31, this.buttons);
        ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent = this.onShowEvent;
        return iE2 + (comfortableDealAnalyticsEvent != null ? comfortableDealAnalyticsEvent.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ComfortableDealPromoBanner(title=" + this.title + ", subtitle=" + this.subtitle + ", imageInformation=" + this.imageInformation + ", style=" + this.style + ", buttons=" + this.buttons + ", onShowEvent=" + this.onShowEvent + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, flags);
        ComfortableDealImageInformation comfortableDealImageInformation = this.imageInformation;
        if (comfortableDealImageInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comfortableDealImageInformation.writeToParcel(parcel, flags);
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            style.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.buttons, parcel);
        while (itJ.hasNext()) {
            ((ComfortableDealButton) itJ.next()).writeToParcel(parcel, flags);
        }
        ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent = this.onShowEvent;
        if (comfortableDealAnalyticsEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comfortableDealAnalyticsEvent.writeToParcel(parcel, flags);
        }
    }
}
