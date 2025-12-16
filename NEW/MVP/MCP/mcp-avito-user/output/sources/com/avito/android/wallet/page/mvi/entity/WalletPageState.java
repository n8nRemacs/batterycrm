package com.avito.android.wallet.page.mvi.entity;

import PO0.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.wallet.page.mvi.entity.a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "ContentState", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletPageState extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f328187f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final WalletPageState f328188g = new WalletPageState(null, false, null, null, 15, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ContentState f328189b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f328190c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.wallet.page.mvi.entity.a f328191d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final b f328192e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WalletPageState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageState$ContentState;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentState {

        /* renamed from: b, reason: collision with root package name */
        public static final ContentState f328193b;

        /* renamed from: c, reason: collision with root package name */
        public static final ContentState f328194c;

        /* renamed from: d, reason: collision with root package name */
        public static final ContentState f328195d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ContentState[] f328196e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f328197f;

        static {
            ContentState contentState = new ContentState("LOADING", 0);
            f328193b = contentState;
            ContentState contentState2 = new ContentState("ERROR", 1);
            f328194c = contentState2;
            ContentState contentState3 = new ContentState("CONTENT", 2);
            f328195d = contentState3;
            ContentState[] contentStateArr = {contentState, contentState2, contentState3};
            f328196e = contentStateArr;
            f328197f = c.a(contentStateArr);
        }

        public ContentState() {
            throw null;
        }

        public static ContentState valueOf(String str) {
            return (ContentState) Enum.valueOf(ContentState.class, str);
        }

        public static ContentState[] values() {
            return (ContentState[]) f328196e.clone();
        }
    }

    /* compiled from: WalletPageState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageState$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public WalletPageState() {
        this(null, false, null, null, 15, null);
    }

    public static WalletPageState a(WalletPageState walletPageState, ContentState contentState, boolean z12, com.avito.android.wallet.page.mvi.entity.a aVar, b bVar, int i12) {
        if ((i12 & 1) != 0) {
            contentState = walletPageState.f328189b;
        }
        if ((i12 & 2) != 0) {
            z12 = walletPageState.f328190c;
        }
        if ((i12 & 4) != 0) {
            aVar = walletPageState.f328191d;
        }
        if ((i12 & 8) != 0) {
            bVar = walletPageState.f328192e;
        }
        walletPageState.getClass();
        return new WalletPageState(contentState, z12, aVar, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPageState)) {
            return false;
        }
        WalletPageState walletPageState = (WalletPageState) obj;
        return this.f328189b == walletPageState.f328189b && this.f328190c == walletPageState.f328190c && L.f(this.f328191d, walletPageState.f328191d) && L.f(this.f328192e, walletPageState.f328192e);
    }

    public final int hashCode() {
        int iHashCode = (this.f328191d.hashCode() + r.i(this.f328189b.hashCode() * 31, 31, this.f328190c)) * 31;
        b bVar = this.f328192e;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @k
    public final String toString() {
        return "WalletPageState(contentState=" + this.f328189b + ", isRefreshing=" + this.f328190c + ", viewState=" + this.f328191d + ", lastApiResponse=" + this.f328192e + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WalletPageState(ContentState contentState, boolean z12, com.avito.android.wallet.page.mvi.entity.a aVar, b bVar, int i12, C42822w c42822w) {
        contentState = (i12 & 1) != 0 ? ContentState.f328193b : contentState;
        z12 = (i12 & 2) != 0 ? false : z12;
        this(contentState, z12, (i12 & 4) != 0 ? new a.c(z12) : aVar, (i12 & 8) != 0 ? null : bVar);
    }

    public WalletPageState(@k ContentState contentState, boolean z12, @k com.avito.android.wallet.page.mvi.entity.a aVar, @l b bVar) {
        this.f328189b = contentState;
        this.f328190c = z12;
        this.f328191d = aVar;
        this.f328192e = bVar;
    }
}
