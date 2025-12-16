package com.avito.android.profile_vk_linking.request_token.mvi;

import Zc0.C19541d;
import Zc0.InterfaceC19538a;
import Zc0.InterfaceC19539b;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VkRequestTokenActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LZc0/a;", "LZc0/b;", "LZc0/d;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC19538a, InterfaceC19539b, C19541d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f231367a;

    @Inject
    public a(@Y61.k String str) {
        this.f231367a = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC19539b> b(InterfaceC19538a interfaceC19538a, C19541d c19541d) {
        Object cVar;
        Object c1442b;
        InterfaceC19538a interfaceC19538a2 = interfaceC19538a;
        if (interfaceC19538a2 instanceof InterfaceC19538a.c) {
            cVar = new InterfaceC19539b.c(this.f231367a);
        } else if (interfaceC19538a2 instanceof InterfaceC19538a.e) {
            cVar = InterfaceC19539b.e.f20301a;
        } else {
            if (interfaceC19538a2 instanceof InterfaceC19538a.d) {
                c1442b = new InterfaceC19539b.d(((InterfaceC19538a.d) interfaceC19538a2).f20294a);
            } else if (interfaceC19538a2 instanceof InterfaceC19538a.b) {
                InterfaceC19538a.b bVar = (InterfaceC19538a.b) interfaceC19538a2;
                c1442b = new InterfaceC19539b.C1442b(bVar.f20291a, bVar.f20292b);
            } else {
                if (!(interfaceC19538a2 instanceof InterfaceC19538a.C1441a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = InterfaceC19539b.a.f20296a;
            }
            cVar = c1442b;
        }
        return new C43210w(cVar);
    }
}
