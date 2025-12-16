package ru.cyberity.input.fingerprintingsignals;

import Y61.k;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.input.fingerprintingsignals.r;
import ru.cyberity.input.signalproviders.StabilityLevel;

/* compiled from: FingerprintingSignals.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/z;", "Lru/cyberity/fingerprint/fingerprintingsignals/r;", "", "value", "<init>", "(Z)V", "", "a", "()Ljava/lang/String;", "", "d", "()Ljava/util/Map;", "Z", "f", "()Ljava/lang/Boolean;", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class z extends r<Boolean> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    private static final r.a f435990c = new r.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean value;

    /* compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/z$a;", "", "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", RequestReviewResultKt.INFO_TYPE, "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "a", "()Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.fingerprintingsignals.z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final r.a a() {
            return z.f435990c;
        }

        private Companion() {
        }
    }

    public z(boolean z12) {
        super(null);
        this.value = z12;
    }

    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public String a() {
        return String.valueOf(f().booleanValue());
    }

    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public Map<String, String> d() {
        return Collections.singletonMap("is_pin_security_enabled", String.valueOf(f().booleanValue()));
    }

    @k
    public Boolean f() {
        return Boolean.valueOf(this.value);
    }
}
