package com.avito.android.profile_vk_linking.group_management.mvi;

import Vc0.InterfaceC15664a;
import Vc0.b;
import Vc0.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkLinkingGroupManagementOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "LVc0/b;", "LVc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements t<Vc0.b, Vc0.c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Vc0.c b(Vc0.b bVar) {
        Vc0.b bVar2 = bVar;
        if (bVar2 instanceof b.j) {
            return new c.e(((b.j) bVar2).f17300a);
        }
        if (bVar2 instanceof b.k) {
            b.k kVar = (b.k) bVar2;
            return new c.f(kVar.f17301a, kVar.f17302b, new InterfaceC15664a.g(kVar.f17303c, kVar.f17304d));
        }
        if (bVar2 instanceof b.d) {
            return new c.e(((b.d) bVar2).f17291a);
        }
        if (bVar2 instanceof b.e) {
            b.e eVar = (b.e) bVar2;
            return new c.f(eVar.f17292a, eVar.f17293b, new InterfaceC15664a.d(eVar.f17294c, eVar.f17295d));
        }
        if (bVar2 instanceof b.i) {
            return new c.C1194c(((b.i) bVar2).f17299a);
        }
        if (bVar2 instanceof b.C1193b) {
            b.C1193b c1193b = (b.C1193b) bVar2;
            return new c.b(c1193b.f17288a, c1193b.f17289b);
        }
        if (bVar2 instanceof b.m) {
            return c.d.f17314a;
        }
        if (bVar2 instanceof b.a) {
            return c.a.f17310a;
        }
        if (bVar2 instanceof b.g ? true : bVar2 instanceof b.o ? true : bVar2 instanceof b.h ? true : bVar2 instanceof b.l ? true : bVar2 instanceof b.f ? true : bVar2 instanceof b.n ? true : bVar2 instanceof b.c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
