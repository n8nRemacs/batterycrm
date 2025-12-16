package com.avito.android.cpt.pre_activation.mvi;

import Xr.InterfaceC17040a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PreActivationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LXr/a;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "LXr/c;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC17040a, PreActivationInternalAction, Xr.c> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PreActivationInternalAction> b(InterfaceC17040a interfaceC17040a, Xr.c cVar) {
        int i12 = 1;
        int i13 = 2;
        boolean z12 = false;
        InterfaceC17040a interfaceC17040a2 = interfaceC17040a;
        Xr.c cVar2 = cVar;
        if (interfaceC17040a2 instanceof InterfaceC17040a.e) {
            return new C43210w(new PreActivationInternalAction.SelectOption(((InterfaceC17040a.e) interfaceC17040a2).f19085a));
        }
        C42822w c42822w = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (interfaceC17040a2 instanceof InterfaceC17040a.d) {
            return new C43210w(new PreActivationInternalAction.OpenDeepLink(((InterfaceC17040a.d) interfaceC17040a2).f19084a, z12, i13, c42822w));
        }
        if (interfaceC17040a2 instanceof InterfaceC17040a.c ? true : interfaceC17040a2.equals(InterfaceC17040a.b.f19082a)) {
            return new C43207v(new PreActivationInternalAction[]{new PreActivationInternalAction.SetResult(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0), PreActivationInternalAction.CloseScreen.f126731b});
        }
        if (interfaceC17040a2.equals(InterfaceC17040a.C1352a.f19081a)) {
            return C43175k.G(new a(cVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
