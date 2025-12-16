package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class izg extends zyg {
    public static final PorterDuff.Mode t0 = PorterDuff.Mode.SRC_IN;
    public boolean X;
    public final float[] Y;
    public final Matrix Z;
    public gzg b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean o;
    public final Rect s0;

    public izg() {
        this.X = true;
        this.Y = new float[9];
        this.Z = new Matrix();
        this.s0 = new Rect();
        gzg gzgVar = new gzg();
        gzgVar.c = null;
        gzgVar.d = t0;
        gzgVar.b = new fzg();
        this.b = gzgVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        t35.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.s0;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.Z;
        canvas.getMatrix(matrix);
        float[] fArr = this.Y;
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
        if (isAutoMirrored() && u35.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        gzg gzgVar = this.b;
        Bitmap bitmap = gzgVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != gzgVar.f.getHeight()) {
            gzgVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            gzgVar.k = true;
        }
        if (this.X) {
            gzg gzgVar2 = this.b;
            if (gzgVar2.k || gzgVar2.g != gzgVar2.c || gzgVar2.h != gzgVar2.d || gzgVar2.j != gzgVar2.e || gzgVar2.i != gzgVar2.b.getRootAlpha()) {
                gzg gzgVar3 = this.b;
                gzgVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(gzgVar3.f);
                fzg fzgVar = gzgVar3.b;
                fzgVar.a(fzgVar.g, fzg.p, canvas2, iMin, iMin2);
                gzg gzgVar4 = this.b;
                gzgVar4.g = gzgVar4.c;
                gzgVar4.h = gzgVar4.d;
                gzgVar4.i = gzgVar4.b.getRootAlpha();
                gzgVar4.j = gzgVar4.e;
                gzgVar4.k = false;
            }
        } else {
            gzg gzgVar5 = this.b;
            gzgVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(gzgVar5.f);
            fzg fzgVar2 = gzgVar5.b;
            fzgVar2.a(fzgVar2.g, fzg.p, canvas3, iMin, iMin2);
        }
        gzg gzgVar6 = this.b;
        if (gzgVar6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (gzgVar6.l == null) {
                Paint paint2 = new Paint();
                gzgVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            gzgVar6.l.setAlpha(gzgVar6.b.getRootAlpha());
            gzgVar6.l.setColorFilter(colorFilter);
            paint = gzgVar6.l;
        }
        canvas.drawBitmap(gzgVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? t35.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new hzg(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        gzg gzgVar = this.b;
        if (gzgVar == null) {
            return false;
        }
        fzg fzgVar = gzgVar.b;
        if (fzgVar.n == null) {
            fzgVar.n = Boolean.valueOf(fzgVar.g.a());
        }
        if (fzgVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.o && super.mutate() == this) {
            gzg gzgVar = this.b;
            gzg gzgVar2 = new gzg();
            gzgVar2.c = null;
            gzgVar2.d = t0;
            if (gzgVar != null) {
                gzgVar2.a = gzgVar.a;
                fzg fzgVar = new fzg(gzgVar.b);
                gzgVar2.b = fzgVar;
                if (gzgVar.b.e != null) {
                    fzgVar.e = new Paint(gzgVar.b.e);
                }
                if (gzgVar.b.d != null) {
                    gzgVar2.b.d = new Paint(gzgVar.b.d);
                }
                gzgVar2.c = gzgVar.c;
                gzgVar2.d = gzgVar.d;
                gzgVar2.e = gzgVar.e;
            }
            this.b = gzgVar2;
            this.o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        gzg gzgVar = this.b;
        ColorStateList colorStateList = gzgVar.c;
        if (colorStateList == null || (mode = gzgVar.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        fzg fzgVar = gzgVar.b;
        if (fzgVar.n == null) {
            fzgVar.n = Boolean.valueOf(fzgVar.g.a());
        }
        if (fzgVar.n.booleanValue()) {
            boolean zB = gzgVar.b.g.b(iArr);
            gzgVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            p9j.a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            t35.h(drawable, colorStateList);
            return;
        }
        gzg gzgVar = this.b;
        if (gzgVar.c != colorStateList) {
            gzgVar.c = colorStateList;
            this.c = a(colorStateList, gzgVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            t35.i(drawable, mode);
            return;
        }
        gzg gzgVar = this.b;
        if (gzgVar.d != mode) {
            gzgVar.d = mode;
            this.c = a(gzgVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.a;
        if (drawable != null) {
            t35.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        gzg gzgVar = this.b;
        gzgVar.b = new fzg();
        TypedArray typedArrayG = fni.g(resources, theme, attributeSet, gw0.a);
        gzg gzgVar2 = this.b;
        fzg fzgVar = gzgVar2.b;
        int i3 = !fni.f(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
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
        gzgVar2.d = mode;
        ColorStateList colorStateListA = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayG.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayG.getResources();
                int resourceId = typedArrayG.getResourceId(1, 0);
                ThreadLocal threadLocal = qf3.a;
                try {
                    colorStateListA = qf3.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            gzgVar2.c = colorStateList;
        }
        boolean z = gzgVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayG.getBoolean(5, z);
        }
        gzgVar2.e = z;
        float f = fzgVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayG.getFloat(7, f);
        }
        fzgVar.j = f;
        float f2 = fzgVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayG.getFloat(8, f2);
        }
        fzgVar.k = f2;
        if (fzgVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            fzgVar.h = typedArrayG.getDimension(3, fzgVar.h);
            float dimension = typedArrayG.getDimension(2, fzgVar.i);
            fzgVar.i = dimension;
            if (fzgVar.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = fzgVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                fzgVar.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    fzgVar.m = string;
                    fzgVar.o.put(string, fzgVar);
                }
                typedArrayG.recycle();
                gzgVar.a = getChangingConfigurations();
                gzgVar.k = true;
                gzg gzgVar3 = this.b;
                fzg fzgVar2 = gzgVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                czg czgVar = fzgVar2.g;
                us usVar = fzgVar2.o;
                arrayDeque.push(czgVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        czg czgVar2 = (czg) arrayDeque.peek();
                        i = depth;
                        if (ClientCookie.PATH_ATTR.equals(name)) {
                            bzg bzgVar = new bzg();
                            bzgVar.e = 0.0f;
                            bzgVar.g = 1.0f;
                            bzgVar.h = 1.0f;
                            bzgVar.i = 0.0f;
                            bzgVar.j = 1.0f;
                            bzgVar.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            bzgVar.l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            bzgVar.m = join2;
                            bzgVar.n = 4.0f;
                            TypedArray typedArrayG2 = fni.g(resources, theme, attributeSet, gw0.c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    bzgVar.b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    bzgVar.a = ve3.e(string3);
                                }
                                bzgVar.f = fni.e(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = bzgVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayG2.getFloat(12, f3);
                                }
                                bzgVar.h = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = bzgVar.l;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                bzgVar.l = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                                Paint.Join join3 = bzgVar.m;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                bzgVar.m = join;
                                float f4 = bzgVar.n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayG2.getFloat(10, f4);
                                }
                                bzgVar.n = f4;
                                bzgVar.d = fni.e(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = bzgVar.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayG2.getFloat(11, f5);
                                }
                                bzgVar.g = f5;
                                float f6 = bzgVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayG2.getFloat(4, f6);
                                }
                                bzgVar.e = f6;
                                float f7 = bzgVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayG2.getFloat(6, f7);
                                }
                                bzgVar.j = f7;
                                float f8 = bzgVar.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayG2.getFloat(7, f8);
                                }
                                bzgVar.k = f8;
                                float f9 = bzgVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayG2.getFloat(5, f9);
                                }
                                bzgVar.i = f9;
                                int i8 = bzgVar.c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayG2.getInt(13, i8);
                                }
                                bzgVar.c = i8;
                            }
                            typedArrayG2.recycle();
                            czgVar2.b.add(bzgVar);
                            if (bzgVar.getPathName() != null) {
                                usVar.put(bzgVar.getPathName(), bzgVar);
                            }
                            gzgVar3.a = gzgVar3.a;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                azg azgVar = new azg();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayG3 = fni.g(resources, theme, attributeSet, gw0.d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        azgVar.b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        azgVar.a = ve3.e(string5);
                                    }
                                    azgVar.c = !fni.f(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                czgVar2.b.add(azgVar);
                                if (azgVar.getPathName() != null) {
                                    usVar.put(azgVar.getPathName(), azgVar);
                                }
                                gzgVar3.a = gzgVar3.a;
                            } else if ("group".equals(name)) {
                                czg czgVar3 = new czg();
                                TypedArray typedArrayG4 = fni.g(resources, theme, attributeSet, gw0.b);
                                float f10 = czgVar3.c;
                                if (fni.f(xmlPullParser, "rotation")) {
                                    f10 = typedArrayG4.getFloat(5, f10);
                                }
                                czgVar3.c = f10;
                                czgVar3.d = typedArrayG4.getFloat(1, czgVar3.d);
                                czgVar3.e = typedArrayG4.getFloat(2, czgVar3.e);
                                float f11 = czgVar3.f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayG4.getFloat(3, f11);
                                }
                                czgVar3.f = f11;
                                float f12 = czgVar3.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayG4.getFloat(4, f12);
                                }
                                czgVar3.g = f12;
                                float f13 = czgVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayG4.getFloat(6, f13);
                                }
                                czgVar3.h = f13;
                                float f14 = czgVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayG4.getFloat(7, f14);
                                }
                                czgVar3.i = f14;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    czgVar3.k = string6;
                                }
                                czgVar3.c();
                                typedArrayG4.recycle();
                                czgVar2.b.add(czgVar3);
                                arrayDeque.push(czgVar3);
                                if (czgVar3.getGroupName() != null) {
                                    usVar.put(czgVar3.getGroupName(), czgVar3);
                                }
                                gzgVar3.a = gzgVar3.a;
                            }
                        }
                        i2 = 1;
                    } else {
                        i = depth;
                        c = '\b';
                        i2 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i2;
                    depth = i;
                }
                if (!z2) {
                    this.c = a(gzgVar.c, gzgVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public izg(gzg gzgVar) {
        this.X = true;
        this.Y = new float[9];
        this.Z = new Matrix();
        this.s0 = new Rect();
        this.b = gzgVar;
        this.c = a(gzgVar.c, gzgVar.d);
    }
}
