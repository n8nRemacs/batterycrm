package com.avito.android.wallet.history.mvi.entity;

import JO0.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.wallet.history.generated.api.get_wallet_history_v_2.HistoryItemV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletHistoryInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "InitialLoad", "InitialLoadError", "Items", "ItemsV2", "LoadMore", "OpenDetailsDeeplink", "PullRefresh", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$Error;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$InitialLoad;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$InitialLoadError;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$Items;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$ItemsV2;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$LoadMore;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$OpenDetailsDeeplink;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$PullRefresh;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WalletHistoryInternalAction extends n {

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$Error;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements WalletHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f327651b = new Error();

        private Error() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -2039141873;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$InitialLoad;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialLoad implements WalletHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitialLoad f327652b = new InitialLoad();

        private InitialLoad() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitialLoad);
        }

        public final int hashCode() {
            return 484066577;
        }

        @k
        public final String toString() {
            return "InitialLoad";
        }
    }

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$InitialLoadError;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialLoadError implements WalletHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitialLoadError f327653b = new InitialLoadError();

        private InitialLoadError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitialLoadError);
        }

        public final int hashCode() {
            return -1160962185;
        }

        @k
        public final String toString() {
            return "InitialLoadError";
        }
    }

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$Items;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Items implements WalletHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<b> f327654b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f327655c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f327656d;

        public Items(@k List<b> list, @l String str, @l String str2) {
            this.f327654b = list;
            this.f327655c = str;
            this.f327656d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Items)) {
                return false;
            }
            Items items = (Items) obj;
            return L.f(this.f327654b, items.f327654b) && L.f(this.f327655c, items.f327655c) && L.f(this.f327656d, items.f327656d);
        }

        public final int hashCode() {
            int iHashCode = this.f327654b.hashCode() * 31;
            String str = this.f327655c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f327656d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Items(items=");
            sb2.append(this.f327654b);
            sb2.append(", key=");
            sb2.append(this.f327655c);
            sb2.append(", cursor=");
            return C22026a.c(sb2, this.f327656d, ')');
        }
    }

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$ItemsV2;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemsV2 implements WalletHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<HistoryItemV2> f327657b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f327658c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f327659d;

        public ItemsV2(@k List<HistoryItemV2> list, @l String str, @l String str2) {
            this.f327657b = list;
            this.f327658c = str;
            this.f327659d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemsV2)) {
                return false;
            }
            ItemsV2 itemsV2 = (ItemsV2) obj;
            return L.f(this.f327657b, itemsV2.f327657b) && L.f(this.f327658c, itemsV2.f327658c) && L.f(this.f327659d, itemsV2.f327659d);
        }

        public final int hashCode() {
            int iHashCode = this.f327657b.hashCode() * 31;
            String str = this.f327658c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f327659d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemsV2(items=");
            sb2.append(this.f327657b);
            sb2.append(", key=");
            sb2.append(this.f327658c);
            sb2.append(", cursor=");
            return C22026a.c(sb2, this.f327659d, ')');
        }
    }

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$LoadMore;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadMore implements WalletHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadMore f327660b = new LoadMore();

        private LoadMore() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadMore);
        }

        public final int hashCode() {
            return 391276532;
        }

        @k
        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$OpenDetailsDeeplink;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDetailsDeeplink implements WalletHistoryInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDetailsDeeplink)) {
                return false;
            }
            ((OpenDetailsDeeplink) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OpenDetailsDeeplink(deeplink=null)";
        }
    }

    /* compiled from: WalletHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction$PullRefresh;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PullRefresh implements WalletHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PullRefresh f327661b = new PullRefresh();

        private PullRefresh() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PullRefresh);
        }

        public final int hashCode() {
            return -1597912163;
        }

        @k
        public final String toString() {
            return "PullRefresh";
        }
    }
}
