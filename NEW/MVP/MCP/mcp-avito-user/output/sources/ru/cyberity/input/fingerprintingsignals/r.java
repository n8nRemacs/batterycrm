package ru.cyberity.input.fingerprintingsignals;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.input.signalproviders.StabilityLevel;

/* compiled from: FingerprintingSignal.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH&¢\u0006\u0004\b\t\u0010\n\u0082\u0001,\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456¨\u00067"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/r;", "T", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "", "d", "()Ljava/util/Map;", "Lru/cyberity/fingerprint/fingerprintingsignals/a;", "Lru/cyberity/fingerprint/fingerprintingsignals/b;", "Lru/cyberity/fingerprint/fingerprintingsignals/c;", "Lru/cyberity/fingerprint/fingerprintingsignals/d;", "Lru/cyberity/fingerprint/fingerprintingsignals/e;", "Lru/cyberity/fingerprint/fingerprintingsignals/f;", "Lru/cyberity/fingerprint/fingerprintingsignals/g;", "Lru/cyberity/fingerprint/fingerprintingsignals/h;", "Lru/cyberity/fingerprint/fingerprintingsignals/i;", "Lru/cyberity/fingerprint/fingerprintingsignals/j;", "Lru/cyberity/fingerprint/fingerprintingsignals/k;", "Lru/cyberity/fingerprint/fingerprintingsignals/l;", "Lru/cyberity/fingerprint/fingerprintingsignals/m;", "Lru/cyberity/fingerprint/fingerprintingsignals/n;", "Lru/cyberity/fingerprint/fingerprintingsignals/o;", "Lru/cyberity/fingerprint/fingerprintingsignals/p;", "Lru/cyberity/fingerprint/fingerprintingsignals/q;", "Lru/cyberity/fingerprint/fingerprintingsignals/u;", "Lru/cyberity/fingerprint/fingerprintingsignals/v;", "Lru/cyberity/fingerprint/fingerprintingsignals/w;", "Lru/cyberity/fingerprint/fingerprintingsignals/x;", "Lru/cyberity/fingerprint/fingerprintingsignals/y;", "Lru/cyberity/fingerprint/fingerprintingsignals/z;", "Lru/cyberity/fingerprint/fingerprintingsignals/a0;", "Lru/cyberity/fingerprint/fingerprintingsignals/b0;", "Lru/cyberity/fingerprint/fingerprintingsignals/c0;", "Lru/cyberity/fingerprint/fingerprintingsignals/d0;", "Lru/cyberity/fingerprint/fingerprintingsignals/e0;", "Lru/cyberity/fingerprint/fingerprintingsignals/f0;", "Lru/cyberity/fingerprint/fingerprintingsignals/g0;", "Lru/cyberity/fingerprint/fingerprintingsignals/h0;", "Lru/cyberity/fingerprint/fingerprintingsignals/i0;", "Lru/cyberity/fingerprint/fingerprintingsignals/j0;", "Lru/cyberity/fingerprint/fingerprintingsignals/k0;", "Lru/cyberity/fingerprint/fingerprintingsignals/l0;", "Lru/cyberity/fingerprint/fingerprintingsignals/m0;", "Lru/cyberity/fingerprint/fingerprintingsignals/n0;", "Lru/cyberity/fingerprint/fingerprintingsignals/o0;", "Lru/cyberity/fingerprint/fingerprintingsignals/p0;", "Lru/cyberity/fingerprint/fingerprintingsignals/q0;", "Lru/cyberity/fingerprint/fingerprintingsignals/r0;", "Lru/cyberity/fingerprint/fingerprintingsignals/s0;", "Lru/cyberity/fingerprint/fingerprintingsignals/t0;", "Lru/cyberity/fingerprint/fingerprintingsignals/u0;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class r<T> {

    /* compiled from: FingerprintingSignal.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "", "Lru/cyberity/fingerprint/signalproviders/StabilityLevel;", "stabilityLevel", "<init>", "(Lru/cyberity/fingerprint/signalproviders/StabilityLevel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/fingerprint/signalproviders/StabilityLevel;", "b", "()Lru/cyberity/fingerprint/signalproviders/StabilityLevel;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final StabilityLevel stabilityLevel;

        public a(@k StabilityLevel stabilityLevel) {
            this.stabilityLevel = stabilityLevel;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.stabilityLevel == ((a) other).stabilityLevel;
        }

        public int hashCode() {
            return this.stabilityLevel.hashCode();
        }

        @k
        public String toString() {
            return "Info(stabilityLevel=" + this.stabilityLevel + ')';
        }
    }

    public /* synthetic */ r(C42822w c42822w) {
        this();
    }

    @k
    public abstract String a();

    @k
    public abstract Map<String, String> d();

    private r() {
    }
}
