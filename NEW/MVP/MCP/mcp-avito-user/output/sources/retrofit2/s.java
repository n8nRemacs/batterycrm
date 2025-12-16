package retrofit2;

import java.util.Iterator;

/* compiled from: ParameterHandler.java */
/* loaded from: classes9.dex */
class s extends u<Iterable<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f430019a;

    public s(u uVar) {
        this.f430019a = uVar;
    }

    @Override // retrofit2.u
    public final void a(w wVar, @I41.h Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f430019a.a(wVar, it.next());
        }
    }
}
