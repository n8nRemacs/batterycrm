package nR;

import Y61.k;
import com.avito.android.remote.model.LeasingApplicationCreationResponse;
import com.avito.android.remote.model.LeasingOffersResponse;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.util.C35866p0;
import dagger.internal.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: LeasingCalculatorJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LnR/b;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/p0;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_leasing-calculator"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nR.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44324b implements h<Set<C35866p0>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C44324b f415136a = new C44324b();

    @Override // javax.inject.Provider
    public final Object get() {
        C44323a.f415135a.getClass();
        return b1.g(new C35866p0(LeasingApplicationCreationResponse.class, P0.g(new Q("ok", LeasingApplicationCreationResponse.Ok.class), new Q(PaymentStateKt.PAYMENT_STATE_FAILED, LeasingApplicationCreationResponse.Error.class))), new C35866p0(LeasingOffersResponse.class, P0.g(new Q("ok", LeasingOffersResponse.Ok.class), new Q(PaymentStateKt.PAYMENT_STATE_FAILED, LeasingOffersResponse.Error.class))));
    }
}
