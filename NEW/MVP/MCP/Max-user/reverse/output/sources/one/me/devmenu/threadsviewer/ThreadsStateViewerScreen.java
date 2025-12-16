package one.me.devmenu.threadsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8g;
import defpackage.aw0;
import defpackage.b8g;
import defpackage.d8g;
import defpackage.eo7;
import defpackage.fb6;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.k18;
import defpackage.kti;
import defpackage.kvf;
import defpackage.l38;
import defpackage.nte;
import defpackage.q67;
import defpackage.sn0;
import defpackage.toc;
import defpackage.uif;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/threadsviewer/ThreadsStateViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "fb6", "d44", "threads-viewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ThreadsStateViewerScreen extends Widget {
    public static final /* synthetic */ yy7[] o;
    public final eo7 a;
    public final sn0 b;
    public final k18 c;
    public final fb6 d;

    static {
        toc tocVar = new toc(ThreadsStateViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        vid.a.getClass();
        o = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadsStateViewerScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = binding(new kvf(6, this));
        this.c = createViewModelLazy(a8g.class, new uif(2, new nte(29)));
        this.d = new fb6(this, ((g4b) b8g.a.getAccessor().c(56)).a());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getT0() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        yy7 yy7Var = o[0];
        linearLayout.addView((yfb) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = 12;
        recyclerView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.d);
        recyclerView.j(new q67(new ColorDrawable(-16777216)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 112;
        linearLayout.addView(recyclerView, layoutParams);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((a8g) this.c.getValue()).b, getViewLifecycleOwner().p(), l38.d), new d8g(null, this), 1), getViewLifecycleScope());
    }
}
