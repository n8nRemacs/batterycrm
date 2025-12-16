package com.avito.android.loyalty.ui.criteria;

import Y41.p;
import androidx.compose.runtime.internal.P;
import bX.InterfaceC25576a;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.loyalty.ui.criteria.mvi.entity.CriteriaInternalAction;
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

/* compiled from: CriteriaInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/c;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25576a f183438a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CriteriaArgs f183439b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f183440c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f183441d;

    /* compiled from: CriteriaInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty.ui.criteria.CriteriaInteractor$getCriteriaData$1", f = "CriteriaInteractor.kt", i = {0, 1}, l = {21, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CriteriaInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f183442q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f183443r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f183443r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CriteriaInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty.ui.criteria.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@Y61.k InterfaceC25576a interfaceC25576a, @Y61.k CriteriaArgs criteriaArgs, @Y61.k R0 r02, @Y61.k e eVar) {
        this.f183438a = interfaceC25576a;
        this.f183439b = criteriaArgs;
        this.f183440c = r02;
        this.f183441d = eVar;
    }

    @Y61.k
    public final InterfaceC43160i<CriteriaInternalAction> a() {
        return C43175k.I(this.f183440c.a(), C43175k.G(new a(null)));
    }
}
