package androidx.compose.ui.draw;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {
    @Y61.k
    public static final f a(@Y61.k Y41.l<? super i, p> lVar) {
        return new g(new i(), lVar);
    }

    @Y61.k
    public static final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
        return vVar.d0(new DrawBehindElement(lVar));
    }

    @Y61.k
    public static final androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.l<? super i, p> lVar) {
        return vVar.d0(new DrawWithCacheElement(lVar));
    }

    @Y61.k
    public static final androidx.compose.ui.v d(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.d, G0> lVar) {
        return vVar.d0(new DrawWithContentElement(lVar));
    }
}
