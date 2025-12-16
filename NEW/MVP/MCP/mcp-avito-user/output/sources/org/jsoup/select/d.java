package org.jsoup.select;

import a71.C19692b;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.k;

/* compiled from: Evaluator.java */
/* loaded from: classes7.dex */
public abstract class d {

    /* compiled from: Evaluator.java */
    public static final class A extends o {
        @Override // org.jsoup.select.d.o
        public final int b(org.jsoup.nodes.g gVar) {
            return ((org.jsoup.nodes.g) gVar.f421096b).O().size() - gVar.T();
        }

        @Override // org.jsoup.select.d.o
        public final String c() {
            return "nth-last-child";
        }
    }

    /* compiled from: Evaluator.java */
    public static class B extends o {
        @Override // org.jsoup.select.d.o
        public final int b(org.jsoup.nodes.g gVar) {
            c cVarO = ((org.jsoup.nodes.g) gVar.f421096b).O();
            int i12 = 0;
            for (int iT2 = gVar.T(); iT2 < cVarO.size(); iT2++) {
                if (cVarO.get(iT2).f421086d.equals(gVar.f421086d)) {
                    i12++;
                }
            }
            return i12;
        }

        @Override // org.jsoup.select.d.o
        public final String c() {
            return "nth-last-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    public static class C extends o {
        @Override // org.jsoup.select.d.o
        public final int b(org.jsoup.nodes.g gVar) {
            Iterator<org.jsoup.nodes.g> it = ((org.jsoup.nodes.g) gVar.f421096b).O().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                org.jsoup.nodes.g next = it.next();
                if (next.f421086d.equals(gVar.f421086d)) {
                    i12++;
                }
                if (next == gVar) {
                    break;
                }
            }
            return i12;
        }

        @Override // org.jsoup.select.d.o
        public final String c() {
            return "nth-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class D extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            c cVar;
            k kVar = gVar2.f421096b;
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) kVar;
            if (gVar3 == null || (gVar3 instanceof Document)) {
                return false;
            }
            if (kVar == null) {
                cVar = new c(0);
            } else {
                List<org.jsoup.nodes.g> listN = ((org.jsoup.nodes.g) kVar).N();
                c cVar2 = new c(listN.size() - 1);
                for (org.jsoup.nodes.g gVar4 : listN) {
                    if (gVar4 != gVar2) {
                        cVar2.add(gVar4);
                    }
                }
                cVar = cVar2;
            }
            return cVar.isEmpty();
        }

