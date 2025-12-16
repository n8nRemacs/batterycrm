package com.avito.android.profile_vk_linking.linked_group.mvi;

import Ic0.C14059a;
import Xc0.b;
import Yc0.b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkLinkedGroupReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/linked_group/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LXc0/b;", "LYc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<Xc0.b, Yc0.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231312b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f231313c;

    @Inject
    public j(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f231312b = interfaceC28373a;
        this.f231313c = e12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Yc0.b a(Xc0.b bVar, Yc0.b bVar2) {
        Xc0.b bVar3 = bVar;
        Yc0.b bVar4 = bVar2;
        if (bVar3 instanceof b.d) {
            return Yc0.b.a(bVar4, true, null, null, false, false, null, 56);
        }
        if (bVar3 instanceof b.C1340b) {
            return Yc0.b.a(bVar4, false, ((b.C1340b) bVar3).f18964a, null, false, false, null, 56);
        }
        if (bVar3 instanceof b.c) {
            b.c cVar = (b.c) bVar3;
            b(cVar.f18965a);
            return Yc0.b.a(bVar4, false, null, cVar.f18965a, false, false, null, 56);
        }
        if (bVar3 instanceof b.g) {
            return Yc0.b.a(bVar4, false, null, null, false, true, null, 47);
        }
        if (bVar3 instanceof b.e) {
            return Yc0.b.a(bVar4, false, null, null, false, false, null, 47);
        }
        if (bVar3 instanceof b.l) {
            return Yc0.b.a(bVar4, false, null, null, true, false, null, 55);
        }
        if (bVar3 instanceof b.h) {
            b.h hVar = (b.h) bVar3;
            return Yc0.b.a(bVar4, false, null, null, false, false, new b.C1399b(hVar.f18970a, hVar.f18971b), 23);
        }
        if (bVar3 instanceof b.j) {
            b(((b.j) bVar3).f18972a);
            return Yc0.b.a(bVar4, false, null, null, false, false, null, 39);
        }
        if (bVar3 instanceof b.k) {
            b(((b.k) bVar3).f18973a);
            return Yc0.b.a(bVar4, false, null, null, false, false, null, 39);
        }
        if (bVar3 instanceof b.i ? true : bVar3 instanceof b.a ? true : bVar3 instanceof b.f) {
            return bVar4;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(String str) {
        String strA = this.f231313c.a();
        if (strA == null) {
            strA = "";
        }
        this.f231312b.c(new C14059a(strA, str));
    }
}
