package com.avito.android.wallet.history.mvi.entity;

import GO0.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.wallet.history.mvi.entity.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WalletHistoryState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "InitialLoadState", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletHistoryState extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f327662i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final WalletHistoryState f327663j = new WalletHistoryState(C42784z0.f406748b, null, InitialLoadState.f327671b, null, true, true, false, 8, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<b> f327664b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f327665c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InitialLoadState f327666d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.wallet.history.mvi.entity.a f327667e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f327668f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f327669g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f327670h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WalletHistoryState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryState$InitialLoadState;", "", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitialLoadState {

        /* renamed from: b, reason: collision with root package name */
        public static final InitialLoadState f327671b;

        /* renamed from: c, reason: collision with root package name */
        public static final InitialLoadState f327672c;

        /* renamed from: d, reason: collision with root package name */
        public static final InitialLoadState f327673d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ InitialLoadState[] f327674e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f327675f;

        static {
            InitialLoadState initialLoadState = new InitialLoadState("Loading", 0);
            f327671b = initialLoadState;
            InitialLoadState initialLoadState2 = new InitialLoadState("Error", 1);
            f327672c = initialLoadState2;
            InitialLoadState initialLoadState3 = new InitialLoadState("Loaded", 2);
            f327673d = initialLoadState3;
            InitialLoadState[] initialLoadStateArr = {initialLoadState, initialLoadState2, initialLoadState3};
            f327674e = initialLoadStateArr;
            f327675f = c.a(initialLoadStateArr);
        }

        public InitialLoadState() {
            throw null;
        }

        public static InitialLoadState valueOf(String str) {
            return (InitialLoadState) Enum.valueOf(InitialLoadState.class, str);
        }

        public static InitialLoadState[] values() {
            return (InitialLoadState[]) f327674e.clone();
        }
    }

    /* compiled from: WalletHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryState$a;", "", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ WalletHistoryState(List list, String str, InitialLoadState initialLoadState, com.avito.android.wallet.history.mvi.entity.a aVar, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(list, str, initialLoadState, (i12 & 8) != 0 ? a.c.f327681a : aVar, z12, z13, z14);
    }

    public static WalletHistoryState a(WalletHistoryState walletHistoryState, List list, String str, InitialLoadState initialLoadState, com.avito.android.wallet.history.mvi.entity.a aVar, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            list = walletHistoryState.f327664b;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            str = walletHistoryState.f327665c;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            initialLoadState = walletHistoryState.f327666d;
        }
        InitialLoadState initialLoadState2 = initialLoadState;
        if ((i12 & 8) != 0) {
            aVar = walletHistoryState.f327667e;
        }
        com.avito.android.wallet.history.mvi.entity.a aVar2 = aVar;
        boolean z14 = walletHistoryState.f327668f;
        if ((i12 & 32) != 0) {
            z12 = walletHistoryState.f327669g;
        }
        boolean z15 = z12;
        if ((i12 & 64) != 0) {
            z13 = walletHistoryState.f327670h;
        }
        walletHistoryState.getClass();
        return new WalletHistoryState(list2, str2, initialLoadState2, aVar2, z14, z15, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletHistoryState)) {
            return false;
        }
        WalletHistoryState walletHistoryState = (WalletHistoryState) obj;
        return L.f(this.f327664b, walletHistoryState.f327664b) && L.f(this.f327665c, walletHistoryState.f327665c) && this.f327666d == walletHistoryState.f327666d && L.f(this.f327667e, walletHistoryState.f327667e) && this.f327668f == walletHistoryState.f327668f && this.f327669g == walletHistoryState.f327669g && this.f327670h == walletHistoryState.f327670h;
    }

    public final int hashCode() {
        int iHashCode = this.f327664b.hashCode() * 31;
        String str = this.f327665c;
        return Boolean.hashCode(this.f327670h) + r.i(r.i((this.f327667e.hashCode() + ((this.f327666d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f327668f), 31, this.f327669g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletHistoryState(items=");
        sb2.append(this.f327664b);
        sb2.append(", cursor=");
        sb2.append(this.f327665c);
        sb2.append(", initialLoadState=");
        sb2.append(this.f327666d);
        sb2.append(", viewState=");
        sb2.append(this.f327667e);
        sb2.append(", hasMore=");
        sb2.append(this.f327668f);
        sb2.append(", isLoading=");
        sb2.append(this.f327669g);
        sb2.append(", isRefreshing=");
        return r.x(sb2, this.f327670h, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WalletHistoryState(@k List<? extends b> list, @l String str, @k InitialLoadState initialLoadState, @k com.avito.android.wallet.history.mvi.entity.a aVar, boolean z12, boolean z13, boolean z14) {
        this.f327664b = list;
        this.f327665c = str;
        this.f327666d = initialLoadState;
        this.f327667e = aVar;
        this.f327668f = z12;
        this.f327669g = z13;
        this.f327670h = z14;
    }
}
