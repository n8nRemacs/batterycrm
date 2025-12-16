package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import ru.cyberity.input.tools.threading.safe.c;

/* compiled from: SensorsInfoProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/d0;", "Lru/cyberity/fingerprint/infoproviders/c0;", "", "Lru/cyberity/fingerprint/infoproviders/b0;", "a", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "<init>", "(Landroid/hardware/SensorManager;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final SensorManager sensorManager;

    /* compiled from: SensorsInfoProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lru/cyberity/fingerprint/infoproviders/b0;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<List<? extends b0>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<b0> invoke() {
            List<Sensor> sensorList;
            SensorManager sensorManager = d0.this.sensorManager;
            if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null) {
                return C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList(C42745f0.q(sensorList, 10));
            for (Sensor sensor : sensorList) {
                arrayList.add(new b0(sensor.getName(), sensor.getVendor()));
            }
            return arrayList;
        }
    }

    public d0(@l SensorManager sensorManager) {
        this.sensorManager = sensorManager;
    }

    @Override // ru.cyberity.input.infoproviders.c0
    @k
    public List<b0> a() {
        Object objA = c.a(0L, new a(), 1, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = c42784z0;
        }
        return (List) objA;
    }
}
