package com.avito.android.success_screen_after_apply.mvi;

import Y41.p;
import com.avito.android.success_screen_after_apply.mvi.i;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import hA0.C40793a;
import hA0.C40795c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuccessScreenAfterApplyActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/success_screen_after_apply/mvi/i;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.success_screen_after_apply.mvi.SuccessScreenAfterApplyActor$process$1", f = "SuccessScreenAfterApplyActor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super i>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291725q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291726r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f291727s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f291727s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f291727s, continuation);
        bVar.f291726r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super i> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291725q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291726r;
            d dVar = this.f291727s;
            C40793a c40793a = dVar.f291732b;
            c40793a.f397083a.c(new C40795c(String.valueOf(c40793a.f397085c.f291768b), c40793a.f397084b.a()));
            i.b bVar = new i.b(new SuccessScreenAfterApplyResult.OpenEdit(dVar.f291731a.f291773g));
            this.f291725q = 1;
            if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
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
