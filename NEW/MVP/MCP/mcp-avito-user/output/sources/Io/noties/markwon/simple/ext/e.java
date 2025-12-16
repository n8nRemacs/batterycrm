package io.noties.markwon.simple.ext;

import Q61.v;
import io.noties.markwon.AbstractC41740a;
import io.noties.markwon.C;
import io.noties.markwon.g;
import io.noties.markwon.n;
import io.noties.markwon.y;
import j.N;
import java.util.Iterator;
import org.commonmark.parser.d;
import ru.cyberity.cbr.core.common.B;
import ru.cyberity.cbr.core.common.s;

/* compiled from: SimpleExtPlugin.java */
/* loaded from: classes8.dex */
public class e extends AbstractC41740a {

    /* renamed from: a, reason: collision with root package name */
    public final io.noties.markwon.simple.ext.b f401934a = new io.noties.markwon.simple.ext.b();

    /* compiled from: SimpleExtPlugin.java */
    public class a implements n.c<d> {
        @Override // io.noties.markwon.n.c
        public final void a(@N v vVar, @N n nVar) {
            d dVar = (d) vVar;
            int length = nVar.length();
            nVar.F(dVar);
            C cBuilder = nVar.builder();
            g gVarU = nVar.u();
            y yVarF = nVar.f();
            dVar.f401933f.getClass();
            C.c(cBuilder, s.a.a(gVarU, yVarF), length, nVar.length());
        }
    }

    /* compiled from: SimpleExtPlugin.java */
    public interface b {
    }

    @N
    public final void a(@N B b12) {
        io.noties.markwon.simple.ext.b bVar = this.f401934a;
        if (bVar.f401931b) {
            throw new IllegalStateException("SimpleExtBuilder is already built, do not mutate SimpleExtPlugin after configuration is finished");
        }
        bVar.f401930a.add(new c(b12));
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configureParser(@N d.b bVar) {
        io.noties.markwon.simple.ext.b bVar2 = this.f401934a;
        if (bVar2.f401931b) {
            throw new IllegalStateException("SimpleExtBuilder is already built, do not mutate SimpleExtPlugin after configuration is finished");
        }
        bVar2.f401931b = true;
        Iterator it = bVar2.f401930a.iterator();
        while (it.hasNext()) {
            S61.a aVar = (S61.a) it.next();
            if (aVar == null) {
                bVar.getClass();
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            bVar.f420377b.add(aVar);
        }
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configureVisitor(@N n.b bVar) {
        bVar.a(d.class, new a());
    }
}
