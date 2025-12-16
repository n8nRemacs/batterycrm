package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
class An extends tn<F2> {
    public An(Bn bn2, F2 f22) {
        super(f22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.tn
    public boolean a(tn<F2> tnVar) {
        String str = ((F2) this.f381906a).f378114a;
        if (str == null ? tnVar.f381906a.f378114a != null : !str.equals(tnVar.f381906a.f378114a)) {
            return false;
        }
        String str2 = ((F2) this.f381906a).f378115b;
        return str2 != null ? str2.equals(tnVar.f381906a.f378115b) : tnVar.f381906a.f378115b == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = ((F2) this.f381906a).f378114a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = ((F2) this.f381906a).f378115b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
