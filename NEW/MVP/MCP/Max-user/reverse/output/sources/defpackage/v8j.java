package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v8j {
    public static Bundle a(Parcel parcel, int i) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iQ);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iQ);
        return bArrCreateByteArray;
    }

    public static Parcelable c(Parcel parcel, int i, Parcelable.Creator creator) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iQ);
        return parcelable;
    }

    public static String d(Parcel parcel, int i) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iQ);
        return string;
    }

    public static String[] e(Parcel parcel, int i) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iQ);
        return strArrCreateStringArray;
    }

    public static Object[] f(Parcel parcel, int i, Parcelable.Creator creator) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iQ);
        return objArrCreateTypedArray;
    }

    public static ArrayList g(Parcel parcel, int i, Parcelable.Creator creator) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iQ);
        return arrayListCreateTypedArrayList;
    }

    public static void h(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(ho7.f(i, "Overread allowed size end="), parcel);
        }
    }

    public static boolean i(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte j(Parcel parcel, int i) {
        v(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double k(Parcel parcel, int i) {
        v(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float l(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float m(Parcel parcel, int i) {
        int iQ = q(parcel, i);
        if (iQ == 0) {
            return null;
        }
        u(parcel, iQ, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder n(Parcel parcel, int i) {
        int iQ = q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iQ);
        return strongBinder;
    }

    public static int o(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readInt();
    }

    public static long p(Parcel parcel, int i) {
        v(parcel, i, 8);
        return parcel.readLong();
    }

    public static int q(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void r(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + q(parcel, i));
    }

    public static boolean s(uv1 uv1Var) {
        if (Looper.myLooper() != null) {
            return false;
        }
        bwf bwfVar = mu4.c;
        if (((ThreadLocal) bwfVar.getValue()) == null) {
            return false;
        }
        ThreadLocal threadLocal = (ThreadLocal) bwfVar.getValue();
        mu4 mu4Var = new mu4(threadLocal);
        Looper looper = mu4Var.b;
        try {
            uv1Var.invoke(mu4Var);
            if (!fni.a(looper.getThread(), Thread.currentThread())) {
                throw new IllegalStateException("Illegal thread");
            }
            threadLocal.remove();
            return true;
        } catch (Throwable th) {
            if (!fni.a(looper.getThread(), Thread.currentThread())) {
                throw new IllegalStateException("Illegal thread");
            }
            mu4Var.a.remove();
            throw th;
        }
    }

    public static int t(Parcel parcel) {
        int i = parcel.readInt();
        int iQ = q(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iQ + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new SafeParcelReader$ParseException(ho7.g("Size read is invalid start=", iDataPosition, i2, " end="), parcel);
        }
        return i2;
    }

    public static void u(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new SafeParcelReader$ParseException(ho7.l(wy1.k("Expected size ", i2, " got ", i, " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static void v(Parcel parcel, int i, int i2) {
        int iQ = q(parcel, i);
        if (iQ == i2) {
            return;
        }
        throw new SafeParcelReader$ParseException(ho7.l(wy1.k("Expected size ", i2, " got ", iQ, " (0x"), Integer.toHexString(iQ), ")"), parcel);
    }
}
