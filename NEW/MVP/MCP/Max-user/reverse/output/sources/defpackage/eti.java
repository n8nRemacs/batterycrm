package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class eti {
    public static int a(int i, int i2) {
        return rf3.i(i, (Color.alpha(i) * i2) / 255);
    }

    public static long b(int i, long j) {
        long j2 = i;
        z5j.a("sampleRate must be greater than 0.", j2 > 0);
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j2;
    }

    public static String c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int d(int i, int i2, Context context) {
        Integer numValueOf;
        TypedValue typedValueE = wsi.e(context, i);
        if (typedValueE != null) {
            int i3 = typedValueE.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? s34.a(context, i3) : typedValueE.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int e(Context context, String str, int i) {
        TypedValue typedValueG = wsi.g(context, str, i);
        int i2 = typedValueG.resourceId;
        return i2 != 0 ? s34.a(context, i2) : typedValueG.data;
    }

    public static int f(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueG = wsi.g(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = typedValueG.resourceId;
        return i2 != 0 ? s34.a(context, i2) : typedValueG.data;
    }

    public static boolean g(int i) {
        return i != 0 && rf3.e(i) > 0.5d;
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int j(int i, float f, int i2) {
        return rf3.g(rf3.i(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static long k(int i, long j) {
        long j2 = i;
        z5j.a("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }
}
