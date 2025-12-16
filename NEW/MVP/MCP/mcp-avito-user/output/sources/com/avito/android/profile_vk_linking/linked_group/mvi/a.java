package com.avito.android.profile_vk_linking.linked_group.mvi;

import Xc0.InterfaceC16989a;
import Xc0.b;
import com.avito.android.arch.mvi.a;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VkLinkedGroupActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_vk_linking/linked_group/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LXc0/a;", "LXc0/b;", "LYc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC16989a, Xc0.b, Yc0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.linked_group.c f231297a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f231298b;

    @Inject
    public a(@Y61.k com.avito.android.profile_vk_linking.linked_group.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f231297a = cVar;
        this.f231298b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Xc0.b> b(InterfaceC16989a interfaceC16989a, Yc0.b bVar) {
        C43210w c43210w;
        InterfaceC16989a interfaceC16989a2 = interfaceC16989a;
        boolean z12 = interfaceC16989a2 instanceof InterfaceC16989a.d;
        com.avito.android.profile_vk_linking.linked_group.c cVar = this.f231297a;
        if (z12) {
            return cVar.a();
        }
        if (interfaceC16989a2 instanceof InterfaceC16989a.b) {
            b.a.a(this.f231298b, ((InterfaceC16989a.b) interfaceC16989a2).f18958a, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC16989a2 instanceof InterfaceC16989a.C1339a) {
            c43210w = new C43210w(b.a.f18963a);
        } else if (interfaceC16989a2 instanceof InterfaceC16989a.e) {
            c43210w = new C43210w(b.g.f18969a);
        } else {
            if (!(interfaceC16989a2 instanceof InterfaceC16989a.c)) {
                if (interfaceC16989a2 instanceof InterfaceC16989a.f) {
                    return cVar.b();
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(b.e.f18967a);
        }
        return c43210w;
    }
}
