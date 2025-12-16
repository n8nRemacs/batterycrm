package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.google.android.exoplayer2.text.a;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TtmlNode.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f347020a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f347021b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f347022c;

    /* renamed from: d, reason: collision with root package name */
    public final long f347023d;

    /* renamed from: e, reason: collision with root package name */
    public final long f347024e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final g f347025f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final String[] f347026g;

    /* renamed from: h, reason: collision with root package name */
    public final String f347027h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final String f347028i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final d f347029j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f347030k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f347031l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f347032m;

    public d(@P String str, @P String str2, long j12, long j13, @P g gVar, @P String[] strArr, String str3, @P String str4, @P d dVar) {
        this.f347020a = str;
        this.f347021b = str2;
        this.f347028i = str4;
        this.f347025f = gVar;
        this.f347026g = strArr;
        this.f347022c = str2 != null;
        this.f347023d = j12;
        this.f347024e = j13;
        str3.getClass();
        this.f347027h = str3;
        this.f347029j = dVar;
        this.f347030k = new HashMap<>();
        this.f347031l = new HashMap<>();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a.c cVar = new a.c();
            cVar.f346734a = new SpannableStringBuilder();
            treeMap.put(str, cVar);
        }
        CharSequence charSequence = ((a.c) treeMap.get(str)).f346734a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i12) {
        ArrayList arrayList = this.f347032m;
        if (arrayList != null) {
            return (d) arrayList.get(i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f347032m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z12) {
        String str = this.f347020a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z12 || zEquals || (zEquals2 && this.f347028i != null)) {
            long j12 = this.f347023d;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
            long j13 = this.f347024e;
            if (j13 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j13));
            }
        }
        if (this.f347032m == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f347032m.size(); i12++) {
            ((d) this.f347032m.get(i12)).d(treeSet, z12 || zEquals);
        }
    }

    public final boolean f(long j12) {
        long j13 = this.f347023d;
        long j14 = this.f347024e;
        return (j13 == -9223372036854775807L && j14 == -9223372036854775807L) || (j13 <= j12 && j14 == -9223372036854775807L) || ((j13 == -9223372036854775807L && j12 < j14) || (j13 <= j12 && j12 < j14));
    }

    public final void g(long j12, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f347027h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j12) && "div".equals(this.f347020a) && (str2 = this.f347028i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i12 = 0; i12 < c(); i12++) {
            b(i12).g(j12, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0262 A[SYNTHETIC] */
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
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.d.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j12, boolean z12, String str, TreeMap treeMap) {
        HashMap<String, Integer> map = this.f347030k;
        map.clear();
        HashMap<String, Integer> map2 = this.f347031l;
        map2.clear();
        String str2 = this.f347020a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f347027h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f347022c && z12) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f347021b;
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
                CharSequence charSequence = ((a.c) entry.getValue()).f346734a;
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
                CharSequence charSequence2 = ((a.c) entry2.getValue()).f346734a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
