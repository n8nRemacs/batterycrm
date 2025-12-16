package one.me.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a93;
import defpackage.arb;
import defpackage.aw0;
import defpackage.aza;
import defpackage.b54;
import defpackage.bbd;
import defpackage.bm8;
import defpackage.bud;
import defpackage.c54;
import defpackage.cm8;
import defpackage.dm8;
import defpackage.em8;
import defpackage.f1e;
import defpackage.f8j;
import defpackage.fm8;
import defpackage.fni;
import defpackage.fr7;
import defpackage.g56;
import defpackage.gm8;
import defpackage.gw0;
import defpackage.h54;
import defpackage.hbd;
import defpackage.hm8;
import defpackage.ho7;
import defpackage.i54;
import defpackage.jve;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kg6;
import defpackage.ks0;
import defpackage.kti;
import defpackage.kve;
import defpackage.l38;
import defpackage.l48;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.m6b;
import defpackage.nm8;
import defpackage.o0d;
import defpackage.o91;
import defpackage.pm8;
import defpackage.qm8;
import defpackage.rha;
import defpackage.rqi;
import defpackage.rsd;
import defpackage.svi;
import defpackage.toc;
import defpackage.ue3;
import defpackage.um6;
import defpackage.vid;
import defpackage.vl8;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.wya;
import defpackage.x4j;
import defpackage.xya;
import defpackage.yo3;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.yya;
import defpackage.zqb;
import defpackage.zya;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lone/me/main/MainScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "route", "Landroid/os/Bundle;", "routeArgs", "(Ljava/lang/String;Landroid/os/Bundle;)V", "bm8", "rha", "main-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainScreen extends Widget {
    public final String X;
    public final k18 a;
    public final ka5 b;
    public final LinkedHashMap c;
    public final bbd d;
    public final bbd o;
    public static final /* synthetic */ yy7[] Z = {new toc(MainScreen.class, "rootView", "getRootView()Landroid/widget/FrameLayout;", 0), ho7.d(vid.a, MainScreen.class, "bottomBarView", "getBottomBarView()Lone/me/common/bottombar/OneMeBottomBarView;", 0)};
    public static final rha Y = new rha(23);
    public static final jve s0 = kve.b(0, 1, 4);

    public MainScreen() {
        super(null, 0, 3, null);
        nm8 nm8Var = (nm8) vl8.a.getAccessor().c(2);
        this.a = createViewModelLazy(qm8.class, new yo3(28, new fr7(10, this)));
        int i = 0;
        int i2 = 0;
        this.b = new ka5(new o91(i2, this, MainScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", i, 18), new o91(i2, this, MainScreen.class, "getCurrentParams", "getCurrentParams()Lone/me/sdk/statistics/params/Params;", i, 19), 4);
        this.c = new LinkedHashMap();
        this.d = viewBinding(m6b.h);
        this.o = viewBinding(m6b.a);
        this.X = MainScreen.class.getName();
        nm8Var.c().getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        arb arbVar = arb.MAIN_SCREEN_INIT_TO_RENDER;
        nm8Var.e.m(arbVar, new zqb(arbVar, jElapsedRealtime));
        nm8Var.h = true;
        setRetainViewMode(b54.b);
    }

    public final ytd A0() {
        zya zyaVar = (zya) C0().o.a.getValue();
        ViewGroup viewGroup = (ViewGroup) this.c.get(zyaVar);
        if (viewGroup == null) {
            return null;
        }
        return getChildRouter(viewGroup, zyaVar.d);
    }

    public final f1e B0() {
        int i = ((zya) C0().o.a.getValue()).c;
        return i == m6b.g ? f1e.CONTACTS_TAB : i == m6b.c ? f1e.CALL_HISTORY_TAB : i == m6b.j ? f1e.SETTINGS_TAB : f1e.CHATS_LIST_TAB;
    }

    public final qm8 C0() {
        return (qm8) this.a.getValue();
    }

    public final void D0(zya zyaVar) {
        String str = this.X;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "handleClick, selected item=" + zyaVar, null);
            }
        }
        qm8 qm8VarC0 = C0();
        svi.e(qm8VarC0.a, null, null, new pm8(qm8VarC0, zyaVar, null), 3);
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.b;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        s0.h(Boolean.TRUE);
    }

    @Override // defpackage.c54
    public final void onChangeEnded(h54 h54Var, i54 i54Var) {
        bud budVar;
        bud budVar2;
        super.onChangeEnded(h54Var, i54Var);
        if (i54Var.b) {
            ytd router = getRouter();
            if (fni.a((router == null || (budVar2 = (bud) ue3.Q(router.e())) == null) ? null : budVar2.a, this)) {
                ytd ytdVarA0 = A0();
                Object obj = (ytdVarA0 == null || (budVar = (bud) ue3.Q(ytdVarA0.e())) == null) ? null : budVar.a;
                rsd rsdVar = obj instanceof rsd ? (rsd) obj : null;
                if (rsdVar != null) {
                    rsdVar.j();
                }
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        bud budVar;
        bud budVar2;
        super.onChangeStarted(h54Var, i54Var);
        ytd router = getRouter();
        if (fni.a((router == null || (budVar2 = (bud) ue3.Q(router.e())) == null) ? null : budVar2.a, this)) {
            return;
        }
        ytd ytdVarA0 = A0();
        Object obj = (ytdVarA0 == null || (budVar = (bud) ue3.Q(ytdVarA0.e())) == null) ? null : budVar.a;
        rsd rsdVar = obj instanceof rsd ? (rsd) obj : null;
        if (rsdVar != null) {
            rsdVar.b();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bm8 bm8Var = new bm8(this, getContext());
        bm8Var.setId(m6b.h);
        bm8Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aza azaVar = new aza(bm8Var.getContext());
        azaVar.setId(m6b.a);
        azaVar.setElevation(vw4.d().getDisplayMetrics().density * 8.0f);
        x4j.b(azaVar.getContext().getApplicationContext());
        azaVar.setBlurEnabled(Boolean.FALSE);
        a93 a93VarX = a93.s0.x(bm8Var.getContext());
        gw0.w(new g56((hbd) a93VarX.Y, new cm8(this, bm8Var, a93VarX, null), 1), getViewLifecycleScope());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        bm8Var.addView(azaVar, layoutParams);
        return bm8Var;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            y0((zya) it.next());
        }
        linkedHashMap.clear();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onRestoreInstanceState(Bundle bundle) {
        Object next;
        String string = bundle.getString("main:selected_tag");
        if (string == null) {
            return;
        }
        qm8 qm8VarC0 = C0();
        Iterator it = qm8VarC0.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((zya) next).d.equals(string)) {
                    break;
                }
            }
        }
        zya zyaVar = (zya) next;
        if (zyaVar == null) {
            return;
        }
        svi.e(qm8VarC0.a, null, null, new pm8(qm8VarC0, zyaVar, null), 3);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("main:selected_tag", ((zya) C0().o.a.getValue()).d);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        zya zyaVar = (zya) C0().o.a.getValue();
        ytd ytdVarA0 = A0();
        c54 c54VarG = ytdVarA0 != null ? ytdVarA0.g(zyaVar.d) : null;
        Widget widget = c54VarG instanceof Widget ? (Widget) c54VarG : null;
        if (widget != null) {
            widget.onUpdateArgs(bundle, bundle2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        for (zya zyaVar : C0().c) {
            aza azaVarZ0 = z0();
            boolean zA = fni.a(zyaVar, C0().o.a.getValue());
            kg6 kg6Var = new kg6(this, 10, zyaVar);
            ks0 ks0Var = new ks0(azaVarZ0.getContext());
            ks0Var.setId(zyaVar.e);
            rqi.e(o0d.tag_tab_item, ks0Var, zyaVar);
            ks0Var.setText(zyaVar.a);
            yya yyaVar = zyaVar.b;
            if (yyaVar instanceof wya) {
                wya wyaVar = (wya) yyaVar;
                Drawable drawable = (Drawable) wyaVar.a.invoke(ks0Var.getContext());
                um6 um6Var = wyaVar.b;
                ks0Var.G0.setImageDrawable(drawable);
                ks0Var.K0 = um6Var;
                ks0Var.v();
            } else {
                if (!(yyaVar instanceof xya)) {
                    throw new NoWhenBranchMatchedException();
                }
                ks0Var.setIcon(((xya) yyaVar).a);
            }
            ks0Var.setSelected(zA);
            f8j.d(ks0Var, 300L, kg6Var);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            azaVarZ0.addView(ks0Var, layoutParams);
            azaVarZ0.setWeightSum(azaVarZ0.getChildCount());
            int childCount = azaVarZ0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = azaVarZ0.getChildAt(i);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if (i == 0) {
                    float f = 12;
                    marginLayoutParams.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
                    if (azaVarZ0.getChildCount() != 1) {
                        f = 8;
                    }
                    marginLayoutParams.rightMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
                } else if (i == azaVarZ0.getChildCount() - 1) {
                    marginLayoutParams.leftMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                    marginLayoutParams.rightMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                } else {
                    float f2 = 8;
                    marginLayoutParams.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
                    marginLayoutParams.rightMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
                }
                childAt.setLayoutParams(marginLayoutParams);
            }
        }
        hbd hbdVar = C0().Y;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new dm8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().w0, getViewLifecycleOwner().p(), l38Var), new em8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().s0, getViewLifecycleOwner().p(), l38Var), new fm8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().u0, getViewLifecycleOwner().p(), l38Var), new gm8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().o, getViewLifecycleOwner().p(), l38Var), new hm8(null, this), 1), getViewLifecycleScope());
    }

    public final void y0(zya zyaVar) {
        ViewGroup viewGroup = (ViewGroup) this.c.get(zyaVar);
        if (viewGroup == null) {
            return;
        }
        ytd childRouter = getChildRouter(viewGroup, zyaVar.d, false);
        if (childRouter != null) {
            childRouter.G();
        }
        ((FrameLayout) this.d.D(this, Z[0])).removeView(viewGroup);
    }

    public final aza z0() {
        return (aza) this.o.D(this, Z[1]);
    }

    public MainScreen(String str, Bundle bundle) {
        this();
        getArgs().putString("main:arg:deep_link", str);
        getArgs().putAll(bundle);
    }
}
