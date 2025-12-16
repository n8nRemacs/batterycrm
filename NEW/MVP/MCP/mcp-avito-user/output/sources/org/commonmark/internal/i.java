package org.commonmark.internal;

import Q61.AbstractC14868b;

/* compiled from: FencedCodeBlockParser.java */
/* loaded from: classes7.dex */
public class i extends R61.a {

    /* renamed from: a, reason: collision with root package name */
    public final Q61.k f420296a;

    /* renamed from: b, reason: collision with root package name */
    public String f420297b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f420298c;

    /* compiled from: FencedCodeBlockParser.java */
    public static class a extends R61.b {
        /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
        @Override // R61.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final org.commonmark.internal.d a(org.commonmark.internal.h r12, R61.g r13) {
            /*
                r11 = this;
                r13 = 0
                r0 = 1
                int r1 = r12.f420286g
                r2 = 4
                r3 = 0
                if (r1 < r2) goto L9
                return r3
            L9:
                int r2 = r12.f420284e
                java.lang.CharSequence r12 = r12.f420280a
                int r4 = r12.length()
                r6 = r13
                r7 = r6
                r5 = r2
            L14:
                r8 = 126(0x7e, float:1.77E-43)
                r9 = 96
                if (r5 >= r4) goto L28
                char r10 = r12.charAt(r5)
                if (r10 == r9) goto L25
                if (r10 == r8) goto L23
                goto L28
            L23:
                int r7 = r7 + r0
                goto L26
            L25:
                int r6 = r6 + r0
            L26:
                int r5 = r5 + r0
                goto L14
            L28:
                r4 = 3
                if (r6 < r4) goto L4a
                if (r7 != 0) goto L4a
                int r4 = r2 + r6
                int r5 = r12.length()
            L33:
                r7 = -1
                if (r4 >= r5) goto L3f
                char r8 = r12.charAt(r4)
                if (r8 != r9) goto L3d
                goto L40
            L3d:
                int r4 = r4 + r0
                goto L33
            L3f:
                r4 = r7
            L40:
                if (r4 == r7) goto L44
            L42:
                r12 = r3
                goto L53
            L44:
                org.commonmark.internal.i r12 = new org.commonmark.internal.i
                r12.<init>(r9, r6, r1)
                goto L53
            L4a:
                if (r7 < r4) goto L42
                if (r6 != 0) goto L42
                org.commonmark.internal.i r12 = new org.commonmark.internal.i
                r12.<init>(r8, r7, r1)
            L53:
                if (r12 == 0) goto L66
                R61.d[] r0 = new R61.d[r0]
                r0[r13] = r12
                org.commonmark.internal.d r13 = new org.commonmark.internal.d
                r13.<init>(r0)
                Q61.k r12 = r12.f420296a
                int r12 = r12.f13484g
                int r2 = r2 + r12
                r13.f420259b = r2
                return r13
            L66:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.i.a.a(org.commonmark.internal.h, R61.g):org.commonmark.internal.d");
        }
    }

    public i(char c12, int i12, int i13) {
        Q61.k kVar = new Q61.k();
        this.f420296a = kVar;
        this.f420298c = new StringBuilder();
        kVar.f13483f = c12;
        kVar.f13484g = i12;
        kVar.f13485h = i13;
    }

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420296a;
    }

    @Override // R61.a, R61.d
    public final void d(CharSequence charSequence) {
        if (this.f420297b == null) {
            this.f420297b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f420298c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        int i12 = hVar.f420284e;
        int i13 = hVar.f420281b;
        CharSequence charSequence = hVar.f420280a;
        int i14 = hVar.f420286g;
        Q61.k kVar = this.f420296a;
        if (i14 < 4) {
            char c12 = kVar.f13483f;
            int i15 = kVar.f13484g;
            int iB2 = org.commonmark.internal.util.d.b(c12, i12, charSequence.length(), charSequence) - i12;
            if (iB2 >= i15 && org.commonmark.internal.util.d.c(i12 + iB2, charSequence.length(), charSequence) == charSequence.length()) {
                return new b(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i16 = kVar.f13485h; i16 > 0 && i13 < length && charSequence.charAt(i13) == ' '; i16--) {
            i13++;
        }
        return R61.c.a(i13);
    }

    @Override // R61.a, R61.d
    public final void h() {
        String strB = org.commonmark.internal.util.a.b(this.f420297b.trim());
        Q61.k kVar = this.f420296a;
        kVar.f13486i = strB;
        kVar.f13487j = this.f420298c.toString();
    }
}
