package shark.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.q3;

/* compiled from: KeyedWeakReferenceMirror.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/r0;", "", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class r0 {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f438588h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f438589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f438590b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q3.i f438591c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f438592d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f438593e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Long f438594f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f438595g;

    /* compiled from: KeyedWeakReferenceMirror.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/internal/r0$a;", "", "<init>", "()V", "", "UNKNOWN_LEGACY", "Ljava/lang/String;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public r0(@Y61.k q3.i iVar, @Y61.k String str, @Y61.k String str2, @Y61.l Long l12, @Y61.l Long l13) {
        this.f438591c = iVar;
        this.f438592d = str;
        this.f438593e = str2;
        this.f438594f = l12;
        this.f438595g = l13;
        this.f438589a = iVar.f438688a != 0;
        this.f438590b = l13 == null || l13.longValue() != -1;
    }
}
