package androidx.compose.ui.text.font;

import androidx.compose.runtime.H0;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import y0.C50028a;

/* compiled from: FontWeight.kt */
@H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/e0;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 implements Comparable<e0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f42240c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final e0 f42241d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final e0 f42242e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final e0 f42243f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final e0 f42244g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final e0 f42245h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final e0 f42246i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final e0 f42247j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final e0 f42248k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final e0 f42249l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final e0 f42250m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final e0 f42251n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final List<e0> f42252o;

    /* renamed from: b, reason: collision with root package name */
    public final int f42253b;

    /* compiled from: FontWeight.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/e0$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static e0 a() {
            return e0.f42241d;
        }

        @Y61.k
        public static e0 b() {
            return e0.f42242e;
        }

        @Y61.k
        public static e0 c() {
            return e0.f42245h;
        }

        public a() {
        }
    }

    static {
        e0 e0Var = new e0(100);
        e0 e0Var2 = new e0(200);
        e0 e0Var3 = new e0(300);
        e0 e0Var4 = new e0(Constants.MINIMAL_ERROR_STATUS_CODE);
        f42241d = e0Var4;
        e0 e0Var5 = new e0(500);
        f42242e = e0Var5;
        e0 e0Var6 = new e0(600);
        f42243f = e0Var6;
        e0 e0Var7 = new e0(700);
        f42244g = e0Var7;
        e0 e0Var8 = new e0(800);
        f42245h = e0Var8;
        e0 e0Var9 = new e0(900);
        f42246i = e0Var3;
        f42247j = e0Var4;
        f42248k = e0Var5;
        f42249l = e0Var6;
        f42250m = e0Var7;
        f42251n = e0Var8;
        f42252o = C42745f0.U(e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9);
    }

    public e0(int i12) {
        this.f42253b = i12;
        boolean z12 = false;
        if (1 <= i12 && i12 < 1001) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        C50028a.a("Font weight can be in range [1, 1000]. Current value: " + i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@Y61.k e0 e0Var) {
        return kotlin.jvm.internal.L.g(this.f42253b, e0Var.f42253b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f42253b == ((e0) obj).f42253b;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF42253b() {
        return this.f42253b;
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("FontWeight(weight="), this.f42253b, ')');
    }
}
