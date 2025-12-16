package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.preference.v;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: G, reason: collision with root package name */
    public final a f53308G;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            checkBoxPreference.getClass();
            checkBoxPreference.m(z12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(@N Context context, @P AttributeSet attributeSet) {
        int iA2 = androidx.core.content.res.l.a(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iA2);
        this.f53308G = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53481b, iA2, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f53422C = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f53421B) {
            d();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f53423D = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f53421B) {
            d();
        }
        this.f53425F = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void f(@N u uVar) {
        super.f(uVar);
        o(uVar.B80(android.R.id.checkbox));
        n(uVar.B80(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    @RestrictTo
    public final void j(@N View view) {
        super.j(view);
        if (((AccessibilityManager) this.f53341b.getSystemService("accessibility")).isEnabled()) {
            o(view.findViewById(android.R.id.checkbox));
            n(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(View view) {
        boolean z12 = view instanceof CompoundButton;
        if (z12) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f53421B);
        }
        if (z12) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f53308G);
        }
    }
}
