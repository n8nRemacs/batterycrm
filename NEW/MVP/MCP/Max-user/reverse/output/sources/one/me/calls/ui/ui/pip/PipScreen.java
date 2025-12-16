package one.me.calls.ui.ui.pip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.g56;
import defpackage.gw0;
import defpackage.ipi;
import defpackage.j0b;
import defpackage.j2e;
import defpackage.nha;
import defpackage.qj1;
import defpackage.r1c;
import defpackage.sn0;
import defpackage.toc;
import defpackage.vid;
import defpackage.vye;
import defpackage.x1c;
import defpackage.x4h;
import defpackage.y1c;
import defpackage.yy7;
import defpackage.zfb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/calls/ui/ui/pip/PipScreen;", "Lone/me/sdk/arch/Widget;", "Lnha;", "Lj2e;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PipScreen extends Widget implements nha, j2e {
    public static final /* synthetic */ yy7[] o;
    public final int a;
    public final sn0 b;
    public final Object c;
    public final Object d;

    static {
        toc tocVar = new toc(PipScreen.class, "fakePipView", "getFakePipView()Lone/me/calls/ui/view/pip/CallPipView;", 0);
        vid.a.getClass();
        o = new yy7[]{tocVar};
    }

    public PipScreen() {
        super(null, 0, 3, null);
        this.a = 3;
        this.b = binding(new x1c(this, 0));
        this.c = ipi.b(3, new x1c(this, 1));
        this.d = ipi.b(3, new zfb(20));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((vye) this.d.getValue()).getClass();
        vye.a();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(j0b.v0);
        yy7 yy7Var = o[0];
        frameLayout.addView((qj1) this.b.getValue());
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroy() {
        super.onDestroy();
        r1c r1cVar = (r1c) this.c.getValue();
        r1cVar.a.c(r1cVar);
        r1cVar.c = null;
        ((x4h) r1cVar.X.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ?? r4 = this.c;
        r1c r1cVar = (r1c) r4.getValue();
        yy7 yy7Var = o[0];
        r1cVar.c = (qj1) this.b.getValue();
        gw0.w(new g56(((r1c) r4.getValue()).o, new y1c(this, null), 1), getViewLifecycleScope());
    }

    @Override // defpackage.j2e
    /* renamed from: v, reason: from getter */
    public final int getA() {
        return this.a;
    }
}
