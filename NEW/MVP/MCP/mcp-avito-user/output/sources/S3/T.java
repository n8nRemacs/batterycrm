package s3;

import com.avito.android.B2;
import com.avito.android.ab_tests.groups.ServicesNotificationAboutAnomalyLowPricesGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: ServicesNotificationAboutAnomalyLowPricesConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/T;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/ServicesNotificationAboutAnomalyLowPricesGroup;", "_avito-discouraged_avito-feature_services"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class T extends AbstractC48780d<ServicesNotificationAboutAnomalyLowPricesGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B2 f437363a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437364b = "notification_about_anomaly_low_prices";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437365c = true;

    public T(@Y61.k B2 b22) {
        this.f437363a = b22;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437365c() {
        return this.f437365c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437364b() {
        return this.f437364b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return ServicesNotificationAboutAnomalyLowPricesGroup.f67956c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (ServicesNotificationAboutAnomalyLowPricesGroup[]) ((AbstractC42734a) ServicesNotificationAboutAnomalyLowPricesGroup.f67959f).toArray(new ServicesNotificationAboutAnomalyLowPricesGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return ServicesNotificationAboutAnomalyLowPricesGroup.f67957d;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        B2 b22 = this.f437363a;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[45];
        return ((Boolean) b22.f67202R.a().invoke()).booleanValue();
    }
}
