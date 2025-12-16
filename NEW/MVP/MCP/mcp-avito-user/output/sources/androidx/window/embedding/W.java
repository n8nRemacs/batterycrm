package androidx.window.embedding;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowMetrics;
import j.InterfaceC42164u;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SplitRule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/window/embedding/W;", "Landroidx/window/embedding/s;", "a", "b", "c", "d", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public class W extends AbstractC23532s {

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C23525k f55233h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C23525k f55234i;

    /* renamed from: b, reason: collision with root package name */
    public final int f55235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55236c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55237d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C23525k f55238e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C23525k f55239f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final N f55240g;

    /* compiled from: SplitRule.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/embedding/W$a;", "", "<init>", "()V", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", "a", "(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }

        @InterfaceC42164u
        @Y61.k
        public final Rect a(@Y61.k WindowMetrics windowMetrics) {
            return windowMetrics.getBounds();
        }
    }

    /* compiled from: SplitRule.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/embedding/W$b;", "", "<init>", "()V", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/content/Context;", "context", "", "a", "(Landroid/view/WindowMetrics;Landroid/content/Context;)F", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class b {
        static {
            new b();
        }

        @InterfaceC42164u
        public final float a(@Y61.k WindowMetrics windowMetrics, @Y61.k Context context) {
            try {
                return windowMetrics.getDensity();
            } catch (NoSuchMethodError unused) {
                return context.getResources().getDisplayMetrics().density;
            }
        }
    }

    /* compiled from: SplitRule.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/window/embedding/W$c;", "", "<init>", "()V", "Landroidx/window/embedding/k;", "SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT", "Landroidx/window/embedding/k;", "SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT", "", "SPLIT_MIN_DIMENSION_ALWAYS_ALLOW", "I", "SPLIT_MIN_DIMENSION_DP_DEFAULT", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: SplitRule.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/embedding/W$d;", "", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public static final d f55241b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public static final d f55242c;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f55243a;

        /* compiled from: SplitRule.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/embedding/W$d$a;", "", "<init>", "()V", "Landroidx/window/embedding/W$d;", "ADJACENT", "Landroidx/window/embedding/W$d;", "ALWAYS", "NEVER", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
            f55241b = new d("NEVER");
            f55242c = new d("ALWAYS");
        }

        public d(String str) {
            this.f55243a = str;
        }

        @Y61.k
        /* renamed from: toString, reason: from getter */
        public final String getF55243a() {
            return this.f55243a;
        }
    }

    static {
        new c(null);
        C23525k.f55246c.getClass();
        f55233h = new C23525k("ratio:1.4", 1.4f, null);
        f55234i = C23525k.f55247d;
    }

    public /* synthetic */ W(String str, int i12, int i13, int i14, C23525k c23525k, C23525k c23525k2, N n12, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? 600 : i12, (i15 & 4) != 0 ? 600 : i13, (i15 & 8) != 0 ? 600 : i14, (i15 & 16) != 0 ? f55233h : c23525k, (i15 & 32) != 0 ? f55234i : c23525k2, n12);
    }

    @Override // androidx.window.embedding.AbstractC23532s
    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W) || !super.equals(obj)) {
            return false;
        }
        W w12 = (W) obj;
        return this.f55235b == w12.f55235b && this.f55236c == w12.f55236c && this.f55237d == w12.f55237d && kotlin.jvm.internal.L.f(this.f55238e, w12.f55238e) && kotlin.jvm.internal.L.f(this.f55239f, w12.f55239f) && kotlin.jvm.internal.L.f(this.f55240g, w12.f55240g);
    }

    @Override // androidx.window.embedding.AbstractC23532s
    public int hashCode() {
        return this.f55240g.hashCode() + ((this.f55239f.hashCode() + ((this.f55238e.hashCode() + (((((((super.hashCode() * 31) + this.f55235b) * 31) + this.f55236c) * 31) + this.f55237d) * 31)) * 31)) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(W.class, sb2, "{ tag=");
        sb2.append(this.f55251a);
        sb2.append(", defaultSplitAttributes=");
        sb2.append(this.f55240g);
        sb2.append(", minWidthDp=");
        sb2.append(this.f55235b);
        sb2.append(", minHeightDp=");
        sb2.append(this.f55236c);
        sb2.append(", minSmallestWidthDp=");
        sb2.append(this.f55237d);
        sb2.append(", maxAspectRatioInPortrait=");
        sb2.append(this.f55238e);
        sb2.append(", maxAspectRatioInLandscape=");
        sb2.append(this.f55239f);
        sb2.append('}');
        return sb2.toString();
    }

    public W(@Y61.l String str, @j.F int i12, @j.F int i13, @j.F int i14, @Y61.k C23525k c23525k, @Y61.k C23525k c23525k2, @Y61.k N n12) {
        super(str);
        this.f55235b = i12;
        this.f55236c = i13;
        this.f55237d = i14;
        this.f55238e = c23525k;
        this.f55239f = c23525k2;
        this.f55240g = n12;
        androidx.core.util.z.e(i12, "minWidthDp must be non-negative");
        androidx.core.util.z.e(i13, "minHeightDp must be non-negative");
        androidx.core.util.z.e(i14, "minSmallestWidthDp must be non-negative");
    }
}
