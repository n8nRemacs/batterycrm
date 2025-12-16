package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.motion.widget.C22737c;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CustomSupport.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: CustomSupport.java */
    /* renamed from: androidx.constraintlayout.motion.utils.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1706a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43694a;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            f43694a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43694a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43694a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43694a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43694a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43694a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43694a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static int a(int i12) {
        int i13 = (i12 & (~(i12 >> 31))) - 255;
        return (i13 & (i13 >> 31)) + 255;
    }

    public static void b(ConstraintAttribute constraintAttribute, View view, float[] fArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.f44136b;
        try {
            boolean z12 = true;
            switch (constraintAttribute.f44137c.ordinal()) {
                case 0:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iA2 = (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA2);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.f44136b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z12 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z12));
                    return;
                case 6:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e12) {
            C22737c.d(view);
            e12.printStackTrace();
        } catch (NoSuchMethodException e13) {
            C22737c.d(view);
            e13.printStackTrace();
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
        }
    }
}
