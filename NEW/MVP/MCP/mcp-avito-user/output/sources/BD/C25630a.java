package bd;

import Y61.k;
import Zc.C19533a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: DeviceInfoEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbd/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bd.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C25630a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f57289b;

    public C25630a(@k C19533a c19533a) {
        Q q12 = new Q("device_model", c19533a.getDeviceModel());
        Q q13 = new Q("device_manufacturer", c19533a.getDeviceManufacturer());
        Q q14 = new Q("device_hardware", c19533a.getDeviceHardware());
        Q q15 = new Q("device_product", c19533a.getDeviceProduct());
        Q q16 = new Q("is_emulator", Boolean.valueOf(c19533a.getIsEmulator()));
        Q q17 = new Q("is_root", Boolean.valueOf(c19533a.getIsRoot()));
        Q q18 = new Q("cpu_cores", Integer.valueOf(c19533a.getCpuInfo().getCoresCount()));
        String architecture = c19533a.getCpuInfo().getArchitecture();
        Q q19 = new Q("cpu_architecture", architecture == null ? "unknown" : architecture);
        String model = c19533a.getCpuInfo().getModel();
        Q q22 = new Q("cpu_model", model == null ? "unknown" : model);
        String manufacturer = c19533a.getCpuInfo().getManufacturer();
        this.f57289b = new ParametrizedClickStreamEvent(7972, 1, P0.g(q12, q13, q14, q15, q16, q17, q18, q19, q22, new Q("cpu_manufacturer", manufacturer != null ? manufacturer : "unknown")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f57289b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f57289b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f57289b.f90248c;
    }
}
