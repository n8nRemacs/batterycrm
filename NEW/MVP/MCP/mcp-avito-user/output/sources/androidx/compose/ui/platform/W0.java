package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* compiled from: DeviceRenderNode.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/W0;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface W0 {
    boolean A();

    void B(@Y61.k Matrix matrix);

    void C(int i12);

    int D();

    int E();

    boolean F(int i12, int i13, int i14, int i15);

    float G();

    void H(int i12);

    boolean a();

    void b(float f12);

    void c(float f12);

    void d(float f12);

    void e(@Y61.l androidx.compose.ui.graphics.Z0 z02);

    void f();

    void g(float f12);

    float getAlpha();

    int getHeight();

    int getWidth();

    void h(float f12);

    boolean i();

    void j(float f12);

    void k(float f12);

    void l(float f12);

    int m();

    void n(@Y61.k Canvas canvas);

    void o(boolean z12);

    void p(@Y61.k androidx.compose.ui.graphics.N n12, @Y61.l Path path, @Y61.k Y41.l<? super androidx.compose.ui.graphics.M, kotlin.G0> lVar);

    void q(float f12);

    void r(float f12);

    void s(@Y61.l Outline outline);

    void setAlpha(float f12);

    void t(boolean z12);

    int u();

    void v(int i12);

    void w(int i12);

    void x(float f12);

    void y(int i12);

    boolean z();
}
