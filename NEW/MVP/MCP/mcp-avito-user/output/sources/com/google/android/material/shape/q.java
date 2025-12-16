package com.google.android.material.shape;

import aZ0.InterfaceC19845a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import j.InterfaceC42150f;
import j.N;
import j.f0;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes6.dex */
public class q {

    /* renamed from: m, reason: collision with root package name */
    public static final o f357080m = new o(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public final f f357081a;

    /* renamed from: b, reason: collision with root package name */
    public final f f357082b;

    /* renamed from: c, reason: collision with root package name */
    public final f f357083c;

    /* renamed from: d, reason: collision with root package name */
    public final f f357084d;

    /* renamed from: e, reason: collision with root package name */
    public final e f357085e;

    /* renamed from: f, reason: collision with root package name */
    public final e f357086f;

    /* renamed from: g, reason: collision with root package name */
    public final e f357087g;

    /* renamed from: h, reason: collision with root package name */
    public final e f357088h;

    /* renamed from: i, reason: collision with root package name */
    public final h f357089i;

    /* renamed from: j, reason: collision with root package name */
    public final h f357090j;

    /* renamed from: k, reason: collision with root package name */
    public final h f357091k;

    /* renamed from: l, reason: collision with root package name */
    public final h f357092l;

    /* compiled from: ShapeAppearanceModel.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public f f357093a = new p();

        /* renamed from: b, reason: collision with root package name */
        @N
        public f f357094b = new p();

        /* renamed from: c, reason: collision with root package name */
        @N
        public f f357095c = new p();

        /* renamed from: d, reason: collision with root package name */
        @N
        public f f357096d = new p();

        /* renamed from: e, reason: collision with root package name */
        @N
        public e f357097e = new com.google.android.material.shape.a(0.0f);

        /* renamed from: f, reason: collision with root package name */
        @N
        public e f357098f = new com.google.android.material.shape.a(0.0f);

        /* renamed from: g, reason: collision with root package name */
        @N
        public e f357099g = new com.google.android.material.shape.a(0.0f);

        /* renamed from: h, reason: collision with root package name */
        @N
        public e f357100h = new com.google.android.material.shape.a(0.0f);

        /* renamed from: i, reason: collision with root package name */
        @N
        public h f357101i = new h();

        /* renamed from: j, reason: collision with root package name */
        @N
        public h f357102j = new h();

        /* renamed from: k, reason: collision with root package name */
        @N
        public h f357103k = new h();

        /* renamed from: l, reason: collision with root package name */
        @N
        public h f357104l = new h();

        public static float b(f fVar) {
            if (fVar instanceof p) {
                return ((p) fVar).f357079a;
            }
            if (fVar instanceof g) {
                return ((g) fVar).f357031a;
            }
            return -1.0f;
        }

        @N
        public final q a() {
            return new q(this, null);
        }

        @InterfaceC19845a
        @N
        public final void c(@j.r float f12) {
            m(f12);
            p(f12);
            j(f12);
            g(f12);
        }

        @InterfaceC19845a
        @N
        public final void d(@j.r float f12) {
            f fVarA = m.a(0);
            l(fVarA);
            o(fVarA);
            i(fVarA);
            f(fVarA);
            c(f12);
        }

        @InterfaceC19845a
        @N
        public final void e(@j.r float f12) {
            f(m.a(0));
            g(f12);
        }

        @InterfaceC19845a
        @N
        public final void f(@N f fVar) {
            this.f357096d = fVar;
            float fB2 = b(fVar);
            if (fB2 != -1.0f) {
                g(fB2);
            }
        }

        @InterfaceC19845a
        @N
        public final void g(@j.r float f12) {
            this.f357100h = new com.google.android.material.shape.a(f12);
        }

        @InterfaceC19845a
        @N
        public final void h(@j.r float f12) {
            i(m.a(0));
            j(f12);
        }

        @InterfaceC19845a
        @N
        public final void i(@N f fVar) {
            this.f357095c = fVar;
            float fB2 = b(fVar);
            if (fB2 != -1.0f) {
                j(fB2);
            }
        }

        @InterfaceC19845a
        @N
        public final void j(@j.r float f12) {
            this.f357099g = new com.google.android.material.shape.a(f12);
        }

        @InterfaceC19845a
        @N
        public final void k(@j.r float f12) {
            l(m.a(0));
            m(f12);
        }

        @InterfaceC19845a
        @N
        public final void l(@N f fVar) {
            this.f357093a = fVar;
            float fB2 = b(fVar);
            if (fB2 != -1.0f) {
                m(fB2);
            }
        }

        @InterfaceC19845a
        @N
        public final void m(@j.r float f12) {
            this.f357097e = new com.google.android.material.shape.a(f12);
        }

        @InterfaceC19845a
        @N
        public final void n(@j.r float f12) {
            o(m.a(0));
            p(f12);
        }

        @InterfaceC19845a
        @N
        public final void o(@N f fVar) {
            this.f357094b = fVar;
            float fB2 = b(fVar);
            if (fB2 != -1.0f) {
                p(fB2);
            }
        }

        @InterfaceC19845a
        @N
        public final void p(@j.r float f12) {
            this.f357098f = new com.google.android.material.shape.a(f12);
        }
    }

