package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import com.avito.beduin.v2.engine.exception.AbstractBeduinException;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;

/* compiled from: BeduinErrorDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/k;", "LaU0/b;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/BeduinErrorTracker;", "Lkotlinx/coroutines/flow/Y1;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements aU0.b, Y1<BeduinInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f176332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2 f176333c = f2.a(0, 16, BufferOverflow.f410777b);

    public k(@Y61.k l lVar) {
        this.f176332b = lVar;
    }

    @Override // kotlinx.coroutines.flow.d2
    @Y61.k
    public final List<BeduinInternalAction> E3() {
        return this.f176333c.E3();
    }

    @Override // kotlinx.coroutines.flow.Y1
    public final boolean K5(BeduinInternalAction beduinInternalAction) {
        return this.f176333c.K5(beduinInternalAction);
    }

    @Override // aU0.b
    public final void a(@Y61.k AbstractBeduinException abstractBeduinException, @Y61.k String str) {
        Iterable iterableP;
        l lVar = this.f176332b;
        lVar.getClass();
        if (((abstractBeduinException instanceof RendererBeduinException.OnBindStateException) || (abstractBeduinException instanceof EngineBeduinException.CreateComponentException)) && lVar.f176335b.f20173a) {
            kotlin.collections.builders.b bVarT = C42745f0.t();
            bVarT.add(new BeduinInternalAction.OnBeduinException(abstractBeduinException, str));
            if (lVar.f176334a.l()) {
                bVarT.add(new BeduinInternalAction.DisplayScreenErrorException(abstractBeduinException));
            } else {
                bVarT.add(new BeduinInternalAction.ShowToastError(abstractBeduinException));
            }
            iterableP = C42745f0.p(bVarT);
        } else {
            iterableP = Collections.singletonList(new BeduinInternalAction.OnBeduinException(abstractBeduinException, str));
        }
        Iterator it = iterableP.iterator();
        while (it.hasNext()) {
            this.f176333c.K5((BeduinInternalAction) it.next());
        }
    }

    @Override // kotlinx.coroutines.flow.Y1
    @Y61.k
    public final n2<Integer> ac() {
        return this.f176333c.ac();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super BeduinInternalAction> interfaceC43172j, @Y61.k Continuation<?> continuation) {
        e2 e2Var = this.f176333c;
        e2Var.getClass();
        return e2.g(e2Var, interfaceC43172j, continuation);
    }

    @Override // kotlinx.coroutines.flow.Y1, kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        return this.f176333c.emit((BeduinInternalAction) obj, continuation);
    }

    @Override // kotlinx.coroutines.flow.Y1
    @B0
    public final void h4() {
        this.f176333c.h4();
    }
}
