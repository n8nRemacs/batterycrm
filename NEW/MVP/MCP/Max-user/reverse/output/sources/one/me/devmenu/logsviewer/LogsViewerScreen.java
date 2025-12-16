package one.me.devmenu.logsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a93;
import defpackage.c38;
import defpackage.dpg;
import defpackage.eo7;
import defpackage.fr7;
import defpackage.gw0;
import defpackage.k18;
import defpackage.kti;
import defpackage.ma1;
import defpackage.nyc;
import defpackage.p3;
import defpackage.q67;
import defpackage.s3;
import defpackage.sj8;
import defpackage.sn0;
import defpackage.t75;
import defpackage.toc;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.yo3;
import defpackage.yy7;
import defpackage.z41;
import defpackage.zi8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/logsviewer/LogsViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "zi8", "aj8", "logsviewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class LogsViewerScreen extends Widget {
    public static final /* synthetic */ yy7[] X;
    public static final int Y;
    public final eo7 a;
    public final sn0 b;
    public final k18 c;
    public final zi8 d;
    public final zi8 o;

    static {
        toc tocVar = new toc(LogsViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        vid.a.getClass();
        X = new yy7[]{tocVar};
        Y = View.generateViewId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogsViewerScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = binding(new fr7(8, this));
        this.c = createViewModelLazy(sj8.class, new yo3(27, new c38(11)));
        this.d = new zi8(y0().X);
        this.o = new zi8(y0().Z);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        yy7 yy7Var = X[0];
        linearLayout.addView((yfb) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        EditText editText = new EditText(linearLayout.getContext());
        editText.setSingleLine(true);
        dpg.h.b(editText, t75.b);
        v1a v1aVar = a93.s0;
        editText.setTextColor(v1aVar.y(editText).getText().e);
        editText.addTextChangedListener(new p3(1, this));
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(v1aVar.y(view).i().b.b);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, kti.c(vw4.d().getDisplayMetrics().density * 0.5d)));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(linearLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(nyc.oneme_devmenu_logsviewer_show_log_recycler_view);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setAdapter(this.d);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.j(new q67(new ColorDrawable(-16777216)));
        endlessRecyclerView2.setPager(new ma1(this, 3));
        gw0.w(new z41(y0().X, y0().Z, new s3(endlessRecyclerView2, this, null, 15), 3), getViewLifecycleScope());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(endlessRecyclerView2, layoutParams);
        return linearLayout;
    }

    public final sj8 y0() {
        return (sj8) this.c.getValue();
    }
}