    /* compiled from: ShapeAppearanceModel.java */
    @RestrictTo
    public interface c {
        @N
        e a(@N e eVar);
    }

    public q(b bVar, a aVar) {
        this.f357081a = bVar.f357093a;
        this.f357082b = bVar.f357094b;
        this.f357083c = bVar.f357095c;
        this.f357084d = bVar.f357096d;
        this.f357085e = bVar.f357097e;
        this.f357086f = bVar.f357098f;
        this.f357087g = bVar.f357099g;
        this.f357088h = bVar.f357100h;
        this.f357089i = bVar.f357101i;
        this.f357090j = bVar.f357102j;
        this.f357091k = bVar.f357103k;
        this.f357092l = bVar.f357104l;
    }

    @N
    public static b a(Context context, @f0 int i12, @f0 int i13) {
        return b(context, i12, i13, new com.google.android.material.shape.a(0));
    }

    @N
    public static b b(Context context, @f0 int i12, @f0 int i13, @N e eVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i12);
        if (i13 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i13);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i14);
            int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i14);
            int i17 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i14);
            int i18 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i14);
            e eVarD = d(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, eVar);
            e eVarD2 = d(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, eVarD);
            e eVarD3 = d(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, eVarD);
            e eVarD4 = d(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, eVarD);
            e eVarD5 = d(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, eVarD);
            b bVar = new b();
            bVar.l(m.a(i15));
            bVar.f357097e = eVarD2;
            bVar.o(m.a(i16));
            bVar.f357098f = eVarD3;
            bVar.i(m.a(i17));
            bVar.f357099g = eVarD4;
            bVar.f(m.a(i18));
            bVar.f357100h = eVarD5;
            return bVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @N
    public static b c(@N Context context, AttributeSet attributeSet, @InterfaceC42150f int i12, @f0 int i13) {
        com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i12, i13);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    @N
    public static e d(TypedArray typedArray, int i12, @N e eVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i12);
        if (typedValuePeekValue == null) {
            return eVar;
        }
        int i13 = typedValuePeekValue.type;
        return i13 == 5 ? new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i13 == 6 ? new o(typedValuePeekValue.getFraction(1.0f, 1.0f)) : eVar;
    }

    @RestrictTo
    public final boolean e(@N RectF rectF) {
        boolean z12 = this.f357092l.getClass().equals(h.class) && this.f357090j.getClass().equals(h.class) && this.f357089i.getClass().equals(h.class) && this.f357091k.getClass().equals(h.class);
        float fA2 = this.f357085e.a(rectF);
        return z12 && ((this.f357086f.a(rectF) > fA2 ? 1 : (this.f357086f.a(rectF) == fA2 ? 0 : -1)) == 0 && (this.f357088h.a(rectF) > fA2 ? 1 : (this.f357088h.a(rectF) == fA2 ? 0 : -1)) == 0 && (this.f357087g.a(rectF) > fA2 ? 1 : (this.f357087g.a(rectF) == fA2 ? 0 : -1)) == 0) && ((this.f357082b instanceof p) && (this.f357081a instanceof p) && (this.f357083c instanceof p) && (this.f357084d instanceof p));
    }

    @N
    public final b f() {
        b bVar = new b();
        bVar.f357093a = new p();
        bVar.f357094b = new p();
        bVar.f357095c = new p();
        bVar.f357096d = new p();
        bVar.f357097e = new com.google.android.material.shape.a(0.0f);
        bVar.f357098f = new com.google.android.material.shape.a(0.0f);
        bVar.f357099g = new com.google.android.material.shape.a(0.0f);
        bVar.f357100h = new com.google.android.material.shape.a(0.0f);
        bVar.f357101i = new h();
        bVar.f357102j = new h();
        bVar.f357103k = new h();
        new h();
        bVar.f357093a = this.f357081a;
        bVar.f357094b = this.f357082b;
        bVar.f357095c = this.f357083c;
        bVar.f357096d = this.f357084d;
        bVar.f357097e = this.f357085e;
        bVar.f357098f = this.f357086f;
        bVar.f357099g = this.f357087g;
        bVar.f357100h = this.f357088h;
        bVar.f357101i = this.f357089i;
        bVar.f357102j = this.f357090j;
        bVar.f357103k = this.f357091k;
        bVar.f357104l = this.f357092l;
        return bVar;
    }

    @N
    @RestrictTo
    public final q g(@N c cVar) {
        b bVarF = f();
        bVarF.f357097e = cVar.a(this.f357085e);
        bVarF.f357098f = cVar.a(this.f357086f);
        bVarF.f357100h = cVar.a(this.f357088h);
        bVarF.f357099g = cVar.a(this.f357087g);
        return bVarF.a();
    }

    public q() {
        this.f357081a = new p();
        this.f357082b = new p();
        this.f357083c = new p();
        this.f357084d = new p();
        this.f357085e = new com.google.android.material.shape.a(0.0f);
        this.f357086f = new com.google.android.material.shape.a(0.0f);
        this.f357087g = new com.google.android.material.shape.a(0.0f);
        this.f357088h = new com.google.android.material.shape.a(0.0f);
        this.f357089i = new h();
        this.f357090j = new h();
        this.f357091k = new h();
        this.f357092l = new h();
    }
}
