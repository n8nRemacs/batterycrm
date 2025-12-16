package com.avito.android.comparison.mvi;

import Rq.InterfaceC15071a;
import Rq.b;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ComparisonActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LRq/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comparison.mvi.ComparisonActor$process$11", f = "ComparisonActor.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Rq.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f124114q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124115r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15071a f124116s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Rq.d f124117t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f124118u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC15071a interfaceC15071a, Rq.d dVar, m mVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f124116s = interfaceC15071a;
        this.f124117t = dVar;
        this.f124118u = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f124116s, this.f124117t, this.f124118u, continuation);
        bVar.f124115r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Rq.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Integer numBoxInt;
        List<TV0.a> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f124114q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f124115r;
            InterfaceC15071a.C0984a c0984a = (InterfaceC15071a.C0984a) this.f124116s;
            Integer num = c0984a.f14659b;
            String str = c0984a.f14660c;
            Sq.j jVar = this.f124117t.f14694d;
            if (jVar == null || (list = jVar.f15164b) == null) {
                numBoxInt = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof com.avito.android.comparison.items.header_item.b) {
                        arrayList.add(obj2);
                    }
                }
                numBoxInt = Boxing.boxInt(arrayList.size());
            }
            m mVar = this.f124118u;
            if (num == null || str == null || C43066x.K(str) || numBoxInt == null || numBoxInt.intValue() < num.intValue()) {
                b.a.a(mVar.f124145e, c0984a.f14658a, null, null, 6);
            } else {
                f.c.f125255c.getClass();
                b.k kVar = new b.k(str, f.c.a.b());
                this.f124114q = 1;
                if (interfaceC43172j.emit(kVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
