package com.avito.android.campaigns_sale_search.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchItemsInfoResult;
import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfoCard;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import um.e;

/* compiled from: CampaignsSaleSearchInternalAction.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u0082\u0001\u001b\u001d\u001e\u001f !\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DiscountForItemChosen", "DismissBottomsheet", "FilterSelected", "HandleDeeplink", "HideKeyboard", "InputChanged", "ItemAddedToSale", "ItemDeletedFromSale", "ItemIdsLoaded", "NavigateBack", "OpenAddItemToSaleBottomsheet", "PageError", "PageLoaded", "PageLoading", "SaveLatestQuery", "SearchHistoryLoaded", "SearchItemClicked", "SetBottomsheetValidationText", "SetNavigationState", "ShowError", "ShowKeyboard", "ShowLoading", "ShowLoadingBottomsheetButton", "ShowOnDeleteAlertDialog", "ShowPlaceholder", "ShowToast", "TrackClickStreamEvent", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$DiscountForItemChosen;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$DismissBottomsheet;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$FilterSelected;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$HandleDeeplink;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$HideKeyboard;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$InputChanged;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ItemAddedToSale;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ItemDeletedFromSale;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ItemIdsLoaded;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$NavigateBack;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$OpenAddItemToSaleBottomsheet;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$PageError;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$PageLoaded;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$PageLoading;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SaveLatestQuery;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SearchHistoryLoaded;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SearchItemClicked;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SetBottomsheetValidationText;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SetNavigationState;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowError;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowKeyboard;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowLoading;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowLoadingBottomsheetButton;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowOnDeleteAlertDialog;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowPlaceholder;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowToast;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$TrackClickStreamEvent;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CampaignsSaleSearchInternalAction extends n {

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$DiscountForItemChosen;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DiscountForItemChosen implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f114712b;

        public DiscountForItemChosen(@l Integer num) {
            this.f114712b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DiscountForItemChosen) && L.f(this.f114712b, ((DiscountForItemChosen) obj).f114712b);
        }

        public final int hashCode() {
            Integer num = this.f114712b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("DiscountForItemChosen(discount="), this.f114712b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$DismissBottomsheet;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DismissBottomsheet implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DismissBottomsheet f114713b = new DismissBottomsheet();

        private DismissBottomsheet() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$FilterSelected;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilterSelected implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Filter f114714b;

        public FilterSelected(@k Filter filter) {
            this.f114714b = filter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterSelected) && this.f114714b == ((FilterSelected) obj).f114714b;
        }

        public final int hashCode() {
            return this.f114714b.hashCode();
        }

        @k
        public final String toString() {
            return "FilterSelected(filter=" + this.f114714b + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$HandleDeeplink;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f114715b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f114715b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f114715b, ((HandleDeeplink) obj).f114715b);
        }

        public final int hashCode() {
            return this.f114715b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f114715b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$HideKeyboard;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideKeyboard implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f114716b = new HideKeyboard();

        private HideKeyboard() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$InputChanged;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChanged implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114717b;

        public InputChanged(@k String str) {
            this.f114717b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChanged) && L.f(this.f114717b, ((InputChanged) obj).f114717b);
        }

        public final int hashCode() {
            return this.f114717b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChanged(query="), this.f114717b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ItemAddedToSale;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemAddedToSale implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114718b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f114719c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final SearchBonusInfoCard f114720d;

        public ItemAddedToSale(@k String str, @k AttributedText attributedText, @l SearchBonusInfoCard searchBonusInfoCard) {
            this.f114718b = str;
            this.f114719c = attributedText;
            this.f114720d = searchBonusInfoCard;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemAddedToSale)) {
                return false;
            }
            ItemAddedToSale itemAddedToSale = (ItemAddedToSale) obj;
            return L.f(this.f114718b, itemAddedToSale.f114718b) && L.f(this.f114719c, itemAddedToSale.f114719c) && L.f(this.f114720d, itemAddedToSale.f114720d);
        }

        public final int hashCode() {
            int iB2 = a.b(this.f114718b.hashCode() * 31, 31, this.f114719c);
            SearchBonusInfoCard searchBonusInfoCard = this.f114720d;
            return iB2 + (searchBonusInfoCard == null ? 0 : searchBonusInfoCard.hashCode());
        }

        @k
        public final String toString() {
            return "ItemAddedToSale(itemId=" + this.f114718b + ", newPrice=" + this.f114719c + ", newBonusInfo=" + this.f114720d + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ItemDeletedFromSale;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemDeletedFromSale implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114721b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f114722c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final SearchBonusInfoCard f114723d;

        public ItemDeletedFromSale(@k String str, @k AttributedText attributedText, @l SearchBonusInfoCard searchBonusInfoCard) {
            this.f114721b = str;
            this.f114722c = attributedText;
            this.f114723d = searchBonusInfoCard;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemDeletedFromSale)) {
                return false;
            }
            ItemDeletedFromSale itemDeletedFromSale = (ItemDeletedFromSale) obj;
            return L.f(this.f114721b, itemDeletedFromSale.f114721b) && L.f(this.f114722c, itemDeletedFromSale.f114722c) && L.f(this.f114723d, itemDeletedFromSale.f114723d);
        }

        public final int hashCode() {
            int iB2 = a.b(this.f114721b.hashCode() * 31, 31, this.f114722c);
            SearchBonusInfoCard searchBonusInfoCard = this.f114723d;
            return iB2 + (searchBonusInfoCard == null ? 0 : searchBonusInfoCard.hashCode());
        }

        @k
        public final String toString() {
            return "ItemDeletedFromSale(itemId=" + this.f114721b + ", newPrice=" + this.f114722c + ", newBonusInfo=" + this.f114723d + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ItemIdsLoaded;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemIdsLoaded implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f114724b;

        public ItemIdsLoaded(@k List<String> list) {
            this.f114724b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemIdsLoaded) && L.f(this.f114724b, ((ItemIdsLoaded) obj).f114724b);
        }

        public final int hashCode() {
            return this.f114724b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ItemIdsLoaded(itemIds="), this.f114724b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$NavigateBack;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateBack implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f114725b = new NavigateBack();

        private NavigateBack() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$OpenAddItemToSaleBottomsheet;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAddItemToSaleBottomsheet implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.campaigns_sale_search.konveyor.search_item.a f114726b;

        public OpenAddItemToSaleBottomsheet(@k com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar) {
            this.f114726b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAddItemToSaleBottomsheet) && L.f(this.f114726b, ((OpenAddItemToSaleBottomsheet) obj).f114726b);
        }

        public final int hashCode() {
            return this.f114726b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenAddItemToSaleBottomsheet(item=" + this.f114726b + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$PageError;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageError implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PageError f114727b = new PageError();

        private PageError() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$PageLoaded;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageLoaded implements CampaignsSaleSearchInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CampaignsSaleSearchItemsInfoResult f114728b;

        /* renamed from: c, reason: collision with root package name */
        public final int f114729c;

        public PageLoaded(@k CampaignsSaleSearchItemsInfoResult campaignsSaleSearchItemsInfoResult, int i12) {
            this.f114728b = campaignsSaleSearchItemsInfoResult;
            this.f114729c = i12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageLoaded)) {
                return false;
            }
            PageLoaded pageLoaded = (PageLoaded) obj;
            return L.f(this.f114728b, pageLoaded.f114728b) && this.f114729c == pageLoaded.f114729c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f114729c) + (this.f114728b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PageLoaded(result=");
            sb2.append(this.f114728b);
            sb2.append(", page=");
            return r.t(sb2, this.f114729c, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$PageLoading;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageLoading implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PageLoading f114730b = new PageLoading();

        private PageLoading() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SaveLatestQuery;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveLatestQuery implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114731b;

        public SaveLatestQuery(@k String str) {
            this.f114731b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveLatestQuery) && L.f(this.f114731b, ((SaveLatestQuery) obj).f114731b);
        }

        public final int hashCode() {
            return this.f114731b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveLatestQuery(query="), this.f114731b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SearchHistoryLoaded;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchHistoryLoaded implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f114732b;

        public SearchHistoryLoaded(@k List<String> list) {
            this.f114732b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchHistoryLoaded) && L.f(this.f114732b, ((SearchHistoryLoaded) obj).f114732b);
        }

        public final int hashCode() {
            return this.f114732b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SearchHistoryLoaded(queries="), this.f114732b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SearchItemClicked;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchItemClicked implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114733b;

        public SearchItemClicked(@k String str) {
            this.f114733b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchItemClicked) && L.f(this.f114733b, ((SearchItemClicked) obj).f114733b);
        }

        public final int hashCode() {
            return this.f114733b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchItemClicked(name="), this.f114733b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SetBottomsheetValidationText;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetBottomsheetValidationText implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f114734b;

        public SetBottomsheetValidationText(@l String str) {
            this.f114734b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetBottomsheetValidationText) && L.f(this.f114734b, ((SetBottomsheetValidationText) obj).f114734b);
        }

        public final int hashCode() {
            String str = this.f114734b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetBottomsheetValidationText(text="), this.f114734b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$SetNavigationState;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetNavigationState implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f114735b;

        public SetNavigationState(@k e eVar) {
            this.f114735b = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetNavigationState) && L.f(this.f114735b, ((SetNavigationState) obj).f114735b);
        }

        public final int hashCode() {
            return this.f114735b.hashCode();
        }

        @k
        public final String toString() {
            return "SetNavigationState(state=" + this.f114735b + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowError;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements CampaignsSaleSearchInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f114736b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f114737c;

        public ShowError(@k ApiError apiError) {
            this.f114736b = apiError;
            this.f114737c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f114736b, ((ShowError) obj).f114736b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF291401d() {
            return this.f114737c;
        }

        public final int hashCode() {
            return this.f114736b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f114736b, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowKeyboard;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowKeyboard implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowKeyboard f114738b = new ShowKeyboard();

        private ShowKeyboard() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowLoading;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements CampaignsSaleSearchInternalAction {
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowLoadingBottomsheetButton;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoadingBottomsheetButton implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoadingBottomsheetButton f114739b = new ShowLoadingBottomsheetButton();

        private ShowLoadingBottomsheetButton() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowOnDeleteAlertDialog;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOnDeleteAlertDialog implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.campaigns_sale_search.konveyor.search_item.a f114740b;

        public ShowOnDeleteAlertDialog(@k com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar) {
            this.f114740b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowOnDeleteAlertDialog) && L.f(this.f114740b, ((ShowOnDeleteAlertDialog) obj).f114740b);
        }

        public final int hashCode() {
            return this.f114740b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnDeleteAlertDialog(item=" + this.f114740b + ')';
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowPlaceholder;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowPlaceholder implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPlaceholder f114741b = new ShowPlaceholder();

        private ShowPlaceholder() {
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$ShowToast;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f114742b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final f f114743c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f114744d;

        public ShowToast(@k PrintableText printableText, @k f fVar, @l Long l12) {
            this.f114742b = printableText;
            this.f114743c = fVar;
            this.f114744d = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return L.f(this.f114742b, showToast.f114742b) && L.f(this.f114743c, showToast.f114743c) && L.f(this.f114744d, showToast.f114744d);
        }

        public final int hashCode() {
            int iHashCode = (this.f114743c.hashCode() + (this.f114742b.hashCode() * 31)) * 31;
            Long l12 = this.f114744d;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(text=");
            sb2.append(this.f114742b);
            sb2.append(", type=");
            sb2.append(this.f114743c);
            sb2.append(", delay=");
            return m.m(sb2, this.f114744d, ')');
        }

        public /* synthetic */ ShowToast(PrintableText printableText, f fVar, Long l12, int i12, C42822w c42822w) {
            this(printableText, fVar, (i12 & 4) != 0 ? null : l12);
        }
    }

    /* compiled from: CampaignsSaleSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction$TrackClickStreamEvent;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClickStreamEvent implements CampaignsSaleSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.analytics.provider.clickstream.a f114745b;

        public TrackClickStreamEvent(@k com.avito.android.analytics.provider.clickstream.a aVar) {
            this.f114745b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackClickStreamEvent) && L.f(this.f114745b, ((TrackClickStreamEvent) obj).f114745b);
        }

        public final int hashCode() {
            return this.f114745b.hashCode();
        }

        @k
        public final String toString() {
            return "TrackClickStreamEvent(event=" + this.f114745b + ')';
        }
    }
}
