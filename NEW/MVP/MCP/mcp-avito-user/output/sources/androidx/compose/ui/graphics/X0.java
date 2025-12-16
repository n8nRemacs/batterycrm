package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: RectHelper.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X0 {
    @Y61.k
    public static final Rect a(@Y61.k androidx.compose.ui.unit.s sVar) {
        return new Rect(sVar.f42867a, sVar.f42868b, sVar.f42869c, sVar.f42870d);
    }

    @Y61.k
    @InterfaceC42830m
    public static final Rect b(@Y61.k l0.j jVar) {
        return new Rect((int) jVar.f413390a, (int) jVar.f413391b, (int) jVar.f413392c, (int) jVar.f413393d);
    }

    @Y61.k
    public static final RectF c(@Y61.k l0.j jVar) {
        return new RectF(jVar.f413390a, jVar.f413391b, jVar.f413392c, jVar.f413393d);
    }

    @Y61.k
    public static final l0.j d(@Y61.k Rect rect) {
        return new l0.j(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Y61.k
    public static final l0.j e(@Y61.k RectF rectF) {
        return new l0.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
