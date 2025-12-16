package com.avito.android.profile.host.mvi;

import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import q90.b;
import q90.d;

/* compiled from: UserProfileHostReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/host/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lq90/b;", "Lq90/d;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<q90.b, q90.d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final q90.d a(q90.b bVar, q90.d dVar) {
        q90.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof b.c;
        int i12 = dVar.f429067c;
        if (z12) {
            return new q90.d(false, d.b.a.C12309b.f429069a, i12 + 1);
        }
        if (bVar2 instanceof b.C12307b) {
            return new q90.d(false, d.b.a.C12308a.f429068a, i12 + 1);
        }
        if (bVar2 instanceof b.d) {
            return new q90.d(false, d.b.C12310b.f429070a, i12 + 1);
        }
        throw new NoWhenBranchMatchedException();
    }
}
