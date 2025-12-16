package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$filesUpload$$inlined$transform$1", f = "EvidenceDetailsBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
public final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EvidenceDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f149065q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f149066r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f149067s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<EvidenceDetailsInternalAction> f149068b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$filesUpload$$inlined$transform$1$1", f = "EvidenceDetailsBootstrap.kt", i = {0, 0}, l = {219, 220}, m = "emit", n = {VoiceInfo.STATE, "$this$filesUpload_u24lambda_u241"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.evidence_request.mvi.evidence_details.mvi.k$a$a, reason: collision with other inner class name */
        public static final class C4368a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f149069q;

            /* renamed from: r, reason: collision with root package name */
            public int f149070r;

            /* renamed from: t, reason: collision with root package name */
            public com.avito.android.photo_cache.q f149072t;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f149073u;

            public C4368a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f149069q = obj;
                this.f149070r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f149068b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.evidence_request.mvi.evidence_details.mvi.k.a.C4368a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.evidence_request.mvi.evidence_details.mvi.k$a$a r0 = (com.avito.android.evidence_request.mvi.evidence_details.mvi.k.a.C4368a) r0
                int r1 = r0.f149070r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f149070r = r1
                goto L18
            L13:
                com.avito.android.evidence_request.mvi.evidence_details.mvi.k$a$a r0 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.k$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f149069q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f149070r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r8)
                goto L77
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                kotlinx.coroutines.flow.j r7 = r0.f149073u
                com.avito.android.photo_cache.q r2 = r0.f149072t
                kotlin.C42729a0.b(r8)
                goto L62
            L3c:
                kotlin.C42729a0.b(r8)
                r2 = r7
                com.avito.android.photo_cache.q r2 = (com.avito.android.photo_cache.q) r2
                boolean r7 = r2 instanceof com.avito.android.photo_cache.q.b
                kotlinx.coroutines.flow.j<com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction> r8 = r6.f149068b
                if (r7 == 0) goto L63
                com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$HasUploadData r7 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$HasUploadData
                r5 = r2
                com.avito.android.photo_cache.q$b r5 = (com.avito.android.photo_cache.q.b) r5
                java.util.List r5 = r5.getData()
                r7.<init>(r5)
                r0.f149072t = r2
                r0.f149073u = r8
                r0.f149070r = r4
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L61
                return r1
            L61:
                r7 = r8
            L62:
                r8 = r7
            L63:
                boolean r7 = r2 instanceof com.avito.android.photo_cache.q.c
                if (r7 == 0) goto L77
                com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$FilesUpload r7 = com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction.FilesUpload.f149031b
                r2 = 0
                r0.f149072t = r2
                r0.f149073u = r2
                r0.f149070r = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L77
                return r1
            L77:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.evidence_request.mvi.evidence_details.mvi.k.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f149067s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f149067s, continuation);
        kVar.f149066r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f149065q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f149066r);
            this.f149065q = 1;
            if (this.f149067s.collect(aVar, this) == coroutine_suspended) {
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
