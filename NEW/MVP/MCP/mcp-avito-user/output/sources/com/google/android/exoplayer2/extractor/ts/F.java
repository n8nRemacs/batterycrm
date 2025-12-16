package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.C36513c;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;
import java.util.List;

/* compiled from: UserDataReader.java */
/* loaded from: classes6.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    public final List<I> f345041a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.extractor.A[] f345042b;

    public F(List<I> list) {
        this.f345041a = list;
        this.f345042b = new com.google.android.exoplayer2.extractor.A[list.size()];
    }

    public final void a(long j12, com.google.android.exoplayer2.util.F f12) {
        if (f12.a() < 9) {
            return;
        }
        int iD2 = f12.d();
        int iD3 = f12.d();
        int iR2 = f12.r();
        if (iD2 == 434 && iD3 == 1195456820 && iR2 == 3) {
            C36513c.b(j12, f12, this.f345042b);
        }
    }

    public final void b(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        int i12 = 0;
        while (true) {
            com.google.android.exoplayer2.extractor.A[] aArr = this.f345042b;
            if (i12 >= aArr.length) {
                return;
            }
            eVar.a();
            eVar.b();
            com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 3);
            I i13 = this.f345041a.get(i12);
            String str = i13.f343476m;
            C36585a.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            I.b bVar = new I.b();
            eVar.b();
            bVar.f343494a = eVar.f345040e;
            bVar.f343504k = str;
            bVar.f343497d = i13.f343468e;
            bVar.f343496c = i13.f343467d;
            bVar.f343492C = i13.f343462E;
            bVar.f343506m = i13.f343478o;
            aC2.a(bVar.a());
            aArr[i12] = aC2;
            i12++;
        }
    }
}
