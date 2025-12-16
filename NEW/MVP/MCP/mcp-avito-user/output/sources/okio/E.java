package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HashingSource.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/E;", "Lokio/z;", "Lokio/e0;", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class E extends AbstractC44815z implements e0 {

    /* compiled from: HashingSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/E$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // okio.AbstractC44815z, okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) {
        long j13 = super.read(c44802l, j12);
        if (j13 != -1) {
            long j14 = c44802l.f420125c;
            long j15 = j14 - j13;
            Z z12 = c44802l.f420124b;
            while (j14 > j15) {
                z12 = z12.f420056g;
                j14 -= z12.f420052c - z12.f420051b;
            }
            if (j14 < c44802l.f420125c) {
                Object obj = null;
                obj.getClass();
                throw null;
            }
        }
        return j13;
    }
}
