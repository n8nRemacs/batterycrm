package androidx.view.compose;

import Y61.k;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.C23489g;
import androidx.view.V0;
import androidx.view.X0;
import androidx.view.n;
import kotlin.Metadata;

/* compiled from: ComponentActivity.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ViewGroup.LayoutParams f21193a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(n nVar, C22096n c22096n) {
        View childAt = ((ViewGroup) nVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(c22096n);
            return;
        }
        ComposeView composeView2 = new ComposeView(nVar, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(c22096n);
        View decorView = nVar.getWindow().getDecorView();
        if (V0.a(decorView) == null) {
            V0.b(decorView, nVar);
        }
        if (X0.a(decorView) == null) {
            X0.b(decorView, nVar);
        }
        if (C23489g.a(decorView) == null) {
            C23489g.b(decorView, nVar);
        }
        nVar.setContentView(composeView2, f21193a);
    }
}
