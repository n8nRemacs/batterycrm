package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.G0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/u1;", "Landroidx/core/view/G0$b;", "Ljava/lang/Runnable;", "Landroidx/core/view/M;", "Landroid/view/View$OnAttachStateChangeListener;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC20626u1 extends G0.b implements Runnable, androidx.core.view.M, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final G2 f28745d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28746e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28747f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.core.view.J0 f28748g;

    public RunnableC20626u1(@Y61.k G2 g22) {
        super(!g22.f28296u ? 1 : 0);
        this.f28745d = g22;
    }

    @Override // androidx.core.view.G0.b
    public final void b(@Y61.k androidx.core.view.G0 g02) {
        this.f28746e = false;
        this.f28747f = false;
        androidx.core.view.J0 j02 = this.f28748g;
        if (g02.a() != 0 && j02 != null) {
            G2 g22 = this.f28745d;
            g22.f28295t.f(A3.d(j02.e(8)));
            g22.f28294s.f(A3.d(j02.e(8)));
            G2.a(g22, j02);
        }
        this.f28748g = null;
    }

    @Override // androidx.core.view.G0.b
    public final void c(@Y61.k androidx.core.view.G0 g02) {
        this.f28746e = true;
        this.f28747f = true;
    }

    @Override // androidx.core.view.G0.b
    @Y61.k
    public final androidx.core.view.J0 d(@Y61.k androidx.core.view.J0 j02, @Y61.k List<androidx.core.view.G0> list) {
        G2 g22 = this.f28745d;
        G2.a(g22, j02);
        return g22.f28296u ? androidx.core.view.J0.f44939b : j02;
    }

    @Override // androidx.core.view.G0.b
    @Y61.k
    public final G0.a e(@Y61.k androidx.core.view.G0 g02, @Y61.k G0.a aVar) {
        this.f28746e = false;
        return aVar;
    }

    @Override // androidx.core.view.M
    @Y61.k
    public final androidx.core.view.J0 h(@Y61.k View view, @Y61.k androidx.core.view.J0 j02) {
        this.f28748g = j02;
        G2 g22 = this.f28745d;
        g22.f28294s.f(A3.d(j02.e(8)));
        if (this.f28746e) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f28747f) {
            g22.f28295t.f(A3.d(j02.e(8)));
            G2.a(g22, j02);
        }
        return g22.f28296u ? androidx.core.view.J0.f44939b : j02;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f28746e) {
            this.f28746e = false;
            this.f28747f = false;
            androidx.core.view.J0 j02 = this.f28748g;
            if (j02 != null) {
                G2 g22 = this.f28745d;
                g22.f28295t.f(A3.d(j02.e(8)));
                G2.a(g22, j02);
                this.f28748g = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
    }
}
