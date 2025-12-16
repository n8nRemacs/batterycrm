package com.avito.android.mortgage.selected_appeal.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.selected_appeal.mvi.entity.SelectedAppealInternalAction;
import com.avito.android.util.R0;
import h31.e;
import i00.InterfaceC41203a;
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

/* compiled from: UnselectAppealUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/domain/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f203464a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<InterfaceC41203a> f203465b;

    /* compiled from: UnselectAppealUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.selected_appeal.mvi.domain.UnselectAppealUseCase$invoke$1", f = "UnselectAppealUseCase.kt", i = {0, 1}, l = {21, 23, 32, 34, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.selected_appeal.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C6056a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203466q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203467r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203469t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f203470u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6056a(String str, String str2, Continuation<? super C6056a> continuation) {
            super(2, continuation);
            this.f203469t = str;
            this.f203470u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6056a c6056a = a.this.new C6056a(this.f203469t, this.f203470u, continuation);
            c6056a.f203467r = obj;
            return c6056a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6056a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.selected_appeal.mvi.domain.a.C6056a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k R0 r02, @k e<InterfaceC41203a> eVar) {
        this.f203464a = r02;
        this.f203465b = eVar;
    }

    @k
    public final InterfaceC43160i<SelectedAppealInternalAction> a(@k String str, @k String str2) {
        return C43175k.I(this.f203464a.a(), C43175k.G(new C6056a(str, str2, null)));
    }
}
