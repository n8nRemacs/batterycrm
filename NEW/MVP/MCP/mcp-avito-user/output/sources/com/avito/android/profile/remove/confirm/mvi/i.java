package com.avito.android.profile.remove.confirm.mvi;

import J90.b;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileRemoveConfirmReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/confirm/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "LJ90/b;", "LJ90/d;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements u<J90.b, J90.d> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final J90.d a(J90.b bVar, J90.d dVar) {
        J90.b bVar2 = bVar;
        J90.d dVar2 = dVar;
        if (bVar2 instanceof b.c) {
            return new J90.d(true, null);
        }
        if (bVar2 instanceof b.d) {
            return new J90.d(false, ((b.d) bVar2).f8815a);
        }
        if (bVar2 instanceof b.C0511b ? true : bVar2 instanceof b.e ? true : bVar2 instanceof b.a) {
            return new J90.d(false, dVar2.f8823b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
