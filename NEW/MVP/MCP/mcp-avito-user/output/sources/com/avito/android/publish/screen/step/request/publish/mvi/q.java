package com.avito.android.publish.screen.step.request.publish.mvi;

import Le0.InterfaceC14385b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PublishRequestReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/request/publish/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "LLe0/b;", "LLe0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements u<InterfaceC14385b, Le0.d> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Le0.d a(InterfaceC14385b interfaceC14385b, Le0.d dVar) {
        InterfaceC14385b interfaceC14385b2 = interfaceC14385b;
        Le0.d dVar2 = dVar;
        if (interfaceC14385b2.equals(InterfaceC14385b.C0622b.f10053a)) {
            return Le0.d.a(dVar2, true, null);
        }
        if (interfaceC14385b2 instanceof InterfaceC14385b.a) {
            return Le0.d.a(dVar2, false, ((InterfaceC14385b.a) interfaceC14385b2).f10052a);
        }
        if (interfaceC14385b2 instanceof InterfaceC14385b.d) {
            InterfaceC14385b.d dVar3 = (InterfaceC14385b.d) interfaceC14385b2;
            return new Le0.d(dVar3.f10055a, dVar3.f10056b, null, false);
        }
        if (interfaceC14385b2.equals(InterfaceC14385b.c.f10054a)) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
