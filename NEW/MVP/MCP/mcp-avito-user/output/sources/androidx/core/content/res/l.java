package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import j.g0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
@RestrictTo
/* loaded from: classes.dex */
public class l {
    public static int a(@N Context context, int i12, int i13) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        return typedValue.resourceId != 0 ? i12 : i13;
    }

    @P
    public static ColorStateList b(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @P Resources.Theme theme, @g0 int i12) {
        if (!d(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i12, typedValue);
        int i13 = typedValue.type;
        if (i13 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i12 + ": " + typedValue);
        }
        if (i13 >= 28 && i13 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(i12, 0);
        ThreadLocal<TypedValue> threadLocal = c.f44655a;
        try {
            return c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static d c(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @P Resources.Theme theme, @N String str, @g0 int i12) {
        d dVarA;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i12, typedValue);
            int i13 = typedValue.type;
            if (i13 >= 28 && i13 <= 31) {
                return new d(null, null, typedValue.data);
            }
            try {
                dVarA = d.a(typedArray.getResources(), typedArray.getResourceId(i12, 0), theme);
            } catch (Exception unused) {
                dVarA = null;
            }
            if (dVarA != null) {
                return dVarA;
            }
        }
        return new d(null, null, 0);
    }

    public static boolean d(@N XmlPullParser xmlPullParser, @N String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @N
    public static TypedArray e(@N Resources resources, @P Resources.Theme theme, @N AttributeSet attributeSet, @N int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
