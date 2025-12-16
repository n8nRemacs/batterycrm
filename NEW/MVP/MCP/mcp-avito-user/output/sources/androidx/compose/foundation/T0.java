package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: AndroidOverscroll.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/T0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class T0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f26856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26857b;

    /* renamed from: c, reason: collision with root package name */
    public long f26858c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26859d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26860e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26861f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26862g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26863h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26864i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26865j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public EdgeEffect f26866k;

    public T0(@Y61.k Context context, @InterfaceC42156l int i12) {
        this.f26856a = context;
        this.f26857b = i12;
        androidx.compose.ui.unit.u.f42871b.getClass();
        this.f26858c = 0L;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        R0.f26833a.getClass();
        return !(R0.b(edgeEffect) == 0.0f);
    }

    public final EdgeEffect a(Orientation orientation) {
        EdgeEffect c20530i1;
        R0.f26833a.getClass();
        int i12 = Build.VERSION.SDK_INT;
        Context context = this.f26856a;
        if (i12 >= 31) {
            C21091y.f32322a.getClass();
            c20530i1 = C21091y.a(context);
        } else {
            c20530i1 = new C20530i1(context);
        }
        c20530i1.setColor(this.f26857b);
        long j12 = this.f26858c;
        androidx.compose.ui.unit.u.f42871b.getClass();
        if (!androidx.compose.ui.unit.u.c(j12, 0L)) {
            if (orientation == Orientation.f27425b) {
                long j13 = this.f26858c;
                c20530i1.setSize((int) (j13 >> 32), (int) (j13 & 4294967295L));
            } else {
                long j14 = this.f26858c;
                c20530i1.setSize((int) (j14 & 4294967295L), (int) (j14 >> 32));
            }
        }
        return c20530i1;
    }

    @Y61.k
    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f26860e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f27425b);
        this.f26860e = edgeEffectA;
        return edgeEffectA;
    }

    @Y61.k
    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f26861f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f27426c);
        this.f26861f = edgeEffectA;
        return edgeEffectA;
    }

    @Y61.k
    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f26862g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f27426c);
        this.f26862g = edgeEffectA;
        return edgeEffectA;
    }

    @Y61.k
    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f26859d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(Orientation.f27425b);
        this.f26859d = edgeEffectA;
        return edgeEffectA;
    }
}
