package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.ao7;
import defpackage.dsi;
import defpackage.dvc;
import defpackage.dwc;
import defpackage.eri;
import defpackage.eti;
import defpackage.fua;
import defpackage.g2a;
import defpackage.h4i;
import defpackage.hfh;
import defpackage.i4i;
import defpackage.k1d;
import defpackage.lxc;
import defpackage.lz0;
import defpackage.m5d;
import defpackage.mz0;
import defpackage.r9j;
import defpackage.rf3;
import defpackage.s2d;
import defpackage.uf4;
import defpackage.uxc;
import defpackage.veh;
import defpackage.vgd;
import defpackage.vxg;
import defpackage.wq8;
import defpackage.wsi;
import defpackage.ye6;
import defpackage.z5d;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public int A1;
    public PickerFragment B1;
    public mz0 C1;
    public MaterialCalendar D1;
    public int E1;
    public CharSequence F1;
    public boolean G1;
    public int H1;
    public int I1;
    public CharSequence J1;
    public int K1;
    public CharSequence L1;
    public int M1;
    public CharSequence N1;
    public int O1;
    public CharSequence P1;
    public TextView Q1;
    public CheckableImageButton R1;
    public wq8 S1;
    public boolean T1;
    public CharSequence U1;
    public CharSequence V1;
    public final LinkedHashSet y1;
    public final LinkedHashSet z1;

    public MaterialDatePicker() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.y1 = new LinkedHashSet();
        this.z1 = new LinkedHashSet();
    }

    public static boolean A0(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(wsi.g(context, MaterialCalendar.class.getCanonicalName(), dvc.materialCalendarStyle).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static int z0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(dwc.mtrl_calendar_content_padding);
        Calendar calendarB = vxg.b();
        calendarB.set(5, 1);
        Calendar calendarA = vxg.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(dwc.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(dwc.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void M(Bundle bundle) throws Resources.NotFoundException {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.X;
        }
        this.A1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.C1 = (mz0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.E1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.F1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.H1 = bundle.getInt("INPUT_MODE_KEY");
        this.I1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.J1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.K1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.L1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.M1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.N1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.O1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.P1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.F1;
        if (text == null) {
            text = k0().getResources().getText(this.E1);
        }
        this.U1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.V1 = text;
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.G1 ? k1d.mtrl_picker_fullscreen : k1d.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.G1) {
            viewInflate.findViewById(uxc.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(z0(context), -2));
        } else {
            viewInflate.findViewById(uxc.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(z0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(uxc.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = hfh.a;
        textView.setAccessibilityLiveRegion(1);
        this.R1 = (CheckableImageButton) viewInflate.findViewById(uxc.mtrl_picker_header_toggle);
        this.Q1 = (TextView) viewInflate.findViewById(uxc.mtrl_picker_title_text);
        this.R1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.R1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, eri.a(context, lxc.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], eri.a(context, lxc.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.R1.setChecked(this.H1 != 0);
        hfh.n(this.R1, null);
        CheckableImageButton checkableImageButton2 = this.R1;
        this.R1.setContentDescription(this.H1 == 1 ? checkableImageButton2.getContext().getString(s2d.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(s2d.mtrl_picker_toggle_to_text_input_mode));
        this.R1.setOnClickListener(new ye6(12, this));
        y0();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.A1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        mz0 mz0Var = this.C1;
        lz0 lz0Var = new lz0();
        int i = lz0.b;
        int i2 = lz0.b;
        long j = mz0Var.a.X;
        long j2 = mz0Var.b.X;
        lz0Var.a = Long.valueOf(mz0Var.d.X);
        int i3 = mz0Var.o;
        uf4 uf4Var = mz0Var.c;
        MaterialCalendar materialCalendar = this.D1;
        g2a g2aVar = materialCalendar == null ? null : materialCalendar.l1;
        if (g2aVar != null) {
            lz0Var.a = Long.valueOf(g2aVar.X);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", uf4Var);
        g2a g2aVarC = g2a.c(j);
        g2a g2aVarC2 = g2a.c(j2);
        uf4 uf4Var2 = (uf4) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = lz0Var.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new mz0(g2aVarC, g2aVarC2, uf4Var2, l == null ? null : g2a.c(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.E1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.F1);
        bundle.putInt("INPUT_MODE_KEY", this.H1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.I1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.J1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.K1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.L1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.M1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.N1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.O1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.P1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void c0() throws Resources.NotFoundException {
        h4i h4iVar;
        h4i h4iVar2;
        super.c0();
        Dialog dialog = this.t1;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.G1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.S1);
            if (!this.T1) {
                View viewFindViewById = l0().findViewById(uxc.fullscreen_header);
                ColorStateList colorStateListB = r9j.b(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListB != null ? Integer.valueOf(colorStateListB.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iD = eti.d(R.attr.colorBackground, -16777216, window.getContext());
                if (z2) {
                    numValueOf = Integer.valueOf(iD);
                }
                dsi.d(window, false);
                window.getContext();
                int i2 = i < 27 ? rf3.i(eti.d(R.attr.navigationBarColor, -16777216, window.getContext()), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i2);
                boolean z3 = eti.g(0) || eti.g(numValueOf.intValue());
                vgd vgdVar = new vgd(window.getDecorView());
                if (i >= 30) {
                    i4i i4iVar = new i4i(window.getInsetsController(), vgdVar);
                    i4iVar.c = window;
                    h4iVar = i4iVar;
                } else {
                    h4iVar = new h4i(window, vgdVar);
                }
                h4iVar.m(z3);
                boolean zG = eti.g(iD);
                if (eti.g(i2) || (i2 == 0 && zG)) {
                    z = true;
                }
                vgd vgdVar2 = new vgd(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    i4i i4iVar2 = new i4i(window.getInsetsController(), vgdVar2);
                    i4iVar2.c = window;
                    h4iVar2 = i4iVar2;
                } else {
                    h4iVar2 = new h4i(window, vgdVar2);
                }
                h4iVar2.l(z);
                fua fuaVar = new fua(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop(), 8);
                WeakHashMap weakHashMap = hfh.a;
                veh.u(viewFindViewById, fuaVar);
                this.T1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = k0().getResources().getDimensionPixelOffset(dwc.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.S1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.t1;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ao7(dialog2, rect));
        }
        k0();
        int i3 = this.A1;
        if (i3 == 0) {
            y0();
            throw null;
        }
        y0();
        mz0 mz0Var = this.C1;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", mz0Var);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", mz0Var.d);
        materialCalendar.n0(bundle);
        this.D1 = materialCalendar;
        PickerFragment pickerFragment = materialCalendar;
        if (this.H1 == 1) {
            y0();
            mz0 mz0Var2 = this.C1;
            PickerFragment materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", mz0Var2);
            materialTextInputPicker.n0(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        this.B1 = pickerFragment;
        this.Q1.setText((this.H1 == 1 && k0().getResources().getConfiguration().orientation == 2) ? this.V1 : this.U1);
        y0();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void d0() {
        this.B1.i1.clear();
        super.d0();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.y1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.z1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.S0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        Context contextK0 = k0();
        k0();
        int i = this.A1;
        if (i == 0) {
            y0();
            throw null;
        }
        Dialog dialog = new Dialog(contextK0, i);
        Context context = dialog.getContext();
        this.G1 = A0(context, R.attr.windowFullscreen);
        this.S1 = new wq8(context, null, dvc.materialCalendarStyle, m5d.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, z5d.MaterialCalendar, dvc.materialCalendarStyle, m5d.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(z5d.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.S1.i(context);
        this.S1.k(ColorStateList.valueOf(color));
        wq8 wq8Var = this.S1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = hfh.a;
        wq8Var.j(veh.i(decorView));
        return dialog;
    }

    public final void y0() {
        if (this.X.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }
}
