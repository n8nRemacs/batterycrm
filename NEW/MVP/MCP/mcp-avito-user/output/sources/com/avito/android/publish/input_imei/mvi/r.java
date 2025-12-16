package com.avito.android.publish.input_imei.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import le0.InterfaceC43741b;

/* compiled from: InputImeiOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lle0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r implements com.avito.android.arch.mvi.t<InputImeiInternalAction, InterfaceC43741b> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43741b b(InputImeiInternalAction inputImeiInternalAction) {
        InterfaceC43741b aVar;
        InputImeiInternalAction inputImeiInternalAction2 = inputImeiInternalAction;
        if (inputImeiInternalAction2 instanceof InputImeiInternalAction.SaveAndExit) {
            return InterfaceC43741b.C11792b.f413969a;
        }
        if (inputImeiInternalAction2 instanceof InputImeiInternalAction.Error) {
            aVar = new InterfaceC43741b.d(((InputImeiInternalAction.Error) inputImeiInternalAction2).f236386b);
        } else {
            if (inputImeiInternalAction2 instanceof InputImeiInternalAction.ScanImei) {
                return InterfaceC43741b.c.f413970a;
            }
            if (inputImeiInternalAction2 instanceof InputImeiInternalAction.ShowOnboarding) {
                aVar = new InterfaceC43741b.e(((InputImeiInternalAction.ShowOnboarding) inputImeiInternalAction2).f236389b);
            } else {
                if (!(inputImeiInternalAction2 instanceof InputImeiInternalAction.AddScanButton)) {
                    if (inputImeiInternalAction2 instanceof InputImeiInternalAction.ConfigureAppBar ? true : inputImeiInternalAction2 instanceof InputImeiInternalAction.UpdateImeiText) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new InterfaceC43741b.a(((InputImeiInternalAction.AddScanButton) inputImeiInternalAction2).f236384b);
            }
        }
        return aVar;
    }
}
