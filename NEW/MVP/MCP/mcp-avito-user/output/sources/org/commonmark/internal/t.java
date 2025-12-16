package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.B;

/* compiled from: ThematicBreakParser.java */
/* loaded from: classes7.dex */
public class t extends R61.a {

    /* renamed from: a, reason: collision with root package name */
    public final B f420365a = new B();

    /* compiled from: ThematicBreakParser.java */
    public static class a extends R61.b {
        @Override // R61.e
        public final d a(h hVar, R61.g gVar) {
            if (hVar.f420286g >= 4) {
                return null;
            }
            int i12 = hVar.f420284e;
            CharSequence charSequence = hVar.f420280a;
            int length = charSequence.length();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i12 < length) {
                    char cCharAt = charSequence.charAt(i12);
                    if (cCharAt != '\t' && cCharAt != ' ') {
                        if (cCharAt == '*') {
                            i15++;
                        } else if (cCharAt == '-') {
                            i13++;
                        } else {
                            if (cCharAt != '_') {
                                break;
                            }
                            i14++;
                        }
                    }
                    i12++;
                } else if ((i13 >= 3 && i14 == 0 && i15 == 0) || ((i14 >= 3 && i13 == 0 && i15 == 0) || (i15 >= 3 && i13 == 0 && i14 == 0))) {
                    d dVar = new d(new t());
                    dVar.f420259b = charSequence.length();
                    return dVar;
                }
            }
            return null;
        }
    }

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420365a;
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        return null;
    }
}
