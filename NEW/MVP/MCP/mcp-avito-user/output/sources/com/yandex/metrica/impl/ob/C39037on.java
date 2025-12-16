package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.on, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39037on extends tn<C39177uj> {

    /* renamed from: com.yandex.metrica.impl.ob.on$a */
    public static class a implements un<C39177uj> {
        @Override // com.yandex.metrica.impl.ob.un
        public tn a(C39177uj c39177uj) {
            return new C39037on(c39177uj);
        }
    }

    public C39037on(C39177uj c39177uj) {
        super(c39177uj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.tn
    public boolean a(tn<C39177uj> tnVar) {
        C39177uj c39177uj = tnVar.f381906a;
        T t12 = this.f381906a;
        if (t12 == c39177uj) {
            return true;
        }
        if (((C39177uj) t12).c() != c39177uj.c()) {
            return false;
        }
        if (((C39177uj) this.f381906a).k() == null ? c39177uj.k() != null : !((C39177uj) this.f381906a).k().equals(c39177uj.k())) {
            return false;
        }
        if (((C39177uj) this.f381906a).l() == null ? c39177uj.l() != null : !((C39177uj) this.f381906a).l().equals(c39177uj.l())) {
            return false;
        }
        if (((C39177uj) this.f381906a).e() == null ? c39177uj.e() != null : !((C39177uj) this.f381906a).e().equals(c39177uj.e())) {
            return false;
        }
        if (((C39177uj) this.f381906a).b() == null ? c39177uj.b() != null : !((C39177uj) this.f381906a).b().equals(c39177uj.b())) {
            return false;
        }
        if (((C39177uj) this.f381906a).m() == null ? c39177uj.m() == null : ((C39177uj) this.f381906a).m().equals(c39177uj.m())) {
            return ((C39177uj) this.f381906a).o() != null ? ((C39177uj) this.f381906a).o().equals(c39177uj.o()) : c39177uj.o() == null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        return ((((C39177uj) this.f381906a).c() + ((((((((((((C39177uj) this.f381906a).k() != null ? ((C39177uj) this.f381906a).k().hashCode() : 0) * 31) + (((C39177uj) this.f381906a).l() != null ? ((C39177uj) this.f381906a).l().hashCode() : 0)) * 31) + (((C39177uj) this.f381906a).e() != null ? ((C39177uj) this.f381906a).e().hashCode() : 0)) * 31) + (((C39177uj) this.f381906a).b() != null ? ((C39177uj) this.f381906a).b().hashCode() : 0)) * 31) + (((C39177uj) this.f381906a).m() != null ? ((C39177uj) this.f381906a).m().hashCode() : 0)) * 31)) * 31) + (((C39177uj) this.f381906a).o() != null ? ((C39177uj) this.f381906a).o().hashCode() : 0);
    }
}
