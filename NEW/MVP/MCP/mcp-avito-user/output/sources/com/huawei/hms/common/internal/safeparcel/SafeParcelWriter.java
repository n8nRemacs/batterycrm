package com.huawei.hms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes7.dex */
public class SafeParcelWriter {
    private static final int BIT16_MARK = 65535;
    private static final int FIELD_ID_CHECKER = 20293;
    private static final int NEGATIVE_MARK = -65536;
    private static final int OFFSET16 = 16;

    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return getStartPosition(parcel, FIELD_ID_CHECKER);
    }

    public static void finishObjectHeader(Parcel parcel, int i12) {
        handleDataOver(parcel, i12);
    }

    private static int getStartPosition(Parcel parcel, int i12) {
        parcel.writeInt(i12 | NEGATIVE_MARK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void handleDataOver(Parcel parcel, int i12) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i12 - 4);
        parcel.writeInt(iDataPosition - i12);
        parcel.setDataPosition(iDataPosition);
    }

    private static void setHeader(Parcel parcel, int i12, int i13) {
        if (i13 < 65535) {
            parcel.writeInt(i12 | (i13 << 16));
        } else {
            parcel.writeInt(i12 | NEGATIVE_MARK);
            parcel.writeInt(i13);
        }
    }

    private static <P extends Parcelable> void setSizeOfData(Parcel parcel, P p12, int i12) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        p12.writeToParcel(parcel, i12);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void writeBigDecimal(Parcel parcel, int i12, BigDecimal bigDecimal, boolean z12) {
        if (bigDecimal == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
            }
        } else {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            handleDataOver(parcel, startPosition);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i12, BigDecimal[] bigDecimalArr, boolean z12) {
        if (bigDecimalArr == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i13 = 0; i13 < length; i13++) {
            parcel.writeByteArray(bigDecimalArr[i13].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i13].scale());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeBigInteger(Parcel parcel, int i12, BigInteger bigInteger, boolean z12) {
        if (bigInteger != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeByteArray(bigInteger.toByteArray());
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i12, BigInteger[] bigIntegerArr, boolean z12) {
        if (bigIntegerArr == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeBoolean(Parcel parcel, int i12, boolean z12) {
        setHeader(parcel, i12, 4);
        if (z12) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void writeBooleanArray(Parcel parcel, int i12, boolean[] zArr, boolean z12) {
        if (zArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeBooleanArray(zArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i12, List<Boolean> list, boolean z12) {
        if (list == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(list.get(i13).booleanValue() ? 1 : 0);
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeBooleanObject(Parcel parcel, int i12, Boolean bool, boolean z12) {
        if (bool != null) {
            setHeader(parcel, i12, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i12, Bundle bundle, boolean z12) {
        if (bundle != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeBundle(bundle);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeByte(Parcel parcel, int i12, byte b12) {
        setHeader(parcel, i12, 4);
        parcel.writeInt(b12);
    }

    public static void writeByteArray(Parcel parcel, int i12, byte[] bArr, boolean z12) {
        if (bArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeByteArray(bArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i12, byte[][] bArr, boolean z12) {
        if (bArr == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i12, SparseArray<byte[]> sparseArray, boolean z12) {
        if (sparseArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseArray.keyAt(i13));
            parcel.writeByteArray(sparseArray.valueAt(i13));
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeChar(Parcel parcel, int i12, char c12) {
        setHeader(parcel, i12, 4);
        parcel.writeInt(c12);
    }

    public static void writeCharArray(Parcel parcel, int i12, char[] cArr, boolean z12) {
        if (cArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeCharArray(cArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeDouble(Parcel parcel, int i12, double d12) {
        setHeader(parcel, i12, 8);
        parcel.writeDouble(d12);
    }

    public static void writeDoubleArray(Parcel parcel, int i12, double[] dArr, boolean z12) {
        if (dArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeDoubleArray(dArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i12, List<Double> list, boolean z12) {
        if (list == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeDouble(list.get(i13).doubleValue());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeDoubleObject(Parcel parcel, int i12, Double d12, boolean z12) {
        if (d12 != null) {
            setHeader(parcel, i12, 8);
            parcel.writeDouble(d12.doubleValue());
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i12, SparseArray<Double> sparseArray, boolean z12) {
        if (sparseArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseArray.keyAt(i13));
            parcel.writeDouble(sparseArray.valueAt(i13).doubleValue());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeFloat(Parcel parcel, int i12, float f12) {
        setHeader(parcel, i12, 4);
        parcel.writeFloat(f12);
    }

    public static void writeFloatArray(Parcel parcel, int i12, float[] fArr, boolean z12) {
        if (fArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeFloatArray(fArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeFloatList(Parcel parcel, int i12, List<Float> list, boolean z12) {
        if (list == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeFloat(list.get(i13).floatValue());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeFloatObject(Parcel parcel, int i12, Float f12, boolean z12) {
        if (f12 != null) {
            setHeader(parcel, i12, 4);
            parcel.writeFloat(f12.floatValue());
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i12, SparseArray<Float> sparseArray, boolean z12) {
        if (sparseArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseArray.keyAt(i13));
            parcel.writeFloat(sparseArray.valueAt(i13).floatValue());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeIBinder(Parcel parcel, int i12, IBinder iBinder, boolean z12) {
        if (iBinder != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeStrongBinder(iBinder);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i12, IBinder[] iBinderArr, boolean z12) {
        if (iBinderArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeBinderArray(iBinderArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i12, List<IBinder> list, boolean z12) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeBinderList(list);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i12, SparseArray<IBinder> sparseArray, boolean z12) {
        if (sparseArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseArray.keyAt(i13));
            parcel.writeStrongBinder(sparseArray.valueAt(i13));
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeInt(Parcel parcel, int i12, int i13) {
        setHeader(parcel, i12, 4);
        parcel.writeInt(i13);
    }

    public static void writeIntArray(Parcel parcel, int i12, int[] iArr, boolean z12) {
        if (iArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeIntArray(iArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i12, List<Integer> list, boolean z12) {
        if (list == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(list.get(i13).intValue());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeIntegerObject(Parcel parcel, int i12, Integer num, boolean z12) {
        if (num != null) {
            setHeader(parcel, i12, 4);
            parcel.writeInt(num.intValue());
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeList(Parcel parcel, int i12, List list, boolean z12) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeList(list);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeLong(Parcel parcel, int i12, long j12) {
        setHeader(parcel, i12, 8);
        parcel.writeLong(j12);
    }

    public static void writeLongArray(Parcel parcel, int i12, long[] jArr, boolean z12) {
        if (jArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeLongArray(jArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeLongList(Parcel parcel, int i12, List<Long> list, boolean z12) {
        if (list == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeLong(list.get(i13).longValue());
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeLongObject(Parcel parcel, int i12, Long l12, boolean z12) {
        if (l12 != null) {
            setHeader(parcel, i12, 8);
            parcel.writeLong(l12.longValue());
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i12, Parcel parcel2, boolean z12) {
        if (parcel2 != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i12, Parcel[] parcelArr, boolean z12) {
        if (parcelArr == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int length = parcelArr.length;
        parcel.writeInt(length);
        for (int i13 = 0; i13 < length; i13++) {
            Parcel parcel2 = parcelArr[i13];
            if (parcel2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcel2.dataSize());
                Parcel parcel3 = parcelArr[i13];
                parcel.appendFrom(parcel3, 0, parcel3.dataSize());
            }
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeParcelList(Parcel parcel, int i12, List<Parcel> list, boolean z12) {
        if (list == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            Parcel parcel2 = list.get(i13);
            if (parcel2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            }
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i12, SparseArray<Parcel> sparseArray, boolean z12) {
        if (sparseArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseArray.keyAt(i13));
            Parcel parcelValueAt = sparseArray.valueAt(i13);
            if (parcelValueAt == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            }
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeParcelable(Parcel parcel, int i12, Parcelable parcelable, int i13, boolean z12) {
        if (parcelable != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcelable.writeToParcel(parcel, i13);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeShort(Parcel parcel, int i12, short s5) {
        setHeader(parcel, i12, 4);
        parcel.writeInt(s5);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i12, SparseBooleanArray sparseBooleanArray, boolean z12) {
        if (sparseBooleanArray != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i12, SparseIntArray sparseIntArray, boolean z12) {
        if (sparseIntArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseIntArray.keyAt(i13));
            parcel.writeInt(sparseIntArray.valueAt(i13));
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeSparseLongArray(Parcel parcel, int i12, SparseLongArray sparseLongArray, boolean z12) {
        if (sparseLongArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseLongArray.keyAt(i13));
            parcel.writeLong(sparseLongArray.valueAt(i13));
        }
        handleDataOver(parcel, startPosition);
    }

    public static void writeString(Parcel parcel, int i12, String str, boolean z12) {
        if (str != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeString(str);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeStringArray(Parcel parcel, int i12, String[] strArr, boolean z12) {
        if (strArr != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeStringArray(strArr);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeStringList(Parcel parcel, int i12, List<String> list, boolean z12) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i12);
            parcel.writeStringList(list);
            handleDataOver(parcel, startPosition);
        } else if (z12) {
            setHeader(parcel, i12, 0);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i12, SparseArray<String> sparseArray, boolean z12) {
        if (sparseArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseArray.keyAt(i13));
            parcel.writeString(sparseArray.valueAt(i13));
        }
        handleDataOver(parcel, startPosition);
    }

    public static <P extends Parcelable> void writeTypedArray(Parcel parcel, int i12, P[] pArr, int i13, boolean z12) {
        if (pArr == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        parcel.writeInt(startPosition);
        for (P p12 : pArr) {
            if (p12 != null) {
                setSizeOfData(parcel, p12, i13);
            } else {
                parcel.writeInt(0);
            }
        }
        handleDataOver(parcel, startPosition);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i12, List<T> list, boolean z12) {
        if (list == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            T t12 = list.get(i13);
            if (t12 != null) {
                setSizeOfData(parcel, t12, 0);
            } else {
                parcel.writeInt(0);
            }
        }
        handleDataOver(parcel, startPosition);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i12, SparseArray<T> sparseArray, boolean z12) {
        if (sparseArray == null) {
            if (z12) {
                setHeader(parcel, i12, 0);
                return;
            }
            return;
        }
        int startPosition = getStartPosition(parcel, i12);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeInt(sparseArray.keyAt(i13));
            T tValueAt = sparseArray.valueAt(i13);
            if (tValueAt != null) {
                setSizeOfData(parcel, tValueAt, 0);
            } else {
                parcel.writeInt(0);
            }
        }
        handleDataOver(parcel, startPosition);
    }
}
