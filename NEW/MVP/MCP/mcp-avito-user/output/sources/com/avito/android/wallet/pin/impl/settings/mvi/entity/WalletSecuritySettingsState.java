package com.avito.android.wallet.pin.impl.settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import nP0.C44317d;

/* compiled from: WalletSecuritySettingsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "ContentState", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletSecuritySettingsState extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f328860f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final WalletSecuritySettingsState f328861g = new WalletSecuritySettingsState(null, ContentState.f328866b, a.c.f328874a, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C44317d f328862b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ContentState f328863c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.wallet.pin.impl.settings.mvi.entity.a f328864d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f328865e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WalletSecuritySettingsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsState$ContentState;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentState {

        /* renamed from: b, reason: collision with root package name */
        public static final ContentState f328866b;

        /* renamed from: c, reason: collision with root package name */
        public static final ContentState f328867c;

        /* renamed from: d, reason: collision with root package name */
        public static final ContentState f328868d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ContentState[] f328869e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f328870f;

        static {
            ContentState contentState = new ContentState("LOADING", 0);
            f328866b = contentState;
            ContentState contentState2 = new ContentState("ERROR", 1);
            f328867c = contentState2;
            ContentState contentState3 = new ContentState("CONTENT", 2);
            f328868d = contentState3;
            ContentState[] contentStateArr = {contentState, contentState2, contentState3};
            f328869e = contentStateArr;
            f328870f = c.a(contentStateArr);
        }

        public ContentState() {
            throw null;
        }

        public static ContentState valueOf(String str) {
            return (ContentState) Enum.valueOf(ContentState.class, str);
        }

        public static ContentState[] values() {
            return (ContentState[]) f328869e.clone();
        }
    }

    /* compiled from: WalletSecuritySettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsState$a;", "", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public WalletSecuritySettingsState(@l C44317d c44317d, @k ContentState contentState, @k com.avito.android.wallet.pin.impl.settings.mvi.entity.a aVar, boolean z12) {
        this.f328862b = c44317d;
        this.f328863c = contentState;
        this.f328864d = aVar;
        this.f328865e = z12;
    }

    public static WalletSecuritySettingsState a(WalletSecuritySettingsState walletSecuritySettingsState, C44317d c44317d, ContentState contentState, com.avito.android.wallet.pin.impl.settings.mvi.entity.a aVar, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            c44317d = walletSecuritySettingsState.f328862b;
        }
        if ((i12 & 2) != 0) {
            contentState = walletSecuritySettingsState.f328863c;
        }
        if ((i12 & 4) != 0) {
            aVar = walletSecuritySettingsState.f328864d;
        }
        if ((i12 & 8) != 0) {
            z12 = walletSecuritySettingsState.f328865e;
        }
        walletSecuritySettingsState.getClass();
        return new WalletSecuritySettingsState(c44317d, contentState, aVar, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSecuritySettingsState)) {
            return false;
        }
        WalletSecuritySettingsState walletSecuritySettingsState = (WalletSecuritySettingsState) obj;
        return L.f(this.f328862b, walletSecuritySettingsState.f328862b) && this.f328863c == walletSecuritySettingsState.f328863c && L.f(this.f328864d, walletSecuritySettingsState.f328864d) && this.f328865e == walletSecuritySettingsState.f328865e;
    }

    public final int hashCode() {
        C44317d c44317d = this.f328862b;
        return Boolean.hashCode(this.f328865e) + ((this.f328864d.hashCode() + ((this.f328863c.hashCode() + ((c44317d == null ? 0 : c44317d.hashCode()) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletSecuritySettingsState(lastApiResponse=");
        sb2.append(this.f328862b);
        sb2.append(", contentState=");
        sb2.append(this.f328863c);
        sb2.append(", viewState=");
        sb2.append(this.f328864d);
        sb2.append(", biometryEnabled=");
        return r.x(sb2, this.f328865e, ')');
    }
}
