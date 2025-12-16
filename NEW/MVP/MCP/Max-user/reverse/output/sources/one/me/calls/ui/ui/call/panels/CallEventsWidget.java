package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3b;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.dqi;
import defpackage.fy4;
import defpackage.g31;
import defpackage.g56;
import defpackage.gm1;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hd5;
import defpackage.i00;
import defpackage.i6;
import defpackage.i81;
import defpackage.imb;
import defpackage.ipi;
import defpackage.j0b;
import defpackage.j81;
import defpackage.k18;
import defpackage.k81;
import defpackage.kj5;
import defpackage.l38;
import defpackage.l81;
import defpackage.lzf;
import defpackage.q;
import defpackage.q2b;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.x54;
import defpackage.y71;
import defpackage.yy7;
import defpackage.z54;
import defpackage.z71;
import defpackage.z74;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lz54;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "nl1", "a3b", "i00", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallEventsWidget extends Widget implements z54 {
    public static final /* synthetic */ yy7[] Z;
    public final Object X;
    public final bbd Y;
    public i00 a;
    public final z71 b;
    public final k18 c;
    public final ArrayList d;
    public final a3b o;

    static {
        toc tocVar = new toc(CallEventsWidget.class, "eventsRecyclerView", "getEventsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        Z = new yy7[]{tocVar};
    }

    public CallEventsWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // defpackage.z54
    public final List I(x54 x54Var, x54 x54Var2) {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        return view2 != null ? ve3.j(dqi.o(view2, (Math.abs(x54Var2.d) - x54Var2.f) * x54Var2.c), dqi.i(view2, x54Var2.a)) : hd5.a;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setId(j0b.N);
        recyclerView.setAdapter(this.b);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        int i = 0;
        recyclerView.j(new y71(i));
        this.o.b = recyclerView;
        recyclerView.setItemAnimator((k81) this.X.getValue());
        recyclerView.addOnLayoutChangeListener(new j81(i, this));
        return recyclerView;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.d.clear();
        this.o.b = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((i81) this.c.getValue()).o, getViewLifecycleOwner().p(), l38.d), new l81(null, view, this), 1), getViewLifecycleScope());
    }

    public CallEventsWidget(Bundle bundle) {
        Executor executorW;
        super(bundle, 0, 2, null);
        z74 z74VarA = ((q2b) ((lzf) gm1.a.getAccessor().c(8))).a();
        kj5 kj5Var = z74VarA instanceof kj5 ? (kj5) z74VarA : null;
        this.b = new z71((kj5Var == null || (executorW = kj5Var.w()) == null) ? new fy4(z74VarA) : executorW, 0);
        this.c = createViewModelLazy(i81.class, new q(11, new g31(8)));
        this.d = new ArrayList();
        this.o = new a3b(5, false);
        this.X = ipi.b(3, new i6(21, this));
        this.Y = viewBinding(j0b.N);
    }
}
