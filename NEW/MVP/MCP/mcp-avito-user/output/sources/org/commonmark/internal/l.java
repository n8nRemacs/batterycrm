package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.x;
import java.util.ArrayList;

/* compiled from: IndentedCodeBlockParser.java */
/* loaded from: classes7.dex */
public class l extends R61.a {

    /* renamed from: a, reason: collision with root package name */
    public final Q61.q f420306a = new Q61.q();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f420307b = new ArrayList();

    /* compiled from: IndentedCodeBlockParser.java */
    public static class a extends R61.b {
        @Override // R61.e
        public final d a(h hVar, R61.g gVar) {
            if (hVar.f420286g < 4 || hVar.f420287h || (hVar.h().c() instanceof x)) {
                return null;
            }
            d dVar = new d(new l());
            dVar.f420260c = hVar.f420282c + 4;
            return dVar;
        }
    }

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420306a;
    }

    @Override // R61.a, R61.d
    public final void d(CharSequence charSequence) {
        this.f420307b.add(charSequence);
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        if (hVar.f420286g >= 4) {
            return new b(-1, hVar.f420282c + 4, false);
        }
        if (hVar.f420287h) {
            return R61.c.a(hVar.f420284e);
        }
        return null;
    }

    @Override // R61.a, R61.d
    public final void h() {
        int i12;
        ArrayList arrayList = this.f420307b;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                CharSequence charSequence = (CharSequence) arrayList.get(size);
                int length = charSequence.length();
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        char cCharAt = charSequence.charAt(i13);
                        if (cCharAt != ' ') {
                            switch (cCharAt) {
                            }
                        }
                        i13++;
                    } else {
                        i13 = -1;
                    }
                }
                if (i13 == -1) {
                    size--;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (i12 = 0; i12 < size + 1; i12++) {
            sb2.append((CharSequence) arrayList.get(i12));
            sb2.append('\n');
        }
        this.f420306a.f13493f = sb2.toString();
    }
}
