package com.huawei.hms.common.internal.safeparcel;

import AK.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import com.avito.android.advert.item.delivery_suggests.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class SafeParcelReader {
    private static final int BIT16_MARK = 65535;
    private static final int FIELD_ID_CHECKER = 20293;
    private static final int MAX_ARRAY_LENGTH = 1024;
    private static final int NEGATIVE_MARK = -65536;
    private static final int OFFSET16 = 16;

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(str).length() + 41);
            stringBuffer.append(str);
            stringBuffer.append(" Parcel: pos=");
            stringBuffer.append(parcel.dataPosition());
            stringBuffer.append(" size=");
            stringBuffer.append(parcel.dataSize());
            super(stringBuffer.toString());
        }
    }

    private SafeParcelReader() {
    }

    public static BigDecimal createBigDecimal(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i13 = parcel.readInt();
        parcel.setDataPosition(size + iDataPosition);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i13);
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new BigDecimal[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        BigDecimal[] bigDecimalArr = new BigDecimal[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bigDecimalArr[i14] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + size);
        return bigDecimalArr;
    }

    public static BigInteger createBigInteger(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(size + iDataPosition);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new BigInteger[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        BigInteger[] bigIntegerArr = new BigInteger[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bigIntegerArr[i14] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + size);
        return bigIntegerArr;
    }

    public static boolean[] createBooleanArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new boolean[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(size + iDataPosition);
        return zArrCreateBooleanArray;
    }

    public static ArrayList<Boolean> createBooleanList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static Bundle createBundle(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(size + iDataPosition);
        return bundle;
    }

    public static byte[] createByteArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new byte[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(size + iDataPosition);
        return bArrCreateByteArray;
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        byte[][] bArr = new byte[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + size);
        return bArr;
    }

    public static SparseArray<byte[]> createByteArraySparseArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        SparseArray<byte[]> sparseArray = new SparseArray<>(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static char[] createCharArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new char[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(size + iDataPosition);
        return cArrCreateCharArray;
    }

    public static double[] createDoubleArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new double[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(size + iDataPosition);
        return dArrCreateDoubleArray;
    }

    public static ArrayList<Double> createDoubleList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<Double> arrayList = new ArrayList<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static SparseArray<Double> createDoubleSparseArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        SparseArray<Double> sparseArray = new SparseArray<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static float[] createFloatArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new float[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(size + iDataPosition);
        return fArrCreateFloatArray;
    }

    public static ArrayList<Float> createFloatList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<Float> arrayList = new ArrayList<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static SparseArray<Float> createFloatSparseArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        SparseArray<Float> sparseArray = new SparseArray<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static IBinder[] createIBinderArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new IBinder[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(size + iDataPosition);
        return iBinderArrCreateBinderArray;
    }

    public static ArrayList<IBinder> createIBinderList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(size + iDataPosition);
        return arrayListCreateBinderArrayList;
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        SparseArray<IBinder> sparseArray = new SparseArray<>(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static int[] createIntArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new int[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(size + iDataPosition);
        return iArrCreateIntArray;
    }

    public static ArrayList<Integer> createIntegerList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        int iD2 = 0;
        while (iD2 < i13) {
            iD2 = l.d(parcel, arrayList, iD2, 1);
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static long[] createLongArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new long[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(size + iDataPosition);
        return jArrCreateLongArray;
    }

    public static ArrayList<Long> createLongList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<Long> arrayList = new ArrayList<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static Parcel createParcel(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, size);
        parcel.setDataPosition(size + iDataPosition);
        return parcelObtain;
    }

    public static Parcel[] createParcelArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new Parcel[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        Parcel[] parcelArr = new Parcel[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = parcel.readInt();
            if (i15 == 0) {
                parcelArr[i14] = null;
            } else {
                int iDataPosition2 = parcel.dataPosition();
                ensureDataPositionValid(parcel, i15, iDataPosition2);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i15);
                parcelArr[i14] = parcelObtain;
                parcel.setDataPosition(i15 + iDataPosition2);
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return parcelArr;
    }

    public static ArrayList<Parcel> createParcelList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = parcel.readInt();
            if (i15 == 0) {
                arrayList.add(null);
            } else {
                int iDataPosition2 = parcel.dataPosition();
                ensureDataPositionValid(parcel, i15, iDataPosition2);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i15);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(i15 + iDataPosition2);
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static SparseArray<Parcel> createParcelSparseArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            if (i16 == 0) {
                sparseArray.append(i15, null);
            } else {
                int iDataPosition2 = parcel.dataPosition();
                ensureDataPositionValid(parcel, i16, iDataPosition2);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i16);
                sparseArray.append(i15, parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i16);
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static <P extends Parcelable> P createParcelable(Parcel parcel, int i12, Parcelable.Creator<P> creator) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        P pCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(size + iDataPosition);
        return pCreateFromParcel;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(size + iDataPosition);
        return sparseBooleanArray;
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseIntArray;
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        SparseLongArray sparseLongArray = new SparseLongArray();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseLongArray;
    }

    public static String createString(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        String string = parcel.readString();
        parcel.setDataPosition(size + iDataPosition);
        return string;
    }

    public static String[] createStringArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return new String[0];
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(size + iDataPosition);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> createStringList(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(size + iDataPosition);
        return arrayListCreateStringArrayList;
    }

    public static SparseArray<String> createStringSparseArray(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        SparseArray<String> sparseArray = new SparseArray<>();
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static <C> C[] createTypedArray(Parcel parcel, int i12, Parcelable.Creator<C> creator) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return creator.newArray(0);
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        C[] cArr = (C[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(size + iDataPosition);
        return cArr;
    }

    public static <C> ArrayList<C> createTypedList(Parcel parcel, int i12, Parcelable.Creator<C> creator) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        ArrayList<C> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(size + iDataPosition);
        return arrayListCreateTypedArrayList;
    }

    public static <C> SparseArray<C> createTypedSparseArray(Parcel parcel, int i12, Parcelable.Creator<C> creator) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        int i13 = parcel.readInt();
        ensureArrayLengthValid(parcel, i13);
        SparseArray<C> sparseArray = new SparseArray<>();
        for (int i14 = 0; i14 < i13; i14++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    private static void ensureArrayLengthValid(Parcel parcel, int i12) {
        if (i12 > MAX_ARRAY_LENGTH) {
            throw new ParseException("arraySize cannot be beyond 65535", parcel);
        }
    }

    public static void ensureAtEnd(Parcel parcel, int i12) {
        if (parcel.dataPosition() != i12) {
            throw new ParseException(c.g(i12, "Overread allowed size end="), parcel);
        }
    }

    private static void ensureDataPositionValid(Parcel parcel, int i12, int i13) {
        if (i12 < 0 || isOutOfIntBoundary(i12, i13)) {
            throw new ParseException("dataPosition cannot be beyond integer scope", parcel);
        }
    }

    public static int getFieldId(int i12) {
        return i12 & 65535;
    }

    private static boolean isOutOfIntBoundary(int i12, int i13) {
        long j12 = i12 + i13;
        return j12 > 2147483647L || j12 < -2147483648L;
    }

    public static boolean readBoolean(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean readBooleanObject(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        if (size == 0) {
            return Boolean.FALSE;
        }
        sizeChecker(parcel, i12, size, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 8);
        return parcel.readDouble();
    }

    public static Double readDoubleObject(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        if (size == 0) {
            return null;
        }
        sizeChecker(parcel, i12, size, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        if (size == 0) {
            return null;
        }
        sizeChecker(parcel, i12, size, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder readIBinder(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ensureDataPositionValid(parcel, size, iDataPosition);
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(size + iDataPosition);
        return strongBinder;
    }

    public static int readInt(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        if (size == 0) {
            return null;
        }
        sizeChecker(parcel, i12, size, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void readList(Parcel parcel, int i12, List list, ClassLoader classLoader) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        if (size != 0) {
            ensureDataPositionValid(parcel, size, iDataPosition);
            parcel.readList(list, classLoader);
            parcel.setDataPosition(size + iDataPosition);
        }
    }

    public static long readLong(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        if (size == 0) {
            return null;
        }
        sizeChecker(parcel, i12, size, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short readShort(Parcel parcel, int i12) {
        sizeChecker(parcel, i12, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(Parcel parcel, int i12) {
        return (i12 & NEGATIVE_MARK) != NEGATIVE_MARK ? (i12 >> 16) & 65535 : parcel.readInt();
    }

    private static void sizeChecker(Parcel parcel, int i12, int i13) {
        int size = readSize(parcel, i12);
        if (size == i13) {
            return;
        }
        String hexString = Integer.toHexString(size);
        StringBuilder sb2 = new StringBuilder(hexString.length() + 46);
        sb2.append("Expected size ");
        sb2.append(i13);
        sb2.append(" got ");
        sb2.append(size);
        throw new ParseException(G.g(sb2, " (0x", hexString, ")"), parcel);
    }

    public static void skipUnknownField(Parcel parcel, int i12) {
        int size = readSize(parcel, i12);
        int iDataPosition = parcel.dataPosition();
        ensureDataPositionValid(parcel, size, iDataPosition);
        parcel.setDataPosition(size + iDataPosition);
    }

    public static int validateObjectHeader(Parcel parcel) {
        int header = readHeader(parcel);
        int size = readSize(parcel, header);
        int iDataPosition = parcel.dataPosition();
        if (getFieldId(header) != FIELD_ID_CHECKER) {
            String hexString = Integer.toHexString(header);
            throw new ParseException(hexString.length() != 0 ? "Expected object header. Got 0x".concat(hexString) : "Expected object header. Got 0x", parcel);
        }
        int i12 = size + iDataPosition;
        if (i12 < iDataPosition || i12 > parcel.dataSize()) {
            throw new ParseException(H.j(iDataPosition, i12, "invalid start=", " end="), parcel);
        }
        return i12;
    }

    private static void sizeChecker(Parcel parcel, int i12, int i13, int i14) {
        if (i13 == i14) {
            return;
        }
        String hexString = Integer.toHexString(i13);
        StringBuilder sb2 = new StringBuilder(hexString.length() + 46);
        sb2.append("Expected size ");
        sb2.append(i14);
        sb2.append(" got ");
        sb2.append(i13);
        throw new ParseException(G.g(sb2, " (0x", hexString, ")"), parcel);
    }
}
