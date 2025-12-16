package com.avito.android.profile.remove.confirm.mvi;

import J90.b;
import J90.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileRemoveConfirmOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/confirm/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "LJ90/b;", "LJ90/c;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements t<J90.b, J90.c> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final J90.c b(J90.b bVar) {
        J90.b bVar2 = bVar;
        if (bVar2 instanceof b.C0511b) {
            return c.C0512c.f8819a;
        }
        if (bVar2 instanceof b.e) {
            return new c.b(((b.e) bVar2).f8816a);
        }
        if (bVar2 instanceof b.a) {
            return c.a.f8817a;
        }
        if (bVar2 instanceof b.c ? true : bVar2 instanceof b.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
