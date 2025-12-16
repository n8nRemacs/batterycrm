package defpackage;

/* loaded from: classes2.dex */
public final class u5g extends n2 {
    public final boolean d;

    public u5g(String str, f4g f4gVar) {
        super(str, 12, f4gVar);
        String str2 = f4gVar.a;
        boolean z = false;
        if (str2 != null && vmf.D(str2, "auto", 0, false, 6) == -1) {
            z = true;
        }
        this.d = !z;
    }

    @Override // defpackage.n2
    public final String toString() {
        return "TextTrack(format: " + ((f4g) ((xy8) this.c)) + ")";
    }
}
