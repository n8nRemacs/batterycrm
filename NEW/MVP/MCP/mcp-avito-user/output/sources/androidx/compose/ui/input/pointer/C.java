package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.H0;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerEvent.kt */
@H0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014B]\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0015BS\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0018Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "", "Landroidx/compose/ui/input/pointer/B;", "id", "", "uptimeMillis", "Ll0/g;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/U;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/w;)V", "(JJJZJJZZIJLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/input/pointer/d;", "consumed", "(JJJZJJZLandroidx/compose/ui/input/pointer/d;ILkotlin/jvm/internal/w;)V", "", "Landroidx/compose/ui/input/pointer/e;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final long f40116a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40117b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40118c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f40119d;

    /* renamed from: e, reason: collision with root package name */
    public final float f40120e;

    /* renamed from: f, reason: collision with root package name */
    public final long f40121f;

    /* renamed from: g, reason: collision with root package name */
    public final long f40122g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40123h;

    /* renamed from: i, reason: collision with root package name */
    public final int f40124i;

    /* renamed from: j, reason: collision with root package name */
    public final long f40125j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<C22327e> f40126k;

    /* renamed from: l, reason: collision with root package name */
    public final long f40127l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40128m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40129n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public C f40130o;

    public C() {
        throw null;
    }

    public C(long j12, long j13, long j14, boolean z12, float f12, long j15, long j16, boolean z13, boolean z14, int i12, long j17, C42822w c42822w) {
        this.f40116a = j12;
        this.f40117b = j13;
        this.f40118c = j14;
        this.f40119d = z12;
        this.f40120e = f12;
        this.f40121f = j15;
        this.f40122g = j16;
        this.f40123h = z13;
        this.f40124i = i12;
        this.f40125j = j17;
        l0.g.f413384b.getClass();
        this.f40127l = 0L;
        this.f40128m = z14;
        this.f40129n = z14;
    }

    public final void a() {
        C c12 = this.f40130o;
        if (c12 == null) {
            this.f40128m = true;
            this.f40129n = true;
        } else if (c12 != null) {
            c12.a();
        }
    }

    public final boolean b() {
        C c12 = this.f40130o;
        return c12 != null ? c12.b() : this.f40128m || this.f40129n;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) B.b(this.f40116a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f40117b);
        sb2.append(", position=");
        sb2.append((Object) l0.g.l(this.f40118c));
        sb2.append(", pressed=");
        sb2.append(this.f40119d);
        sb2.append(", pressure=");
        sb2.append(this.f40120e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f40121f);
        sb2.append(", previousPosition=");
        sb2.append((Object) l0.g.l(this.f40122g));
        sb2.append(", previousPressed=");
        sb2.append(this.f40123h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        sb2.append((Object) U.b(this.f40124i));
        sb2.append(", historical=");
        Object obj = this.f40126k;
        if (obj == null) {
            obj = C42784z0.f406748b;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) l0.g.l(this.f40125j));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C(long j12, long j13, long j14, boolean z12, float f12, long j15, long j16, boolean z13, boolean z14, int i12, long j17, int i13, C42822w c42822w) {
        int i14;
        long j18;
        if ((i13 & 512) != 0) {
            U.f40189b.getClass();
            i14 = U.f40190c;
        } else {
            i14 = i12;
        }
        if ((i13 & 1024) != 0) {
            l0.g.f413384b.getClass();
            j18 = 0;
        } else {
            j18 = j17;
        }
        this(j12, j13, j14, z12, f12, j15, j16, z13, z14, i14, j18, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C(long j12, long j13, long j14, boolean z12, long j15, long j16, boolean z13, boolean z14, int i12, long j17, int i13, C42822w c42822w) {
        int i14;
        long j18;
        if ((i13 & 256) != 0) {
            U.f40189b.getClass();
            i14 = U.f40190c;
        } else {
            i14 = i12;
        }
        if ((i13 & 512) != 0) {
            l0.g.f413384b.getClass();
            j18 = 0;
        } else {
            j18 = j17;
        }
        this(j12, j13, j14, z12, j15, j16, z13, z14, i14, j18, (C42822w) null);
    }

    public C(long j12, long j13, long j14, boolean z12, long j15, long j16, boolean z13, boolean z14, int i12, long j17, C42822w c42822w) {
        this(j12, j13, j14, z12, 1.0f, j15, j16, z13, z14, i12, j17, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C(long j12, long j13, long j14, boolean z12, long j15, long j16, boolean z13, C22326d c22326d, int i12, int i13, C42822w c42822w) {
        int i14;
        if ((i13 & 256) != 0) {
            U.f40189b.getClass();
            i14 = U.f40190c;
        } else {
            i14 = i12;
        }
        this(j12, j13, j14, z12, j15, j16, z13, c22326d, i14, null);
    }

    public C(long j12, long j13, long j14, boolean z12, float f12, long j15, long j16, boolean z13, boolean z14, int i12, List list, long j17, long j18, C42822w c42822w) {
        this(j12, j13, j14, z12, f12, j15, j16, z13, z14, i12, j17, (C42822w) null);
        this.f40126k = list;
        this.f40127l = j18;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC42830m
    public C(long j12, long j13, long j14, boolean z12, long j15, long j16, boolean z13, C22326d c22326d, int i12, C42822w c42822w) {
        boolean z14 = c22326d.f40204b || c22326d.f40203a;
        l0.g.f413384b.getClass();
        this(j12, j13, j14, z12, 1.0f, j15, j16, z13, z14, i12, 0L, (C42822w) null);
    }
}
