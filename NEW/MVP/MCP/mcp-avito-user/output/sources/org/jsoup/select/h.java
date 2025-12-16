package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.nodes.k;
import org.jsoup.select.d;

/* compiled from: StructuralEvaluator.java */
/* loaded from: classes7.dex */
abstract class h extends org.jsoup.select.d {

    /* renamed from: a, reason: collision with root package name */
    public org.jsoup.select.d f421395a;

    /* compiled from: StructuralEvaluator.java */
    public static class a extends h {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            gVar2.getClass();
            Iterator<org.jsoup.nodes.g> it = org.jsoup.select.a.a(gVar2, new d.C44905a()).iterator();
            while (it.hasNext()) {
                org.jsoup.nodes.g next = it.next();
                if (next != gVar2 && this.f421395a.a(gVar2, next)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format(":has(%s)", this.f421395a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    public static class b extends h {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            org.jsoup.nodes.g gVar3;
            return (gVar == gVar2 || (gVar3 = (org.jsoup.nodes.g) gVar2.f421096b) == null || !this.f421395a.a(gVar, gVar3)) ? false : true;
        }

        public final String toString() {
            return String.format(":ImmediateParent%s", this.f421395a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    public static class c extends h {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            org.jsoup.nodes.g gVarA0;
            return (gVar == gVar2 || (gVarA0 = gVar2.a0()) == null || !this.f421395a.a(gVar, gVarA0)) ? false : true;
        }

        public final String toString() {
            return String.format(":prev%s", this.f421395a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    public static class d extends h {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return !this.f421395a.a(gVar, gVar2);
        }

        public final String toString() {
            return String.format(":not%s", this.f421395a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    public static class e extends h {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            if (gVar == gVar2) {
                return false;
            }
            k kVar = gVar2.f421096b;
            while (true) {
                org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) kVar;
                if (this.f421395a.a(gVar, gVar3)) {
                    return true;
                }
                if (gVar3 == gVar) {
                    return false;
                }
                kVar = gVar3.f421096b;
            }
        }

        public final String toString() {
            return String.format(":parent%s", this.f421395a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    public static class f extends h {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            if (gVar == gVar2) {
                return false;
            }
            for (org.jsoup.nodes.g gVarA0 = gVar2.a0(); gVarA0 != null; gVarA0 = gVarA0.a0()) {
                if (this.f421395a.a(gVar, gVarA0)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format(":prev*%s", this.f421395a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    public static class g extends org.jsoup.select.d {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            return gVar == gVar2;
        }
    }
}
