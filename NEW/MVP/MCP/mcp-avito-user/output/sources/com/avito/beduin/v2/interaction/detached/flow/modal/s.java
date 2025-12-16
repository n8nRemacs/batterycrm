package com.avito.beduin.v2.interaction.detached.flow.modal;

import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: ShowModalInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.detached.flow.modal.ShowModalInteractionHandler$handle$1", f = "ShowModalInteractionHandler.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337380q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337381r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f337382s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f337383t;

    /* compiled from: ShowModalInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.b f337384l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.b bVar) {
            super(1);
            this.f337384l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f337384l.close();
            return G0.f406611a;
        }
    }

    /* compiled from: ShowModalInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f337385l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.r rVar) {
            super(0);
            this.f337385l = rVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = Z.f406624c;
            G0 g02 = G0.f406611a;
            this.f337385l.resumeWith(g02);
            return g02;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, u uVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f337382s = rVar;
        this.f337383t = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f337382s, this.f337383t, continuation);
        sVar.f337381r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337380q;
        r rVar = this.f337382s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f337381r;
            dU0.f fVarInvoke = rVar.f337376i.invoke();
            if (fVarInvoke != null) {
                this.f337380q = 1;
                if (interfaceC43172j.emit(fVarInvoke, this) == coroutine_suspended) {
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
        u uVar = this.f337383t;
        this.f337381r = uVar;
        this.f337380q = 2;
        kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
        rVar2.p();
        com.avito.beduin.v2.utils.detached.b bVar = uVar.f337387c;
        String str = rVar.f337368a;
        b bVar2 = new b(rVar2);
        rVar2.r(new a(bVar.Y2(str, rVar.f337369b, rVar.f337370c, rVar.f337371d, rVar.f337372e, rVar.f337373f, rVar.f337374g, rVar.f337375h, bVar2)));
        Object objO = rVar2.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
