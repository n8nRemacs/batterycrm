package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.remote.messenger.UserOnlineStatus;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import fa.InterfaceC40383a;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertSellerStatusInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/Q;", "Lcom/avito/android/advert_details_items/sellerprofile/O;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Q implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC40383a> f85588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f85589b;

    /* compiled from: AdvertSellerStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/messenger/UserOnlineStatus;", "apply", "(J)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f85591c;

        public a(String str) {
            this.f85591c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).longValue();
            Q q12 = Q.this;
            return q12.f85588a.get().b(this.f85591c).x0(q12.f85589b.a()).l0(P.f85587b);
        }
    }

    /* compiled from: AdvertSellerStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/messenger/UserOnlineStatus;", "it", "Lio/reactivex/rxjava3/core/w;", "", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f85592b;

        public b(String str) {
            this.f85592b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return com.avito.android.util.rx3.A.a(Long.valueOf(((UserOnlineStatus) ((TypedResult.Success) typedResult).getResult()).getTimeDiff()));
            }
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            V2.f318762a.c("AdvertSellerStatusInteractor", "Online status request failed for id=" + this.f85592b + ", error = " + ((TypedResult.Error) typedResult).getError().getF244063c(), null);
            return C41928w.f403335b;
        }
    }

    /* compiled from: AdvertSellerStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "timeDiff", "", "apply", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f85593b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            long jLongValue = ((Number) obj).longValue();
            boolean z12 = false;
            if (1 <= jLongValue && jLongValue < 151) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    @Inject
    public Q(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f85588a = eVar;
        this.f85589b = interfaceC35745a5;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.O
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> a(@Y61.k String str, boolean z12) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f85589b;
        io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(Boolean.valueOf(z12)), new C41933a0(io.reactivex.rxjava3.core.z.a0(30L, 60L, timeUnit, interfaceC35745a5.c()).y0(new a(str)).j0(interfaceC35745a5.c()), new b(str)).d0(c.f85593b));
        zVarQ.getClass();
        return zVarQ.D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L);
    }
}
