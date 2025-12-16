package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class gwi {
    public static final Bundle a() {
        return new Bundle(0);
    }

    public static final Bundle b(imb... imbVarArr) {
        Bundle bundle = new Bundle(imbVarArr.length);
        for (imb imbVar : imbVarArr) {
            String str = (String) imbVar.a;
            Object obj = imbVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                fw0.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                fw0.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static sl9 c(tm9 tm9Var) {
        int iM;
        String strO;
        String strO2;
        try {
            iM = efi.m(tm9Var);
        } catch (Throwable th) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = vfe.a.iterator();
            while (it.hasNext()) {
                ((qwa) it.next()).getClass();
                qwa.a(th);
            }
            int iV = az1.v(ctd.a);
            if (iV != 0) {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iM = 0;
        }
        ql9 ql9Var = null;
        long jLongValue = 0;
        for (int i = 0; i < iM; i++) {
            try {
                strO = efi.o(tm9Var);
            } catch (Throwable th2) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = vfe.a.iterator();
                while (it2.hasNext()) {
                    ((qwa) it2.next()).getClass();
                    qwa.a(th2);
                }
                int iV2 = az1.v(ctd.a);
                if (iV2 != 0) {
                    if (iV2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strO = null;
            }
            if (fni.a(strO, "userId")) {
                Long lValueOf = 0L;
                try {
                    lValueOf = Long.valueOf(efi.l(tm9Var, 0L));
                } catch (Throwable th3) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it3 = vfe.a.iterator();
                    while (it3.hasNext()) {
                        ((qwa) it3.next()).getClass();
                        qwa.a(th3);
                    }
                    int iV3 = az1.v(ctd.a);
                    if (iV3 != 0) {
                        if (iV3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th3;
                    }
                }
                jLongValue = lValueOf.longValue();
            } else if (fni.a(strO, "reaction")) {
                try {
                    strO2 = efi.o(tm9Var);
                } catch (Throwable th4) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it4 = vfe.a.iterator();
                    while (it4.hasNext()) {
                        ((qwa) it4.next()).getClass();
                        qwa.a(th4);
                    }
                    int iV4 = az1.v(ctd.a);
                    if (iV4 != 0) {
                        if (iV4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
                if (strO2 == null) {
                    strO2 = "";
                }
                ql9Var = new ql9(vl9.b, strO2);
            } else {
                try {
                    tm9Var.v();
                } catch (Throwable th5) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                    Iterator it5 = vfe.a.iterator();
                    while (it5.hasNext()) {
                        ((qwa) it5.next()).getClass();
                        qwa.a(th5);
                    }
                    int iV5 = az1.v(ctd.a);
                    if (iV5 != 0) {
                        if (iV5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th5;
                    }
                }
            }
        }
        if (ql9Var != null) {
            return new sl9(jLongValue, ql9Var);
        }
        throw new IllegalArgumentException("reaction is null");
    }
}
