package ru.cyberity.input.fingerprintingsignals;

import Y61.k;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.input.fingerprintingsignals.r;
import ru.cyberity.input.signalproviders.StabilityLevel;

/* compiled from: FingerprintingSignals.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000 \r2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/d0;", "Lru/cyberity/fingerprint/fingerprintingsignals/r;", "", "", "value", "<init>", "(Ljava/util/Map;)V", "a", "()Ljava/lang/String;", "d", "()Ljava/util/Map;", "Ljava/util/Map;", "f", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d0 extends r<Map<String, ? extends String>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    private static final r.a f435737c = new r.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final Map<String, String> value;

    /* compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/d0$a;", "", "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", RequestReviewResultKt.INFO_TYPE, "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "a", "()Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.fingerprintingsignals.d0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final r.a a() {
            return d0.f435737c;
        }

        private Companion() {
        }
    }

    public d0(@k Map<String, String> map) {
        super(null);
        this.value = map;
    }

    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = f().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append((String) entry.getKey());
            sb2.append((String) entry.getValue());
        }
        return sb2.toString();
    }

    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public Map<String, String> d() {
        Map<String, String> mapF = f();
        ArrayList arrayList = new ArrayList(mapF.size());
        for (Map.Entry<String, String> entry : mapF.entrySet()) {
            arrayList.add(new Q("proc_info." + s.b(entry.getKey()), entry.getValue()));
        }
        return P0.p(arrayList);
    }

    @k
    public Map<String, String> f() {
        return this.value;
    }
}
