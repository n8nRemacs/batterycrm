package org.jsoup.select;

import a71.C19692b;
import a71.C19693c;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.parser.i;
import org.jsoup.select.Selector;
import org.jsoup.select.b;
import org.jsoup.select.d;
import org.jsoup.select.h;

/* compiled from: QueryParser.java */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f421388d = {",", ">", "+", "~", " "};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f421389e = {ContainerUtils.KEY_VALUE_DELIMITER, "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f421390f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f421391g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public i f421392a;

    /* renamed from: b, reason: collision with root package name */
    public String f421393b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f421394c;

    public static d h(String str) {
        try {
            g gVar = new g();
            gVar.f421394c = new ArrayList();
            org.jsoup.helper.d.b(str);
            String strTrim = str.trim();
            gVar.f421393b = strTrim;
            gVar.f421392a = new i(strTrim);
            return gVar.g();
        } catch (IllegalArgumentException e12) {
            throw new Selector.SelectorParseException(e12.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(char r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.g.a(char):void");
    }

    public final int b() {
        boolean z12 = true;
        String strTrim = this.f421392a.b().trim();
        String[] strArr = C19693c.f20746a;
        if (strTrim == null || strTrim.length() == 0) {
            z12 = false;
            break;
        }
        int length = strTrim.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (!Character.isDigit(strTrim.codePointAt(i12))) {
                z12 = false;
                break;
            }
        }
        if (z12) {
            return Integer.parseInt(strTrim);
        }
        throw new IllegalArgumentException("Index must be numeric");
    }

    public final void c(boolean z12) {
        String str = z12 ? ":containsOwn" : ":contains";
        i iVar = this.f421392a;
        iVar.d(str);
        String strM = i.m(iVar.a('(', ')'));
        org.jsoup.helper.d.c(strM, ":contains(text) query must not be empty");
        ArrayList arrayList = this.f421394c;
        if (z12) {
            d.m mVar = new d.m();
            mVar.f421382a = C19692b.a(strM);
            arrayList.add(mVar);
        } else {
            d.n nVar = new d.n();
            nVar.f421383a = C19692b.a(strM);
            arrayList.add(nVar);
        }
    }

    public final void d(boolean z12, boolean z13) throws NumberFormatException {
        String strB = C19692b.b(this.f421392a.b());
        Matcher matcher = f421390f.matcher(strB);
        Matcher matcher2 = f421391g.matcher(strB);
        int i12 = 2;
        int i13 = 1;
        if (!"odd".equals(strB)) {
            if ("even".equals(strB)) {
                i13 = 0;
            } else if (matcher.matches()) {
                int i14 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i13 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i12 = i14;
            } else {
                if (!matcher2.matches()) {
                    throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", strB);
                }
                i13 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i12 = 0;
            }
        }
        ArrayList arrayList = this.f421394c;
        if (z13) {
            if (z12) {
                arrayList.add(new d.B(i12, i13));
                return;
            } else {
                arrayList.add(new d.C(i12, i13));
                return;
            }
        }
        if (z12) {
            arrayList.add(new d.A(i12, i13));
        } else {
            arrayList.add(new d.z(i12, i13));
        }
    }

    public final void e() throws NumberFormatException {
        i iVar = this.f421392a;
        boolean zH2 = iVar.h("#");
        ArrayList arrayList = this.f421394c;
        if (zH2) {
            String strE = iVar.e();
            org.jsoup.helper.d.b(strE);
            d.p pVar = new d.p();
            pVar.f421386a = strE;
            arrayList.add(pVar);
            return;
        }
        if (iVar.h(".")) {
            String strE2 = iVar.e();
            org.jsoup.helper.d.b(strE2);
            String strTrim = strE2.trim();
            d.C44914k c44914k = new d.C44914k();
            c44914k.f421380a = strTrim;
            arrayList.add(c44914k);
            return;
        }
        if (iVar.k() || iVar.i("*|")) {
            int i12 = iVar.f421245b;
            while (!iVar.g() && (iVar.k() || iVar.j("*|", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "_", "-"))) {
                iVar.f421245b++;
            }
            String strB = C19692b.b(iVar.f421244a.substring(i12, iVar.f421245b));
            org.jsoup.helper.d.b(strB);
            if (!strB.startsWith("*|")) {
                if (strB.contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
                    strB = strB.replace(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, ":");
                }
                arrayList.add(new d.J(strB));
                return;
            }
            d.J j12 = new d.J(strB);
            String strReplace = strB.replace("*|", ":");
            d.K k12 = new d.K();
            k12.f421373a = strReplace;
            List listAsList = Arrays.asList(j12, k12);
            b.C12219b c12219b = new b.C12219b();
            int i13 = c12219b.f421369b;
            ArrayList<d> arrayList2 = c12219b.f421368a;
            if (i13 > 1) {
                arrayList2.add(new b.a(listAsList));
            } else {
                arrayList2.addAll(listAsList);
            }
            c12219b.f421369b = arrayList2.size();
            arrayList.add(c12219b);
            return;
        }
        boolean zI2 = iVar.i("[");
        String str = this.f421393b;
        if (zI2) {
            i iVar2 = new i(iVar.a('[', ']'));
            String[] strArr = f421389e;
            int i14 = iVar2.f421245b;
            while (!iVar2.g() && !iVar2.j(strArr)) {
                iVar2.f421245b++;
            }
            String strSubstring = iVar2.f421244a.substring(i14, iVar2.f421245b);
            org.jsoup.helper.d.b(strSubstring);
            iVar2.f();
            if (iVar2.g()) {
                if (!strSubstring.startsWith("^")) {
                    d.C44906b c44906b = new d.C44906b();
                    c44906b.f421374a = strSubstring;
                    arrayList.add(c44906b);
                    return;
                } else {
                    String strSubstring2 = strSubstring.substring(1);
                    d.C12220d c12220d = new d.C12220d();
                    org.jsoup.helper.d.b(strSubstring2);
                    c12220d.f421377a = C19692b.a(strSubstring2);
                    arrayList.add(c12220d);
                    return;
                }
            }
            if (iVar2.h(ContainerUtils.KEY_VALUE_DELIMITER)) {
                arrayList.add(new d.C44908e(strSubstring, iVar2.l(), true));
                return;
            }
            if (iVar2.h("!=")) {
                arrayList.add(new d.C44912i(strSubstring, iVar2.l(), true));
                return;
            }
            if (iVar2.h("^=")) {
                arrayList.add(new d.C44913j(strSubstring, iVar2.l(), false));
                return;
            }
            if (iVar2.h("$=")) {
                arrayList.add(new d.C44910g(strSubstring, iVar2.l(), false));
                return;
            }
            if (iVar2.h("*=")) {
                arrayList.add(new d.C44909f(strSubstring, iVar2.l(), true));
                return;
            }
            if (!iVar2.h("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", str, iVar2.l());
            }
            Pattern patternCompile = Pattern.compile(iVar2.l());
            d.C44911h c44911h = new d.C44911h();
            c44911h.f421378a = C19692b.b(strSubstring);
            c44911h.f421379b = patternCompile;
            arrayList.add(c44911h);
            return;
        }
        if (iVar.h("*")) {
            arrayList.add(new d.C44905a());
            return;
        }
        if (iVar.h(":lt(")) {
            arrayList.add(new d.t(b()));
            return;
        }
        if (iVar.h(":gt(")) {
            arrayList.add(new d.s(b()));
            return;
        }
        if (iVar.h(":eq(")) {
            arrayList.add(new d.q(b()));
            return;
        }
        if (iVar.i(":has(")) {
            iVar.d(":has");
            String strA = iVar.a('(', ')');
            org.jsoup.helper.d.c(strA, ":has(el) subselect must not be empty");
            d dVarH = h(strA);
            h.a aVar = new h.a();
            aVar.f421395a = dVarH;
            arrayList.add(aVar);
            return;
        }
        if (iVar.i(":contains(")) {
            c(false);
            return;
        }
        if (iVar.i(":containsOwn(")) {
            c(true);
            return;
        }
        if (iVar.i(":containsData(")) {
            iVar.d(":containsData");
            String strM = i.m(iVar.a('(', ')'));
            org.jsoup.helper.d.c(strM, ":containsData(text) query must not be empty");
            d.l lVar = new d.l();
            lVar.f421381a = C19692b.a(strM);
            arrayList.add(lVar);
            return;
        }
        if (iVar.i(":matches(")) {
            f(false);
            return;
        }
        if (iVar.i(":matchesOwn(")) {
            f(true);
            return;
        }
        if (iVar.i(":not(")) {
            iVar.d(":not");
            String strA2 = iVar.a('(', ')');
            org.jsoup.helper.d.c(strA2, ":not(selector) subselect must not be empty");
            d dVarH2 = h(strA2);
            h.d dVar = new h.d();
            dVar.f421395a = dVarH2;
            arrayList.add(dVar);
            return;
        }
        if (iVar.h(":nth-child(")) {
            d(false, false);
            return;
        }
        if (iVar.h(":nth-last-child(")) {
            d(true, false);
            return;
        }
        if (iVar.h(":nth-of-type(")) {
            d(false, true);
            return;
        }
        if (iVar.h(":nth-last-of-type(")) {
            d(true, true);
            return;
        }
        if (iVar.h(":first-child")) {
            arrayList.add(new d.v());
            return;
        }
        if (iVar.h(":last-child")) {
            arrayList.add(new d.x());
            return;
        }
        if (iVar.h(":first-of-type")) {
            arrayList.add(new d.w());
            return;
        }
        if (iVar.h(":last-of-type")) {
            arrayList.add(new d.y());
            return;
        }
        if (iVar.h(":only-child")) {
            arrayList.add(new d.D());
            return;
        }
        if (iVar.h(":only-of-type")) {
            arrayList.add(new d.E());
            return;
        }
        if (iVar.h(":empty")) {
            arrayList.add(new d.u());
        } else if (iVar.h(":root")) {
            arrayList.add(new d.F());
        } else {
            if (!iVar.h(":matchText")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", str, iVar.l());
            }
            arrayList.add(new d.G());
        }
    }

    public final void f(boolean z12) {
        String str = z12 ? ":matchesOwn" : ":matches";
        i iVar = this.f421392a;
        iVar.d(str);
        String strA = iVar.a('(', ')');
        org.jsoup.helper.d.c(strA, ":matches(regex) query must not be empty");
        ArrayList arrayList = this.f421394c;
        if (z12) {
            Pattern patternCompile = Pattern.compile(strA);
            d.I i12 = new d.I();
            i12.f421371a = patternCompile;
            arrayList.add(i12);
            return;
        }
        Pattern patternCompile2 = Pattern.compile(strA);
        d.H h12 = new d.H();
        h12.f421370a = patternCompile2;
        arrayList.add(h12);
    }

    public final d g() throws NumberFormatException {
        i iVar = this.f421392a;
        iVar.f();
        String[] strArr = f421388d;
        boolean zJ2 = iVar.j(strArr);
        ArrayList arrayList = this.f421394c;
        if (zJ2) {
            arrayList.add(new h.g());
            a(iVar.c());
        } else {
            e();
        }
        while (!iVar.g()) {
            boolean zF2 = iVar.f();
            if (iVar.j(strArr)) {
                a(iVar.c());
            } else if (zF2) {
                a(' ');
            } else {
                e();
            }
        }
        return arrayList.size() == 1 ? (d) arrayList.get(0) : new b.a(arrayList);
    }
}
