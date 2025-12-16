package net.bytebuddy.jar.asm;

import java.io.IOException;

/* compiled from: RecordComponentVisitor.java */
/* loaded from: classes7.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f418353a;

    /* renamed from: b, reason: collision with root package name */
    public x f418354b;

    public x(int i12, x xVar) throws IOException {
        if (i12 != 589824 && i12 != 524288 && i12 != 458752 && i12 != 393216 && i12 != 327680 && i12 != 262144 && i12 != 17432576) {
            throw new IllegalArgumentException(AK.c.g(i12, "Unsupported api "));
        }
        if (i12 == 17432576) {
            i.a(this);
        }
        this.f418353a = i12;
        this.f418354b = xVar;
    }

    public AbstractC44388a a(String str, boolean z12) {
        x xVar = this.f418354b;
        if (xVar != null) {
            return xVar.a(str, z12);
        }
        return null;
    }

    public void b(C44390c c44390c) {
        x xVar = this.f418354b;
        if (xVar != null) {
            xVar.b(c44390c);
        }
    }

    public void c() {
        x xVar = this.f418354b;
        if (xVar != null) {
            xVar.c();
        }
    }

    public AbstractC44388a d(int i12, C c12, String str, boolean z12) {
        x xVar = this.f418354b;
        if (xVar != null) {
            return xVar.d(i12, c12, str, z12);
        }
        return null;
    }
}
