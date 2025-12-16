package com.avito.android.publish.screen.step.request.steps.mvi;

import Me0.C14479d;
import Me0.InterfaceC14477b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StepsRequestReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "LMe0/b;", "LMe0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements u<InterfaceC14477b, C14479d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C14479d a(InterfaceC14477b interfaceC14477b, C14479d c14479d) {
        InterfaceC14477b interfaceC14477b2 = interfaceC14477b;
        C14479d c14479d2 = c14479d;
        if (interfaceC14477b2.equals(InterfaceC14477b.C0694b.f10973a)) {
            return new C14479d(true, c14479d2.f10977b);
        }
        if (interfaceC14477b2 instanceof InterfaceC14477b.a) {
            return new C14479d(false, ((InterfaceC14477b.a) interfaceC14477b2).f10972a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
