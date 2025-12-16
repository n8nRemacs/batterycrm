package defpackage;

import com.google.firebase.encoders.EncodingException;

/* loaded from: classes.dex */
public final class dpc implements pyg {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public wu5 d;
    public final qqa e;

    public /* synthetic */ dpc(qqa qqaVar, int i) {
        this.a = i;
        this.e = qqaVar;
    }

    @Override // defpackage.pyg
    public final pyg b(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((cpc) this.e).c(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qdi) this.e).b(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((hmi) this.e).b(this.d, str, this.c);
                return this;
        }
    }

    @Override // defpackage.pyg
    public final pyg c(boolean z) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((cpc) this.e).b(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qdi) this.e).c(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((hmi) this.e).c(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
