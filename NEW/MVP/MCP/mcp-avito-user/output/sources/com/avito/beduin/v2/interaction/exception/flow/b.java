package com.avito.beduin.v2.interaction.exception.flow;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.logger.LogLevel;
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

/* compiled from: BottomSheetExceptionInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.exception.flow.BottomSheetExceptionInteractionHandler$handle$1", f = "BottomSheetExceptionInteractionHandler.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337390q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.interaction.exception.flow.a f337391r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f337392s;

    /* compiled from: BottomSheetExceptionInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.b f337393l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.b bVar) {
            super(1);
            this.f337393l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f337393l.close();
            return G0.f406611a;
        }
    }

    /* compiled from: BottomSheetExceptionInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.interaction.exception.flow.b$b, reason: collision with other inner class name */
    public static final class C10455b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f337394l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10455b(r rVar) {
            super(0);
            this.f337394l = rVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = Z.f406624c;
            G0 g02 = G0.f406611a;
            this.f337394l.resumeWith(g02);
            return g02;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.beduin.v2.interaction.exception.flow.a aVar, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f337391r = aVar;
        this.f337392s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new b(this.f337391r, this.f337392s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337390q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.beduin.v2.interaction.exception.flow.a aVar = this.f337391r;
            d dVar = this.f337392s;
            this.f337390q = 1;
            r rVar = new r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            try {
                com.avito.beduin.v2.utils.detached.b bVar = aVar.f337388c;
                D d12 = dVar.f337400d;
                BottomSheetHeight bottomSheetHeight = BottomSheetHeight.f337303c;
                BottomSheetModalSize bottomSheetModalSize = BottomSheetModalSize.f337311e;
                rVar.r(new a(bVar.y2(new C10455b(rVar), d12, BottomSheetContentPaddings.f337299f, bottomSheetHeight, bottomSheetModalSize, null)));
            } catch (Throwable th2) {
                RU0.b bVar2 = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar2.getClass();
                if (4 >= RU0.b.f14469c) {
                    RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":BottomSheetExceptionInteractionHandler"), "failed to show bottom sheet", th2);
                }
            }
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (objO == coroutine_suspended) {
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
