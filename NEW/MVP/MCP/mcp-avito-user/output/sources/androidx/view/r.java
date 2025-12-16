package androidx.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.view.C22985S;
import androidx.view.C23485c;
import androidx.view.C23486d;
import androidx.view.C23489g;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.V0;
import com.avito.android.R;
import j.InterfaceC42153i;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComponentDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/r;", "Landroid/app/Dialog;", "Landroidx/lifecycle/P;", "Landroidx/activity/C;", "Landroidx/savedstate/e;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class r extends Dialog implements InterfaceC22983P, C, InterfaceC23487e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public C22985S f21239b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C23486d f21240c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final y f21241d;

    public /* synthetic */ r(Context context, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? 0 : i12);
    }

    public static void k(r rVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@k View view, @l ViewGroup.LayoutParams layoutParams) {
        m();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.view.InterfaceC22983P
    @k
    public final Lifecycle getLifecycle() {
        return l();
    }

    @Override // androidx.view.C
    @k
    /* renamed from: getOnBackPressedDispatcher, reason: from getter */
    public final y getF21241d() {
        return this.f21241d;
    }

    @Override // androidx.view.InterfaceC23487e
    @k
    public final C23485c getSavedStateRegistry() {
        return this.f21240c.f54434b;
    }

    public final C22985S l() {
        C22985S c22985s = this.f21239b;
        if (c22985s != null) {
            return c22985s;
        }
        C22985S c22985s2 = new C22985S(this, true);
        this.f21239b = c22985s2;
        return c22985s2;
    }

    public final void m() {
        V0.b(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        C23489g.b(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    @InterfaceC42153i
    public void onBackPressed() {
        this.f21241d.c();
    }

    @Override // android.app.Dialog
    @InterfaceC42153i
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            y yVar = this.f21241d;
            yVar.f21293e = onBackInvokedDispatcher;
            yVar.d();
        }
        this.f21240c.b(bundle);
        l().f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    @k
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.f21240c.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    @InterfaceC42153i
    public void onStart() {
        super.onStart();
        l().f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    @InterfaceC42153i
    public void onStop() {
        l().f(Lifecycle.Event.ON_DESTROY);
        this.f21239b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i12) {
        m();
        super.setContentView(i12);
    }

    @j
    public r(@k Context context, @f0 int i12) {
        super(context, i12);
        C23486d.f54432d.getClass();
        this.f21240c = C23486d.a.a(this);
        this.f21241d = new y(new q(this, 2));
    }

    @Override // android.app.Dialog
    public void setContentView(@k View view) {
        m();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@k View view, @l ViewGroup.LayoutParams layoutParams) {
        m();
        super.setContentView(view, layoutParams);
    }
}
