package com.avito.android.publish.vinsuggest;

import If0.InterfaceC14100b;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.AbstractC35806h3;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.vinsuggest.VinSuggestInteractor$getVinSuggest$$inlined$flatMapLatest$1", f = "VinSuggestInteractor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class d extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC14100b>, AbstractC35806h3<? super CategoryParameters>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f245722q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f245723r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f245724s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f245725t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Continuation continuation) {
        super(3, continuation);
        this.f245725t = cVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC14100b> interfaceC43172j, AbstractC35806h3<? super CategoryParameters> abstractC35806h3, Continuation<? super G0> continuation) {
        d dVar = new d(this.f245725t, continuation);
        dVar.f245723r = interfaceC43172j;
        dVar.f245724s = abstractC35806h3;
        return dVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43160i interfaceC43160iG;
        CategoryParameters categoryParametersCloneWithNewParameters;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f245722q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f245723r;
            AbstractC35806h3 abstractC35806h3 = (AbstractC35806h3) this.f245724s;
            boolean z12 = abstractC35806h3 instanceof AbstractC35806h3.d;
            c cVar = this.f245725t;
            if (z12) {
                CategoryParameters categoryParameters = (CategoryParameters) ((AbstractC35806h3.d) abstractC35806h3).f318893a;
                C0 c02 = cVar.f245710b;
                CategoryParameters categoryParameters2 = c02.f231873k0;
                if (categoryParameters2 != null && (categoryParametersCloneWithNewParameters = categoryParameters2.cloneWithNewParameters(categoryParameters.getParameters(), categoryParameters.getChangedIds())) != null) {
                    c02.Ke(categoryParametersCloneWithNewParameters);
                }
                interfaceC43160iG = new C43210w(InterfaceC14100b.d.f8469a);
            } else {
                if (abstractC35806h3 instanceof AbstractC35806h3.e ? true : abstractC35806h3 instanceof AbstractC35806h3.c ? true : abstractC35806h3 instanceof AbstractC35806h3.f) {
                    interfaceC43160iG = C43175k.w();
                } else {
                    interfaceC43160iG = abstractC35806h3 instanceof AbstractC35806h3.a ? true : abstractC35806h3 instanceof AbstractC35806h3.b ? c.g() : c.g();
                }
            }
            this.f245722q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
