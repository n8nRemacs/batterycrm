package net.bytebuddy.jar.asm;

import java.io.IOException;

/* compiled from: FieldVisitor.java */
/* loaded from: classes7.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f418234a;

    /* renamed from: b, reason: collision with root package name */
    public m f418235b;

    public m(int i12, m mVar) throws IOException {
        if (i12 != 589824 && i12 != 524288 && i12 != 458752 && i12 != 393216 && i12 != 327680 && i12 != 262144 && i12 != 17432576) {
            throw new IllegalArgumentException(AK.c.g(i12, "Unsupported api "));
        }
        if (i12 == 17432576) {
            i.a(this);
        }
        this.f418234a = i12;
        this.f418235b = mVar;
    }

    public AbstractC44388a a(String str, boolean z12) {
        m mVar = this.f418235b;
        if (mVar != null) {
            return mVar.a(str, z12);
        }
        return null;
    }

    public void b(C44390c c44390c) {
        m mVar = this.f418235b;
        if (mVar != null) {
            mVar.b(c44390c);
        }
    }

    public void c() {
        m mVar = this.f418235b;
        if (mVar != null) {
            mVar.c();
        }
    }

    public AbstractC44388a d(int i12, C c12, String str, boolean z12) {
        if (this.f418234a < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        m mVar = this.f418235b;
        if (mVar != null) {
            return mVar.d(i12, c12, str, z12);
        }
        return null;
    }
}
