package org.jsoup.select;

/* loaded from: classes7.dex */
public class Selector {

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.jsoup.nodes.g a(org.jsoup.nodes.g r9) {
        /*
            java.lang.String r0 = "body"
            org.jsoup.helper.d.b(r0)
            org.jsoup.select.d r0 = org.jsoup.select.g.h(r0)
            org.jsoup.select.a$b r1 = new org.jsoup.select.a$b
            r1.<init>(r9, r0)
            r0 = 0
            r2 = r9
            r3 = r0
        L11:
            org.jsoup.select.NodeFilter$FilterResult r4 = org.jsoup.select.NodeFilter.FilterResult.f421357b
            if (r2 == 0) goto L70
            boolean r5 = r2 instanceof org.jsoup.nodes.g
            org.jsoup.select.NodeFilter$FilterResult r6 = org.jsoup.select.NodeFilter.FilterResult.f421360e
            if (r5 == 0) goto L2c
            r5 = r2
            org.jsoup.nodes.g r5 = (org.jsoup.nodes.g) r5
            org.jsoup.nodes.g r7 = r1.f421365a
            org.jsoup.select.d r8 = r1.f421367c
            boolean r7 = r8.a(r7, r5)
            if (r7 == 0) goto L2c
            r1.f421366b = r5
            r5 = r6
            goto L2d
        L2c:
            r5 = r4
        L2d:
            if (r5 != r6) goto L30
            goto L70
        L30:
            if (r5 != r4) goto L3f
            int r6 = r2.l()
            if (r6 <= 0) goto L3f
            org.jsoup.nodes.k r2 = r2.k(r0)
            int r3 = r3 + 1
            goto L11
        L3f:
            org.jsoup.nodes.k r6 = r2.u()
            org.jsoup.select.NodeFilter$FilterResult r7 = org.jsoup.select.NodeFilter.FilterResult.f421359d
            org.jsoup.select.NodeFilter$FilterResult r8 = org.jsoup.select.NodeFilter.FilterResult.f421358c
            if (r6 != 0) goto L5c
            if (r3 <= 0) goto L5c
            if (r5 == r4) goto L4f
            if (r5 != r8) goto L50
        L4f:
            r5 = r4
        L50:
            org.jsoup.nodes.k r6 = r2.f421096b
            int r3 = r3 + (-1)
            if (r5 != r7) goto L59
            r2.D()
        L59:
            r5 = r4
            r2 = r6
            goto L3f
        L5c:
            if (r5 == r4) goto L62
            if (r5 != r8) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            if (r2 != r9) goto L65
            goto L70
        L65:
            org.jsoup.nodes.k r5 = r2.u()
            if (r4 != r7) goto L6e
            r2.D()
        L6e:
            r2 = r5
            goto L11
        L70:
            org.jsoup.nodes.g r9 = r1.f421366b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.Selector.a(org.jsoup.nodes.g):org.jsoup.nodes.g");
    }
}
