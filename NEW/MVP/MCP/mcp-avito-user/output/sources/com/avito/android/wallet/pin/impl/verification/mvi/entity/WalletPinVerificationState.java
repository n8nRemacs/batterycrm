package com.avito.android.wallet.pin.impl.verification.mvi.entity;

import CP0.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import rP0.C47583b;

/* compiled from: WalletPinVerificationState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "ContentState", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletPinVerificationState extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f329293j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final WalletPinVerificationState f329294k = new WalletPinVerificationState(null, null, null, null, false, null, 0, null, 255, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C47583b f329295b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f329296c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.wallet.pin.impl.verification.mvi.entity.a f329297d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ContentState f329298e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f329299f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f329300g;

    /* renamed from: h, reason: collision with root package name */
    public final int f329301h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final d f329302i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WalletPinVerificationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationState$ContentState;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentState {

        /* renamed from: b, reason: collision with root package name */
        public static final ContentState f329303b;

        /* renamed from: c, reason: collision with root package name */
        public static final ContentState f329304c;

        /* renamed from: d, reason: collision with root package name */
        public static final ContentState f329305d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ContentState[] f329306e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f329307f;

        static {
            ContentState contentState = new ContentState("LOADING", 0);
            f329303b = contentState;
            ContentState contentState2 = new ContentState("ERROR", 1);
            f329304c = contentState2;
            ContentState contentState3 = new ContentState("CONTENT", 2);
            f329305d = contentState3;
            ContentState[] contentStateArr = {contentState, contentState2, contentState3};
            f329306e = contentStateArr;
            f329307f = c.a(contentStateArr);
        }

        public ContentState() {
            throw null;
        }

        public static ContentState valueOf(String str) {
            return (ContentState) Enum.valueOf(ContentState.class, str);
        }

        public static ContentState[] values() {
            return (ContentState[]) f329306e.clone();
        }
    }

    /* compiled from: WalletPinVerificationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationState$a;", "", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public WalletPinVerificationState() {
        this(null, null, null, null, false, null, 0, null, 255, null);
    }

    public static WalletPinVerificationState a(WalletPinVerificationState walletPinVerificationState, C47583b c47583b, String str, com.avito.android.wallet.pin.impl.verification.mvi.entity.a aVar, ContentState contentState, boolean z12, AttributedText attributedText, int i12, d dVar, int i13) {
        C47583b c47583b2 = (i13 & 1) != 0 ? walletPinVerificationState.f329295b : c47583b;
        String str2 = (i13 & 2) != 0 ? walletPinVerificationState.f329296c : str;
        com.avito.android.wallet.pin.impl.verification.mvi.entity.a aVar2 = (i13 & 4) != 0 ? walletPinVerificationState.f329297d : aVar;
        ContentState contentState2 = (i13 & 8) != 0 ? walletPinVerificationState.f329298e : contentState;
        boolean z13 = (i13 & 16) != 0 ? walletPinVerificationState.f329299f : z12;
        AttributedText attributedText2 = (i13 & 32) != 0 ? walletPinVerificationState.f329300g : attributedText;
        int i14 = (i13 & 64) != 0 ? walletPinVerificationState.f329301h : i12;
        d dVar2 = (i13 & 128) != 0 ? walletPinVerificationState.f329302i : dVar;
        walletPinVerificationState.getClass();
        return new WalletPinVerificationState(c47583b2, str2, aVar2, contentState2, z13, attributedText2, i14, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPinVerificationState)) {
            return false;
        }
        WalletPinVerificationState walletPinVerificationState = (WalletPinVerificationState) obj;
        return L.f(this.f329295b, walletPinVerificationState.f329295b) && L.f(this.f329296c, walletPinVerificationState.f329296c) && L.f(this.f329297d, walletPinVerificationState.f329297d) && this.f329298e == walletPinVerificationState.f329298e && this.f329299f == walletPinVerificationState.f329299f && L.f(this.f329300g, walletPinVerificationState.f329300g) && this.f329301h == walletPinVerificationState.f329301h && L.f(this.f329302i, walletPinVerificationState.f329302i);
    }

    public final int hashCode() {
        C47583b c47583b = this.f329295b;
        int i12 = r.i((this.f329298e.hashCode() + ((this.f329297d.hashCode() + H.d((c47583b == null ? 0 : c47583b.hashCode()) * 31, 31, this.f329296c)) * 31)) * 31, 31, this.f329299f);
        AttributedText attributedText = this.f329300g;
        int iE2 = r.e(this.f329301h, (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31);
        d dVar = this.f329302i;
        return iE2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "WalletPinVerificationState(lastApiResponse=" + this.f329295b + ", enteredPin=" + this.f329296c + ", viewState=" + this.f329297d + ", contentState=" + this.f329298e + ", pinVerifying=" + this.f329299f + ", incorrectPinErrorMessage=" + this.f329300g + ", currentAttempt=" + this.f329301h + ", walletPinCipher=" + this.f329302i + ')';
    }

    public /* synthetic */ WalletPinVerificationState(C47583b c47583b, String str, com.avito.android.wallet.pin.impl.verification.mvi.entity.a aVar, ContentState contentState, boolean z12, AttributedText attributedText, int i12, d dVar, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : c47583b, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? a.c.f329319a : aVar, (i13 & 8) != 0 ? ContentState.f329303b : contentState, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? null : attributedText, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) == 0 ? dVar : null);
    }

    public WalletPinVerificationState(@l C47583b c47583b, @k String str, @k com.avito.android.wallet.pin.impl.verification.mvi.entity.a aVar, @k ContentState contentState, boolean z12, @l AttributedText attributedText, int i12, @l d dVar) {
        this.f329295b = c47583b;
        this.f329296c = str;
        this.f329297d = aVar;
        this.f329298e = contentState;
        this.f329299f = z12;
        this.f329300g = attributedText;
        this.f329301h = i12;
        this.f329302i = dVar;
    }
}
