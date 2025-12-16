package com.avito.android.profile_vk_linking.group_management.mvi;

import Vc0.InterfaceC15664a;
import Vc0.b;
import Wc0.C15743a;
import com.avito.android.arch.mvi.a;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VkLinkingGroupManagementActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LVc0/a;", "LVc0/b;", "LWc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC15664a, Vc0.b, C15743a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.group_management.b f231205a;

    @Inject
    public e(@Y61.k com.avito.android.profile_vk_linking.group_management.b bVar) {
        this.f231205a = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Vc0.b> b(InterfaceC15664a interfaceC15664a, C15743a c15743a) {
        InterfaceC43160i<Vc0.b> interfaceC43160iC;
        List<com.avito.android.profile_vk_linking.group_management.adapter.group.a> list;
        Object next;
        InterfaceC15664a interfaceC15664a2 = interfaceC15664a;
        C15743a c15743a2 = c15743a;
        boolean z12 = interfaceC15664a2 instanceof InterfaceC15664a.f;
        com.avito.android.profile_vk_linking.group_management.b bVar = this.f231205a;
        if (z12) {
            return bVar.e();
        }
        if (interfaceC15664a2 instanceof InterfaceC15664a.b) {
            return new C43210w(new b.C1193b(((InterfaceC15664a.b) interfaceC15664a2).f17277a, "vk_group_management_req_key"));
        }
        if (interfaceC15664a2 instanceof InterfaceC15664a.e) {
            VkPopup vkPopup = c15743a2.f17984d;
            return vkPopup != null ? new C43210w(new b.i(vkPopup)) : C43175k.w();
        }
        if (interfaceC15664a2 instanceof InterfaceC15664a.C1192a) {
            return new C43210w(b.a.f17287a);
        }
        if (interfaceC15664a2 instanceof InterfaceC15664a.g) {
            InterfaceC15664a.g gVar = (InterfaceC15664a.g) interfaceC15664a2;
            return bVar.b(gVar.f17283a, gVar.f17284b);
        }
        if (!(interfaceC15664a2 instanceof InterfaceC15664a.h)) {
            if (interfaceC15664a2 instanceof InterfaceC15664a.d) {
                InterfaceC15664a.d dVar = (InterfaceC15664a.d) interfaceC15664a2;
                return bVar.d(dVar.f17279a, dVar.f17280b);
            }
            if (interfaceC15664a2 instanceof InterfaceC15664a.i) {
                return C43175k.w();
            }
            if (interfaceC15664a2 instanceof InterfaceC15664a.c) {
                return new C43210w(new b.c(((InterfaceC15664a.c) interfaceC15664a2).f17278a));
            }
            throw new NoWhenBranchMatchedException();
        }
        C15743a.b bVar2 = c15743a2.f17983c;
        Long lValueOf = null;
        if (bVar2 != null && (list = bVar2.f17987c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((com.avito.android.profile_vk_linking.group_management.adapter.group.a) next).f231100g) {
                    break;
                }
            }
            com.avito.android.profile_vk_linking.group_management.adapter.group.a aVar = (com.avito.android.profile_vk_linking.group_management.adapter.group.a) next;
            if (aVar != null) {
                lValueOf = Long.valueOf(aVar.f231096c);
            }
        }
        return (lValueOf == null || (interfaceC43160iC = bVar.c(lValueOf.longValue())) == null) ? C43175k.w() : interfaceC43160iC;
    }
}