        public final String toString() {
            return ":only-child";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class E extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) gVar2.f421096b;
            if (gVar3 == null || (gVar3 instanceof Document)) {
                return false;
            }
            Iterator<org.jsoup.nodes.g> it = gVar3.O().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (it.next().f421086d.equals(gVar2.f421086d)) {
                    i12++;
                }
            }
            return i12 == 1;
        }

        public final String toString() {
            return ":only-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class F extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            if (gVar instanceof Document) {
                gVar = gVar.N().get(0);
            }
            return gVar2 == gVar;
        }

        public final String toString() {
            return ":root";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class G extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            if (gVar2 instanceof org.jsoup.nodes.m) {
                return true;
            }
            for (org.jsoup.nodes.n nVar : gVar2.d0()) {
                org.jsoup.nodes.m mVar = new org.jsoup.nodes.m(org.jsoup.parser.h.a(gVar2.f421086d.f421235b, org.jsoup.parser.f.f421222d), gVar2.j(), gVar2.i());
                nVar.G(mVar);
                mVar.K(nVar);
            }
            return false;
        }

        public final String toString() {
            return ":matchText";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class H extends d {

        /* renamed from: a, reason: collision with root package name */
        public Pattern f421370a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return this.f421370a.matcher(gVar2.c0()).find();
        }

        public final String toString() {
            return ":matches(" + this.f421370a + ")";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class I extends d {

        /* renamed from: a, reason: collision with root package name */
        public Pattern f421371a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return this.f421371a.matcher(gVar2.X()).find();
        }

        public final String toString() {
            return ":matchesOwn(" + this.f421371a + ")";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class J extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f421372a;

        public J(String str) {
            this.f421372a = str;
        }

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return gVar2.f421086d.f421236c.equals(this.f421372a);
        }

        public final String toString() {
            return this.f421372a;
        }
    }

    /* compiled from: Evaluator.java */
    public static final class K extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421373a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return gVar2.f421086d.f421236c.endsWith(this.f421373a);
        }

        public final String toString() {
            return this.f421373a;
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$a, reason: case insensitive filesystem */
    public static final class C44905a extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return true;
        }

        public final String toString() {
            return "*";
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$b, reason: case insensitive filesystem */
    public static final class C44906b extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421374a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return gVar2.r(this.f421374a);
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("["), this.f421374a, "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$c, reason: case insensitive filesystem */
    public static abstract class AbstractC44907c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f421375a;

        /* renamed from: b, reason: collision with root package name */
        public final String f421376b;

        public AbstractC44907c(String str, String str2, boolean z12) {
            org.jsoup.helper.d.b(str);
            org.jsoup.helper.d.b(str2);
            this.f421375a = C19692b.b(str);
            boolean z13 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z13 ? androidx.compose.ui.graphics.colorspace.e.h(1, 1, str2) : str2;
            String strA = (!z12 && z13) ? C19692b.a(str2) : C19692b.b(str2);
            this.f421376b = strA;
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$d, reason: collision with other inner class name */
    public static final class C12220d extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421377a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            org.jsoup.nodes.b bVarI = gVar2.i();
            bVarI.getClass();
            ArrayList arrayList = new ArrayList(bVarI.f421074b);
            for (int i12 = 0; i12 < bVarI.f421074b; i12++) {
                if (!org.jsoup.nodes.b.w(bVarI.f421075c[i12])) {
                    arrayList.add(new org.jsoup.nodes.a(bVarI.f421075c[i12], bVarI.f421076d[i12], bVarI));
                }
            }
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (it.hasNext()) {
                if (C19692b.a(((org.jsoup.nodes.a) it.next()).f421070b).startsWith(this.f421377a)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("[^"), this.f421377a, "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$e, reason: case insensitive filesystem */
    public static final class C44908e extends AbstractC44907c {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            String str = this.f421375a;
            if (gVar2.r(str)) {
                if (this.f421376b.equalsIgnoreCase(gVar2.c(str).trim())) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f421375a);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            return AK.c.s(sb2, this.f421376b, "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$f, reason: case insensitive filesystem */
    public static final class C44909f extends AbstractC44907c {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            String str = this.f421375a;
            return gVar2.r(str) && C19692b.a(gVar2.c(str)).contains(this.f421376b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f421375a);
            sb2.append("*=");
            return AK.c.s(sb2, this.f421376b, "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$g, reason: case insensitive filesystem */
    public static final class C44910g extends AbstractC44907c {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            String str = this.f421375a;
            return gVar2.r(str) && C19692b.a(gVar2.c(str)).endsWith(this.f421376b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f421375a);
            sb2.append("$=");
            return AK.c.s(sb2, this.f421376b, "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$h, reason: case insensitive filesystem */
    public static final class C44911h extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421378a;

        /* renamed from: b, reason: collision with root package name */
        public Pattern f421379b;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            String str = this.f421378a;
            return gVar2.r(str) && this.f421379b.matcher(gVar2.c(str)).find();
        }

        public final String toString() {
            return androidx.camera.camera2.internal.G.h(new StringBuilder("["), this.f421378a, "~=", this.f421379b.toString(), "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$i, reason: case insensitive filesystem */
    public static final class C44912i extends AbstractC44907c {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return !this.f421376b.equalsIgnoreCase(gVar2.c(this.f421375a));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f421375a);
            sb2.append("!=");
            return AK.c.s(sb2, this.f421376b, "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$j, reason: case insensitive filesystem */
    public static final class C44913j extends AbstractC44907c {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            String str = this.f421375a;
            return gVar2.r(str) && C19692b.a(gVar2.c(str)).startsWith(this.f421376b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f421375a);
            sb2.append("^=");
            return AK.c.s(sb2, this.f421376b, "]");
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.d$k, reason: case insensitive filesystem */
    public static final class C44914k extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421380a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            if (!gVar2.s()) {
                return false;
            }
            String strR = gVar2.f421089g.r("class");
            int length = strR.length();
            String str = this.f421380a;
            int length2 = str.length();
            if (length == 0 || length < length2) {
                return false;
            }
            if (length == length2) {
                return str.equalsIgnoreCase(strR);
            }
            boolean z12 = false;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (Character.isWhitespace(strR.charAt(i13))) {
                    if (!z12) {
                        continue;
                    } else {
                        if (i13 - i12 == length2 && strR.regionMatches(true, i12, str, 0, length2)) {
                            return true;
                        }
                        z12 = false;
                    }
                } else if (!z12) {
                    i12 = i13;
                    z12 = true;
                }
            }
            if (z12 && length - i12 == length2) {
                return strR.regionMatches(true, i12, str, 0, length2);
            }
            return false;
        }

        public final String toString() {
            return "." + this.f421380a;
        }
    }

    /* compiled from: Evaluator.java */
    public static final class l extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421381a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return C19692b.a(gVar2.R()).contains(this.f421381a);
        }

        public final String toString() {
            return AK.c.s(new StringBuilder(":containsData("), this.f421381a, ")");
        }
    }

    /* compiled from: Evaluator.java */
    public static final class m extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421382a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return C19692b.a(gVar2.X()).contains(this.f421382a);
        }

        public final String toString() {
            return AK.c.s(new StringBuilder(":containsOwn("), this.f421382a, ")");
        }
    }

    /* compiled from: Evaluator.java */
    public static final class n extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421383a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return C19692b.a(gVar2.c0()).contains(this.f421383a);
        }

        public final String toString() {
            return AK.c.s(new StringBuilder(":contains("), this.f421383a, ")");
        }
    }

    /* compiled from: Evaluator.java */
    public static abstract class o extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f421384a;

        /* renamed from: b, reason: collision with root package name */
        public final int f421385b;

        public o(int i12, int i13) {
            this.f421384a = i12;
            this.f421385b = i13;
        }

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) gVar2.f421096b;
            if (gVar3 == null || (gVar3 instanceof Document)) {
                return false;
            }
            int iB2 = b(gVar2);
            int i12 = this.f421385b;
            int i13 = this.f421384a;
            if (i13 == 0) {
                return iB2 == i12;
            }
            int i14 = iB2 - i12;
            return i14 * i13 >= 0 && i14 % i13 == 0;
        }

        public abstract int b(org.jsoup.nodes.g gVar);

        public abstract String c();

        public String toString() {
            int i12 = this.f421385b;
            int i13 = this.f421384a;
            return i13 == 0 ? String.format(":%s(%d)", c(), Integer.valueOf(i12)) : i12 == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(i13)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(i13), Integer.valueOf(i12));
        }
    }

    /* compiled from: Evaluator.java */
    public static final class p extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f421386a;

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return this.f421386a.equals(gVar2.s() ? gVar2.f421089g.r("id") : "");
        }

        public final String toString() {
            return "#" + this.f421386a;
        }
    }

    /* compiled from: Evaluator.java */
    public static final class q extends r {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return gVar2.T() == this.f421387a;
        }

        public final String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f421387a));
        }
    }

    /* compiled from: Evaluator.java */
    public static abstract class r extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f421387a;

        public r(int i12) {
            this.f421387a = i12;
        }
    }

    /* compiled from: Evaluator.java */
    public static final class s extends r {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return gVar2.T() > this.f421387a;
        }

        public final String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f421387a));
        }
    }

    /* compiled from: Evaluator.java */
    public static final class t extends r {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return gVar != gVar2 && gVar2.T() < this.f421387a;
        }

        public final String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f421387a));
        }
    }

    /* compiled from: Evaluator.java */
    public static final class u extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            for (k kVar : gVar2.m()) {
                if (!(kVar instanceof org.jsoup.nodes.d) && !(kVar instanceof org.jsoup.nodes.o) && !(kVar instanceof org.jsoup.nodes.f)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return ":empty";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class v extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) gVar2.f421096b;
            return (gVar3 == null || (gVar3 instanceof Document) || gVar2.T() != 0) ? false : true;
        }

        public final String toString() {
            return ":first-child";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class w extends C {
        public w() {
            super(0, 1);
        }

        @Override // org.jsoup.select.d.o
        public final String toString() {
            return ":first-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class x extends d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) gVar2.f421096b;
            return (gVar3 == null || (gVar3 instanceof Document) || gVar2.T() != gVar3.O().size() - 1) ? false : true;
        }

        public final String toString() {
            return ":last-child";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class y extends B {
        public y() {
            super(0, 1);
        }

        @Override // org.jsoup.select.d.o
        public final String toString() {
            return ":last-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    public static final class z extends o {
        @Override // org.jsoup.select.d.o
        public final int b(org.jsoup.nodes.g gVar) {
            return gVar.T() + 1;
        }

        @Override // org.jsoup.select.d.o
        public final String c() {
            return "nth-child";
        }
    }

    public abstract boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2);
}
