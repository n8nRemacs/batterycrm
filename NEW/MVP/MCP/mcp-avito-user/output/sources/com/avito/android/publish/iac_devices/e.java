package com.avito.android.publish.iac_devices;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.H;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDeviceConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacDevicesParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/iac_devices/e;", "Lcom/avito/android/publish/iac_devices/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f236035a;

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Boolean.valueOf(!((IacDevice) t12).f236031d), Boolean.valueOf(!((IacDevice) t13).f236031d));
        }
    }

    @Inject
    public e(@Y61.k H h12) {
        this.f236035a = h12;
    }

    @Override // com.avito.android.publish.iac_devices.d
    @Y61.k
    public final List<IacDevice> a(@Y61.k List<IacDeviceConfig> list, @Y61.k List<String> list2) {
        List<IacDeviceConfig> list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        for (IacDeviceConfig iacDeviceConfig : list3) {
            arrayList.add(new IacDevice(iacDeviceConfig.getName(), iacDeviceConfig.getId(), L.f(iacDeviceConfig.getId(), this.f236035a.getValue()), list2.contains(iacDeviceConfig.getId())));
        }
        return C42745f0.B0(new ArrayList(arrayList), new a());
    }

    @Override // com.avito.android.publish.iac_devices.d
    @Y61.k
    public final ArrayList b(@Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((IacDevice) obj).f236032e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((IacDevice) it.next()).f236030c);
        }
        return arrayList2;
    }
}
