package com.avito.android.cpt.activation.mvi;

import Lr.InterfaceC14431a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CptActivationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LLr/a;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "LLr/c;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14431a, CptActivationInternalAction, Lr.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpt.activation.domain.a f126285a;

    @Inject
    public a(@Y61.k com.avito.android.cpt.activation.domain.a aVar) {
        this.f126285a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CptActivationInternalAction> b(InterfaceC14431a interfaceC14431a, Lr.c cVar) {
        C43210w c43210w;
        InterfaceC14431a interfaceC14431a2 = interfaceC14431a;
        Lr.c cVar2 = cVar;
        if (interfaceC14431a2 instanceof InterfaceC14431a.c) {
            return this.f126285a.a();
        }
        if (interfaceC14431a2 instanceof InterfaceC14431a.C0633a) {
            c43210w = new C43210w(CptActivationInternalAction.Close.f126294b);
        } else {
            if (!(interfaceC14431a2 instanceof InterfaceC14431a.b)) {
                if (interfaceC14431a2 instanceof InterfaceC14431a.d) {
                    return new C43210w(new CptActivationInternalAction.HandleDeeplink(((InterfaceC14431a.d) interfaceC14431a2).f10134a));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new CptActivationInternalAction.HandleDeeplink(cVar2.f10143f));
        }
        return c43210w;
    }
}
