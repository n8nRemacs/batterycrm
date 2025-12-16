package androidx.media3.extractor.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.text.a;
import androidx.media3.common.util.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TtmlSubtitle.java */
/* loaded from: classes.dex */
final class h implements androidx.media3.extractor.text.e {

    /* renamed from: b, reason: collision with root package name */
    public final d f51425b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f51426c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, g> f51427d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f51428e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f51429f;

    public h(d dVar, HashMap map, HashMap map2, HashMap map3) {
        this.f51425b = dVar;
        this.f51428e = map2;
        this.f51429f = map3;
        this.f51427d = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i12 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i12] = it.next().longValue();
            i12++;
        }
        this.f51426c = jArr;
    }

    @Override // androidx.media3.extractor.text.e
    public final long a(int i12) {
        return this.f51426c[i12];
    }

    @Override // androidx.media3.extractor.text.e
    public final int b() {
        return this.f51426c.length;
    }

    @Override // androidx.media3.extractor.text.e
    public final int c(long j12) {
        long[] jArr = this.f51426c;
        int iB2 = M.b(jArr, j12, false);
        if (iB2 < jArr.length) {
            return iB2;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.e
    public final List<androidx.media3.common.text.a> d(long j12) {
        d dVar = this.f51425b;
        ArrayList arrayList = new ArrayList();
        dVar.g(j12, dVar.f51390h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j12, false, dVar.f51390h, treeMap);
        HashMap map = this.f51428e;
        dVar.h(j12, this.f51427d, map, dVar.f51390h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.f51429f.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) map.get(pair.first);
                eVar.getClass();
                a.c cVar = new a.c();
                cVar.f47840b = bitmapDecodeByteArray;
                cVar.f47846h = eVar.f51397b;
                cVar.f47847i = 0;
                cVar.f47843e = eVar.f51398c;
                cVar.f47844f = 0;
                cVar.f47845g = eVar.f51400e;
                cVar.f47850l = eVar.f51401f;
                cVar.f47851m = eVar.f51402g;
                cVar.f47854p = eVar.f51405j;
                arrayList2.add(cVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) map.get(entry.getKey());
            eVar2.getClass();
            a.c cVar2 = (a.c) entry.getValue();
            CharSequence charSequence = cVar2.f47839a;
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
            cVar2.f47843e = eVar2.f51398c;
            cVar2.f47844f = eVar2.f51399d;
            cVar2.f47845g = eVar2.f51400e;
            cVar2.f47846h = eVar2.f51397b;
            cVar2.f47850l = eVar2.f51401f;
            cVar2.f47849k = eVar2.f51404i;
            cVar2.f47848j = eVar2.f51403h;
            cVar2.f47854p = eVar2.f51405j;
            arrayList2.add(cVar2.a());
        }
        return arrayList2;
    }
}
