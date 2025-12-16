package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.Z0;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.A1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsListMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectViewModelState$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {662}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class B extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314819q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35662a f314820r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f314821s;

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.adapter.d f314822b;

        public a(com.avito.konveyor.adapter.d dVar) {
            this.f314822b = dVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f314822b.l((List) obj, null);
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f314822b, com.avito.konveyor.adapter.d.class, "submitList", "submitList(Ljava/util/List;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C35662a c35662a, UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f314820r = c35662a;
        this.f314821s = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B(this.f314820r, this.f314821s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((B) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iK;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314819q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.konveyor.adapter.d dVar = this.f314821s.f314850s0;
            if (dVar == null) {
                dVar = null;
            }
            a aVar = new a(dVar);
            this.f314819q = 1;
            C35662a c35662a = this.f314820r;
            Z0 z02 = c35662a.f314906f;
            z02.getClass();
            kotlin.reflect.n<Object> nVar = Z0.f67595D[20];
            boolean zBooleanValue = ((Boolean) z02.f67620w.a().invoke()).booleanValue();
            W60.d dVar2 = c35662a.f314903c;
            j jVar = c35662a.f314904d;
            F f12 = c35662a.f314902b;
            if (zBooleanValue) {
                interfaceC43160iK = new A1(new InterfaceC43160i[]{f12.getState(), jVar.getState(), dVar2.getState(), c35662a.f314905e.getState()}, C35668g.f315156b);
            } else {
                interfaceC43160iK = C43175k.k(f12.getState(), jVar.getState(), dVar2.getState(), C35669h.f315157b);
            }
            Object objCollect = C43175k.I(c35662a.f314901a.c(), C43175k.r(new C35667f(new C35666e(interfaceC43160iK)))).collect(aVar, this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = G0.f406611a;
            }
            if (objCollect == coroutine_suspended) {
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
