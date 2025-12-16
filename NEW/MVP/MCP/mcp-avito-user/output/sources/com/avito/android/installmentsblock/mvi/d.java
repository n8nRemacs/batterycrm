package com.avito.android.installmentsblock.mvi;

import aO.InterfaceC19796b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import dO.InterfaceC39605a;
import dO.InterfaceC39606b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InstallmentsBlockActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/installmentsblock/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LdO/a;", "LdO/b;", "LdO/d;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC39605a, InterfaceC39606b, dO.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final InterfaceC19796b f172990a;

    @Inject
    public d(@Y61.l InterfaceC19796b interfaceC19796b) {
        this.f172990a = interfaceC19796b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC39606b> b(InterfaceC39605a interfaceC39605a, dO.d dVar) {
        InterfaceC39605a interfaceC39605a2 = interfaceC39605a;
        if (interfaceC39605a2 instanceof InterfaceC39605a.b) {
            return new C43210w(new InterfaceC39606b.c(((InterfaceC39605a.b) interfaceC39605a2).f393837a));
        }
        if (interfaceC39605a2 instanceof InterfaceC39605a.d) {
            return C43175k.G(new a(interfaceC39605a2, this, null));
        }
        if (interfaceC39605a2 instanceof InterfaceC39605a.C11025a) {
            return C43175k.G(new b(interfaceC39605a2, this, null));
        }
        if (interfaceC39605a2 instanceof InterfaceC39605a.c) {
            return C43175k.G(new c(interfaceC39605a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
