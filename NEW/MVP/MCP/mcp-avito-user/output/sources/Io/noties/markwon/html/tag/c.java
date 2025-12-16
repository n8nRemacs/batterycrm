package io.noties.markwon.html.tag;

import io.noties.markwon.B;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.y;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: HeadingHandler.java */
/* loaded from: classes8.dex */
public class c extends h {
    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
    }

    @Override // io.noties.markwon.html.tag.h
    @P
    public final Object d(@N io.noties.markwon.g gVar, @N y yVar, @N io.noties.markwon.html.f fVar) throws NumberFormatException {
        int i12;
        B bA2 = gVar.f401717g.a(Q61.m.class);
        if (bA2 == null) {
            return null;
        }
        try {
            i12 = Integer.parseInt(fVar.name().substring(1));
        } catch (NumberFormatException e12) {
            e12.printStackTrace();
            i12 = 0;
        }
        if (i12 < 1 || i12 > 6) {
            return null;
        }
        yVar.a(CoreProps.f401655d, Integer.valueOf(i12));
        return bA2.a(gVar, yVar);
    }
}
