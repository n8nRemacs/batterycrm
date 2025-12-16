package one.me.devmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.bbd;
import defpackage.bv4;
import defpackage.cpi;
import defpackage.cv4;
import defpackage.d73;
import defpackage.eo7;
import defpackage.f54;
import defpackage.gfb;
import defpackage.gn;
import defpackage.ho7;
import defpackage.iv4;
import defpackage.kk4;
import defpackage.myc;
import defpackage.neb;
import defpackage.pg1;
import defpackage.qfb;
import defpackage.su4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.wo4;
import defpackage.yfb;
import defpackage.yy7;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/DevMenuScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class DevMenuScreen extends Widget {
    public static final /* synthetic */ yy7[] Y = {new toc(DevMenuScreen.class, "tabLayout", "getTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0), ho7.d(vid.a, DevMenuScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final bbd X;
    public final eo7 a;
    public final List b;
    public f54 c;
    public final kk4 d;
    public final bbd o;

    /* JADX WARN: Multi-variable type inference failed */
    public DevMenuScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = su4.a.getAccessor().a(2);
        this.d = new kk4(19);
        this.o = viewBinding(myc.oneme_devmenu_screen_view_tab_layout);
        this.X = viewBinding(myc.oneme_devmenu_screen_view_view_pager);
    }

    public static void y0(View view) {
        if (view instanceof EditText) {
            cpi.c(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                y0(viewGroup.getChildAt(i));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getD() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(myc.oneme_devmenu_screen_view);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(myc.oneme_devmenu_screen_view_oneme_toolbar);
        yfbVar.setForm(qfb.a);
        yfbVar.setTitle("Dev menu");
        yfbVar.setLeftActions(new gfb(new d73(13)));
        linearLayout.addView(yfbVar);
        neb nebVar = new neb(linearLayout.getContext(), 0);
        nebVar.setId(myc.oneme_devmenu_screen_view_tab_layout);
        nebVar.setTabMode(0);
        nebVar.setLayoutParams(new gn());
        linearLayout.addView(nebVar);
        ViewPager2 viewPager2 = new ViewPager2(linearLayout.getContext());
        viewPager2.setId(myc.oneme_devmenu_screen_view_view_pager);
        viewPager2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.b(new cv4(viewPager2, this));
        linearLayout.addView(viewPager2);
        tqi.c(new pg1(3, null, 3), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((iv4) it.next()).a();
        }
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        f54 f54Var = this.c;
        if (f54Var != null) {
            f54Var.c();
        }
        this.c = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yy7[] yy7VarArr = Y;
        yy7 yy7Var = yy7VarArr[1];
        bbd bbdVar = this.X;
        ((ViewPager2) bbdVar.D(this, yy7Var)).setAdapter(new bv4(this));
        neb nebVar = (neb) this.o.D(this, yy7VarArr[0]);
        ViewPager2 viewPager2 = (ViewPager2) bbdVar.D(this, yy7VarArr[1]);
        kk4 kk4Var = this.d;
        kk4Var.getClass();
        f54 f54Var = new f54(nebVar, viewPager2, new wo4(kk4Var, 3, nebVar));
        f54Var.b();
        this.c = f54Var;
        ((ViewPager2) bbdVar.D(this, yy7VarArr[1])).e(0, false);
    }
}
