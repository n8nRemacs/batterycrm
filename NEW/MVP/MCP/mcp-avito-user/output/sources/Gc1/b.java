package Gc1;

import Mb1.a;
import Mb1.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class b implements InterfaceC43172j {
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        Mb1.b bVar = (Mb1.b) obj;
        if (L.f(bVar, b.a.f10840a)) {
            a.C0687a c0687a = a.C0687a.f10833a;
        } else if (L.f(bVar, b.d.f10843a)) {
            a.b bVar2 = a.b.f10834a;
        } else if (L.f(bVar, b.e.f10844a)) {
            a.c cVar = a.c.f10835a;
        } else if (L.f(bVar, b.f.f10845a)) {
            a.d dVar = a.d.f10836a;
        } else if (L.f(bVar, b.c.f10842a) || L.f(bVar, b.g.f10846a)) {
            a.e eVar = a.e.f10837a;
        } else if (L.f(bVar, b.i.f10848a) || L.f(bVar, b.k.f10850a)) {
            a.g gVar = a.g.f10839a;
        } else {
            if (!L.f(bVar, b.C0688b.f10841a) && !L.f(bVar, b.h.f10847a) && !L.f(bVar, b.j.f10849a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.f fVar = a.f.f10838a;
        }
        throw null;
    }
}
