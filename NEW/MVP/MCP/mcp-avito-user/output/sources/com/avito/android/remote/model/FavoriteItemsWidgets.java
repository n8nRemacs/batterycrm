package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteItemsWidgets.kt */
@d
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020)HÖ\u0001¢\u0006\u0004\b1\u0010+J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020)HÖ\u0001¢\u0006\u0004\b6\u00107R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010#¨\u0006H"}, d2 = {"Lcom/avito/android/remote/model/FavoriteItemsWidgets;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/OrdersWidget;", "orders", "Lcom/avito/android/remote/model/CategoriesWidget;", "categories", "Lcom/avito/android/remote/model/ActionsWidget;", "actions", "Lcom/avito/android/remote/model/CollectionInfo;", "collection", "Lcom/avito/android/remote/model/Author;", "author", "Lcom/avito/android/remote/model/BeduinV2;", "topWidget", "Lcom/avito/android/remote/model/ShowOnlyActiveFavoritesSwitchInfo;", "showOnlyActiveFavoritesSwitchInfo", "Lcom/avito/android/remote/model/FavoritesSearchWidget;", "searchWidget", "<init>", "(Lcom/avito/android/remote/model/OrdersWidget;Lcom/avito/android/remote/model/CategoriesWidget;Lcom/avito/android/remote/model/ActionsWidget;Lcom/avito/android/remote/model/CollectionInfo;Lcom/avito/android/remote/model/Author;Lcom/avito/android/remote/model/BeduinV2;Lcom/avito/android/remote/model/ShowOnlyActiveFavoritesSwitchInfo;Lcom/avito/android/remote/model/FavoritesSearchWidget;)V", "component1", "()Lcom/avito/android/remote/model/OrdersWidget;", "component2", "()Lcom/avito/android/remote/model/CategoriesWidget;", "component3", "()Lcom/avito/android/remote/model/ActionsWidget;", "component4", "()Lcom/avito/android/remote/model/CollectionInfo;", "component5", "()Lcom/avito/android/remote/model/Author;", "component6", "()Lcom/avito/android/remote/model/BeduinV2;", "component7", "()Lcom/avito/android/remote/model/ShowOnlyActiveFavoritesSwitchInfo;", "component8", "()Lcom/avito/android/remote/model/FavoritesSearchWidget;", "copy", "(Lcom/avito/android/remote/model/OrdersWidget;Lcom/avito/android/remote/model/CategoriesWidget;Lcom/avito/android/remote/model/ActionsWidget;Lcom/avito/android/remote/model/CollectionInfo;Lcom/avito/android/remote/model/Author;Lcom/avito/android/remote/model/BeduinV2;Lcom/avito/android/remote/model/ShowOnlyActiveFavoritesSwitchInfo;Lcom/avito/android/remote/model/FavoritesSearchWidget;)Lcom/avito/android/remote/model/FavoriteItemsWidgets;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/OrdersWidget;", "getOrders", "Lcom/avito/android/remote/model/CategoriesWidget;", "getCategories", "Lcom/avito/android/remote/model/ActionsWidget;", "getActions", "Lcom/avito/android/remote/model/CollectionInfo;", "getCollection", "Lcom/avito/android/remote/model/Author;", "getAuthor", "Lcom/avito/android/remote/model/BeduinV2;", "getTopWidget", "Lcom/avito/android/remote/model/ShowOnlyActiveFavoritesSwitchInfo;", "getShowOnlyActiveFavoritesSwitchInfo", "Lcom/avito/android/remote/model/FavoritesSearchWidget;", "getSearchWidget", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FavoriteItemsWidgets implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoriteItemsWidgets> CREATOR = new Creator();

    @c("actions")
    @l
    private final ActionsWidget actions;

    @c("author")
    @l
    private final Author author;

    @c("categories")
    @l
    private final CategoriesWidget categories;

    @c("collection")
    @l
    private final CollectionInfo collection;

    @c("orders")
    @l
    private final OrdersWidget orders;

    @c(SingleLineInputModel.STYLE_SEARCH)
    @l
    private final FavoritesSearchWidget searchWidget;

    @c("onlyActive")
    @l
    private final ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo;

    @c("topWidget")
    @l
    private final BeduinV2 topWidget;

    /* compiled from: FavoriteItemsWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteItemsWidgets> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteItemsWidgets createFromParcel(@k Parcel parcel) {
            return new FavoriteItemsWidgets(parcel.readInt() == 0 ? null : OrdersWidget.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CategoriesWidget.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActionsWidget.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CollectionInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Author.CREATOR.createFromParcel(parcel), (BeduinV2) parcel.readParcelable(FavoriteItemsWidgets.class.getClassLoader()), parcel.readInt() == 0 ? null : ShowOnlyActiveFavoritesSwitchInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FavoritesSearchWidget.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteItemsWidgets[] newArray(int i12) {
            return new FavoriteItemsWidgets[i12];
        }
    }

    public FavoriteItemsWidgets(@l OrdersWidget ordersWidget, @l CategoriesWidget categoriesWidget, @l ActionsWidget actionsWidget, @l CollectionInfo collectionInfo, @l Author author, @l BeduinV2 beduinV2, @l ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo, @l FavoritesSearchWidget favoritesSearchWidget) {
        this.orders = ordersWidget;
        this.categories = categoriesWidget;
        this.actions = actionsWidget;
        this.collection = collectionInfo;
        this.author = author;
        this.topWidget = beduinV2;
        this.showOnlyActiveFavoritesSwitchInfo = showOnlyActiveFavoritesSwitchInfo;
        this.searchWidget = favoritesSearchWidget;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final OrdersWidget getOrders() {
        return this.orders;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final CategoriesWidget getCategories() {
        return this.categories;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ActionsWidget getActions() {
        return this.actions;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final CollectionInfo getCollection() {
        return this.collection;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Author getAuthor() {
        return this.author;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinV2 getTopWidget() {
        return this.topWidget;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ShowOnlyActiveFavoritesSwitchInfo getShowOnlyActiveFavoritesSwitchInfo() {
        return this.showOnlyActiveFavoritesSwitchInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final FavoritesSearchWidget getSearchWidget() {
        return this.searchWidget;
    }

    @k
    public final FavoriteItemsWidgets copy(@l OrdersWidget orders, @l CategoriesWidget categories, @l ActionsWidget actions, @l CollectionInfo collection, @l Author author, @l BeduinV2 topWidget, @l ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo, @l FavoritesSearchWidget searchWidget) {
        return new FavoriteItemsWidgets(orders, categories, actions, collection, author, topWidget, showOnlyActiveFavoritesSwitchInfo, searchWidget);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteItemsWidgets)) {
            return false;
        }
        FavoriteItemsWidgets favoriteItemsWidgets = (FavoriteItemsWidgets) other;
        return L.f(this.orders, favoriteItemsWidgets.orders) && L.f(this.categories, favoriteItemsWidgets.categories) && L.f(this.actions, favoriteItemsWidgets.actions) && L.f(this.collection, favoriteItemsWidgets.collection) && L.f(this.author, favoriteItemsWidgets.author) && L.f(this.topWidget, favoriteItemsWidgets.topWidget) && L.f(this.showOnlyActiveFavoritesSwitchInfo, favoriteItemsWidgets.showOnlyActiveFavoritesSwitchInfo) && L.f(this.searchWidget, favoriteItemsWidgets.searchWidget);
    }

    @l
    public final ActionsWidget getActions() {
        return this.actions;
    }

    @l
    public final Author getAuthor() {
        return this.author;
    }

    @l
    public final CategoriesWidget getCategories() {
        return this.categories;
    }

    @l
    public final CollectionInfo getCollection() {
        return this.collection;
    }

    @l
    public final OrdersWidget getOrders() {
        return this.orders;
    }

    @l
    public final FavoritesSearchWidget getSearchWidget() {
        return this.searchWidget;
    }

    @l
    public final ShowOnlyActiveFavoritesSwitchInfo getShowOnlyActiveFavoritesSwitchInfo() {
        return this.showOnlyActiveFavoritesSwitchInfo;
    }

    @l
    public final BeduinV2 getTopWidget() {
        return this.topWidget;
    }

    public int hashCode() {
        OrdersWidget ordersWidget = this.orders;
        int iHashCode = (ordersWidget == null ? 0 : ordersWidget.hashCode()) * 31;
        CategoriesWidget categoriesWidget = this.categories;
        int iHashCode2 = (iHashCode + (categoriesWidget == null ? 0 : categoriesWidget.hashCode())) * 31;
        ActionsWidget actionsWidget = this.actions;
        int iHashCode3 = (iHashCode2 + (actionsWidget == null ? 0 : actionsWidget.hashCode())) * 31;
        CollectionInfo collectionInfo = this.collection;
        int iHashCode4 = (iHashCode3 + (collectionInfo == null ? 0 : collectionInfo.hashCode())) * 31;
        Author author = this.author;
        int iHashCode5 = (iHashCode4 + (author == null ? 0 : author.hashCode())) * 31;
        BeduinV2 beduinV2 = this.topWidget;
        int iHashCode6 = (iHashCode5 + (beduinV2 == null ? 0 : beduinV2.hashCode())) * 31;
        ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo = this.showOnlyActiveFavoritesSwitchInfo;
        int iHashCode7 = (iHashCode6 + (showOnlyActiveFavoritesSwitchInfo == null ? 0 : showOnlyActiveFavoritesSwitchInfo.hashCode())) * 31;
        FavoritesSearchWidget favoritesSearchWidget = this.searchWidget;
        return iHashCode7 + (favoritesSearchWidget != null ? favoritesSearchWidget.hashCode() : 0);
    }

    @k
    public String toString() {
        return "FavoriteItemsWidgets(orders=" + this.orders + ", categories=" + this.categories + ", actions=" + this.actions + ", collection=" + this.collection + ", author=" + this.author + ", topWidget=" + this.topWidget + ", showOnlyActiveFavoritesSwitchInfo=" + this.showOnlyActiveFavoritesSwitchInfo + ", searchWidget=" + this.searchWidget + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        OrdersWidget ordersWidget = this.orders;
        if (ordersWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ordersWidget.writeToParcel(parcel, flags);
        }
        CategoriesWidget categoriesWidget = this.categories;
        if (categoriesWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoriesWidget.writeToParcel(parcel, flags);
        }
        ActionsWidget actionsWidget = this.actions;
        if (actionsWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionsWidget.writeToParcel(parcel, flags);
        }
        CollectionInfo collectionInfo = this.collection;
        if (collectionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collectionInfo.writeToParcel(parcel, flags);
        }
        Author author = this.author;
        if (author == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            author.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.topWidget, flags);
        ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo = this.showOnlyActiveFavoritesSwitchInfo;
        if (showOnlyActiveFavoritesSwitchInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            showOnlyActiveFavoritesSwitchInfo.writeToParcel(parcel, flags);
        }
        FavoritesSearchWidget favoritesSearchWidget = this.searchWidget;
        if (favoritesSearchWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favoritesSearchWidget.writeToParcel(parcel, flags);
        }
    }
}
