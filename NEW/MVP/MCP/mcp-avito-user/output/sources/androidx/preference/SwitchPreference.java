package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.RestrictTo;
import androidx.preference.v;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: G, reason: collision with root package name */
    public final a f53413G;

    /* renamed from: H, reason: collision with root package name */
    public final String f53414H;

    /* renamed from: I, reason: collision with root package name */
    public final String f53415I;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
            SwitchPreference switchPreference = SwitchPreference.this;
            switchPreference.getClass();
            switchPreference.m(z12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(@N Context context, @P AttributeSet attributeSet) {
        int iA2 = androidx.core.content.res.l.a(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iA2);
        this.f53413G = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53492m, iA2, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f53422C = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f53421B) {
            d();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f53423D = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f53421B) {
            d();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f53414H = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        d();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f53415I = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        d();
        this.f53425F = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void f(@N u uVar) {
        super.f(uVar);
        o(uVar.B80(android.R.id.switch_widget));
        n(uVar.B80(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    @RestrictTo
    public final void j(@N View view) {
        super.j(view);
        if (((AccessibilityManager) this.f53341b.getSystemService("accessibility")).isEnabled()) {
            o(view.findViewById(android.R.id.switch_widget));
            n(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(View view) {
        boolean z12 = view instanceof Switch;
        if (z12) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f53421B);
        }
        if (z12) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f53414H);
            r42.setTextOff(this.f53415I);
            r42.setOnCheckedChangeListener(this.f53413G);
        }
    }
}
