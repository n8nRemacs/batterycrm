package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;
import kotlin.Metadata;

/* compiled from: AndroidPathMeasure.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/u;", "Landroidx/compose/ui/graphics/O0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22286u implements O0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PathMeasure f39761a;

    public C22286u(@Y61.k PathMeasure pathMeasure) {
        this.f39761a = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.O0
    public final boolean a(float f12, float f13, @Y61.k Path path) {
        if (!(path instanceof C22277p)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f39761a.getSegment(f12, f13, ((C22277p) path).f39716a, true);
    }

    @Override // androidx.compose.ui.graphics.O0
    public final void b(@Y61.l Path path) {
        android.graphics.Path path2;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof C22277p)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path2 = ((C22277p) path).f39716a;
        }
        this.f39761a.setPath(path2, false);
    }

    @Override // androidx.compose.ui.graphics.O0
    public final float getLength() {
        return this.f39761a.getLength();
    }
}
