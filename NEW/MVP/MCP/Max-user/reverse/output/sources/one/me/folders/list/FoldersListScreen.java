package one.me.folders.list;

import android.annotation.SuppressLint;
import android.content.Context;
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
import defpackage.bt7;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.d5b;
import defpackage.d92;
import defpackage.dc6;
import defpackage.ec6;
import defpackage.eo7;
import defpackage.f5b;
import defpackage.f86;
import defpackage.fc6;
import defpackage.fxg;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gc6;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.hc6;
import defpackage.jx0;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kc6;
import defpackage.l38;
import defpackage.l48;
import defpackage.m;
import defpackage.nq5;
import defpackage.oc6;
import defpackage.q2b;
import defpackage.qa6;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.svi;
import defpackage.t8j;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vb6;
import defpackage.vid;
import defpackage.vo8;
import defpackage.vs7;
import defpackage.xc0;
import defpackage.y71;
import defpackage.yfb;
import defpackage.yo3;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/folders/list/FoldersListScreen;", "Lone/me/sdk/arch/Widget;", "", "Lqq3;", "Lg44;", "<init>", "()V", "folders_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FoldersListScreen extends Widget implements qq3, g44 {
    public static final /* synthetic */ yy7[] Y;
    public final bbd X;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final bt7 d;
    public final dc6 o;

    static {
        toc tocVar = new toc(FoldersListScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        Y = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FoldersListScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new nq5(9), (cm6) null, 6);
        this.b = eo7.f;
        this.c = createViewModelLazy(oc6.class, new yo3(13, new nq5(10)));
        this.d = new bt7(new vs7(this));
        this.o = new dc6(((g4b) vb6.a.getAccessor().c(56)).a(), new jx0(1, this, FoldersListScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 17), new fc6(3, 0, FoldersListScreen.class, this, "onActionMenuClick", "onActionMenuClick(Landroid/view/View;Lone/me/folders/list/adapter/UserFolderListItem;I)V"), new t9f(17, this));
        this.X = viewBinding(d5b.m);
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        fxg fxgVar;
        f86 f86Var;
        CharSequence charSequence;
        f86 f86Var2;
        String str;
        if (i != d5b.j) {
            if (i != d5b.k || (fxgVar = y0().w0) == null || (f86Var = fxgVar.a) == null || (charSequence = f86Var.b) == null) {
                return;
            }
            t8j.b(charSequence, this);
            return;
        }
        oc6 oc6VarY0 = y0();
        fxg fxgVar2 = oc6VarY0.w0;
        if (fxgVar2 == null || (f86Var2 = fxgVar2.a) == null || (str = f86Var2.a) == null) {
            return;
        }
        ci5 ci5Var = oc6VarY0.u0;
        qa6.c.getClass();
        xc0.l(":settings/folder/edit?id=".concat(str), ci5Var);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == d5b.c) {
            oc6 oc6VarY0 = y0();
            svi.e(oc6VarY0.a, ((q2b) oc6VarY0.c).a(), null, new kc6(oc6VarY0, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(d5b.o);
        yfbVar.setForm(qfb.a);
        yfbVar.setTitle(f5b.c);
        yfbVar.setLeftActions(new gfb(new d92(25, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(d5b.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        this.d.i(recyclerView);
        recyclerView.j(new y71(5));
        recyclerView.j(new vo8(2));
        recyclerView.j(new ec6((Context) vb6.a.getAccessor().c(12)));
        recyclerView.j(new ec6(a93.s0.y(recyclerView)));
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(d5b.n);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(yfbVar);
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 6), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.d.i(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ci5 ci5Var = y0().u0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new gc6(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().t0, getViewLifecycleOwner().p(), l38Var), new hc6(null, this), 1), getViewLifecycleScope());
    }

    public final oc6 y0() {
        return (oc6) this.c.getValue();
    }
}
