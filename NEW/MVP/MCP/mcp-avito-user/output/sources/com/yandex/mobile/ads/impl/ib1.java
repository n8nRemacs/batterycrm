package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.yandex.mobile.ads.impl.vm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes8.dex */
final class ib1 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f386430a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f386431b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f386432c;

    /* renamed from: d, reason: collision with root package name */
    public final long f386433d;

    /* renamed from: e, reason: collision with root package name */
    public final long f386434e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final lb1 f386435f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final String[] f386436g;

    /* renamed from: h, reason: collision with root package name */
    public final String f386437h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final String f386438i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final ib1 f386439j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f386440k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f386441l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f386442m;

    private ib1(@j.P String str, @j.P String str2, long j12, long j13, @j.P lb1 lb1Var, @j.P String[] strArr, String str3, @j.P String str4, @j.P ib1 ib1Var) {
        this.f386430a = str;
        this.f386431b = str2;
        this.f386438i = str4;
        this.f386435f = lb1Var;
        this.f386436g = strArr;
        this.f386432c = str2 != null;
        this.f386433d = j12;
        this.f386434e = j13;
        this.f386437h = (String) db.a(str3);
        this.f386439j = ib1Var;
        this.f386440k = new HashMap<>();
        this.f386441l = new HashMap<>();
    }

    public static ib1 a(String str) {
        return new ib1(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i12 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i12] = it.next().longValue();
            i12++;
        }
        return jArr;
    }

    @j.P
    public final String[] c() {
        return this.f386436g;
    }

    public static ib1 a(@j.P String str, long j12, long j13, @j.P lb1 lb1Var, @j.P String[] strArr, String str2, @j.P String str3, @j.P ib1 ib1Var) {
        return new ib1(str, null, j12, j13, lb1Var, strArr, str2, str3, ib1Var);
    }

    public final boolean a(long j12) {
        long j13 = this.f386433d;
        return (j13 == -9223372036854775807L && this.f386434e == -9223372036854775807L) || (j13 <= j12 && this.f386434e == -9223372036854775807L) || ((j13 == -9223372036854775807L && j12 < this.f386434e) || (j13 <= j12 && j12 < this.f386434e));
    }

    public final void a(ib1 ib1Var) {
        if (this.f386442m == null) {
            this.f386442m = new ArrayList();
        }
        this.f386442m.add(ib1Var);
    }

    public final ib1 a(int i12) {
        ArrayList arrayList = this.f386442m;
        if (arrayList != null) {
            return (ib1) arrayList.get(i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int a() {
        ArrayList arrayList = this.f386442m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    private void a(TreeSet<Long> treeSet, boolean z12) {
        boolean zEquals = "p".equals(this.f386430a);
        boolean zEquals2 = "div".equals(this.f386430a);
        if (z12 || zEquals || (zEquals2 && this.f386438i != null)) {
            long j12 = this.f386433d;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
            long j13 = this.f386434e;
            if (j13 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j13));
            }
        }
        if (this.f386442m == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f386442m.size(); i12++) {
            ((ib1) this.f386442m.get(i12)).a(treeSet, z12 || zEquals);
        }
    }

    public final ArrayList a(long j12, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j12, this.f386437h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j12, false, this.f386437h, treeMap);
        a(j12, map, map2, this.f386437h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                jb1 jb1Var = (jb1) map2.get(pair.first);
                jb1Var.getClass();
                arrayList2.add(new vm.a().a(bitmapDecodeByteArray).b(jb1Var.f386802b).b(0).a(0, jb1Var.f386803c).a(jb1Var.f386805e).d(jb1Var.f386806f).a(jb1Var.f386807g).c(jb1Var.f386810j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            jb1 jb1Var2 = (jb1) map2.get(entry.getKey());
            jb1Var2.getClass();
            vm.a aVar = (vm.a) entry.getValue();
            CharSequence charSequenceE = aVar.e();
            charSequenceE.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceE;
            for (sp spVar : (sp[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sp.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(spVar), spannableStringBuilder.getSpanEnd(spVar), (CharSequence) "");
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
            aVar.a(jb1Var2.f386804d, jb1Var2.f386803c);
            aVar.a(jb1Var2.f386805e);
            aVar.b(jb1Var2.f386802b);
            aVar.d(jb1Var2.f386806f);
            aVar.b(jb1Var2.f386808h, jb1Var2.f386809i);
            aVar.c(jb1Var2.f386810j);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    private void a(long j12, String str, ArrayList arrayList) {
        if (!"".equals(this.f386437h)) {
            str = this.f386437h;
        }
        if (a(j12) && "div".equals(this.f386430a) && this.f386438i != null) {
            arrayList.add(new Pair(str, this.f386438i));
            return;
        }
        for (int i12 = 0; i12 < a(); i12++) {
            a(i12).a(j12, str, arrayList);
        }
    }

    private void a(long j12, boolean z12, String str, TreeMap treeMap) {
        this.f386440k.clear();
        this.f386441l.clear();
        if ("metadata".equals(this.f386430a)) {
            return;
        }
        if (!"".equals(this.f386437h)) {
            str = this.f386437h;
        }
        if (this.f386432c && z12) {
            if (!treeMap.containsKey(str)) {
                vm.a aVar = new vm.a();
                aVar.a(new SpannableStringBuilder());
                treeMap.put(str, aVar);
            }
            CharSequence charSequenceE = ((vm.a) treeMap.get(str)).e();
            charSequenceE.getClass();
            String str2 = this.f386431b;
            str2.getClass();
            ((SpannableStringBuilder) charSequenceE).append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f386430a) && z12) {
            if (!treeMap.containsKey(str)) {
                vm.a aVar2 = new vm.a();
                aVar2.a(new SpannableStringBuilder());
                treeMap.put(str, aVar2);
            }
            CharSequence charSequenceE2 = ((vm.a) treeMap.get(str)).e();
            charSequenceE2.getClass();
            ((SpannableStringBuilder) charSequenceE2).append('\n');
            return;
        }
        if (a(j12)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap<String, Integer> map = this.f386440k;
                String str3 = (String) entry.getKey();
                CharSequence charSequenceE3 = ((vm.a) entry.getValue()).e();
                charSequenceE3.getClass();
                map.put(str3, Integer.valueOf(charSequenceE3.length()));
            }
            boolean zEquals = "p".equals(this.f386430a);
            for (int i12 = 0; i12 < a(); i12++) {
                a(i12).a(j12, z12 || zEquals, str, treeMap);
            }
            if (zEquals) {
                if (!treeMap.containsKey(str)) {
                    vm.a aVar3 = new vm.a();
                    aVar3.a(new SpannableStringBuilder());
                    treeMap.put(str, aVar3);
                }
                CharSequence charSequenceE4 = ((vm.a) treeMap.get(str)).e();
                charSequenceE4.getClass();
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceE4;
                int length = spannableStringBuilder.length() - 1;
                while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
                    spannableStringBuilder.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                HashMap<String, Integer> map2 = this.f386441l;
                String str4 = (String) entry2.getKey();
                CharSequence charSequenceE5 = ((vm.a) entry2.getValue()).e();
                charSequenceE5.getClass();
                map2.put(str4, Integer.valueOf(charSequenceE5.length()));
            }
        }
    }

    private void a(long j12, Map map, Map map2, String str, TreeMap treeMap) {
        if (a(j12)) {
            String str2 = "".equals(this.f386437h) ? str : this.f386437h;
            Iterator<Map.Entry<String, Integer>> it = this.f386441l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f386440k.containsKey(key) ? this.f386440k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    vm.a aVar = (vm.a) treeMap.get(key);
                    aVar.getClass();
                    jb1 jb1Var = (jb1) map2.get(str2);
                    jb1Var.getClass();
                    int i12 = jb1Var.f386810j;
                    lb1 lb1VarA = kb1.a(this.f386435f, this.f386436g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.e();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (lb1VarA != null) {
                        kb1.a(spannableStringBuilder2, iIntValue, iIntValue2, lb1VarA, this.f386439j, map, i12);
                        if ("p".equals(this.f386430a)) {
                            if (lb1VarA.j() != Float.MAX_VALUE) {
                                aVar.c((lb1VarA.j() * (-90.0f)) / 100.0f);
                            }
                            if (lb1VarA.l() != null) {
                                aVar.b(lb1VarA.l());
                            }
                            if (lb1VarA.g() != null) {
                                aVar.a(lb1VarA.g());
                            }
                        }
                    }
                }
            }
            for (int i13 = 0; i13 < a(); i13++) {
                a(i13).a(j12, map, map2, str2, treeMap);
            }
        }
    }
}
