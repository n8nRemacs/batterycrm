package io.noties.markwon.simple.ext;

import Q61.A;
import Q61.v;
import j.N;
import org.commonmark.internal.f;
import ru.cyberity.cbr.core.common.B;

/* compiled from: SimpleExtDelimiterProcessor.java */
/* loaded from: classes8.dex */
class c implements S61.a {

    /* renamed from: a, reason: collision with root package name */
    public final B f401932a;

    public c(@N B b12) {
        this.f401932a = b12;
    }

    @Override // S61.a
    public final char a() {
        return '$';
    }

    @Override // S61.a
    public final int b() {
        return 2;
    }

    @Override // S61.a
    public final char c() {
        return '@';
    }

    @Override // S61.a
    public final int d(f fVar, f fVar2) {
        return (fVar.f420275g < 2 || fVar2.f420275g < 2) ? 0 : 2;
    }

    @Override // S61.a
    public final void e(A a12, A a13, int i12) {
        d dVar = new d(this.f401932a);
        v vVar = a12.f13504e;
        while (vVar != null && vVar != a13) {
            v vVar2 = vVar.f13504e;
            dVar.b(vVar);
            vVar = vVar2;
        }
        dVar.f();
        v vVar3 = a12.f13504e;
        dVar.f13504e = vVar3;
        if (vVar3 != null) {
            vVar3.f13503d = dVar;
        }
        dVar.f13503d = a12;
        a12.f13504e = dVar;
        v vVar4 = a12.f13500a;
        dVar.f13500a = vVar4;
        if (dVar.f13504e == null) {
            vVar4.f13502c = dVar;
        }
    }
}
