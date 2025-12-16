package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class kh6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh6 b;
    public final /* synthetic */ ghb c;

    public /* synthetic */ kh6(oh6 oh6Var, ghb ghbVar, int i) {
        this.a = i;
        this.b = oh6Var;
        this.c = ghbVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Iterator it = this.b.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).j(this.c);
                }
                break;
            case 1:
                Iterator it2 = this.b.b.iterator();
                while (it2.hasNext()) {
                    ((dhb) it2.next()).p(this.c);
                }
                break;
            case 2:
                Iterator it3 = this.b.b.iterator();
                while (it3.hasNext()) {
                    ((dhb) it3.next()).v(this.c);
                }
                break;
            case 3:
                Iterator it4 = this.b.b.iterator();
                while (it4.hasNext()) {
                    ((dhb) it4.next()).a(this.c);
                }
                break;
            case 4:
                Iterator it5 = this.b.b.iterator();
                while (it5.hasNext()) {
                    ((dhb) it5.next()).u(this.c);
                }
                break;
            case 5:
                Iterator it6 = this.b.b.iterator();
                while (it6.hasNext()) {
                    ((dhb) it6.next()).b(this.c);
                }
                break;
            case 6:
                Iterator it7 = this.b.b.iterator();
                while (it7.hasNext()) {
                    ((dhb) it7.next()).r(this.c);
                }
                break;
            case 7:
                Iterator it8 = this.b.b.iterator();
                while (it8.hasNext()) {
                    ((dhb) it8.next()).i(this.c);
                }
                break;
            case 8:
                Iterator it9 = this.b.b.iterator();
                while (it9.hasNext()) {
                    ((dhb) it9.next()).l(this.c);
                }
                break;
            default:
                Iterator it10 = this.b.b.iterator();
                while (it10.hasNext()) {
                    ((dhb) it10.next()).f(this.c);
                }
                break;
        }
        return qqg.a;
    }
}
