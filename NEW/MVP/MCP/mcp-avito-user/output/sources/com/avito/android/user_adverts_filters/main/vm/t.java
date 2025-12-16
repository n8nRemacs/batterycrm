package com.avito.android.user_adverts_filters.main.vm;

import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import qJ0.InterfaceC47308d;

/* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersMainMviViewModel$prepareDelegates$4", f = "UserAdvertsFiltersMainMviViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f316466q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsFiltersBeduinScreen f316467r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f316468s;

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Z1<InterfaceC47308d> f316469b;

        public a(Z1<InterfaceC47308d> z12) {
            this.f316469b = z12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objEmit = this.f316469b.emit((InterfaceC47308d) obj, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(2, this.f316469b, Z1.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, h hVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f316467r = userAdvertsFiltersBeduinScreen;
        this.f316468s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new t(this.f316467r, this.f316468s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        n2<InterfaceC47308d.a> n2Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f316466q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen = this.f316467r;
            if (userAdvertsFiltersBeduinScreen != null) {
                h hVar = this.f316468s;
                com.avito.android.user_adverts_filters.main.vm.a aVar = (com.avito.android.user_adverts_filters.main.vm.a) hVar.f316408R.f316422b.get(userAdvertsFiltersBeduinScreen);
                if (aVar != null && (n2Var = aVar.f316372d) != null) {
                    a aVar2 = new a((Z1) hVar.f316407Q.getValue());
                    this.f316466q = 1;
                    if (n2Var.collect(aVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        throw new KotlinNothingValueException();
    }
}
