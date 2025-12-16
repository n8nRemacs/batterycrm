package com.avito.android.wallet.pin.impl.verification.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationState;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import rP0.C47583b;
import rP0.C47584c;

/* compiled from: WalletPinVerificationViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/component/B;", "", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B {

    /* compiled from: WalletPinVerificationViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[WalletPinVerificationState.ContentState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WalletPinVerificationState.ContentState contentState = WalletPinVerificationState.ContentState.f329303b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WalletPinVerificationState.ContentState contentState2 = WalletPinVerificationState.ContentState.f329303b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public B() {
    }

    @Y61.k
    public static WalletPinVerificationState a(@Y61.k WalletPinVerificationState walletPinVerificationState) {
        com.avito.android.wallet.pin.impl.verification.mvi.entity.a c10227a;
        int iOrdinal = walletPinVerificationState.f329298e.ordinal();
        if (iOrdinal == 0) {
            c10227a = a.c.f329319a;
        } else if (iOrdinal == 1) {
            c10227a = a.b.f329318a;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C47583b c47583b = walletPinVerificationState.f329295b;
            if (c47583b == null) {
                c10227a = a.b.f329318a;
            } else {
                C47584c header = c47583b.getHeader();
                String title = null;
                String title2 = header != null ? header.getTitle() : null;
                if (title2 == null) {
                    title2 = "";
                }
                String str = title2;
                rP0.d input = c47583b.getInput();
                AttributedText title3 = input != null ? input.getTitle() : null;
                rP0.d input2 = c47583b.getInput();
                AttributedText subtitle = input2 != null ? input2.getSubtitle() : null;
                int length = c47583b.getPin().getLength();
                String str2 = walletPinVerificationState.f329296c;
                int length2 = str2.length();
                int length3 = c47583b.getPin().getLength();
                int length4 = str2.length();
                boolean z12 = 1 <= length4 && length4 < length3;
                rP0.f recoverPinButton = c47583b.getRecoverPinButton();
                if (recoverPinButton != null) {
                    if (!recoverPinButton.c()) {
                        recoverPinButton = null;
                    }
                    if (recoverPinButton != null) {
                        title = recoverPinButton.getTitle();
                    }
                }
                c10227a = new a.C10227a(str, title3, subtitle, walletPinVerificationState.f329300g, length, length2, z12, title, walletPinVerificationState.getPerfTrackerParams(), walletPinVerificationState.f329302i != null && str2.length() == 0);
            }
        }
        return WalletPinVerificationState.a(walletPinVerificationState, null, null, c10227a, null, false, null, 0, null, 251);
    }
}
