package com.avito.android.license.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.license.mvi.entity.LicenseInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LicenseBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/license/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.b<LicenseInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.license.data.b f181524a;

    /* compiled from: LicenseBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.license.mvi.LicenseBootstrap$produce$1", f = "LicenseBootstrap.kt", i = {0, 1}, l = {16, 17, 18}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.license.mvi.a$a, reason: collision with other inner class name */
    public static final class C5334a extends SuspendLambda implements p<InterfaceC43172j<? super LicenseInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f181525q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f181526r;

        public C5334a(Continuation<? super C5334a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C5334a c5334a = a.this.new C5334a(continuation);
            c5334a.f181526r = obj;
            return c5334a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LicenseInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C5334a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
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
                int r1 = r6.f181525q
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L2e
                if (r1 == r5) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r7)
                goto L67
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f181526r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L55
            L26:
                java.lang.Object r1 = r6.f181526r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L46
            L2e:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f181526r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.license.mvi.entity.LicenseInternalAction$Loading r1 = new com.avito.android.license.mvi.entity.LicenseInternalAction$Loading
                r1.<init>(r4, r5, r4)
                r6.f181526r = r7
                r6.f181525q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r7
            L46:
                com.avito.android.license.mvi.a r7 = com.avito.android.license.mvi.a.this
                com.avito.android.license.data.b r7 = r7.f181524a
                r6.f181526r = r1
                r6.f181525q = r3
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L55
                return r0
            L55:
                java.lang.String r7 = (java.lang.String) r7
                com.avito.android.license.mvi.entity.LicenseInternalAction$ShowLicenses r3 = new com.avito.android.license.mvi.entity.LicenseInternalAction$ShowLicenses
                r3.<init>(r7)
                r6.f181526r = r4
                r6.f181525q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L67
                return r0
            L67:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.license.mvi.a.C5334a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.license.data.b bVar) {
        this.f181524a = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<LicenseInternalAction> a() {
        return C43175k.G(new C5334a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
