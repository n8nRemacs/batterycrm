package defpackage;

/* loaded from: classes2.dex */
public final class qud implements pud {
    public final y6d a;

    public qud(y6d y6dVar) {
        if (y6dVar == null) {
            throw new IllegalArgumentException("Illegal 'logger' value: null");
        }
        this.a = y6dVar;
    }

    @Override // defpackage.pud
    public final void a(int i, byte[] bArr) {
        int i2 = u8i.a[az1.v(i)];
        this.a.log("RtcNotifications", "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : h27.a(bArr) : new String(bArr)));
    }

    @Override // defpackage.pud
    public final void b(oud oudVar) {
        this.a.log("RtcNotifications", "<- " + oudVar);
    }

    @Override // defpackage.pud
    public final void c(Throwable th) {
        this.a.log("RtcNotifications", "<- " + th);
    }
}
