package one.me.settings.ringtone.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bzb;
import defpackage.cm6;
import defpackage.d9e;
import defpackage.efd;
import defpackage.eo7;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.hre;
import defpackage.ipi;
import defpackage.iqb;
import defpackage.ire;
import defpackage.jme;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kme;
import defpackage.l38;
import defpackage.lre;
import defpackage.lzf;
import defpackage.m;
import defpackage.mqd;
import defpackage.pme;
import defpackage.prd;
import defpackage.q2b;
import defpackage.qbb;
import defpackage.qfb;
import defpackage.rme;
import defpackage.sbb;
import defpackage.svi;
import defpackage.tme;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u4e;
import defpackage.vdc;
import defpackage.vid;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.z34;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/ringtone/ui/SettingRingtoneScreen;", "Lone/me/sdk/arch/Widget;", "Lg44;", "<init>", "()V", "settings-ringtone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingRingtoneScreen extends Widget implements g44 {
    public static final /* synthetic */ yy7[] Z;
    public final bbd X;
    public final hre Y;
    public final eo7 a;
    public final ka5 b;
    public final Object c;
    public z34 d;
    public final k18 o;

    static {
        toc tocVar = new toc(SettingRingtoneScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        Z = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingRingtoneScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = new ka5(new efd(16), (cm6) null, 6);
        this.c = ipi.b(3, new efd(17));
        this.o = createViewModelLazy(tme.class, new vdc(15, new prd(13, this)));
        this.X = viewBinding(qbb.g);
        hre hreVar = new hre(new kme(0, this), ((g4b) ire.a.getAccessor().c(56)).a());
        this.Y = hreVar;
        gw0.w(new g56(y0().t0, new bzb(2, hreVar, hre.class, "submitList", "submitList(Ljava/util/List;)V", 4, 7), 1), getLifecycleScope());
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("ringtone_file_path")) == null) {
            return;
        }
        tme tmeVarY0 = y0();
        svi.e(tmeVarY0.a, ((q2b) ((lzf) tmeVarY0.c.getValue())).b(), null, new pme(tmeVarY0, string, null), 2);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.b;
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 998) {
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            tme tmeVarY0 = y0();
            svi.e(tmeVarY0.a, ((q2b) ((lzf) tmeVarY0.c.getValue())).b(), null, new rme(tmeVarY0, data, null), 2);
            return;
        }
        if (i != 999) {
            return;
        }
        Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("android.intent.extra.ringtone.PICKED_URI");
        Uri uri = obj instanceof Uri ? (Uri) obj : null;
        if (uri == null) {
            return;
        }
        tme tmeVarY02 = y0();
        if (tmeVarY02.u(uri) != null) {
            tmeVarY02.y(new mqd(uri.toString()));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(qbb.h);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(sbb.l);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new iqb(27, this)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(qbb.g);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new u4e(8, this), null, null, 28));
        recyclerView.j(new lre(0));
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 15), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.X.D(this, Z[0])).setAdapter(null);
        super.onDestroyView(view);
        z34 z34Var = this.d;
        if (z34Var != null) {
            z34Var.dismiss();
        }
        this.d = null;
        y0().v().j();
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        y0().v().j();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(y0().u0, getViewLifecycleOwner().p(), l38.d), new jme(null, this), 1), getViewLifecycleScope());
    }

    public final tme y0() {
        return (tme) this.o.getValue();
    }
}
