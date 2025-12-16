package defpackage;

/* loaded from: classes.dex */
public final class uo extends ph6 {
    public final /* synthetic */ bp t0;
    public final /* synthetic */ ep u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(ep epVar, ep epVar2, bp bpVar) {
        super(epVar2);
        this.u0 = epVar;
        this.t0 = bpVar;
    }

    @Override // defpackage.ph6
    public final yye b() {
        return this.t0;
    }

    @Override // defpackage.ph6
    public final boolean c() {
        ep epVar = this.u0;
        if (epVar.getInternalPopup().a()) {
            return true;
        }
        epVar.s0.n(epVar.getTextDirection(), epVar.getTextAlignment());
        return true;
    }
}
