package com.avito.security;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class e0 implements v1<x0> {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f338578a;

    /* renamed from: b, reason: collision with root package name */
    private final int f338579b;

    /* renamed from: c, reason: collision with root package name */
    private final int f338580c;

    /* renamed from: d, reason: collision with root package name */
    private final s0<CharSequence, Integer, m1<Integer, Integer>> f338581d;

    public static final class a implements Iterator<x0> {

        /* renamed from: a, reason: collision with root package name */
        private int f338582a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f338583b;

        /* renamed from: c, reason: collision with root package name */
        private int f338584c;

        /* renamed from: d, reason: collision with root package name */
        private x0 f338585d;

        /* renamed from: e, reason: collision with root package name */
        private int f338586e;

        public a() {
            int iA2 = s1.a(e0.this.f338579b, 0, e0.this.f338578a.length());
            this.f338583b = iA2;
            this.f338584c = iA2;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f338584c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f338582a = r1
                r0 = 0
                r6.f338585d = r0
                goto L99
            Lc:
                com.avito.security.e0 r0 = com.avito.security.e0.this
                int r0 = com.avito.security.e0.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f338586e
                int r0 = r0 + r3
                r6.f338586e = r0
                com.avito.security.e0 r4 = com.avito.security.e0.this
                int r4 = com.avito.security.e0.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f338584c
                com.avito.security.e0 r4 = com.avito.security.e0.this
                java.lang.CharSequence r4 = com.avito.security.e0.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                int r0 = r6.f338583b
                com.avito.security.x0 r1 = new com.avito.security.x0
                com.avito.security.e0 r4 = com.avito.security.e0.this
                java.lang.CharSequence r4 = com.avito.security.e0.b(r4)
                int r4 = com.avito.security.o2.a(r4)
                r1.<init>(r0, r4)
            L42:
                r6.f338585d = r1
            L44:
                r6.f338584c = r2
                goto L97
            L47:
                com.avito.security.e0 r0 = com.avito.security.e0.this
                com.avito.security.s0 r0 = com.avito.security.e0.a(r0)
                com.avito.security.e0 r4 = com.avito.security.e0.this
                java.lang.CharSequence r4 = com.avito.security.e0.b(r4)
                int r5 = r6.f338584c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.a(r4, r5)
                com.avito.security.m1 r0 = (com.avito.security.m1) r0
                if (r0 != 0) goto L73
                int r0 = r6.f338583b
                com.avito.security.x0 r1 = new com.avito.security.x0
                com.avito.security.e0 r4 = com.avito.security.e0.this
                java.lang.CharSequence r4 = com.avito.security.e0.b(r4)
                int r4 = com.avito.security.o2.a(r4)
                r1.<init>(r0, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f338583b
                com.avito.security.x0 r4 = com.avito.security.q1.d(r4, r2)
                r6.f338585d = r4
                int r2 = r2 + r0
                r6.f338583b = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f338582a = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.security.e0.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x0 next() {
            if (this.f338582a == -1) {
                a();
            }
            if (this.f338582a == 0) {
                throw new NoSuchElementException();
            }
            x0 x0Var = this.f338585d;
            if (x0Var == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.f338585d = null;
            this.f338582a = -1;
            return x0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f338582a == -1) {
                a();
            }
            return this.f338582a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(CharSequence charSequence, int i12, int i13, s0<? super CharSequence, ? super Integer, m1<Integer, Integer>> s0Var) {
        y0.b(charSequence, "input");
        y0.b(s0Var, "getNextMatch");
        this.f338578a = charSequence;
        this.f338579b = i12;
        this.f338580c = i13;
        this.f338581d = s0Var;
    }

    @Override // com.avito.security.v1
    public Iterator<x0> iterator() {
        return new a();
    }
}
