package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.personal_selections.view.d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserAdvertsListMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectPersonalSelectionItemActions$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {748}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class u extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315722q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f315723r;

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts/tab_screens/adverts/u$a", "Lcom/avito/android/personal_selections/view/d$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f315724a;

        public a(UserAdvertsListMviFragment userAdvertsListMviFragment) {
            this.f315724a = userAdvertsListMviFragment;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f315723r = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new u(this.f315723r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315722q;
        UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315723r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f315722q = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
                rVar.p();
                a aVar = new a(userAdvertsListMviFragment);
                com.avito.android.personal_selections.view.d dVar = userAdvertsListMviFragment.f314834F0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l7(aVar);
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
            com.avito.android.personal_selections.view.d dVar2 = userAdvertsListMviFragment.f314834F0;
            (dVar2 != null ? dVar2 : null).e();
            return G0.f406611a;
        } catch (Throwable th2) {
            com.avito.android.personal_selections.view.d dVar3 = userAdvertsListMviFragment.f314834F0;
            (dVar3 != null ? dVar3 : null).e();
            throw th2;
        }
    }
}
