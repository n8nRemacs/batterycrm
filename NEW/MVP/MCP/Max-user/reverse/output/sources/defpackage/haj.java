package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public abstract class haj {
    public static Uri a(Uri uri, Context context, qx5 qx5Var) throws IOException {
        InputStream inputStreamOpenInputStream;
        String type;
        File fileP;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            wqi.c("haj", "Uri is from FileProvider, need copy: " + uri, new Object[0]);
            type = context.getContentResolver().getType(uri);
            if (type == null) {
                type = "application/octet-stream";
            }
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
            StringBuilder sb = new StringBuilder();
            if (uri.getLastPathSegment() != null) {
                sb.append(uri.getLastPathSegment());
            }
            if (extensionFromMimeType != null && !sb.toString().endsWith(extensionFromMimeType)) {
                sb.append(".");
                sb.append(extensionFromMimeType);
            }
            fileP = ((iz5) qx5Var).p(sb.toString());
            fileOutputStream = new FileOutputStream(fileP);
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th) {
                th = th;
                inputStreamOpenInputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        try {
            gbj.f(inputStreamOpenInputStream, fileOutputStream);
            fileOutputStream.close();
            inputStreamOpenInputStream.close();
            Uri uriFromFile = Uri.fromFile(fileP);
            ContentValues contentValues = new ContentValues();
            contentValues.put("mime_type", type);
            try {
                try {
                    context.getContentResolver().update(uriFromFile, contentValues, null, null);
                } catch (IllegalArgumentException e) {
                    wqi.p("haj", "copyContentOfUri failed to copy mimetype", e);
                }
            } catch (IllegalArgumentException unused) {
                context.getContentResolver().insert(uriFromFile, contentValues);
            }
            try {
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
            } catch (Exception unused2) {
            }
            return uriFromFile;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            try {
                wqi.e("haj", "handleSingleMediaIntent failed to copy FileProvider uri: ", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused3) {
                        return uri;
                    }
                }
                return uri;
            } finally {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
        }
    }

    public static int c(Intent intent) {
        String type = intent.getType();
        if ((type != null ? dnf.r(type, HTTP.PLAIN_TEXT_TYPE, true) : false) && intent.getParcelableExtra("android.intent.extra.STREAM") == null && intent.getParcelableArrayListExtra("android.intent.extra.STREAM") == null) {
            return 0;
        }
        if (type != null ? dnf.r(type, "text/x-vcard", true) : false) {
            return 5;
        }
        if ((type == null || type.length() == 0 || !dnf.r(type, "image/", true) || vmf.s(type, "djvu", true)) ? false : true) {
            return 1;
        }
        return (type == null || type.length() == 0 || !dnf.r(type, "video/", true)) ? false : true ? 2 : 4;
    }

    public static ArrayList d(Intent intent, Context context, yi5 yi5Var, qx5 qx5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                Uri uriA = parcelable == null ? null : parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
                if (uriA != null && !xpi.n(uriA, context, yi5Var)) {
                    if (qx5Var != null) {
                        uriA = a(uriA, context, qx5Var);
                    }
                    arrayList.add(uriA);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList e(Intent intent, Context context, yi5 yi5Var, qx5 qx5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra != null) {
            Uri uriA = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : Uri.parse(parcelableExtra.toString());
            if (uriA != null) {
                if (uriA.toString().startsWith("content://ru.oneme.app")) {
                    arrayList.add(uriA);
                    return arrayList;
                }
                if (!xpi.n(uriA, context, yi5Var)) {
                    if (qx5Var != null) {
                        uriA = a(uriA, context, qx5Var);
                    }
                    arrayList.add(uriA);
                }
            }
        }
        return arrayList;
    }

    public abstract InputFilter[] b(InputFilter[] inputFilterArr);

    public abstract boolean f();

    public abstract void g(boolean z);

    public abstract void h(boolean z);

    public abstract TransformationMethod i(TransformationMethod transformationMethod);
}
