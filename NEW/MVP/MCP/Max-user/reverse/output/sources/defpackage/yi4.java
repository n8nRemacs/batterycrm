package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class yi4 implements oa8, uq4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ yi4(hd hdVar, tb8 tb8Var, g19 g19Var, IOException iOException, boolean z) {
        this.b = tb8Var;
        this.c = g19Var;
        this.d = iOException;
        this.a = z;
    }

    @Override // defpackage.uq4
    public zjd f(int i, lfg lfgVar, int[] iArr) {
        ar4 ar4Var = (ar4) this.b;
        nq4 nq4Var = (nq4) this.c;
        int[] iArr2 = (int[]) this.d;
        ar4Var.getClass();
        fq4 fq4Var = new fq4(ar4Var, nq4Var);
        int i2 = iArr2[i];
        tg7 tg7VarI = wg7.i();
        for (int i3 = 0; i3 < lfgVar.a; i3++) {
            tg7VarI.a(new hq4(i, lfgVar, i3, nq4Var, iArr[i3], this.a, fq4Var, i2));
        }
        return tg7VarI.i();
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        tb8 tb8Var = (tb8) this.b;
        g19 g19Var = (g19) this.c;
        IOException iOException = (IOException) this.d;
        ((fl5) obj).getClass();
        StringBuilder sb = new StringBuilder("MediaLoadData{dataType=");
        sb.append(g19Var.a);
        sb.append(", trackType=");
        sb.append(g19Var.b);
        sb.append(", trackFormat=");
        sb.append((gf6) g19Var.g);
        sb.append(", trackSelectionReason=");
        sb.append(g19Var.c);
        sb.append(", trackSelectionData=");
        sb.append(g19Var.d);
        sb.append(", mediaStartTimeMs=");
        sb.append(g19Var.e);
        sb.append(", mediaEndTimeMs=");
        String strK = ho7.k(sb, g19Var.f, "}");
        StringBuilder sb2 = new StringBuilder("LoadEventInfo{loadTaskId");
        sb2.append(tb8Var.a);
        sb2.append(", dataSpec");
        sb2.append(tb8Var.b);
        sb2.append(", uri");
        sb2.append(tb8Var.c);
        sb2.append(", responseHeaders");
        sb2.append(tb8Var.d);
        sb2.append(", elapsedRealtimeMs");
        sb2.append(tb8Var.e);
        sb2.append(", loadDurationMs");
        sb2.append(tb8Var.f);
        sb2.append(", bytesLoaded");
        wqi.g("fl5", iOException, "onLoadError, wasCanceled %b, loadEventInfo = %s, mediaLoadData = %s", Boolean.valueOf(this.a), ho7.k(sb2, tb8Var.g, "}"), strK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yi4(ar4 ar4Var, nq4 nq4Var, boolean z, int[] iArr) {
        this.b = ar4Var;
        this.c = nq4Var;
        this.a = z;
        this.d = iArr;
    }
}
