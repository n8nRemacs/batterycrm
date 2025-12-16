package org.threeten.bp.zone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: TzdbZoneRulesCompiler.java */
/* loaded from: classes16.dex */
final class c {

    /* compiled from: TzdbZoneRulesCompiler.java */
    public static final class a {
    }

    /* compiled from: TzdbZoneRulesCompiler.java */
    public abstract class b {
    }

    /* compiled from: TzdbZoneRulesCompiler.java */
    /* renamed from: org.threeten.bp.zone.c$c, reason: collision with other inner class name */
    public final class C12244c extends b {
    }

    /* compiled from: TzdbZoneRulesCompiler.java */
    public final class d extends b {
    }

    static {
        org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
        dVar.k(ChronoField.f422140q);
        dVar.o();
        dVar.c(':');
        dVar.l(ChronoField.f422136m, 2);
        dVar.o();
        dVar.c(':');
        dVar.l(ChronoField.f422134k, 2);
        dVar.p();
        a("rule", "r");
        a("zone", "z");
        a("link", "l");
        a("minimum", "mi");
        a("maximum", "ma");
        a("only", "o");
        HashMap map = new HashMap();
        b(a("january", "ja"), 1, map);
        b(a("february", "f"), 2, map);
        b(a("march", "mar"), 3, map);
        b(a("april", "ap"), 4, map);
        b(a("may", "may"), 5, map);
        b(a("june", "jun"), 6, map);
        b(a("july", "jul"), 7, map);
        b(a("august", "au"), 8, map);
        b(a("september", "s"), 9, map);
        b(a("october", "o"), 10, map);
        b(a("november", "n"), 11, map);
        b(a("december", "d"), 12, map);
        HashMap map2 = new HashMap();
        b(a("monday", "m"), 1, map2);
        b(a("tuesday", "tu"), 2, map2);
        b(a("wednesday", "w"), 3, map2);
        b(a("thursday", "th"), 4, map2);
        b(a("friday", "f"), 5, map2);
        b(a("saturday", "sa"), 6, map2);
        b(a("sunday", "su"), 7, map2);
    }

    public static HashSet a(String str, String str2) {
        HashSet hashSet = new HashSet();
        while (!str.equals(str2)) {
            hashSet.add(str);
            str = str.substring(0, str.length() - 1);
        }
        hashSet.add(str);
        return hashSet;
    }

    public static void b(HashSet hashSet, int i12, HashMap map) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.put(it.next(), Integer.valueOf(i12));
        }
    }
}
