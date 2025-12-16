package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.util.U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TtmlSubtitle.java */
/* loaded from: classes6.dex */
final class h implements com.google.android.exoplayer2.text.h {

    /* renamed from: b, reason: collision with root package name */
    public final d f347062b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f347063c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, g> f347064d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f347065e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f347066f;

    public h(d dVar, HashMap map, HashMap map2, HashMap map3) {
        this.f347062b = dVar;
        this.f347065e = map2;
        this.f347066f = map3;
        this.f347064d = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i12 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i12] = it.next().longValue();
            i12++;
        }
        this.f347063c = jArr;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final long a(int i12) {
        return this.f347063c[i12];
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int b() {
        return this.f347063c.length;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int c(long j12) {
        long[] jArr = this.f347063c;
        int iB2 = U.b(jArr, j12, false);
        if (iB2 < jArr.length) {
            return iB2;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final List<com.google.android.exoplayer2.text.a> d(long j12) {
        d dVar = this.f347062b;
        ArrayList arrayList = new ArrayList();
        dVar.g(j12, dVar.f347027h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j12, false, dVar.f347027h, treeMap);
        HashMap map = this.f347065e;
        dVar.h(j12, this.f347064d, map, dVar.f347027h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.f347066f.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) map.get(pair.first);
                eVar.getClass();
                a.c cVar = new a.c();
                cVar.f346735b = bitmapDecodeByteArray;
                cVar.f346741h = eVar.f347034b;
                cVar.f346742i = 0;
                cVar.f346738e = eVar.f347035c;
                cVar.f346739f = 0;
                cVar.f346740g = eVar.f347037e;
                cVar.f346745l = eVar.f347038f;
                cVar.f346746m = eVar.f347039g;
                cVar.f346749p = eVar.f347042j;
                arrayList2.add(cVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) map.get(entry.getKey());
            eVar2.getClass();
            a.c cVar2 = (a.c) entry.getValue();
            CharSequence charSequence = cVar2.f346734a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i12 = 0; i12 < spannableStringBuilder.length(); i12++) {
                if (spannableStringBuilder.charAt(i12) == ' ') {
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (i14 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i14) == ' ') {
                        i14++;
                    }
                    int i15 = i14 - i13;
                    if (i15 > 0) {
                        spannableStringBuilder.delete(i12, i15 + i12);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == '\n') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == ' ') {
                        spannableStringBuilder.delete(i17, i16 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i18 = 0; i18 < spannableStringBuilder.length() - 1; i18++) {
                if (spannableStringBuilder.charAt(i18) == ' ') {
                    int i19 = i18 + 1;
                    if (spannableStringBuilder.charAt(i19) == '\n') {
                        spannableStringBuilder.delete(i18, i19);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            cVar2.f346738e = eVar2.f347035c;
            cVar2.f346739f = eVar2.f347036d;
            cVar2.f346740g = eVar2.f347037e;
            cVar2.f346741h = eVar2.f347034b;
            cVar2.f346745l = eVar2.f347038f;
            cVar2.f346744k = eVar2.f347041i;
            cVar2.f346743j = eVar2.f347040h;
            cVar2.f346749p = eVar2.f347042j;
            arrayList2.add(cVar2.a());
        }
        return arrayList2;
    }
}
