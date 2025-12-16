package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import j.X;

/* compiled from: EmojiTransformationMethod.java */
@RestrictTo
@X
/* loaded from: classes.dex */
class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final TransformationMethod f46187a;

    public h(@P TransformationMethod transformationMethod) {
        this.f46187a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(@P CharSequence charSequence, @N View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f46187a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.e.a().d() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
        eVarA.getClass();
        return eVarA.j(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z12, int i12, Rect rect) {
        TransformationMethod transformationMethod = this.f46187a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z12, i12, rect);
        }
    }
}
