package com.avito.android.publish.screen.step.suggest.category.mvi;

import Oe0.InterfaceC14679b;
import Oe0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuggestCategoryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "LOe0/b;", "LOe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements t<InterfaceC14679b, Oe0.c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Oe0.c b(InterfaceC14679b interfaceC14679b) {
        InterfaceC14679b interfaceC14679b2 = interfaceC14679b;
        if (interfaceC14679b2 instanceof InterfaceC14679b.a) {
            return new c.a(((InterfaceC14679b.a) interfaceC14679b2).f12455a);
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.C0798b) {
            return new c.b(((InterfaceC14679b.C0798b) interfaceC14679b2).f12456a);
        }
        if (interfaceC14679b2.equals(InterfaceC14679b.c.f12457a)) {
            return c.C0799c.f12467a;
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.d) {
            return new c.d(((InterfaceC14679b.d) interfaceC14679b2).f12458a);
        }
        if (interfaceC14679b2.equals(InterfaceC14679b.e.f12459a)) {
            return c.e.f12469a;
        }
        if (interfaceC14679b2 instanceof InterfaceC14679b.i) {
            return new c.f(((InterfaceC14679b.i) interfaceC14679b2).f12464a);
        }
        if (interfaceC14679b2.equals(InterfaceC14679b.h.f12463a) ? true : interfaceC14679b2 instanceof InterfaceC14679b.g ? true : interfaceC14679b2 instanceof InterfaceC14679b.f) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
