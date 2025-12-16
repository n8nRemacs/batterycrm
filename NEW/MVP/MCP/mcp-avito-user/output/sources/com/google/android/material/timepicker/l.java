package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.F;
import com.google.android.material.internal.O;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: TimePickerTextInputPresenter.java */
/* loaded from: classes6.dex */
class l implements TimePickerView.d, i {

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f357682b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeModel f357683c;

    /* renamed from: d, reason: collision with root package name */
    public final TextWatcher f357684d;

    /* renamed from: e, reason: collision with root package name */
    public final TextWatcher f357685e;

    /* renamed from: f, reason: collision with root package name */
    public final ChipTextInputComboView f357686f;

    /* renamed from: g, reason: collision with root package name */
    public final ChipTextInputComboView f357687g;

    /* renamed from: h, reason: collision with root package name */
    public final EditText f357688h;

    /* renamed from: i, reason: collision with root package name */
    public final EditText f357689i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialButtonToggleGroup f357690j;

    /* compiled from: TimePickerTextInputPresenter.java */
    public class a extends F {
        public a() {
        }

        @Override // com.google.android.material.internal.F, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) throws NumberFormatException {
            try {
                boolean zIsEmpty = TextUtils.isEmpty(editable);
                l lVar = l.this;
                if (zIsEmpty) {
                    lVar.f357683c.e(0);
                } else {
                    lVar.f357683c.e(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class b extends F {
        public b() {
        }

        @Override // com.google.android.material.internal.F, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) throws NumberFormatException {
            try {
                boolean zIsEmpty = TextUtils.isEmpty(editable);
                l lVar = l.this;
                if (zIsEmpty) {
                    lVar.f357683c.d(0);
                } else {
                    lVar.f357683c.d(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.this.a(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class d extends com.google.android.material.timepicker.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TimeModel f357694e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i12, TimeModel timeModel) {
            super(context, i12);
            this.f357694e = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            super.d(view, fVar);
            Resources resources = view.getResources();
            TimeModel timeModel = this.f357694e;
            fVar.o(resources.getString(timeModel.f357642d == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel.c())));
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class e extends com.google.android.material.timepicker.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TimeModel f357695e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i12, TimeModel timeModel) {
            super(context, i12);
            this.f357695e = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            super.d(view, fVar);
            fVar.o(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f357695e.f357644f)));
        }
    }

    public l(LinearLayout linearLayout, TimeModel timeModel) {
        a aVar = new a();
        this.f357684d = aVar;
        b bVar = new b();
        this.f357685e = bVar;
        this.f357682b = linearLayout;
        this.f357683c = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f357686f = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f357687g = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.f357642d == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.f357690j = materialButtonToggleGroup;
            materialButtonToggleGroup.f356072d.add(new k(this, 0));
            this.f357690j.setVisibility(0);
            d();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        EditText editText = chipTextInputComboView2.f357572d;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = timeModel.f357641c;
        editText.setFilters(inputFilterArr);
        EditText editText2 = chipTextInputComboView.f357572d;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = timeModel.f357640b;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.f357571c;
        EditText editText3 = textInputLayout.getEditText();
        this.f357688h = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f357571c;
        EditText editText4 = textInputLayout2.getEditText();
        this.f357689i = editText4;
        j jVar = new j(chipTextInputComboView2, chipTextInputComboView, timeModel);
        C22823h0.C(chipTextInputComboView2.f357570b, new d(linearLayout.getContext(), R.string.material_hour_selection, timeModel));
        C22823h0.C(chipTextInputComboView.f357570b, new e(linearLayout.getContext(), R.string.material_minute_selection, timeModel));
        editText3.addTextChangedListener(bVar);
        editText4.addTextChangedListener(aVar);
        c(timeModel);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(jVar);
        editText5.setOnKeyListener(jVar);
        editText6.setOnKeyListener(jVar);
    }

    public final void a(int i12) {
        this.f357683c.f357645g = i12;
        this.f357686f.setChecked(i12 == 12);
        this.f357687g.setChecked(i12 == 10);
        d();
    }

    public final void b() {
        TimeModel timeModel = this.f357683c;
        this.f357686f.setChecked(timeModel.f357645g == 12);
        this.f357687g.setChecked(timeModel.f357645g == 10);
    }

    public final void c(TimeModel timeModel) {
        TextWatcher textWatcher = this.f357685e;
        EditText editText = this.f357688h;
        editText.removeTextChangedListener(textWatcher);
        TextWatcher textWatcher2 = this.f357684d;
        EditText editText2 = this.f357689i;
        editText2.removeTextChangedListener(textWatcher2);
        Locale locale = this.f357682b.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.f357644f));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.c()));
        ChipTextInputComboView chipTextInputComboView = this.f357686f;
        String strA = TimeModel.a(chipTextInputComboView.getResources(), str, "%02d");
        chipTextInputComboView.f357570b.setText(strA);
        if (!TextUtils.isEmpty(strA)) {
            TextWatcher textWatcher3 = chipTextInputComboView.f357573e;
            EditText editText3 = chipTextInputComboView.f357572d;
            editText3.removeTextChangedListener(textWatcher3);
            editText3.setText(strA);
            editText3.addTextChangedListener(textWatcher3);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f357687g;
        String strA2 = TimeModel.a(chipTextInputComboView2.getResources(), str2, "%02d");
        chipTextInputComboView2.f357570b.setText(strA2);
        if (!TextUtils.isEmpty(strA2)) {
            TextWatcher textWatcher4 = chipTextInputComboView2.f357573e;
            EditText editText4 = chipTextInputComboView2.f357572d;
            editText4.removeTextChangedListener(textWatcher4);
            editText4.setText(strA2);
            editText4.addTextChangedListener(textWatcher4);
        }
        editText.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher2);
        d();
    }

    public final void d() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f357690j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.b(this.f357683c.f357646h == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }

    @Override // com.google.android.material.timepicker.i
    public final void hide() {
        LinearLayout linearLayout = this.f357682b;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null) {
            O.e(focusedChild);
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.i
    public final void invalidate() {
        c(this.f357683c);
    }

    @Override // com.google.android.material.timepicker.i
    public final void show() {
        this.f357682b.setVisibility(0);
        a(this.f357683c.f357645g);
    }
}
