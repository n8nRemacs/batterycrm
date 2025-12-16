package com.google.common.base;

import com.google.common.base.AbstractC37256b;
import com.google.common.base.AbstractC37259e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Splitter.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37259e f358996a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f358997b;

    /* renamed from: c, reason: collision with root package name */
    public final c f358998c;

    /* renamed from: d, reason: collision with root package name */
    public final int f358999d;

    /* compiled from: Splitter.java */
    public static final class a {
        public a(b0 b0Var, b0 b0Var2, T t12) {
            b0Var2.getClass();
        }
    }

    /* compiled from: Splitter.java */
    public static abstract class b extends AbstractC37256b<String> {

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f359000d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC37259e f359001e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f359002f;

        /* renamed from: g, reason: collision with root package name */
        public int f359003g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f359004h;

        public b(b0 b0Var, CharSequence charSequence) {
            this.f359001e = b0Var.f358996a;
            this.f359002f = b0Var.f358997b;
            this.f359004h = b0Var.f358999d;
            this.f359000d = charSequence;
        }

        @Override // com.google.common.base.AbstractC37256b
        @I41.a
        public final String a() {
            int iC2;
            CharSequence charSequence;
            AbstractC37259e abstractC37259e;
            int i12 = this.f359003g;
            while (true) {
                int i13 = this.f359003g;
                if (i13 == -1) {
                    this.f358988b = AbstractC37256b.EnumC10651b.f358993d;
                    return null;
                }
                iC2 = c(i13);
                charSequence = this.f359000d;
                if (iC2 == -1) {
                    iC2 = charSequence.length();
                    this.f359003g = -1;
                } else {
                    this.f359003g = b(iC2);
                }
                int i14 = this.f359003g;
                if (i14 == i12) {
                    int i15 = i14 + 1;
                    this.f359003g = i15;
                    if (i15 > charSequence.length()) {
                        this.f359003g = -1;
                    }
                } else {
                    while (true) {
                        abstractC37259e = this.f359001e;
                        if (i12 >= iC2 || !abstractC37259e.m(charSequence.charAt(i12))) {
                            break;
                        }
                        i12++;
                    }
                    while (iC2 > i12 && abstractC37259e.m(charSequence.charAt(iC2 - 1))) {
                        iC2--;
                    }
                    if (!this.f359002f || i12 != iC2) {
                        break;
                    }
                    i12 = this.f359003g;
                }
            }
            int i16 = this.f359004h;
            if (i16 == 1) {
                iC2 = charSequence.length();
                this.f359003g = -1;
                while (iC2 > i12 && abstractC37259e.m(charSequence.charAt(iC2 - 1))) {
                    iC2--;
                }
            } else {
                this.f359004h = i16 - 1;
            }
            return charSequence.subSequence(i12, iC2).toString();
        }

        public abstract int b(int i12);

        public abstract int c(int i12);
    }

    /* compiled from: Splitter.java */
    public interface c {
        Iterator<String> a(b0 b0Var, CharSequence charSequence);
    }

    public b0(c cVar, boolean z12, AbstractC37259e abstractC37259e, int i12) {
        this.f358998c = cVar;
        this.f358997b = z12;
        this.f358996a = abstractC37259e;
        this.f358999d = i12;
    }

    public static b0 a(char c12) {
        return new b0(new T(new AbstractC37259e.l(c12)));
    }

    @XY0.c
    @XY0.d
    public static void b() {
        L.f358964a.getClass();
        C37280y c37280y = new C37280y(Pattern.compile("\r\n|\n|\r"));
        M.f("The pattern may not match the empty string: %s", !c37280y.a("").f359068a.matches(), c37280y);
        new b0(new X(c37280y));
    }

    public final Iterable c(String str) {
        str.getClass();
        return new a0(this, str);
    }

    public final List<String> d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> itA = this.f358998c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final b0 e() {
        AbstractC37259e.B b12 = AbstractC37259e.B.f359010d;
        b12.getClass();
        return new b0(this.f358998c, this.f358997b, b12, this.f358999d);
    }

    public b0(c cVar) {
        this(cVar, false, AbstractC37259e.x.f359026c, Integer.MAX_VALUE);
    }
}
