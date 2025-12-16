package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.x;

/* compiled from: ParagraphParser.java */
/* loaded from: classes7.dex */
public class r extends R61.a {

    /* renamed from: a, reason: collision with root package name */
    public final x f420360a = new x();

    /* renamed from: b, reason: collision with root package name */
    public final o f420361b = new o();

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420360a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    @Override // R61.a, R61.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.r.d(java.lang.CharSequence):void");
    }

    @Override // R61.a, R61.d
    public final void f(org.commonmark.parser.a aVar) {
        StringBuilder sb2 = this.f420361b.f420334b;
        if (sb2.length() > 0) {
            aVar.a(this.f420360a, sb2.toString());
        }
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        if (hVar.f420287h) {
            return null;
        }
        return R61.c.a(hVar.f420281b);
    }

    @Override // R61.a, R61.d
    public final void h() {
        if (this.f420361b.f420334b.length() == 0) {
            this.f420360a.f();
        }
    }
}
