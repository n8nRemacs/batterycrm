package com.avito.android.user_adverts_filters.main.vm;

import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
import com.avito.android.util.R0;
import java.io.Closeable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import rJ0.InterfaceC47554a;
import rJ0.InterfaceC47555b;

/* compiled from: UserAdvertsFiltersMainDelegateMviViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/e;", "Lcom/avito/android/arch/mvi/android/k;", "LrJ0/a;", "LrJ0/c;", "LrJ0/b;", "Ljava/io/Closeable;", "a", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.android.arch.mvi.android.k<InterfaceC47554a, rJ0.c, InterfaceC47555b>, Closeable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f316387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC47554a, MainFiltersInternalAction, rJ0.c, InterfaceC47555b> f316388c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n2<rJ0.c> f316389d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f316390e;

    /* compiled from: UserAdvertsFiltersMainDelegateMviViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/e$a;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final R0 f316391a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_adverts_filters.main.mvi_main.w f316392b;

        @Inject
        public a(@Y61.k R0 r02, @Y61.k com.avito.android.user_adverts_filters.main.mvi_main.w wVar) {
            this.f316391a = r02;
            this.f316392b = wVar;
        }
    }

    /* compiled from: UserAdvertsFiltersMainDelegateMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersMainDelegateMviViewModel$accept$1", f = "UserAdvertsFiltersMainDelegateMviViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316393q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47554a f316395s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC47554a interfaceC47554a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f316395s = interfaceC47554a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new b(this.f316395s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f316393q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<InterfaceC47554a, MainFiltersInternalAction, rJ0.c, InterfaceC47555b> cVar = e.this.f316388c;
                this.f316393q = 1;
                if (cVar.emit(this.f316395s, this) == coroutine_suspended) {
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

    public e(R0 r02, com.avito.android.user_adverts_filters.main.mvi_main.w wVar, C42822w c42822w) {
        C43238h c43238hA = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.d()));
        this.f316387b = c43238hA;
        com.avito.android.arch.mvi.c<InterfaceC47554a, MainFiltersInternalAction, rJ0.c, InterfaceC47555b> cVarB = com.avito.android.arch.mvi.q.b(wVar, null, c43238hA, 1);
        this.f316388c = cVarB;
        i2.f411430a.getClass();
        this.f316389d = C43175k.U(cVarB, c43238hA, i2.a.f411432b, cVarB.f91929r.get());
        this.f316390e = C42727D.c(new f(this));
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC47554a interfaceC47554a) {
        C43259k.d(this.f316387b, null, null, new b(interfaceC47554a, null), 3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        U.b(this.f316387b, null);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC47555b> getEvents() {
        return (InterfaceC43160i) this.f316390e.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<rJ0.c> getState() {
        return this.f316389d;
    }
}
