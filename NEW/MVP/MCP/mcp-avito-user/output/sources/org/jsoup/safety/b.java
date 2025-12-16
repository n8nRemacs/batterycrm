package org.jsoup.safety;

import a71.C19692b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jsoup.nodes.g;

/* compiled from: Whitelist.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f421352a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f421353b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f421354c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f421355d = new HashMap();

    /* compiled from: Whitelist.java */
    public static class a extends e {
    }

    /* compiled from: Whitelist.java */
    /* renamed from: org.jsoup.safety.b$b, reason: collision with other inner class name */
    public static class C12217b extends e {
    }

    /* compiled from: Whitelist.java */
    public static class c extends e {
    }

    /* compiled from: Whitelist.java */
    public static class d extends e {
    }

    /* compiled from: Whitelist.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f421356a;

        public e(String str) {
            org.jsoup.helper.d.d(str);
            this.f421356a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = ((e) obj).f421356a;
            String str2 = this.f421356a;
            return str2 == null ? str == null : str2.equals(str);
        }

        public final int hashCode() {
            String str = this.f421356a;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return this.f421356a;
        }
    }

    public final void a(String... strArr) {
        for (String str : strArr) {
            org.jsoup.helper.d.b(str);
            this.f421352a.add(new d(str));
        }
    }

    public final org.jsoup.nodes.b b(String str) {
        org.jsoup.nodes.b bVar = new org.jsoup.nodes.b();
        d dVar = new d(str);
        HashMap map = this.f421354c;
        if (map.containsKey(dVar)) {
            for (Map.Entry entry : ((Map) map.get(dVar)).entrySet()) {
                bVar.y(((a) entry.getKey()).f421356a, ((C12217b) entry.getValue()).f421356a);
            }
        }
        return bVar;
    }

    public final boolean c(String str, g gVar, org.jsoup.nodes.a aVar) {
        d dVar = new d(str);
        a aVar2 = new a(aVar.f421070b);
        Set set = (Set) this.f421353b.get(dVar);
        String str2 = aVar.f421070b;
        if (set == null || !set.contains(aVar2)) {
            if (((Map) this.f421354c.get(dVar)) != null) {
                org.jsoup.nodes.b bVarB = b(str);
                if (bVarB.v(str2) != -1) {
                    String strR = bVarB.r(str2);
                    String str3 = aVar.f421071c;
                    return strR.equals(str3 != null ? str3 : "");
                }
            }
            return !str.equals(":all") && c(":all", gVar, aVar);
        }
        HashMap map = this.f421355d;
        if (!map.containsKey(dVar)) {
            return true;
        }
        Map map2 = (Map) map.get(dVar);
        if (map2.containsKey(aVar2)) {
            Set set2 = (Set) map2.get(aVar2);
            String strA = gVar.a(str2);
            if (strA.length() == 0) {
                String str4 = aVar.f421071c;
                strA = str4 != null ? str4 : "";
            }
            aVar.setValue(strA);
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String str5 = ((c) it.next()).f421356a;
                if (!str5.equals("#")) {
                    if (C19692b.a(strA).startsWith(str5.concat(":"))) {
                    }
                } else if (!strA.startsWith("#") || strA.matches(".*\\s.*")) {
                }
            }
            return false;
        }
        return true;
    }
}
