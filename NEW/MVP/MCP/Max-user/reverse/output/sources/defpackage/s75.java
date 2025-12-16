package defpackage;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes.dex */
public final class s75 implements vx4 {
    public final int a;
    public final brf b;
    public final String c;
    public final qha d;
    public volatile xo8 e;

    public s75(int i, brf brfVar, String str, qha qhaVar) {
        this.a = i;
        this.d = qhaVar;
        this.b = brfVar;
        this.c = str;
        Object obj = null;
        this.e = new xo8(obj, obj, false, 16);
    }

    @Override // defpackage.vx4
    public final mv5 a(Object obj, String str) {
        return h().a(obj, str);
    }

    @Override // defpackage.vx4
    public final void b() {
        try {
            h().b();
        } catch (IOException e) {
            if (op5.a.h(6)) {
                op5.a.e(s75.class.getSimpleName(), "purgeUnexpectedResources", e);
            }
        }
    }

    @Override // defpackage.vx4
    public final long c(gl4 gl4Var) {
        return h().c(gl4Var);
    }

    @Override // defpackage.vx4
    public final Collection d() {
        return h().d();
    }

    @Override // defpackage.vx4
    public final hc8 e(String str, c1f c1fVar) {
        return h().e(str, c1fVar);
    }

    @Override // defpackage.vx4
    public final void f() {
        h().f();
    }

    public final void g() throws FileUtils$CreateDirectoryException {
        File file = new File((File) this.b.get(), this.c);
        try {
            obj.a(file);
            String absolutePath = file.getAbsolutePath();
            if (op5.a.h(3)) {
                op5.a.d(s75.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.e = new xo8((Object) file, (Object) new jl4(file, this.a, this.d), false, 16);
        } catch (FileUtils$CreateDirectoryException e) {
            this.d.getClass();
            throw e;
        }
    }

    public final synchronized vx4 h() {
        vx4 vx4Var;
        File file;
        xo8 xo8Var = this.e;
        if (((vx4) xo8Var.b) == null || (file = (File) xo8Var.c) == null || !file.exists()) {
            if (((vx4) this.e.b) != null && ((File) this.e.c) != null) {
                ibj.b((File) this.e.c);
            }
            g();
        }
        vx4Var = (vx4) this.e.b;
        vx4Var.getClass();
        return vx4Var;
    }

    @Override // defpackage.vx4
    public final boolean isExternal() {
        try {
            return h().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }
}
