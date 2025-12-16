package com.avito.android.edit_basic_info.mvi;

import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.change_specific.deep_linking.d;
import com.avito.android.deep_linking.links.InterfaceC29684j;
import com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: EditBasicInfoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$deeplinkHandlerFlow$1", f = "EditBasicInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<C43501a, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f146103q;

    public a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(2, continuation);
        aVar.f146103q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>> continuation) {
        return ((a) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f146103q).f413261b;
        if (interfaceC14249c instanceof InterfaceC29684j.c) {
            InterfaceC29684j.c cVar = (InterfaceC29684j.c) interfaceC14249c;
            return new C43210w(new EditBasicInfoInternalAction.OnVerticalAndSpecificUpdated(cVar.f134008b, cVar.f134010d, cVar.f134009c, cVar.f134011e, cVar.f134012f));
        }
        if (!(interfaceC14249c instanceof d.c)) {
            return C43175k.w();
        }
        d.c cVar2 = (d.c) interfaceC14249c;
        return new C43210w(new EditBasicInfoInternalAction.OnSpecificUpdated(cVar2.f117934b, cVar2.f117935c));
    }
}
