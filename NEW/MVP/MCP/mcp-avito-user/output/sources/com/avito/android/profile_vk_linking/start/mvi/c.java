package com.avito.android.profile_vk_linking.start.mvi;

import ad0.InterfaceC19870a;
import ad0.InterfaceC19871b;
import bd0.C25633b;
import com.avito.android.arch.mvi.a;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VkLinkingStartActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_vk_linking/start/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lad0/a;", "Lad0/b;", "Lbd0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC19870a, InterfaceC19871b, C25633b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.start.b f231451a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f231452b;

    @Inject
    public c(@Y61.k com.avito.android.profile_vk_linking.start.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f231451a = bVar;
        this.f231452b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC19871b> b(InterfaceC19870a interfaceC19870a, C25633b c25633b) {
        InterfaceC19870a interfaceC19870a2 = interfaceC19870a;
        boolean z12 = interfaceC19870a2 instanceof InterfaceC19870a.c;
        com.avito.android.profile_vk_linking.start.b bVar = this.f231451a;
        if (z12) {
            return bVar.a();
        }
        if (interfaceC19870a2 instanceof InterfaceC19870a.d) {
            InterfaceC19870a.d dVar = (InterfaceC19870a.d) interfaceC19870a2;
            return bVar.b(dVar.f21086a, dVar.f21087b);
        }
        if (interfaceC19870a2 instanceof InterfaceC19870a.b) {
            b.a.a(this.f231452b, ((InterfaceC19870a.b) interfaceC19870a2).f21084a, "vk_linking_start_req_key", null, 4);
            return C43175k.w();
        }
        if (interfaceC19870a2 instanceof InterfaceC19870a.C1500a) {
            return new C43210w(InterfaceC19871b.a.f21088a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
