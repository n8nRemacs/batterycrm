package com.google.android.gms.common.internal.safeparcel;

import AK.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import j.N;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static class ParseException extends RuntimeException {
        public ParseException(@N String str, @N Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static void A(Parcel parcel, int i12, int i13) {
        int iW2 = w(parcel, i12);
        if (iW2 == i13) {
            return;
        }
        throw new ParseException(c.s(r.y(i13, iW2, "Expected size ", " got ", " (0x"), Integer.toHexString(iW2), ")"), parcel);
    }

    @N
    public static BigDecimal a(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i13 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iW2);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i13);
    }

    @N
    public static Bundle b(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW2);
        return bundle;
    }

    @N
    public static byte[] c(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iW2);
        return bArrCreateByteArray;
    }

    @N
    public static int[] d(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iW2);
        return iArrCreateIntArray;
    }

    @N
    public static <T extends Parcelable> T e(@N Parcel parcel, int i12, @N Parcelable.Creator<T> creator) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW2);
        return tCreateFromParcel;
    }

    @N
    public static String f(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW2);
        return string;
    }

    @N
    public static String[] g(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iW2);
        return strArrCreateStringArray;
    }

    @N
    public static ArrayList<String> h(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iW2);
        return arrayListCreateStringArrayList;
    }

    @N
    public static <T> T[] i(@N Parcel parcel, int i12, @N Parcelable.Creator<T> creator) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW2);
        return tArr;
    }

    @N
    public static <T> ArrayList<T> j(@N Parcel parcel, int i12, @N Parcelable.Creator<T> creator) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iW2);
        return arrayListCreateTypedArrayList;
    }

    public static void k(@N Parcel parcel, int i12) {
        if (parcel.dataPosition() != i12) {
            throw new ParseException(c.g(i12, "Overread allowed size end="), parcel);
        }
    }

    public static boolean l(@N Parcel parcel, int i12) {
        A(parcel, i12, 4);
        return parcel.readInt() != 0;
    }

    public static byte m(@N Parcel parcel, int i12) {
        A(parcel, i12, 4);
        return (byte) parcel.readInt();
    }

    public static double n(@N Parcel parcel, int i12) {
        A(parcel, i12, 8);
        return parcel.readDouble();
    }

    @N
    public static Double o(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        if (iW2 == 0) {
            return null;
        }
        z(parcel, iW2, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(@N Parcel parcel, int i12) {
        A(parcel, i12, 4);
        return parcel.readFloat();
    }

    @N
    public static Float q(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        if (iW2 == 0) {
            return null;
        }
        z(parcel, iW2, 4);
        return Float.valueOf(parcel.readFloat());
    }

    @N
    public static IBinder r(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (iW2 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW2);
        return strongBinder;
    }

    public static int s(@N Parcel parcel, int i12) {
        A(parcel, i12, 4);
        return parcel.readInt();
    }

    @N
    public static Integer t(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        if (iW2 == 0) {
            return null;
        }
        z(parcel, iW2, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long u(@N Parcel parcel, int i12) {
        A(parcel, i12, 8);
        return parcel.readLong();
    }

    @N
    public static Long v(@N Parcel parcel, int i12) {
        int iW2 = w(parcel, i12);
        if (iW2 == 0) {
            return null;
        }
        z(parcel, iW2, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(@N Parcel parcel, int i12) {
        return (i12 & (-65536)) != -65536 ? (char) (i12 >> 16) : parcel.readInt();
    }

    public static void x(@N Parcel parcel, int i12) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i12));
    }

    public static int y(@N Parcel parcel) {
        int i12 = parcel.readInt();
        int iW2 = w(parcel, i12);
        char c12 = (char) i12;
        int iDataPosition = parcel.dataPosition();
        if (c12 != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i12))), parcel);
        }
        int i13 = iW2 + iDataPosition;
        if (i13 < iDataPosition || i13 > parcel.dataSize()) {
            throw new ParseException(H.j(iDataPosition, i13, "Size read is invalid start=", " end="), parcel);
        }
        return i13;
    }

    public static void z(Parcel parcel, int i12, int i13) {
        if (i12 == i13) {
            return;
        }
        throw new ParseException(c.s(r.y(i13, i12, "Expected size ", " got ", " (0x"), Integer.toHexString(i12), ")"), parcel);
    }
}
