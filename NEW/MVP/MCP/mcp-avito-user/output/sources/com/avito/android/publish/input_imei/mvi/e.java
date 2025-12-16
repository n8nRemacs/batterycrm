package com.avito.android.publish.input_imei.mvi;

import com.avito.android.R;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import com.avito.android.validation.l1;
import java.io.Serializable;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import le0.C43742c;

/* compiled from: InputImeiActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_imei.mvi.InputImeiActor$startLocalValidation$1", f = "InputImeiActor.kt", i = {0}, l = {83, 93}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InputImeiInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f236379q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f236380r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f236381s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<? extends com.avito.conveyor_item.a>, InterfaceC43160i<l1.b>> f236382t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43742c f236383u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(f fVar, Y41.l<? super List<? extends com.avito.conveyor_item.a>, ? extends InterfaceC43160i<? extends l1.b>> lVar, C43742c c43742c, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f236381s = fVar;
        this.f236382t = lVar;
        this.f236383u = c43742c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f236381s, this.f236382t, this.f236383u, continuation);
        eVar.f236380r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InputImeiInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f236379q;
        f fVar = this.f236381s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f236380r;
            com.avito.android.publish.input_imei.di.m mVar = fVar.f236391a;
            int i13 = fVar.f236393c;
            InterfaceC43160i<l1.b> interfaceC43160iInvoke = this.f236382t.invoke(fVar.f236395e.a(mVar.b(i13), i13, fVar.f236392b.a()));
            this.f236380r = interfaceC43172j;
            this.f236379q = 1;
            obj = C43175k.T(interfaceC43160iInvoke, this);
            if (obj == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f236380r;
            C42729a0.b(obj);
        }
        l1.b bVar = (l1.b) obj;
        boolean z12 = bVar instanceof l1.b.a;
        C43742c c43742c = this.f236383u;
        if (z12) {
            fVar.getClass();
            String str = c43742c.f413975b;
            com.avito.android.publish.input_imei.di.m mVar2 = fVar.f236391a;
            mVar2.a(str);
            mVar2.e();
        } else {
            if (!(bVar instanceof l1.b.C9896b)) {
                throw new NoWhenBranchMatchedException();
            }
            l1.b.C9896b c9896b = (l1.b.C9896b) bVar;
            if (c9896b.f319395a) {
                InterfaceC33535v interfaceC33535v = fVar.f236394d;
                com.avito.android.publish.input_imei.di.m mVar3 = fVar.f236391a;
                interfaceC33535v.F0(c9896b.f319397c, mVar3.U(), mVar3.f());
                InputImeiInternalAction.Error error = new InputImeiInternalAction.Error(com.avito.android.printable_text.b.c(R.string.fix_errors, new Serializable[0]));
                this.f236380r = null;
                this.f236379q = 2;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                fVar.getClass();
                String str2 = c43742c.f413975b;
                com.avito.android.publish.input_imei.di.m mVar4 = fVar.f236391a;
                mVar4.a(str2);
                mVar4.e();
            }
        }
        return G0.f406611a;
    }
}
