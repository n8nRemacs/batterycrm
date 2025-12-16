package com.facebook.soloader;

import android.util.Log;
import defpackage.cri;
import defpackage.ep5;
import defpackage.hg0;
import defpackage.n2;
import defpackage.rw5;
import defpackage.u45;
import defpackage.wy1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class a extends e {
    public final File X;
    public final int Y;
    public ep5[] a;
    public final ZipFile b;
    public final hg0 c;
    public final /* synthetic */ hg0 d;
    public final boolean o;

    public a(hg0 hg0Var, hg0 hg0Var2, boolean z) {
        this.d = hg0Var;
        this.b = new ZipFile(hg0Var.e);
        this.c = hg0Var2;
        this.o = z;
        this.X = new File(hg0Var.d.getApplicationInfo().nativeLibraryDir);
        this.Y = hg0Var.g;
    }

    public final ep5[] P() {
        ep5[] ep5VarArr = this.a;
        if (ep5VarArr != null) {
            return ep5VarArr;
        }
        ep5[] ep5VarArrY = y();
        this.a = ep5VarArrY;
        if (this.o) {
            Log.w("BackupSoSource", "Unconditonally extracting all DSOs from zip");
            return this.a;
        }
        if ((this.Y & 1) == 0) {
            Log.w("BackupSoSource", "Self-extraction preferred (PREFER_ANDROID_LIBS_DRIECTORY not set)");
            return this.a;
        }
        for (ep5 ep5Var : ep5VarArrY) {
            ZipEntry zipEntry = ep5Var.d;
            String str = (String) ep5Var.b;
            String name = zipEntry.getName();
            File file = this.X;
            File file2 = new File(file, str);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        long length = file2.length();
                        long size = zipEntry.getSize();
                        if (length != size) {
                            StringBuilder sb = new StringBuilder("Allowing consideration of ");
                            sb.append(file2);
                            sb.append(": sysdir file length is ");
                            sb.append(length);
                            Log.w("BackupSoSource", u45.i(size, ", but the file is ", " bytes long in the APK", sb));
                        } else {
                            Log.w("BackupSoSource", "Not allowing consideration of " + name + ": deferring to libdir");
                        }
                    } else {
                        Log.w("BackupSoSource", wy1.j("Allowing consideration of ", name, ": ", str, " not in system lib dir"));
                    }
                    return this.a;
                }
                cri.a("BackupSoSource", "Not allowing consideration of " + name + ": " + str + " not in lib dir.");
            } catch (IOException e) {
                StringBuilder sbL = wy1.l("Not allowing consideration of ", name, ": ", str, ", IOException when constructing path: ");
                sbL.append(e.toString());
                Log.w("BackupSoSource", sbL.toString());
            }
        }
        ep5[] ep5VarArr2 = new ep5[0];
        this.a = ep5VarArr2;
        return ep5VarArr2;
    }

    @Override // com.facebook.soloader.e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.facebook.soloader.e
    public final n2[] l() {
        return P();
    }

    @Override // com.facebook.soloader.e
    public final void w(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (ep5 ep5Var : P()) {
            InputStream inputStream = this.b.getInputStream(ep5Var.d);
            try {
                rw5 rw5Var = new rw5(ep5Var, 2, inputStream);
                inputStream = null;
                try {
                    e.c(rw5Var, bArr, file);
                    rw5Var.close();
                } finally {
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }

    public final ep5[] y() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(this.d.f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> enumerationEntries = this.b.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                int i = 0;
                while (true) {
                    if (i >= supportedAbis.length) {
                        i = -1;
                        break;
                    }
                    String str = supportedAbis[i];
                    if (str != null && strGroup.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    linkedHashSet.add(strGroup);
                    ep5 ep5Var = (ep5) map.get(strGroup2);
                    if (ep5Var == null || i < ep5Var.o) {
                        map.put(strGroup2, new ep5(strGroup2, zipEntryNextElement, i));
                    }
                }
            }
        }
        this.c.getClass();
        ep5[] ep5VarArr = (ep5[]) map.values().toArray(new ep5[map.size()]);
        Arrays.sort(ep5VarArr);
        return ep5VarArr;
    }
}
