package defpackage;

import android.content.Context;
import android.util.TypedValue;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* loaded from: classes.dex */
public abstract class wsi {
    public static boolean a(i50 i50Var) {
        if (i50Var.a == -1 || i50Var.b == -1) {
            return false;
        }
        int i = i50Var.c;
        return i == 2 || i == 4;
    }

    public static final ree b(ree reeVar, kc3 kc3Var) {
        if (!fni.a(reeVar.e(), wee.b)) {
            return reeVar.isInline() ? b(reeVar.i(0), kc3Var) : reeVar;
        }
        if (d6j.a(reeVar) == null) {
            return reeVar;
        }
        kc3Var.getClass();
        return reeVar;
    }

    public static float c(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return zxg.h(f * (f < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s < 0 ? 32768 : 32767);
    }

    public static void d(ByteBuffer byteBuffer, i50 i50Var, ByteBuffer byteBuffer2, i50 i50Var2, ka2 ka2Var, int i, boolean z) {
        int i2 = ka2Var.b;
        boolean z2 = i50Var.c == 2;
        boolean z3 = i50Var2.c == 2;
        int i3 = ka2Var.a;
        float[] fArr = new float[i3];
        float[] fArr2 = new float[i2];
        for (int i4 = 0; i4 < i; i4++) {
            if (z) {
                int iPosition = byteBuffer2.position();
                for (int i5 = 0; i5 < i2; i5++) {
                    fArr2[i5] = c(byteBuffer2, z3, z3);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i6 = 0; i6 < i3; i6++) {
                fArr[i6] = c(byteBuffer, z2, z3);
            }
            for (int i7 = 0; i7 < i2; i7++) {
                for (int i8 = 0; i8 < i3; i8++) {
                    fArr2[i7] = (ka2Var.c[(i8 * i2) + i7] * fArr[i8]) + fArr2[i7];
                }
                if (z3) {
                    byteBuffer2.putShort((short) zxg.h(fArr2[i7], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(zxg.h(fArr2[i7], -1.0f, 1.0f));
                }
                fArr2[i7] = 0.0f;
            }
        }
    }

    public static TypedValue e(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean f(int i, Context context, boolean z) {
        TypedValue typedValueE = e(context, i);
        return (typedValueE == null || typedValueE.type != 18) ? z : typedValueE.data != 0;
    }

    public static TypedValue g(Context context, String str, int i) {
        TypedValue typedValueE = e(context, i);
        if (typedValueE != null) {
            return typedValueE;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final p6i h(ew7 ew7Var, ree reeVar) {
        s9j s9jVarE = reeVar.e();
        if (s9jVarE instanceof r5c) {
            return p6i.X;
        }
        if (fni.a(s9jVarE, nnf.c)) {
            return p6i.d;
        }
        if (!fni.a(s9jVarE, nnf.d)) {
            return p6i.c;
        }
        ree reeVarB = b(reeVar.i(0), ew7Var.b);
        s9j s9jVarE2 = reeVarB.e();
        if ((s9jVarE2 instanceof i9c) || fni.a(s9jVarE2, wee.c)) {
            return p6i.o;
        }
        throw new JsonEncodingException("Value of type '" + reeVarB.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + reeVarB.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
