package com.avito.android.publish.screen.step.select.mvi;

import Ne0.InterfaceC14567b;
import Ne0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/select/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "LNe0/b;", "LNe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements t<InterfaceC14567b, Ne0.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ne0.c b(InterfaceC14567b interfaceC14567b) {
        Ne0.c bVar;
        InterfaceC14567b interfaceC14567b2 = interfaceC14567b;
        if (interfaceC14567b2.equals(InterfaceC14567b.c.f11673a)) {
            return c.a.f11676a;
        }
        if (interfaceC14567b2 instanceof InterfaceC14567b.e) {
            bVar = new c.C0752c(((InterfaceC14567b.e) interfaceC14567b2).f11675a);
        } else {
            if (!(interfaceC14567b2 instanceof InterfaceC14567b.d)) {
                if (interfaceC14567b2 instanceof InterfaceC14567b.a ? true : interfaceC14567b2 instanceof InterfaceC14567b.C0751b) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            bVar = new c.b(((InterfaceC14567b.d) interfaceC14567b2).f11674a);
        }
        return bVar;
    }
}
