package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class j87 extends k2g {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ m87 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j87(String str, m87 m87Var, int i, int i2) {
        super(str, true);
        this.f = m87Var;
        this.g = i;
    }

    @Override // defpackage.k2g
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.u0.getClass();
                try {
                    this.f.G0.P(this.g, 9);
                    synchronized (this.f) {
                        this.f.I0.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            case 1:
                this.f.u0.getClass();
                try {
                    this.f.G0.P(this.g, 9);
                    synchronized (this.f) {
                        this.f.I0.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
            default:
                this.f.u0.getClass();
                synchronized (this.f) {
                    this.f.I0.remove(Integer.valueOf(this.g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j87(String str, m87 m87Var, int i, List list) {
        super(str, true);
        this.f = m87Var;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j87(String str, m87 m87Var, int i, List list, boolean z) {
        super(str, true);
        this.f = m87Var;
        this.g = i;
    }
}
