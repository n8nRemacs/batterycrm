package com.avito.android.remote.delivery_suggests;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySuggests.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0004*+,-BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTitleTapDeepLink", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings;", "selectionSettings", "", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item;", "items", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$BottomText;", "bottomText", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$AddressCentricity;", "addressCentricity", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings;Ljava/util/List;Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$BottomText;Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$AddressCentricity;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings;", "f", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$BottomText;", "d", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$BottomText;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$AddressCentricity;", "c", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$AddressCentricity;", "AddressCentricity", "BottomText", "Item", "SelectionSettings", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliverySuggests implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliverySuggests> CREATOR = new a();

    @c("addressCentricity")
    @l
    private final AddressCentricity addressCentricity;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("bottomText")
    @l
    private final BottomText bottomText;

    @c("description")
    @l
    private final AttributedText description;

    @c("items")
    @k
    private final List<Item> items;

    @c("onTitleTapDeepLink")
    @l
    private final DeepLink onTitleTapDeepLink;

    @c("selectionSettings")
    @l
    private final SelectionSettings selectionSettings;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: DeliverySuggests.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$AddressCentricity;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddressCentricity implements Parcelable {

        @k
        public static final Parcelable.Creator<AddressCentricity> CREATOR = new a();

        @c("onTapDeepLink")
        @k
        private final DeepLink onTapDeepLink;

        @c("text")
        @k
        private final AttributedText text;

        /* compiled from: DeliverySuggests.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddressCentricity> {
            @Override // android.os.Parcelable.Creator
            public final AddressCentricity createFromParcel(Parcel parcel) {
                return new AddressCentricity((AttributedText) parcel.readParcelable(AddressCentricity.class.getClassLoader()), (DeepLink) parcel.readParcelable(AddressCentricity.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AddressCentricity[] newArray(int i12) {
                return new AddressCentricity[i12];
            }
        }

        public AddressCentricity(@k AttributedText attributedText, @k DeepLink deepLink) {
            this.text = attributedText;
            this.onTapDeepLink = deepLink;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressCentricity)) {
                return false;
            }
            AddressCentricity addressCentricity = (AddressCentricity) obj;
            return L.f(this.text, addressCentricity.text) && L.f(this.onTapDeepLink, addressCentricity.onTapDeepLink);
        }

        public final int hashCode() {
            return this.onTapDeepLink.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressCentricity(text=");
            sb2.append(this.text);
            sb2.append(", onTapDeepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.onTapDeepLink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.text, i12);
            parcel.writeParcelable(this.onTapDeepLink, i12);
        }
    }

    /* compiled from: DeliverySuggests.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$BottomText;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BottomText implements Parcelable {

        @k
        public static final Parcelable.Creator<BottomText> CREATOR = new a();

        @c("icon")
        @l
        private final UniversalImage icon;

        @c("title")
        @l
        private final AttributedText title;

        /* compiled from: DeliverySuggests.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BottomText> {
            @Override // android.os.Parcelable.Creator
            public final BottomText createFromParcel(Parcel parcel) {
                return new BottomText((AttributedText) parcel.readParcelable(BottomText.class.getClassLoader()), (UniversalImage) parcel.readParcelable(BottomText.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final BottomText[] newArray(int i12) {
                return new BottomText[i12];
            }
        }

        public BottomText(@l AttributedText attributedText, @l UniversalImage universalImage) {
            this.title = attributedText;
            this.icon = universalImage;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final UniversalImage getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomText)) {
                return false;
            }
            BottomText bottomText = (BottomText) obj;
            return L.f(this.title, bottomText.title) && L.f(this.icon, bottomText.icon);
        }

        public final int hashCode() {
            AttributedText attributedText = this.title;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            UniversalImage universalImage = this.icon;
            return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomText(title=");
            sb2.append(this.title);
            sb2.append(", icon=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.icon, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.title, i12);
            parcel.writeParcelable(this.icon, i12);
        }
    }

    /* compiled from: DeliverySuggests.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliverySuggests> {
        @Override // android.os.Parcelable.Creator
        public final DeliverySuggests createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DeliverySuggests.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(DeliverySuggests.class.getClassLoader());
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(DeliverySuggests.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(DeliverySuggests.class.getClassLoader());
            SelectionSettings selectionSettingsCreateFromParcel = parcel.readInt() == 0 ? null : SelectionSettings.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Item.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DeliverySuggests(attributedText, attributedText2, universalColor, deepLink, selectionSettingsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : BottomText.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AddressCentricity.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliverySuggests[] newArray(int i12) {
            return new DeliverySuggests[i12];
        }
    }

    public DeliverySuggests(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor, @l DeepLink deepLink, @l SelectionSettings selectionSettings, @k List<Item> list, @l BottomText bottomText, @l AddressCentricity addressCentricity) {
        this.title = attributedText;
        this.description = attributedText2;
        this.backgroundColor = universalColor;
        this.onTitleTapDeepLink = deepLink;
        this.selectionSettings = selectionSettings;
        this.items = list;
        this.bottomText = bottomText;
        this.addressCentricity = addressCentricity;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AddressCentricity getAddressCentricity() {
        return this.addressCentricity;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final BottomText getBottomText() {
        return this.bottomText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getOnTitleTapDeepLink() {
        return this.onTitleTapDeepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliverySuggests)) {
            return false;
        }
        DeliverySuggests deliverySuggests = (DeliverySuggests) obj;
        return L.f(this.title, deliverySuggests.title) && L.f(this.description, deliverySuggests.description) && L.f(this.backgroundColor, deliverySuggests.backgroundColor) && L.f(this.onTitleTapDeepLink, deliverySuggests.onTitleTapDeepLink) && L.f(this.selectionSettings, deliverySuggests.selectionSettings) && L.f(this.items, deliverySuggests.items) && L.f(this.bottomText, deliverySuggests.bottomText) && L.f(this.addressCentricity, deliverySuggests.addressCentricity);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final SelectionSettings getSelectionSettings() {
        return this.selectionSettings;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<Item> getItems() {
        return this.items;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        DeepLink deepLink = this.onTitleTapDeepLink;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        SelectionSettings selectionSettings = this.selectionSettings;
        int iE2 = H.e((iHashCode4 + (selectionSettings == null ? 0 : selectionSettings.hashCode())) * 31, 31, this.items);
        BottomText bottomText = this.bottomText;
        int iHashCode5 = (iE2 + (bottomText == null ? 0 : bottomText.hashCode())) * 31;
        AddressCentricity addressCentricity = this.addressCentricity;
        return iHashCode5 + (addressCentricity != null ? addressCentricity.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DeliverySuggests(title=" + this.title + ", description=" + this.description + ", backgroundColor=" + this.backgroundColor + ", onTitleTapDeepLink=" + this.onTitleTapDeepLink + ", selectionSettings=" + this.selectionSettings + ", items=" + this.items + ", bottomText=" + this.bottomText + ", addressCentricity=" + this.addressCentricity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        parcel.writeParcelable(this.backgroundColor, i12);
        parcel.writeParcelable(this.onTitleTapDeepLink, i12);
        SelectionSettings selectionSettings = this.selectionSettings;
        if (selectionSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectionSettings.writeToParcel(parcel, i12);
        }
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((Item) itJ.next()).writeToParcel(parcel, i12);
        }
        BottomText bottomText = this.bottomText;
        if (bottomText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomText.writeToParcel(parcel, i12);
        }
        AddressCentricity addressCentricity = this.addressCentricity;
        if (addressCentricity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCentricity.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: DeliverySuggests.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings$AnimationUrl;", "animationUrl", "", "", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings$DeliveryOption;", "deliveryData", "<init>", "(Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings$AnimationUrl;Ljava/util/Map;)V", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings$AnimationUrl;", "c", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings$AnimationUrl;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "AnimationUrl", "DeliveryOption", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SelectionSettings implements Parcelable {

        @k
        public static final Parcelable.Creator<SelectionSettings> CREATOR = new a();

        @c("animationUrl")
        @l
        private final AnimationUrl animationUrl;

        @c("deliveryData")
        @l
        private final Map<String, DeliveryOption> deliveryData;

        /* compiled from: DeliverySuggests.kt */
        @d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings$DeliveryOption;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/text/AttributedText;", "price", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeliveryOption implements Parcelable {

            @k
            public static final Parcelable.Creator<DeliveryOption> CREATOR = new a();

            @c(ContextActionHandler.Link.DEEPLINK)
            @k
            private final DeepLink deepLink;

            @c("price")
            @k
            private final AttributedText price;

            @c("title")
            @k
            private final AttributedText title;

            /* compiled from: DeliverySuggests.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DeliveryOption> {
                @Override // android.os.Parcelable.Creator
                public final DeliveryOption createFromParcel(Parcel parcel) {
                    return new DeliveryOption((DeepLink) parcel.readParcelable(DeliveryOption.class.getClassLoader()), (AttributedText) parcel.readParcelable(DeliveryOption.class.getClassLoader()), (AttributedText) parcel.readParcelable(DeliveryOption.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final DeliveryOption[] newArray(int i12) {
                    return new DeliveryOption[i12];
                }
            }

            public DeliveryOption(@k DeepLink deepLink, @k AttributedText attributedText, @k AttributedText attributedText2) {
                this.deepLink = deepLink;
                this.price = attributedText;
                this.title = attributedText2;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final AttributedText getPrice() {
                return this.price;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeliveryOption)) {
                    return false;
                }
                DeliveryOption deliveryOption = (DeliveryOption) obj;
                return L.f(this.deepLink, deliveryOption.deepLink) && L.f(this.price, deliveryOption.price) && L.f(this.title, deliveryOption.title);
            }

            @k
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            public final int hashCode() {
                return this.title.hashCode() + com.avito.android.actions_sheet.a.b(this.deepLink.hashCode() * 31, 31, this.price);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DeliveryOption(deepLink=");
                sb2.append(this.deepLink);
                sb2.append(", price=");
                sb2.append(this.price);
                sb2.append(", title=");
                return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.deepLink, i12);
                parcel.writeParcelable(this.price, i12);
                parcel.writeParcelable(this.title, i12);
            }
        }

        /* compiled from: DeliverySuggests.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelectionSettings> {
            @Override // android.os.Parcelable.Creator
            public final SelectionSettings createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap = null;
                AnimationUrl animationUrlCreateFromParcel = parcel.readInt() == 0 ? null : AnimationUrl.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        linkedHashMap2.put(parcel.readString(), DeliveryOption.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new SelectionSettings(animationUrlCreateFromParcel, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final SelectionSettings[] newArray(int i12) {
                return new SelectionSettings[i12];
            }
        }

        public SelectionSettings(@l AnimationUrl animationUrl, @l Map<String, DeliveryOption> map) {
            this.animationUrl = animationUrl;
            this.deliveryData = map;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AnimationUrl getAnimationUrl() {
            return this.animationUrl;
        }

        @l
        public final Map<String, DeliveryOption> d() {
            return this.deliveryData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionSettings)) {
                return false;
            }
            SelectionSettings selectionSettings = (SelectionSettings) obj;
            return L.f(this.animationUrl, selectionSettings.animationUrl) && L.f(this.deliveryData, selectionSettings.deliveryData);
        }

        public final int hashCode() {
            AnimationUrl animationUrl = this.animationUrl;
            int iHashCode = (animationUrl == null ? 0 : animationUrl.hashCode()) * 31;
            Map<String, DeliveryOption> map = this.deliveryData;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectionSettings(animationUrl=");
            sb2.append(this.animationUrl);
            sb2.append(", deliveryData=");
            return r.w(sb2, this.deliveryData, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            AnimationUrl animationUrl = this.animationUrl;
            if (animationUrl == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                animationUrl.writeToParcel(parcel, i12);
            }
            Map<String, DeliveryOption> map = this.deliveryData;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                ((DeliveryOption) entry.getValue()).writeToParcel(parcel, i12);
            }
        }

        /* compiled from: DeliverySuggests.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$SelectionSettings$AnimationUrl;", "Landroid/os/Parcelable;", "", "value", "valueDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "c", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AnimationUrl implements Parcelable {

            @k
            public static final Parcelable.Creator<AnimationUrl> CREATOR = new a();

            @c("value")
            @k
            private final String value;

            @c("valueDark")
            @l
            private final String valueDark;

            /* compiled from: DeliverySuggests.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AnimationUrl> {
                @Override // android.os.Parcelable.Creator
                public final AnimationUrl createFromParcel(Parcel parcel) {
                    return new AnimationUrl(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AnimationUrl[] newArray(int i12) {
                    return new AnimationUrl[i12];
                }
            }

            public AnimationUrl(@k String str, @l String str2) {
                this.value = str;
                this.valueDark = str2;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getValueDark() {
                return this.valueDark;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnimationUrl)) {
                    return false;
                }
                AnimationUrl animationUrl = (AnimationUrl) obj;
                return L.f(this.value, animationUrl.value) && L.f(this.valueDark, animationUrl.valueDark);
            }

            @k
            public final String getValue() {
                return this.value;
            }

            public final int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                String str = this.valueDark;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AnimationUrl(value=");
                sb2.append(this.value);
                sb2.append(", valueDark=");
                return C22026a.c(sb2, this.valueDark, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.value);
                parcel.writeString(this.valueDark);
            }

            public /* synthetic */ AnimationUrl(String str, String str2, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2);
            }
        }
    }

    /* compiled from: DeliverySuggests.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0003/01Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Icon;", "topRightIcon", "Lcom/avito/android/remote/model/text/AttributedText;", "topText", "middleText", "bottomText", "", "middleAndBottomSpacing", "topAndMiddleSpacing", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Padding;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings;", "selectionSettings", "<init>", "(Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Icon;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;ILjava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Padding;Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings;)V", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Icon;", "j", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Icon;", "Lcom/avito/android/remote/model/text/AttributedText;", "k", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "c", "I", "d", "()I", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Padding;", "g", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Padding;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings;", "h", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings;", "Icon", "Padding", "SelectionSettings", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Item implements Parcelable {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new a();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        @c("bottomText")
        @k
        private final AttributedText bottomText;

        @c("middleAndBottomSpacing")
        private final int middleAndBottomSpacing;

        @c("middleText")
        @k
        private final AttributedText middleText;

        @c("onTapDeepLink")
        @l
        private final DeepLink onTapDeepLink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
        @l
        private final Padding padding;

        @c("selectionSettings")
        @l
        private final SelectionSettings selectionSettings;

        @c("topAndMiddleSpacing")
        @l
        private final Integer topAndMiddleSpacing;

        @c("topRightIcon")
        @l
        private final Icon topRightIcon;

        @c("topText")
        @l
        private final AttributedText topText;

        /* compiled from: DeliverySuggests.kt */
        @d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Icon;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Icon implements Parcelable {

            @k
            public static final Parcelable.Creator<Icon> CREATOR = new a();

            @c("color")
            @k
            private final UniversalColor color;

            @c("name")
            @k
            private final String name;

            /* compiled from: DeliverySuggests.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Icon> {
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    return new Icon(parcel.readString(), (UniversalColor) parcel.readParcelable(Icon.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i12) {
                    return new Icon[i12];
                }
            }

            public Icon(@k String str, @k UniversalColor universalColor) {
                this.name = str;
                this.color = universalColor;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final UniversalColor getColor() {
                return this.color;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return L.f(this.name, icon.name) && L.f(this.color, icon.color);
            }

            @k
            public final String getName() {
                return this.name;
            }

            public final int hashCode() {
                return this.color.hashCode() + (this.name.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Icon(name=");
                sb2.append(this.name);
                sb2.append(", color=");
                return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.name);
                parcel.writeParcelable(this.color, i12);
            }
        }

        /* compiled from: DeliverySuggests.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$Padding;", "Landroid/os/Parcelable;", "", ProfileTab.ALL, "left", "top", "right", "bottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "e", "g", "f", "d", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Padding implements Parcelable {

            @k
            public static final Parcelable.Creator<Padding> CREATOR = new a();

            @c(ProfileTab.ALL)
            @l
            private final Integer all;

            @c("bottom")
            @l
            private final Integer bottom;

            @c("left")
            @l
            private final Integer left;

            @c("right")
            @l
            private final Integer right;

            @c("top")
            @l
            private final Integer top;

            /* compiled from: DeliverySuggests.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Padding> {
                @Override // android.os.Parcelable.Creator
                public final Padding createFromParcel(Parcel parcel) {
                    return new Padding(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Padding[] newArray(int i12) {
                    return new Padding[i12];
                }
            }

            public Padding(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5) {
                this.all = num;
                this.left = num2;
                this.top = num3;
                this.right = num4;
                this.bottom = num5;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Integer getAll() {
                return this.all;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final Integer getBottom() {
                return this.bottom;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Integer getLeft() {
                return this.left;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Padding)) {
                    return false;
                }
                Padding padding = (Padding) obj;
                return L.f(this.all, padding.all) && L.f(this.left, padding.left) && L.f(this.top, padding.top) && L.f(this.right, padding.right) && L.f(this.bottom, padding.bottom);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final Integer getRight() {
                return this.right;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final Integer getTop() {
                return this.top;
            }

            public final int hashCode() {
                Integer num = this.all;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.left;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.top;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.right;
                int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.bottom;
                return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Padding(all=");
                sb2.append(this.all);
                sb2.append(", left=");
                sb2.append(this.left);
                sb2.append(", top=");
                sb2.append(this.top);
                sb2.append(", right=");
                sb2.append(this.right);
                sb2.append(", bottom=");
                return s.j(sb2, this.bottom, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                Integer num = this.all;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                Integer num2 = this.left;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                }
                Integer num3 = this.top;
                if (num3 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num3);
                }
                Integer num4 = this.right;
                if (num4 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num4);
                }
                Integer num5 = this.bottom;
                if (num5 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num5);
                }
            }
        }

        /* compiled from: DeliverySuggests.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "topText", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings$Badge;", "badge", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings$Badge;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings$Badge;", "c", "()Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings$Badge;", "Badge", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SelectionSettings implements Parcelable {

            @k
            public static final Parcelable.Creator<SelectionSettings> CREATOR = new a();

            @c("badge")
            @l
            private final Badge badge;

            @c("id")
            @k
            private final String id;

            @c("topText")
            @k
            private final AttributedText topText;

            /* compiled from: DeliverySuggests.kt */
            @d
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/delivery_suggests/DeliverySuggests$Item$SelectionSettings$Badge;", "Landroid/os/Parcelable;", "", "iconName", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Badge implements Parcelable {

                @k
                public static final Parcelable.Creator<Badge> CREATOR = new a();

                @c("backgroundColor")
                @l
                private final UniversalColor backgroundColor;

                @c("iconName")
                @k
                private final String iconName;

                /* compiled from: DeliverySuggests.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Badge> {
                    @Override // android.os.Parcelable.Creator
                    public final Badge createFromParcel(Parcel parcel) {
                        return new Badge(parcel.readString(), (UniversalColor) parcel.readParcelable(Badge.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Badge[] newArray(int i12) {
                        return new Badge[i12];
                    }
                }

                public Badge(@k String str, @l UniversalColor universalColor) {
                    this.iconName = str;
                    this.backgroundColor = universalColor;
                }

                @k
                /* renamed from: c, reason: from getter */
                public final String getIconName() {
                    return this.iconName;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Badge)) {
                        return false;
                    }
                    Badge badge = (Badge) obj;
                    return L.f(this.iconName, badge.iconName) && L.f(this.backgroundColor, badge.backgroundColor);
                }

                @l
                public final UniversalColor getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final int hashCode() {
                    int iHashCode = this.iconName.hashCode() * 31;
                    UniversalColor universalColor = this.backgroundColor;
                    return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Badge(iconName=");
                    sb2.append(this.iconName);
                    sb2.append(", backgroundColor=");
                    return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.iconName);
                    parcel.writeParcelable(this.backgroundColor, i12);
                }
            }

            /* compiled from: DeliverySuggests.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SelectionSettings> {
                @Override // android.os.Parcelable.Creator
                public final SelectionSettings createFromParcel(Parcel parcel) {
                    return new SelectionSettings(parcel.readString(), (AttributedText) parcel.readParcelable(SelectionSettings.class.getClassLoader()), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final SelectionSettings[] newArray(int i12) {
                    return new SelectionSettings[i12];
                }
            }

            public SelectionSettings(@k String str, @k AttributedText attributedText, @l Badge badge) {
                this.id = str;
                this.topText = attributedText;
                this.badge = badge;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Badge getBadge() {
                return this.badge;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getTopText() {
                return this.topText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectionSettings)) {
                    return false;
                }
                SelectionSettings selectionSettings = (SelectionSettings) obj;
                return L.f(this.id, selectionSettings.id) && L.f(this.topText, selectionSettings.topText) && L.f(this.badge, selectionSettings.badge);
            }

            @k
            public final String getId() {
                return this.id;
            }

            public final int hashCode() {
                int iB2 = com.avito.android.actions_sheet.a.b(this.id.hashCode() * 31, 31, this.topText);
                Badge badge = this.badge;
                return iB2 + (badge == null ? 0 : badge.hashCode());
            }

            @k
            public final String toString() {
                return "SelectionSettings(id=" + this.id + ", topText=" + this.topText + ", badge=" + this.badge + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.topText, i12);
                Badge badge = this.badge;
                if (badge == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    badge.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: DeliverySuggests.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                return new Item(parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(Item.class.getClassLoader()), (AttributedText) parcel.readParcelable(Item.class.getClassLoader()), (AttributedText) parcel.readParcelable(Item.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(Item.class.getClassLoader()), (DeepLink) parcel.readParcelable(Item.class.getClassLoader()), parcel.readInt() == 0 ? null : Padding.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelectionSettings.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@l Icon icon, @l AttributedText attributedText, @k AttributedText attributedText2, @k AttributedText attributedText3, int i12, @l Integer num, @k UniversalColor universalColor, @l DeepLink deepLink, @l Padding padding, @l SelectionSettings selectionSettings) {
            this.topRightIcon = icon;
            this.topText = attributedText;
            this.middleText = attributedText2;
            this.bottomText = attributedText3;
            this.middleAndBottomSpacing = i12;
            this.topAndMiddleSpacing = num;
            this.backgroundColor = universalColor;
            this.onTapDeepLink = deepLink;
            this.padding = padding;
            this.selectionSettings = selectionSettings;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final AttributedText getBottomText() {
            return this.bottomText;
        }

        /* renamed from: d, reason: from getter */
        public final int getMiddleAndBottomSpacing() {
            return this.middleAndBottomSpacing;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final AttributedText getMiddleText() {
            return this.middleText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return L.f(this.topRightIcon, item.topRightIcon) && L.f(this.topText, item.topText) && L.f(this.middleText, item.middleText) && L.f(this.bottomText, item.bottomText) && this.middleAndBottomSpacing == item.middleAndBottomSpacing && L.f(this.topAndMiddleSpacing, item.topAndMiddleSpacing) && L.f(this.backgroundColor, item.backgroundColor) && L.f(this.onTapDeepLink, item.onTapDeepLink) && L.f(this.padding, item.padding) && L.f(this.selectionSettings, item.selectionSettings);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final Padding getPadding() {
            return this.padding;
        }

        @k
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final SelectionSettings getSelectionSettings() {
            return this.selectionSettings;
        }

        public final int hashCode() {
            Icon icon = this.topRightIcon;
            int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
            AttributedText attributedText = this.topText;
            int iE2 = r.e(this.middleAndBottomSpacing, com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.middleText), 31, this.bottomText), 31);
            Integer num = this.topAndMiddleSpacing;
            int i12 = com.avito.android.actions_sheet.a.i(this.backgroundColor, (iE2 + (num == null ? 0 : num.hashCode())) * 31, 31);
            DeepLink deepLink = this.onTapDeepLink;
            int iHashCode2 = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Padding padding = this.padding;
            int iHashCode3 = (iHashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
            SelectionSettings selectionSettings = this.selectionSettings;
            return iHashCode3 + (selectionSettings != null ? selectionSettings.hashCode() : 0);
        }

        @l
        /* renamed from: i, reason: from getter */
        public final Integer getTopAndMiddleSpacing() {
            return this.topAndMiddleSpacing;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final Icon getTopRightIcon() {
            return this.topRightIcon;
        }

        @l
        /* renamed from: k, reason: from getter */
        public final AttributedText getTopText() {
            return this.topText;
        }

        public final boolean l() {
            SelectionSettings selectionSettings = this.selectionSettings;
            return (selectionSettings != null ? selectionSettings.getId() : null) != null;
        }

        @k
        public final String toString() {
            return "Item(topRightIcon=" + this.topRightIcon + ", topText=" + this.topText + ", middleText=" + this.middleText + ", bottomText=" + this.bottomText + ", middleAndBottomSpacing=" + this.middleAndBottomSpacing + ", topAndMiddleSpacing=" + this.topAndMiddleSpacing + ", backgroundColor=" + this.backgroundColor + ", onTapDeepLink=" + this.onTapDeepLink + ", padding=" + this.padding + ", selectionSettings=" + this.selectionSettings + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Icon icon = this.topRightIcon;
            if (icon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.topText, i12);
            parcel.writeParcelable(this.middleText, i12);
            parcel.writeParcelable(this.bottomText, i12);
            parcel.writeInt(this.middleAndBottomSpacing);
            Integer num = this.topAndMiddleSpacing;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeParcelable(this.backgroundColor, i12);
            parcel.writeParcelable(this.onTapDeepLink, i12);
            Padding padding = this.padding;
            if (padding == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                padding.writeToParcel(parcel, i12);
            }
            SelectionSettings selectionSettings = this.selectionSettings;
            if (selectionSettings == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selectionSettings.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ Item(Icon icon, AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, int i12, Integer num, UniversalColor universalColor, DeepLink deepLink, Padding padding, SelectionSettings selectionSettings, int i13, C42822w c42822w) {
            this(icon, attributedText, attributedText2, attributedText3, i12, num, universalColor, deepLink, (i13 & 256) != 0 ? null : padding, (i13 & 512) != 0 ? null : selectionSettings);
        }
    }
}
