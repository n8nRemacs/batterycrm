package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.collection.C20199a;
import androidx.core.content.res.l;
import androidx.core.graphics.p;
import j.InterfaceC42156l;
import j.N;
import j.X;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes10.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f54888k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public h f54889c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f54890d;

    /* renamed from: e, reason: collision with root package name */
    public ColorFilter f54891e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54893g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f54894h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f54895i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f54896j;

    /* compiled from: VectorDrawableCompat.java */
    public static class b extends f {
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class c extends f {

        /* renamed from: d, reason: collision with root package name */
        public androidx.core.content.res.d f54897d;

        /* renamed from: f, reason: collision with root package name */
        public androidx.core.content.res.d f54899f;

        /* renamed from: e, reason: collision with root package name */
        public float f54898e = 0.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f54900g = 1.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f54901h = 1.0f;

        /* renamed from: i, reason: collision with root package name */
        public float f54902i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f54903j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f54904k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public Paint.Cap f54905l = Paint.Cap.BUTT;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Join f54906m = Paint.Join.MITER;

        /* renamed from: n, reason: collision with root package name */
        public float f54907n = 4.0f;

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public final boolean a() {
            return this.f54899f.b() || this.f54897d.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @Override // androidx.vectordrawable.graphics.drawable.i.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                androidx.core.content.res.d r0 = r6.f54899f
                boolean r1 = r0.b()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f44657b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f44658c
                if (r1 == r4) goto L1c
                r0.f44658c = r1
                r0 = r3
                goto L1d
            L1c:
                r0 = r2
            L1d:
                androidx.core.content.res.d r1 = r6.f54897d
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f44657b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f44658c
                if (r7 == r4) goto L36
                r1.f44658c = r7
                r2 = r3
            L36:
                r7 = r0 | r2
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.i.c.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f54901h;
        }

        @InterfaceC42156l
        public int getFillColor() {
            return this.f54899f.f44658c;
        }

        public float getStrokeAlpha() {
            return this.f54900g;
        }

        @InterfaceC42156l
        public int getStrokeColor() {
            return this.f54897d.f44658c;
        }

        public float getStrokeWidth() {
            return this.f54898e;
        }

        public float getTrimPathEnd() {
            return this.f54903j;
        }

        public float getTrimPathOffset() {
            return this.f54904k;
        }

        public float getTrimPathStart() {
            return this.f54902i;
        }

        public void setFillAlpha(float f12) {
            this.f54901h = f12;
        }

        public void setFillColor(int i12) {
            this.f54899f.f44658c = i12;
        }

        public void setStrokeAlpha(float f12) {
            this.f54900g = f12;
        }

        public void setStrokeColor(int i12) {
            this.f54897d.f44658c = i12;
        }

        public void setStrokeWidth(float f12) {
            this.f54898e = f12;
        }

        public void setTrimPathEnd(float f12) {
            this.f54903j = f12;
        }

        public void setTrimPathOffset(float f12) {
            this.f54904k = f12;
        }

        public void setTrimPathStart(float f12) {
            this.f54902i = f12;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f54938a;

        /* renamed from: e, reason: collision with root package name */
        public boolean f54942e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f54943f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f54944g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f54945h;

        /* renamed from: i, reason: collision with root package name */
        public int f54946i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f54947j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f54948k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f54949l;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f54940c = null;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f54941d = i.f54888k;

        /* renamed from: b, reason: collision with root package name */
        public g f54939b = new g();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f54938a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    public i() {
        this.f54893g = true;
        this.f54894h = new float[9];
        this.f54895i = new Matrix();
        this.f54896j = new Rect();
        this.f54889c = new h();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f54887b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f54896j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f54891e;
        if (colorFilter == null) {
            colorFilter = this.f54890d;
        }
        Matrix matrix = this.f54895i;
        canvas.getMatrix(matrix);
        float[] fArr = this.f54894h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        h hVar = this.f54889c;
        Bitmap bitmap = hVar.f54943f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != hVar.f54943f.getHeight()) {
            hVar.f54943f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            hVar.f54948k = true;
        }
        if (this.f54893g) {
            h hVar2 = this.f54889c;
            if (hVar2.f54948k || hVar2.f54944g != hVar2.f54940c || hVar2.f54945h != hVar2.f54941d || hVar2.f54947j != hVar2.f54942e || hVar2.f54946i != hVar2.f54939b.getRootAlpha()) {
                h hVar3 = this.f54889c;
                hVar3.f54943f.eraseColor(0);
                Canvas canvas2 = new Canvas(hVar3.f54943f);
                g gVar = hVar3.f54939b;
                gVar.a(gVar.f54929g, g.f54922p, canvas2, iMin, iMin2);
                h hVar4 = this.f54889c;
                hVar4.f54944g = hVar4.f54940c;
                hVar4.f54945h = hVar4.f54941d;
                hVar4.f54946i = hVar4.f54939b.getRootAlpha();
                hVar4.f54947j = hVar4.f54942e;
                hVar4.f54948k = false;
            }
        } else {
            h hVar5 = this.f54889c;
            hVar5.f54943f.eraseColor(0);
            Canvas canvas3 = new Canvas(hVar5.f54943f);
            g gVar2 = hVar5.f54939b;
            gVar2.a(gVar2.f54929g, g.f54922p, canvas3, iMin, iMin2);
        }
        h hVar6 = this.f54889c;
        if (hVar6.f54939b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (hVar6.f54949l == null) {
                Paint paint2 = new Paint();
                hVar6.f54949l = paint2;
                paint2.setFilterBitmap(true);
            }
            hVar6.f54949l.setAlpha(hVar6.f54939b.getRootAlpha());
            hVar6.f54949l.setColorFilter(colorFilter);
            paint = hVar6.f54949l;
        }
        canvas.drawBitmap(hVar6.f54943f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getAlpha() : this.f54889c.f54939b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f54889c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getColorFilter() : this.f54891e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f54887b != null) {
            return new C1934i(this.f54887b.getConstantState());
        }
        this.f54889c.f54938a = getChangingConfigurations();
        return this.f54889c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f54889c.f54939b.f54931i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f54889c.f54939b.f54930h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.isAutoMirrored() : this.f54889c.f54942e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            h hVar = this.f54889c;
            if (hVar != null) {
                g gVar = hVar.f54939b;
                if (gVar.f54936n == null) {
                    gVar.f54936n = Boolean.valueOf(gVar.f54929g.a());
                }
                if (gVar.f54936n.booleanValue() || ((colorStateList = this.f54889c.f54940c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f54892f && super.mutate() == this) {
            h hVar = this.f54889c;
            h hVar2 = new h();
            hVar2.f54940c = null;
            hVar2.f54941d = f54888k;
            if (hVar != null) {
                hVar2.f54938a = hVar.f54938a;
                g gVar = new g(hVar.f54939b);
                hVar2.f54939b = gVar;
                if (hVar.f54939b.f54927e != null) {
                    gVar.f54927e = new Paint(hVar.f54939b.f54927e);
                }
                if (hVar.f54939b.f54926d != null) {
                    hVar2.f54939b.f54926d = new Paint(hVar.f54939b.f54926d);
                }
                hVar2.f54940c = hVar.f54940c;
                hVar2.f54941d = hVar.f54941d;
                hVar2.f54942e = hVar.f54942e;
            }
            this.f54889c = hVar2;
            this.f54892f = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z12;
        PorterDuff.Mode mode;
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f54889c;
        ColorStateList colorStateList = hVar.f54940c;
        if (colorStateList == null || (mode = hVar.f54941d) == null) {
            z12 = false;
        } else {
            this.f54890d = a(colorStateList, mode);
            invalidateSelf();
            z12 = true;
        }
        g gVar = hVar.f54939b;
        if (gVar.f54936n == null) {
            gVar.f54936n = Boolean.valueOf(gVar.f54929g.a());
        }
        if (gVar.f54936n.booleanValue()) {
            boolean zB2 = hVar.f54939b.f54929g.b(iArr);
            hVar.f54948k |= zB2;
            if (zB2) {
                invalidateSelf();
                return true;
            }
        }
        return z12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j12);
        } else {
            super.scheduleSelf(runnable, j12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setAlpha(i12);
        } else if (this.f54889c.f54939b.getRootAlpha() != i12) {
            this.f54889c.f54939b.setRootAlpha(i12);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setAutoMirrored(z12);
        } else {
            this.f54889c.f54942e = z12;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f54891e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.a(drawable, i12);
        } else {
            setTintList(ColorStateList.valueOf(i12));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        h hVar = this.f54889c;
        if (hVar.f54940c != colorStateList) {
            hVar.f54940c = colorStateList;
            this.f54890d = a(colorStateList, hVar.f54941d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        h hVar = this.f54889c;
        if (hVar.f54941d != mode) {
            hVar.f54941d = mode;
            this.f54890d = a(hVar.f54940c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.setVisible(z12, z13) : super.setVisible(z12, z13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    @X
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i, reason: collision with other inner class name */
    public static class C1934i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f54950a;

        public C1934i(Drawable.ConstantState constantState) {
            this.f54950a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f54950a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f54950a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            i iVar = new i();
            iVar.f54887b = (VectorDrawable) this.f54950a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f54887b = (VectorDrawable) this.f54950a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f54887b = (VectorDrawable) this.f54950a.newDrawable(resources, theme);
            return iVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        public p.b[] f54919a;

        /* renamed from: b, reason: collision with root package name */
        public String f54920b;

        /* renamed from: c, reason: collision with root package name */
        public int f54921c;

        public f() {
            super();
            this.f54919a = null;
            this.f54921c = 0;
        }

        public p.b[] getPathData() {
            return this.f54919a;
        }

        public String getPathName() {
            return this.f54920b;
        }

        public void setPathData(p.b[] bVarArr) {
            if (!p.a(this.f54919a, bVarArr)) {
                this.f54919a = p.e(bVarArr);
                return;
            }
            p.b[] bVarArr2 = this.f54919a;
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                bVarArr2[i12].f44781a = bVarArr[i12].f44781a;
                int i13 = 0;
                while (true) {
                    float[] fArr = bVarArr[i12].f44782b;
                    if (i13 < fArr.length) {
                        bVarArr2[i12].f44782b[i13] = fArr[i13];
                        i13++;
                    }
                }
            }
        }

        public f(f fVar) {
            super();
            this.f54919a = null;
            this.f54921c = 0;
            this.f54920b = fVar.f54920b;
            this.f54919a = p.e(fVar.f54919a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        g gVar;
        int i12;
        int i13;
        boolean z12;
        int i14;
        char c12;
        int i15;
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f54889c;
        hVar.f54939b = new g();
        TypedArray typedArrayE = l.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f54865a);
        h hVar2 = this.f54889c;
        g gVar2 = hVar2.f54939b;
        int i16 = !l.d(xmlPullParser, "tintMode") ? -1 : typedArrayE.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i17 = 3;
        if (i16 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i16 != 5) {
            if (i16 != 9) {
                switch (i16) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        hVar2.f54941d = mode;
        int i18 = 1;
        ColorStateList colorStateListB = l.b(typedArrayE, xmlPullParser, theme, 1);
        if (colorStateListB != null) {
            hVar2.f54940c = colorStateListB;
        }
        boolean z13 = hVar2.f54942e;
        if (l.d(xmlPullParser, "autoMirrored")) {
            z13 = typedArrayE.getBoolean(5, z13);
        }
        hVar2.f54942e = z13;
        float f12 = gVar2.f54932j;
        if (l.d(xmlPullParser, "viewportWidth")) {
            f12 = typedArrayE.getFloat(7, f12);
        }
        gVar2.f54932j = f12;
        float f13 = gVar2.f54933k;
        if (l.d(xmlPullParser, "viewportHeight")) {
            f13 = typedArrayE.getFloat(8, f13);
        }
        gVar2.f54933k = f13;
        if (gVar2.f54932j <= 0.0f) {
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f13 > 0.0f) {
            gVar2.f54930h = typedArrayE.getDimension(3, gVar2.f54930h);
            int i19 = 2;
            float dimension = typedArrayE.getDimension(2, gVar2.f54931i);
            gVar2.f54931i = dimension;
            if (gVar2.f54930h <= 0.0f) {
                throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = gVar2.getAlpha();
                if (l.d(xmlPullParser, "alpha")) {
                    alpha = typedArrayE.getFloat(4, alpha);
                }
                gVar2.setAlpha(alpha);
                boolean z14 = false;
                String string = typedArrayE.getString(0);
                if (string != null) {
                    gVar2.f54935m = string;
                    gVar2.f54937o.put(string, gVar2);
                }
                typedArrayE.recycle();
                hVar.f54938a = getChangingConfigurations();
                hVar.f54948k = true;
                h hVar3 = this.f54889c;
                g gVar3 = hVar3.f54939b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(gVar3.f54929g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z15 = true;
                while (eventType != i18 && (xmlPullParser.getDepth() >= depth || eventType != i17)) {
                    if (eventType == i19) {
                        String name = xmlPullParser.getName();
                        d dVar = (d) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        C20199a<String, Object> c20199a = gVar3.f54937o;
                        gVar = gVar3;
                        if (zEquals) {
                            c cVar = new c();
                            TypedArray typedArrayE2 = l.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f54867c);
                            if (l.d(xmlPullParser, "pathData")) {
                                String string2 = typedArrayE2.getString(0);
                                if (string2 != null) {
                                    cVar.f54920b = string2;
                                }
                                String string3 = typedArrayE2.getString(2);
                                if (string3 != null) {
                                    cVar.f54919a = p.c(string3);
                                }
                                cVar.f54899f = l.c(typedArrayE2, xmlPullParser, theme, "fillColor", 1);
                                float f14 = cVar.f54901h;
                                if (l.d(xmlPullParser, "fillAlpha")) {
                                    f14 = typedArrayE2.getFloat(12, f14);
                                }
                                cVar.f54901h = f14;
                                int i22 = !l.d(xmlPullParser, "strokeLineCap") ? -1 : typedArrayE2.getInt(8, -1);
                                Paint.Cap cap = cVar.f54905l;
                                if (i22 != 0) {
                                    i13 = depth;
                                    if (i22 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (i22 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                } else {
                                    i13 = depth;
                                    cap = Paint.Cap.BUTT;
                                }
                                cVar.f54905l = cap;
                                int i23 = !l.d(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayE2.getInt(9, -1);
                                Paint.Join join = cVar.f54906m;
                                if (i23 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i23 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (i23 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                cVar.f54906m = join;
                                float f15 = cVar.f54907n;
                                if (l.d(xmlPullParser, "strokeMiterLimit")) {
                                    f15 = typedArrayE2.getFloat(10, f15);
                                }
                                cVar.f54907n = f15;
                                cVar.f54897d = l.c(typedArrayE2, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = cVar.f54900g;
                                if (l.d(xmlPullParser, "strokeAlpha")) {
                                    f16 = typedArrayE2.getFloat(11, f16);
                                }
                                cVar.f54900g = f16;
                                float f17 = cVar.f54898e;
                                if (l.d(xmlPullParser, "strokeWidth")) {
                                    f17 = typedArrayE2.getFloat(4, f17);
                                }
                                cVar.f54898e = f17;
                                float f18 = cVar.f54903j;
                                if (l.d(xmlPullParser, "trimPathEnd")) {
                                    f18 = typedArrayE2.getFloat(6, f18);
                                }
                                cVar.f54903j = f18;
                                float f19 = cVar.f54904k;
                                if (l.d(xmlPullParser, "trimPathOffset")) {
                                    f19 = typedArrayE2.getFloat(7, f19);
                                }
                                cVar.f54904k = f19;
                                float f22 = cVar.f54902i;
                                if (l.d(xmlPullParser, "trimPathStart")) {
                                    f22 = typedArrayE2.getFloat(5, f22);
                                }
                                cVar.f54902i = f22;
                                int i24 = cVar.f54921c;
                                if (l.d(xmlPullParser, "fillType")) {
                                    i24 = typedArrayE2.getInt(13, i24);
                                }
                                cVar.f54921c = i24;
                            } else {
                                i13 = depth;
                            }
                            typedArrayE2.recycle();
                            dVar.f54909b.add(cVar);
                            if (cVar.getPathName() != null) {
                                c20199a.put(cVar.getPathName(), cVar);
                            }
                            hVar3.f54938a = hVar3.f54938a;
                            z12 = false;
                            c12 = 5;
                            i15 = 1;
                            z15 = false;
                        } else {
                            i13 = depth;
                            if ("clip-path".equals(name)) {
                                b bVar = new b();
                                if (l.d(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayE3 = l.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f54868d);
                                    String string4 = typedArrayE3.getString(0);
                                    if (string4 != null) {
                                        bVar.f54920b = string4;
                                    }
                                    String string5 = typedArrayE3.getString(1);
                                    if (string5 != null) {
                                        bVar.f54919a = p.c(string5);
                                    }
                                    bVar.f54921c = !l.d(xmlPullParser, "fillType") ? 0 : typedArrayE3.getInt(2, 0);
                                    typedArrayE3.recycle();
                                }
                                dVar.f54909b.add(bVar);
                                if (bVar.getPathName() != null) {
                                    c20199a.put(bVar.getPathName(), bVar);
                                }
                                hVar3.f54938a = hVar3.f54938a;
                            } else if ("group".equals(name)) {
                                d dVar2 = new d();
                                TypedArray typedArrayE4 = l.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f54866b);
                                float f23 = dVar2.f54910c;
                                if (l.d(xmlPullParser, "rotation")) {
                                    c12 = 5;
                                    f23 = typedArrayE4.getFloat(5, f23);
                                } else {
                                    c12 = 5;
                                }
                                dVar2.f54910c = f23;
                                i15 = 1;
                                dVar2.f54911d = typedArrayE4.getFloat(1, dVar2.f54911d);
                                dVar2.f54912e = typedArrayE4.getFloat(2, dVar2.f54912e);
                                float f24 = dVar2.f54913f;
                                if (l.d(xmlPullParser, "scaleX")) {
                                    f24 = typedArrayE4.getFloat(3, f24);
                                }
                                dVar2.f54913f = f24;
                                float f25 = dVar2.f54914g;
                                if (l.d(xmlPullParser, "scaleY")) {
                                    f25 = typedArrayE4.getFloat(4, f25);
                                }
                                dVar2.f54914g = f25;
                                float f26 = dVar2.f54915h;
                                if (l.d(xmlPullParser, "translateX")) {
                                    f26 = typedArrayE4.getFloat(6, f26);
                                }
                                dVar2.f54915h = f26;
                                float f27 = dVar2.f54916i;
                                if (l.d(xmlPullParser, "translateY")) {
                                    f27 = typedArrayE4.getFloat(7, f27);
                                }
                                dVar2.f54916i = f27;
                                z12 = false;
                                String string6 = typedArrayE4.getString(0);
                                if (string6 != null) {
                                    dVar2.f54918k = string6;
                                }
                                dVar2.c();
                                typedArrayE4.recycle();
                                dVar.f54909b.add(dVar2);
                                arrayDeque.push(dVar2);
                                if (dVar2.getGroupName() != null) {
                                    c20199a.put(dVar2.getGroupName(), dVar2);
                                }
                                hVar3.f54938a = hVar3.f54938a;
                            }
                            z12 = false;
                            c12 = 5;
                            i15 = 1;
                        }
                        i12 = i15;
                        i14 = 3;
                    } else {
                        gVar = gVar3;
                        i12 = i18;
                        i13 = depth;
                        z12 = z14;
                        i14 = i17;
                        if (eventType == i14 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i17 = i14;
                    z14 = z12;
                    i18 = i12;
                    gVar3 = gVar;
                    depth = i13;
                    i19 = 2;
                }
                if (!z15) {
                    this.f54890d = a(hVar.f54940c, hVar.f54941d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayE.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public i(@N h hVar) {
        this.f54893g = true;
        this.f54894h = new float[9];
        this.f54895i = new Matrix();
        this.f54896j = new Rect();
        this.f54889c = hVar;
        this.f54890d = a(hVar.f54940c, hVar.f54941d);
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class g {

        /* renamed from: p, reason: collision with root package name */
        public static final Matrix f54922p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f54923a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f54924b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f54925c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f54926d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f54927e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f54928f;

        /* renamed from: g, reason: collision with root package name */
        public final d f54929g;

        /* renamed from: h, reason: collision with root package name */
        public float f54930h;

        /* renamed from: i, reason: collision with root package name */
        public float f54931i;

        /* renamed from: j, reason: collision with root package name */
        public float f54932j;

        /* renamed from: k, reason: collision with root package name */
        public float f54933k;

        /* renamed from: l, reason: collision with root package name */
        public int f54934l;

        /* renamed from: m, reason: collision with root package name */
        public String f54935m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f54936n;

        /* renamed from: o, reason: collision with root package name */
        public final C20199a<String, Object> f54937o;

        public g() {
            this.f54925c = new Matrix();
            this.f54930h = 0.0f;
            this.f54931i = 0.0f;
            this.f54932j = 0.0f;
            this.f54933k = 0.0f;
            this.f54934l = 255;
            this.f54935m = null;
            this.f54936n = null;
            this.f54937o = new C20199a<>();
            this.f54929g = new d();
            this.f54923a = new Path();
            this.f54924b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v16 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(androidx.vectordrawable.graphics.drawable.i.d r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 550
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.i.g.a(androidx.vectordrawable.graphics.drawable.i$d, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f54934l;
        }

        public void setAlpha(float f12) {
            setRootAlpha((int) (f12 * 255.0f));
        }

        public void setRootAlpha(int i12) {
            this.f54934l = i12;
        }

        public g(g gVar) {
            this.f54925c = new Matrix();
            this.f54930h = 0.0f;
            this.f54931i = 0.0f;
            this.f54932j = 0.0f;
            this.f54933k = 0.0f;
            this.f54934l = 255;
            this.f54935m = null;
            this.f54936n = null;
            C20199a<String, Object> c20199a = new C20199a<>();
            this.f54937o = c20199a;
            this.f54929g = new d(gVar.f54929g, c20199a);
            this.f54923a = new Path(gVar.f54923a);
            this.f54924b = new Path(gVar.f54924b);
            this.f54930h = gVar.f54930h;
            this.f54931i = gVar.f54931i;
            this.f54932j = gVar.f54932j;
            this.f54933k = gVar.f54933k;
            this.f54934l = gVar.f54934l;
            this.f54935m = gVar.f54935m;
            String str = gVar.f54935m;
            if (str != null) {
                c20199a.put(str, this);
            }
            this.f54936n = gVar.f54936n;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f54908a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<e> f54909b;

        /* renamed from: c, reason: collision with root package name */
        public float f54910c;

        /* renamed from: d, reason: collision with root package name */
        public float f54911d;

        /* renamed from: e, reason: collision with root package name */
        public float f54912e;

        /* renamed from: f, reason: collision with root package name */
        public float f54913f;

        /* renamed from: g, reason: collision with root package name */
        public float f54914g;

        /* renamed from: h, reason: collision with root package name */
        public float f54915h;

        /* renamed from: i, reason: collision with root package name */
        public float f54916i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f54917j;

        /* renamed from: k, reason: collision with root package name */
        public String f54918k;

        /* JADX WARN: Multi-variable type inference failed */
        public d(d dVar, C20199a<String, Object> c20199a) {
            b bVar;
            super();
            this.f54908a = new Matrix();
            this.f54909b = new ArrayList<>();
            this.f54910c = 0.0f;
            this.f54911d = 0.0f;
            this.f54912e = 0.0f;
            this.f54913f = 1.0f;
            this.f54914g = 1.0f;
            this.f54915h = 0.0f;
            this.f54916i = 0.0f;
            Matrix matrix = new Matrix();
            this.f54917j = matrix;
            this.f54918k = null;
            this.f54910c = dVar.f54910c;
            this.f54911d = dVar.f54911d;
            this.f54912e = dVar.f54912e;
            this.f54913f = dVar.f54913f;
            this.f54914g = dVar.f54914g;
            this.f54915h = dVar.f54915h;
            this.f54916i = dVar.f54916i;
            String str = dVar.f54918k;
            this.f54918k = str;
            if (str != null) {
                c20199a.put(str, this);
            }
            matrix.set(dVar.f54917j);
            ArrayList<e> arrayList = dVar.f54909b;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                e eVar = arrayList.get(i12);
                if (eVar instanceof d) {
                    this.f54909b.add(new d((d) eVar, c20199a));
                } else {
                    if (eVar instanceof c) {
                        c cVar = (c) eVar;
                        c cVar2 = new c(cVar);
                        cVar2.f54898e = 0.0f;
                        cVar2.f54900g = 1.0f;
                        cVar2.f54901h = 1.0f;
                        cVar2.f54902i = 0.0f;
                        cVar2.f54903j = 1.0f;
                        cVar2.f54904k = 0.0f;
                        cVar2.f54905l = Paint.Cap.BUTT;
                        cVar2.f54906m = Paint.Join.MITER;
                        cVar2.f54907n = 4.0f;
                        cVar2.f54897d = cVar.f54897d;
                        cVar2.f54898e = cVar.f54898e;
                        cVar2.f54900g = cVar.f54900g;
                        cVar2.f54899f = cVar.f54899f;
                        cVar2.f54921c = cVar.f54921c;
                        cVar2.f54901h = cVar.f54901h;
                        cVar2.f54902i = cVar.f54902i;
                        cVar2.f54903j = cVar.f54903j;
                        cVar2.f54904k = cVar.f54904k;
                        cVar2.f54905l = cVar.f54905l;
                        cVar2.f54906m = cVar.f54906m;
                        cVar2.f54907n = cVar.f54907n;
                        bVar = cVar2;
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f54909b.add(bVar);
                    String str2 = bVar.f54920b;
                    if (str2 != null) {
                        c20199a.put(str2, bVar);
                    }
                }
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public final boolean a() {
            int i12 = 0;
            while (true) {
                ArrayList<e> arrayList = this.f54909b;
                if (i12 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i12).a()) {
                    return true;
                }
                i12++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public final boolean b(int[] iArr) {
            int i12 = 0;
            boolean zB2 = false;
            while (true) {
                ArrayList<e> arrayList = this.f54909b;
                if (i12 >= arrayList.size()) {
                    return zB2;
                }
                zB2 |= arrayList.get(i12).b(iArr);
                i12++;
            }
        }

        public final void c() {
            Matrix matrix = this.f54917j;
            matrix.reset();
            matrix.postTranslate(-this.f54911d, -this.f54912e);
            matrix.postScale(this.f54913f, this.f54914g);
            matrix.postRotate(this.f54910c, 0.0f, 0.0f);
            matrix.postTranslate(this.f54915h + this.f54911d, this.f54916i + this.f54912e);
        }

        public String getGroupName() {
            return this.f54918k;
        }

        public Matrix getLocalMatrix() {
            return this.f54917j;
        }

        public float getPivotX() {
            return this.f54911d;
        }

        public float getPivotY() {
            return this.f54912e;
        }

        public float getRotation() {
            return this.f54910c;
        }

        public float getScaleX() {
            return this.f54913f;
        }

        public float getScaleY() {
            return this.f54914g;
        }

        public float getTranslateX() {
            return this.f54915h;
        }

        public float getTranslateY() {
            return this.f54916i;
        }

        public void setPivotX(float f12) {
            if (f12 != this.f54911d) {
                this.f54911d = f12;
                c();
            }
        }

        public void setPivotY(float f12) {
            if (f12 != this.f54912e) {
                this.f54912e = f12;
                c();
            }
        }

        public void setRotation(float f12) {
            if (f12 != this.f54910c) {
                this.f54910c = f12;
                c();
            }
        }

        public void setScaleX(float f12) {
            if (f12 != this.f54913f) {
                this.f54913f = f12;
                c();
            }
        }

        public void setScaleY(float f12) {
            if (f12 != this.f54914g) {
                this.f54914g = f12;
                c();
            }
        }

        public void setTranslateX(float f12) {
            if (f12 != this.f54915h) {
                this.f54915h = f12;
                c();
            }
        }

        public void setTranslateY(float f12) {
            if (f12 != this.f54916i) {
                this.f54916i = f12;
                c();
            }
        }

        public d() {
            super();
            this.f54908a = new Matrix();
            this.f54909b = new ArrayList<>();
            this.f54910c = 0.0f;
            this.f54911d = 0.0f;
            this.f54912e = 0.0f;
            this.f54913f = 1.0f;
            this.f54914g = 1.0f;
            this.f54915h = 0.0f;
            this.f54916i = 0.0f;
            this.f54917j = new Matrix();
            this.f54918k = null;
        }
    }
}
