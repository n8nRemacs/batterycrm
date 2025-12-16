package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.passport.profile_add.l;
import com.avito.android.profile_settings.u;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import fJ0.InterfaceC40301a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsListMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectProfileSettingsState$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {541}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class v extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315725q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f315726r;

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/profile_settings/u$a;", "settingsIdempotencyKey", "Lcom/avito/android/passport/profile_add/l$a;", "reAgentProfileStateIdempotencyKey", "Lkotlin/Q;", "<anonymous>", "(Lcom/avito/android/profile_settings/u$a;Lcom/avito/android/passport/profile_add/l$a;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectProfileSettingsState$1$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<u.a, l.a, Continuation<? super Q<? extends u.a, ? extends l.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ u.a f315727q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ l.a f315728r;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(u.a aVar, l.a aVar2, Continuation<? super Q<? extends u.a, ? extends l.a>> continuation) {
            a aVar3 = new a(3, continuation);
            aVar3.f315727q = aVar;
            aVar3.f315728r = aVar2;
            return aVar3.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return new Q(this.f315727q, this.f315728r);
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/profile_settings/u$a;", "Lcom/avito/android/passport/profile_add/l$a;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f315729b;

        public b(UserAdvertsListMviFragment userAdvertsListMviFragment) {
            this.f315729b = userAdvertsListMviFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Q q12 = (Q) obj;
            u.a aVar = (u.a) q12.f406619b;
            l.a aVar2 = (l.a) q12.f406620c;
            UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315729b;
            if (!L.f(userAdvertsListMviFragment.u5().getState().getValue().f315389g, aVar.f228512a) || !L.f(userAdvertsListMviFragment.u5().getState().getValue().f315390h, aVar2.f212377a)) {
                userAdvertsListMviFragment.u5().accept(new InterfaceC40301a.b.c(aVar.f228512a, aVar2.f212377a));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super v> continuation) {
        super(2, continuation);
        this.f315726r = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new v(this.f315726r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((v) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315725q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315726r;
            com.avito.android.profile_settings.u uVar = userAdvertsListMviFragment.f314832D0;
            if (uVar == null) {
                uVar = null;
            }
            n2<u.a> n2VarB = uVar.b();
            com.avito.android.passport.profile_add.l lVar = userAdvertsListMviFragment.f314833E0;
            if (lVar == null) {
                lVar = null;
            }
            C1 c12 = new C1(n2VarB, lVar.b(), new a(3, null));
            b bVar = new b(userAdvertsListMviFragment);
            this.f315725q = 1;
            if (c12.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
