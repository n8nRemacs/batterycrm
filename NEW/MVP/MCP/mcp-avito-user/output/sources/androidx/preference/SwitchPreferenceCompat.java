package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.v;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: G, reason: collision with root package name */
    public final a f53417G;

    /* renamed from: H, reason: collision with root package name */
    public final String f53418H;

    /* renamed from: I, reason: collision with root package name */
    public final String f53419I;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
            SwitchPreferenceCompat switchPreferenceCompat = SwitchPreferenceCompat.this;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.m(z12);
        }
    }

    public SwitchPreferenceCompat(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.f53417G = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53493n, R.attr.switchPreferenceCompatStyle, 0);
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
        this.f53418H = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        d();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f53419I = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        d();
        this.f53425F = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void f(@N u uVar) throws Resources.NotFoundException {
        super.f(uVar);
        o(uVar.B80(R.id.switchWidget));
        n(uVar.B80(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    @RestrictTo
    public final void j(@N View view) throws Resources.NotFoundException {
        super.j(view);
        if (((AccessibilityManager) this.f53341b.getSystemService("accessibility")).isEnabled()) {
            o(view.findViewById(R.id.switchWidget));
            n(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(View view) throws Resources.NotFoundException {
        boolean z12 = view instanceof SwitchCompat;
        if (z12) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f53421B);
        }
        if (z12) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f53418H);
            switchCompat.setTextOff(this.f53419I);
            switchCompat.setOnCheckedChangeListener(this.f53417G);
        }
    }
}
