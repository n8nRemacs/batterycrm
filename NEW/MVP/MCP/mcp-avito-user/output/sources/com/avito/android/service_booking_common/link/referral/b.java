package com.avito.android.service_booking_common.link.referral;

import Bs0.InterfaceC13182a;
import Hq0.C14020b;
import Y61.k;
import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: ServiceBookingReferralInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/link/referral/b;", "Lcom/avito/android/service_booking_common/link/referral/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_common.link.referral.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC13182a> f276655a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f276656b;

    /* compiled from: ServiceBookingReferralInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f276657b = new a<>();

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

    /* compiled from: ServiceBookingReferralInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_common.link.referral.b$b, reason: collision with other inner class name */
    public static final class C8221b<T, R> implements o {
        public C8221b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.a(b.this.f276656b.a((Throwable) obj));
        }
    }

    @Inject
    public b(@k h31.e<InterfaceC13182a> eVar, @k com.avito.android.remote.error.f fVar) {
        this.f276655a = eVar;
        this.f276656b = fVar;
    }

    @Override // com.avito.android.service_booking_common.link.referral.a
    @k
    public final z<P2<SimpleMessageResult>> a(@k String str) {
        return new C42007e(new C14020b(18, this, str)).F().d0(a.f276657b).m0(new C8221b()).r0(P2.c.f318721a);
    }
}
