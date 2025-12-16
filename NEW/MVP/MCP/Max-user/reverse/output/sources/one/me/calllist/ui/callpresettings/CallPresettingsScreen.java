package one.me.calllist.ui.callpresettings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b0b;
import defpackage.bbd;
import defpackage.cpi;
import defpackage.d9e;
import defpackage.dk1;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fua;
import defpackage.g31;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gza;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.i6;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5j;
import defpackage.q;
import defpackage.qfb;
import defpackage.r6;
import defpackage.sj1;
import defpackage.t9f;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u91;
import defpackage.ut3;
import defpackage.vid;
import defpackage.vj1;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.xj1;
import defpackage.yfb;
import defpackage.yj1;
import defpackage.yy7;
import defpackage.yza;
import defpackage.z11;
import defpackage.zj1;
import defpackage.zr0;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calllist/ui/callpresettings/CallPresettingsScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "call-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallPresettingsScreen extends Widget {
    public static final /* synthetic */ yy7[] Z = {new toc(CallPresettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, CallPresettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(CallPresettingsScreen.class, "saveButton", "getSaveButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final bbd X;
    public final bbd Y;
    public final k18 a;
    public final sj1 b;
    public final Object c;
    public final Object d;
    public final bbd o;

    /* JADX WARN: Multi-variable type inference failed */
    public CallPresettingsScreen() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getA() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(layoutParams);
        yfb yfbVar = new yfb(constraintLayout.getContext(), 6);
        yfbVar.setFocusable(true);
        yfbVar.setFocusableInTouchMode(true);
        yfbVar.setId(yza.x);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(b0b.u);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new z11(2, this)));
        RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext(), null);
        recyclerView.setId(yza.u);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.b);
        recyclerView.setItemAnimator(null);
        recyclerView.j((d9e) this.c.getValue());
        recyclerView.j((vj1) this.d.getValue());
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(yza.z);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f8j.d(oneMeButton, 300L, new r6(3, this));
        oneMeButton.setText(b0b.s);
        oneMeButton.setVisibility(8);
        constraintLayout.addView(yfbVar);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(oneMeButton);
        tqi.c(new xj1(3, null, 0), constraintLayout);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = yfbVar.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = recyclerView.getId();
        ut3VarG.d(id2, 3, yfbVar.getId(), 4);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 4, oneMeButton.getId(), 3);
        int id3 = oneMeButton.getId();
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.d(id3, 6, 0, 6);
        float f = 12;
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        new fua(ut3VarG, 7, id3, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        yy7[] yy7VarArr = Z;
        yy7 yy7Var = yy7VarArr[1];
        bbd bbdVar = this.X;
        ((RecyclerView) bbdVar.D(this, yy7Var)).setAdapter(null);
        ((RecyclerView) bbdVar.D(this, yy7VarArr[1])).p0((vj1) this.d.getValue());
        ((RecyclerView) bbdVar.D(this, yy7VarArr[1])).p0((d9e) this.c.getValue());
        ((yfb) this.o.D(this, yy7VarArr[0])).requestFocus();
        cpi.c(view);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = y0().Y;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new yj1(null, this), 1), getViewLifecycleScope());
        ((yfb) this.o.D(this, Z[0])).requestFocus();
        gw0.w(new g56(aw0.a(y0().t0, getViewLifecycleOwner().p(), l38Var), new zj1(null, this), 1), getViewLifecycleScope());
    }

    public final dk1 y0() {
        return (dk1) this.a.getValue();
    }

    public CallPresettingsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = createViewModelLazy(dk1.class, new q(20, new wj1(bundle, 0)));
        sj1 sj1Var = new sj1(new t9f(6, this), ((g4b) u91.a.getAccessor().c(56)).a());
        this.b = sj1Var;
        this.c = ipi.b(3, new i6(29, this));
        this.d = ipi.b(3, new g31(27));
        this.o = viewBinding(yza.x);
        this.X = viewBinding(yza.u);
        this.Y = viewBinding(yza.z);
        gw0.w(new g56(y0().s0, new zr0(2, sj1Var, sj1.class, "submitList", "submitList(Ljava/util/List;)V", 4, 6), 1), getLifecycleScope());
    }

    public /* synthetic */ CallPresettingsScreen(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public CallPresettingsScreen(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id_arg", j);
        this(bundle);
    }
}
