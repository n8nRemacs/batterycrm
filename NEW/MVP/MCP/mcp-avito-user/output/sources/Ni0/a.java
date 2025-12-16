package NI0;

import Y61.k;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.user_adverts.root_screen.adverts_host.publish_button.DisableHideBottomViewOnScrollBehavior;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: PublishFab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNI0/a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f11359a;

    public a(@k Y41.a aVar, @k View view) {
        this.f11359a = view;
        ((Button) view.findViewById(R.id.publish_fab_button_re23)).setOnClickListener(new Ae0.b(11, aVar));
    }

    public final DisableHideBottomViewOnScrollBehavior a() {
        CoordinatorLayout.c cVar = ((CoordinatorLayout.g) this.f11359a.getLayoutParams()).f44447a;
        if (cVar instanceof DisableHideBottomViewOnScrollBehavior) {
            return (DisableHideBottomViewOnScrollBehavior) cVar;
        }
        return null;
    }

    public final void b() {
        D6.w(this.f11359a);
    }

    public final void c(boolean z12, boolean z13) {
        DisableHideBottomViewOnScrollBehavior disableHideBottomViewOnScrollBehaviorA = a();
        if (disableHideBottomViewOnScrollBehaviorA != null) {
            disableHideBottomViewOnScrollBehaviorA.f313789l = z13;
        }
        View view = this.f11359a;
        if (!z12 || !(view.getParent() instanceof CoordinatorLayout)) {
            D6.H(view);
            return;
        }
        DisableHideBottomViewOnScrollBehavior disableHideBottomViewOnScrollBehaviorA2 = a();
        if (disableHideBottomViewOnScrollBehaviorA2 != null) {
            disableHideBottomViewOnScrollBehaviorA2.w(view);
        }
    }
}
