package com.avito.android.mortgage.consultation.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction;
import com.avito.android.util.R0;
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

/* compiled from: MortgageAssignConsultationUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/domain/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.consultation.data.a f198558a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f198559b;

    /* compiled from: MortgageAssignConsultationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.consultation.domain.MortgageAssignConsultationUseCase$invoke$1", f = "MortgageAssignConsultationUseCase.kt", i = {1, 2}, l = {AvailableCode.HMS_IS_SPOOF, 38, 43, 51, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.consultation.domain.a$a, reason: collision with other inner class name */
    public static final class C5861a extends SuspendLambda implements p<InterfaceC43172j<? super MortgageConsultationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198560q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f198561r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f198562s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f198563t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f198564u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f198565v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f198566w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f198567x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f198568y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5861a(String str, String str2, a aVar, String str3, String str4, String str5, String str6, Continuation<? super C5861a> continuation) {
            super(2, continuation);
            this.f198562s = str;
            this.f198563t = str2;
            this.f198564u = aVar;
            this.f198565v = str3;
            this.f198566w = str4;
            this.f198567x = str5;
            this.f198568y = str6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C5861a c5861a = new C5861a(this.f198562s, this.f198563t, this.f198564u, this.f198565v, this.f198566w, this.f198567x, this.f198568y, continuation);
            c5861a.f198561r = obj;
            return c5861a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MortgageConsultationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C5861a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.consultation.domain.a.C5861a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.mortgage.consultation.data.a aVar, @k R0 r02) {
        this.f198558a = aVar;
        this.f198559b = r02;
    }

    @k
    public final InterfaceC43160i<MortgageConsultationInternalAction> a(@l String str, @l String str2, @k String str3, @k String str4, @k String str5, @k String str6) {
        return C43175k.I(this.f198559b.a(), C43175k.G(new C5861a(str4, str3, this, str, str2, str5, str6, null)));
    }
}
