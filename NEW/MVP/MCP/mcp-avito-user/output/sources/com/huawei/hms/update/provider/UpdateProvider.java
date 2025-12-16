package com.huawei.hms.update.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.camera.camera2.internal.G;
import com.huawei.hms.availableupdate.n;
import java.io.File;

/* loaded from: classes7.dex */
public class UpdateProvider extends ContentProvider {
    public static final String AUTHORITIES_SUFFIX = ".hms.update.provider";

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f363668a = {"_display_name", "_size"};

    /* renamed from: b, reason: collision with root package name */
    public static n f363669b = new n();

    public static int a(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(G.f("Invalid mode: ", str));
    }

    public static File getLocalFile(Context context, String str) {
        f363669b.a(context.getApplicationContext());
        return f363669b.a(str);
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        f363669b.a(context.getApplicationContext());
        return f363669b.a(file, str);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        f363669b.a(getContext().getApplicationContext());
        return f363669b.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (getContext() == null) {
            return "application/octet-stream";
        }
        f363669b.a(getContext().getApplicationContext());
        String name = f363669b.a(uri).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(iLastIndexOf + 1));
            if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        f363669b.a(getContext().getApplicationContext());
        return ParcelFileDescriptor.open(f363669b.a(uri), a(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i12;
        f363669b.a(getContext().getApplicationContext());
        File fileA = f363669b.a(uri);
        if (strArr == null) {
            strArr = f363668a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i13 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i13] = "_display_name";
                i12 = i13 + 1;
                objArr[i13] = fileA.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i13] = "_size";
                i12 = i13 + 1;
                objArr[i13] = Long.valueOf(fileA.length());
            }
            i13 = i12;
        }
        String[] strArrA = a(strArr3, i13);
        Object[] objArrA = a(objArr, i13);
        MatrixCursor matrixCursor = new MatrixCursor(strArrA, 1);
        matrixCursor.addRow(objArrA);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public static String[] a(String[] strArr, int i12) {
        String[] strArr2 = new String[i12];
        System.arraycopy(strArr, 0, strArr2, 0, i12);
        return strArr2;
    }

    public static Object[] a(Object[] objArr, int i12) {
        Object[] objArr2 = new Object[i12];
        System.arraycopy(objArr, 0, objArr2, 0, i12);
        return objArr2;
    }
}
