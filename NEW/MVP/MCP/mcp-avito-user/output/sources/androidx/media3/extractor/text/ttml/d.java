package androidx.media3.extractor.text.ttml;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import androidx.media3.common.text.a;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TtmlNode.java */
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f51383a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f51384b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f51385c;

    /* renamed from: d, reason: collision with root package name */
    public final long f51386d;

    /* renamed from: e, reason: collision with root package name */
    public final long f51387e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final g f51388f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final String[] f51389g;

    /* renamed from: h, reason: collision with root package name */
    public final String f51390h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final String f51391i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final d f51392j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f51393k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f51394l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f51395m;

    public d(@P String str, @P String str2, long j12, long j13, @P g gVar, @P String[] strArr, String str3, @P String str4, @P d dVar) {
        this.f51383a = str;
        this.f51384b = str2;
        this.f51391i = str4;
        this.f51388f = gVar;
        this.f51389g = strArr;
        this.f51385c = str2 != null;
        this.f51386d = j12;
        this.f51387e = j13;
        str3.getClass();
        this.f51390h = str3;
        this.f51392j = dVar;
        this.f51393k = new HashMap<>();
        this.f51394l = new HashMap<>();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a.c cVar = new a.c();
            cVar.f47839a = new SpannableStringBuilder();
            treeMap.put(str, cVar);
        }
        CharSequence charSequence = ((a.c) treeMap.get(str)).f47839a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i12) {
        ArrayList arrayList = this.f51395m;
        if (arrayList != null) {
            return (d) arrayList.get(i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f51395m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z12) {
        String str = this.f51383a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z12 || zEquals || (zEquals2 && this.f51391i != null)) {
            long j12 = this.f51386d;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
            long j13 = this.f51387e;
            if (j13 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j13));
            }
        }
        if (this.f51395m == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f51395m.size(); i12++) {
            ((d) this.f51395m.get(i12)).d(treeSet, z12 || zEquals);
        }
    }

    public final boolean f(long j12) {
        long j13 = this.f51386d;
        long j14 = this.f51387e;
        return (j13 == -9223372036854775807L && j14 == -9223372036854775807L) || (j13 <= j12 && j14 == -9223372036854775807L) || ((j13 == -9223372036854775807L && j12 < j14) || (j13 <= j12 && j12 < j14));
    }

    public final void g(long j12, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f51390h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j12) && "div".equals(this.f51383a) && (str2 = this.f51391i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i12 = 0; i12 < c(); i12++) {
            b(i12).g(j12, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r18, java.util.Map r20, java.util.HashMap r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.d.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j12, boolean z12, String str, TreeMap treeMap) {
        HashMap<String, Integer> map = this.f51393k;
        map.clear();
        HashMap<String, Integer> map2 = this.f51394l;
        map2.clear();
        String str2 = this.f51383a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f51390h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f51385c && z12) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f51384b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z12) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j12)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((a.c) entry.getValue()).f47839a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i12 = 0; i12 < c(); i12++) {
                b(i12).i(j12, z12 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((a.c) entry2.getValue()).f47839a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
