package org.hamcrest.comparator;

import java.util.Comparator;
import org.hamcrest.p;

/* compiled from: ComparatorMatcherBuilder.java */
/* loaded from: classes7.dex */
public final class b<T> {

    /* compiled from: ComparatorMatcherBuilder.java */
    public static final class a<T> extends p<T> {

        /* renamed from: g, reason: collision with root package name */
        public static final String[] f420407g = {"less than", "equal to", "greater than"};

        /* renamed from: b, reason: collision with root package name */
        public final Comparator<T> f420408b;

        /* renamed from: c, reason: collision with root package name */
        public final T f420409c;

        /* renamed from: d, reason: collision with root package name */
        public final int f420410d;

        /* renamed from: e, reason: collision with root package name */
        public final int f420411e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f420412f;

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Comparator comparator, Object obj, int i12, int i13, boolean z12, org.hamcrest.comparator.a aVar) {
            this.f420408b = comparator;
            this.f420409c = obj;
            this.f420410d = i12;
            this.f420411e = i13;
            this.f420412f = z12;
        }

        @Override // org.hamcrest.m
        public final void a(org.hamcrest.a aVar) {
            aVar.d("a value ");
            String[] strArr = f420407g;
            int i12 = this.f420410d;
            aVar.d(strArr[Integer.signum(i12) + 1]);
            int i13 = this.f420411e;
            if (i12 != i13) {
                aVar.d(" or ");
                aVar.d(strArr[Integer.signum(i13) + 1]);
            }
            aVar.d(" ");
            aVar.b(this.f420409c);
            if (this.f420412f) {
                aVar.d(" when compared by ");
                aVar.b(this.f420408b);
            }
        }
    }
}
