package com.avito.android.auto_loans_cabinet.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoLoanCabinetInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/b;", "Lcom/avito/android/auto_loans_cabinet/domain/a;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.auto_loans_cabinet.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f95372a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.auto_loans_cabinet.data.a f95373b;

    /* compiled from: AutoLoanCabinetInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auto_loans_cabinet.domain.AutoLoanCabinetInteractorImpl$getBlanksStatus$1", f = "AutoLoanCabinetInteractor.kt", i = {0, 1, 2, 2}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "blankStatus"}, s = {"L$0", "L$0", "L$0", "L$3"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AutoLoansCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f95374q;

        /* renamed from: r, reason: collision with root package name */
        public b f95375r;

        /* renamed from: s, reason: collision with root package name */
        public e f95376s;

        /* renamed from: t, reason: collision with root package name */
        public int f95377t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f95378u;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f95378u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutoLoansCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(1:(1:(3:8|59|60)(2:9|10))(8:11|38|(1:40)(3:41|(1:43)(2:45|(1:47)(2:48|(1:50)(2:52|53)))|44)|51|54|(2:56|(1:58))|59|60))(11:12|63|13|14|26|32|(2:34|(1:36)(4:37|38|(0)(0)|51))|54|(0)|59|60))(1:17))(2:19|(1:21))|18|61|22|(1:24)(8:25|26|32|(0)|54|(0)|59|60)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_loans_cabinet.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.auto_loans_cabinet.data.a aVar) {
        this.f95372a = interfaceC28373a;
        this.f95373b = aVar;
    }

    @Override // com.avito.android.auto_loans_cabinet.domain.a
    @k
    public final InterfaceC43160i<AutoLoansCabinetInternalAction> a() {
        return C43175k.G(new a(null));
    }
}
