package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.Set;
import ru.ok.android.externcalls.TracerLibraryManifest;

/* loaded from: classes.dex */
public abstract class nfi {
    public static final String[] a = {"_id", "lookup"};
    public static final String[] b = {"contact_id", "mimetype", "data2", "data3", "data5", "_id", "data1", "display_name", "photo_uri"};
    public static volatile bke c;

    public static final Set a() {
        bke bkeVar = c;
        if (bkeVar != null) {
            return bkeVar;
        }
        bke bkeVar2 = new bke();
        try {
            Iterator it = Arrays.asList(new TracerLibraryManifest(), new ru.ok.android.externcalls.sdk.audio.TracerLibraryManifest(), new neg()).iterator();
            while (it.hasNext()) {
                bkeVar2.add(it.next());
            }
            c = bkeVar2;
            return gke.a(bkeVar2);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b A[PHI: r2 r3
  0x019b: PHI (r2v5 ek8) = (r2v2 ek8), (r2v24 ek8) binds: [B:74:0x01b4, B:67:0x0199] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r3v10 android.database.Cursor) = (r3v3 android.database.Cursor), (r3v11 android.database.Cursor) binds: [B:74:0x01b4, B:67:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Collection b(android.content.Context r21, defpackage.yi5 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfi.b(android.content.Context, yi5):java.util.Collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.ContentResolver r5, android.net.Uri r6, defpackage.yi5 r7) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r6, r1)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            if (r5 != 0) goto L1b
            java.lang.String r6 = "nfi"
            java.lang.String r1 = "getVCardStringFromUri: failed to get file descriptor"
            defpackage.wqi.e(r6, r1, r0)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            if (r5 == 0) goto L4d
            r5.close()     // Catch: java.lang.Exception -> L15
        L15:
            return r0
        L16:
            r6 = move-exception
            goto L52
        L18:
            r6 = move-exception
            r1 = r0
            goto L39
        L1b:
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r7 = defpackage.gbj.h(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2e
            defpackage.gbj.d(r6)
            r5.close()     // Catch: java.lang.Exception -> L29
        L29:
            return r7
        L2a:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L52
        L2e:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
            goto L39
        L33:
            r6 = move-exception
            r5 = r0
            goto L52
        L36:
            r6 = move-exception
            r5 = r0
            r1 = r5
        L39:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "getVCardStringFromUri failed"
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L50
            y3b r7 = (defpackage.y3b) r7     // Catch: java.lang.Throwable -> L50
            r7.a(r2)     // Catch: java.lang.Throwable -> L50
            defpackage.gbj.d(r1)
            if (r5 == 0) goto L4d
            r5.close()     // Catch: java.lang.Exception -> L4d
        L4d:
            return r0
        L4e:
            r0 = r1
            goto L52
        L50:
            r6 = move-exception
            goto L4e
        L52:
            defpackage.gbj.d(r0)
            if (r5 == 0) goto L5a
            r5.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfi.c(android.content.ContentResolver, android.net.Uri, yi5):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3 */
    public static SparseArray d(Context context, List list, yi5 yi5Var) throws Throwable {
        Throwable th;
        ?? r11;
        Cursor cursorQuery;
        Exception exc;
        SparseArray sparseArray = new SparseArray(list.size());
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (contentResolver == null) {
                wqi.e("nfi", "getVCardsByPhoneContactIds failed: contentResolver is null", null);
                return sparseArray;
            }
            try {
                String strJoin = TextUtils.join(",", list);
                cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, a, "_id IN (" + strJoin + ")", null, null);
                try {
                    if (cursorQuery == null) {
                        wqi.e("nfi", "getVCardsByPhoneContactIds failed: cursor is null", null);
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                            return sparseArray;
                        }
                    } else {
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("lookup");
                        while (true) {
                            if (cursorQuery.moveToNext()) {
                                int i = cursorQuery.getInt(columnIndex);
                                String string = cursorQuery.getString(columnIndex2);
                                if (l8g.c(string)) {
                                    wqi.e("nfi", "getVCardsByPhoneContactIds failed: lookupKey is empty or null", null);
                                    if (!cursorQuery.isClosed()) {
                                        cursorQuery.close();
                                        return sparseArray;
                                    }
                                } else {
                                    String strC = c(contentResolver, Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, string), yi5Var);
                                    if (!l8g.c(strC)) {
                                        sparseArray.put(i, strC);
                                    }
                                }
                            } else if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                                return sparseArray;
                            }
                        }
                    }
                } catch (Exception e) {
                    exc = e;
                    ((y3b) yi5Var).a(new IllegalStateException("getVCardsByPhoneContactIds failed", exc));
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return sparseArray;
                }
            } catch (Exception e2) {
                cursorQuery = null;
                exc = e2;
            } catch (Throwable th2) {
                r11 = 0;
                th = th2;
                if (r11 == 0 || r11.isClosed()) {
                    throw th;
                }
                r11.close();
                throw th;
            }
            return sparseArray;
        } catch (Throwable th3) {
            th = th3;
            r11 = list;
        }
    }

    public static final seg e(String str) {
        Set setA = a();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((bke) setA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (fni.a(((seg) next).namespace(), str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder sbN = az1.n("More then one manifest found for ", str, ": ");
            sbN.append(ue3.N(arrayList, null, null, null, zx0.F0, 31));
            throw new IllegalStateException(sbN.toString().toString());
        }
        if (arrayList.size() == 1) {
            return (seg) arrayList.get(0);
        }
        try {
            String str2 = str + ".TracerLibraryManifest";
            seg segVar = (seg) Class.forName(str2).newInstance();
            if (fni.a(segVar.namespace(), str)) {
                return segVar;
            }
            throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
        } catch (Throwable th) {
            NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for ".concat(str));
            noSuchElementException.initCause(th);
            throw noSuchElementException;
        }
    }

    public abstract void f(boolean z);
}
