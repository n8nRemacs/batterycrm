package com.avito.android.user_adverts_filters.main.vm;

import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import qJ0.InterfaceC47305a;
import rJ0.InterfaceC47555b;

/* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersMainMviViewModel$bindMainFeatureEvents$2$3", f = "UserAdvertsFiltersMainMviViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47555b f316449q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f316450r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, Continuation continuation, InterfaceC47555b interfaceC47555b) {
        super(2, continuation);
        this.f316449q = interfaceC47555b;
        this.f316450r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f316450r, continuation, this.f316449q);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Iterator<UserAdvertsFiltersBeduinScreen> it = ((InterfaceC47555b.d) this.f316449q).f429739a.iterator();
        while (it.hasNext()) {
            a aVar = (a) this.f316450r.f316408R.f316422b.get(it.next());
            if (aVar != null) {
                aVar.accept(InterfaceC47305a.d.f429165a);
            }
        }
        return G0.f406611a;
    }
}
