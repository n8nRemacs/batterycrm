package com.avito.android.sx_address.address_video_verification.domain;

import BA0.b;
import Y41.p;
import Y41.q;
import android.content.ContentResolver;
import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressVideoVerificationInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/e;", "Lcom/avito/android/sx_address/address_video_verification/domain/d;", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final EA0.a f292607a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.address_video_verification.domain.a f292608b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50429b f292609c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SxAddressVideoVerificationParams f292610d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f292611e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.features.a f292612f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f292613g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final J0 f292614h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.address_video_verification.view.d f292615i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f292616j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N0 f292617k;

    /* compiled from: SxAddressVideoVerificationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/e$a;", "", "<init>", "()V", "", "KEY_FILE", "Ljava/lang/String;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SxAddressVideoVerificationInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.domain.SxAddressVideoVerificationInteractorImpl$getVerificationInfo$1", f = "SxAddressVideoVerificationInteractor.kt", i = {0, 1}, l = {66, 67, 68, 69}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super BA0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292618q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f292619r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f292621t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f292621t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = e.this.new b(this.f292621t, continuation);
            bVar.f292619r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BA0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f292618q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L99
            L22:
                java.lang.Object r1 = r6.f292619r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L58
            L2a:
                java.lang.Object r1 = r6.f292619r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L47
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f292619r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                BA0.b$g r1 = BA0.b.g.f1219a
                r6.f292619r = r7
                r6.f292618q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r7
            L47:
                com.avito.android.sx_address.address_video_verification.domain.e r7 = com.avito.android.sx_address.address_video_verification.domain.e.this
                EA0.a r7 = r7.f292607a
                r6.f292619r = r1
                r6.f292618q = r4
                long r4 = r6.f292621t
                java.lang.Object r7 = r7.a(r4, r6)
                if (r7 != r0) goto L58
                return r0
            L58:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L77
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                NA0.a r7 = (NA0.a) r7
                BA0.b$k r2 = new BA0.b$k
                r2.<init>(r7)
                r6.f292619r = r5
                r6.f292618q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L99
                return r0
            L77:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9c
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                BA0.b$e r3 = new BA0.b$e
                r3.<init>(r7)
                r6.f292619r = r5
                r6.f292618q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L99
                return r0
            L99:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L9c:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.address_video_verification.domain.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SxAddressVideoVerificationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBA0/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.domain.SxAddressVideoVerificationInteractorImpl$getVerificationInfo$2", f = "SxAddressVideoVerificationInteractor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super BA0.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292622q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f292623r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f292624s;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BA0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f292623r = interfaceC43172j;
            cVar.f292624s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f292622q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f292623r;
                b.e eVar = new b.e(this.f292624s);
                this.f292623r = null;
                this.f292622q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k EA0.a aVar, @Y61.k com.avito.android.sx_address.address_video_verification.domain.a aVar2, @Y61.k InterfaceC50429b interfaceC50429b, @Y61.k SxAddressVideoVerificationParams sxAddressVideoVerificationParams, @Y61.k R0 r02, @Y61.k com.avito.android.sx_address.features.a aVar3, @Y61.k ContentResolver contentResolver, @Y61.k J0 j02, @Y61.k com.avito.android.sx_address.address_video_verification.view.d dVar) {
        this.f292607a = aVar;
        this.f292608b = aVar2;
        this.f292609c = interfaceC50429b;
        this.f292610d = sxAddressVideoVerificationParams;
        this.f292611e = r02;
        this.f292612f = aVar3;
        this.f292613g = contentResolver;
        this.f292614h = j02;
        this.f292615i = dVar;
        this.f292616j = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.sx_address.address_video_verification.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k android.net.Uri r23, long r24, long r26, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.address_video_verification.domain.e.a(android.net.Uri, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.sx_address.address_video_verification.domain.d
    public final void b() {
        N0 n02 = this.f292617k;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f292617k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.sx_address.address_video_verification.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.sx_address.address_video_verification.domain.f
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.sx_address.address_video_verification.domain.f r0 = (com.avito.android.sx_address.address_video_verification.domain.f) r0
            int r1 = r0.f292627s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292627s = r1
            goto L18
        L13:
            com.avito.android.sx_address.address_video_verification.domain.f r0 = new com.avito.android.sx_address.address_video_verification.domain.f
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f292625q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f292627s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            r0.f292627s = r3
            EA0.a r7 = r4.f292607a
            java.lang.Object r7 = r7.m(r5, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L4e
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r5 = r7.getResult()
            SA0.a r5 = (SA0.a) r5
            return r5
        L4e:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L61
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L61:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.address_video_verification.domain.e.c(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.sx_address.address_video_verification.domain.d
    @Y61.k
    public final InterfaceC43160i<BA0.b> d(long j12) {
        return C43175k.I(this.f292611e.a(), new C43152f0(C43175k.G(new b(j12, null)), new c(3, null)));
    }
}
