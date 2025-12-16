package com.google.protobuf.nano.ym;

/* loaded from: classes7.dex */
class FieldArray {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    public FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (iArr[i13] != iArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i12) {
        int i13 = this.mSize - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = this.mFieldNumbers[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else {
                if (i16 <= i12) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }

    private void gc() {
        int i12 = this.mSize;
        int[] iArr = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            FieldData fieldData = fieldDataArr[i14];
            if (fieldData != DELETED) {
                if (i14 != i13) {
                    iArr[i13] = iArr[i14];
                    fieldDataArr[i13] = fieldData;
                    fieldDataArr[i14] = null;
                }
                i13++;
            }
        }
        this.mGarbage = false;
        this.mSize = i13;
    }

    private int idealByteArraySize(int i12) {
        for (int i13 = 4; i13 < 32; i13++) {
            int i14 = (1 << i13) - 12;
            if (i12 <= i14) {
                return i14;
            }
        }
        return i12;
    }

    private int idealIntArraySize(int i12) {
        return idealByteArraySize(i12 * 4) / 4;
    }

    public FieldData dataAt(int i12) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i12];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray) obj;
        if (size() != fieldArray.size()) {
            return false;
        }
        return arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    public FieldData get(int i12) {
        FieldData fieldData;
        int iBinarySearch = binarySearch(i12);
        if (iBinarySearch < 0 || (fieldData = this.mData[iBinarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int iHashCode = 17;
        for (int i12 = 0; i12 < this.mSize; i12++) {
            iHashCode = (((iHashCode * 31) + this.mFieldNumbers[i12]) * 31) + this.mData[i12].hashCode();
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(int i12, FieldData fieldData) {
        int iBinarySearch = binarySearch(i12);
        if (iBinarySearch >= 0) {
            this.mData[iBinarySearch] = fieldData;
            return;
        }
        int i13 = ~iBinarySearch;
        int i14 = this.mSize;
        if (i13 < i14) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i13] == DELETED) {
                this.mFieldNumbers[i13] = i12;
                fieldDataArr[i13] = fieldData;
                return;
            }
        }
        if (this.mGarbage && i14 >= this.mFieldNumbers.length) {
            gc();
            i13 = ~binarySearch(i12);
        }
        int i15 = this.mSize;
        if (i15 >= this.mFieldNumbers.length) {
            int iIdealIntArraySize = idealIntArraySize(i15 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            FieldData[] fieldDataArr2 = new FieldData[iIdealIntArraySize];
            int[] iArr2 = this.mFieldNumbers;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            FieldData[] fieldDataArr3 = this.mData;
            System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr2;
        }
        int i16 = this.mSize - i13;
        if (i16 != 0) {
            int[] iArr3 = this.mFieldNumbers;
            int i17 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i17, i16);
            FieldData[] fieldDataArr4 = this.mData;
            System.arraycopy(fieldDataArr4, i13, fieldDataArr4, i17, this.mSize - i13);
        }
        this.mFieldNumbers[i13] = i12;
        this.mData[i13] = fieldData;
        this.mSize++;
    }

    public void remove(int i12) {
        int iBinarySearch = binarySearch(i12);
        if (iBinarySearch >= 0) {
            FieldData[] fieldDataArr = this.mData;
            FieldData fieldData = fieldDataArr[iBinarySearch];
            FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[iBinarySearch] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public FieldArray(int i12) {
        this.mGarbage = false;
        int iIdealIntArraySize = idealIntArraySize(i12);
        this.mFieldNumbers = new int[iIdealIntArraySize];
        this.mData = new FieldData[iIdealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (!fieldDataArr[i13].equals(fieldDataArr2[i13])) {
                return false;
            }
        }
        return true;
    }
}
