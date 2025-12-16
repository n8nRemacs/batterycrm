package com.avito.android.evidence_request.mvi.evidence_request.mvi;

import Wz.InterfaceC15811a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.evidence_request.mvi.evidence_request.mvi.entity.EvidenceRequestInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EvidenceRequestBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.b<EvidenceRequestInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AppealId f149134a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Wz.d f149135b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC15811a f149136c;

    /* compiled from: EvidenceRequestBootstrap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_request.mvi.EvidenceRequestBootstrap", f = "EvidenceRequestBootstrap.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "onCompletion", n = {"this"}, s = {"L$0"})
    /* renamed from: com.avito.android.evidence_request.mvi.evidence_request.mvi.a$a, reason: collision with other inner class name */
    public static final class C4372a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f149137q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f149138r;

        /* renamed from: t, reason: collision with root package name */
        public int f149140t;

        public C4372a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f149138r = obj;
            this.f149140t |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.b(this);
        }
    }

    /* compiled from: EvidenceRequestBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_request.mvi.EvidenceRequestBootstrap$produce$1", f = "EvidenceRequestBootstrap.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super EvidenceRequestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f149141q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f149142r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f149142r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EvidenceRequestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f149141q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f149142r;
                a aVar = a.this;
                aVar.f149135b.b();
                EvidenceRequestInternalAction.OpenScreen openScreen = new EvidenceRequestInternalAction.OpenScreen(aVar.f149136c.a(aVar.f149134a.f148725d));
                this.f149141q = 1;
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

    @Inject
    public a(@k AppealId appealId, @k Wz.d dVar, @k InterfaceC15811a interfaceC15811a) {
        this.f149134a = appealId;
        this.f149135b = dVar;
        this.f149136c = interfaceC15811a;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<EvidenceRequestInternalAction> a() {
        return C43175k.G(new b(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.evidence_request.mvi.evidence_request.mvi.a.C4372a
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.evidence_request.mvi.evidence_request.mvi.a$a r0 = (com.avito.android.evidence_request.mvi.evidence_request.mvi.a.C4372a) r0
            int r1 = r0.f149140t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149140t = r1
            goto L1a
        L13:
            com.avito.android.evidence_request.mvi.evidence_request.mvi.a$a r0 = new com.avito.android.evidence_request.mvi.evidence_request.mvi.a$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r5 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r5
            r0.<init>(r5)
        L1a:
            java.lang.Object r5 = r0.f149138r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f149140t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.evidence_request.mvi.evidence_request.mvi.a r0 = r0.f149137q
            kotlin.C42729a0.b(r5)
            goto L42
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.f149137q = r4
            r0.f149140t = r3
            kotlin.G0 r5 = kotlin.G0.f406611a
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            Wz.d r5 = r0.f149135b
            r5.a()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.evidence_request.mvi.evidence_request.mvi.a.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
