package com.avito.android.early_access.mvi;

import Mx.InterfaceC14538a;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EarlyAccessActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessActor$process$4", f = "EarlyAccessActor.kt", i = {0}, l = {47, 48}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.early_access.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30287d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EarlyAccessInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f145446q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f145447r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30292i f145448s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14538a f145449t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30287d(C30292i c30292i, InterfaceC14538a interfaceC14538a, Continuation<? super C30287d> continuation) {
        super(2, continuation);
        this.f145448s = c30292i;
        this.f145449t = interfaceC14538a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30287d c30287d = new C30287d(this.f145448s, this.f145449t, continuation);
        c30287d.f145447r = obj;
        return c30287d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30287d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f145446q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f145447r;
            this.f145448s.f145500c.d();
            ((InterfaceC14538a.d) this.f145449t).getClass();
            EarlyAccessInternalAction.OpenScreen openScreen = new EarlyAccessInternalAction.OpenScreen(null, null, 2, null);
            this.f145447r = interfaceC43172j;
            this.f145446q = 1;
            if (interfaceC43172j.emit(openScreen, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f145447r;
            C42729a0.b(obj);
        }
        EarlyAccessInternalAction.CloseDialog closeDialog = EarlyAccessInternalAction.CloseDialog.f145458b;
        this.f145447r = null;
        this.f145446q = 2;
        if (interfaceC43172j.emit(closeDialog, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
