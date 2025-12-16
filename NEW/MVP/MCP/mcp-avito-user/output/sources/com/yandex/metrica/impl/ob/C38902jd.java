package com.yandex.metrica.impl.ob;

import com.yandex.metrica.modules.api.ModuleEntryPoint;
import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* renamed from: com.yandex.metrica.impl.ob.jd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38902jd implements InterfaceC38927kd, InterfaceC38932ki {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<ModuleEntryPoint> f380896a = new CopyOnWriteArrayList<>();

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public void a(@Y61.k EnumC38833gi enumC38833gi, @Y61.l C39057pi c39057pi) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38927kd
    @Y61.k
    public List<String> b() {
        List listA;
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f380896a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfigurationB = ((ModuleEntryPoint) it.next()).b();
            if (remoteConfigExtensionConfigurationB == null || (listA = remoteConfigExtensionConfigurationB.a()) == null) {
                listA = C42784z0.f406748b;
            }
            C42745f0.h(listA, arrayList);
        }
        return arrayList;
    }

    @Y61.k
    public Map<String, C38853hd> c() {
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f380896a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint moduleEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfigurationB = moduleEntryPoint.b();
            kotlin.Q q12 = remoteConfigExtensionConfigurationB != null ? new kotlin.Q(moduleEntryPoint.a(), new C38853hd(remoteConfigExtensionConfigurationB)) : null;
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        return kotlin.collections.P0.p(arrayList);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38927kd
    @Y61.k
    public Map<String, Integer> a() {
        Iterable iterableO;
        Map mapB;
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f380896a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfigurationB = ((ModuleEntryPoint) it.next()).b();
            if (remoteConfigExtensionConfigurationB == null || (mapB = remoteConfigExtensionConfigurationB.b()) == null || (iterableO = kotlin.collections.P0.o(mapB)) == null) {
                iterableO = C42784z0.f406748b;
            }
            C42745f0.h(iterableO, arrayList);
        }
        return kotlin.collections.P0.p(arrayList);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public void a(@Y61.k C39057pi c39057pi) {
        C38878id c38878id = new C38878id(c39057pi);
        for (ModuleEntryPoint moduleEntryPoint : this.f380896a) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfigurationB = moduleEntryPoint.b();
            if (remoteConfigExtensionConfigurationB != null) {
                c38878id.a(moduleEntryPoint.a());
                remoteConfigExtensionConfigurationB.d().a();
            }
        }
    }
}
