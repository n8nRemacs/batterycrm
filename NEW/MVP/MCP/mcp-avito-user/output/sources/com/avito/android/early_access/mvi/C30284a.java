package com.avito.android.early_access.mvi;

import Mx.InterfaceC14538a;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
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
@DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessActor$process$1", f = "EarlyAccessActor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.early_access.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30284a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EarlyAccessInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f145433q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f145434r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14538a f145435s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30284a(InterfaceC14538a interfaceC14538a, Continuation<? super C30284a> continuation) {
        super(2, continuation);
        this.f145435s = interfaceC14538a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30284a c30284a = new C30284a(this.f145435s, continuation);
        c30284a.f145434r = obj;
        return c30284a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30284a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f145433q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f145434r;
            EarlyAccessInternalAction.OpenScreen openScreen = new EarlyAccessInternalAction.OpenScreen(((InterfaceC14538a.C0709a) this.f145435s).f11105a, null, 2, null);
            this.f145433q = 1;
            if (interfaceC43172j.emit(openScreen, this) == coroutine_suspended) {
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
