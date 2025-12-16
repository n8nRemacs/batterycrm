package com.avito.android.profile_vk_linking.group_management.mvi;

import Ic0.C14059a;
import Vc0.b;
import Wc0.C15743a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: VkLinkingGroupManagementReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "LVc0/b;", "LWc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements u<Vc0.b, C15743a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231227b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f231228c;

    @Inject
    public p(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f231227b = interfaceC28373a;
        this.f231228c = e12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C15743a a(Vc0.b bVar, C15743a c15743a) {
        List<com.avito.android.profile_vk_linking.group_management.adapter.group.a> list;
        Vc0.b bVar2 = bVar;
        C15743a c15743a2 = c15743a;
        boolean z12 = true;
        if (bVar2 instanceof b.g) {
            C15743a.f17979e.getClass();
            return C15743a.a(C15743a.f17980f, true, null, null, 14);
        }
        if (bVar2 instanceof b.o) {
            b.o oVar = (b.o) bVar2;
            return new C15743a(false, null, oVar.f17308a, oVar.f17309b);
        }
        if (bVar2 instanceof b.h) {
            b.h hVar = (b.h) bVar2;
            b(hVar.f17298a);
            return C15743a.a(c15743a2, false, hVar.f17298a, null, 8);
        }
        boolean z13 = bVar2 instanceof b.l;
        C15743a.b bVar3 = c15743a2.f17983c;
        if (z13) {
            return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, null, null, true, 15) : null, 11);
        }
        if (bVar2 instanceof b.j) {
            b(((b.j) bVar2).f17300a);
            return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, null, null, false, 15) : null, 11);
        }
        if (bVar2 instanceof b.k) {
            b(((b.k) bVar2).f17301a);
            return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, null, null, false, 15) : null, 11);
        }
        if (bVar2 instanceof b.f) {
            return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, null, VkPopup.CommonButton.ActionButton.ActionType.f231017d, false, 23) : null, 11);
        }
        if (bVar2 instanceof b.d) {
            b(((b.d) bVar2).f17291a);
            return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, null, null, false, 23) : null, 11);
        }
        if (bVar2 instanceof b.e) {
            b(((b.e) bVar2).f17292a);
            return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, null, null, false, 23) : null, 11);
        }
        if (bVar2 instanceof b.n) {
            b("TokenRequestFailed");
            return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, null, null, false, 7) : null, 11);
        }
        if (!(bVar2 instanceof b.c)) {
            if (bVar2 instanceof b.i ? true : bVar2 instanceof b.C1193b ? true : bVar2 instanceof b.m ? true : bVar2 instanceof b.a) {
                return c15743a2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        if (bVar3 != null && (list = bVar3.f17987c) != null) {
            for (com.avito.android.profile_vk_linking.group_management.adapter.group.a aVar : list) {
                long j12 = aVar.f231096c;
                arrayList.add(new com.avito.android.profile_vk_linking.group_management.adapter.group.a(aVar.f231095b, j12, aVar.f231097d, aVar.f231098e, aVar.f231099f, j12 == ((b.c) bVar2).f17290a ? z12 : false, aVar.f231101h));
                z12 = true;
            }
        }
        return C15743a.a(c15743a2, false, null, bVar3 != null ? C15743a.b.a(bVar3, arrayList, null, false, 27) : null, 11);
    }

    public final void b(String str) {
        String strA = this.f231228c.a();
        if (strA == null) {
            strA = "";
        }
        this.f231227b.c(new C14059a(strA, str));
    }
}
