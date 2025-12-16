package org.joda.time.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44868j;

/* compiled from: DateTimeFormat.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, org.joda.time.format.b> f420727a = new ConcurrentHashMap<>();

    /* compiled from: DateTimeFormat.java */
    /* renamed from: org.joda.time.format.a$a, reason: collision with other inner class name */
    public static class C12207a implements n, l {

        /* renamed from: b, reason: collision with root package name */
        public static final ConcurrentHashMap<b, org.joda.time.format.b> f420728b = new ConcurrentHashMap<>();

        public static org.joda.time.format.b f(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            b bVar = new b(locale);
            ConcurrentHashMap<b, org.joda.time.format.b> concurrentHashMap = f420728b;
            org.joda.time.format.b bVar2 = concurrentHashMap.get(bVar);
            if (bVar2 != null) {
                return bVar2;
            }
            DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
            if (dateInstance instanceof SimpleDateFormat) {
                org.joda.time.format.b bVarA = a.a(((SimpleDateFormat) dateInstance).toPattern());
                org.joda.time.format.b bVarPutIfAbsent = concurrentHashMap.putIfAbsent(bVar, bVarA);
                return bVarPutIfAbsent != null ? bVarPutIfAbsent : bVarA;
            }
            throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return 40;
        }

        @Override // org.joda.time.format.l
        public final int b(e eVar, String str, int i12) {
            return f(eVar.f420771b).f420732b.b(eVar, str, i12);
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) {
            f(locale).f420731a.c(appendable, j12, abstractC44854a, i12, abstractC44868j, locale);
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return 40;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
            f(locale).f420731a.e(sb2, eVar, locale);
        }
    }

    /* compiled from: DateTimeFormat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f420729a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Locale f420730b;

        public b(Locale locale) {
            this.f420730b = locale;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f420729a != bVar.f420729a) {
                return false;
            }
            Locale locale = bVar.f420730b;
            Locale locale2 = this.f420730b;
            if (locale2 == null) {
                if (locale != null) {
                    return false;
                }
            } else if (!locale2.equals(locale)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i12 = (this.f420729a + 31) * 31;
            Locale locale = this.f420730b;
            return i12 + (locale == null ? 0 : locale.hashCode());
        }
    }

    static {
        new AtomicReferenceArray(25);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.joda.time.format.b a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.a.a(java.lang.String):org.joda.time.format.b");
    }

    public static String b(String str, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i12);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb2.append('\'');
            boolean z12 = false;
            while (i12 < length) {
                char cCharAt2 = str.charAt(i12);
                if (cCharAt2 != '\'') {
                    if (!z12 && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i12--;
                        break;
                    }
                    sb2.append(cCharAt2);
                } else {
                    int i13 = i12 + 1;
                    if (i13 >= length || str.charAt(i13) != '\'') {
                        z12 = !z12;
                    } else {
                        sb2.append(cCharAt2);
                        i12 = i13;
                    }
                }
                i12++;
            }
        } else {
            sb2.append(cCharAt);
            while (true) {
                int i14 = i12 + 1;
                if (i14 >= length || str.charAt(i14) != cCharAt) {
                    break;
                }
                sb2.append(cCharAt);
                i12 = i14;
            }
        }
        iArr[0] = i12;
        return sb2.toString();
    }
}
