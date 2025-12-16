package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;
import java.util.List;

/* compiled from: SeiReader.java */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final List<I> f345340a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.extractor.A[] f345341b;

    public z(List<I> list) {
        this.f345340a = list;
        this.f345341b = new com.google.android.exoplayer2.extractor.A[list.size()];
    }

    public final void a(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        int i12 = 0;
        while (true) {
            com.google.android.exoplayer2.extractor.A[] aArr = this.f345341b;
            if (i12 >= aArr.length) {
                return;
            }
            eVar.a();
            eVar.b();
            com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 3);
            I i13 = this.f345340a.get(i12);
            String str = i13.f343476m;
            C36585a.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = i13.f343465b;
            if (str2 == null) {
                eVar.b();
                str2 = eVar.f345040e;
            }
            I.b bVar = new I.b();
            bVar.f343494a = str2;
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
