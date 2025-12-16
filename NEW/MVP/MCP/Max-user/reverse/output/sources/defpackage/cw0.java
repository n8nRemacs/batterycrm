package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class cw0 {
    public final Context a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public cw0(Context context) {
        yk8 yk8Var = wd5.a;
        this.a = context;
        this.b = kti.d(150 * vw4.d().getDisplayMetrics().density);
        final int i = 0;
        this.c = ipi.b(3, new cm6(this) { // from class: bw0
            public final /* synthetic */ cw0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        v1a v1aVar = a93.s0;
                        Context context2 = this.b.a;
                        return new ShapeDrawable[]{cw0.b(v1aVar.x(context2).k().f().b.a.a), cw0.b(v1aVar.x(context2).k().f().b.a.b), cw0.b(v1aVar.x(context2).k().f().b.a.c), cw0.b(v1aVar.x(context2).k().f().b.a.d)};
                    case 1:
                        int length = ((ShapeDrawable[]) this.b.c.getValue()).length;
                        imb[] imbVarArr = new imb[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            imbVarArr[i2] = new imb(new qoc("x"), new qoc("y"));
                        }
                        return imbVarArr;
                    default:
                        return i9j.b(this.b.a);
                }
            }
        });
        final int i2 = 1;
        this.d = ipi.b(3, new cm6(this) { // from class: bw0
            public final /* synthetic */ cw0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        v1a v1aVar = a93.s0;
                        Context context2 = this.b.a;
                        return new ShapeDrawable[]{cw0.b(v1aVar.x(context2).k().f().b.a.a), cw0.b(v1aVar.x(context2).k().f().b.a.b), cw0.b(v1aVar.x(context2).k().f().b.a.c), cw0.b(v1aVar.x(context2).k().f().b.a.d)};
                    case 1:
                        int length = ((ShapeDrawable[]) this.b.c.getValue()).length;
                        imb[] imbVarArr = new imb[length];
                        for (int i22 = 0; i22 < length; i22++) {
                            imbVarArr[i22] = new imb(new qoc("x"), new qoc("y"));
                        }
                        return imbVarArr;
                    default:
                        return i9j.b(this.b.a);
                }
            }
        });
        final int i3 = 2;
        this.e = ipi.b(3, new cm6(this) { // from class: bw0
            public final /* synthetic */ cw0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        v1a v1aVar = a93.s0;
                        Context context2 = this.b.a;
                        return new ShapeDrawable[]{cw0.b(v1aVar.x(context2).k().f().b.a.a), cw0.b(v1aVar.x(context2).k().f().b.a.b), cw0.b(v1aVar.x(context2).k().f().b.a.c), cw0.b(v1aVar.x(context2).k().f().b.a.d)};
                    case 1:
                        int length = ((ShapeDrawable[]) this.b.c.getValue()).length;
                        imb[] imbVarArr = new imb[length];
                        for (int i22 = 0; i22 < length; i22++) {
                            imbVarArr[i22] = new imb(new qoc("x"), new qoc("y"));
                        }
                        return imbVarArr;
                    default:
                        return i9j.b(this.b.a);
                }
            }
        });
    }

    public static ShapeDrawable b(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setMaskFilter(new BlurMaskFilter(1000.0f, BlurMaskFilter.Blur.NORMAL));
        return shapeDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, k18] */
    public final BitmapDrawable a(yeb yebVar, kwe kweVar, Integer num) {
        int[] iArr;
        ?? r7;
        yk8 yk8Var = wd5.a;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) wd5.a.c(wd5.a(yebVar, kweVar, num));
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        int iOrdinal = kweVar.ordinal();
        if (iOrdinal == 0) {
            iArr = new int[]{yebVar.f().b.a.a, yebVar.f().b.a.b, yebVar.f().b.a.c, yebVar.f().b.a.d};
        } else if (iOrdinal == 1) {
            iArr = new int[]{-12940805, -10285313, -5616385, -16745729};
        } else if (iOrdinal == 2) {
            iArr = new int[]{-16745729, -13908427, -14904446, -15024573};
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iArr = new int[]{-9803158, -6645094, -8882570, -10197916};
        }
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            r7 = this.c;
            if (i >= length) {
                break;
            }
            ((ShapeDrawable[]) r7.getValue())[i2].getPaint().setColor(iArr[i]);
            i++;
            i2++;
        }
        ?? r0 = this.e;
        int iMin = Math.min(((r1e) r0.getValue()).b / 2, ((r1e) r0.getValue()).a / 2);
        float f = iMin;
        float f2 = f / 2.0f;
        for (ShapeDrawable shapeDrawable : (ShapeDrawable[]) r7.getValue()) {
            shapeDrawable.getShape().resize(f, f);
            shapeDrawable.setBounds(0, 0, iMin, iMin);
        }
        ?? r5 = this.d;
        imb[] imbVarArr = (imb[]) r5.getValue();
        int length2 = imbVarArr.length;
        int i3 = 0;
        int i4 = 0;
        k18 k18Var = r5;
        while (i3 < length2) {
            imb imbVar = imbVarArr[i3];
            int i5 = i4 + 1;
            float f3 = this.b;
            float f4 = f3 + f2;
            double d = i4 * 1.5707964f;
            float f5 = f;
            float f6 = f2;
            float fCos = (f6 * ((float) Math.cos(d))) + f4;
            float fSin = (((float) Math.sin(d)) * f6) + f4;
            ((qoc) imbVar.a).a = fCos;
            ((qoc) imbVar.b).a = fSin;
            iMin = Math.max(iMin, kti.d(fCos + f5 + f3));
            i3++;
            f = f5;
            i4 = i5;
            k18Var = k18Var;
            f2 = f6;
        }
        k18 k18Var2 = k18Var;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        ShapeDrawable[] shapeDrawableArr = (ShapeDrawable[]) r7.getValue();
        int length3 = shapeDrawableArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length3) {
            ShapeDrawable shapeDrawable2 = shapeDrawableArr[i6];
            int i8 = i7 + 1;
            imb imbVar2 = ((imb[]) k18Var2.getValue())[i7];
            qoc qocVar = (qoc) imbVar2.a;
            qoc qocVar2 = (qoc) imbVar2.b;
            float f7 = qocVar.a;
            float f8 = qocVar2.a;
            int iSave = canvas.save();
            canvas.translate(f7, f8);
            try {
                shapeDrawable2.draw(canvas);
                canvas.restoreToCount(iSave);
                i6++;
                i7 = i8;
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.a.getResources(), bitmapCreateBitmap);
        bitmapDrawable2.setBounds(0, 0, iMin, iMin);
        yk8 yk8Var2 = wd5.a;
        wd5.a.d(wd5.a(yebVar, kweVar, num), bitmapDrawable2);
        return bitmapDrawable2;
    }
}
