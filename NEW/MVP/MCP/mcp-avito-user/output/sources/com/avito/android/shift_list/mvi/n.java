package com.avito.android.shift_list.mvi;

import Vv0.b;
import Vv0.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShiftListOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/shift_list/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "LVv0/b;", "LVv0/c;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements t<Vv0.b, Vv0.c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Vv0.c b(Vv0.b bVar) {
        Vv0.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return c.a.f17492a;
        }
        if (!(bVar2 instanceof b.C1213b ? true : bVar2.equals(b.f.f17490a) ? true : bVar2.equals(b.c.f17486a))) {
            if (!(bVar2.equals(b.d.f17487a) ? true : bVar2 instanceof b.e ? true : bVar2.equals(b.g.f17491a))) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
