package com.avito.android.extended_profile_adverts.mvi;

import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import pA.b;

/* compiled from: ProfileAdvertsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_adverts/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "LpA/b;", "LpA/c;", "<init>", "()V", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements t<pA.b, pA.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final pA.c b(pA.b bVar) {
        pA.b bVar2 = bVar;
        if (bVar2 instanceof b.a ? true : bVar2 instanceof b.C12256b ? true : bVar2 instanceof b.c ? true : bVar2 instanceof b.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
