package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.offline.m;
import com.google.android.exoplayer2.offline.q;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.playlist.g;
import com.google.android.exoplayer2.source.hls.playlist.h;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.util.S;
import com.google.common.collect.AbstractC37401r1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: HlsDownloader.java */
/* loaded from: classes6.dex */
public final class a extends q<h> {
    public a() {
        throw null;
    }

    public a(O o12, a.d dVar, Executor executor) {
        super(o12, new HlsPlaylistParser(), dVar, executor);
    }

    public static void i(f fVar, f.e eVar, HashSet hashSet, ArrayList arrayList) {
        long j12 = fVar.f346472h + eVar.f346498f;
        String str = fVar.f346530a;
        String str2 = eVar.f346500h;
        if (str2 != null) {
            Uri uriD = S.d(str, str2);
            if (hashSet.add(uriD)) {
                arrayList.add(new q.b(j12, q.c(uriD)));
            }
        }
        arrayList.add(new q.b(j12, new p(S.d(str, eVar.f346494b), eVar.f346502j, eVar.f346503k)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.offline.q
    public final ArrayList e(com.google.android.exoplayer2.upstream.cache.a aVar, m mVar, boolean z12) throws IOException {
        h hVar = (h) mVar;
        ArrayList arrayList = new ArrayList();
        if (hVar instanceof g) {
            List<Uri> list = ((g) hVar).f346511d;
            for (int i12 = 0; i12 < list.size(); i12++) {
                arrayList.add(q.c(list.get(i12)));
            }
        } else {
            arrayList.add(q.c(Uri.parse(hVar.f346530a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            arrayList2.add(new q.b(0L, pVar));
            try {
                f fVar = (f) d(aVar, pVar, z12);
                AbstractC37401r1 abstractC37401r1 = fVar.f346482r;
                f.e eVar = null;
                for (int i13 = 0; i13 < abstractC37401r1.size(); i13++) {
                    f.e eVar2 = (f.e) abstractC37401r1.get(i13);
                    f.e eVar3 = eVar2.f346495c;
                    if (eVar3 != null && eVar3 != eVar) {
                        i(fVar, eVar3, hashSet, arrayList2);
                        eVar = eVar3;
                    }
                    i(fVar, eVar2, hashSet, arrayList2);
                }
            } catch (IOException e12) {
                if (!z12) {
                    throw e12;
                }
            }
        }
        return arrayList2;
    }
}
