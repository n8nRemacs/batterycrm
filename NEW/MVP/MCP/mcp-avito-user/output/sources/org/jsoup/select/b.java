package org.jsoup.select;

import a71.C19693c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: CombiningEvaluator.java */
/* loaded from: classes7.dex */
abstract class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public int f421369b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<d> f421368a = new ArrayList<>();

    /* compiled from: CombiningEvaluator.java */
    /* renamed from: org.jsoup.select.b$b, reason: collision with other inner class name */
    public static final class C12219b extends b {
        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            for (int i12 = 0; i12 < this.f421369b; i12++) {
                if (this.f421368a.get(i12).a(gVar, gVar2)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return C19693c.g(", ", this.f421368a);
        }
    }

    /* compiled from: CombiningEvaluator.java */
    public static final class a extends b {
        public a(List list) {
            this.f421368a.addAll(list);
            this.f421369b = this.f421368a.size();
        }

        @Override // org.jsoup.select.d
        public final boolean a(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
            for (int i12 = 0; i12 < this.f421369b; i12++) {
                if (!this.f421368a.get(i12).a(gVar, gVar2)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return C19693c.g(" ", this.f421368a);
        }

        public a(d... dVarArr) {
            this(Arrays.asList(dVarArr));
        }
    }
}
