package com.avito.android.user_adverts.tab_screens.adverts;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.user_adverts.root_screen.adverts_host.i0;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35694d;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.K;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.L;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.P;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsListMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectTooltips$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {647}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class z extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315760q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f315761r;

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "it", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/d;", "<anonymous>", "(Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;)Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/d;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectTooltips$1$1$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {636}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC35693c, Continuation<? super InterfaceC35694d>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f315762q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f315763r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f315764s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f315764s = userAdvertsListMviFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f315764s, continuation);
            aVar.f315763r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC35693c interfaceC35693c, Continuation<? super InterfaceC35694d> continuation) {
            return ((a) create(interfaceC35693c, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f315762q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC35693c interfaceC35693c = (InterfaceC35693c) this.f315763r;
                UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315764s;
                C35695e c35695e = userAdvertsListMviFragment.f314857z0;
                if (c35695e == null) {
                    c35695e = null;
                }
                RecyclerView recyclerView = userAdvertsListMviFragment.f314844P0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                View view = userAdvertsListMviFragment.f314845Q0;
                View view2 = view != null ? view : null;
                this.f315762q = 1;
                obj = c35695e.i(interfaceC35693c, recyclerView, view2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/d;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f315765b = new b<>();

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            return G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectTooltips$1$invokeSuspend$$inlined$flatMapLatest$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC35694d>, Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f315766q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f315767r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f315768s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f315769t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation continuation) {
            super(3, continuation);
            this.f315769t = userAdvertsListMviFragment;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC35694d> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
            c cVar = new c(this.f315769t, continuation);
            cVar.f315767r = interfaceC43172j;
            cVar.f315768s = bool;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i c43210w;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f315766q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f315767r;
                if (((Boolean) this.f315768s).booleanValue()) {
                    UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315769t;
                    P p12 = userAdvertsListMviFragment.f314856y0;
                    if (p12 == null) {
                        p12 = null;
                    }
                    n2<UserAdvertsListState> state = userAdvertsListMviFragment.u5().getState();
                    a aVar = new a(userAdvertsListMviFragment, null);
                    p12.getClass();
                    c43210w = C43175k.Y(new K(state), new L(null, p12, aVar));
                } else {
                    c43210w = new C43210w(InterfaceC35694d.C9781d.f315632a);
                }
                this.f315766q = 1;
                if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f315761r = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new z(this.f315761r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315760q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315761r;
            i0 i0Var = userAdvertsListMviFragment.f314829A0;
            if (i0Var == null) {
                i0Var = null;
            }
            kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(C43175k.r(i0Var.ce()), new c(userAdvertsListMviFragment, null));
            InterfaceC43172j interfaceC43172j = b.f315765b;
            this.f315760q = 1;
            if (lVarY.collect(interfaceC43172j, this) == coroutine_suspended) {
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
