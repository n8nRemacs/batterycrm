package androidx.compose.ui.draw;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draw/r;", "Landroidx/compose/ui/draw/e;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class r implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final r f39060b = new r();

    /* renamed from: c, reason: collision with root package name */
    public static final long f39061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final LayoutDirection f39062d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.unit.d f39063e;

    static {
        l0.n.f413402b.getClass();
        f39061c = l0.n.f413403c;
        f39062d = LayoutDirection.f42838b;
        f39063e = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
    }

    @Override // androidx.compose.ui.draw.e
    @Y61.k
    public final androidx.compose.ui.unit.d getDensity() {
        return f39063e;
    }

    @Override // androidx.compose.ui.draw.e
    @Y61.k
    public final LayoutDirection getLayoutDirection() {
        return f39062d;
    }

    @Override // androidx.compose.ui.draw.e
    public final long i() {
        return f39061c;
    }
}
