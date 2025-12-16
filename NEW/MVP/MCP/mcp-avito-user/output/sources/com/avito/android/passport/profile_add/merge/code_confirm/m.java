package com.avito.android.passport.profile_add.merge.code_confirm;

import Y41.q;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import b60.InterfaceC25416a;
import c60.InterfaceC26947a;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: CodeConfirmViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/m;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "Lcom/avito/android/passport/profile_add/merge/code_confirm/view_state/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m extends M0 implements com.avito.android.arch.mvi.android.k<Object, com.avito.android.passport.profile_add.merge.code_confirm.view_state.b, Object> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final R0 f212731E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC25416a, CodeConfirmInternalAction, b60.c, b60.b> f212732J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC26947a, CodeRequestInternalAction, c60.c, c60.b> f212733K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.passport.profile_add.merge.code_confirm.view_state.b> f212734L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m f212735M;

    /* compiled from: CodeConfirmViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmViewModel$accept$1", f = "CodeConfirmViewModel.kt", i = {}, l = {52, 53}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212736q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f212737r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ m f212738s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, m mVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212737r = obj;
            this.f212738s = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f212737r, this.f212738s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212736q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f212737r;
                boolean z12 = obj2 instanceof InterfaceC26947a;
                m mVar = this.f212738s;
                if (z12) {
                    com.avito.android.arch.mvi.c<InterfaceC26947a, CodeRequestInternalAction, c60.c, c60.b> cVar = mVar.f212733K;
                    this.f212736q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC25416a) {
                    com.avito.android.arch.mvi.c<InterfaceC25416a, CodeConfirmInternalAction, b60.c, b60.b> cVar2 = mVar.f212732J;
                    this.f212736q = 2;
                    if (cVar2.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CodeConfirmViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements q<c60.c, b60.c, Continuation<? super com.avito.android.passport.profile_add.merge.code_confirm.view_state.b>, Object>, SuspendFunction {
        @Override // Y41.q
        public final Object invoke(c60.c cVar, b60.c cVar2, Continuation<? super com.avito.android.passport.profile_add.merge.code_confirm.view_state.b> continuation) {
            ((com.avito.android.passport.profile_add.merge.code_confirm.view_state.c) this.receiver).getClass();
            return com.avito.android.passport.profile_add.merge.code_confirm.view_state.c.a(cVar, cVar2);
        }
    }

    @Inject
    public m(@Y61.k com.avito.android.passport.profile_add.merge.code_request.mvi.f fVar, @Y61.k com.avito.android.passport.profile_add.merge.code_confirm.mvi.j jVar, @Y61.k CodeConfirmArgs codeConfirmArgs, @Y61.k com.avito.android.passport.profile_add.merge.code_confirm.view_state.c cVar, @Y61.k R0 r02) {
        this.f212731E = r02;
        com.avito.android.arch.mvi.c<InterfaceC25416a, CodeConfirmInternalAction, b60.c, b60.b> cVarB = com.avito.android.arch.mvi.q.b(jVar, null, null, 3);
        this.f212732J = cVarB;
        com.avito.android.arch.mvi.c<InterfaceC26947a, CodeRequestInternalAction, c60.c, c60.b> cVarB2 = com.avito.android.arch.mvi.q.b(fVar, new c60.c(false, false, false, null, null, codeConfirmArgs.f212681c, 31, null), null, 2);
        this.f212733K = cVarB2;
        C1 c12 = new C1(cVarB2, cVarB, new b(3, cVar, com.avito.android.passport.profile_add.merge.code_confirm.view_state.c.class, "mapToViewState", "mapToViewState(Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestState;Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmState;)Lcom/avito/android/passport/profile_add/merge/code_confirm/view_state/CodeConfirmViewState;", 4));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        c60.c cVar2 = cVarB2.f91929r.get();
        b60.c cVar3 = cVarB.f91929r.get();
        cVar.getClass();
        this.f212734L = C43175k.U(c12, aVarA, i2Var, com.avito.android.passport.profile_add.merge.code_confirm.view_state.c.a(cVar2, cVar3));
        this.f212735M = C43175k.N(cVarB2.f91928q, cVarB.f91928q);
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(N0.a(this), this.f212731E.b(), null, new a(obj, this, null), 2);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return this.f212735M;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<com.avito.android.passport.profile_add.merge.code_confirm.view_state.b> getState() {
        return this.f212734L;
    }
}
