package o;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* compiled from: AllCapsTransformationMethod.java */
@RestrictTo
/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44495a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public Locale f419253a;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f419253a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z12, int i12, Rect rect) {
    }
}
