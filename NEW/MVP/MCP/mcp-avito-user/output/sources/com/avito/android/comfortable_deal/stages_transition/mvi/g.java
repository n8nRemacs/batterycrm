package com.avito.android.comfortable_deal.stages_transition.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import fq.InterfaceC40464b;
import fq.InterfaceC40465c;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StagesTransitionOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lfq/b;", "Lfq/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements t<InterfaceC40464b, InterfaceC40465c> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40465c b(InterfaceC40464b interfaceC40464b) {
        InterfaceC40464b interfaceC40464b2 = interfaceC40464b;
        if (interfaceC40464b2 instanceof InterfaceC40464b.a) {
            return new InterfaceC40465c.a(((InterfaceC40464b.a) interfaceC40464b2).f396138a);
        }
        if (interfaceC40464b2 instanceof InterfaceC40464b.C11177b) {
            return new InterfaceC40465c.b(((InterfaceC40464b.C11177b) interfaceC40464b2).f396139a);
        }
        if (interfaceC40464b2 instanceof InterfaceC40464b.c) {
            return new InterfaceC40465c.d(((InterfaceC40464b.c) interfaceC40464b2).f396140a);
        }
        if (interfaceC40464b2 instanceof InterfaceC40464b.f) {
            return new InterfaceC40465c.a(((InterfaceC40464b.f) interfaceC40464b2).f396143a);
        }
        if (!(interfaceC40464b2 instanceof InterfaceC40464b.d)) {
            return null;
        }
        String message = ((InterfaceC40464b.d) interfaceC40464b2).f396141a.getMessage();
        String str = message.length() > 0 ? message : null;
        return new InterfaceC40465c.C11178c(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.comfortable_deal_common_error, new Serializable[0]));
    }
}
