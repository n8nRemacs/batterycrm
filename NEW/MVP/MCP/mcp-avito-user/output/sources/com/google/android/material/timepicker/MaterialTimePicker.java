package com.google.android.material.timepicker;

import aZ0.InterfaceC19845a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C22823h0;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import j.F;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.e0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.b {

    /* renamed from: j0, reason: collision with root package name */
    public TimePickerView f357619j0;

    /* renamed from: k0, reason: collision with root package name */
    public ViewStub f357620k0;

    /* renamed from: l0, reason: collision with root package name */
    @P
    public g f357621l0;

    /* renamed from: m0, reason: collision with root package name */
    @P
    public l f357622m0;

    /* renamed from: n0, reason: collision with root package name */
    @P
    public Object f357623n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC42165v
    public int f357624o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC42165v
    public int f357625p0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f357627r0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f357629t0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f357631v0;

    /* renamed from: w0, reason: collision with root package name */
    public MaterialButton f357632w0;

    /* renamed from: x0, reason: collision with root package name */
    public Button f357633x0;

    /* renamed from: z0, reason: collision with root package name */
    public TimeModel f357635z0;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f357615f0 = new LinkedHashSet();

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f357616g0 = new LinkedHashSet();

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f357617h0 = new LinkedHashSet();

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet f357618i0 = new LinkedHashSet();

    /* renamed from: q0, reason: collision with root package name */
    @e0
    public int f357626q0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    @e0
    public int f357628s0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    @e0
    public int f357630u0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f357634y0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public int f357614A0 = 0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            Iterator it = materialTimePicker.f357615f0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            materialTimePicker.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            Iterator it = materialTimePicker.f357616g0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            materialTimePicker.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            materialTimePicker.f357634y0 = materialTimePicker.f357634y0 == 0 ? 1 : 0;
            materialTimePicker.d5(materialTimePicker.f357632w0);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public TimeModel f357639a = new TimeModel();

        @InterfaceC19845a
        @N
        public final void a(@F int i12) {
            TimeModel timeModel = this.f357639a;
            timeModel.getClass();
            timeModel.f357646h = i12 >= 12 ? 1 : 0;
            timeModel.f357643e = i12;
        }

        @InterfaceC19845a
        @N
        public final void b(@F int i12) {
            this.f357639a.e(i12);
        }

        @InterfaceC19845a
        @N
        public final void c() {
            TimeModel timeModel = this.f357639a;
            int i12 = timeModel.f357643e;
            int i13 = timeModel.f357644f;
            TimeModel timeModel2 = new TimeModel(1);
            this.f357639a = timeModel2;
            timeModel2.e(i13);
            TimeModel timeModel3 = this.f357639a;
            timeModel3.getClass();
            timeModel3.f357646h = i12 < 12 ? 0 : 1;
            timeModel3.f357643e = i12;
        }
    }

    @F
    public final int b5() {
        return this.f357635z0.f357643e % 24;
    }

    @F
    public final int c5() {
        return this.f357635z0.f357644f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.material.timepicker.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.timepicker.i, java.lang.Object] */
    public final void d5(MaterialButton materialButton) {
        l lVar;
        Pair pair;
        if (materialButton == null || this.f357619j0 == null || this.f357620k0 == null) {
            return;
        }
        ?? r02 = this.f357623n0;
        if (r02 != 0) {
            r02.hide();
        }
        int i12 = this.f357634y0;
        TimePickerView timePickerView = this.f357619j0;
        ViewStub viewStub = this.f357620k0;
        if (i12 == 0) {
            g gVar = this.f357621l0;
            g gVar2 = gVar;
            if (gVar == null) {
                gVar2 = new g(timePickerView, this.f357635z0);
            }
            this.f357621l0 = gVar2;
            lVar = gVar2;
        } else {
            if (this.f357622m0 == null) {
                this.f357622m0 = new l((LinearLayout) viewStub.inflate(), this.f357635z0);
            }
            l lVar2 = this.f357622m0;
            lVar2.f357686f.setChecked(false);
            lVar2.f357687g.setChecked(false);
            lVar = this.f357622m0;
        }
        this.f357623n0 = lVar;
        lVar.show();
        this.f357623n0.invalidate();
        int i13 = this.f357634y0;
        if (i13 == 0) {
            pair = new Pair(Integer.valueOf(this.f357624o0), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException(AK.c.g(i13, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.f357625p0), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@N DialogInterface dialogInterface) {
        Iterator it = this.f357617h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f357635z0 = timeModel;
        if (timeModel == null) {
            this.f357635z0 = new TimeModel();
        }
        this.f357634y0 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f357635z0.f357642d != 1 ? 0 : 1);
        this.f357626q0 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f357627r0 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f357628s0 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f357629t0 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f357630u0 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f357631v0 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f357614A0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.DialogFragment
    @N
    public final Dialog onCreateDialog(@P Bundle bundle) {
        Context contextRequireContext = requireContext();
        int i12 = this.f357614A0;
        if (i12 == 0) {
            TypedValue typedValueA = com.google.android.material.resources.b.a(R.attr.materialTimePickerTheme, requireContext());
            i12 = typedValueA == null ? 0 : typedValueA.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i12);
        Context context = dialog.getContext();
        int i13 = com.google.android.material.resources.b.c(context, R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName()).data;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialTimePicker, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.f357625p0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f357624o0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        typedArrayObtainStyledAttributes.recycle();
        kVar.j(context);
        kVar.n(ColorStateList.valueOf(i13));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(kVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        kVar.m(C22823h0.l(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f357619j0 = timePickerView;
        timePickerView.f357656j = this;
        this.f357620k0 = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f357632w0 = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i12 = this.f357626q0;
        if (i12 != 0) {
            textView.setText(i12);
        } else if (!TextUtils.isEmpty(this.f357627r0)) {
            textView.setText(this.f357627r0);
        }
        d5(this.f357632w0);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new a());
        int i13 = this.f357628s0;
        if (i13 != 0) {
            button.setText(i13);
        } else if (!TextUtils.isEmpty(this.f357629t0)) {
            button.setText(this.f357629t0);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f357633x0 = button2;
        button2.setOnClickListener(new b());
        int i14 = this.f357630u0;
        if (i14 != 0) {
            this.f357633x0.setText(i14);
        } else if (!TextUtils.isEmpty(this.f357631v0)) {
            this.f357633x0.setText(this.f357631v0);
        }
        Button button3 = this.f357633x0;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.f357632w0.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f357623n0 = null;
        this.f357621l0 = null;
        this.f357622m0 = null;
        TimePickerView timePickerView = this.f357619j0;
        if (timePickerView != null) {
            timePickerView.f357656j = null;
            this.f357619j0 = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@N DialogInterface dialogInterface) {
        Iterator it = this.f357618i0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f357635z0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f357634y0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f357626q0);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f357627r0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f357628s0);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f357629t0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f357630u0);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f357631v0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f357614A0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@N View view, @P Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f357623n0 instanceof l) {
            view.postDelayed(new com.google.android.material.timepicker.c(this, 0), 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void setCancelable(boolean z12) {
        super.setCancelable(z12);
        Button button = this.f357633x0;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }
}
