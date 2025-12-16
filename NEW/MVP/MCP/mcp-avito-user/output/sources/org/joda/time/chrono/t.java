package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C44866h;

/* compiled from: GJLocaleSymbols.java */
/* loaded from: classes7.dex */
class t {

    /* renamed from: n, reason: collision with root package name */
    public static final ConcurrentHashMap f420633n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String[] f420634a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f420635b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f420636c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f420637d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f420638e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f420639f;

    /* renamed from: g, reason: collision with root package name */
    public final TreeMap<String, Integer> f420640g;

    /* renamed from: h, reason: collision with root package name */
    public final TreeMap<String, Integer> f420641h;

    /* renamed from: i, reason: collision with root package name */
    public final TreeMap<String, Integer> f420642i;

    /* renamed from: j, reason: collision with root package name */
    public final int f420643j;

    /* renamed from: k, reason: collision with root package name */
    public final int f420644k;

    /* renamed from: l, reason: collision with root package name */
    public final int f420645l;

    /* renamed from: m, reason: collision with root package name */
    public final int f420646m;

    public t(Locale locale) {
        DateFormatSymbols dateFormatSymbolsB = C44866h.b(locale);
        this.f420634a = dateFormatSymbolsB.getEras();
        String[] weekdays = dateFormatSymbolsB.getWeekdays();
        String[] strArr = new String[8];
        int i12 = 1;
        while (i12 < 8) {
            strArr[i12] = weekdays[i12 < 7 ? i12 + 1 : 1];
            i12++;
        }
        this.f420635b = strArr;
        String[] shortWeekdays = dateFormatSymbolsB.getShortWeekdays();
        String[] strArr2 = new String[8];
        int i13 = 1;
        while (i13 < 8) {
            strArr2[i13] = shortWeekdays[i13 < 7 ? i13 + 1 : 1];
            i13++;
        }
        this.f420636c = strArr2;
        String[] months = dateFormatSymbolsB.getMonths();
        String[] strArr3 = new String[13];
        for (int i14 = 1; i14 < 13; i14++) {
            strArr3[i14] = months[i14 - 1];
        }
        this.f420637d = strArr3;
        String[] shortMonths = dateFormatSymbolsB.getShortMonths();
        String[] strArr4 = new String[13];
        for (int i15 = 1; i15 < 13; i15++) {
            strArr4[i15] = shortMonths[i15 - 1];
        }
        this.f420638e = strArr4;
        this.f420639f = dateFormatSymbolsB.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i16 = 0; i16 < 13; i16++) {
            numArr[i16] = Integer.valueOf(i16);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>((Comparator<? super String>) comparator);
        this.f420640g = treeMap;
        a(treeMap, this.f420634a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>((Comparator<? super String>) comparator);
        this.f420641h = treeMap2;
        a(treeMap2, this.f420635b, numArr);
        a(treeMap2, this.f420636c, numArr);
        for (int i17 = 1; i17 <= 7; i17++) {
            treeMap2.put(String.valueOf(i17).intern(), numArr[i17]);
        }
        TreeMap<String, Integer> treeMap3 = new TreeMap<>((Comparator<? super String>) comparator);
        this.f420642i = treeMap3;
        a(treeMap3, this.f420637d, numArr);
        a(treeMap3, this.f420638e, numArr);
        for (int i18 = 1; i18 <= 12; i18++) {
            treeMap3.put(String.valueOf(i18).intern(), numArr[i18]);
        }
        this.f420643j = c(this.f420634a);
        this.f420644k = c(this.f420635b);
        c(this.f420636c);
        this.f420645l = c(this.f420637d);
        c(this.f420638e);
        this.f420646m = c(this.f420639f);
    }

    public static void a(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            String str = strArr[length];
            if (str != null) {
                treeMap.put(str, numArr[length]);
            }
        }
    }

    public static t b(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ConcurrentHashMap concurrentHashMap = f420633n;
        t tVar = (t) concurrentHashMap.get(locale);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(locale);
        t tVar3 = (t) concurrentHashMap.putIfAbsent(locale, tVar2);
        return tVar3 != null ? tVar3 : tVar2;
    }

    public static int c(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i12 = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i12;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i12) {
                i12 = length;
            }
        }
    }
}
