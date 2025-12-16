package com.avito.android.video_requirements.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mN0.InterfaceC43984a;
import pN0.InterfaceC46981b;

/* compiled from: VideoRequirementsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_requirements/domain/b;", "Lcom/avito/android/video_requirements/domain/a;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.video_requirements.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43984a f326009a;

    /* compiled from: VideoRequirementsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpN0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.video_requirements.domain.VideoRequirementsInteractorImpl$getVideoRequirements$1", f = "VideoRequirementsInteractor.kt", i = {0, 1}, l = {33, 34, 45}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC46981b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326010q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f326011r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Long f326013t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Long f326014u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Long f326015v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Long f326016w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l12, Long l13, Long l14, Long l15, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f326013t = l12;
            this.f326014u = l13;
            this.f326015v = l14;
            this.f326016w = l15;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f326013t, this.f326014u, this.f326015v, this.f326016w, continuation);
            aVar.f326011r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC46981b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f326010q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r11)
                goto L92
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                java.lang.Object r1 = r10.f326011r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L5b
            L26:
                java.lang.Object r1 = r10.f326011r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L43
            L2e:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f326011r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                pN0.b$c r1 = pN0.InterfaceC46981b.c.f428511a
                r10.f326011r = r11
                r10.f326010q = r4
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L42
                return r0
            L42:
                r1 = r11
            L43:
                com.avito.android.video_requirements.domain.b r11 = com.avito.android.video_requirements.domain.b.this
                mN0.a r4 = r11.f326009a
                r10.f326011r = r1
                r10.f326010q = r3
                java.lang.Long r7 = r10.f326015v
                java.lang.Long r8 = r10.f326016w
                java.lang.Long r5 = r10.f326013t
                java.lang.Long r6 = r10.f326014u
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r3 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L73
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                nN0.a r11 = (nN0.C44296a) r11
                pN0.b$a r3 = new pN0.b$a
                nN0.b r11 = r11.getRequirements()
                r3.<init>(r11)
                goto L86
            L73:
                boolean r3 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L95
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r3 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.C35936s.a(r3, r11)
                pN0.b$b r3 = pN0.InterfaceC46981b.C12270b.f428510a
            L86:
                r11 = 0
                r10.f326011r = r11
                r10.f326010q = r2
                java.lang.Object r11 = r1.emit(r3, r10)
                if (r11 != r0) goto L92
                return r0
            L92:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L95:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.video_requirements.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC43984a interfaceC43984a) {
        this.f326009a = interfaceC43984a;
    }

    @Override // com.avito.android.video_requirements.domain.a
    @k
    public final InterfaceC43160i<InterfaceC46981b> a(@l Long l12, @l Long l13, @l Long l14, @l Long l15) {
        return C43175k.I(C43262l0.f411947c, C43175k.G(new a(l12, l13, l14, l15, null)));
    }
}
