package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class u79 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5c b;
    public final /* synthetic */ int c;

    public /* synthetic */ u79(a5c a5cVar, int i, int i2) {
        this.a = i2;
        this.b = a5cVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a5c a5cVar = this.b;
                if (a5cVar.S(25) || a5cVar.S(33)) {
                    boolean zS = a5cVar.S(33);
                    int i = this.c;
                    if (!zS) {
                        a5cVar.g0(i);
                        break;
                    } else {
                        a5cVar.h0(i, 1);
                        break;
                    }
                }
                break;
            default:
                a5c a5cVar2 = this.b;
                if (a5cVar2.S(26) || a5cVar2.S(34)) {
                    int i2 = this.c;
                    if (i2 == -100) {
                        if (!a5cVar2.S(34)) {
                            a5cVar2.f0(true);
                            break;
                        } else {
                            a5cVar2.e0(1, true);
                            break;
                        }
                    } else if (i2 == -1) {
                        if (!a5cVar2.S(34)) {
                            a5cVar2.o();
                            break;
                        } else {
                            a5cVar2.r(1);
                            break;
                        }
                    } else if (i2 == 1) {
                        if (!a5cVar2.S(34)) {
                            a5cVar2.M();
                            break;
                        } else {
                            a5cVar2.N(1);
                            break;
                        }
                    } else if (i2 == 100) {
                        if (!a5cVar2.S(34)) {
                            a5cVar2.f0(false);
                            break;
                        } else {
                            a5cVar2.e0(1, false);
                            break;
                        }
                    } else if (i2 == 101) {
                        if (!a5cVar2.S(34)) {
                            a5cVar2.P();
                            a5cVar2.f0(true);
                            break;
                        } else {
                            a5cVar2.P();
                            a5cVar2.e0(1, true);
                            break;
                        }
                    } else {
                        wy1.p(i2, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                        break;
                    }
                }
                break;
        }
    }
}
