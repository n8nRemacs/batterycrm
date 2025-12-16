package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: DirectorySoSource.java */
/* renamed from: com.facebook.soloader.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C36427d extends D {

    /* renamed from: a, reason: collision with root package name */
    public final File f340869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340870b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f340871c;

    public C36427d(File file, int i12) {
        this(file, i12, new String[0]);
    }

    public static void c(String str, o oVar, int i12, StrictMode.ThreadPolicy threadPolicy) {
        boolean z12 = SoLoader.f340846a;
        if (z12) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            String[] strArrA = v.a(str, oVar);
            if (z12) {
                Trace.endSection();
            }
            Arrays.toString(strArrA);
            for (String str2 : strArrA) {
                if (!str2.startsWith("/")) {
                    SoLoader.i(str2, null, i12 | 1, threadPolicy);
                }
            }
        } catch (Throwable th2) {
            if (SoLoader.f340846a) {
                Trace.endSection();
            }
            throw th2;
        }
    }

    @Override // com.facebook.soloader.D
    public int a(String str, int i12, StrictMode.ThreadPolicy threadPolicy) {
        return d(str, i12, this.f340869a, threadPolicy);
    }

    public final int d(String str, int i12, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f340847b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f340871c.contains(str)) {
            file.getCanonicalPath();
            return 0;
        }
        File file2 = new File(this.f340869a, str);
        o oVar = null;
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            file.getCanonicalPath();
            return 0;
        }
        file.getCanonicalPath();
        int i13 = i12 & 1;
        int i14 = this.f340870b;
        if (i13 != 0 && (i14 & 2) != 0) {
            return 2;
        }
        boolean z12 = (i14 & 1) != 0;
        boolean zEquals = file2.getName().equals(str);
        if (z12 || !zEquals) {
            try {
                o oVar2 = new o();
                oVar2.f340872b = file2;
                FileInputStream fileInputStream = new FileInputStream(oVar2.f340872b);
                oVar2.f340873c = fileInputStream;
                oVar2.f340874d = fileInputStream.getChannel();
                oVar = oVar2;
            } catch (Throwable th2) {
                if (oVar != null) {
                    oVar.close();
                }
                throw th2;
            }
        }
        if (z12) {
            c(str, oVar, i12, threadPolicy);
        }
        try {
            if (zEquals) {
                ((C) SoLoader.f340847b).b(i12, file2.getAbsolutePath());
                if (oVar != null) {
                    oVar.close();
                }
                return 1;
            }
            B b12 = SoLoader.f340847b;
            file2.getAbsolutePath();
            ((C) b12).getClass();
            throw new UnsupportedOperationException();
        } catch (UnsatisfiedLinkError e12) {
            if (!e12.getMessage().contains("bad ELF magic")) {
                throw e12;
            }
            if (oVar == null) {
                return 3;
            }
            oVar.close();
            return 3;
        }
    }

    @Override // com.facebook.soloader.D
    public final String toString() {
        String name;
        File file = this.f340869a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[root = ");
        sb2.append(name);
        sb2.append(" flags = ");
        return androidx.appcompat.app.r.t(sb2, this.f340870b, ']');
    }

    public C36427d(File file, int i12, String[] strArr) {
        this.f340869a = file;
        this.f340870b = i12;
        this.f340871c = Arrays.asList(strArr);
    }
}
