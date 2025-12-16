package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.maybe.s0;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.Objects;
import java.util.Optional;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: CartMenuIconInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/q;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/m;", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31174q implements InterfaceC31170m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31179w f176513a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f176514b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f176515c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f176516d;

    /* compiled from: CartMenuIconInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.cart_total_quantity.CartMenuIconInteractor$update$2", f = "CartMenuIconInteractor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.q$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f176517q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Integer f176519s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f176519s = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C31174q.this.new a(this.f176519s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f176517q;
            if (i12 == 0) {
                C42729a0.b(obj);
                AbstractC41768a abstractC41768aA = C31174q.this.f176513a.a(this.f176519s);
                this.f176517q = 1;
                if (C43292o.a(abstractC41768aA, this) == coroutine_suspended) {
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

    @Inject
    public C31174q(@Y61.k C31179w c31179w, @Y61.k F f12, @Y61.k com.avito.android.account.E e12, @Y61.k R0 r02) {
        this.f176513a = c31179w;
        this.f176514b = f12;
        this.f176515c = e12;
        this.f176516d = r02;
    }

    @Override // com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31170m
    @Y61.l
    public final Object a(@Y61.l Integer num, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f176516d.a(), new a(num, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Y61.k
    public final C42026y b() {
        String strA = this.f176515c.a();
        F f12 = this.f176514b;
        f12.getClass();
        io.reactivex.rxjava3.core.q k12 = strA == null ? C41928w.f403335b : new io.reactivex.rxjava3.internal.operators.maybe.K(new B(f12, strA, 0));
        io.reactivex.rxjava3.internal.operators.single.G g12 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC31181y(f12, 1));
        io.reactivex.rxjava3.internal.operators.maybe.Y yJ2 = k12.j(C.f176444b);
        Optional optionalEmpty = Optional.empty();
        Objects.requireNonNull(optionalEmpty, "defaultItem is null");
        return io.reactivex.rxjava3.core.I.G(g12, new s0(yJ2, optionalEmpty), D.f176445b).n(new C31172o(strA, this));
    }
}
