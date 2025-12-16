package com.avito.android.gig_motivations_list.ui.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zH.C50465d;
import zH.InterfaceC50462a;
import zH.InterfaceC50463b;

/* compiled from: MotivationsListActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_motivations_list/ui/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LzH/a;", "LzH/b;", "LzH/d;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC50462a, InterfaceC50463b, C50465d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final wH.h f160361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f160362b;

    @Inject
    public b(@Y61.k wH.h hVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f160361a = hVar;
        this.f160362b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC50463b> b(InterfaceC50462a interfaceC50462a, C50465d c50465d) {
        InterfaceC50462a interfaceC50462a2 = interfaceC50462a;
        if (interfaceC50462a2.equals(InterfaceC50462a.C12949a.f443990a)) {
            return new C43210w(InterfaceC50463b.d.f443997a);
        }
        boolean z12 = interfaceC50462a2 instanceof InterfaceC50462a.d;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f160362b;
        if (z12) {
            b.a.a(aVar, ((InterfaceC50462a.d) interfaceC50462a2).f443993a, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC50462a2.equals(InterfaceC50462a.c.f443992a)) {
            return C43175k.N(new C43210w(InterfaceC50463b.c.f443996a), C43175k.G(new a(this, null)));
        }
        if (!(interfaceC50462a2 instanceof InterfaceC50462a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        b.a.a(aVar, ((InterfaceC50462a.b) interfaceC50462a2).f443991a, null, null, 6);
        return C43175k.w();
    }
}
