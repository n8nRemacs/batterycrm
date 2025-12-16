package com.avito.android.work_profile.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import bQ0.InterfaceC25545a;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oQ0.InterfaceC44680b;

/* compiled from: GigInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/domain/e;", "Lcom/avito/android/work_profile/domain/d;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC25545a f330638a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.work_profile.profile.gig.mvi.k f330639b;

    /* compiled from: GigInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LoQ0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.domain.GigInteractorImpl$getGig$1", f = "GigInteractor.kt", i = {0, 1}, l = {21, 22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 31}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC44680b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330640q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330641r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f330641r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC44680b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f330640q
                com.avito.android.work_profile.domain.e r2 = com.avito.android.work_profile.domain.e.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L33
                if (r1 == r6) goto L2b
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto L8b
            L23:
                java.lang.Object r1 = r7.f330641r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L55
            L2b:
                java.lang.Object r1 = r7.f330641r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L48
            L33:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f330641r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                oQ0.b$c r1 = oQ0.InterfaceC44680b.c.f419764a
                r7.f330641r = r8
                r7.f330640q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L47
                return r0
            L47:
                r1 = r8
            L48:
                bQ0.a r8 = r2.f330638a
                r7.f330641r = r1
                r7.f330640q = r5
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r0) goto L55
                return r0
            L55:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L7a
                oQ0.b$a r3 = new oQ0.b$a
                com.avito.android.work_profile.profile.gig.mvi.k r2 = r2.f330639b
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                cQ0.e r8 = (cQ0.e) r8
                java.util.ArrayList r8 = r2.invoke(r8)
                r3.<init>(r8)
                r7.f330641r = r6
                r7.f330640q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L8b
                return r0
            L7a:
                boolean r8 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r8 == 0) goto L8b
                oQ0.b$b r8 = oQ0.InterfaceC44680b.C12188b.f419763a
                r7.f330641r = r6
                r7.f330640q = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L8b
                return r0
            L8b:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.domain.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@k InterfaceC25545a interfaceC25545a, @k com.avito.android.work_profile.profile.gig.mvi.k kVar) {
        this.f330638a = interfaceC25545a;
        this.f330639b = kVar;
    }

    @Override // com.avito.android.work_profile.domain.d
    @k
    public final InterfaceC43160i<InterfaceC44680b> a() {
        return C43175k.G(new a(null));
    }
}
