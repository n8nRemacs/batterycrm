package com.avito.android.mortgage.root.mvi.domain;

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

/* compiled from: DeleteApplicantUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/l;", "Lcom/avito/android/mortgage/root/mvi/domain/k;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.root.mvi.domain.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32698l implements InterfaceC32697k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f203091a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.util.d f203092b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f203093c;

    /* compiled from: DeleteApplicantUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.DeleteApplicantUseCaseImpl$deleteApplicantAndReloadApplication$1", f = "DeleteApplicantUseCase.kt", i = {0, 1, 3}, l = {31, 34, 36, 40, 42, 44}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.root.mvi.domain.l$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203094q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203095r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203097t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f203098u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203097t = str;
            this.f203098u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C32698l.this.new a(this.f203097t, this.f203098u, continuation);
            aVar.f203095r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.C32698l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public C32698l(@Y61.k h31.e<IZ.a> eVar, @Y61.k com.avito.android.mortgage.util.d dVar, @Y61.k R0 r02) {
        this.f203091a = eVar;
        this.f203092b = dVar;
        this.f203093c = r02;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.InterfaceC32697k
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f203093c.a(), C43175k.G(new a(str, str2, null)));
    }
}
