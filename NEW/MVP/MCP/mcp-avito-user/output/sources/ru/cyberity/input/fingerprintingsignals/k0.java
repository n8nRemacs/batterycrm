package ru.cyberity.input.fingerprintingsignals;

import Y61.k;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.input.fingerprintingsignals.r;
import ru.cyberity.input.signalproviders.StabilityLevel;

/* compiled from: FingerprintingSignals.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001:\u0001\bB!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR,\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/k0;", "Lru/cyberity/fingerprint/fingerprintingsignals/r;", "", "Lkotlin/Q;", "", "value", "<init>", "(Ljava/util/List;)V", "a", "()Ljava/lang/String;", "", "d", "()Ljava/util/Map;", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class k0 extends r<List<? extends Q<? extends String, ? extends String>>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    private static final r.a f435782c = new r.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<Q<String, String>> value;

    /* compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/k0$a;", "", "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", RequestReviewResultKt.INFO_TYPE, "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "a", "()Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.fingerprintingsignals.k0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final r.a a() {
            return k0.f435782c;
        }

        private Companion() {
        }
    }

    public k0(@k List<Q<String, String>> list) {
        super(null);
        this.value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = f().iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            sb2.append((String) q12.f406619b);
            sb2.append((String) q12.f406620c);
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public Map<String, String> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = 0;
        for (Object obj : f()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Q q12 = (Q) obj;
            linkedHashMap.put("security_provider." + i12 + '.' + ((String) q12.f406619b), q12.f406620c);
            i12 = i13;
        }
        return linkedHashMap;
    }

    @k
    public List<Q<String, String>> f() {
        return this.value;
    }
}
