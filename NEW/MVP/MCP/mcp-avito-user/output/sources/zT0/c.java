package ZT0;

import Y61.k;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalculationValueMultitypePools.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZT0/c;", "LZT0/a;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC36274k f20174a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f20175b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f20176c;

    public c(@k InterfaceC36274k interfaceC36274k) {
        this.f20174a = interfaceC36274k;
    }

    @Override // ZT0.a
    @k
    public final b d(@k String str) {
        boolean z12 = this.f20176c;
        InterfaceC36274k interfaceC36274k = this.f20174a;
        if (z12) {
            return new g(interfaceC36274k);
        }
        LinkedHashMap linkedHashMap = this.f20175b;
        Object dVar = linkedHashMap.get(str);
        if (dVar == null) {
            dVar = new d(interfaceC36274k, str);
            linkedHashMap.put(str, dVar);
        }
        return (b) dVar;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        if (this.f20176c) {
            return;
        }
        this.f20176c = true;
        LinkedHashMap linkedHashMap = this.f20175b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).destroy();
        }
        linkedHashMap.clear();
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF20174a() {
        return this.f20174a;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p, reason: from getter */
    public final boolean getF20176c() {
        return this.f20176c;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
    }
}
