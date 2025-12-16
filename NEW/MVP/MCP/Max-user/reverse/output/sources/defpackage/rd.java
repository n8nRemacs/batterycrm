package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class rd implements s97 {
    public static final Pattern d = Pattern.compile("^bytes \\*/([0-9]+)");
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final k18 b;
    public final tgg c;

    static {
        Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    }

    public rd(k18 k18Var, tgg tggVar) {
        this.b = k18Var;
        this.c = tggVar;
    }

    public static boolean c(rd rdVar, ood oodVar, long j) {
        if (oodVar.d != 416) {
            return false;
        }
        String strA = oodVar.X.a("Content-Range");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return false;
        }
        Matcher matcher = d.matcher(strA);
        return matcher.find() && ((long) Integer.parseInt(matcher.group(1))) == j;
    }

    public static File d(rd rdVar, File file, File file2, String str) throws Throwable {
        File fileS;
        try {
            if (!l8g.c(str)) {
                String name = file2.getName();
                int iG = vmf.G(name, '.', 0, 6);
                if (iG >= 0) {
                    name = name.substring(0, iG);
                }
                file2 = new File(file2.getParentFile(), name + "." + str);
            }
            fileS = b6a.S(file2.getParentFile(), file2.getName());
        } catch (IOException e) {
            e = e;
            fileS = null;
        }
        try {
            gbj.e(file, fileS);
            file.delete();
            return fileS;
        } catch (IOException e2) {
            e = e2;
            wqi.e("rd", e.getMessage(), null);
            return fileS;
        }
    }

    public static void e(rd rdVar, qd qdVar, String str) {
        synchronized (qdVar.a) {
            qdVar.a.clear();
        }
        rdVar.a.remove(str);
    }

    public static void f(rd rdVar, qd qdVar, File file) {
        file.delete();
        synchronized (qdVar.a) {
            try {
                Iterator it = qdVar.a.iterator();
                while (it.hasNext()) {
                    try {
                        ((p97) it.next()).d();
                    } catch (Throwable th) {
                        wqi.e("rd", "failed to notify listener on url expired", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static File g(File file, String str) {
        return new File(file.getParent(), file.getName() + "_part_" + str);
    }

    @Override // defpackage.s97
    public final void a(File file, String str) {
        qd qdVar = (qd) this.a.get(g(file, str).getAbsolutePath());
        if (qdVar != null) {
            qdVar.b.d();
            synchronized (qdVar.a) {
                try {
                    Iterator it = qdVar.a.iterator();
                    while (it.hasNext()) {
                        ((p97) it.next()).c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.s97
    public final boolean b(String str, File file, p97 p97Var, String str2) {
        wqi.c("rd", "downloadFile url = %s", str);
        File fileG = g(file, str2);
        if (this.a.containsKey(fileG.getAbsolutePath())) {
            qd qdVar = (qd) this.a.get(fileG.getAbsolutePath());
            if (qdVar == null) {
                return true;
            }
            synchronized (qdVar.a) {
                for (int i = 0; i < qdVar.a.size(); i++) {
                    try {
                        if (((p97) qdVar.a.get(i)).a().equals(p97Var.a())) {
                            wqi.c("rd", "file already downloading in listener context, do nothing return false", new Object[0]);
                            return false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                wqi.c("rd", "file already downloading add listener and return true", new Object[0]);
                qdVar.a.add(p97Var);
                return true;
            }
        }
        try {
            kw6 kw6Var = new kw6();
            kw6Var.m(str);
            kw6Var.l(UUID.randomUUID().toString());
            if (fileG.exists() && fileG.length() > 0) {
                wqi.c("rd", "resume download file, downloaded size: " + fileG.length(), new Object[0]);
                ((i17) kw6Var.c).a("Range", "bytes=" + fileG.length() + "-");
            }
            zmd zmdVarA = kw6Var.a();
            mbd mbdVarB = ((sua) this.b.getValue()).b(zmdVarA);
            qd qdVar2 = new qd(mbdVarB);
            synchronized (qdVar2.a) {
                qdVar2.a.add(p97Var);
                this.a.put(fileG.getAbsolutePath(), qdVar2);
            }
            hk4 hk4Var = new hk4();
            hk4Var.o = this;
            hk4Var.a = zmdVarA;
            hk4Var.b = qdVar2;
            hk4Var.c = fileG;
            hk4Var.d = file;
            mbdVarB.e(hk4Var);
            wqi.c("rd", "start file download", new Object[0]);
            return true;
        } catch (IllegalArgumentException unused) {
            p97Var.b();
            fileG.delete();
            return false;
        }
    }
}
