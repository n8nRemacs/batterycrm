package com.avito.android.publish.free_delivery.mvi;

import com.avito.android.free_delivery.v;
import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import ge0.C40669a;
import he0.C40926c;
import he0.InterfaceC40924a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FreeDeliveryActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.free_delivery.mvi.FreeDeliveryActor$process$1", f = "FreeDeliveryActor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FreeDeliveryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f235797q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f235798r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f235799s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40924a f235800t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C40926c f235801u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, InterfaceC40924a interfaceC40924a, C40926c c40926c, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f235799s = iVar;
        this.f235800t = interfaceC40924a;
        this.f235801u = c40926c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f235799s, this.f235800t, this.f235801u, continuation);
        aVar.f235798r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FreeDeliveryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f235797q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f235798r;
            InterfaceC40924a.C11265a c11265a = (InterfaceC40924a.C11265a) this.f235800t;
            int i13 = c11265a.f397314a;
            i iVar = this.f235799s;
            iVar.d(i13);
            String str = iVar.f235847e;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            int i14 = c11265a.f397314a;
            C40926c c40926c = this.f235801u;
            C40669a c40669a = c40926c.f397338j;
            iVar.f235845c.c(new v(str2, i14, c40669a != null ? c40669a.f396659h : -1, c40926c.f397334f, c40926c.f397335g, "item_add", null, iVar.f235846d.b(), 64, null));
            FreeDeliveryInternalAction.Forward forward = FreeDeliveryInternalAction.Forward.f235824b;
            this.f235797q = 1;
            if (interfaceC43172j.emit(forward, this) == coroutine_suspended) {
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
