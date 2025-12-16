package defpackage;

/* loaded from: classes2.dex */
public interface wl {
    tl f();

    void i(tl tlVar);

    default tl s(vl vlVar) {
        tl tlVarD = vlVar.d(f());
        i(tlVarD);
        return tlVarD;
    }
}
