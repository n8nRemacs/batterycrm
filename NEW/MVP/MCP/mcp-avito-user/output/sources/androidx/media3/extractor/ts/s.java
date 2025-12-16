package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.extractor.ts.D;

/* compiled from: PassthroughSectionPayloadReader.java */
@J
/* loaded from: classes.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public C23108t f51795a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.common.util.G f51796b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.media3.extractor.J f51797c;

    public s(String str) {
        C23108t.b bVar = new C23108t.b();
        bVar.f47787k = str;
        this.f51795a = bVar.a();
    }

    @Override // androidx.media3.extractor.ts.x
    public final void b(androidx.media3.common.util.G g12, androidx.media3.extractor.r rVar, D.e eVar) {
        this.f51796b = g12;
        eVar.a();
        eVar.b();
        androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 5);
        this.f51797c = jC2;
        jC2.b(this.f51795a);
    }

    @Override // androidx.media3.extractor.ts.x
    public final void c(androidx.media3.common.util.z zVar) {
        long jC2;
        long j12;
        C23110a.h(this.f51796b);
        int i12 = M.f47887a;
        androidx.media3.common.util.G g12 = this.f51796b;
        synchronized (g12) {
            try {
                long j13 = g12.f47884c;
                jC2 = j13 != -9223372036854775807L ? j13 + g12.f47883b : g12.c();
            } finally {
            }
        }
        androidx.media3.common.util.G g13 = this.f51796b;
        synchronized (g13) {
            j12 = g13.f47883b;
        }
        if (jC2 == -9223372036854775807L || j12 == -9223372036854775807L) {
            return;
        }
        C23108t c23108t = this.f51795a;
        if (j12 != c23108t.f47761q) {
            C23108t.b bVarA = c23108t.a();
            bVarA.f47791o = j12;
            C23108t c23108tA = bVarA.a();
            this.f51795a = c23108tA;
            this.f51797c.b(c23108tA);
        }
        int iA2 = zVar.a();
        this.f51797c.e(iA2, zVar);
        this.f51797c.f(jC2, 1, iA2, 0, null);
    }
}
