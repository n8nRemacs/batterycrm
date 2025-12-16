package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C42822w;

/* compiled from: typeQualifiers.kt */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f408338e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final h f408339f = new h(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final NullabilityQualifier f408340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final MutabilityQualifier f408341b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408342c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f408343d;

    /* compiled from: typeQualifiers.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.l NullabilityQualifier nullabilityQualifier, @Y61.l MutabilityQualifier mutabilityQualifier, boolean z12, boolean z13) {
        this.f408340a = nullabilityQualifier;
        this.f408341b = mutabilityQualifier;
        this.f408342c = z12;
        this.f408343d = z13;
    }

    public /* synthetic */ h(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(nullabilityQualifier, mutabilityQualifier, z12, (i12 & 8) != 0 ? false : z13);
    }
}
