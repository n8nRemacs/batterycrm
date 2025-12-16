package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.av;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bv;
import defpackage.c7j;
import defpackage.cv;
import defpackage.dn2;
import defpackage.dv;
import defpackage.e4c;
import defpackage.eh9;
import defpackage.ev;
import defpackage.fdc;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i84;
import defpackage.ik3;
import defpackage.imb;
import defpackage.in2;
import defpackage.ipi;
import defpackage.j0e;
import defpackage.jo2;
import defpackage.k18;
import defpackage.kk3;
import defpackage.kl2;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.ll2;
import defpackage.m01;
import defpackage.m3;
import defpackage.nl2;
import defpackage.oha;
import defpackage.ol2;
import defpackage.pb2;
import defpackage.pl2;
import defpackage.q07;
import defpackage.qk3;
import defpackage.ql2;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.qt7;
import defpackage.qu1;
import defpackage.rl2;
import defpackage.rsb;
import defpackage.s2i;
import defpackage.sn0;
import defpackage.svi;
import defpackage.t9f;
import defpackage.tb9;
import defpackage.tl2;
import defpackage.toc;
import defpackage.ul2;
import defpackage.uog;
import defpackage.v40;
import defpackage.v8b;
import defpackage.vid;
import defpackage.vpc;
import defpackage.vw4;
import defpackage.w3d;
import defpackage.wqi;
import defpackage.yb9;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zk2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/media/ChatMediaListWidget;", "Lone/me/sdk/arch/Widget;", "Lkl2;", "Lg44;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Ldn2;", "type", "(JLdn2;)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMediaListWidget extends Widget implements kl2, g44, qq3 {
    public static final /* synthetic */ yy7[] t0 = {new z8a(ChatMediaListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), ho7.d(vid.a, ChatMediaListWidget.class, "mediaType", "getMediaType()Lone/me/profile/screens/media/model/ChatMediaType;", 0), new toc(ChatMediaListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new toc(ChatMediaListWidget.class, "emptyView", "getEmptyView()Lone/me/profile/screens/media/view/ChatMediaEmptyView;", 0)};
    public final k18 X;
    public final bbd Y;
    public final k18 Z;
    public yb9 a;
    public final t9f b;
    public final hs c;
    public final k18 d;
    public final Object o;
    public final sn0 s0;

    public ChatMediaListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.b = c7j.c();
        this.c = new hs(dn2.class, "media_type");
        this.d = createViewModelLazy(jo2.class, new tl2(0, new m3(bundle, this, 26)));
        this.o = ipi.b(3, new nl2(this, 0));
        this.X = fdc.a.getAccessor().d(523);
        this.Y = viewBinding(v8b.n0);
        this.Z = rsb.a.a();
        jo2 jo2VarZ0 = z0();
        pb2 pb2VarZ = jo2VarZ0.z();
        eh9 eh9Var = pb2VarZ != null ? pb2VarZ.c : null;
        Long lValueOf = eh9Var != null ? Long.valueOf(eh9Var.getC()) : null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            ul2 ul2VarB = jo2VarZ0.B();
            if (ul2VarB != null) {
                wqi.c(ul2VarB.a, "load: time = %d, loadOperation = %s", Long.valueOf(jLongValue), ul2VarB.Z);
                if (jLongValue != 0) {
                    synchronized (ul2VarB.Z) {
                        try {
                            synchronized (ul2VarB.Z) {
                            }
                            if (ul2VarB.Z.a == jLongValue) {
                                wqi.o(ul2VarB.a, null, "load: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                            } else {
                                ul2VarB.t0.a();
                                ul2VarB.s0.a();
                                ul2VarB.Z.a();
                                ul2VarB.Z.a = jLongValue;
                                ev evVar = ul2VarB.Z;
                                qk3 qk3VarH = new kk3(0, new dv(new av(ul2VarB, jLongValue, 1))).h(ul2VarB.c);
                                j0e j0eVar = ul2VarB.d;
                                Objects.requireNonNull(j0eVar, "scheduler is null");
                                ik3 ik3Var = new ik3(new qk3(qk3VarH, j0eVar, 0), 1, new bv(ul2VarB, 2));
                                qu1 qu1Var = new qu1(new bv(ul2VarB, 3), 0, new cv(ul2VarB, 1));
                                ik3Var.f(qu1Var);
                                evVar.b = qu1Var;
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        this.s0 = binding(new nl2(this, 1));
    }

    public static final EndlessRecyclerView2 y0(ChatMediaListWidget chatMediaListWidget) {
        return (EndlessRecyclerView2) chatMediaListWidget.Y.D(chatMediaListWidget, t0[2]);
    }

    public final dn2 A0() {
        yy7 yy7Var = t0[1];
        return (dn2) this.c.a(this);
    }

    public final void B0(yb9 yb9Var, View view) {
        if (yb9Var.l()) {
            return;
        }
        uog.i(view, q07.LONG_PRESS);
        if (this.a == null) {
            yy7[] yy7VarArr = t0;
            yy7 yy7Var = yy7VarArr[0];
            t9f t9fVar = this.b;
            qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
            if (qt7Var == null || !qt7Var.isActive()) {
                t9fVar.O(this, yy7VarArr[0], svi.e(getViewLifecycleScope(), null, i84.b, new rl2(this, yb9Var, view, null), 1));
            }
        }
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        yb9 yb9Var = this.a;
        if (yb9Var != null) {
            this.a = null;
            z0().H(i, yb9Var);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        Object next;
        if (bundle != null) {
            long j = bundle.getLong("selected_message_id");
            long j2 = bundle.getLong("selected_attach_id");
            jo2 jo2VarZ0 = z0();
            Iterator it = ((in2) jo2VarZ0.T0.getValue()).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                yb9 yb9Var = (yb9) next;
                if (yb9Var.j() == j && yb9Var.i() == j2) {
                    break;
                }
            }
            yb9 yb9Var2 = (yb9) next;
            if (yb9Var2 == null) {
                return;
            }
            jo2VarZ0.H(i, yb9Var2);
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        if (A0() != dn2.b) {
            return;
        }
        v40 v40Var = ((e4c) this.X.getValue()).b;
        v40Var.X = true;
        v40Var.g();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), null, 6);
        endlessRecyclerView2.setId(v8b.n0);
        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        endlessRecyclerView2.setPager(z0().S0);
        endlessRecyclerView2.setThreshold(20);
        endlessRecyclerView2.setAdapter(new ll2(((g4b) fdc.a.getAccessor().c(56)).a(), this));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        oha ohaVar = new oha();
        ohaVar.g = false;
        endlessRecyclerView2.setItemAnimator(ohaVar);
        endlessRecyclerView2.setOverScrollMode(2);
        yy7[] yy7VarArr = t0;
        int i = 3;
        yy7 yy7Var = yy7VarArr[3];
        sn0 sn0Var = this.s0;
        endlessRecyclerView2.setEmptyView((zk2) sn0Var.getValue());
        endlessRecyclerView2.setHasFixedSize(true);
        if (ol2.$EnumSwitchMapping$0[A0().ordinal()] == 1) {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new GridLayoutManager(3));
            endlessRecyclerView2.j(new m01(i, kti.d(3 * vw4.d().getDisplayMetrics().density), 5));
        } else {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        frameLayout.addView(endlessRecyclerView2);
        yy7 yy7Var2 = yy7VarArr[3];
        frameLayout.addView((zk2) sn0Var.getValue());
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        if (A0() != dn2.b) {
            return;
        }
        v40 v40Var = ((e4c) this.X.getValue()).b;
        v40Var.X = false;
        vpc vpcVar = v40Var.b;
        if (v40Var.o) {
            v40Var.o = false;
            vpcVar.b();
            vpcVar.h.remove(v40Var.Y);
        }
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        qt7 qt7Var = (qt7) this.b.D(this, t0[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        this.a = null;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    jo2 jo2VarZ0 = z0();
                    tb9 tb9Var = jo2VarZ0.O0;
                    jo2VarZ0.O0 = null;
                    if (tb9Var != null) {
                        jo2VarZ0.G(tb9Var);
                        return;
                    }
                    return;
                }
            }
            z0().O0 = null;
            qsb qsbVar = (qsb) this.Z.getValue();
            s2i s2iVar = new s2i(this, 1);
            int i3 = w3d.messages_list_request_storage_permission_title;
            int i4 = w3d.messages_list_request_storage_permission_subtitle;
            qsbVar.getClass();
            qsb.q(s2iVar, strArr, iArr, i3, i4);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        hbd hbdVar = z0().U0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new pl2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().P0, getViewLifecycleOwner().p(), l38Var), new ql2(null, this), 1), getViewLifecycleScope());
    }

    public final jo2 z0() {
        return (jo2) this.d.getValue();
    }

    public ChatMediaListWidget(long j, dn2 dn2Var) {
        this(gwi.b(new imb("chat_id", Long.valueOf(j)), new imb("media_type", dn2Var)));
    }
}
