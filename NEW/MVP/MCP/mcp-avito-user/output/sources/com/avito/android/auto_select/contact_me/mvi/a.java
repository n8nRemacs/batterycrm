package com.avito.android.auto_select.contact_me.mvi;

import Y41.p;
import com.avito.android.auto_select.contact_me.mvi.entity.AutoSelectContactMeInternalAction;
import gf.C40672c;
import gf.InterfaceC40670a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoSelectContactMeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_select.contact_me.mvi.AutoSelectContactMeActor$process$1", f = "AutoSelectContactMeActor.kt", i = {0}, l = {19, 21}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super AutoSelectContactMeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95998q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95999r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40670a f96000s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40672c f96001t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC40670a interfaceC40670a, C40672c c40672c, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f96000s = interfaceC40670a;
        this.f96001t = c40672c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f96000s, this.f96001t, continuation);
        aVar.f95999r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutoSelectContactMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95998q;
        InterfaceC40670a interfaceC40670a = this.f96000s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f95999r;
            InterfaceC40670a.b bVar = (InterfaceC40670a.b) interfaceC40670a;
            if (L.f(bVar.f396669a.f95997h, Boxing.boxBoolean(true))) {
                AutoSelectContactMeInternalAction.LogItemCall logItemCall = new AutoSelectContactMeInternalAction.LogItemCall(bVar.f396669a, this.f96001t.f396674b);
                this.f95999r = interfaceC43172j;
                this.f95998q = 1;
                if (interfaceC43172j.emit(logItemCall, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f95999r;
            C42729a0.b(obj);
        }
        AutoSelectContactMeInternalAction.ContactClicked contactClicked = new AutoSelectContactMeInternalAction.ContactClicked(((InterfaceC40670a.b) interfaceC40670a).f396669a);
        this.f95999r = null;
        this.f95998q = 2;
        if (interfaceC43172j.emit(contactClicked, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
