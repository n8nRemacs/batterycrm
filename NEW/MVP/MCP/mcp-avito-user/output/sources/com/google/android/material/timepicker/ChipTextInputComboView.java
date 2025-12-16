package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.F;
import com.google.android.material.internal.O;
import com.google.android.material.textfield.TextInputLayout;
import j.N;
import j.P;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f357569f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Chip f357570b;

    /* renamed from: c, reason: collision with root package name */
    public final TextInputLayout f357571c;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f357572d;

    /* renamed from: e, reason: collision with root package name */
    public final TextWatcher f357573e;

    public class b extends F {
        public b(a aVar) {
        }

        @Override // com.google.android.material.internal.F, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (zIsEmpty) {
                chipTextInputComboView.f357570b.setText(TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d"));
                return;
            }
            int i12 = ChipTextInputComboView.f357569f;
            String strA = TimeModel.a(chipTextInputComboView.getResources(), editable, "%02d");
            if (TextUtils.isEmpty(strA)) {
                strA = TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d");
            }
            chipTextInputComboView.f357570b.setText(strA);
        }
    }

    public ChipTextInputComboView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f357570b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f357571c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f357572d = editText;
        editText.setVisibility(4);
        b bVar = new b(null);
        this.f357573e = bVar;
        editText.addTextChangedListener(bVar);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f357570b.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f357572d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z12) {
        Chip chip = this.f357570b;
        chip.setChecked(z12);
        int i12 = z12 ? 0 : 4;
        EditText editText = this.f357572d;
        editText.setVisibility(i12);
        chip.setVisibility(z12 ? 8 : 0);
        if (chip.isChecked()) {
            O.h(editText);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(@P View.OnClickListener onClickListener) {
        this.f357570b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i12, Object obj) {
        this.f357570b.setTag(i12, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f357570b.toggle();
    }
}
