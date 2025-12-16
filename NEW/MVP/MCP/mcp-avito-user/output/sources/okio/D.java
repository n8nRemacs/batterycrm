package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HashingSink.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/D;", "Lokio/y;", "Lokio/c0;", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class D extends AbstractC44814y implements c0 {

    /* compiled from: HashingSink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/D$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // okio.AbstractC44814y, okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) {
        C44799i.b(c44802l.f420125c, 0L, j12);
        Z z12 = c44802l.f420124b;
        if (0 >= j12) {
            super.write(c44802l, j12);
            return;
        }
        Math.min(j12, z12.f420052c - z12.f420051b);
        Object obj = null;
        obj.getClass();
        throw null;
    }
}
