package com.avito.android.passport.profile_add.merge.business_vrf_duplication;

import Y41.p;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: BusinessVrfDuplicationViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/k;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LZ50/a;", "LZ50/c;", "LZ50/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k extends M0 implements com.avito.android.arch.mvi.android.k<Z50.a, Z50.c, Z50.b> {

    /* renamed from: E, reason: collision with root package name */
    public final boolean f212496E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c, Z50.b> f212497J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c, Z50.b> f212498K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final n2<Z50.c> f212499L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m f212500M;

    /* compiled from: BusinessVrfDuplicationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.business_vrf_duplication.BusinessVrfDuplicationViewModel$accept$1", f = "BusinessVrfDuplicationViewModel.kt", i = {}, l = {32, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212501q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Z50.a f212503s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z50.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212503s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return k.this.new a(this.f212503s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212501q;
            if (i12 == 0) {
                C42729a0.b(obj);
                k kVar = k.this;
                boolean z12 = kVar.f212496E;
                Z50.a aVar = this.f212503s;
                if (z12) {
                    this.f212501q = 1;
                    if (kVar.f212498K.ya(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f212501q = 2;
                    if (kVar.f212497J.ya(aVar, this) == coroutine_suspended) {
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

    @Inject
    public k(@Y61.k com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.i iVar, @Y61.k com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi.i iVar2, boolean z12) {
        this.f212496E = z12;
        com.avito.android.arch.mvi.c<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c, Z50.b> cVarA = iVar.a(null, N0.a(this));
        this.f212497J = cVarA;
        com.avito.android.arch.mvi.c<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c, Z50.b> cVarA2 = iVar2.a(null, N0.a(this));
        this.f212498K = cVarA2;
        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(cVarA, cVarA2);
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        Z50.c.f19880e.getClass();
        this.f212499L = C43175k.U(mVarN, aVarA, i2Var, Z50.c.f19881f);
        this.f212500M = C43175k.N(cVarA.f91928q, cVarA2.f91928q);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Z50.b> getEvents() {
        return this.f212500M;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<Z50.c> getState() {
        return this.f212499L;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k Z50.a aVar) {
        C43259k.d(N0.a(this), null, null, new a(aVar, null), 3);
    }
}
