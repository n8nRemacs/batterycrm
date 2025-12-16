package lj0;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MobileNetworkOperatorProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj0/c;", "Llj0/b;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lj0.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C43783c implements InterfaceC43782b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f414171a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f414172b;

    @Inject
    public C43783c(@k Application application, @k f fVar) {
        this.f414171a = application;
        this.f414172b = fVar;
    }

    @Override // lj0.InterfaceC43782b
    @l
    public final C43781a a() {
        NetworkCapabilities networkCapabilities;
        Application application = this.f414171a;
        Object systemService = application.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        boolean zHasTransport = false;
        if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            zHasTransport = networkCapabilities.hasTransport(1);
        }
        if (zHasTransport) {
            return null;
        }
        Object systemService2 = application.getSystemService("phone");
        TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
        int activeDataSubscriptionId = this.f414172b.f414176a.j() >= 30 ? SubscriptionManager.getActiveDataSubscriptionId() : SubscriptionManager.getDefaultDataSubscriptionId();
        TelephonyManager telephonyManagerCreateForSubscriptionId = (activeDataSubscriptionId == -1 || telephonyManager == null) ? null : telephonyManager.createForSubscriptionId(activeDataSubscriptionId);
        if (telephonyManagerCreateForSubscriptionId == null || telephonyManagerCreateForSubscriptionId.getSimState() == 1) {
            return null;
        }
        return new C43781a(telephonyManagerCreateForSubscriptionId.getNetworkOperatorName(), telephonyManagerCreateForSubscriptionId.getNetworkOperator());
    }
}
