package kotlinx.datetime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;

/* compiled from: TimeZoneJvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/z;", "", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.z.class)
/* loaded from: classes8.dex */
public class z {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final k f412687b = new k(new D(ZoneOffset.UTC));

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ZoneId f412688a;

    /* compiled from: TimeZoneJvm.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/z$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/z;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static z a(@Y61.k ZoneId zoneId) {
            boolean zIsFixedOffset;
            if (zoneId instanceof ZoneOffset) {
                return new k(new D((ZoneOffset) zoneId));
            }
            try {
                zIsFixedOffset = zoneId.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                zIsFixedOffset = false;
            }
            if (!zIsFixedOffset) {
                return new z(zoneId);
            }
            return new k(zoneId);
        }

        @Y61.k
        public final KSerializer<z> serializer() {
            return kotlinx.datetime.serializers.z.f412679a;
        }

        public Companion() {
        }
    }

    public z(@Y61.k ZoneId zoneId) {
        this.f412688a = zoneId;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                if (L.f(this.f412688a, ((z) obj).f412688a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f412688a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f412688a.toString();
    }
}
