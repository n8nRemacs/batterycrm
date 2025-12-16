package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Lm.C14411b;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: CartMenuIconInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LLm/b;", "result", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "apply", "(LLm/b;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31172o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f176510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31174q f176511c;

    public C31172o(String str, C31174q c31174q) {
        this.f176510b = str;
        this.f176511c = c31174q;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C14411b c14411b = (C14411b) obj;
        if (this.f176510b == null || c14411b.getQuantity() != null) {
            return io.reactivex.rxjava3.core.I.q(new TypedResult.Success(c14411b));
        }
        C31174q c31174q = this.f176511c;
        final C31179w c31179w = c31174q.f176513a;
        c31179w.getClass();
        return new C42007e(new l41.s() { // from class: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.t
            @Override // l41.s
            public final Object get() {
                return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new C31177u(c31179w, null)).r(C31178v.f176533b);
            }
        }).z(c31179w.f176535b.a()).n(new C31173p(c31174q));
    }
}
