package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class xpi {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static String a(String str) {
        if (l8g.c(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 0 && cCharAt <= 31) || cCharAt == '\"' || cCharAt == '*' || cCharAt == '/' || cCharAt == ':' || cCharAt == '<' || cCharAt == '\\' || cCharAt == '|' || cCharAt == 127 || cCharAt == '>' || cCharAt == '?') {
                sb.append('_');
            } else {
                sb.append(cCharAt);
            }
        }
        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 255) {
            while (bytes.length > 252) {
                sb.deleteCharAt(sb.length() / 2);
                bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            }
            sb.insert(sb.length() / 2, "...");
        }
        return sb.toString();
    }

    public static void b(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, boolean z) {
        if (androidXLifecycleHandlerImpl.getI1().d) {
            return;
        }
        androidXLifecycleHandlerImpl.getI1().d = true;
        Activity activity = androidXLifecycleHandlerImpl.getI1().b;
        if (activity != null) {
            Iterator it = j(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).p(activity, z);
            }
        }
    }

    public static String c(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 2) {
            return null;
        }
        String str = pathSegments.get(0);
        if (l8g.c(str) || !str.equalsIgnoreCase("external_files")) {
            return null;
        }
        Uri.Builder builderBuildUpon = Uri.fromFile(Environment.getExternalStorageDirectory()).buildUpon();
        for (int i = 1; i < pathSegments.size(); i++) {
            builderBuildUpon.appendPath(pathSegments.get(i));
        }
        String path = builderBuildUpon.build().getPath();
        if (pbj.c(path)) {
            return path;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0144 A[EXC_TOP_SPLITTER, PHI: r3
  0x0144: PHI (r3v10 ??) = (r3v25 ??), (r3v26 ??) binds: [B:70:0x0167, B:60:0x0142] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4 A[EXC_TOP_SPLITTER, PHI: r3
  0x01c4: PHI (r3v16 android.os.ParcelFileDescriptor) = (r3v15 android.os.ParcelFileDescriptor), (r3v18 android.os.ParcelFileDescriptor) binds: [B:106:0x01e1, B:98:0x01c2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9 A[Catch: all -> 0x0193, Exception -> 0x0198, TRY_LEAVE, TryCatch #4 {Exception -> 0x0198, blocks: (B:85:0x018e, B:91:0x019d, B:93:0x01a9, B:97:0x01bd), top: B:133:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd A[Catch: all -> 0x0193, Exception -> 0x0198, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0198, blocks: (B:85:0x018e, B:91:0x019d, B:93:0x01a9, B:97:0x01bd), top: B:133:0x018e }] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [long] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.q34 d(android.content.Context r13, java.lang.String r14, defpackage.hx5 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpi.d(android.content.Context, java.lang.String, hx5):q34");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "file://"
            java.lang.String r1 = java.util.Arrays.toString(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r12, r1}
            java.lang.String r2 = "xpi"
            java.lang.String r3 = "getDataColumn: uri = %s, selection = %s, selection args = %s"
            defpackage.wqi.c(r2, r3, r1)
            java.lang.String r1 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r1}
            r9 = 0
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L72
            r8 = 0
            r4 = r11
            r6 = r12
            r7 = r13
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            if (r10 == 0) goto L65
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            if (r11 == 0) goto L65
            int r11 = r10.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            boolean r12 = defpackage.l8g.c(r11)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            if (r12 == 0) goto L3e
            r10.close()
            return r9
        L3e:
            java.lang.String r12 = "/"
            boolean r12 = r11.startsWith(r12)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            if (r12 == 0) goto L4a
            r10.close()
            return r11
        L4a:
            boolean r12 = r11.startsWith(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            if (r12 == 0) goto L61
            java.lang.String r12 = ""
            java.lang.String r11 = r11.replace(r0, r12)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5e
            r10.close()
            return r11
        L5a:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto L88
        L5e:
            r0 = move-exception
            r11 = r0
            goto L75
        L61:
            r10.close()
            return r9
        L65:
            if (r10 == 0) goto L87
            r10.close()
            return r9
        L6b:
            r0 = move-exception
            r11 = r0
            goto L88
        L6e:
            r0 = move-exception
        L6f:
            r11 = r0
            r10 = r9
            goto L75
        L72:
            r0 = move-exception
            r4 = r11
            goto L6f
        L75:
            java.lang.String r12 = "getDataColumn: error for uri = %s, e = %s"
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r11}     // Catch: java.lang.Throwable -> L5a
            defpackage.wqi.f(r2, r12, r11)     // Catch: java.lang.Throwable -> L5a
            if (r10 == 0) goto L87
            r10.close()
        L87:
            return r9
        L88:
            if (r9 == 0) goto L8d
            r9.close()
        L8d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpi.e(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String f(Map map) {
        if (map != null && !map.isEmpty()) {
            String str = null;
            for (Map.Entry entry : map.entrySet()) {
                int iK = k((String) entry.getKey());
                if (iK != 0 && (str == null || iK > k(str))) {
                    str = (String) entry.getKey();
                }
            }
            if (str != null) {
                return (String) map.get(str);
            }
        }
        return null;
    }

    public static String g(Uri uri) {
        String string = uri.toString();
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        int iIndexOf = string.indexOf(path);
        if (iIndexOf == -1) {
            String encodedPath = uri.getEncodedPath();
            iIndexOf = encodedPath != null ? string.indexOf(encodedPath) : -1;
        }
        if (iIndexOf != -1) {
            return string.substring(iIndexOf);
        }
        return null;
    }

    public static String h(String str) {
        String mimeTypeFromExtension;
        try {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return null;
            }
            String strSubstring = str.substring(iLastIndexOf + 1);
            mimeTypeFromExtension = singleton.getMimeTypeFromExtension(strSubstring.toLowerCase());
            try {
                return (!l8g.c(mimeTypeFromExtension) || l8g.c(strSubstring)) ? mimeTypeFromExtension : "application/".concat(strSubstring);
            } catch (Exception e) {
                e = e;
                wqi.e("xpi", "getMimeTypeFromFileName: failed, e: " + e.toString(), null);
                return mimeTypeFromExtension;
            }
        } catch (Exception e2) {
            e = e2;
            mimeTypeFromExtension = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #2 {Exception -> 0x0115, blocks: (B:45:0x00c5, B:47:0x00cb, B:50:0x00d9, B:52:0x00fa, B:56:0x0119, B:58:0x0125, B:60:0x013e, B:62:0x014a, B:66:0x0157, B:68:0x016e, B:70:0x017a, B:93:0x01d5, B:90:0x01cd, B:91:0x01d0, B:92:0x01d3, B:77:0x01a8, B:80:0x01b2, B:83:0x01bc, B:95:0x01e2, B:97:0x01ee, B:99:0x01f8, B:101:0x0202, B:104:0x021c, B:106:0x0230, B:108:0x023c), top: B:114:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2 A[Catch: Exception -> 0x0115, TryCatch #2 {Exception -> 0x0115, blocks: (B:45:0x00c5, B:47:0x00cb, B:50:0x00d9, B:52:0x00fa, B:56:0x0119, B:58:0x0125, B:60:0x013e, B:62:0x014a, B:66:0x0157, B:68:0x016e, B:70:0x017a, B:93:0x01d5, B:90:0x01cd, B:91:0x01d0, B:92:0x01d3, B:77:0x01a8, B:80:0x01b2, B:83:0x01bc, B:95:0x01e2, B:97:0x01ee, B:99:0x01f8, B:101:0x0202, B:104:0x021c, B:106:0x0230, B:108:0x023c), top: B:114:0x00c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(android.content.Context r14, android.net.Uri r15, defpackage.hx5 r16) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpi.i(android.content.Context, android.net.Uri, hx5):java.lang.String");
    }

    public static List j(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl) {
        return ue3.d0(androidXLifecycleHandlerImpl.getI1().j.values());
    }

    public static int k(String str) {
        if (l8g.c(str) || (!str.startsWith("MP4") && !str.startsWith("mp4"))) {
            return 0;
        }
        try {
            return Integer.parseInt(str.split("_")[1]);
        } catch (Exception e) {
            wqi.e("xpi", "failed to parse mp4 video key: ".concat(str), e);
            return 0;
        }
    }

    public static void l(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl) {
        Activity activity = androidXLifecycleHandlerImpl.getI1().b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(androidXLifecycleHandlerImpl);
            e48.a.remove(activity);
            b(androidXLifecycleHandlerImpl, false);
            androidXLifecycleHandlerImpl.getI1().b = null;
        }
        androidXLifecycleHandlerImpl.getI1().j.clear();
    }

    public static void m(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, String str, String[] strArr, int i) {
        if (!androidXLifecycleHandlerImpl.getI1().e) {
            androidXLifecycleHandlerImpl.getI1().i.add(new cqb(str, strArr, i));
        } else {
            androidXLifecycleHandlerImpl.getI1().g.put(i, str);
            androidXLifecycleHandlerImpl.h0(strArr, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (r0.contains(r10.getFilesDir().getParent()) == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(android.net.Uri r9, android.content.Context r10, defpackage.yi5 r11) throws java.io.IOException, android.system.ErrnoException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpi.n(android.net.Uri, android.content.Context, yi5):boolean");
    }

    public static void o(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl) {
        if (androidXLifecycleHandlerImpl.getI1().f) {
            return;
        }
        androidXLifecycleHandlerImpl.getI1().f = true;
        Iterator it = j(androidXLifecycleHandlerImpl).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).G();
        }
    }

    public static Uri p(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !"file".equalsIgnoreCase(scheme)) {
            return null;
        }
        String strG = g(uri);
        File file = strG != null ? new File(strG) : null;
        if (file == null || !file.exists()) {
            return null;
        }
        return Uri.fromFile(file);
    }

    public static Uri q(String str) {
        if (l8g.c(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        Uri uriP = p(uri);
        return uriP != null ? uriP : uri;
    }
}
