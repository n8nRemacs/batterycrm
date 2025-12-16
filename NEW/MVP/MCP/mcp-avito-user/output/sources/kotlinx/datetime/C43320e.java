package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;

/* compiled from: DateTimePeriod.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/e;", "Lkotlinx/datetime/f;", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.c.class)
/* renamed from: kotlinx.datetime.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43320e extends AbstractC43321f {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f412315a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412316b;

    /* compiled from: DateTimePeriod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/e$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/e;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<C43320e> serializer() {
            return kotlinx.datetime.serializers.c.f412633a;
        }

        public Companion() {
        }
    }

    public C43320e(int i12, int i13, int i14) {
        this(h.b(i12, i13), i14);
    }

    @Override // kotlinx.datetime.AbstractC43321f
    /* renamed from: a, reason: from getter */
    public final int getF412316b() {
        return this.f412316b;
    }

    @Override // kotlinx.datetime.AbstractC43321f
    public final int b() {
        return 0;
    }

    @Override // kotlinx.datetime.AbstractC43321f
    public final int c() {
        return 0;
    }

    @Override // kotlinx.datetime.AbstractC43321f
    public final int e() {
        return 0;
    }

    @Override // kotlinx.datetime.AbstractC43321f
    public final int f() {
        return 0;
    }

    @Override // kotlinx.datetime.AbstractC43321f
    /* renamed from: g, reason: from getter */
    public final int getF412315a() {
        return this.f412315a;
    }

    @Override // kotlinx.datetime.AbstractC43321f
    /* renamed from: h */
    public final long getF412482c() {
        return 0L;
    }

    public C43320e(int i12, int i13) {
        super(null);
        this.f412315a = i12;
        this.f412316b = i13;
    }

    public /* synthetic */ C43320e(int i12, int i13, int i14, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14);
    }
}
