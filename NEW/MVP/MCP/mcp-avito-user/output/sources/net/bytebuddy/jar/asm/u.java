package net.bytebuddy.jar.asm;

import java.io.IOException;

/* compiled from: ModuleVisitor.java */
/* loaded from: classes7.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public final u f418335a;

    public u(int i12, u uVar) throws IOException {
        if (i12 != 589824 && i12 != 524288 && i12 != 458752 && i12 != 393216 && i12 != 327680 && i12 != 262144 && i12 != 17432576) {
            throw new IllegalArgumentException(AK.c.g(i12, "Unsupported api "));
        }
        if (i12 == 17432576) {
            i.a(this);
        }
        this.f418335a = uVar;
    }

    public void a() {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void b(String str, int i12, String... strArr) {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.b(str, i12, strArr);
        }
    }

    public void c(String str) {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.c(str);
        }
    }

    public void d(String str, int i12, String... strArr) {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.d(str, i12, strArr);
        }
    }

    public void e(String str) {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.e(str);
        }
    }

    public void f(String str, String... strArr) {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.f(str, strArr);
        }
    }

    public void g(int i12, String str, String str2) {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.g(i12, str, str2);
        }
    }

    public void h(String str) {
        u uVar = this.f418335a;
        if (uVar != null) {
            uVar.h(str);
        }
    }
}
