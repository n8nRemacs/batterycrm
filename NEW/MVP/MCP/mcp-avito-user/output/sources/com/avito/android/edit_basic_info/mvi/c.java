package com.avito.android.edit_basic_info.mvi;

import Y41.p;
import com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ky.InterfaceC43512a;

/* compiled from: EditBasicInfoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<anonymous>", "(Lky/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$process$1", f = "EditBasicInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<InterfaceC43512a, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f146123q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f146124r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ky.c> f146125s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Y41.a<ky.c> aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f146124r = bVar;
        this.f146125s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f146124r, this.f146125s, continuation);
        cVar.f146123q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43512a interfaceC43512a, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>> continuation) {
        return ((c) create(interfaceC43512a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f146124r.b((InterfaceC43512a) this.f146123q, this.f146125s.invoke());
    }
}
