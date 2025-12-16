package com.avito.android.loyalty.ui.quality_service_gray;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bX.InterfaceC25576a;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.entity.QualityServiceGrayInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: QualityServiceGrayInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/f;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC25576a f184057a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f184058b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final QualityServiceGrayArgs f184059c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f184060d;

    /* compiled from: QualityServiceGrayInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayInteractor$getQualityServiceGray$1", f = "QualityServiceGrayInteractor.kt", i = {0, 1}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184061q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f184062r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f184062r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0247  */
        /* JADX WARN: Type inference failed for: r13v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r13v13 */
        /* JADX WARN: Type inference failed for: r13v18, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v2, types: [bX.a] */
        /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 627
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty.ui.quality_service_gray.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@k InterfaceC25576a interfaceC25576a, @k R0 r02, @k QualityServiceGrayArgs qualityServiceGrayArgs, @k d dVar) {
        this.f184057a = interfaceC25576a;
        this.f184058b = r02;
        this.f184059c = qualityServiceGrayArgs;
        this.f184060d = dVar;
    }

    @k
    public final InterfaceC43160i<QualityServiceGrayInternalAction> a() {
        return C43175k.I(this.f184058b.a(), C43175k.G(new a(null)));
    }
}
