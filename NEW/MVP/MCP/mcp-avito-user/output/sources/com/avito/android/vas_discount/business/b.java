package com.avito.android.vas_discount.business;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;
import mL0.InterfaceC43978a;

/* compiled from: DiscountRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/business/b;", "Lcom/avito/android/vas_discount/business/a;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.vas_discount.business.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43978a f319612a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f319613b;

    /* compiled from: DiscountRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/vas_discount/remote/model/DiscountResponse;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f319614b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public b(@k InterfaceC43978a interfaceC43978a, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f319612a = interfaceC43978a;
        this.f319613b = interfaceC35745a5;
    }

    @Override // com.avito.android.vas_discount.business.a
    @k
    public final z<P2<DiscountResponse>> a(@l String str) {
        return this.f319612a.b(str).x0(this.f319613b.a()).d0(a.f319614b).r0(P2.c.f318721a);
    }
}
