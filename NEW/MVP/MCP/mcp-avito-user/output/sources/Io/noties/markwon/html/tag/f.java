package io.noties.markwon.html.tag;

import Q61.r;
import android.text.TextUtils;
import io.noties.markwon.B;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.y;
import j.N;
import j.P;
import java.util.Collection;
import java.util.Collections;

/* compiled from: LinkHandler.java */
/* loaded from: classes8.dex */
public class f extends h {
    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Collections.singleton("a");
    }

    @Override // io.noties.markwon.html.tag.h
    @P
    public final Object d(@N io.noties.markwon.g gVar, @N y yVar, @N io.noties.markwon.html.f fVar) {
        B bA2;
        String str = fVar.b().get("href");
        if (TextUtils.isEmpty(str) || (bA2 = gVar.f401717g.a(r.class)) == null) {
            return null;
        }
        yVar.a(CoreProps.f401656e, str);
        return bA2.a(gVar, yVar);
    }
}
