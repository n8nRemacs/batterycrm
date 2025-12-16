package com.avito.android.publish.input_imei.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import le0.C43742c;

/* compiled from: InputImeiReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/t;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lle0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t implements com.avito.android.arch.mvi.u<InputImeiInternalAction, C43742c> {
    @Inject
    public t() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C43742c a(InputImeiInternalAction inputImeiInternalAction, C43742c c43742c) {
        InputImeiInternalAction inputImeiInternalAction2 = inputImeiInternalAction;
        C43742c c43742c2 = c43742c;
        if (inputImeiInternalAction2 instanceof InputImeiInternalAction.UpdateImeiText) {
            String str = ((InputImeiInternalAction.UpdateImeiText) inputImeiInternalAction2).f236390b;
            Boolean bool = c43742c2.f413976c;
            c43742c2.getClass();
            return new C43742c(str, bool);
        }
        if (!(inputImeiInternalAction2 instanceof InputImeiInternalAction.ConfigureAppBar)) {
            if (inputImeiInternalAction2 instanceof InputImeiInternalAction.AddScanButton ? true : inputImeiInternalAction2 instanceof InputImeiInternalAction.SaveAndExit ? true : inputImeiInternalAction2 instanceof InputImeiInternalAction.ScanImei ? true : inputImeiInternalAction2 instanceof InputImeiInternalAction.Error ? true : inputImeiInternalAction2 instanceof InputImeiInternalAction.ShowOnboarding) {
                return c43742c2;
            }
            throw new NoWhenBranchMatchedException();
        }
        Boolean bool2 = ((InputImeiInternalAction.ConfigureAppBar) inputImeiInternalAction2).f236385b;
        String str2 = c43742c2.f413975b;
        C43742c.a aVar = C43742c.f413973d;
        c43742c2.getClass();
        return new C43742c(str2, bool2);
    }
}
