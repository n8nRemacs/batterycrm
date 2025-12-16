package com.facebook.soloader;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: DirectApkSoSource.java */
@J41.d
/* renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C36426c extends D {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f340866a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f340867b;

    /* renamed from: c, reason: collision with root package name */
    public final File f340868c;

    public C36426c(Context context) {
        this.f340866a = new HashMap();
        this.f340867b = c("");
        this.f340868c = new File(context.getApplicationInfo().sourceDir);
    }

    public static HashSet c(String str) throws NoSuchMethodException, SecurityException {
        HashSet hashSet = new HashSet();
        String strA = SysUtil.Api14Utils.a();
        if (strA != null) {
            for (String str2 : strA.split(":")) {
                if (str2.contains(str + ".apk!/")) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r4 = new com.facebook.soloader.p(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        r5 = com.facebook.soloader.SoLoader.f340846a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r5 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        com.facebook.soloader.Api18TraceUtils.a("SoLoader.getElfDependencies[", r11, "]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r6 = com.facebook.soloader.v.a(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r5 = r6.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r2 >= r5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        r7 = r6[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r8 = r10.f340866a.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r8.hasNext() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (((java.util.Set) r8.next()).contains(r7) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (r7.startsWith("/") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        com.facebook.soloader.SoLoader.i(r7, null, r12 | 1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        if (com.facebook.soloader.SoLoader.f340846a != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cf, code lost:
    
        throw r11;
     */
    @Override // com.facebook.soloader.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C36426c.a(java.lang.String, int, android.os.StrictMode$ThreadPolicy):int");
    }

    @Override // com.facebook.soloader.D
    public final void b(int i12) throws IOException {
        int iIndexOf;
        int i13;
        Iterator it = this.f340867b.iterator();
        String strSubstring = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i13 = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i13);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(this.f340868c);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so") && zipEntryNextElement.getMethod() == 0) {
                            String strSubstring2 = zipEntryNextElement.getName().substring(strSubstring.length() + 1);
                            synchronized (this) {
                                try {
                                    if (!this.f340866a.containsKey(str)) {
                                        this.f340866a.put(str, new HashSet());
                                    }
                                    ((Set) this.f340866a.get(str)).add(strSubstring2);
                                } finally {
                                }
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // com.facebook.soloader.D
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[root = ");
        StringBuilder sb3 = new StringBuilder("(");
        Iterator it = this.f340867b.iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            sb3.append(", ");
        }
        sb3.append(')');
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }

    public C36426c(File file) {
        this.f340866a = new HashMap();
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        this.f340867b = c(iLastIndexOf > 0 ? name.substring(0, iLastIndexOf) : name);
        this.f340868c = file;
    }
}
