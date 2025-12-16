package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.C22267c;
import kotlin.Metadata;

/* compiled from: OwnedLayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/I0;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface I0 {
    void a(@Y61.k Y41.a aVar, @Y61.k Y41.p pVar);

    void b(@Y61.k float[] fArr);

    long c(long j12, boolean z12);

    boolean d(long j12);

    void destroy();

    void e(@Y61.k float[] fArr);

    void f(long j12);

    void g();

    @Y61.k
    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo3getUnderlyingMatrixsQKQjiQ();

    void h(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c);

    void i(@Y61.k l0.e eVar, boolean z12);

    void invalidate();

    void j(long j12);

    void k(@Y61.k androidx.compose.ui.graphics.c1 c1Var);
}
