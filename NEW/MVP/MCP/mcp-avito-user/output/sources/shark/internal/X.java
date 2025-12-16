package shark.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.PrimitiveType;

/* compiled from: IndexedObject.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lshark/internal/X;", "", "<init>", "()V", "a", "b", "c", "d", "Lshark/internal/X$a;", "Lshark/internal/X$b;", "Lshark/internal/X$c;", "Lshark/internal/X$d;", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class X {

    /* compiled from: IndexedObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/X$a;", "Lshark/internal/X;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class a extends X {

        /* renamed from: a, reason: collision with root package name */
        public final long f438468a;

        /* renamed from: b, reason: collision with root package name */
        public final long f438469b;

        /* renamed from: c, reason: collision with root package name */
        public final int f438470c;

        /* renamed from: d, reason: collision with root package name */
        public final long f438471d;

        /* renamed from: e, reason: collision with root package name */
        public final int f438472e;

        public a(long j12, long j13, int i12, long j14, int i13) {
            super(null);
            this.f438468a = j12;
            this.f438469b = j13;
            this.f438470c = i12;
            this.f438471d = j14;
            this.f438472e = i13;
        }

        @Override // shark.internal.X
        /* renamed from: a, reason: from getter */
        public final long getF438480b() {
            return this.f438468a;
        }

        @Override // shark.internal.X
        /* renamed from: b, reason: from getter */
        public final long getF438481c() {
            return this.f438471d;
        }
    }

    /* compiled from: IndexedObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/X$b;", "Lshark/internal/X;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class b extends X {

        /* renamed from: a, reason: collision with root package name */
        public final long f438473a;

        /* renamed from: b, reason: collision with root package name */
        public final long f438474b;

        /* renamed from: c, reason: collision with root package name */
        public final long f438475c;

        public b(long j12, long j13, long j14) {
            super(null);
            this.f438473a = j12;
            this.f438474b = j13;
            this.f438475c = j14;
        }

        @Override // shark.internal.X
        /* renamed from: a, reason: from getter */
        public final long getF438480b() {
            return this.f438473a;
        }

        @Override // shark.internal.X
        /* renamed from: b, reason: from getter */
        public final long getF438481c() {
            return this.f438475c;
        }
    }

    /* compiled from: IndexedObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/X$c;", "Lshark/internal/X;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class c extends X {

        /* renamed from: a, reason: collision with root package name */
        public final long f438476a;

        /* renamed from: b, reason: collision with root package name */
        public final long f438477b;

        /* renamed from: c, reason: collision with root package name */
        public final long f438478c;

        public c(long j12, long j13, long j14) {
            super(null);
            this.f438476a = j12;
            this.f438477b = j13;
            this.f438478c = j14;
        }

        @Override // shark.internal.X
        /* renamed from: a, reason: from getter */
        public final long getF438480b() {
            return this.f438476a;
        }

        @Override // shark.internal.X
        /* renamed from: b, reason: from getter */
        public final long getF438481c() {
            return this.f438478c;
        }
    }

    /* compiled from: IndexedObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/X$d;", "Lshark/internal/X;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class d extends X {

        /* renamed from: a, reason: collision with root package name */
        public final byte f438479a;

        /* renamed from: b, reason: collision with root package name */
        public final long f438480b;

        /* renamed from: c, reason: collision with root package name */
        public final long f438481c;

        public d(long j12, @Y61.k PrimitiveType primitiveType, long j13) {
            super(null);
            this.f438480b = j12;
            this.f438481c = j13;
            this.f438479a = (byte) primitiveType.ordinal();
        }

        @Override // shark.internal.X
        /* renamed from: a, reason: from getter */
        public final long getF438480b() {
            return this.f438480b;
        }

        @Override // shark.internal.X
        /* renamed from: b, reason: from getter */
        public final long getF438481c() {
            return this.f438481c;
        }
    }

    public X() {
    }

    /* renamed from: a */
    public abstract long getF438480b();

    /* renamed from: b */
    public abstract long getF438481c();

    public /* synthetic */ X(C42822w c42822w) {
        this();
    }
}
