package androidx.percentlayout.widget;

import N1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import j.N;

/* compiled from: PercentLayoutHelper.java */
@Deprecated
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final PercentRelativeLayout f53295a;

    /* compiled from: PercentLayoutHelper.java */
    @Deprecated
    public static class a {

        /* renamed from: i, reason: collision with root package name */
        public float f53304i;

        /* renamed from: a, reason: collision with root package name */
        public float f53296a = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        public float f53297b = -1.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f53298c = -1.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f53299d = -1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f53300e = -1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f53301f = -1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f53302g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f53303h = -1.0f;

        /* renamed from: j, reason: collision with root package name */
        public final c f53305j = new c(0, 0);

        public final void a(ViewGroup.LayoutParams layoutParams, int i12, int i13) {
            int i14 = layoutParams.width;
            c cVar = this.f53305j;
            ((ViewGroup.MarginLayoutParams) cVar).width = i14;
            int i15 = layoutParams.height;
            ((ViewGroup.MarginLayoutParams) cVar).height = i15;
            boolean z12 = false;
            boolean z13 = (cVar.f53307b || i14 == 0) && this.f53296a < 0.0f;
            if ((cVar.f53306a || i15 == 0) && this.f53297b < 0.0f) {
                z12 = true;
            }
            float f12 = this.f53296a;
            if (f12 >= 0.0f) {
                layoutParams.width = Math.round(i12 * f12);
            }
            float f13 = this.f53297b;
            if (f13 >= 0.0f) {
                layoutParams.height = Math.round(i13 * f13);
            }
            float f14 = this.f53304i;
            if (f14 >= 0.0f) {
                if (z13) {
                    layoutParams.width = Math.round(layoutParams.height * f14);
                    cVar.f53307b = true;
                }
                if (z12) {
                    layoutParams.height = Math.round(layoutParams.width / this.f53304i);
                    cVar.f53306a = true;
                }
            }
        }

        public final String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.f53296a), Float.valueOf(this.f53297b), Float.valueOf(this.f53298c), Float.valueOf(this.f53299d), Float.valueOf(this.f53300e), Float.valueOf(this.f53301f), Float.valueOf(this.f53302g), Float.valueOf(this.f53303h));
        }
    }

    /* compiled from: PercentLayoutHelper.java */
    @Deprecated
    /* renamed from: androidx.percentlayout.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC1879b {
        a a();
    }

    /* compiled from: PercentLayoutHelper.java */
    public static class c extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f53306a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f53307b;
    }

    public b(@N PercentRelativeLayout percentRelativeLayout) {
        this.f53295a = percentRelativeLayout;
    }

    public static a a(Context context, AttributeSet attributeSet) {
        a aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f11169a);
        float fraction = typedArrayObtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new a();
            aVar.f53296a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53297b = fraction2;
        }
        float fraction3 = typedArrayObtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53298c = fraction3;
            aVar.f53299d = fraction3;
            aVar.f53300e = fraction3;
            aVar.f53301f = fraction3;
        }
        float fraction4 = typedArrayObtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53298c = fraction4;
        }
        float fraction5 = typedArrayObtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53299d = fraction5;
        }
        float fraction6 = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53300e = fraction6;
        }
        float fraction7 = typedArrayObtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53301f = fraction7;
        }
        float fraction8 = typedArrayObtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53302g = fraction8;
        }
        float fraction9 = typedArrayObtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53303h = fraction9;
        }
        float fraction10 = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f53304i = fraction10;
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }
}
