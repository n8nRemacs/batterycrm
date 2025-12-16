package io.noties.markwon.html.tag;

import android.text.style.StrikethroughSpan;
import io.noties.markwon.B;
import io.noties.markwon.C;
import io.noties.markwon.html.p;
import io.noties.markwon.n;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Collection;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;

/* compiled from: StrikeHandler.java */
/* loaded from: classes8.dex */
public class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f401897a;

    static {
        boolean z12;
        try {
            Class.forName("org.commonmark.ext.gfm.strikethrough.Strikethrough");
            z12 = true;
        } catch (Throwable unused) {
            z12 = false;
        }
        f401897a = z12;
    }

    @P
    public static Object d(@N n nVar) {
        io.noties.markwon.g gVarU = nVar.u();
        B bA2 = gVarU.a().a(Strikethrough.class);
        if (bA2 == null) {
            return null;
        }
        return bA2.a(gVarU, nVar.f());
    }

    @Override // io.noties.markwon.html.p
    public final void a(@N n nVar, @N io.noties.markwon.html.j jVar, @N io.noties.markwon.html.f fVar) {
        if (fVar.d()) {
            p.c(nVar, jVar, fVar.a());
        }
        C.c(nVar.builder(), f401897a ? d(nVar) : new StrikethroughSpan(), fVar.start(), fVar.f());
    }

    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Arrays.asList("s", "del");
    }
}
