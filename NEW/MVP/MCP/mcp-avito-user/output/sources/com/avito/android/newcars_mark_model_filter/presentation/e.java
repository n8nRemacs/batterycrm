package com.avito.android.newcars_mark_model_filter.presentation;

import Y41.p;
import Y61.l;
import com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.model.k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import o30.InterfaceC44575a;

/* compiled from: NewCarsBrandModelFilterFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment$subscribeToModelSelect$1", f = "NewCarsBrandModelFilterFragment.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207310q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ NewCarsBrandModelFilterFragment f207311r;

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/model/k;", "selectInfo", "Lkotlin/G0;", "emit", "(Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/model/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewCarsBrandModelFilterFragment f207312b;

        public a(NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment) {
            this.f207312b = newCarsBrandModelFilterFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            k kVar = (k) obj;
            NewCarsBrandModelFilterFragment.a aVar = NewCarsBrandModelFilterFragment.f207276u0;
            this.f207312b.f5().accept(new InterfaceC44575a.g(kVar.f207404a, kVar.f207405b));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f207311r = newCarsBrandModelFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f207311r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f207310q;
        if (i12 == 0) {
            C42729a0.b(obj);
            NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = this.f207311r;
            com.avito.android.newcars_mark_model_filter.presentation.recycler.model.e eVar = newCarsBrandModelFilterFragment.f207286q0;
            if (eVar == null) {
                eVar = null;
            }
            e2 f207400b = eVar.getF207400b();
            a aVar = new a(newCarsBrandModelFilterFragment);
            this.f207310q = 1;
            f207400b.getClass();
            if (e2.g(f207400b, aVar, this) == coroutine_suspended) {
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
