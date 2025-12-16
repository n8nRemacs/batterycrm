package com.avito.android.extended_profile_universal_widget_edit.edit.mvi;

import Y41.p;
import jB.InterfaceC42227a;
import jB.InterfaceC42228b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UniversalWidgetEditActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LjB/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.mvi.UniversalWidgetEditActor$process$1", f = "UniversalWidgetEditActor.kt", i = {0}, l = {63, 64}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC42228b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f153934q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f153935r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f153936s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42227a f153937t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, InterfaceC42227a interfaceC42227a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f153936s = aVar;
        this.f153937t = interfaceC42227a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f153936s, this.f153937t, continuation);
        bVar.f153935r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC42228b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f153934q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f153935r;
            InterfaceC42228b.e eVar = new InterfaceC42228b.e(false, 1, null);
            this.f153935r = interfaceC43172j;
            this.f153934q = 1;
            if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f153935r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<InterfaceC42228b> interfaceC43160iD = this.f153936s.f153933b.d(((InterfaceC42227a.C11550a) this.f153937t).f405454a);
        this.f153935r = null;
        this.f153934q = 2;
        if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
