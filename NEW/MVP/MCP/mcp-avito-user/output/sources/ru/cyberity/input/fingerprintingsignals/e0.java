package ru.cyberity.input.fingerprintingsignals;

import Y61.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import ru.cyberity.input.fingerprintingsignals.r;
import ru.cyberity.input.infoproviders.i;
import ru.cyberity.input.signalproviders.StabilityLevel;

/* compiled from: FingerprintingSignals.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/e0;", "Lru/cyberity/fingerprint/fingerprintingsignals/r;", "Lru/cyberity/fingerprint/infoproviders/i;", "", "a", "()Ljava/lang/String;", "", "d", "()Ljava/util/Map;", "Lru/cyberity/fingerprint/infoproviders/i;", "f", "()Lru/cyberity/fingerprint/infoproviders/i;", "value", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e0 extends r<i> {

    /* renamed from: c, reason: collision with root package name */
    @k
    private static final r.a f435743c = new r.a(StabilityLevel.STABLE);

    /* renamed from: d, reason: collision with root package name */
    @k
    private static final Set<String> f435744d = Collections.singleton("processor");

    /* renamed from: e, reason: collision with root package name */
    @k
    private static final Set<String> f435745e = C42756l.l0(new String[]{"bogomips", "cpu mhz"});

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final i value;

    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getValue().d());
        sb2.append(getValue().e());
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public Map<String, String> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = getValue().d().iterator();
        while (it.hasNext()) {
            linkedHashMap.get("proc_cpu_info.common." + s.b((String) ((Q) it.next()).f406619b));
        }
        int i12 = 0;
        for (Object obj : getValue().e()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                linkedHashMap.get("proc_cpu_info.processor." + i12 + '.' + s.b((String) ((Q) it2.next()).f406619b));
            }
            i12 = i13;
        }
        return linkedHashMap;
    }

    @k
    /* renamed from: f, reason: from getter */
    public i getValue() {
        return this.value;
    }
}
