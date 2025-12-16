package com.avito.android.wallet.pin.impl.settings.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.a;
import javax.inject.Inject;
import kP0.C42616b;
import kP0.C42617c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import nP0.C44314a;
import nP0.C44317d;
import nP0.C44319f;
import nP0.C44320g;

/* compiled from: WalletSecuritySettingsViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/component/t;", "", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t {

    /* compiled from: WalletSecuritySettingsViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[WalletSecuritySettingsState.ContentState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WalletSecuritySettingsState.ContentState contentState = WalletSecuritySettingsState.ContentState.f328866b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WalletSecuritySettingsState.ContentState contentState2 = WalletSecuritySettingsState.ContentState.f328866b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public t() {
    }

    @Y61.k
    public static WalletSecuritySettingsState a(@Y61.k WalletSecuritySettingsState walletSecuritySettingsState) {
        com.avito.android.wallet.pin.impl.settings.mvi.entity.a c10210a;
        C44314a biometry;
        C44314a biometry2;
        int iOrdinal = walletSecuritySettingsState.f328863c.ordinal();
        if (iOrdinal == 0) {
            c10210a = a.c.f328874a;
        } else if (iOrdinal == 1) {
            c10210a = a.b.f328873a;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C44317d c44317d = walletSecuritySettingsState.f328862b;
            if (c44317d == null || c44317d.d()) {
                c10210a = a.b.f328873a;
            } else {
                C44319f headerDto = c44317d.getHeaderDto();
                String description = null;
                String title = headerDto != null ? headerDto.getTitle() : null;
                if (title == null) {
                    title = "";
                }
                C44320g loginSection = c44317d.getLoginSection();
                String title2 = loginSection != null ? loginSection.getTitle() : null;
                if (title2 == null) {
                    title2 = "";
                }
                C44320g loginSection2 = c44317d.getLoginSection();
                String title3 = (loginSection2 == null || (biometry2 = loginSection2.getBiometry()) == null) ? null : biometry2.getTitle();
                if (title3 == null) {
                    title3 = "";
                }
                C44320g loginSection3 = c44317d.getLoginSection();
                if (loginSection3 != null && (biometry = loginSection3.getBiometry()) != null) {
                    description = biometry.getDescription();
                }
                c10210a = new a.C10210a(title, new C42617c(title2, new C42616b(title3, description != null ? description : "", walletSecuritySettingsState.f328865e)));
            }
        }
        return WalletSecuritySettingsState.a(walletSecuritySettingsState, null, null, c10210a, false, 11);
    }
}
