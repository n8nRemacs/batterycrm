package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.H;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.F0;
import androidx.core.view.L0;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import j.N;
import j.P;
import j.e0;
import j.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C43852a;
import pY0.ViewOnTouchListenerC47033a;

/* loaded from: classes6.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: A0, reason: collision with root package name */
    @P
    public com.google.android.material.shape.k f356453A0;

    /* renamed from: B0, reason: collision with root package name */
    public Button f356454B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f356455C0;

    /* renamed from: D0, reason: collision with root package name */
    @P
    public CharSequence f356456D0;

    /* renamed from: E0, reason: collision with root package name */
    @P
    public CharSequence f356457E0;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet<s<? super S>> f356458f0 = new LinkedHashSet<>();

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f356459g0 = new LinkedHashSet<>();

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f356460h0 = new LinkedHashSet<>();

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f356461i0 = new LinkedHashSet<>();

    /* renamed from: j0, reason: collision with root package name */
    @f0
    public int f356462j0;

    /* renamed from: k0, reason: collision with root package name */
    @P
    public DateSelector<S> f356463k0;

    /* renamed from: l0, reason: collision with root package name */
    public PickerFragment<S> f356464l0;

    /* renamed from: m0, reason: collision with root package name */
    @P
    public CalendarConstraints f356465m0;

    /* renamed from: n0, reason: collision with root package name */
    @P
    public DayViewDecorator f356466n0;

    /* renamed from: o0, reason: collision with root package name */
    public MaterialCalendar<S> f356467o0;

    /* renamed from: p0, reason: collision with root package name */
    @e0
    public int f356468p0;

    /* renamed from: q0, reason: collision with root package name */
    public CharSequence f356469q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f356470r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f356471s0;

    /* renamed from: t0, reason: collision with root package name */
    @e0
    public int f356472t0;

    /* renamed from: u0, reason: collision with root package name */
    public CharSequence f356473u0;

    /* renamed from: v0, reason: collision with root package name */
    @e0
    public int f356474v0;

    /* renamed from: w0, reason: collision with root package name */
    public CharSequence f356475w0;

    /* renamed from: x0, reason: collision with root package name */
    public TextView f356476x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f356477y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f356478z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<s<? super S>> it = materialDatePicker.f356458f0.iterator();
            while (it.hasNext()) {
                it.next().a(materialDatePicker.b5().E4());
            }
            materialDatePicker.dismiss();
        }
    }

    public class b extends C22808a {
        public b() {
        }

        @Override // androidx.core.view.C22808a
        public final void d(@N View view, @N androidx.core.view.accessibility.f fVar) {
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
            fVar.o(MaterialDatePicker.this.b5().getError() + ", " + ((Object) fVar.g()));
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<View.OnClickListener> it = materialDatePicker.f356459g0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            materialDatePicker.dismiss();
        }
    }

    public class d extends x<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.x
        public final void a() {
            MaterialDatePicker.this.f356454B0.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.x
        public final void b(S s5) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            String strK2 = materialDatePicker.b5().K2(materialDatePicker.getContext());
            materialDatePicker.f356477y0.setContentDescription(materialDatePicker.b5().j2(materialDatePicker.requireContext()));
            materialDatePicker.f356477y0.setText(strK2);
            materialDatePicker.f356454B0.setEnabled(materialDatePicker.b5().C4());
        }
    }

    public static final class e<S> {

        /* renamed from: a, reason: collision with root package name */
        public final SingleDateSelector f356483a;

        /* renamed from: b, reason: collision with root package name */
        public CalendarConstraints f356484b;

        /* renamed from: c, reason: collision with root package name */
        public int f356485c = 0;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Long f356486d = null;

        public e(SingleDateSelector singleDateSelector) {
            this.f356483a = singleDateSelector;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        @j.N
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.android.material.datepicker.MaterialDatePicker<S> a() {
            /*
                r6 = this;
                com.google.android.material.datepicker.CalendarConstraints r0 = r6.f356484b
                if (r0 != 0) goto Lf
                com.google.android.material.datepicker.CalendarConstraints$b r0 = new com.google.android.material.datepicker.CalendarConstraints$b
                r0.<init>()
                com.google.android.material.datepicker.CalendarConstraints r0 = r0.a()
                r6.f356484b = r0
            Lf:
                int r0 = r6.f356485c
                com.google.android.material.datepicker.SingleDateSelector r1 = r6.f356483a
                if (r0 != 0) goto L19
                int r0 = com.google.android.material.R.string.mtrl_picker_date_header_title
                r6.f356485c = r0
            L19:
                java.lang.Long r0 = r6.f356486d
                if (r0 == 0) goto L2b
                long r2 = r0.longValue()
                long r2 = com.google.android.material.datepicker.E.a(r2)
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r1.f356506c = r0
            L2b:
                com.google.android.material.datepicker.CalendarConstraints r0 = r6.f356484b
                com.google.android.material.datepicker.Month r2 = r0.f356410e
                if (r2 != 0) goto L86
                java.util.ArrayList r2 = r1.y1()
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L64
                java.util.ArrayList r2 = r1.y1()
                java.util.Iterator r2 = r2.iterator()
                java.lang.Object r2 = r2.next()
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                com.google.android.material.datepicker.Month r2 = com.google.android.material.datepicker.Month.c(r2)
                com.google.android.material.datepicker.CalendarConstraints r3 = r6.f356484b
                com.google.android.material.datepicker.Month r4 = r3.f356407b
                int r4 = r2.compareTo(r4)
                if (r4 < 0) goto L64
                com.google.android.material.datepicker.Month r3 = r3.f356408c
                int r3 = r2.compareTo(r3)
                if (r3 > 0) goto L64
                goto L84
            L64:
                com.google.android.material.datepicker.Month r2 = new com.google.android.material.datepicker.Month
                java.util.Calendar r3 = com.google.android.material.datepicker.E.f()
                r2.<init>(r3)
                com.google.android.material.datepicker.CalendarConstraints r3 = r6.f356484b
                com.google.android.material.datepicker.Month r4 = r3.f356407b
                int r4 = r2.compareTo(r4)
                if (r4 < 0) goto L80
                com.google.android.material.datepicker.Month r3 = r3.f356408c
                int r3 = r2.compareTo(r3)
                if (r3 > 0) goto L80
                goto L84
            L80:
                com.google.android.material.datepicker.CalendarConstraints r2 = r6.f356484b
                com.google.android.material.datepicker.Month r2 = r2.f356407b
            L84:
                r0.f356410e = r2
            L86:
                com.google.android.material.datepicker.MaterialDatePicker r0 = new com.google.android.material.datepicker.MaterialDatePicker
                r0.<init>()
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r3 = "OVERRIDE_THEME_RES_ID"
                r4 = 0
                r2.putInt(r3, r4)
                java.lang.String r3 = "DATE_SELECTOR_KEY"
                r2.putParcelable(r3, r1)
                java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
                com.google.android.material.datepicker.CalendarConstraints r3 = r6.f356484b
                r2.putParcelable(r1, r3)
                java.lang.String r1 = "DAY_VIEW_DECORATOR_KEY"
                r3 = 0
                r2.putParcelable(r1, r3)
                java.lang.String r1 = "TITLE_TEXT_RES_ID_KEY"
                int r5 = r6.f356485c
                r2.putInt(r1, r5)
                java.lang.String r1 = "TITLE_TEXT_KEY"
                r2.putCharSequence(r1, r3)
                java.lang.String r1 = "INPUT_MODE_KEY"
                r2.putInt(r1, r4)
                java.lang.String r1 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
                r2.putInt(r1, r4)
                java.lang.String r1 = "POSITIVE_BUTTON_TEXT_KEY"
                r2.putCharSequence(r1, r3)
                java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
                r2.putInt(r1, r4)
                java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_KEY"
                r2.putCharSequence(r1, r3)
                r0.setArguments(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MaterialDatePicker.e.a():com.google.android.material.datepicker.MaterialDatePicker");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface f {
    }

    public static int c5(@N Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(E.f());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i12 = month.f356494e;
        return H.b(i12, 1, dimensionPixelOffset2, (dimensionPixelSize * i12) + (dimensionPixelOffset * 2));
    }

    public static boolean d5(int i12, @N Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i12});
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z12;
    }

    public final DateSelector<S> b5() {
        if (this.f356463k0 == null) {
            this.f356463k0 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f356463k0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.Fragment, com.google.android.material.datepicker.MaterialTextInputPicker] */
    public final void e5() {
        Context contextRequireContext = requireContext();
        int iK02 = this.f356462j0;
        if (iK02 == 0) {
            iK02 = b5().K0(contextRequireContext);
        }
        DateSelector<S> dateSelectorB5 = b5();
        CalendarConstraints calendarConstraints = this.f356465m0;
        DayViewDecorator dayViewDecorator = this.f356466n0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iK02);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorB5);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f356410e);
        materialCalendar.setArguments(bundle);
        this.f356467o0 = materialCalendar;
        boolean z12 = this.f356478z0.f356716b;
        if (z12) {
            DateSelector<S> dateSelectorB52 = b5();
            CalendarConstraints calendarConstraints2 = this.f356465m0;
            ?? materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iK02);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorB52);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.setArguments(bundle2);
            materialCalendar = materialTextInputPicker;
        }
        this.f356464l0 = materialCalendar;
        this.f356476x0.setText((z12 && getResources().getConfiguration().orientation == 2) ? this.f356457E0 : this.f356456D0);
        String strK2 = b5().K2(getContext());
        this.f356477y0.setContentDescription(b5().j2(requireContext()));
        this.f356477y0.setText(strK2);
        androidx.fragment.app.H hE2 = getChildFragmentManager().e();
        hE2.n(R.id.mtrl_calendar_frame, this.f356464l0, null);
        hE2.g();
        this.f356464l0.b5(new d());
    }

    public final void f5(@N CheckableImageButton checkableImageButton) {
        this.f356478z0.setContentDescription(this.f356478z0.f356716b ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@N DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f356460h0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f356462j0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f356463k0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f356465m0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f356466n0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f356468p0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f356469q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f356471s0 = bundle.getInt("INPUT_MODE_KEY");
        this.f356472t0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f356473u0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f356474v0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f356475w0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f356469q0;
        if (text == null) {
            text = requireContext().getResources().getText(this.f356468p0);
        }
        this.f356456D0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f356457E0 = text;
    }

    @Override // androidx.fragment.app.DialogFragment
    @N
    public final Dialog onCreateDialog(@P Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iK02 = this.f356462j0;
        if (iK02 == 0) {
            iK02 = b5().K0(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iK02);
        Context context = dialog.getContext();
        this.f356470r0 = d5(android.R.attr.windowFullscreen, context);
        int i12 = com.google.android.material.resources.b.c(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName()).data;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f356453A0 = kVar;
        kVar.j(context);
        this.f356453A0.n(ColorStateList.valueOf(i12));
        this.f356453A0.m(C22823h0.l(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f356470r0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f356470r0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(c5(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(c5(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f356477y0 = textView;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        textView.setAccessibilityLiveRegion(1);
        this.f356478z0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f356476x0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f356478z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f356478z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C43852a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C43852a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f356478z0.setChecked(this.f356471s0 != 0);
        C22823h0.C(this.f356478z0, null);
        f5(this.f356478z0);
        this.f356478z0.setOnClickListener(new r(this));
        this.f356454B0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (b5().C4()) {
            this.f356454B0.setEnabled(true);
        } else {
            this.f356454B0.setEnabled(false);
        }
        this.f356454B0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f356473u0;
        if (charSequence != null) {
            this.f356454B0.setText(charSequence);
        } else {
            int i12 = this.f356472t0;
            if (i12 != 0) {
                this.f356454B0.setText(i12);
            }
        }
        this.f356454B0.setOnClickListener(new a());
        C22823h0.C(this.f356454B0, new b());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.f356475w0;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i13 = this.f356474v0;
            if (i13 != 0) {
                button.setText(i13);
            }
        }
        button.setOnClickListener(new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@N DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f356461i0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f356462j0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f356463k0);
        CalendarConstraints calendarConstraints = this.f356465m0;
        CalendarConstraints.b bVar = new CalendarConstraints.b();
        bVar.f356416a = CalendarConstraints.b.f356414f;
        bVar.f356417b = CalendarConstraints.b.f356415g;
        bVar.f356420e = new DateValidatorPointForward(Long.MIN_VALUE);
        bVar.f356416a = calendarConstraints.f356407b.f356496g;
        bVar.f356417b = calendarConstraints.f356408c.f356496g;
        bVar.f356418c = Long.valueOf(calendarConstraints.f356410e.f356496g);
        bVar.f356419d = calendarConstraints.f356411f;
        bVar.f356420e = calendarConstraints.f356409d;
        MaterialCalendar<S> materialCalendar = this.f356467o0;
        Month month = materialCalendar == null ? null : materialCalendar.f356436k0;
        if (month != null) {
            bVar.f356418c = Long.valueOf(month.f356496g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f356466n0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f356468p0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f356469q0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f356472t0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f356473u0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f356474v0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f356475w0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f356470r0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f356453A0);
            if (!this.f356455C0) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                boolean z12 = numValueOf == null || numValueOf.intValue() == 0;
                int iB2 = com.google.android.material.color.k.b(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z12) {
                    numValueOf = Integer.valueOf(iB2);
                }
                F0.a(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                new L0(window, window.getDecorView()).e(com.google.android.material.color.k.e(0) || com.google.android.material.color.k.e(numValueOf.intValue()));
                new L0(window, window.getDecorView()).d(com.google.android.material.color.k.e(0) || com.google.android.material.color.k.e(iB2));
                C22823h0.K(viewFindViewById, new q(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop()));
                this.f356455C0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f356453A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC47033a(requireDialog(), rect));
        }
        e5();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f356464l0.f356498f0.clear();
        super.onStop();
    }
}
