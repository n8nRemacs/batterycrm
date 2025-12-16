package com.avito.android.cart_bundles.feature;

import Om.InterfaceC14709a;
import Om.e;
import com.avito.android.arch.mvi.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CartBundlesActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_bundles/feature/b;", "Lcom/avito/android/arch/mvi/a;", "LOm/a;", "LOm/b;", "LOm/d;", "_avito_cart-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC14709a, Om.b, Om.d> {
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Om.b> b(InterfaceC14709a interfaceC14709a, Om.d dVar) {
        InterfaceC14709a interfaceC14709a2 = interfaceC14709a;
        if (interfaceC14709a2 instanceof InterfaceC14709a.b) {
            InterfaceC14709a.b bVar = (InterfaceC14709a.b) interfaceC14709a2;
            return new C43210w(new e.a(bVar.f12505a, bVar.f12506b, null));
        }
        if (interfaceC14709a2 instanceof InterfaceC14709a.c) {
            return new C43210w(new e.c());
        }
        if (interfaceC14709a2 instanceof InterfaceC14709a.C0805a) {
            return C43175k.G(new a(this, interfaceC14709a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
