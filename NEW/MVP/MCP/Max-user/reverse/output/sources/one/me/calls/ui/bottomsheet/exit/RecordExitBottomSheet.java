package one.me.calls.ui.bottomsheet.exit;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bgd;
import defpackage.cgd;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.d53;
import defpackage.dgd;
import defpackage.egd;
import defpackage.fua;
import defpackage.g56;
import defpackage.gw0;
import defpackage.ho7;
import defpackage.ipi;
import defpackage.k18;
import defpackage.kgd;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5j;
import defpackage.o73;
import defpackage.roe;
import defpackage.sn0;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ut3;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.yeb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lbgd;", "openType", "", "enableRecordInCall", "(Lbgd;Ljava/lang/Boolean;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecordExitBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] K0 = {new toc(RecordExitBottomSheet.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), ho7.d(vid.a, RecordExitBottomSheet.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new toc(RecordExitBottomSheet.class, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(RecordExitBottomSheet.class, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(RecordExitBottomSheet.class, "recordInfo", "getRecordInfo()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0), new toc(RecordExitBottomSheet.class, "needRemoveView", "getNeedRemoveView()Lone/me/calls/ui/view/CheckBoxWithPaddingFix;", 0)};
    public final Object C0;
    public final k18 D0;
    public final sn0 E0;
    public final sn0 F0;
    public final sn0 G0;
    public final sn0 H0;
    public final sn0 I0;
    public final sn0 J0;

    public RecordExitBottomSheet(Bundle bundle) {
        super(bundle);
        final int i = 0;
        this.C0 = ipi.b(3, new cm6(this) { // from class: agd
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                jza jzaVar = jza.c;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                        return kk4.j(recordExitBottomSheet.getContext());
                    case 1:
                        yy7[] yy7VarArr2 = RecordExitBottomSheet.K0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(j0b.u1);
                        dpg.c.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        yy7[] yy7VarArr3 = RecordExitBottomSheet.K0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(j0b.t1);
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        yy7[] yy7VarArr4 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(j0b.p1);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jzaVar);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        yy7[] yy7VarArr5 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(j0b.q1);
                        oneMeButton2.setAppearance(gza.c);
                        oneMeButton2.setSize(jzaVar);
                        oneMeButton2.setCustomTheme(a93.s0.B(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        yy7[] yy7VarArr6 = RecordExitBottomSheet.K0;
                        roe roeVar = new roe(recordExitBottomSheet.getContext(), 0);
                        roeVar.setDisableStartIconText(true);
                        int i3 = j0b.r1;
                        roeVar.setId(i3);
                        roeVar.setItemId(i3);
                        int i4 = i0b.b0;
                        v1a v1aVar = a93.s0;
                        roeVar.setStartIcon(new s18(i4, v1aVar.B(roeVar).c.e().a, 4));
                        roeVar.setType(hoe.b);
                        float[] fArr = new float[8];
                        for (int i5 = 0; i5 < 8; i5++) {
                            fArr[i5] = vw4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
                        roeVar.setBackground(shapeDrawable);
                        roeVar.setThemeDepended(noe.b);
                        return roeVar;
                    default:
                        yy7[] yy7VarArr7 = RecordExitBottomSheet.K0;
                        o73 o73Var = new o73(recordExitBottomSheet.getContext(), null);
                        o73Var.setId(j0b.s1);
                        o73Var.setText(m0b.I1);
                        dpg.f.b(o73Var, t75.b);
                        v1a v1aVar2 = a93.s0;
                        o73Var.setTextColor(v1aVar2.B(o73Var).c.getText().e);
                        ?? r2 = recordExitBottomSheet.C0;
                        kk4.e((xcf) r2.getValue(), v1aVar2.B(o73Var).c);
                        o73Var.setButtonDrawable((xcf) r2.getValue());
                        o73Var.setChecked(false);
                        o73Var.setVisibility(8);
                        o73Var.setPaddingBetweenCheckbox(kti.d(8 * vw4.d().getDisplayMetrics().density));
                        return o73Var;
                }
            }
        });
        this.D0 = createViewModelLazy(kgd.class, new vdc(9, new wj1(bundle, 12)));
        final int i2 = 1;
        this.E0 = binding(new cm6(this) { // from class: agd
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                jza jzaVar = jza.c;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                        return kk4.j(recordExitBottomSheet.getContext());
                    case 1:
                        yy7[] yy7VarArr2 = RecordExitBottomSheet.K0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(j0b.u1);
                        dpg.c.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        yy7[] yy7VarArr3 = RecordExitBottomSheet.K0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(j0b.t1);
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        yy7[] yy7VarArr4 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(j0b.p1);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jzaVar);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        yy7[] yy7VarArr5 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(j0b.q1);
                        oneMeButton2.setAppearance(gza.c);
                        oneMeButton2.setSize(jzaVar);
                        oneMeButton2.setCustomTheme(a93.s0.B(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        yy7[] yy7VarArr6 = RecordExitBottomSheet.K0;
                        roe roeVar = new roe(recordExitBottomSheet.getContext(), 0);
                        roeVar.setDisableStartIconText(true);
                        int i3 = j0b.r1;
                        roeVar.setId(i3);
                        roeVar.setItemId(i3);
                        int i4 = i0b.b0;
                        v1a v1aVar = a93.s0;
                        roeVar.setStartIcon(new s18(i4, v1aVar.B(roeVar).c.e().a, 4));
                        roeVar.setType(hoe.b);
                        float[] fArr = new float[8];
                        for (int i5 = 0; i5 < 8; i5++) {
                            fArr[i5] = vw4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
                        roeVar.setBackground(shapeDrawable);
                        roeVar.setThemeDepended(noe.b);
                        return roeVar;
                    default:
                        yy7[] yy7VarArr7 = RecordExitBottomSheet.K0;
                        o73 o73Var = new o73(recordExitBottomSheet.getContext(), null);
                        o73Var.setId(j0b.s1);
                        o73Var.setText(m0b.I1);
                        dpg.f.b(o73Var, t75.b);
                        v1a v1aVar2 = a93.s0;
                        o73Var.setTextColor(v1aVar2.B(o73Var).c.getText().e);
                        ?? r2 = recordExitBottomSheet.C0;
                        kk4.e((xcf) r2.getValue(), v1aVar2.B(o73Var).c);
                        o73Var.setButtonDrawable((xcf) r2.getValue());
                        o73Var.setChecked(false);
                        o73Var.setVisibility(8);
                        o73Var.setPaddingBetweenCheckbox(kti.d(8 * vw4.d().getDisplayMetrics().density));
                        return o73Var;
                }
            }
        });
        final int i3 = 2;
        this.F0 = binding(new cm6(this) { // from class: agd
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                jza jzaVar = jza.c;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                        return kk4.j(recordExitBottomSheet.getContext());
                    case 1:
                        yy7[] yy7VarArr2 = RecordExitBottomSheet.K0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(j0b.u1);
                        dpg.c.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        yy7[] yy7VarArr3 = RecordExitBottomSheet.K0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(j0b.t1);
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        yy7[] yy7VarArr4 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(j0b.p1);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jzaVar);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        yy7[] yy7VarArr5 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(j0b.q1);
                        oneMeButton2.setAppearance(gza.c);
                        oneMeButton2.setSize(jzaVar);
                        oneMeButton2.setCustomTheme(a93.s0.B(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        yy7[] yy7VarArr6 = RecordExitBottomSheet.K0;
                        roe roeVar = new roe(recordExitBottomSheet.getContext(), 0);
                        roeVar.setDisableStartIconText(true);
                        int i32 = j0b.r1;
                        roeVar.setId(i32);
                        roeVar.setItemId(i32);
                        int i4 = i0b.b0;
                        v1a v1aVar = a93.s0;
                        roeVar.setStartIcon(new s18(i4, v1aVar.B(roeVar).c.e().a, 4));
                        roeVar.setType(hoe.b);
                        float[] fArr = new float[8];
                        for (int i5 = 0; i5 < 8; i5++) {
                            fArr[i5] = vw4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
                        roeVar.setBackground(shapeDrawable);
                        roeVar.setThemeDepended(noe.b);
                        return roeVar;
                    default:
                        yy7[] yy7VarArr7 = RecordExitBottomSheet.K0;
                        o73 o73Var = new o73(recordExitBottomSheet.getContext(), null);
                        o73Var.setId(j0b.s1);
                        o73Var.setText(m0b.I1);
                        dpg.f.b(o73Var, t75.b);
                        v1a v1aVar2 = a93.s0;
                        o73Var.setTextColor(v1aVar2.B(o73Var).c.getText().e);
                        ?? r2 = recordExitBottomSheet.C0;
                        kk4.e((xcf) r2.getValue(), v1aVar2.B(o73Var).c);
                        o73Var.setButtonDrawable((xcf) r2.getValue());
                        o73Var.setChecked(false);
                        o73Var.setVisibility(8);
                        o73Var.setPaddingBetweenCheckbox(kti.d(8 * vw4.d().getDisplayMetrics().density));
                        return o73Var;
                }
            }
        });
        final int i4 = 3;
        this.G0 = binding(new cm6(this) { // from class: agd
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i4;
                jza jzaVar = jza.c;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                        return kk4.j(recordExitBottomSheet.getContext());
                    case 1:
                        yy7[] yy7VarArr2 = RecordExitBottomSheet.K0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(j0b.u1);
                        dpg.c.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        yy7[] yy7VarArr3 = RecordExitBottomSheet.K0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(j0b.t1);
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        yy7[] yy7VarArr4 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(j0b.p1);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jzaVar);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        yy7[] yy7VarArr5 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(j0b.q1);
                        oneMeButton2.setAppearance(gza.c);
                        oneMeButton2.setSize(jzaVar);
                        oneMeButton2.setCustomTheme(a93.s0.B(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        yy7[] yy7VarArr6 = RecordExitBottomSheet.K0;
                        roe roeVar = new roe(recordExitBottomSheet.getContext(), 0);
                        roeVar.setDisableStartIconText(true);
                        int i32 = j0b.r1;
                        roeVar.setId(i32);
                        roeVar.setItemId(i32);
                        int i42 = i0b.b0;
                        v1a v1aVar = a93.s0;
                        roeVar.setStartIcon(new s18(i42, v1aVar.B(roeVar).c.e().a, 4));
                        roeVar.setType(hoe.b);
                        float[] fArr = new float[8];
                        for (int i5 = 0; i5 < 8; i5++) {
                            fArr[i5] = vw4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
                        roeVar.setBackground(shapeDrawable);
                        roeVar.setThemeDepended(noe.b);
                        return roeVar;
                    default:
                        yy7[] yy7VarArr7 = RecordExitBottomSheet.K0;
                        o73 o73Var = new o73(recordExitBottomSheet.getContext(), null);
                        o73Var.setId(j0b.s1);
                        o73Var.setText(m0b.I1);
                        dpg.f.b(o73Var, t75.b);
                        v1a v1aVar2 = a93.s0;
                        o73Var.setTextColor(v1aVar2.B(o73Var).c.getText().e);
                        ?? r2 = recordExitBottomSheet.C0;
                        kk4.e((xcf) r2.getValue(), v1aVar2.B(o73Var).c);
                        o73Var.setButtonDrawable((xcf) r2.getValue());
                        o73Var.setChecked(false);
                        o73Var.setVisibility(8);
                        o73Var.setPaddingBetweenCheckbox(kti.d(8 * vw4.d().getDisplayMetrics().density));
                        return o73Var;
                }
            }
        });
        final int i5 = 4;
        this.H0 = binding(new cm6(this) { // from class: agd
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i5;
                jza jzaVar = jza.c;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                        return kk4.j(recordExitBottomSheet.getContext());
                    case 1:
                        yy7[] yy7VarArr2 = RecordExitBottomSheet.K0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(j0b.u1);
                        dpg.c.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        yy7[] yy7VarArr3 = RecordExitBottomSheet.K0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(j0b.t1);
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        yy7[] yy7VarArr4 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(j0b.p1);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jzaVar);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        yy7[] yy7VarArr5 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(j0b.q1);
                        oneMeButton2.setAppearance(gza.c);
                        oneMeButton2.setSize(jzaVar);
                        oneMeButton2.setCustomTheme(a93.s0.B(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        yy7[] yy7VarArr6 = RecordExitBottomSheet.K0;
                        roe roeVar = new roe(recordExitBottomSheet.getContext(), 0);
                        roeVar.setDisableStartIconText(true);
                        int i32 = j0b.r1;
                        roeVar.setId(i32);
                        roeVar.setItemId(i32);
                        int i42 = i0b.b0;
                        v1a v1aVar = a93.s0;
                        roeVar.setStartIcon(new s18(i42, v1aVar.B(roeVar).c.e().a, 4));
                        roeVar.setType(hoe.b);
                        float[] fArr = new float[8];
                        for (int i52 = 0; i52 < 8; i52++) {
                            fArr[i52] = vw4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
                        roeVar.setBackground(shapeDrawable);
                        roeVar.setThemeDepended(noe.b);
                        return roeVar;
                    default:
                        yy7[] yy7VarArr7 = RecordExitBottomSheet.K0;
                        o73 o73Var = new o73(recordExitBottomSheet.getContext(), null);
                        o73Var.setId(j0b.s1);
                        o73Var.setText(m0b.I1);
                        dpg.f.b(o73Var, t75.b);
                        v1a v1aVar2 = a93.s0;
                        o73Var.setTextColor(v1aVar2.B(o73Var).c.getText().e);
                        ?? r2 = recordExitBottomSheet.C0;
                        kk4.e((xcf) r2.getValue(), v1aVar2.B(o73Var).c);
                        o73Var.setButtonDrawable((xcf) r2.getValue());
                        o73Var.setChecked(false);
                        o73Var.setVisibility(8);
                        o73Var.setPaddingBetweenCheckbox(kti.d(8 * vw4.d().getDisplayMetrics().density));
                        return o73Var;
                }
            }
        });
        final int i6 = 5;
        this.I0 = binding(new cm6(this) { // from class: agd
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i6;
                jza jzaVar = jza.c;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                        return kk4.j(recordExitBottomSheet.getContext());
                    case 1:
                        yy7[] yy7VarArr2 = RecordExitBottomSheet.K0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(j0b.u1);
                        dpg.c.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        yy7[] yy7VarArr3 = RecordExitBottomSheet.K0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(j0b.t1);
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        yy7[] yy7VarArr4 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(j0b.p1);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jzaVar);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        yy7[] yy7VarArr5 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(j0b.q1);
                        oneMeButton2.setAppearance(gza.c);
                        oneMeButton2.setSize(jzaVar);
                        oneMeButton2.setCustomTheme(a93.s0.B(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        yy7[] yy7VarArr6 = RecordExitBottomSheet.K0;
                        roe roeVar = new roe(recordExitBottomSheet.getContext(), 0);
                        roeVar.setDisableStartIconText(true);
                        int i32 = j0b.r1;
                        roeVar.setId(i32);
                        roeVar.setItemId(i32);
                        int i42 = i0b.b0;
                        v1a v1aVar = a93.s0;
                        roeVar.setStartIcon(new s18(i42, v1aVar.B(roeVar).c.e().a, 4));
                        roeVar.setType(hoe.b);
                        float[] fArr = new float[8];
                        for (int i52 = 0; i52 < 8; i52++) {
                            fArr[i52] = vw4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
                        roeVar.setBackground(shapeDrawable);
                        roeVar.setThemeDepended(noe.b);
                        return roeVar;
                    default:
                        yy7[] yy7VarArr7 = RecordExitBottomSheet.K0;
                        o73 o73Var = new o73(recordExitBottomSheet.getContext(), null);
                        o73Var.setId(j0b.s1);
                        o73Var.setText(m0b.I1);
                        dpg.f.b(o73Var, t75.b);
                        v1a v1aVar2 = a93.s0;
                        o73Var.setTextColor(v1aVar2.B(o73Var).c.getText().e);
                        ?? r2 = recordExitBottomSheet.C0;
                        kk4.e((xcf) r2.getValue(), v1aVar2.B(o73Var).c);
                        o73Var.setButtonDrawable((xcf) r2.getValue());
                        o73Var.setChecked(false);
                        o73Var.setVisibility(8);
                        o73Var.setPaddingBetweenCheckbox(kti.d(8 * vw4.d().getDisplayMetrics().density));
                        return o73Var;
                }
            }
        });
        final int i7 = 6;
        this.J0 = binding(new cm6(this) { // from class: agd
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i7;
                jza jzaVar = jza.c;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                        return kk4.j(recordExitBottomSheet.getContext());
                    case 1:
                        yy7[] yy7VarArr2 = RecordExitBottomSheet.K0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(j0b.u1);
                        dpg.c.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        yy7[] yy7VarArr3 = RecordExitBottomSheet.K0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(j0b.t1);
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        yy7[] yy7VarArr4 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(j0b.p1);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jzaVar);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        yy7[] yy7VarArr5 = RecordExitBottomSheet.K0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(j0b.q1);
                        oneMeButton2.setAppearance(gza.c);
                        oneMeButton2.setSize(jzaVar);
                        oneMeButton2.setCustomTheme(a93.s0.B(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        yy7[] yy7VarArr6 = RecordExitBottomSheet.K0;
                        roe roeVar = new roe(recordExitBottomSheet.getContext(), 0);
                        roeVar.setDisableStartIconText(true);
                        int i32 = j0b.r1;
                        roeVar.setId(i32);
                        roeVar.setItemId(i32);
                        int i42 = i0b.b0;
                        v1a v1aVar = a93.s0;
                        roeVar.setStartIcon(new s18(i42, v1aVar.B(roeVar).c.e().a, 4));
                        roeVar.setType(hoe.b);
                        float[] fArr = new float[8];
                        for (int i52 = 0; i52 < 8; i52++) {
                            fArr[i52] = vw4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
                        roeVar.setBackground(shapeDrawable);
                        roeVar.setThemeDepended(noe.b);
                        return roeVar;
                    default:
                        yy7[] yy7VarArr7 = RecordExitBottomSheet.K0;
                        o73 o73Var = new o73(recordExitBottomSheet.getContext(), null);
                        o73Var.setId(j0b.s1);
                        o73Var.setText(m0b.I1);
                        dpg.f.b(o73Var, t75.b);
                        v1a v1aVar2 = a93.s0;
                        o73Var.setTextColor(v1aVar2.B(o73Var).c.getText().e);
                        ?? r2 = recordExitBottomSheet.C0;
                        kk4.e((xcf) r2.getValue(), v1aVar2.B(o73Var).c);
                        o73Var.setButtonDrawable((xcf) r2.getValue());
                        o73Var.setChecked(false);
                        o73Var.setVisibility(8);
                        o73Var.setPaddingBetweenCheckbox(kti.d(8 * vw4.d().getDisplayMetrics().density));
                        return o73Var;
                }
            }
        });
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        return a93.s0.z(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.addView(T0(), -1, -2);
        constraintLayout.addView(S0(), -1, -2);
        constraintLayout.addView(R0(), -1, -2);
        constraintLayout.addView(P0(), 0, -2);
        constraintLayout.addView(Q0(), 0, -2);
        constraintLayout.addView(O0(), 0, -2);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = T0().getId();
        ut3VarG.d(id, 3, 0, 3);
        az1.q(16, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id, 5));
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 4, S0().getId(), 3);
        ut3VarG.g(id).d.W = 2;
        int id2 = S0().getId();
        ut3VarG.d(id2, 3, T0().getId(), 4);
        float f = 4;
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id2, 5));
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 4, R0().getId(), 3);
        int id3 = R0().getId();
        ut3VarG.d(id3, 3, S0().getId(), 4);
        az1.q(22, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 4, O0().getId(), 3);
        int id4 = O0().getId();
        ut3VarG.d(id4, 3, R0().getId(), 4);
        float f2 = 12;
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
        ut3VarG.d(id4, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id4, 5));
        ut3VarG.d(id4, 6, 0, 6);
        new fua(ut3VarG, 6, id4, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id4, 4, P0().getId(), 3);
        int id5 = P0().getId();
        ut3VarG.d(id5, 3, O0().getId(), 4);
        new fua(ut3VarG, 3, id5, 5).e(kti.d(24 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id5, 7, Q0().getId(), 6);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id5, 5));
        ut3VarG.d(id5, 6, 0, 6);
        ut3VarG.d(id5, 4, 0, 3);
        int id6 = Q0().getId();
        ut3VarG.d(id6, 3, P0().getId(), 3);
        ut3VarG.d(id6, 7, 0, 7);
        ut3VarG.d(id6, 6, P0().getId(), 7);
        new fua(ut3VarG, 6, id6, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id6, 4, P0().getId(), 4);
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    public final o73 O0() {
        yy7 yy7Var = K0[5];
        return (o73) this.J0.getValue();
    }

    public final OneMeButton P0() {
        yy7 yy7Var = K0[2];
        return (OneMeButton) this.G0.getValue();
    }

    public final OneMeButton Q0() {
        yy7 yy7Var = K0[3];
        return (OneMeButton) this.H0.getValue();
    }

    public final roe R0() {
        yy7 yy7Var = K0[4];
        return (roe) this.I0.getValue();
    }

    public final TextView S0() {
        yy7 yy7Var = K0[1];
        return (TextView) this.F0.getValue();
    }

    public final TextView T0() {
        yy7 yy7Var = K0[0];
        return (TextView) this.E0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k18 k18Var = this.D0;
        ci5 ci5Var = ((kgd) k18Var.getValue()).t0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new cgd(null, this), 1), getViewLifecycleScope());
        if (((kgd) k18Var.getValue()).b == bgd.b) {
            gw0.w(new g56(aw0.a(((kgd) k18Var.getValue()).s0, getViewLifecycleOwner().p(), l38Var), new dgd(null, this), 1), getViewLifecycleScope());
        }
        gw0.w(new g56(aw0.a(new d53(((kgd) k18Var.getValue()).Z, 12), getViewLifecycleOwner().p(), l38Var), new egd(null, this), 1), getViewLifecycleScope());
    }

    public /* synthetic */ RecordExitBottomSheet(bgd bgdVar, Boolean bool, int i, tk4 tk4Var) {
        this(bgdVar, (i & 2) != 0 ? null : bool);
    }

    public RecordExitBottomSheet(bgd bgdVar, Boolean bool) {
        Bundle bundle = new Bundle();
        bundle.putString("open_type", bgdVar.name());
        if (bool != null) {
            bundle.putBoolean("admin_record_settings", bool.booleanValue());
        }
        this(bundle);
    }
}
