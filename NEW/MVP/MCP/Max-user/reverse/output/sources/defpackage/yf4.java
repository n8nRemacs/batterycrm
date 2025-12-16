package defpackage;

/* loaded from: classes2.dex */
public final class yf4 extends f9j {
    public static final yf4 c = new yf4(0);
    public static final yf4 d = new yf4(1);
    public static final yf4 e = new yf4(2);
    public static final yf4 f = new yf4(3);
    public final /* synthetic */ int b;

    public /* synthetic */ yf4(int i) {
        this.b = i;
    }

    @Override // defpackage.f9j
    public final boolean a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((xf4) obj).equals((xf4) obj2);
            case 1:
                return ((pp6) obj).equals((pp6) obj2);
            case 2:
                return ((t8g) obj).equals((t8g) obj2);
            case 3:
                return ((ece) obj).equals((ece) obj2);
            case 4:
                return ((j09) obj).equals((j09) obj2);
            case 5:
                return ((d14) obj).equals((d14) obj2);
            case 6:
                aya ayaVar = (aya) obj;
                aya ayaVar2 = (aya) obj2;
                return fni.a(ayaVar.a, ayaVar2.a) && fni.a(ayaVar.d, ayaVar2.d) && dnf.k(ayaVar.b, ayaVar2.b);
            case 7:
                return false;
            case 8:
                j6e j6eVar = (j6e) obj;
                j6e j6eVar2 = (j6e) obj2;
                if (new xs(j6eVar.b).equals(new xs(j6eVar2.b))) {
                    return j6eVar.l(j6eVar2);
                }
                return false;
            default:
                return ((t98) obj).q((t98) obj2);
        }
    }

    @Override // defpackage.f9j
    public final boolean b(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((xf4) obj).a == ((xf4) obj2).a;
            case 1:
                return fni.a(((pp6) obj).a(), ((pp6) obj2).a());
            case 2:
                return ((t8g) obj).a == ((t8g) obj2).a;
            case 3:
                return ((ece) obj).a.a == ((ece) obj2).a.a;
            case 4:
                return ((j09) obj).h((j09) obj2);
            case 5:
                return ((d14) obj).a == ((d14) obj2).a;
            case 6:
                return fni.a(((aya) obj).a, ((aya) obj2).a);
            case 7:
                return false;
            case 8:
                j6e j6eVar = (j6e) obj;
                j6e j6eVar2 = (j6e) obj2;
                if (j6eVar.a != j6eVar2.a) {
                    return false;
                }
                return j6eVar.n(j6eVar2);
            default:
                return ((t98) obj).h((t98) obj2);
        }
    }

    @Override // defpackage.f9j
    public Object c(Object obj, Object obj2) {
        switch (this.b) {
            case 9:
                return ((t98) obj).k((t98) obj2);
            default:
                return super.c(obj, obj2);
        }
    }
}
