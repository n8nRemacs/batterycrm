package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.insights.Insight;
import com.avito.android.remote.model.item_discount.ShortTermRentItemDiscounts;
import com.avito.android.remote.model.item_popularity.ItemPopularity;
import com.avito.android.remote.model.optimal_price.OptimalPriceWidget;
import com.avito.android.remote.model.short_term_rent.TravelPaymentToggles;
import com.avito.android.remote.model.short_term_rent.TravelTrustItemDto;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertShortTermRent.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001:\u0002ABB{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b\r\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/AdvertShortTermRent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertShortTermRent$Actions;", "actions", "", "Lcom/avito/android/remote/model/insights/Insight;", "insights", "Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;", "buyerBonuses", "", "hasLastMinuteOfferDiscount", "Lcom/avito/android/remote/model/item_discount/ShortTermRentItemDiscounts;", "itemDiscounts", "isBookingBottomBar", "Lcom/avito/android/remote/model/AdvertShortTermRent$NeighboringDates;", "neighboringDates", "Lcom/avito/android/remote/model/short_term_rent/TravelTrustItemDto;", "trustItem", "Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget;", "optimalPriceWidget", "Lcom/avito/android/remote/model/item_popularity/ItemPopularity;", "itemPopularity", "Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles;", "paymentToggles", "<init>", "(Lcom/avito/android/remote/model/AdvertShortTermRent$Actions;Ljava/util/List;Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;Ljava/lang/Boolean;Lcom/avito/android/remote/model/item_discount/ShortTermRentItemDiscounts;Ljava/lang/Boolean;Lcom/avito/android/remote/model/AdvertShortTermRent$NeighboringDates;Lcom/avito/android/remote/model/short_term_rent/TravelTrustItemDto;Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget;Lcom/avito/android/remote/model/item_popularity/ItemPopularity;Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertShortTermRent$Actions;", "getActions", "()Lcom/avito/android/remote/model/AdvertShortTermRent$Actions;", "Ljava/util/List;", "getInsights", "()Ljava/util/List;", "Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;", "getBuyerBonuses", "()Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;", "Ljava/lang/Boolean;", "getHasLastMinuteOfferDiscount", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/item_discount/ShortTermRentItemDiscounts;", "getItemDiscounts", "()Lcom/avito/android/remote/model/item_discount/ShortTermRentItemDiscounts;", "Lcom/avito/android/remote/model/AdvertShortTermRent$NeighboringDates;", "getNeighboringDates", "()Lcom/avito/android/remote/model/AdvertShortTermRent$NeighboringDates;", "Lcom/avito/android/remote/model/short_term_rent/TravelTrustItemDto;", "getTrustItem", "()Lcom/avito/android/remote/model/short_term_rent/TravelTrustItemDto;", "Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget;", "getOptimalPriceWidget", "()Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget;", "Lcom/avito/android/remote/model/item_popularity/ItemPopularity;", "getItemPopularity", "()Lcom/avito/android/remote/model/item_popularity/ItemPopularity;", "Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles;", "getPaymentToggles", "()Lcom/avito/android/remote/model/short_term_rent/TravelPaymentToggles;", "Actions", "NeighboringDates", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertShortTermRent implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertShortTermRent> CREATOR = new Creator();

    @c("actions")
    @l
    private final Actions actions;

    @c("buyerBonuses")
    @l
    private final BuyerBonuses buyerBonuses;

    @c("hasLastMinuteOfferDiscount")
    @l
    private final Boolean hasLastMinuteOfferDiscount;

    @c("insights")
    @l
    private final List<Insight> insights;

    @c("isBookingBottomBar")
    @l
    private final Boolean isBookingBottomBar;

    @c("itemDiscounts")
    @l
    private final ShortTermRentItemDiscounts itemDiscounts;

    @c("itemPopularity")
    @l
    private final ItemPopularity itemPopularity;

    @c("neighboringDates")
    @l
    private final NeighboringDates neighboringDates;

    @c("optimalPriceWidget")
    @l
    private final OptimalPriceWidget optimalPriceWidget;

    @c("paymentToggles")
    @l
    private final TravelPaymentToggles paymentToggles;

    @c("trustItem")
    @l
    private final TravelTrustItemDto trustItem;

    /* compiled from: AdvertShortTermRent.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/AdvertShortTermRent$Actions;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SimpleAction;", "requestBooking", "showWidgetFilters", "changedDates", "<init>", "(Lcom/avito/android/remote/model/SimpleAction;Lcom/avito/android/remote/model/SimpleAction;Lcom/avito/android/remote/model/SimpleAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/SimpleAction;", "getRequestBooking", "()Lcom/avito/android/remote/model/SimpleAction;", "getShowWidgetFilters", "getChangedDates", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Actions implements Parcelable {

        @k
        public static final Parcelable.Creator<Actions> CREATOR = new Creator();

        @c("changedDates")
        @l
        private final SimpleAction changedDates;

        @c("requestBooking")
        @l
        private final SimpleAction requestBooking;

        @c("showWidgetFilters")
        @l
        private final SimpleAction showWidgetFilters;

        /* compiled from: AdvertShortTermRent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Actions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Actions createFromParcel(@k Parcel parcel) {
                return new Actions(parcel.readInt() == 0 ? null : SimpleAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SimpleAction.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Actions[] newArray(int i12) {
                return new Actions[i12];
            }
        }

        public Actions(@l SimpleAction simpleAction, @l SimpleAction simpleAction2, @l SimpleAction simpleAction3) {
            this.requestBooking = simpleAction;
            this.showWidgetFilters = simpleAction2;
            this.changedDates = simpleAction3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final SimpleAction getChangedDates() {
            return this.changedDates;
        }

        @l
        public final SimpleAction getRequestBooking() {
            return this.requestBooking;
        }

        @l
        public final SimpleAction getShowWidgetFilters() {
            return this.showWidgetFilters;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            SimpleAction simpleAction = this.requestBooking;
            if (simpleAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleAction.writeToParcel(parcel, flags);
            }
            SimpleAction simpleAction2 = this.showWidgetFilters;
            if (simpleAction2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleAction2.writeToParcel(parcel, flags);
            }
            SimpleAction simpleAction3 = this.changedDates;
            if (simpleAction3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleAction3.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: AdvertShortTermRent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertShortTermRent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertShortTermRent createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Actions actionsCreateFromParcel = parcel.readInt() == 0 ? null : Actions.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Insight.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            BuyerBonuses buyerBonusesCreateFromParcel = parcel.readInt() == 0 ? null : BuyerBonuses.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ShortTermRentItemDiscounts shortTermRentItemDiscountsCreateFromParcel = parcel.readInt() == 0 ? null : ShortTermRentItemDiscounts.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertShortTermRent(actionsCreateFromParcel, arrayList, buyerBonusesCreateFromParcel, boolValueOf, shortTermRentItemDiscountsCreateFromParcel, boolValueOf2, parcel.readInt() == 0 ? null : NeighboringDates.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TravelTrustItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OptimalPriceWidget.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ItemPopularity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TravelPaymentToggles.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertShortTermRent[] newArray(int i12) {
            return new AdvertShortTermRent[i12];
        }
    }

    /* compiled from: AdvertShortTermRent.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertShortTermRent$NeighboringDates;", "Landroid/os/Parcelable;", "", "context", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertShortTermRent$NeighboringDates;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getContext", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NeighboringDates implements Parcelable {

        @k
        public static final Parcelable.Creator<NeighboringDates> CREATOR = new Creator();

        @c("context")
        @k
        private final String context;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertShortTermRent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NeighboringDates> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NeighboringDates createFromParcel(@k Parcel parcel) {
                return new NeighboringDates(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NeighboringDates[] newArray(int i12) {
                return new NeighboringDates[i12];
            }
        }

        public NeighboringDates(@k String str, @k String str2) {
            this.context = str;
            this.title = str2;
        }

        public static /* synthetic */ NeighboringDates copy$default(NeighboringDates neighboringDates, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = neighboringDates.context;
            }
            if ((i12 & 2) != 0) {
                str2 = neighboringDates.title;
            }
            return neighboringDates.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final NeighboringDates copy(@k String context, @k String title) {
            return new NeighboringDates(context, title);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NeighboringDates)) {
                return false;
            }
            NeighboringDates neighboringDates = (NeighboringDates) other;
            return L.f(this.context, neighboringDates.context) && L.f(this.title, neighboringDates.title);
        }

        @k
        public final String getContext() {
            return this.context;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.context.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("NeighboringDates(context=");
            sb2.append(this.context);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.context);
            parcel.writeString(this.title);
        }
    }

    public AdvertShortTermRent(@l Actions actions, @l List<Insight> list, @l BuyerBonuses buyerBonuses, @l Boolean bool, @l ShortTermRentItemDiscounts shortTermRentItemDiscounts, @l Boolean bool2, @l NeighboringDates neighboringDates, @l TravelTrustItemDto travelTrustItemDto, @l OptimalPriceWidget optimalPriceWidget, @l ItemPopularity itemPopularity, @l TravelPaymentToggles travelPaymentToggles) {
        this.actions = actions;
        this.insights = list;
        this.buyerBonuses = buyerBonuses;
        this.hasLastMinuteOfferDiscount = bool;
        this.itemDiscounts = shortTermRentItemDiscounts;
        this.isBookingBottomBar = bool2;
        this.neighboringDates = neighboringDates;
        this.trustItem = travelTrustItemDto;
        this.optimalPriceWidget = optimalPriceWidget;
        this.itemPopularity = itemPopularity;
        this.paymentToggles = travelPaymentToggles;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Actions getActions() {
        return this.actions;
    }

    @l
    public final BuyerBonuses getBuyerBonuses() {
        return this.buyerBonuses;
    }

    @l
    public final Boolean getHasLastMinuteOfferDiscount() {
        return this.hasLastMinuteOfferDiscount;
    }

    @l
    public final List<Insight> getInsights() {
        return this.insights;
    }

    @l
    public final ShortTermRentItemDiscounts getItemDiscounts() {
        return this.itemDiscounts;
    }

    @l
    public final ItemPopularity getItemPopularity() {
        return this.itemPopularity;
    }

    @l
    public final NeighboringDates getNeighboringDates() {
        return this.neighboringDates;
    }

    @l
    public final OptimalPriceWidget getOptimalPriceWidget() {
        return this.optimalPriceWidget;
    }

    @l
    public final TravelPaymentToggles getPaymentToggles() {
        return this.paymentToggles;
    }

    @l
    public final TravelTrustItemDto getTrustItem() {
        return this.trustItem;
    }

    @l
    /* renamed from: isBookingBottomBar, reason: from getter */
    public final Boolean getIsBookingBottomBar() {
        return this.isBookingBottomBar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Actions actions = this.actions;
        if (actions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actions.writeToParcel(parcel, flags);
        }
        List<Insight> list = this.insights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Insight) itA.next()).writeToParcel(parcel, flags);
            }
        }
        BuyerBonuses buyerBonuses = this.buyerBonuses;
        if (buyerBonuses == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyerBonuses.writeToParcel(parcel, flags);
        }
        Boolean bool = this.hasLastMinuteOfferDiscount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        ShortTermRentItemDiscounts shortTermRentItemDiscounts = this.itemDiscounts;
        if (shortTermRentItemDiscounts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortTermRentItemDiscounts.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.isBookingBottomBar;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        NeighboringDates neighboringDates = this.neighboringDates;
        if (neighboringDates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            neighboringDates.writeToParcel(parcel, flags);
        }
        TravelTrustItemDto travelTrustItemDto = this.trustItem;
        if (travelTrustItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            travelTrustItemDto.writeToParcel(parcel, flags);
        }
        OptimalPriceWidget optimalPriceWidget = this.optimalPriceWidget;
        if (optimalPriceWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            optimalPriceWidget.writeToParcel(parcel, flags);
        }
        ItemPopularity itemPopularity = this.itemPopularity;
        if (itemPopularity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemPopularity.writeToParcel(parcel, flags);
        }
        TravelPaymentToggles travelPaymentToggles = this.paymentToggles;
        if (travelPaymentToggles == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            travelPaymentToggles.writeToParcel(parcel, flags);
        }
    }
}
