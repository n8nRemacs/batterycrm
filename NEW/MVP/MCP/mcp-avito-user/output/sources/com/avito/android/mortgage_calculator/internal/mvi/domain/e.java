package com.avito.android.mortgage_calculator.internal.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
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
import t10.InterfaceC48457a;

/* compiled from: LoadOffersUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/domain/e;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC48457a> f204529a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_calculator.internal.mvi.mapper.d f204530b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f204531c;

    /* compiled from: LoadOffersUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.domain.LoadOffersUseCase$loadOffers$1", f = "LoadOffersUseCase.kt", i = {0, 1}, l = {37, 44, 58, 59}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ long f204532A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ long f204533B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ Long f204534C;

        /* renamed from: q, reason: collision with root package name */
        public int f204535q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f204536r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CalculatorTabType f204537s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ e f204538t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f204539u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f204540v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Long f204541w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Long f204542x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f204543y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f204544z;

        /* compiled from: LoadOffersUseCase.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.domain.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6097a {
            static {
                int[] iArr = new int[CalculatorTabType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    CalculatorTabType.a aVar = CalculatorTabType.f204618c;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CalculatorTabType calculatorTabType, e eVar, String str, String str2, Long l12, Long l13, long j12, String str3, long j13, long j14, Long l14, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f204537s = calculatorTabType;
            this.f204538t = eVar;
            this.f204539u = str;
            this.f204540v = str2;
            this.f204541w = l12;
            this.f204542x = l13;
            this.f204543y = j12;
            this.f204544z = str3;
            this.f204532A = j13;
            this.f204533B = j14;
            this.f204534C = l14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f204537s, this.f204538t, this.f204539u, this.f204540v, this.f204541w, this.f204542x, this.f204543y, this.f204544z, this.f204532A, this.f204533B, this.f204534C, continuation);
            aVar.f204536r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.mvi.domain.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@k h31.e<InterfaceC48457a> eVar, @k com.avito.android.mortgage_calculator.internal.mvi.mapper.d dVar, @k R0 r02) {
        this.f204529a = eVar;
        this.f204530b = dVar;
        this.f204531c = r02;
    }

    @k
    public final InterfaceC43160i<CalculatorInternalAction> a(@k CalculatorTabType calculatorTabType, @k String str, @l String str2, long j12, @k String str3, @l Long l12, @l Long l13, @l Long l14, long j13, long j14) {
        return C43175k.I(this.f204531c.a(), C43175k.G(new a(calculatorTabType, this, str, str2, l12, l14, j12, str3, j13, j14, l13, null)));
    }
}
