package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.C;
import com.google.android.exoplayer2.extractor.ts.C36516a;
import com.google.android.exoplayer2.extractor.ts.C36518c;
import com.google.android.exoplayer2.extractor.ts.C36520e;
import com.google.android.exoplayer2.extractor.ts.C36522g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C36598n;
import com.google.android.exoplayer2.util.O;
import com.google.android.exoplayer2.util.z;
import j.P;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultHlsExtractorFactory.java */
/* loaded from: classes6.dex */
public final class e implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f346290b = {8, 13, 11, 2, 0, 1, 7};

    public static void b(int i12, ArrayList arrayList) {
        if (com.google.common.primitives.l.e(f346290b, i12, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i12))) {
            return;
        }
        arrayList.add(Integer.valueOf(i12));
    }

    @Override // com.google.android.exoplayer2.source.hls.j
    public final m a(Uri uri, I i12, @P List list, O o12, Map map, com.google.android.exoplayer2.extractor.f fVar, com.google.android.exoplayer2.analytics.p pVar) {
        com.google.android.exoplayer2.extractor.j c36516a;
        int i13;
        boolean zH2;
        List listSingletonList;
        int i14;
        int iA2 = C36598n.a(i12.f343476m);
        List list2 = (List) map.get("Content-Type");
        int i15 = 0;
        int iA3 = C36598n.a((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
        int iB2 = C36598n.b(uri);
        int i16 = 7;
        ArrayList arrayList = new ArrayList(7);
        b(iA2, arrayList);
        b(iA3, arrayList);
        b(iB2, arrayList);
        int[] iArr = f346290b;
        for (int i17 = 0; i17 < 7; i17++) {
            b(iArr[i17], arrayList);
        }
        fVar.f344497f = 0;
        int i18 = 0;
        com.google.android.exoplayer2.extractor.j jVar = null;
        while (i18 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i18)).intValue();
            if (iIntValue == 0) {
                c36516a = new C36516a();
            } else if (iIntValue == 1) {
                c36516a = new C36518c();
            } else if (iIntValue == 2) {
                c36516a = new C36520e();
            } else if (iIntValue == i16) {
                c36516a = new com.google.android.exoplayer2.extractor.mp3.d(0L);
            } else if (iIntValue == 8) {
                Metadata metadata = i12.f343474k;
                if (metadata != null) {
                    int i19 = i15;
                    while (true) {
                        Metadata.Entry[] entryArr = metadata.f345623b;
                        if (i19 >= entryArr.length) {
                            i15 = 0;
                            break;
                        }
                        Metadata.Entry entry = entryArr[i19];
                        if (entry instanceof HlsTrackMetadataEntry) {
                            i15 = !((HlsTrackMetadataEntry) entry).f346274d.isEmpty() ? 1 : 0;
                            break;
                        }
                        i19++;
                    }
                }
                c36516a = new com.google.android.exoplayer2.extractor.mp4.e(i15 != 0 ? 4 : 0, o12, list != null ? list : Collections.emptyList());
            } else if (iIntValue != 11) {
                c36516a = iIntValue != 13 ? null : new v(i12.f343467d, o12);
            } else {
                if (list != null) {
                    i14 = 48;
                    listSingletonList = list;
                } else {
                    I.b bVar = new I.b();
                    bVar.f343504k = "application/cea-608";
                    listSingletonList = Collections.singletonList(bVar.a());
                    i14 = 16;
                }
                String str = i12.f343473j;
                if (!TextUtils.isEmpty(str)) {
                    if (z.c(str, "audio/mp4a-latm") == null) {
                        i14 |= 2;
                    }
                    if (z.c(str, "video/avc") == null) {
                        i14 |= 4;
                    }
                }
                c36516a = new C(2, o12, new C36522g(i14, listSingletonList));
            }
            c36516a.getClass();
            try {
                zH2 = c36516a.h(fVar);
                i13 = 0;
                fVar.f344497f = 0;
            } catch (EOFException unused) {
                i13 = 0;
                fVar.f344497f = 0;
                zH2 = false;
            } catch (Throwable th2) {
                fVar.f344497f = 0;
                throw th2;
            }
            if (zH2) {
                return new c(c36516a, i12, o12);
            }
            if (jVar == null && (iIntValue == iA2 || iIntValue == iA3 || iIntValue == iB2 || iIntValue == 11)) {
                jVar = c36516a;
            }
            i18++;
            i15 = i13;
            i16 = 7;
        }
        jVar.getClass();
        return new c(jVar, i12, o12);
    }
}
