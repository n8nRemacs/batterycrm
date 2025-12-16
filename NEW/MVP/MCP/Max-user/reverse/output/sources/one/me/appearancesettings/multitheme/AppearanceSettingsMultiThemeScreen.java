package one.me.appearancesettings.multitheme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import defpackage.a93;
import defpackage.ar;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b0i;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.cei;
import defpackage.cm6;
import defpackage.cr;
import defpackage.d53;
import defpackage.dpg;
import defpackage.eo7;
import defpackage.er;
import defpackage.f8j;
import defpackage.fr;
import defpackage.fua;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.ho7;
import defpackage.hr;
import defpackage.ir;
import defpackage.jr;
import defpackage.jva;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kq8;
import defpackage.kt3;
import defpackage.kti;
import defpackage.kwa;
import defpackage.l;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5j;
import defpackage.lr;
import defpackage.lwa;
import defpackage.lzf;
import defpackage.m44;
import defpackage.m5d;
import defpackage.mr;
import defpackage.nr;
import defpackage.q;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.rt2;
import defpackage.svi;
import defpackage.sxg;
import defpackage.t75;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ub;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.v3b;
import defpackage.vc9;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x3;
import defpackage.xr;
import defpackage.y71;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.z44;
import defpackage.z7;
import defpackage.zbb;
import defpackage.zfi;
import defpackage.zq;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appearancesettings/multitheme/AppearanceSettingsMultiThemeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "appearance-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class AppearanceSettingsMultiThemeScreen extends Widget {
    public static final /* synthetic */ yy7[] Z = {new toc(AppearanceSettingsMultiThemeScreen.class, "chatPreviewView", "getChatPreviewView()Lone/me/appearancesettings/multitheme/views/ChatPreviewView;", 0), ho7.d(vid.a, AppearanceSettingsMultiThemeScreen.class, "currentThemeTitle", "getCurrentThemeTitle()Landroid/widget/TextView;", 0), new toc(AppearanceSettingsMultiThemeScreen.class, "segmentedButtons", "getSegmentedButtons()Lcom/google/android/material/button/MaterialButtonToggleGroup;", 0)};
    public final k18 X;
    public final b0i Y;
    public final ka5 a;
    public final k18 b;
    public final bbd c;
    public final bbd d;
    public final bbd o;

    /* JADX WARN: Multi-variable type inference failed */
    public AppearanceSettingsMultiThemeScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new l(9), (cm6) null, 6);
        this.b = createViewModelLazy(xr.class, new q(6, new l(10)));
        this.c = viewBinding(kwa.a);
        this.d = viewBinding(kwa.b);
        this.o = viewBinding(kwa.i);
        ar arVar = ar.a;
        bwf bwfVarD = arVar.getAccessor().d(56);
        this.X = arVar.getAccessor().d(61);
        this.Y = new b0i(new nr(y0()), ((g4b) bwfVarD.getValue()).a(), 12);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getA() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(kwa.h);
        yfbVar.setForm(qfb.a);
        yfbVar.setTitle(lwa.j);
        yfbVar.setLeftActions(new gfb(new cr(this, 0)));
        TextView textView = new TextView(getContext());
        textView.setId(kwa.d);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        dpg.q.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().g);
        textView.setText(z7.e(textView.getContext(), lwa.c));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = vw4.d().getDisplayMetrics().density * 16.0f;
        }
        AttributeSet attributeSet = null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        cei.k(shapeDrawable, v1aVar.x(getContext()).k().b().h);
        zbb zbbVar = new zbb(getContext());
        zbbVar.setId(kwa.e);
        zbbVar.setLayoutParams(new kt3(0, 0));
        zbbVar.setValueFrom(0.0f);
        zbbVar.setValueTo(5.0f);
        zbbVar.setStepSize(1.0f);
        zbbVar.setValue(((sxg) this.X.getValue()).g.getInt("app.extra.text.size.mode", 1));
        zbbVar.setBackground(shapeDrawable);
        TextView textView2 = new TextView(getContext());
        textView2.setId(kwa.c);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView2.setTextColor(az1.f(dpg.A, textView2, v1aVar, textView2).g);
        textView2.setText(z7.e(textView2.getContext(), lwa.b));
        f8j.d(textView2, 300L, new ub(zbbVar, 1, textView2));
        zbbVar.A0.add(new fr(textView2, this));
        rt2 rt2Var = new rt2(getContext());
        rt2Var.setId(kwa.a);
        svi.e(getViewLifecycleScope(), null, null, new ir(rt2Var, this, null), 3);
        TextView textView3 = new TextView(getContext());
        textView3.setId(kwa.b);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView3.setTextColor(az1.f(dpg.f, textView3, v1aVar, textView3).e);
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(kwa.f);
        recyclerView.setLayoutParams(new kt3(-2, 0));
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.p1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.j(new y71(11));
        recyclerView.j(new vc9(recyclerView.getContext(), new cr(this, 1)));
        TextView textView4 = new TextView(getContext());
        textView4.setId(kwa.g);
        textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView4.setTextColor(az1.f(dpg.q, textView4, v1aVar, textView4).g);
        textView4.setText(z7.e(textView4.getContext(), lwa.h));
        MaterialButtonToggleGroup materialButtonToggleGroup = new MaterialButtonToggleGroup(getContext(), null);
        materialButtonToggleGroup.setId(kwa.i);
        materialButtonToggleGroup.setLayoutParams(new kt3(-1, 0));
        materialButtonToggleGroup.setElevation(0.0f);
        materialButtonToggleGroup.setStateListAnimator(null);
        materialButtonToggleGroup.setSingleSelection(true);
        materialButtonToggleGroup.setSelectionRequired(true);
        materialButtonToggleGroup.setOrientation(0);
        m44 m44Var = new m44(materialButtonToggleGroup.getContext(), m5d.Theme_MaterialComponents_DayNight);
        Iterator it = y0().A0.iterator();
        while (it.hasNext()) {
            zq zqVar = (zq) it.next();
            MaterialButton materialButton = new MaterialButton(m44Var, attributeSet);
            ShapeDrawable shapeDrawable2 = shapeDrawable;
            m44 m44Var2 = m44Var;
            materialButton.setId((int) zqVar.getItemId());
            CharSequence charSequenceB = zqVar.c.b(materialButton.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            materialButton.setText(charSequenceB);
            dpg.z.b(materialButton, t75.b);
            materialButton.setCornerRadius(kti.d(12 * vw4.d().getDisplayMetrics().density));
            materialButton.setStrokeWidth(kti.d(1 * vw4.d().getDisplayMetrics().density));
            float f = 8;
            materialButton.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), materialButton.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), materialButton.getPaddingBottom());
            materialButton.setElevation(0.0f);
            materialButton.setStateListAnimator(null);
            materialButton.setChecked(materialButton.isSelected());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            materialButton.setLayoutParams(layoutParams);
            tqi.c(new er(3, (Continuation) null, 0), materialButton);
            materialButtonToggleGroup.addView(materialButton);
            shapeDrawable = shapeDrawable2;
            m44Var = m44Var2;
            attributeSet = null;
        }
        ShapeDrawable shapeDrawable3 = shapeDrawable;
        materialButtonToggleGroup.c.add(new kq8() { // from class: dr
            @Override // defpackage.kq8
            public final void a(int i2, boolean z) {
                yy7[] yy7VarArr = AppearanceSettingsMultiThemeScreen.Z;
                if (z) {
                    xr xrVarY0 = this.a.y0();
                    xfh.o(xrVarY0, ((q2b) xrVarY0.z()).a(), new ur(xrVarY0, i2, null), 2);
                }
            }
        });
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        float f2 = 12;
        float f3 = 16;
        constraintLayout.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3));
        constraintLayout.setLayoutParams(layoutParams2);
        ar arVar = ar.a;
        gw0.w(new g56(gw0.u(new x3(((v3b) arVar.getAccessor().c(500)).a, this, 2), ((q2b) ((lzf) arVar.getAccessor().d(8).getValue())).a()), new jr(rt2Var, null), 1), getViewLifecycleScope());
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.addView(zbbVar);
        constraintLayout.addView(textView4);
        constraintLayout.addView(materialButtonToggleGroup);
        constraintLayout.addView(rt2Var);
        constraintLayout.addView(textView3);
        constraintLayout.addView(recyclerView);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = textView.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        new fua(ut3VarG, 6, id, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        int id2 = textView2.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 7, 0, 7);
        new fua(ut3VarG, 7, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id3 = zbbVar.getId();
        ut3VarG.d(id3, 3, textView.getId(), 4);
        float f4 = 6;
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        int id4 = textView4.getId();
        ut3VarG.d(id4, 3, zbbVar.getId(), 4);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
        ut3VarG.d(id4, 6, 0, 6);
        new fua(ut3VarG, 6, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id5 = materialButtonToggleGroup.getId();
        ut3VarG.d(id5, 3, textView4.getId(), 4);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id5, 5));
        ut3VarG.d(id5, 6, 0, 6);
        ut3VarG.d(id5, 7, 0, 7);
        int id6 = rt2Var.getId();
        ut3VarG.d(id6, 3, materialButtonToggleGroup.getId(), 4);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id6, 5));
        ut3VarG.d(id6, 6, 0, 6);
        ut3VarG.d(id6, 7, 0, 7);
        int id7 = textView3.getId();
        ut3VarG.d(id7, 3, rt2Var.getId(), 4);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id7, 5));
        ut3VarG.d(id7, 6, 0, 6);
        ut3VarG.d(id7, 7, 0, 7);
        int id8 = recyclerView.getId();
        ut3VarG.d(id8, 3, textView3.getId(), 4);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id8, 5));
        ut3VarG.d(id8, 6, 0, 6);
        ut3VarG.d(id8, 7, 0, 7);
        ut3VarG.a(constraintLayout);
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams3);
        zfi.c(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(yfbVar);
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(constraintLayout);
        linearLayout.addView(scrollView);
        tqi.c(new hr(textView4, this, textView, textView2, shapeDrawable3, rt2Var, null), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        jva onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(getViewLifecycleOwner(), new z44(this, 1));
        }
        d53 d53Var = new d53(y0().C0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new lr(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().E0, getViewLifecycleOwner().p(), l38Var), new mr(null, this), 1), getViewLifecycleScope());
    }

    public final xr y0() {
        return (xr) this.b.getValue();
    }
}
