package com.avito.android.profile_vk_linking.linked_group.mvi;

import Xc0.b;
import Xc0.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkLinkedGroupOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_vk_linking/linked_group/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LXc0/b;", "LXc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<Xc0.b, Xc0.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Xc0.c b(Xc0.b bVar) {
        Xc0.c dVar;
        Xc0.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return c.a.f18976a;
        }
        if (bVar2 instanceof b.f) {
            return c.b.f18977a;
        }
        if (bVar2 instanceof b.j) {
            dVar = new c.C1341c(((b.j) bVar2).f18972a);
        } else {
            if (!(bVar2 instanceof b.k)) {
                if (bVar2 instanceof b.c ? true : bVar2 instanceof b.d ? true : bVar2 instanceof b.C1340b ? true : bVar2 instanceof b.g ? true : bVar2 instanceof b.e ? true : bVar2 instanceof b.h ? true : bVar2 instanceof b.i ? true : bVar2 instanceof b.l) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            b.k kVar = (b.k) bVar2;
            dVar = new c.d(kVar.f18973a, kVar.f18974b);
        }
        return dVar;
    }
}
