package com.avito.android.wallet.pin.impl.creation.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.a;
import hP0.C40864b;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinCreationState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "InputState", "LoadingStatus", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletPinCreationState extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f328641k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final WalletPinCreationState f328642l = new WalletPinCreationState(null, null, false, null, null, null, null, false, 0, 511, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C40864b f328643b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InputState f328644c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f328645d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f328646e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f328647f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.wallet.pin.impl.creation.mvi.entity.a f328648g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LoadingStatus f328649h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f328650i;

    /* renamed from: j, reason: collision with root package name */
    public final int f328651j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WalletPinCreationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationState$InputState;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputState {

        /* renamed from: b, reason: collision with root package name */
        public static final InputState f328652b;

        /* renamed from: c, reason: collision with root package name */
        public static final InputState f328653c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ InputState[] f328654d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f328655e;

        static {
            InputState inputState = new InputState("FIRST", 0);
            f328652b = inputState;
            InputState inputState2 = new InputState("SECOND", 1);
            f328653c = inputState2;
            InputState[] inputStateArr = {inputState, inputState2};
            f328654d = inputStateArr;
            f328655e = c.a(inputStateArr);
        }

        public InputState() {
            throw null;
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) f328654d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WalletPinCreationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationState$LoadingStatus;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingStatus f328656b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingStatus f328657c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingStatus f328658d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadingStatus f328659e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ LoadingStatus[] f328660f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f328661g;

        static {
            LoadingStatus loadingStatus = new LoadingStatus("LOADING", 0);
            f328656b = loadingStatus;
            LoadingStatus loadingStatus2 = new LoadingStatus("ERROR", 1);
            f328657c = loadingStatus2;
            LoadingStatus loadingStatus3 = new LoadingStatus("CONTENT", 2);
            f328658d = loadingStatus3;
            LoadingStatus loadingStatus4 = new LoadingStatus("WALLET_NOT_WORKING", 3);
            f328659e = loadingStatus4;
            LoadingStatus[] loadingStatusArr = {loadingStatus, loadingStatus2, loadingStatus3, loadingStatus4};
            f328660f = loadingStatusArr;
            f328661g = c.a(loadingStatusArr);
        }

        public LoadingStatus() {
            throw null;
        }

        public static LoadingStatus valueOf(String str) {
            return (LoadingStatus) Enum.valueOf(LoadingStatus.class, str);
        }

        public static LoadingStatus[] values() {
            return (LoadingStatus[]) f328660f.clone();
        }
    }

    /* compiled from: WalletPinCreationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationState$a;", "", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public WalletPinCreationState() {
        this(null, null, false, null, null, null, null, false, 0, 511, null);
    }

    public static WalletPinCreationState a(WalletPinCreationState walletPinCreationState, C40864b c40864b, InputState inputState, boolean z12, String str, String str2, com.avito.android.wallet.pin.impl.creation.mvi.entity.a aVar, LoadingStatus loadingStatus, boolean z13, int i12, int i13) {
        C40864b c40864b2 = (i13 & 1) != 0 ? walletPinCreationState.f328643b : c40864b;
        InputState inputState2 = (i13 & 2) != 0 ? walletPinCreationState.f328644c : inputState;
        boolean z14 = (i13 & 4) != 0 ? walletPinCreationState.f328645d : z12;
        String str3 = (i13 & 8) != 0 ? walletPinCreationState.f328646e : str;
        String str4 = (i13 & 16) != 0 ? walletPinCreationState.f328647f : str2;
        com.avito.android.wallet.pin.impl.creation.mvi.entity.a aVar2 = (i13 & 32) != 0 ? walletPinCreationState.f328648g : aVar;
        LoadingStatus loadingStatus2 = (i13 & 64) != 0 ? walletPinCreationState.f328649h : loadingStatus;
        boolean z15 = (i13 & 128) != 0 ? walletPinCreationState.f328650i : z13;
        int i14 = (i13 & 256) != 0 ? walletPinCreationState.f328651j : i12;
        walletPinCreationState.getClass();
        return new WalletPinCreationState(c40864b2, inputState2, z14, str3, str4, aVar2, loadingStatus2, z15, i14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPinCreationState)) {
            return false;
        }
        WalletPinCreationState walletPinCreationState = (WalletPinCreationState) obj;
        return L.f(this.f328643b, walletPinCreationState.f328643b) && this.f328644c == walletPinCreationState.f328644c && this.f328645d == walletPinCreationState.f328645d && L.f(this.f328646e, walletPinCreationState.f328646e) && L.f(this.f328647f, walletPinCreationState.f328647f) && L.f(this.f328648g, walletPinCreationState.f328648g) && this.f328649h == walletPinCreationState.f328649h && this.f328650i == walletPinCreationState.f328650i && this.f328651j == walletPinCreationState.f328651j;
    }

    public final int hashCode() {
        C40864b c40864b = this.f328643b;
        return Integer.hashCode(this.f328651j) + r.i((this.f328649h.hashCode() + ((this.f328648g.hashCode() + H.d(H.d(r.i((this.f328644c.hashCode() + ((c40864b == null ? 0 : c40864b.hashCode()) * 31)) * 31, 31, this.f328645d), 31, this.f328646e), 31, this.f328647f)) * 31)) * 31, 31, this.f328650i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPinCreationState(lastApiResponse=");
        sb2.append(this.f328643b);
        sb2.append(", inputState=");
        sb2.append(this.f328644c);
        sb2.append(", showPinsNotMatchingError=");
        sb2.append(this.f328645d);
        sb2.append(", firstInputPin=");
        sb2.append(this.f328646e);
        sb2.append(", secondInputPin=");
        sb2.append(this.f328647f);
        sb2.append(", viewState=");
        sb2.append(this.f328648g);
        sb2.append(", loadingStatus=");
        sb2.append(this.f328649h);
        sb2.append(", pinSaving=");
        sb2.append(this.f328650i);
        sb2.append(", savePinErrorsCount=");
        return r.t(sb2, this.f328651j, ')');
    }

    public /* synthetic */ WalletPinCreationState(C40864b c40864b, InputState inputState, boolean z12, String str, String str2, com.avito.android.wallet.pin.impl.creation.mvi.entity.a aVar, LoadingStatus loadingStatus, boolean z13, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : c40864b, (i13 & 2) != 0 ? InputState.f328652b : inputState, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? "" : str, (i13 & 16) == 0 ? str2 : "", (i13 & 32) != 0 ? a.c.f328670a : aVar, (i13 & 64) != 0 ? LoadingStatus.f328656b : loadingStatus, (i13 & 128) != 0 ? false : z13, (i13 & 256) == 0 ? i12 : 0);
    }

    public WalletPinCreationState(@l C40864b c40864b, @k InputState inputState, boolean z12, @k String str, @k String str2, @k com.avito.android.wallet.pin.impl.creation.mvi.entity.a aVar, @k LoadingStatus loadingStatus, boolean z13, int i12) {
        this.f328643b = c40864b;
        this.f328644c = inputState;
        this.f328645d = z12;
        this.f328646e = str;
        this.f328647f = str2;
        this.f328648g = aVar;
        this.f328649h = loadingStatus;
        this.f328650i = z13;
        this.f328651j = i12;
    }
}
