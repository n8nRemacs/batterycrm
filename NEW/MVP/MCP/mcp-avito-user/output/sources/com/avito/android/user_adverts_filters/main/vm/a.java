package com.avito.android.user_adverts_filters.main.vm;

import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import com.avito.android.user_adverts_filters.main.mvi_delegate.A;
import com.avito.android.user_adverts_filters.main.mvi_delegate.B;
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
import kotlin.jvm.internal.s0;
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
import qJ0.InterfaceC47305a;
import qJ0.InterfaceC47306b;
import qJ0.InterfaceC47307c;
import qJ0.InterfaceC47308d;

/* compiled from: UserAdvertsFiltersDelegateMviViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/a;", "Lcom/avito/android/arch/mvi/android/k;", "LqJ0/a;", "LqJ0/d$a;", "LqJ0/c;", "Ljava/io/Closeable;", "a", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.android.k<InterfaceC47305a, InterfaceC47308d.a, InterfaceC47307c>, Closeable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f316370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC47305a, InterfaceC47306b, InterfaceC47308d, InterfaceC47307c> f316371c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n2<InterfaceC47308d.a> f316372d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f316373e;

    /* compiled from: UserAdvertsFiltersDelegateMviViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/a$a;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_filters.main.vm.a$a, reason: collision with other inner class name */
    public static final class C9825a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final R0 f316374a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final B f316375b;

        @Inject
        public C9825a(@Y61.k R0 r02, @Y61.k B b12) {
            this.f316374a = r02;
            this.f316375b = b12;
        }
    }

    /* compiled from: UserAdvertsFiltersDelegateMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersDelegateMviViewModel$accept$1", f = "UserAdvertsFiltersDelegateMviViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316376q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47305a f316378s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC47305a interfaceC47305a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f316378s = interfaceC47305a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new b(this.f316378s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f316376q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<InterfaceC47305a, InterfaceC47306b, InterfaceC47308d, InterfaceC47307c> cVar = a.this.f316371c;
                this.f316376q = 1;
                if (cVar.emit(this.f316378s, this) == coroutine_suspended) {
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

    public a(R0 r02, UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel, A a12, UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, String str, C42822w c42822w) {
        C43238h c43238hA = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.d()));
        this.f316370b = c43238hA;
        com.avito.android.arch.mvi.c<InterfaceC47305a, InterfaceC47306b, InterfaceC47308d, InterfaceC47307c> cVarA = a12.a(new InterfaceC47308d.a(userAdvertsFiltersBeduinModel, null, null, null, null, str, 30, null), c43238hA);
        this.f316371c = cVarA;
        c cVar = new c(cVarA);
        i2.f411430a.getClass();
        this.f316372d = C43175k.U(cVar, c43238hA, i2.a.f411432b, new InterfaceC47308d.a(userAdvertsFiltersBeduinModel, null, null, null, null, str, 30, null));
        this.f316373e = C42727D.c(new com.avito.android.user_adverts_filters.main.vm.b(this));
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC47305a interfaceC47305a) {
        C43259k.d(this.f316370b, null, null, new b(interfaceC47305a, null), 3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        U.b(this.f316370b, null);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC47307c> getEvents() {
        return (InterfaceC43160i) this.f316373e.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<InterfaceC47308d.a> getState() {
        return this.f316372d;
    }
}
