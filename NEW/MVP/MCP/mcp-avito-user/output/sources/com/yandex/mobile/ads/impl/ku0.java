package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class ku0 {

    public static class a<T> implements ju0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends ju0<? super T>> f387268a;

        public /* synthetic */ a(List list, int i12) {
            this(list);
        }

        @Override // com.yandex.mobile.ads.impl.ju0
        public final boolean apply(T t12) {
            for (int i12 = 0; i12 < this.f387268a.size(); i12++) {
                if (!this.f387268a.get(i12).apply(t12)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof a) {
                return this.f387268a.equals(((a) obj).f387268a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f387268a.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends ju0<? super T>> list = this.f387268a;
            StringBuilder sb2 = new StringBuilder("Predicates.and(");
            boolean z12 = true;
            for (T t12 : list) {
                if (!z12) {
                    sb2.append(',');
                }
                sb2.append(t12);
                z12 = false;
            }
            sb2.append(')');
            return sb2.toString();
        }

        private a(List<? extends ju0<? super T>> list) {
            this.f387268a = list;
        }
    }

    public static <T> ju0<T> a(ju0<? super T> ju0Var, ju0<? super T> ju0Var2) {
        ju0Var.getClass();
        ju0Var2.getClass();
        return new a(Arrays.asList(ju0Var, ju0Var2), 0);
    }
}
