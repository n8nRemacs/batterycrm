package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.util.R0;
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

/* compiled from: CreateApplicantUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/i;", "Lcom/avito/android/mortgage/root/mvi/domain/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.root.mvi.domain.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32695i implements InterfaceC32694h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f203080a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.util.d f203081b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f203082c;

    /* compiled from: CreateApplicantUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.CreateApplicantUseCaseImpl$createApplicantAndReloadApplication$1", f = "CreateApplicantUseCase.kt", i = {0, 1, 3}, l = {32, 35, 37, 41, 43, 45}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.root.mvi.domain.i$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203083q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203084r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203086t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ApplicantType f203087u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ApplicantType applicantType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203086t = str;
            this.f203087u = applicantType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C32695i.this.new a(this.f203086t, this.f203087u, continuation);
            aVar.f203084r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.C32695i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public C32695i(@Y61.k h31.e<IZ.a> eVar, @Y61.k com.avito.android.mortgage.util.d dVar, @Y61.k R0 r02) {
        this.f203080a = eVar;
        this.f203081b = dVar;
        this.f203082c = r02;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.InterfaceC32694h
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k ApplicantType applicantType, @Y61.k String str) {
        return C43175k.I(this.f203082c.a(), C43175k.G(new a(str, applicantType, null)));
    }
}
