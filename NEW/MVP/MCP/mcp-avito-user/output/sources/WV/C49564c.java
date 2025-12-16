package wV;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import xV.C49890c;

/* compiled from: SegmentedDrawingDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV/c;", "LwV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wV.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49564c extends AbstractC49562a {

    /* renamed from: h, reason: collision with root package name */
    public float f441474h;

    /* renamed from: g, reason: collision with root package name */
    @k
    public List<C49890c> f441473g = C42784z0.f406748b;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RectF f441475i = new RectF();

    @Override // wV.AbstractC49562a
    public final void a(@k Canvas canvas) {
        float f12;
        float f13;
        RectF rectF = this.f441475i;
        float fWidth = rectF.width() / this.f441474h;
        int i12 = this.f441458b / 2;
        float fHeight = rectF.height();
        Iterator<C49890c> it = this.f441473g.iterator();
        int i13 = 0;
        float f14 = 0.0f;
        while (it.hasNext()) {
            int i14 = i13 + 1;
            C49890c next = it.next();
            if ((next != null ? next : null) != null) {
                if (i13 == 0 || i13 == C42745f0.J(this.f441473g)) {
                    f12 = next.f442510a * fWidth;
                    f13 = i12;
                } else {
                    f12 = next.f442510a * fWidth;
                    f13 = this.f441458b;
                }
                float f15 = f12 - f13;
                float[] fArr = (i13 == 0 && C42745f0.J(this.f441473g) == 0) ? this.f441461e : i13 == 0 ? this.f441459c : i13 == C42745f0.J(this.f441473g) ? this.f441460d : this.f441462f;
                RectF rectF2 = next.f442514e;
                rectF2.set(0.0f, 0.0f, f15, fHeight);
                rectF2.offset(f14, 0.0f);
                Path path = next.f442512c;
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                canvas.drawPath(path, next.f442513d);
                f14 += f15 + this.f441458b;
            }
            i13 = i14;
        }
    }

    @Override // wV.AbstractC49562a
    public final void b(@k RectF rectF) {
        this.f441475i.set(rectF);
    }
}
