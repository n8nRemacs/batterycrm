package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.camera.camera2.internal.G;
import androidx.constraintlayout.widget.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintAttribute {

    /* renamed from: a, reason: collision with root package name */
    public boolean f44135a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f44136b;

    /* renamed from: c, reason: collision with root package name */
    public AttributeType f44137c;

    /* renamed from: d, reason: collision with root package name */
    public int f44138d;

    /* renamed from: e, reason: collision with root package name */
    public float f44139e;

    /* renamed from: f, reason: collision with root package name */
    public String f44140f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44141g;

    /* renamed from: h, reason: collision with root package name */
    public int f44142h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttributeType {

        /* renamed from: b, reason: collision with root package name */
        public static final AttributeType f44143b;

        /* renamed from: c, reason: collision with root package name */
        public static final AttributeType f44144c;

        /* renamed from: d, reason: collision with root package name */
        public static final AttributeType f44145d;

        /* renamed from: e, reason: collision with root package name */
        public static final AttributeType f44146e;

        /* renamed from: f, reason: collision with root package name */
        public static final AttributeType f44147f;

        /* renamed from: g, reason: collision with root package name */
        public static final AttributeType f44148g;

        /* renamed from: h, reason: collision with root package name */
        public static final AttributeType f44149h;

        /* renamed from: i, reason: collision with root package name */
        public static final AttributeType f44150i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AttributeType[] f44151j;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            f44143b = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            f44144c = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            f44145d = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            f44146e = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            f44147f = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            f44148g = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            f44149h = attributeType7;
            AttributeType attributeType8 = new AttributeType("REFERENCE_TYPE", 7);
            f44150i = attributeType8;
            f44151j = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8};
        }

        public AttributeType() {
            throw null;
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) f44151j.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44152a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f44152a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44152a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44152a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44152a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44152a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44152a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44152a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44152a[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f44136b = constraintAttribute.f44136b;
        this.f44137c = constraintAttribute.f44137c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44408e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z12 = false;
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z12 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.f44148g;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.f44145d;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.f44146e;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    AttributeType attributeType3 = AttributeType.f44149h;
                    if (index == 7) {
                        objValueOf2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        objValueOf2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.f44144c;
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.f44143b;
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        attributeType = AttributeType.f44147f;
                        objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        attributeType = AttributeType.f44150i;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        objValueOf = Integer.valueOf(resourceId);
                    }
                    attributeType2 = attributeType3;
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.f44136b = string;
            constraintAttribute.f44137c = attributeType2;
            constraintAttribute.f44135a = z12;
            constraintAttribute.f(objValueOf2);
            map.put(string, constraintAttribute);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, ConstraintAttribute> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ConstraintAttribute constraintAttribute = map.get(next);
            if (!constraintAttribute.f44135a) {
                next = G.f("set", next);
            }
            try {
                switch (constraintAttribute.f44137c.ordinal()) {
                    case 0:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f44138d));
                        break;
                    case 1:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f44139e));
                        break;
                    case 2:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f44142h));
                        break;
                    case 3:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f44142h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(next, CharSequence.class).invoke(view, constraintAttribute.f44140f);
                        break;
                    case 5:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f44141g));
                        break;
                    case 6:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f44139e));
                        break;
                    case 7:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f44138d));
                        break;
                }
            } catch (IllegalAccessException e12) {
                e12.printStackTrace();
            } catch (NoSuchMethodException e13) {
                e13.getMessage();
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (this.f44137c.ordinal()) {
            case 0:
                return this.f44138d;
            case 1:
                return this.f44139e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f44141g ? 1.0f : 0.0f;
            case 6:
                return this.f44139e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (this.f44137c.ordinal()) {
            case 0:
                fArr[0] = this.f44138d;
                return;
            case 1:
                fArr[0] = this.f44139e;
                return;
            case 2:
            case 3:
                int i12 = (this.f44142h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i12 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f44141g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f44139e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int iOrdinal = this.f44137c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.f44137c.ordinal()) {
            case 0:
            case 7:
                this.f44138d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f44139e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f44142h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f44140f = (String) obj;
                break;
            case 5:
                this.f44141g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f44139e = ((Float) obj).floatValue();
                break;
        }
    }
}
