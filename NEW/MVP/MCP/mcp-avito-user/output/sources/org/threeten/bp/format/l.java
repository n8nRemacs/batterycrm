package org.threeten.bp.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: SimpleDateTimeTextProvider.java */
/* loaded from: classes8.dex */
final class l extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<Map.Entry<String, Long>> f422063c = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f422064b = new ConcurrentHashMap(16, 0.75f, 2);

    /* compiled from: SimpleDateTimeTextProvider.java */
    public class a implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        public final int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* compiled from: SimpleDateTimeTextProvider.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<TextStyle, Map<Long, String>> f422065a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f422066b;

        public b(Map<TextStyle, Map<Long, String>> map) {
            this.f422065a = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (TextStyle textStyle : map.keySet()) {
                HashMap map3 = new HashMap();
                Iterator<Map.Entry<Long, String>> it = map.get(textStyle).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList(map3.values());
                        Collections.sort(arrayList2, l.f422063c);
                        map2.put(textStyle, arrayList2);
                        arrayList.addAll(arrayList2);
                        map2.put(null, arrayList);
                        break;
                    }
                    Map.Entry<Long, String> next = it.next();
                    String value = next.getValue();
                    String value2 = next.getValue();
                    Long key = next.getKey();
                    Comparator<Map.Entry<String, Long>> comparator = l.f422063c;
                    if (map3.put(value, new AbstractMap.SimpleImmutableEntry(value2, key)) != null) {
                        break;
                    }
                }
            }
            Collections.sort(arrayList, l.f422063c);
            this.f422066b = map2;
        }
    }

    public static b c(HashMap map) {
        map.put(TextStyle.f421963c, map.get(TextStyle.f421962b));
        map.put(TextStyle.f421965e, map.get(TextStyle.f421964d));
        TextStyle textStyle = TextStyle.f421966f;
        if (map.containsKey(textStyle)) {
            TextStyle textStyle2 = TextStyle.f421967g;
            if (!map.containsKey(textStyle2)) {
                map.put(textStyle2, map.get(textStyle));
            }
        }
        return new b(map);
    }

    public static String e(int i12, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i12) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i12) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    public static String f(int i12, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i12) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i12) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i12) : str.substring(0, 1);
    }

    @Override // org.threeten.bp.format.i
    public final String a(org.threeten.bp.temporal.h hVar, long j12, TextStyle textStyle, Locale locale) {
        Map<Long, String> map;
        Object objD = d(hVar, locale);
        if (!(objD instanceof b) || (map = ((b) objD).f422065a.get(textStyle)) == null) {
            return null;
        }
        return map.get(Long.valueOf(j12));
    }

    @Override // org.threeten.bp.format.i
    public final Iterator<Map.Entry<String, Long>> b(org.threeten.bp.temporal.h hVar, TextStyle textStyle, Locale locale) {
        List list;
        Object objD = d(hVar, locale);
        if (!(objD instanceof b) || (list = (List) ((b) objD).f422066b.get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }

    public final Object d(org.threeten.bp.temporal.h hVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        ConcurrentHashMap concurrentHashMap;
        Object objC;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(hVar, locale);
        ConcurrentHashMap concurrentHashMap2 = this.f422064b;
        Object obj = concurrentHashMap2.get(simpleImmutableEntry2);
        if (obj != null) {
            return obj;
        }
        ChronoField chronoField = ChronoField.f422120B;
        TextStyle textStyle = TextStyle.f421966f;
        TextStyle textStyle2 = TextStyle.f421964d;
        TextStyle textStyle3 = TextStyle.f421962b;
        if (hVar == chronoField) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map = new HashMap();
            simpleImmutableEntry = simpleImmutableEntry2;
            concurrentHashMap = concurrentHashMap2;
            String[] months = dateFormatSymbols.getMonths();
            HashMap map2 = new HashMap();
            map2.put(1L, months[0]);
            map2.put(2L, months[1]);
            map2.put(3L, months[2]);
            map2.put(4L, months[3]);
            map2.put(5L, months[4]);
            map2.put(6L, months[5]);
            map2.put(7L, months[6]);
            map2.put(8L, months[7]);
            map2.put(9L, months[8]);
            map2.put(10L, months[9]);
            map2.put(11L, months[10]);
            map2.put(12L, months[11]);
            map.put(textStyle3, map2);
            HashMap map3 = new HashMap();
            map3.put(1L, f(1, months[0], locale));
            map3.put(2L, f(2, months[1], locale));
            map3.put(3L, f(3, months[2], locale));
            map3.put(4L, f(4, months[3], locale));
            map3.put(5L, f(5, months[4], locale));
            map3.put(6L, f(6, months[5], locale));
            map3.put(7L, f(7, months[6], locale));
            map3.put(8L, f(8, months[7], locale));
            map3.put(9L, f(9, months[8], locale));
            map3.put(10L, f(10, months[9], locale));
            map3.put(11L, f(11, months[10], locale));
            map3.put(12L, f(12, months[11], locale));
            map.put(textStyle, map3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap map4 = new HashMap();
            map4.put(1L, shortMonths[0]);
            map4.put(2L, shortMonths[1]);
            map4.put(3L, shortMonths[2]);
            map4.put(4L, shortMonths[3]);
            map4.put(5L, shortMonths[4]);
            map4.put(6L, shortMonths[5]);
            map4.put(7L, shortMonths[6]);
            map4.put(8L, shortMonths[7]);
            map4.put(9L, shortMonths[8]);
            map4.put(10L, shortMonths[9]);
            map4.put(11L, shortMonths[10]);
            map4.put(12L, shortMonths[11]);
            map.put(textStyle2, map4);
            objC = c(map);
        } else {
            simpleImmutableEntry = simpleImmutableEntry2;
            concurrentHashMap = concurrentHashMap2;
            if (hVar == ChronoField.f422143t) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map5 = new HashMap();
                String[] weekdays = dateFormatSymbols2.getWeekdays();
                HashMap map6 = new HashMap();
                map6.put(1L, weekdays[2]);
                map6.put(2L, weekdays[3]);
                map6.put(3L, weekdays[4]);
                map6.put(4L, weekdays[5]);
                map6.put(5L, weekdays[6]);
                map6.put(6L, weekdays[7]);
                map6.put(7L, weekdays[1]);
                map5.put(textStyle3, map6);
                HashMap map7 = new HashMap();
                map7.put(1L, e(1, weekdays[2], locale));
                map7.put(2L, e(2, weekdays[3], locale));
                map7.put(3L, e(3, weekdays[4], locale));
                map7.put(4L, e(4, weekdays[5], locale));
                map7.put(5L, e(5, weekdays[6], locale));
                map7.put(6L, e(6, weekdays[7], locale));
                map7.put(7L, e(7, weekdays[1], locale));
                map5.put(textStyle, map7);
                String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                HashMap map8 = new HashMap();
                map8.put(1L, shortWeekdays[2]);
                map8.put(2L, shortWeekdays[3]);
                map8.put(3L, shortWeekdays[4]);
                map8.put(4L, shortWeekdays[5]);
                map8.put(5L, shortWeekdays[6]);
                map8.put(6L, shortWeekdays[7]);
                map8.put(7L, shortWeekdays[1]);
                map5.put(textStyle2, map8);
                objC = c(map5);
            } else if (hVar == ChronoField.f422142s) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap map9 = new HashMap();
                String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                HashMap map10 = new HashMap();
                map10.put(0L, amPmStrings[0]);
                map10.put(1L, amPmStrings[1]);
                map9.put(textStyle3, map10);
                map9.put(textStyle2, map10);
                objC = c(map9);
            } else if (hVar == ChronoField.f422124F) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap map11 = new HashMap();
                String[] eras = dateFormatSymbols4.getEras();
                HashMap map12 = new HashMap();
                map12.put(0L, eras[0]);
                map12.put(1L, eras[1]);
                map11.put(textStyle2, map12);
                if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                    HashMap map13 = new HashMap();
                    map13.put(0L, "Before Christ");
                    map13.put(1L, "Anno Domini");
                    map11.put(textStyle3, map13);
                } else {
                    map11.put(textStyle3, map12);
                }
                HashMap map14 = new HashMap();
                map14.put(0L, eras[0].substring(0, 1));
                map14.put(1L, eras[1].substring(0, 1));
                map11.put(textStyle, map14);
                objC = c(map11);
            } else if (hVar == org.threeten.bp.temporal.a.f422172a) {
                HashMap map15 = new HashMap();
                HashMap map16 = new HashMap();
                map16.put(1L, "Q1");
                map16.put(2L, "Q2");
                map16.put(3L, "Q3");
                map16.put(4L, "Q4");
                map15.put(textStyle2, map16);
                HashMap map17 = new HashMap();
                map17.put(1L, "1st quarter");
                map17.put(2L, "2nd quarter");
                map17.put(3L, "3rd quarter");
                map17.put(4L, "4th quarter");
                map15.put(textStyle3, map17);
                objC = c(map15);
            } else {
                objC = "";
            }
        }
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
        ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
        concurrentHashMap3.putIfAbsent(simpleImmutableEntry3, objC);
        return concurrentHashMap3.get(simpleImmutableEntry3);
    }
}
