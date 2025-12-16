package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yc8 extends gd8 implements k8g {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, 512, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public yc8(Executor executor, py0 py0Var, ContentResolver contentResolver) {
        super(executor, py0Var);
        this.c = contentResolver;
    }

    @Override // defpackage.k8g
    public final boolean b(ynd yndVar) {
        Rect rect = f;
        return tei.a(rect.width(), rect.height(), yndVar);
    }

    @Override // defpackage.gd8
    public final ce5 d(rf7 rf7Var) {
        ynd yndVar;
        Cursor cursorQuery;
        ce5 ce5VarF;
        int iA;
        Uri uri = rf7Var.b;
        Uri uri2 = mwg.a;
        String string = uri.toString();
        if ((!string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) || (yndVar = rf7Var.h) == null || (cursorQuery = this.c.query(uri, d, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (ce5VarF = f(yndVar, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string2 = cursorQuery.getString(columnIndex);
                if (string2 != null) {
                    try {
                        iA = coi.a(new ExifInterface(string2).getAttributeInt("Orientation", 1));
                    } catch (IOException e2) {
                        if (op5.a.h(6)) {
                            op5.a.e(yc8.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string2), e2);
                        }
                    }
                    ce5VarF.c = iA;
                } else {
                    iA = 0;
                    ce5VarF.c = iA;
                }
            }
            cursorQuery.close();
            return ce5VarF;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // defpackage.gd8
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final ce5 f(ynd yndVar, long j) {
        int i;
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        Rect rect = g;
        if (tei.a(rect.width(), rect.height(), yndVar)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = tei.a(rect2.width(), rect2.height(), yndVar) ? 1 : 0;
        }
        if (i == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = cursorQueryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
