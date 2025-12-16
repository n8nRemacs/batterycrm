package defpackage;

/* loaded from: classes.dex */
public final class h72 extends h07 {
    public final /* synthetic */ int a;
    public byte[] b;
    public Object c;

    public /* synthetic */ h72(int i) {
        this.a = i;
    }

    @Override // defpackage.h07
    public final byte[] a() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return (byte[]) this.c;
        }
    }

    @Override // defpackage.h07
    public final lbg b() {
        switch (this.a) {
            case 0:
                return lbg.certificate_request;
            case 1:
                return lbg.encrypted_extensions;
            default:
                return lbg.finished;
        }
    }
}
