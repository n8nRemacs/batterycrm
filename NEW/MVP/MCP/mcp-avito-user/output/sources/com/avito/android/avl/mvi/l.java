package com.avito.android.avl.mvi;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zg.e;
import zg.f;

/* compiled from: AvlPlayerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lzg/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$process$7", f = "AvlPlayerActor.kt", i = {0}, l = {88, 98}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super zg.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98231q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98232r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f98233s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zg.e f98234t;

    /* compiled from: AvlPlayerActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f98235l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar) {
            super(1);
            this.f98235l = nVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            J jC2;
            Throwable th3 = th2;
            ScreenPerformanceTracker screenPerformanceTracker = this.f98235l.f98244g;
            if (th3 != null) {
                J.a.f90383b.getClass();
                jC2 = J.a.C2676a.c(th3);
            } else {
                jC2 = J.b.f90385a;
            }
            ScreenPerformanceTracker.a.d(screenPerformanceTracker, null, null, jC2, null, 11);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation, zg.e eVar) {
        super(2, continuation);
        this.f98233s = nVar;
        this.f98234t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f98233s, continuation, this.f98234t);
        lVar.f98232r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super zg.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98231q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f98232r;
            n nVar = this.f98233s;
            ScreenPerformanceTracker.a.b(nVar.f98244g, null, 3);
            String str = ((e.c) this.f98234t).f444135a;
            a aVar = new a(nVar);
            this.f98232r = interfaceC43172j;
            this.f98231q = 1;
            if (nVar.f98239b.d(str, aVar, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f98232r;
            C42729a0.b(obj);
        }
        f.c cVar = f.c.f444148a;
        this.f98232r = null;
        this.f98231q = 2;
        if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
