package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class pn {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ pn(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable drawableA = sm3.a(compoundButton);
        if (drawableA != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.c) {
                    t35.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    t35.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        on onVar = (on) this.f;
        Drawable checkMarkDrawable = onVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.c) {
                    t35.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    t35.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(onVar.getDrawableState());
                }
                onVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.a = null;
        return bundle2;
    }

    public jyd d() {
        String str;
        jyd jydVar;
        Iterator it = ((rwd) this.f).iterator();
        do {
            nwd nwdVar = (nwd) it;
            if (!nwdVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) nwdVar.next();
            str = (String) entry.getKey();
            jydVar = (jyd) entry.getValue();
        } while (!fni.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return jydVar;
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        jdc jdcVarX = jdc.x(compoundButton.getContext(), attributeSet, o6d.CompoundButton, i);
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        hfh.m(compoundButton, compoundButton.getContext(), o6d.CompoundButton, attributeSet, (TypedArray) jdcVarX.c, i, 0);
        try {
            if (typedArray.hasValue(o6d.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(o6d.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(eri.a(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(o6d.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(o6d.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(eri.a(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(o6d.CompoundButton_buttonTint)) {
                rm3.c(compoundButton, jdcVarX.s(o6d.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(o6d.CompoundButton_buttonTintMode)) {
                rm3.d(compoundButton, d45.c(typedArray.getInt(o6d.CompoundButton_buttonTintMode, -1), null));
            }
            jdcVarX.B();
        } catch (Throwable th) {
            jdcVarX.B();
            throw th;
        }
    }

    public void f(String str, jyd jydVar) {
        if (((jyd) ((rwd) this.f).b(str, jydVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() throws NoSuchMethodException, SecurityException {
        if (!this.e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        jn jnVar = (jn) this.b;
        if (jnVar == null) {
            jnVar = new jn(this);
        }
        this.b = jnVar;
        try {
            o28.class.getDeclaredConstructor(null);
            jn jnVar2 = (jn) this.b;
            if (jnVar2 != null) {
                ((LinkedHashSet) jnVar2.b).add(o28.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + o28.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public pn() {
        this.f = new rwd();
        this.e = true;
    }
}
