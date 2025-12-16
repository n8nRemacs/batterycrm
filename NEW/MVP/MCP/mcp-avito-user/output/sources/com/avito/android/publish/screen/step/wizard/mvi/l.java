package com.avito.android.publish.screen.step.wizard.mvi;

import Pe0.InterfaceC14778b;
import Pe0.InterfaceC14779c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WizardOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LPe0/b;", "LPe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements t<InterfaceC14778b, InterfaceC14779c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14779c b(InterfaceC14778b interfaceC14778b) {
        InterfaceC14779c fVar;
        InterfaceC14778b interfaceC14778b2 = interfaceC14778b;
        if (interfaceC14778b2.equals(InterfaceC14778b.c.f13196a)) {
            return InterfaceC14779c.b.f13204a;
        }
        if (interfaceC14778b2.equals(InterfaceC14778b.d.f13197a)) {
            return InterfaceC14779c.C0855c.f13205a;
        }
        if (interfaceC14778b2 instanceof InterfaceC14778b.f) {
            InterfaceC14778b.f fVar2 = (InterfaceC14778b.f) interfaceC14778b2;
            fVar = new InterfaceC14779c.e(fVar2.f13199a, fVar2.f13200b);
        } else if (interfaceC14778b2 instanceof InterfaceC14778b.e) {
            fVar = new InterfaceC14779c.d(((InterfaceC14778b.e) interfaceC14778b2).f13198a);
        } else if (interfaceC14778b2 instanceof InterfaceC14778b.C0854b) {
            fVar = new InterfaceC14779c.a();
        } else {
            if (!(interfaceC14778b2 instanceof InterfaceC14778b.h)) {
                if (interfaceC14778b2 instanceof InterfaceC14778b.i ? true : interfaceC14778b2.equals(InterfaceC14778b.g.f13201a) ? true : interfaceC14778b2 instanceof InterfaceC14778b.a) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            fVar = new InterfaceC14779c.f(((InterfaceC14778b.h) interfaceC14778b2).f13202a);
        }
        return fVar;
    }
}
