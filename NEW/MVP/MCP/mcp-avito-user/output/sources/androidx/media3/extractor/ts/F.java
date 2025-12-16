package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.extractor.C23188g;
import androidx.media3.extractor.J;
import androidx.media3.extractor.ts.D;
import java.util.List;

/* compiled from: UserDataReader.java */
/* loaded from: classes.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    public final List<C23108t> f51543a;

    /* renamed from: b, reason: collision with root package name */
    public final J[] f51544b;

    public F(List<C23108t> list) {
        this.f51543a = list;
        this.f51544b = new J[list.size()];
    }

    public final void a(long j12, androidx.media3.common.util.z zVar) {
        if (zVar.a() < 9) {
            return;
        }
        int iG2 = zVar.g();
        int iG3 = zVar.g();
        int iU2 = zVar.u();
        if (iG2 == 434 && iG3 == 1195456820 && iU2 == 3) {
            C23188g.b(j12, zVar, this.f51544b);
        }
    }

    public final void b(androidx.media3.extractor.r rVar, D.e eVar) {
        int i12 = 0;
        while (true) {
            J[] jArr = this.f51544b;
            if (i12 >= jArr.length) {
                return;
            }
            eVar.a();
            eVar.b();
            J jC2 = rVar.c(eVar.f51541d, 3);
            C23108t c23108t = this.f51543a.get(i12);
            String str = c23108t.f47757m;
            C23110a.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C23108t.b bVar = new C23108t.b();
            eVar.b();
            bVar.f47777a = eVar.f51542e;
            bVar.f47787k = str;
            bVar.f47780d = c23108t.f47749e;
            bVar.f47779c = c23108t.f47748d;
            bVar.f47773C = c23108t.f47741E;
            bVar.f47789m = c23108t.f47759o;
            jC2.b(bVar.a());
            jArr[i12] = jC2;
            i12++;
        }
    }
}
