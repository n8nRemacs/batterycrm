package com.avito.android.extended_profile_map.mvi;

import AA.b;
import AA.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileMapOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_map/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LAA/b;", "LAA/c;", "<init>", "()V", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements t<AA.b, AA.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AA.c b(AA.b bVar) {
        AA.b bVar2 = bVar;
        if (bVar2 instanceof b.C0012b) {
            return c.a.f181a;
        }
        if (bVar2 instanceof b.f ? true : bVar2 instanceof b.e ? true : bVar2 instanceof b.h ? true : bVar2 instanceof b.a ? true : bVar2 instanceof b.c ? true : bVar2 instanceof b.g ? true : bVar2 instanceof b.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
