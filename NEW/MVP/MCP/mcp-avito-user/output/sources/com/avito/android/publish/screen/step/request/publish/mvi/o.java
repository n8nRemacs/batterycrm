package com.avito.android.publish.screen.step.request.publish.mvi;

import Le0.InterfaceC14385b;
import Le0.InterfaceC14386c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PublishRequestOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/request/publish/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "LLe0/b;", "LLe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements t<InterfaceC14385b, InterfaceC14386c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14386c b(InterfaceC14385b interfaceC14385b) {
        InterfaceC14385b interfaceC14385b2 = interfaceC14385b;
        if (interfaceC14385b2.equals(InterfaceC14385b.c.f10054a)) {
            return InterfaceC14386c.a.f10057a;
        }
        if (interfaceC14385b2 instanceof InterfaceC14385b.a ? true : interfaceC14385b2.equals(InterfaceC14385b.C0622b.f10053a) ? true : interfaceC14385b2 instanceof InterfaceC14385b.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
