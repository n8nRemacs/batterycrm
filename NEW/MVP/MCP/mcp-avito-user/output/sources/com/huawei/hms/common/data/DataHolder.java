package com.huawei.hms.common.data;

import AK.c;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import androidx.camera.view.k;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    public static class Builder {
        private String[] builderColumns;
        private final ArrayList<HashMap<String, Object>> dataCollectionList;
        private final String type;
        private final HashMap<Object, Integer> typeAndDataCollectionCountMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i12) {
            return new DataHolder(this, i12, (Bundle) null);
        }

        public Builder setDataForContentValuesHashMap(HashMap<String, Object> map) {
            int iIntValue;
            boolean z12;
            Object obj;
            Preconditions.checkNotNull(map, "contentValuesHashMap cannot be null");
            String str = this.type;
            if (str == null || (obj = map.get(str)) == null) {
                iIntValue = 0;
                z12 = false;
            } else {
                Integer num = this.typeAndDataCollectionCountMapping.get(obj);
                if (num != null) {
                    iIntValue = num.intValue();
                    z12 = true;
                } else {
                    this.typeAndDataCollectionCountMapping.put(obj, Integer.valueOf(this.dataCollectionList.size()));
                    iIntValue = 0;
                    z12 = false;
                }
            }
            if (z12) {
                this.dataCollectionList.remove(iIntValue);
                this.dataCollectionList.add(iIntValue, map);
            } else {
                this.dataCollectionList.add(map);
            }
            return this;
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> map = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(map);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.builderColumns = strArr;
            this.dataCollectionList = new ArrayList<>();
            this.type = str;
            this.typeAndDataCollectionCountMapping = new HashMap<>();
        }

        public DataHolder build(int i12, Bundle bundle) {
            return new DataHolder(this, i12, bundle, -1);
        }

        public Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    private void checkAvailable(String str, int i12) {
        Bundle bundle = this.columnsBundle;
        String strF = (bundle == null || !bundle.containsKey(str)) ? G.f("cannot find column: ", str) : isClosed() ? "buffer has been closed" : (i12 < 0 || i12 >= this.dataCount) ? c.g(i12, "row is out of index:") : "";
        Preconditions.checkArgument(strF.isEmpty(), strF);
    }

    public static DataHolder empty(int i12) {
        return new DataHolder(BUILDER, i12, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int numRows;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                numRows = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                numRows = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, numRows, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th2) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th2.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder, int i12, List list) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow = new CursorWindow((String) null);
        cursorWindow.setNumColumns(builder.builderColumns.length);
        arrayList.add(cursorWindow);
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            try {
                if (!cursorWindow.allocRow()) {
                    HMSLog.d(TAG, "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    cursorWindow.setStartPosition(i13);
                    cursorWindow.setNumColumns(builder.builderColumns.length);
                    if (!cursorWindow.allocRow()) {
                        HMSLog.e(TAG, "Failed to retry to allocate a row");
                        return arrayList;
                    }
                    arrayList.add(cursorWindow);
                }
                HashMap map = (HashMap) list.get(i13);
                boolean zPutValue = true;
                for (int i14 = 0; i14 < builder.builderColumns.length && (zPutValue = putValue(cursorWindow, map.get(builder.builderColumns[i14]), i13, i14)); i14++) {
                }
                if (!zPutValue) {
                    HMSLog.d(TAG, "fail to put data for row " + i13);
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow2 = new CursorWindow((String) null);
                    cursorWindow2.setStartPosition(i13);
                    cursorWindow2.setNumColumns(builder.builderColumns.length);
                    arrayList.add(cursorWindow2);
                    break;
                }
                i13++;
            } catch (RuntimeException e12) {
                Iterator<CursorWindow> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                throw e12;
            }
        }
        return arrayList;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i12, int i13) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i12 < i13 && hMSCursorWrapper.moveToPosition(i12)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i12);
                hMSCursorWrapper.fillWindow(i12, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i12 = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i12, int i13) {
        if (obj == null) {
            return cursorWindow.putNull(i12, i13);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i12, i13);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i12, i13);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i12, i13);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i12, i13);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i12, i13);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i12, i13);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i12, i13);
        }
        throw new IllegalArgumentException(k.a(obj, "unsupported type for column: "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!this.mClosed) {
                for (CursorWindow cursorWindow : this.cursorWindows) {
                    cursorWindow.close();
                }
                this.mClosed = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            String[] strArr = this.columns;
            if (i13 >= strArr.length) {
                break;
            }
            this.columnsBundle.putInt(strArr[i13], i13);
            i13++;
        }
        this.perCursorCounts = new int[this.cursorWindows.length];
        int startPosition = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.cursorWindows;
            if (i12 >= cursorWindowArr.length) {
                this.dataCount = startPosition;
                return;
            } else {
                this.perCursorCounts[i12] = startPosition;
                startPosition = cursorWindowArr[i12].getStartPosition() + this.cursorWindows[i12].getNumRows();
                i12++;
            }
        }
    }

    public final void copyToBuffer(String str, int i12, int i13, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i12);
        this.cursorWindows[i13].copyStringToBuffer(i12, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    public final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String str, int i12, int i13, String str2) {
        str2.getClass();
        switch (str2) {
            case "type_float":
                checkAvailable(str, i12);
                return Float.valueOf(this.cursorWindows[i13].getFloat(i12, this.columnsBundle.getInt(str)));
            case "type_boolean":
                checkAvailable(str, i12);
                return Boolean.valueOf(this.cursorWindows[i13].getLong(i12, this.columnsBundle.getInt(str)) == 1);
            case "type_int":
                checkAvailable(str, i12);
                return Integer.valueOf(this.cursorWindows[i13].getInt(i12, this.columnsBundle.getInt(str)));
            case "type_double":
                checkAvailable(str, i12);
                return Double.valueOf(this.cursorWindows[i13].getDouble(i12, this.columnsBundle.getInt(str)));
            case "type_long":
                checkAvailable(str, i12);
                return Long.valueOf(this.cursorWindows[i13].getLong(i12, this.columnsBundle.getInt(str)));
            case "type_string":
                checkAvailable(str, i12);
                return this.cursorWindows[i13].getString(i12, this.columnsBundle.getInt(str));
            case "type_byte_array":
                checkAvailable(str, i12);
                return this.cursorWindows[i13].getBlob(i12, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i12) {
        int[] iArr;
        int i13 = 0;
        Preconditions.checkArgument(i12 >= 0 || i12 < this.dataCount, "rowIndex is out of index:" + i12);
        while (true) {
            iArr = this.perCursorCounts;
            if (i13 >= iArr.length) {
                break;
            }
            if (i12 < iArr[i13]) {
                i13--;
                break;
            }
            i13++;
        }
        return i13 == iArr.length ? i13 - 1 : i13;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i12, int i13) {
        checkAvailable(str, i12);
        return this.cursorWindows[i13].getType(i12, this.columnsBundle.getInt(str)) == 0;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i12, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i12 & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i12, String[] strArr, CursorWindow[] cursorWindowArr, int i13, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i12;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i13;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i12, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i12;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i12) {
        if (builder.builderColumns.length != 0) {
            if (i12 < 0 || i12 >= builder.dataCollectionList.size()) {
                i12 = builder.dataCollectionList.size();
            }
            ArrayList<CursorWindow> arrayListIterCursorWindow = iterCursorWindow(builder, i12, builder.dataCollectionList.subList(0, i12));
            return (CursorWindow[]) arrayListIterCursorWindow.toArray(new CursorWindow[arrayListIterCursorWindow.size()]);
        }
        return new CursorWindow[0];
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i12, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i12, bundle);
    }

    public DataHolder(Cursor cursor, int i12, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i12, bundle);
    }

    private DataHolder(Builder builder, int i12, Bundle bundle) {
        this(builder.builderColumns, getCursorWindows(builder, -1), i12, (Bundle) null);
    }

    private DataHolder(Builder builder, int i12, Bundle bundle, int i13) {
        this(builder.builderColumns, getCursorWindows(builder, -1), i12, bundle);
    }
}
