package com.avito.android.profile.pro.impl.screen;

import com.avito.android.avito_finance_user_profile.view.item.g;
import com.avito.android.profile.pro.impl.screen.y;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import pg.InterfaceC47075a;

/* compiled from: ProfileProFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectAvitoFinanceItemActions$1", f = "ProfileProFragment.kt", i = {}, l = {854}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile.pro.impl.screen.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33363g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f222961q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f222962r;

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/g;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avito_finance_user_profile/view/item/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.pro.impl.screen.g$a */
    public static final class a extends N implements Y41.l<com.avito.android.avito_finance_user_profile.view.item.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment f222963l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfileProFragment profileProFragment) {
            super(1);
            this.f222963l = profileProFragment;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.avito_finance_user_profile.view.item.g gVar) {
            com.avito.android.avito_finance_user_profile.view.item.g gVar2 = gVar;
            boolean z12 = gVar2 instanceof g.a;
            ProfileProFragment profileProFragment = this.f222963l;
            if (z12) {
                int i12 = ProfileProFragment.f222861X0;
                profileProFragment.D5().accept(new InterfaceC47075a.C12282a(((g.a) gVar2).f98003a));
            } else if (gVar2 instanceof g.b) {
                int i13 = ProfileProFragment.f222861X0;
                g.b bVar = (g.b) gVar2;
                profileProFragment.D5().accept(new InterfaceC47075a.c(bVar.f98004a, bVar.f98005b, bVar.f98006c, bVar.f98007d));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33363g(ProfileProFragment profileProFragment, Continuation<? super C33363g> continuation) {
        super(2, continuation);
        this.f222962r = profileProFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C33363g(this.f222962r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C33363g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f222961q;
        ProfileProFragment profileProFragment = this.f222962r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f222961q = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
                rVar.p();
                a aVar = new a(profileProFragment);
                com.avito.android.profile.pro.impl.screen.item.avito_finance.item.d dVar = profileProFragment.f222879R0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.f223006c = new y.b(aVar);
                Object objO = rVar.o();
                if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            com.avito.android.profile.pro.impl.screen.item.avito_finance.item.d dVar2 = profileProFragment.f222879R0;
            if (dVar2 == null) {
                dVar2 = null;
            }
            dVar2.f223006c = null;
            return G0.f406611a;
        } catch (Throwable th2) {
            com.avito.android.profile.pro.impl.screen.item.avito_finance.item.d dVar3 = profileProFragment.f222879R0;
            if (dVar3 == null) {
                dVar3 = null;
            }
            dVar3.f223006c = null;
            throw th2;
        }
    }
}
