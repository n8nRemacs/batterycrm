package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;
import java.util.List;

/* compiled from: SeiReader.java */
@J
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final List<C23108t> f51844a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.extractor.J[] f51845b;

    public z(List<C23108t> list) {
        this.f51844a = list;
        this.f51845b = new androidx.media3.extractor.J[list.size()];
    }

    public final void a(androidx.media3.extractor.r rVar, D.e eVar) {
        int i12 = 0;
        while (true) {
            androidx.media3.extractor.J[] jArr = this.f51845b;
            if (i12 >= jArr.length) {
                return;
            }
            eVar.a();
            eVar.b();
            androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 3);
            C23108t c23108t = this.f51844a.get(i12);
            String str = c23108t.f47757m;
            C23110a.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c23108t.f47746b;
            if (str2 == null) {
                eVar.b();
                str2 = eVar.f51542e;
            }
            C23108t.b bVar = new C23108t.b();
            bVar.f47777a = str2;
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
