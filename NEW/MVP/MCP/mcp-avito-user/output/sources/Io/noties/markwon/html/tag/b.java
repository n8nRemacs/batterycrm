package io.noties.markwon.html.tag;

import io.noties.markwon.B;
import io.noties.markwon.y;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: EmphasisHandler.java */
/* loaded from: classes8.dex */
public class b extends h {
    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Arrays.asList("i", "em", "cite", "dfn");
    }

    @Override // io.noties.markwon.html.tag.h
    @P
    public final Object d(@N io.noties.markwon.g gVar, @N y yVar, @N io.noties.markwon.html.f fVar) {
        B bA2 = gVar.f401717g.a(Q61.j.class);
        if (bA2 == null) {
            return null;
        }
        return bA2.a(gVar, yVar);
    }
}
