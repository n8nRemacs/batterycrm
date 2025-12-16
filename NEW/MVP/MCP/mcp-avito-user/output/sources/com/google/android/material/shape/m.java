package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C22823h0;
import com.google.android.material.shape.k;
import j.N;
import sY0.C48134a;

/* compiled from: MaterialShapeUtils.java */
/* loaded from: classes6.dex */
public class m {
    @N
    public static f a(int i12) {
        return i12 != 0 ? i12 != 1 ? new p() : new g() : new p();
    }

    public static void b(@N ViewGroup viewGroup, float f12) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof k) {
            ((k) background).m(f12);
        }
    }

    public static void c(@N View view, @N k kVar) {
        C48134a c48134a = kVar.f357034b.f357058b;
        if (c48134a == null || !c48134a.f437717a) {
            return;
        }
        float fL2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fL2 += C22823h0.l((View) parent);
        }
        k.c cVar = kVar.f357034b;
        if (cVar.f357068l != fL2) {
            cVar.f357068l = fL2;
            kVar.y();
        }
    }

    public static void d(@N ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof k) {
            c(viewGroup, (k) background);
        }
    }
}
