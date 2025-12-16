package defpackage;

import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class v3h implements xy8 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final fk6 h;
    public final bwf i;
    public final bwf j;

    public v3h(String str, String str2, String str3, int i, int i2, int i3, float f, fk6 fk6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = f;
        this.h = fk6Var;
        final int i4 = 0;
        this.i = new bwf(new cm6(this) { // from class: u3h
            public final /* synthetic */ v3h b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i5 = i4;
                v3h v3hVar = this.b;
                switch (i5) {
                    case 0:
                        fk6 fk6Var2 = v3hVar.h;
                        if (fk6Var2 != null) {
                            return fk6Var2;
                        }
                        AtomicInteger atomicInteger = cyg.a;
                        int iMin = Math.min(v3hVar.e, v3hVar.f);
                        f2 f2Var = new f2(0, fk6.w0);
                        int i6 = Integer.MAX_VALUE;
                        fk6 fk6Var3 = fk6.c;
                        while (f2Var.hasNext()) {
                            fk6 fk6Var4 = (fk6) f2Var.next();
                            int iAbs = Math.abs(fk6Var4.b - iMin);
                            if (iAbs >= i6) {
                                return fk6Var3;
                            }
                            fk6Var3 = fk6Var4;
                            i6 = iAbs;
                        }
                        return fk6Var3;
                    default:
                        return new Size(v3hVar.e, v3hVar.f);
                }
            }
        });
        final int i5 = 1;
        this.j = new bwf(new cm6(this) { // from class: u3h
            public final /* synthetic */ v3h b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i52 = i5;
                v3h v3hVar = this.b;
                switch (i52) {
                    case 0:
                        fk6 fk6Var2 = v3hVar.h;
                        if (fk6Var2 != null) {
                            return fk6Var2;
                        }
                        AtomicInteger atomicInteger = cyg.a;
                        int iMin = Math.min(v3hVar.e, v3hVar.f);
                        f2 f2Var = new f2(0, fk6.w0);
                        int i6 = Integer.MAX_VALUE;
                        fk6 fk6Var3 = fk6.c;
                        while (f2Var.hasNext()) {
                            fk6 fk6Var4 = (fk6) f2Var.next();
                            int iAbs = Math.abs(fk6Var4.b - iMin);
                            if (iAbs >= i6) {
                                return fk6Var3;
                            }
                            fk6Var3 = fk6Var4;
                            i6 = iAbs;
                        }
                        return fk6Var3;
                    default:
                        return new Size(v3hVar.e, v3hVar.f);
                }
            }
        });
    }

    @Override // defpackage.xy8
    public final String a() {
        return this.b;
    }

    public final fk6 b() {
        return (fk6) this.i.getValue();
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("VideoFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", codecs: ");
        sbL.append(this.c);
        sbL.append(", bitrate: ");
        sbL.append(this.d);
        sbL.append(", width: ");
        hf3.g(sbL, this.e, ", height: ", this.f, ", frameRate: ");
        sbL.append(this.g);
        sbL.append(", serverChooseFrameSize: ");
        sbL.append(this.h);
        sbL.append(")");
        return sbL.toString();
    }
}
