package shark.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.AbstractC48368z1;
import shark.N2;
import shark.internal.C0;

/* compiled from: ReferencePathNode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lshark/internal/D0;", "", "<init>", "()V", "a", "b", "Lshark/internal/D0$b;", "Lshark/internal/D0$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class D0 {

    /* compiled from: ReferencePathNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/D0$a;", "Lshark/internal/D0;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a extends D0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f438342a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final D0 f438343b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C0.a.InterfaceC12630a f438344c;

        public a(long j12, @Y61.k D0 d02, @Y61.k C0.a.InterfaceC12630a interfaceC12630a) {
            super(null);
            this.f438342a = j12;
            this.f438343b = d02;
            this.f438344c = interfaceC12630a;
        }

        @Override // shark.internal.D0
        /* renamed from: a, reason: from getter */
        public final long getF438342a() {
            return this.f438342a;
        }
    }

    /* compiled from: ReferencePathNode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lshark/internal/D0$b;", "Lshark/internal/D0;", "<init>", "()V", "a", "b", "Lshark/internal/D0$b$a;", "Lshark/internal/D0$b$b;", "shark"}, k = 1, mv = {1, 4, 1})
    public static abstract class b extends D0 {

        /* compiled from: ReferencePathNode.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/D0$b$a;", "Lshark/internal/D0$b;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AbstractC48368z1 f438345a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final N2 f438346b;

            public a(@Y61.k AbstractC48368z1 abstractC48368z1, @Y61.k N2 n22) {
                super(null);
                this.f438345a = abstractC48368z1;
                this.f438346b = n22;
            }

            @Override // shark.internal.D0.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final AbstractC48368z1 getF438347a() {
                return this.f438345a;
            }
        }

        /* compiled from: ReferencePathNode.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/D0$b$b;", "Lshark/internal/D0$b;", "shark"}, k = 1, mv = {1, 4, 1})
        /* renamed from: shark.internal.D0$b$b, reason: collision with other inner class name */
        public static final class C12631b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AbstractC48368z1 f438347a;

            public C12631b(@Y61.k AbstractC48368z1 abstractC48368z1) {
                super(null);
                this.f438347a = abstractC48368z1;
            }

            @Override // shark.internal.D0.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final AbstractC48368z1 getF438347a() {
                return this.f438347a;
            }
        }

        public b() {
            super(null);
        }

        @Override // shark.internal.D0
        /* renamed from: a */
        public final long getF438342a() {
            return getF438347a().getF438838a();
        }

        @Y61.k
        /* renamed from: b */
        public abstract AbstractC48368z1 getF438347a();

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }
    }

    public D0() {
    }

    /* renamed from: a */
    public abstract long getF438342a();

    public /* synthetic */ D0(C42822w c42822w) {
        this();
    }
}
