package com.avito.android.advert.deeplinks.delivery;

import androidx.compose.runtime.internal.P;
import bk0.InterfaceC25671a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.B;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.rx3.y;

/* compiled from: RequestDeliveryInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery/q;", "Lcom/avito/android/advert/deeplinks/delivery/o;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<B> f68960a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC25671a> f68961b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f68962c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f68963d;

    /* compiled from: RequestDeliveryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f68964b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public q(@Y61.k h31.e<B> eVar, @Y61.k h31.e<InterfaceC25671a> eVar2, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k R0 r02) {
        this.f68960a = eVar;
        this.f68961b = eVar2;
        this.f68962c = fVar;
        this.f68963d = r02;
    }

    @Override // com.avito.android.advert.deeplinks.delivery.o
    @Y61.k
    public final z<P2<DeepLink>> a(@Y61.k String str, @Y61.l String str2) {
        return z.p(z.J0(z.c0(P2.c.f318721a)), new C42007e(new p(this, str, str2, 0)).r(a.f68964b).u(new androidx.room.rxjava3.b(this, 2)).F());
    }

    @Override // com.avito.android.advert.deeplinks.delivery.o
    @Y61.k
    public final C b(@Y61.k String str, @Y61.l String str2) {
        return y.b(C43175k.I(this.f68963d.a(), C43175k.G(new r(this, str2, str, null))));
    }
}
