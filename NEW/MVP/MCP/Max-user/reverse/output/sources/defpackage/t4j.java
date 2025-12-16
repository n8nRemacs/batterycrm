package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t4j {
    public static n9i a(boolean z, String[] strArr, y6d y6dVar) {
        String str = z ? "m=audio " : "m=video ";
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (strArr[i].startsWith(str)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            y6dVar.log("CodecPrefUtil", "parseMSection: didn't find section: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        n9i n9iVarA = n9i.a(i, strArr[i]);
        if (n9iVarA == null) {
            y6dVar.log("CodecPrefUtil", "parseMSection: failed to parse line: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        while (true) {
            i++;
            if (i >= strArr.length || strArr[i].startsWith("m=")) {
                break;
            }
            n9iVarA.e(i, strArr[i]);
        }
        return n9iVarA;
    }

    public static void b(b7d b7dVar, y6d y6dVar, String str) {
        b7dVar.log(hcf.callPreferH264Sdp, "fail", (String) null);
        y6dVar.log("CodecPrefUtil", str);
    }

    public static String c(String str, String str2, String str3, b7d b7dVar, y6d y6dVar) {
        int i;
        String string;
        aqc aqcVar;
        int iIndexOf;
        int i2;
        String strSubstring;
        String[] strArrSplit = str.split("\r\n");
        int i3 = 0;
        while (true) {
            if (i3 >= strArrSplit.length) {
                i3 = -1;
                break;
            }
            if (strArrSplit[i3].startsWith("m=audio")) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            b(b7dVar, y6dVar, "failed to find m=audio line in sdp");
            return str;
        }
        n9i n9iVarA = n9i.a(i3, strArrSplit[i3]);
        if (n9iVarA == null) {
            b(b7dVar, y6dVar, "failed to parse m=audio line");
            return str;
        }
        for (int i4 = i3 + 1; i4 < strArrSplit.length && !strArrSplit[i4].startsWith("m=audio"); i4++) {
            n9iVarA.e(i4, strArrSplit[i4]);
        }
        if (n9iVarA.b("opus").isEmpty()) {
            b(b7dVar, y6dVar, "failed to find desired codec");
            return str;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListB = n9iVarA.b("opus");
        int size = arrayListB.size();
        int i5 = 0;
        String str4 = null;
        String str5 = null;
        while (i5 < size) {
            Object obj = arrayListB.get(i5);
            i5++;
            k9i k9iVar = (k9i) obj;
            String str6 = k9iVar.a;
            ArrayList arrayList2 = k9iVar.c;
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList2.get(i6);
                int i7 = i6 + 1;
                String str7 = (String) obj2;
                arrayList.add(str7);
                if (str7.startsWith("a=fmtp:")) {
                    str5 = str7;
                }
                i6 = i7;
            }
            str4 = str6;
        }
        if (str4 == null) {
            b(b7dVar, y6dVar, "failed to find desired lines");
            return str;
        }
        if (str5 != null) {
            if (str5.startsWith("a=fmtp:") && (iIndexOf = str5.indexOf(32, 6)) >= 0) {
                String strSubstring2 = str5.substring(0, iIndexOf);
                String strSubstring3 = str5.substring(iIndexOf + 1);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String[] strArrSplit2 = strSubstring3.split(";");
                int length = strArrSplit2.length;
                int i8 = 0;
                while (i8 < length) {
                    String[] strArr = strArrSplit2;
                    String strTrim = strArrSplit2[i8].trim();
                    int i9 = length;
                    int iIndexOf2 = strTrim.indexOf(61);
                    if (iIndexOf2 < 0) {
                        i2 = i8;
                        strSubstring = null;
                    } else {
                        i2 = i8;
                        String strSubstring4 = strTrim.substring(0, iIndexOf2);
                        strSubstring = strTrim.substring(iIndexOf2 + 1);
                        strTrim = strSubstring4;
                    }
                    linkedHashMap.put(strTrim, strSubstring);
                    i8 = i2 + 1;
                    length = i9;
                    strArrSplit2 = strArr;
                }
                i = 0;
                aqcVar = new aqc(strSubstring2, linkedHashMap);
            } else {
                aqcVar = null;
                i = 0;
            }
            if (aqcVar == null || !aqcVar.b(str2, str3, b7dVar, y6dVar)) {
                return str;
            }
            string = aqcVar.toString();
        } else {
            i = 0;
            string = null;
        }
        StringBuilder sb = new StringBuilder();
        if (string == null) {
            int i10 = i;
            while (i10 < strArrSplit.length) {
                String str8 = strArrSplit[i10];
                sb.append(str8);
                sb.append("\r\n");
                i10++;
                int i11 = i10 < strArrSplit.length ? 1 : i;
                if (arrayList.contains(str8) && (i11 == 0 || !arrayList.contains(strArrSplit[i10]))) {
                    aqc aqcVar2 = new aqc("a=fmtp:".concat(str4), null);
                    if (aqcVar2.b(str2, str3, b7dVar, y6dVar)) {
                        sb.append(aqcVar2);
                        sb.append("\r\n");
                    }
                }
            }
        } else {
            int length2 = strArrSplit.length;
            while (i < length2) {
                String str9 = strArrSplit[i];
                if (str9.equals(str5)) {
                    sb.append(string);
                } else {
                    sb.append(str9);
                }
                sb.append("\r\n");
                i++;
            }
        }
        return sb.toString();
    }

    public static void d(String str, y6d y6dVar) {
        String[] strArrSplit = str.split("\r\n");
        n9i n9iVarA = a(true, strArrSplit, y6dVar);
        if (n9iVarA == null) {
            y6dVar.log("CodecPrefUtil", "dumpCodecs: failed to parse m=audio line");
        } else {
            y6dVar.log("CodecPrefUtil", "dumpCodecs: m=audio section priority:");
            Iterator it = n9iVarA.d.entrySet().iterator();
            while (it.hasNext()) {
                y6dVar.log("CodecPrefUtil", "dumpCodecs: " + ((k9i) ((Map.Entry) it.next()).getValue()).b);
            }
        }
        n9i n9iVarA2 = a(false, strArrSplit, y6dVar);
        if (n9iVarA2 == null) {
            y6dVar.log("CodecPrefUtil", "dumpCodecs: failed to parse m=video line");
            return;
        }
        y6dVar.log("CodecPrefUtil", "dumpCodecs: m=video section priority:");
        Iterator it2 = n9iVarA2.d.entrySet().iterator();
        while (it2.hasNext()) {
            y6dVar.log("CodecPrefUtil", "dumpCodecs: " + ((k9i) ((Map.Entry) it2.next()).getValue()).b);
        }
    }

    public static final long e(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public static String f(String str, List list, b7d b7dVar, y6d y6dVar) {
        String[] strArrSplit = str.split("\r\n");
        int i = 0;
        while (true) {
            if (i >= strArrSplit.length) {
                i = -1;
                break;
            }
            if (strArrSplit[i].startsWith("m=audio")) {
                break;
            }
            i++;
        }
        if (i == -1) {
            b(b7dVar, y6dVar, "failed to find m=audio line in sdp");
            return str;
        }
        n9i n9iVarA = n9i.a(i, strArrSplit[i]);
        if (n9iVarA == null) {
            b(b7dVar, y6dVar, "failed to parse m=audio line");
            return str;
        }
        int i2 = n9iVarA.c;
        for (int i3 = i + 1; i3 < strArrSplit.length && !strArrSplit[i3].startsWith("m=audio"); i3++) {
            n9iVarA.e(i3, strArrSplit[i3]);
        }
        if (!n9iVarA.d(list)) {
            b(b7dVar, y6dVar, "failed to find any desired codecs");
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            if (i4 == i2) {
                n9iVarA.f(sb, list, false);
            } else if (i4 != i2 && !n9iVarA.a.contains(Integer.valueOf(i4))) {
                sb.append(strArrSplit[i4]);
                sb.append("\r\n");
            } else if (!z) {
                n9iVarA.c(sb, list, false);
                z = true;
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[PHI: r3
  0x0031: PHI (r3v1 n9i) = (r3v0 n9i), (r3v3 n9i), (r3v3 n9i) binds: [B:12:0x001f, B:14:0x0025, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(java.lang.String r11, boolean r12, java.util.List r13, java.util.LinkedList r14, defpackage.y6d r15) {
        /*
            java.lang.String r0 = "\r\n"
            java.lang.String[] r1 = r11.split(r0)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r13 == 0) goto L1d
            n9i r5 = a(r2, r1, r15)
            if (r5 == 0) goto L1b
            boolean r6 = r5.d(r13)
            if (r6 != 0) goto L19
            if (r12 == 0) goto L1b
        L19:
            r6 = r2
            goto L1f
        L1b:
            r6 = r4
            goto L1f
        L1d:
            r5 = r3
            goto L1b
        L1f:
            if (r14 == 0) goto L31
            n9i r3 = a(r4, r1, r15)
            if (r3 == 0) goto L31
            boolean r15 = r3.d(r14)
            if (r15 != 0) goto L2f
            if (r12 == 0) goto L31
        L2f:
            r15 = r2
            goto L32
        L31:
            r15 = r4
        L32:
            if (r6 != 0) goto L37
            if (r15 != 0) goto L37
            return r11
        L37:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r7 = r4
            r8 = r7
        L3e:
            int r9 = r1.length
            if (r4 >= r9) goto L8a
            if (r6 == 0) goto L60
            int r9 = r5.c
            if (r4 != r9) goto L4b
            r5.f(r11, r13, r12)
            goto L87
        L4b:
            if (r4 == r9) goto L59
            java.util.HashSet r9 = r5.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L60
        L59:
            if (r7 != 0) goto L87
            r5.c(r11, r13, r12)
            r7 = r2
            goto L87
        L60:
            if (r15 == 0) goto L7f
            int r9 = r3.c
            if (r4 != r9) goto L6a
            r3.f(r11, r14, r12)
            goto L87
        L6a:
            if (r4 == r9) goto L78
            java.util.HashSet r9 = r3.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L7f
        L78:
            if (r8 != 0) goto L87
            r3.c(r11, r14, r12)
            r8 = r2
            goto L87
        L7f:
            r9 = r1[r4]
            r11.append(r9)
            r11.append(r0)
        L87:
            int r4 = r4 + 1
            goto L3e
        L8a:
            java.lang.String r11 = r11.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4j.g(java.lang.String, boolean, java.util.List, java.util.LinkedList, y6d):java.lang.String");
    }
}
