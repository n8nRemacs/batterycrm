package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36598n;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: BundledExtractorsAdapter.java */
/* renamed from: com.google.android.exoplayer2.source.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36539b implements D {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.extractor.g f346201a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.extractor.j f346202b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.extractor.f f346203c;

    public C36539b(com.google.android.exoplayer2.extractor.g gVar) {
        this.f346201a = gVar;
    }

    @Override // com.google.android.exoplayer2.source.D
    public final void a(long j12, long j13) {
        com.google.android.exoplayer2.extractor.j jVar = this.f346202b;
        jVar.getClass();
        jVar.a(j12, j13);
    }

    @Override // com.google.android.exoplayer2.source.D
    public final void b() {
        com.google.android.exoplayer2.extractor.j jVar = this.f346202b;
        if (jVar instanceof com.google.android.exoplayer2.extractor.mp3.d) {
            ((com.google.android.exoplayer2.extractor.mp3.d) jVar).f344724q = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.D
    public final long c() {
        com.google.android.exoplayer2.extractor.f fVar = this.f346203c;
        if (fVar != null) {
            return fVar.f344495d;
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.D
    public final void d(InterfaceC36583m interfaceC36583m, Uri uri, Map map, long j12, long j13, com.google.android.exoplayer2.extractor.l lVar) throws UnrecognizedInputFormatException {
        com.google.android.exoplayer2.extractor.j[] jVarArr;
        boolean z12;
        boolean z13 = true;
        com.google.android.exoplayer2.extractor.f fVar = new com.google.android.exoplayer2.extractor.f(interfaceC36583m, j12, j13);
        this.f346203c = fVar;
        if (this.f346202b != null) {
            return;
        }
        com.google.android.exoplayer2.extractor.g gVar = this.f346201a;
        synchronized (gVar) {
            try {
                int[] iArr = com.google.android.exoplayer2.extractor.g.f344546b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                int iA2 = C36598n.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iA2 != -1) {
                    gVar.a(iA2, arrayList);
                }
                int iB2 = C36598n.b(uri);
                if (iB2 != -1 && iB2 != iA2) {
                    gVar.a(iB2, arrayList);
                }
                for (int i12 = 0; i12 < 16; i12++) {
                    int i13 = iArr[i12];
                    if (i13 != iA2 && i13 != iB2) {
                        gVar.a(i13, arrayList);
                    }
                }
                jVarArr = (com.google.android.exoplayer2.extractor.j[]) arrayList.toArray(new com.google.android.exoplayer2.extractor.j[arrayList.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVarArr.length == 1) {
            this.f346202b = jVarArr[0];
        } else {
            int length = jVarArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                com.google.android.exoplayer2.extractor.j jVar = jVarArr[i14];
                try {
                } catch (EOFException unused) {
                    z12 = this.f346202b != null || fVar.f344495d == j12;
                } catch (Throwable th3) {
                    if (this.f346202b == null && fVar.f344495d != j12) {
                        z13 = false;
                    }
                    C36585a.d(z13);
                    fVar.f344497f = 0;
                    throw th3;
                }
                if (jVar.h(fVar)) {
                    this.f346202b = jVar;
                    fVar.f344497f = 0;
                    break;
                } else {
                    z12 = this.f346202b != null || fVar.f344495d == j12;
                    C36585a.d(z12);
                    fVar.f344497f = 0;
                    i14++;
                }
            }
            if (this.f346202b == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i15 = com.google.android.exoplayer2.util.U.f348106a;
                StringBuilder sb3 = new StringBuilder();
                for (int i16 = 0; i16 < jVarArr.length; i16++) {
                    sb3.append(jVarArr[i16].getClass().getSimpleName());
                    if (i16 < jVarArr.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new UnrecognizedInputFormatException(sb2.toString(), null, false, 1);
            }
        }
        this.f346202b.b(lVar);
    }

    @Override // com.google.android.exoplayer2.source.D
    public final int e(com.google.android.exoplayer2.extractor.w wVar) {
        com.google.android.exoplayer2.extractor.j jVar = this.f346202b;
        jVar.getClass();
        com.google.android.exoplayer2.extractor.f fVar = this.f346203c;
        fVar.getClass();
        return jVar.i(fVar, wVar);
    }

    @Override // com.google.android.exoplayer2.source.D
    public final void release() {
        com.google.android.exoplayer2.extractor.j jVar = this.f346202b;
        if (jVar != null) {
            jVar.release();
            this.f346202b = null;
        }
        this.f346203c = null;
    }
}
