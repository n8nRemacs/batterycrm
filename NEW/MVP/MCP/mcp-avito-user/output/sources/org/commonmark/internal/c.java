package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.C14869c;

/* compiled from: BlockQuoteParser.java */
/* loaded from: classes7.dex */
public class c extends R61.a {

    /* renamed from: a, reason: collision with root package name */
    public final C14869c f420257a = new C14869c();

    /* compiled from: BlockQuoteParser.java */
    public static class a extends R61.b {
        @Override // R61.e
        public final d a(h hVar, R61.g gVar) {
            char cCharAt;
            int i12 = hVar.f420284e;
            CharSequence charSequence = hVar.f420280a;
            if (hVar.f420286g >= 4 || i12 >= charSequence.length() || charSequence.charAt(i12) != '>') {
                return null;
            }
            int i13 = hVar.f420286g + hVar.f420282c;
            int i14 = i13 + 1;
            CharSequence charSequence2 = hVar.f420280a;
            int i15 = i12 + 1;
            if (i15 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i15)) == '\t' || cCharAt == ' ')) {
                i14 = i13 + 2;
            }
            d dVar = new d(new c());
            dVar.f420260c = i14;
            return dVar;
        }
    }

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420257a;
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        char cCharAt;
        int i12 = hVar.f420284e;
        CharSequence charSequence = hVar.f420280a;
        if (hVar.f420286g >= 4 || i12 >= charSequence.length() || charSequence.charAt(i12) != '>') {
            return null;
        }
        int i13 = hVar.f420286g + hVar.f420282c;
        int i14 = i13 + 1;
        CharSequence charSequence2 = hVar.f420280a;
        int i15 = i12 + 1;
        if (i15 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i15)) == '\t' || cCharAt == ' ')) {
            i14 = i13 + 2;
        }
        return new b(-1, i14, false);
    }
}
