package io.noties.markwon.html.tag;

import android.text.style.UnderlineSpan;
import io.noties.markwon.C;
import io.noties.markwon.html.p;
import io.noties.markwon.n;
import j.N;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: UnderlineHandler.java */
/* loaded from: classes8.dex */
public class m extends p {
    @Override // io.noties.markwon.html.p
    public final void a(@N n nVar, @N io.noties.markwon.html.j jVar, @N io.noties.markwon.html.f fVar) {
        if (fVar.d()) {
            p.c(nVar, jVar, fVar.a());
        }
        C.c(nVar.builder(), new UnderlineSpan(), fVar.start(), fVar.f());
    }

    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Arrays.asList("u", "ins");
    }
}
