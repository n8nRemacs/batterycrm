package defpackage;

/* loaded from: classes.dex */
public final class ecg extends fhh {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public ecg(iz8 iz8Var) {
        this.a = 1;
        this.d = iz8Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.fhh, defpackage.ehh
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.fhh, defpackage.ehh
    public final void b() {
        switch (this.a) {
            case 0:
                ((fcg) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ehh ehhVar = (ehh) ((iz8) this.d).o;
                    if (ehhVar != null) {
                        ehhVar.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ehh
    public final void c() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((fcg) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                iz8 iz8Var = (iz8) this.d;
                if (i == iz8Var.a.size()) {
                    ehh ehhVar = (ehh) iz8Var.o;
                    if (ehhVar != null) {
                        ehhVar.c();
                    }
                    this.c = 0;
                    this.b = false;
                    iz8Var.c = false;
                    break;
                }
                break;
        }
    }

    public ecg(fcg fcgVar, int i) {
        this.a = 0;
        this.d = fcgVar;
        this.c = i;
        this.b = false;
    }
}
