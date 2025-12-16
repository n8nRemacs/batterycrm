package com.avito.beduin.v2.interaction.detached.flow;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.beduin.v2.engine.D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.r;

/* compiled from: ShowBottomSheetInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.detached.flow.ShowBottomSheetInteractionHandler$handle$1", f = "ShowBottomSheetInteractionHandler.kt", i = {}, l = {32, 53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class i extends SuspendLambda implements p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337333q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f337335s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f337336t;

    /* compiled from: ShowBottomSheetInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.b f337337l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.b bVar) {
            super(1);
            this.f337337l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f337337l.close();
            return G0.f406611a;
        }
    }

    /* compiled from: ShowBottomSheetInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f337338l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar) {
            super(0);
            this.f337338l = rVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = Z.f406624c;
            G0 g02 = G0.f406611a;
            this.f337338l.resumeWith(g02);
            return g02;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, h hVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f337335s = gVar;
        this.f337336t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        i iVar = new i(this.f337335s, this.f337336t, continuation);
        iVar.f337334r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337333q;
        g gVar = this.f337335s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f337334r;
            dU0.f fVar = (dU0.f) ((e) gVar.f337326e).invoke();
            if (fVar != null) {
                this.f337333q = 1;
                if (interfaceC43172j.emit(fVar, this) == coroutine_suspended) {
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
            C42729a0.b(obj);
        }
        h hVar = this.f337336t;
        this.f337334r = hVar;
        this.f337333q = 2;
        r rVar = new r(1, IntrinsicsKt.intercepted(this));
        rVar.p();
        com.avito.beduin.v2.utils.detached.b bVar = hVar.f337332c;
        D d12 = gVar.f337325d;
        rVar.r(new a(bVar.y2(new b(rVar), d12, gVar.f337324c, gVar.f337322a, gVar.f337323b, gVar.f337327f)));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
