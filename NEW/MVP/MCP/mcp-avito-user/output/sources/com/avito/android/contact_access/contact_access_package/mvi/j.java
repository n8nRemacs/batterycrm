package com.avito.android.contact_access.contact_access_package.mvi;

import Y41.p;
import com.avito.android.util.InterfaceC35741a1;
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

/* compiled from: ContactAccessPackageBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "LDr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements com.avito.android.arch.mvi.b<Dr.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.contact_access.contact_access_package.domain.a f125908a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f125909b;

    /* compiled from: ContactAccessPackageBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LDr/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.contact_access.contact_access_package.mvi.ContactAccessPackageBootstrap$produce$1", f = "ContactAccessPackageBootstrap.kt", i = {0, 1}, l = {18, 19, 20, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super Dr.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f125910q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f125911r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f125911r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Dr.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
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
                int r1 = r7.f125910q
                com.avito.android.contact_access.contact_access_package.mvi.j r2 = com.avito.android.contact_access.contact_access_package.mvi.j.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
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
                goto La5
            L24:
                java.lang.Object r1 = r7.f125911r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L56
            L2c:
                java.lang.Object r1 = r7.f125911r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L49
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f125911r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                Dr.c$d r1 = Dr.c.d.f3484a
                r7.f125911r = r8
                r7.f125910q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L48
                return r0
            L48:
                r1 = r8
            L49:
                com.avito.android.contact_access.contact_access_package.domain.a r8 = r2.f125908a
                r7.f125911r = r1
                r7.f125910q = r5
                java.lang.Object r8 = r8.a(r7)
                if (r8 != r0) goto L56
                return r0
            L56:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L75
                Dr.c$c r2 = new Dr.c$c
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackage r8 = (com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackage) r8
                r2.<init>(r8)
                r7.f125911r = r6
                r7.f125910q = r4
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La5
                return r0
            L75:
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto La5
                Dr.c$b r4 = new Dr.c$b
                com.avito.android.util.a1 r2 = r2.f125909b
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                java.lang.Throwable r5 = r8.getCause()
                if (r5 != 0) goto L92
                java.lang.Throwable r5 = new java.lang.Throwable
                com.avito.android.remote.error.ApiError r8 = r8.getError()
                java.lang.String r8 = r8.getF244063c()
                r5.<init>(r8)
            L92:
                r8 = 6
                com.avito.android.printable_text.PrintableText r8 = com.avito.android.util.InterfaceC35741a1.a.a(r2, r5, r6, r6, r8)
                r4.<init>(r8)
                r7.f125911r = r6
                r7.f125910q = r3
                java.lang.Object r8 = r1.emit(r4, r7)
                if (r8 != r0) goto La5
                return r0
            La5:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.contact_access.contact_access_package.mvi.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.contact_access.contact_access_package.domain.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f125908a = aVar;
        this.f125909b = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Dr.c> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
