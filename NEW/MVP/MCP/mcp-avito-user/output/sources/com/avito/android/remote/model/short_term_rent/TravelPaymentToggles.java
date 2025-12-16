package com.avito.android.remote.model.short_term_rent;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelPaymentToggles.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles$Item;", "items", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Ljava/util/List;", "getItems", "Item", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TravelPaymentToggles implements Parcelable {

    @k
    public static final Parcelable.Creator<TravelPaymentToggles> CREATOR = new Creator();

    @c("items")
    @l
    private final List<Item> items;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: TravelPaymentToggles.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TravelPaymentToggles> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TravelPaymentToggles createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(TravelPaymentToggles.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Item.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new TravelPaymentToggles(attributedText, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TravelPaymentToggles[] newArray(int i12) {
            return new TravelPaymentToggles[i12];
        }
    }

    /* compiled from: TravelPaymentToggles.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b7\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b9\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles$Item;", "Landroid/os/Parcelable;", "", "id", "", "enabled", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboardingDeeplink", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "price", "discountPercent", "priceWithDiscount", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onClickEvent", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles$Item;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getEnabled", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnboardingDeeplink", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "getPrice", "getDiscountPercent", "getPriceWithDiscount", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getOnClickEvent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        @c("discountPercent")
        @l
        private final AttributedText discountPercent;

        @c("enabled")
        @l
        private final Boolean enabled;

        @c("id")
        @k
        private final String id;

        @c("onClickEvent")
        @l
        private final ParametrizedEvent onClickEvent;

        @c("onboardingDeeplink")
        @l
        private final DeepLink onboardingDeeplink;

        @c("price")
        @l
        private final AttributedText price;

        @c("priceWithDiscount")
        @l
        private final AttributedText priceWithDiscount;

        @c("text")
        @l
        private final AttributedText text;

        /* compiled from: TravelPaymentToggles.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Item(string, boolValueOf, (DeepLink) parcel.readParcelable(Item.class.getClassLoader()), (AttributedText) parcel.readParcelable(Item.class.getClassLoader()), (AttributedText) parcel.readParcelable(Item.class.getClassLoader()), (AttributedText) parcel.readParcelable(Item.class.getClassLoader()), (AttributedText) parcel.readParcelable(Item.class.getClassLoader()), parcel.readInt() != 0 ? ParametrizedEvent.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@k String str, @l Boolean bool, @l DeepLink deepLink, @l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l AttributedText attributedText4, @l ParametrizedEvent parametrizedEvent) {
            this.id = str;
            this.enabled = bool;
            this.onboardingDeeplink = deepLink;
            this.text = attributedText;
            this.price = attributedText2;
            this.discountPercent = attributedText3;
            this.priceWithDiscount = attributedText4;
            this.onClickEvent = parametrizedEvent;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getOnboardingDeeplink() {
            return this.onboardingDeeplink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final AttributedText getPrice() {
            return this.price;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final AttributedText getDiscountPercent() {
            return this.discountPercent;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final AttributedText getPriceWithDiscount() {
            return this.priceWithDiscount;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final ParametrizedEvent getOnClickEvent() {
            return this.onClickEvent;
        }

        @k
        public final Item copy(@k String id2, @l Boolean enabled, @l DeepLink onboardingDeeplink, @l AttributedText text, @l AttributedText price, @l AttributedText discountPercent, @l AttributedText priceWithDiscount, @l ParametrizedEvent onClickEvent) {
            return new Item(id2, enabled, onboardingDeeplink, text, price, discountPercent, priceWithDiscount, onClickEvent);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return L.f(this.id, item.id) && L.f(this.enabled, item.enabled) && L.f(this.onboardingDeeplink, item.onboardingDeeplink) && L.f(this.text, item.text) && L.f(this.price, item.price) && L.f(this.discountPercent, item.discountPercent) && L.f(this.priceWithDiscount, item.priceWithDiscount) && L.f(this.onClickEvent, item.onClickEvent);
        }

        @l
        public final AttributedText getDiscountPercent() {
            return this.discountPercent;
        }

        @l
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final ParametrizedEvent getOnClickEvent() {
            return this.onClickEvent;
        }

        @l
        public final DeepLink getOnboardingDeeplink() {
            return this.onboardingDeeplink;
        }

        @l
        public final AttributedText getPrice() {
            return this.price;
        }

        @l
        public final AttributedText getPriceWithDiscount() {
            return this.priceWithDiscount;
        }

        @l
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Boolean bool = this.enabled;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            DeepLink deepLink = this.onboardingDeeplink;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AttributedText attributedText = this.text;
            int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.price;
            int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            AttributedText attributedText3 = this.discountPercent;
            int iHashCode6 = (iHashCode5 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
            AttributedText attributedText4 = this.priceWithDiscount;
            int iHashCode7 = (iHashCode6 + (attributedText4 == null ? 0 : attributedText4.hashCode())) * 31;
            ParametrizedEvent parametrizedEvent = this.onClickEvent;
            return iHashCode7 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Item(id=");
            sb2.append(this.id);
            sb2.append(", enabled=");
            sb2.append(this.enabled);
            sb2.append(", onboardingDeeplink=");
            sb2.append(this.onboardingDeeplink);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", discountPercent=");
            sb2.append(this.discountPercent);
            sb2.append(", priceWithDiscount=");
            sb2.append(this.priceWithDiscount);
            sb2.append(", onClickEvent=");
            return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onClickEvent, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            Boolean bool = this.enabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeParcelable(this.onboardingDeeplink, flags);
            parcel.writeParcelable(this.text, flags);
            parcel.writeParcelable(this.price, flags);
            parcel.writeParcelable(this.discountPercent, flags);
            parcel.writeParcelable(this.priceWithDiscount, flags);
            ParametrizedEvent parametrizedEvent = this.onClickEvent;
            if (parametrizedEvent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parametrizedEvent.writeToParcel(parcel, flags);
            }
        }
    }

    public TravelPaymentToggles(@l AttributedText attributedText, @l List<Item> list) {
        this.title = attributedText;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelPaymentToggles copy$default(TravelPaymentToggles travelPaymentToggles, AttributedText attributedText, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = travelPaymentToggles.title;
        }
        if ((i12 & 2) != 0) {
            list = travelPaymentToggles.items;
        }
        return travelPaymentToggles.copy(attributedText, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final List<Item> component2() {
        return this.items;
    }

    @k
    public final TravelPaymentToggles copy(@l AttributedText title, @l List<Item> items) {
        return new TravelPaymentToggles(title, items);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPaymentToggles)) {
            return false;
        }
        TravelPaymentToggles travelPaymentToggles = (TravelPaymentToggles) other;
        return L.f(this.title, travelPaymentToggles.title) && L.f(this.items, travelPaymentToggles.items);
    }

    @l
    public final List<Item> getItems() {
        return this.items;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        List<Item> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TravelPaymentToggles(title=");
        sb2.append(this.title);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        List<Item> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Item) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
