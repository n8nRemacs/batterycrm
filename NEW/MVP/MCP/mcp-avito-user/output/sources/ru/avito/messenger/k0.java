package ru.avito.messenger;

import k91.AbstractC42548f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessengerState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/avito/messenger/k0;", "", "<init>", "()V", "a", "b", "c", "Lru/avito/messenger/k0$a;", "Lru/avito/messenger/k0$b;", "Lru/avito/messenger/k0$c;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class k0 {

    /* compiled from: MessengerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/k0$a;", "Lru/avito/messenger/k0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends k0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f431811a;

        public a() {
            this(0L, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f431811a == ((a) obj).f431811a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f431811a);
        }

        @Y61.k
        public final String toString() {
            return "Connected";
        }

        public /* synthetic */ a(long j12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? System.currentTimeMillis() : j12);
        }

        public a(long j12) {
            super(null);
            this.f431811a = j12;
        }
    }

    /* compiled from: MessengerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/k0$b;", "Lru/avito/messenger/k0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends k0 {
        public b() {
            this(false, 1, null);
        }

        @Y61.k
        public final String toString() {
            return "Connecting";
        }

        public b(boolean z12, int i12, C42822w c42822w) {
            super(null);
        }
    }

    /* compiled from: MessengerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/k0$c;", "Lru/avito/messenger/k0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends k0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC42548f f431812a;

        /* renamed from: b, reason: collision with root package name */
        public final long f431813b;

        public c() {
            this(null, 0L, 3, null);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            androidx.appcompat.app.r.C(c.class, sb2, "={event=");
            sb2.append(this.f431812a.getClass().getSimpleName());
            sb2.append(",timestamp=");
            return androidx.appcompat.app.r.u(sb2, this.f431813b, '}');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC42548f abstractC42548f, long j12, int i12, C42822w c42822w) {
            super(null);
            abstractC42548f = (i12 & 1) != 0 ? new AbstractC42548f.C11606f(null, null, null, 7, null) : abstractC42548f;
            j12 = (i12 & 2) != 0 ? System.currentTimeMillis() : j12;
            this.f431812a = abstractC42548f;
            this.f431813b = j12;
        }
    }

    public /* synthetic */ k0(C42822w c42822w) {
        this();
    }

    public k0() {
    }
}
