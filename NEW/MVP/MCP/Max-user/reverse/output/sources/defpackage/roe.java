package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class roe extends ConstraintLayout implements u6g, rqd {
    public static final /* synthetic */ yy7[] b1 = {new z8a(roe.class, "modelItem", "getModelItem()Lone/me/sdk/sections/SettingsItem;"), u45.h(vid.a, roe.class, "themeDepended", "getThemeDepended()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent$Companion$ThemeDependedType;")};
    public final Object F0;
    public final bza G0;
    public final Object H0;
    public Drawable I0;
    public final SimpleDraweeView J0;
    public final LinearLayout K0;
    public final LinearLayout L0;
    public final Object M0;
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public ooe T0;
    public final ShapeDrawable U0;
    public final RippleDrawable V0;
    public final Object W0;
    public hoe X0;
    public final qoe Y0;
    public final qoe Z0;
    public boolean a1;

    public roe(final Context context, int i) {
        super(context, null);
        final int i2 = 3;
        this.F0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        bza bzaVar = new bza(context, this);
        this.G0 = bzaVar;
        final int i3 = 4;
        this.H0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i3) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(qab.h);
        float f = 40;
        simpleDraweeView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        this.J0 = simpleDraweeView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(qab.k);
        linearLayout.setLayoutParams(new kt3(kti.d(0 * vw4.d().getDisplayMetrics().density), -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388627);
        this.K0 = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(qab.d);
        linearLayout2.setLayoutParams(new kt3(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setOnTouchListener(new or6(new GestureDetector(context, new kx0(13, this)), 5));
        this.L0 = linearLayout2;
        final int i4 = 5;
        this.M0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i4) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f2 = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout3 = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout3.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        final int i5 = 6;
        this.N0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i5) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f2 = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout3 = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout3.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        final int i6 = 7;
        this.O0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i6) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f2 = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout3 = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout3.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        final int i7 = 8;
        this.P0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i7) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f2 = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout3 = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout3.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        final int i8 = 0;
        this.Q0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i8) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f2 = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout3 = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout3.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        final int i9 = 1;
        this.R0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i9) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f2 = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout3 = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout3.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        final int i10 = 2;
        this.S0 = ipi.b(3, new cm6() { // from class: loe
            @Override // defpackage.cm6
            public final Object invoke() throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        jeb jebVar = new jeb(context, null);
                        jebVar.onThemeChanged(a93.s0.y(jebVar));
                        jebVar.setSwitchMinWidth(kti.d(52 * vw4.d().getDisplayMetrics().density));
                        jebVar.setEnforceSwitchWidth(false);
                        jebVar.setSplitTrack(false);
                        jebVar.setShowText(false);
                        jebVar.setBackground(null);
                        jebVar.setChecked(false);
                        jebVar.setShowText(false);
                        this.L0.addView(jebVar);
                        return jebVar;
                    case 1:
                        p9b p9bVar = new p9b(context, null);
                        float f2 = 28;
                        p9bVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        p9bVar.b(p9bVar.isChecked(), a93.s0.y(p9bVar));
                        p9bVar.setChecked(false);
                        this.L0.addView(p9bVar);
                        return p9bVar;
                    case 2:
                        w2b w2bVar = new w2b(context);
                        w2bVar.setId(qab.l);
                        LinearLayout linearLayout3 = this.L0;
                        kt3 kt3Var = new kt3(-2, -2);
                        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
                        linearLayout3.addView(w2bVar, kt3Var);
                        return w2bVar;
                    case 3:
                        return roe.z(context, this);
                    case 4:
                        return roe.w(context, this);
                    case 5:
                        return roe.B(context, this);
                    case 6:
                        return roe.v(context, this);
                    case 7:
                        return roe.x(context, this);
                    default:
                        return roe.A(context, this);
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.U0 = shapeDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this).c().a.a.i), null, shapeDrawable);
        this.V0 = rippleDrawable;
        this.W0 = ipi.b(3, new efd(20));
        this.X0 = hoe.b;
        ioe.W.getClass();
        this.Y0 = new qoe(une.b, this);
        this.Z0 = new qoe(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinHeight(kti.d(48 * vw4.d().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        addView(simpleDraweeView);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout.addView(bzaVar);
        ut3 ut3VarG = l5j.g(this);
        int id = simpleDraweeView.getId();
        ut3VarG.d(id, 6, 0, 6);
        float f2 = 12;
        ut3VarG.g(id).d.K = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id, 3, 0, 3);
        float f3 = 4;
        ut3VarG.g(id).d.H = kti.d(vw4.d().getDisplayMetrics().density * f3);
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.g(id).d.I = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        int id2 = linearLayout.getId();
        ut3VarG.d(id2, 6, simpleDraweeView.getId(), 7);
        ut3VarG.g(id2).d.K = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id2, 6, simpleDraweeView.getId(), 7);
        ut3VarG.g(id2).d.R = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id2, 3, 0, 3);
        float f4 = 10;
        ut3VarG.g(id2).d.H = kti.d(vw4.d().getDisplayMetrics().density * f4);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.g(id2).d.I = kti.d(f4 * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id2, 7, linearLayout2.getId(), 6);
        ut3VarG.g(id2).d.J = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int id3 = linearLayout2.getId();
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.g(id3).d.J = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.a(this);
    }

    public static CheckBox A(Context context, roe roeVar) {
        xcf xcfVarJ = kk4.j(context);
        kk4.e(xcfVarJ, roeVar.getCurrentTheme());
        CheckBox checkBox = new CheckBox(context);
        checkBox.setId(qab.c);
        checkBox.setPadding(0, 0, 0, 0);
        checkBox.setButtonDrawable((Drawable) null);
        checkBox.setBackground(xcfVarJ);
        checkBox.setClickable(false);
        checkBox.setChecked(true);
        float f = 24;
        roeVar.L0.addView(checkBox, new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        return checkBox;
    }

    public static TextView B(Context context, roe roeVar) {
        TextView textView = new TextView(context);
        textView.setId(qab.f);
        dpg.i.b(textView, t75.b);
        int i = poe.$EnumSwitchMapping$0[roeVar.X0.ordinal()] == 1 ? roeVar.getCurrentTheme().c().c.b.e : roeVar.getCurrentTheme().getText().g;
        textView.setMaxLines(1);
        textView.setMaxWidth(kti.d(160 * vw4.d().getDisplayMetrics().density));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(i);
        LinearLayout linearLayout = roeVar.L0;
        kt3 kt3Var = new kt3(-2, -2);
        kt3Var.setMarginEnd(kti.d(6 * vw4.d().getDisplayMetrics().density));
        linearLayout.addView(textView, kt3Var);
        return textView;
    }

    public static void F(ViewGroup viewGroup, k18 k18Var) {
        if (k18Var.e()) {
            if (((View) k18Var.getValue()).getVisibility() == 0) {
                dqi.a(viewGroup, (View) k18Var.getValue(), -1);
            } else {
                viewGroup.removeView((View) k18Var.getValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yeb getCurrentTheme() {
        v1a v1aVar = a93.s0;
        int iOrdinal = getThemeDepended().ordinal();
        if (iOrdinal == 0) {
            return v1aVar.y(this);
        }
        if (iOrdinal == 1) {
            return v1aVar.B(this).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final Matrix getTitleGradientMatrix() {
        return (Matrix) this.W0.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    private final void setupCounter(xne xneVar) {
        boolean zA = fni.a(xneVar, vne.a);
        ?? r2 = this.S0;
        if (zA) {
            w2b w2bVar = (w2b) r2.getValue();
            w2bVar.setVisibility(0);
            w2bVar.setAppearance(r2b.d);
            w2bVar.h();
            return;
        }
        if (!(xneVar instanceof wne)) {
            if (xneVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (r2.e()) {
                ((w2b) r2.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        w2b w2bVar2 = (w2b) r2.getValue();
        w2bVar2.setVisibility(0);
        wne wneVar = (wne) xneVar;
        wneVar.getClass();
        w2bVar2.setAppearance(r2b.a);
        w2bVar2.g(wneVar.a, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setupDescription(CharSequence charSequence) {
        TextView textView = (TextView) this.H0.getValue();
        textView.setVisibility(charSequence != null ? 0 : 8);
        textView.setText(charSequence);
        textView.setPadding(textView.getPaddingLeft(), kti.d(2 * vw4.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        dqi.a(this.K0, textView, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    private final void setupEndCheckbox(boolean z) {
        ?? r0 = this.Q0;
        if (r0.e()) {
            ((jeb) r0.getValue()).setVisibility(8);
        }
        ?? r02 = this.M0;
        if (r02.e()) {
            ((TextView) r02.getValue()).setVisibility(8);
        }
        ?? r03 = this.N0;
        if (r03.e()) {
            ((ImageView) r03.getValue()).setVisibility(8);
        }
        ?? r04 = this.R0;
        if (r04.e()) {
            ((p9b) r04.getValue()).setVisibility(8);
        }
        ?? r05 = this.O0;
        if (r05.e()) {
            ((ImageView) r05.getValue()).setVisibility(8);
        }
        CheckBox checkBox = (CheckBox) this.P0.getValue();
        checkBox.setId(qab.c);
        checkBox.setVisibility(0);
        checkBox.setChecked(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    private final void setupEndIcon(int i) {
        ?? r0 = this.Q0;
        if (r0.e()) {
            ((jeb) r0.getValue()).setVisibility(8);
        }
        ?? r02 = this.M0;
        if (r02.e()) {
            ((TextView) r02.getValue()).setVisibility(8);
        }
        ?? r03 = this.N0;
        if (r03.e()) {
            ((ImageView) r03.getValue()).setVisibility(8);
        }
        ?? r04 = this.R0;
        if (r04.e()) {
            ((p9b) r04.getValue()).setVisibility(8);
        }
        ?? r05 = this.P0;
        if (r05.e()) {
            ((CheckBox) r05.getValue()).setVisibility(8);
        }
        ImageView imageView = (ImageView) this.O0.getValue();
        imageView.setId(qab.m);
        imageView.setVisibility(0);
        imageView.setImageResource(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    private final void setupEndText(CharSequence charSequence) {
        ?? r0 = this.Q0;
        if (r0.e()) {
            ((jeb) r0.getValue()).setVisibility(8);
        }
        ?? r02 = this.N0;
        if (r02.e()) {
            ((ImageView) r02.getValue()).setVisibility(8);
        }
        ?? r03 = this.O0;
        if (r03.e()) {
            ((ImageView) r03.getValue()).setVisibility(8);
        }
        ?? r04 = this.R0;
        if (r04.e()) {
            ((p9b) r04.getValue()).setVisibility(8);
        }
        ?? r05 = this.P0;
        if (r05.e()) {
            ((CheckBox) r05.getValue()).setVisibility(8);
        }
        TextView textView = (TextView) this.M0.getValue();
        textView.setId(qab.q);
        textView.setText(charSequence);
        textView.setVisibility(0);
        textView.setCompoundDrawablesRelative(null, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setupUpperText(CharSequence charSequence) {
        TextView textView = (TextView) this.F0.getValue();
        textView.setVisibility(charSequence != null ? 0 : 8);
        textView.setText(charSequence);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), kti.d(2 * vw4.d().getDisplayMetrics().density));
        dqi.a(this.K0, textView, 0);
    }

    public static ImageView v(Context context, roe roeVar) {
        ImageView imageView = new ImageView(context);
        imageView.setId(qab.b);
        imageView.setImageDrawable(r34.b(imageView.getContext(), yud.D0).mutate());
        imageView.setImageTintList(ColorStateList.valueOf(roeVar.getCurrentTheme().getIcon().j));
        roeVar.L0.addView(imageView);
        return imageView;
    }

    public static TextView w(Context context, roe roeVar) {
        TextView textView = new TextView(context);
        textView.setId(qab.a);
        textView.setLayoutParams(new kt3(-2, -2));
        dpg.j.b(textView, t75.b);
        textView.setMaxLines(2);
        int iOrdinal = roeVar.X0.ordinal();
        textView.setTextColor(iOrdinal != 0 ? iOrdinal != 4 ? roeVar.getCurrentTheme().getText().g : roeVar.getCurrentTheme().c().c.b.e : roeVar.getCurrentTheme().getText().j);
        textView.setPadding(0, kti.d(2 * vw4.d().getDisplayMetrics().density), 0, 0);
        roeVar.K0.addView(textView);
        return textView;
    }

    public static ImageView x(Context context, roe roeVar) {
        ImageView imageView = new ImageView(context);
        imageView.setId(qab.e);
        imageView.setImageTintList(ColorStateList.valueOf(roeVar.getCurrentTheme().getIcon().k));
        roeVar.L0.addView(imageView);
        return imageView;
    }

    public static TextView z(Context context, roe roeVar) {
        TextView textView = new TextView(context);
        textView.setId(qab.j);
        textView.setLayoutParams(new kt3(-2, -2));
        dpg.l.b(textView, t75.b);
        textView.setTextColor(roeVar.getCurrentTheme().getText().g);
        roeVar.K0.addView(textView, 0);
        return textView;
    }

    public final ioe getModelItem() {
        yy7 yy7Var = b1[0];
        return (ioe) this.Y0.b;
    }

    public final noe getThemeDepended() {
        yy7 yy7Var = b1[1];
        return (noe) this.Z0.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onThemeChanged(defpackage.yeb r14) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roe.onThemeChanged(yeb):void");
    }

    public final void setCounter(xne xneVar) {
        setupCounter(xneVar);
        requestLayout();
        invalidate();
    }

    public final void setDescription(s5g s5gVar) {
        setupDescription(s5gVar != null ? s5gVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDisableStartIconText(boolean z) {
        this.a1 = z;
        SimpleDraweeView simpleDraweeView = this.J0;
        if (z) {
            simpleDraweeView.setImageTintList(null);
        } else {
            simpleDraweeView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().k));
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v40, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    public final void setEndView(foe foeVar) throws Resources.NotFoundException {
        Drawable drawableMutate;
        ?? r0 = this.N0;
        ?? r1 = this.P0;
        ?? r2 = this.O0;
        ?? r4 = this.R0;
        ?? r5 = this.M0;
        ?? r6 = this.Q0;
        if (foeVar == null) {
            if (r6.e()) {
                ((jeb) r6.getValue()).setVisibility(8);
            }
            if (r5.e()) {
                ((TextView) r5.getValue()).setVisibility(8);
            }
            if (r0.e()) {
                ((ImageView) r0.getValue()).setVisibility(8);
            }
            if (r2.e()) {
                ((ImageView) r2.getValue()).setVisibility(8);
            }
            if (r4.e()) {
                ((p9b) r4.getValue()).setVisibility(8);
            }
            if (r1.e()) {
                ((CheckBox) r1.getValue()).setVisibility(8);
            }
        } else if (foeVar instanceof doe) {
            doe doeVar = (doe) foeVar;
            boolean z = doeVar.a;
            boolean z2 = doeVar.b;
            if (r5.e()) {
                ((TextView) r5.getValue()).setVisibility(8);
            }
            if (r0.e()) {
                ((ImageView) r0.getValue()).setVisibility(8);
            }
            if (r2.e()) {
                ((ImageView) r2.getValue()).setVisibility(8);
            }
            if (r4.e()) {
                ((p9b) r4.getValue()).setVisibility(8);
            }
            if (r1.e()) {
                ((CheckBox) r1.getValue()).setVisibility(8);
            }
            jeb jebVar = (jeb) r6.getValue();
            jebVar.setId(qab.p);
            jebVar.setVisibility(0);
            if (jebVar.isChecked() != z) {
                jebVar.setChecked(z);
            }
            jebVar.setEnabled(z2);
            jebVar.setClickable(z2);
        } else if (foeVar instanceof yne) {
            if (r6.e()) {
                ((jeb) r6.getValue()).setVisibility(8);
            }
            if (r5.e()) {
                ((TextView) r5.getValue()).setVisibility(8);
            }
            if (r4.e()) {
                ((p9b) r4.getValue()).setVisibility(8);
            }
            if (r2.e()) {
                ((ImageView) r2.getValue()).setVisibility(8);
            }
            if (r1.e()) {
                ((CheckBox) r1.getValue()).setVisibility(8);
            }
            ImageView imageView = (ImageView) r0.getValue();
            imageView.setId(qab.n);
            imageView.setVisibility(0);
        } else {
            if (foeVar instanceof boe) {
                boe boeVar = (boe) foeVar;
                CharSequence charSequenceB = boeVar.a.b(getContext());
                String str = charSequenceB != null ? charSequenceB : "";
                Integer num = boeVar.b;
                if (r6.e()) {
                    ((jeb) r6.getValue()).setVisibility(8);
                }
                if (r4.e()) {
                    ((p9b) r4.getValue()).setVisibility(8);
                }
                TextView textView = (TextView) r5.getValue();
                textView.setId(qab.q);
                textView.setText(str);
                textView.setVisibility(0);
                textView.setCompoundDrawablePadding(6);
                x5g.f(textView, ColorStateList.valueOf(getCurrentTheme().getIcon().j));
                if (num != null) {
                    drawableMutate = r34.b(textView.getContext(), num.intValue()).mutate();
                    float f = 16;
                    drawableMutate.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                } else {
                    drawableMutate = null;
                }
                textView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
                ImageView imageView2 = (ImageView) r0.getValue();
                imageView2.setId(qab.n);
                imageView2.setVisibility(0);
            } else if (foeVar instanceof eoe) {
                CharSequence charSequenceB2 = ((eoe) foeVar).a.b(getContext());
                setupEndText(charSequenceB2 != null ? charSequenceB2 : "");
            } else if (foeVar instanceof coe) {
                coe coeVar = (coe) foeVar;
                boolean z3 = coeVar.a;
                boolean z4 = coeVar.b;
                if (r5.e()) {
                    ((TextView) r5.getValue()).setVisibility(8);
                }
                if (r0.e()) {
                    ((ImageView) r0.getValue()).setVisibility(8);
                }
                if (r2.e()) {
                    ((ImageView) r2.getValue()).setVisibility(8);
                }
                if (r6.e()) {
                    ((jeb) r6.getValue()).setVisibility(8);
                }
                if (r1.e()) {
                    ((CheckBox) r1.getValue()).setVisibility(8);
                }
                p9b p9bVar = (p9b) r4.getValue();
                p9bVar.setId(qab.o);
                p9bVar.setVisibility(0);
                p9bVar.setChecked(z3);
                p9bVar.setEnabled(z4);
                p9bVar.setOnCheckedChangeListener(new d83(2, this));
            } else if (foeVar instanceof aoe) {
                setupEndIcon(((aoe) foeVar).a);
            } else {
                if (!(foeVar instanceof zne)) {
                    throw new NoWhenBranchMatchedException();
                }
                setupEndCheckbox(((zne) foeVar).a);
            }
        }
        ?? r13 = this.S0;
        boolean zE = r13.e();
        LinearLayout linearLayout = this.L0;
        if (zE) {
            linearLayout.removeView((w2b) r13.getValue());
        }
        if (r5.e()) {
            linearLayout.removeView((TextView) r5.getValue());
        }
        if (r0.e()) {
            linearLayout.removeView((ImageView) r0.getValue());
        }
        if (r2.e()) {
            linearLayout.removeView((ImageView) r2.getValue());
        }
        if (r1.e()) {
            linearLayout.removeView((CheckBox) r1.getValue());
        }
        F(linearLayout, r13);
        F(linearLayout, r5);
        F(linearLayout, r0);
        F(linearLayout, r2);
        F(linearLayout, r6);
        F(linearLayout, r4);
        F(linearLayout, r1);
        linearLayout.requestLayout();
        linearLayout.invalidate();
    }

    public final void setItemId(long j) {
    }

    public final void setModelItem(ioe ioeVar) {
        this.Y0.O(this, b1[0], ioeVar);
    }

    public final void setOnSwitchCheckedListener(sm6 sm6Var) {
        if (sm6Var != null) {
            setOnSwitchListener(new w7c(sm6Var));
        } else {
            setOnSwitchListener(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setOnSwitchListener(final ooe ooeVar) {
        ?? r0 = this.Q0;
        if (r0.e()) {
            this.T0 = ooeVar;
            if (ooeVar == null) {
                ((jeb) r0.getValue()).setOnCheckedChangeListener(null);
            } else {
                ((jeb) r0.getValue()).setOnCheckedChangeListener(null);
                ((jeb) r0.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: moe
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        if (compoundButton.isPressed()) {
                            roe roeVar = this.a;
                            if (roeVar.getModelItem().d() instanceof doe) {
                                foe foeVarD = roeVar.getModelItem().d();
                                doe doeVar = foeVarD instanceof doe ? (doe) foeVarD : null;
                                if (doeVar == null || doeVar.a != z) {
                                    foe foeVarD2 = roeVar.getModelItem().d();
                                    doe doeVar2 = foeVarD2 instanceof doe ? (doe) foeVarD2 : null;
                                    if (doeVar2 != null) {
                                        doeVar2.a = z;
                                    }
                                }
                            }
                            ooeVar.g(roeVar.getModelItem().getItemId(), z);
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.rqd
    public void setRippleMask(Shape shape) {
        this.U0.setShape(shape);
    }

    public final void setStartIcon(int i) {
        setStartIcon(baj.a(i));
    }

    public final void setThemeDepended(noe noeVar) {
        this.Z0.O(this, b1[1], noeVar);
    }

    public final void setTitle(s5g s5gVar) {
        this.G0.setText(s5gVar != null ? s5gVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setType(hoe hoeVar) {
        if (this.X0 == hoeVar) {
            return;
        }
        this.X0 = hoeVar;
        onThemeChanged(a93.s0.y(this));
        requestLayout();
        invalidate();
    }

    public final void setUpperText(s5g s5gVar) {
        setupUpperText(s5gVar != null ? s5gVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setStartIcon(u18 u18Var) {
        tyd tydVar = null;
        SimpleDraweeView simpleDraweeView = this.J0;
        if (u18Var == null) {
            simpleDraweeView.setVisibility(8);
            simpleDraweeView.setController(null);
            ((gr6) simpleDraweeView.getHierarchy()).i(null, 5);
            ((gr6) simpleDraweeView.getHierarchy()).k(null);
            simpleDraweeView.setPadding(0, 0, 0, 0);
        } else if (u18Var instanceof s18) {
            simpleDraweeView.setVisibility(0);
            simpleDraweeView.setController(null);
            ((gr6) simpleDraweeView.getHierarchy()).i(null, 5);
            gr6 gr6Var = (gr6) simpleDraweeView.getHierarchy();
            s18 s18Var = (s18) u18Var;
            int i = s18Var.a;
            int i2 = r18.$EnumSwitchMapping$0[az1.v(s18Var.c)];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tydVar = tyd.d;
            }
            Drawable qydVar = tydVar != null ? new qyd(r34.b(getContext(), i).mutate(), tydVar) : r34.b(getContext(), i).mutate();
            int i3 = s18Var.b;
            if (i3 != 0) {
                qydVar.setTint(i3);
            }
            this.I0 = qydVar;
            gr6Var.k(qydVar);
            float f = 16;
            int iD = kti.d(vw4.d().getDisplayMetrics().density * f) / 2;
            int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density) / 2;
            simpleDraweeView.setPaddingRelative(iD, iD2, iD, iD2);
        } else {
            if (!(u18Var instanceof t18)) {
                throw new NoWhenBranchMatchedException();
            }
            simpleDraweeView.setVisibility(0);
            ((gr6) simpleDraweeView.getHierarchy()).i(null, 5);
            ((gr6) simpleDraweeView.getHierarchy()).k(null);
            t18 t18Var = (t18) u18Var;
            mc0 mc0Var = t18Var.b;
            if (mc0Var != mc0.c && (mc0Var.a != 0 || mc0Var.b.length() != 0)) {
                lc0 lc0Var = new lc0(getContext(), mxa.a, mc0Var, a93.s0.y(this));
                ((gr6) simpleDraweeView.getHierarchy()).i(lc0Var, 5);
                this.I0 = lc0Var;
                requestLayout();
                invalidate();
            }
            c2c c2cVarA = zk6.a.a();
            c2cVarA.i = simpleDraweeView.getController();
            c2cVarA.b = (rf7) t18Var.c.getValue();
            simpleDraweeView.setController(c2cVarA.a());
            int iD3 = kti.d(0 * vw4.d().getDisplayMetrics().density) / 2;
            simpleDraweeView.setPaddingRelative(iD3, 0, iD3, 0);
        }
        requestLayout();
        invalidate();
    }

    public final void setDescription(CharSequence charSequence) {
        setupDescription(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setUpperText(CharSequence charSequence) {
        setupUpperText(charSequence);
        requestLayout();
        invalidate();
    }
}
