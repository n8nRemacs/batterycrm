package defpackage;

import org.webrtc.RTCStats;

/* loaded from: classes.dex */
public final /* synthetic */ class zi4 implements oa8, gu3, bbd, m7c, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ zi4(hd hdVar, String str, long j, long j2) {
        this.a = 0;
        this.b = str;
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        Object obj2 = ((RTCStats) obj).getMembers().get(this.b);
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        w00 w00Var = null;
        String str = this.b;
        switch (i) {
            case 1:
                wqi.e("qi9", "Can't update attach async localId = " + str, null);
                return;
            case 2:
                x10 x10Var = (x10) obj;
                for (int i2 = 0; i2 < x10Var.b(); i2++) {
                    if (ssi.b(str, x10Var.d(i2).r)) {
                        if (i2 < 0 || i2 >= x10Var.b()) {
                            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
                        }
                        x10Var.a.remove(i2);
                    }
                }
                return;
            default:
                x00 x00Var = (x00) obj;
                w00 w00Var2 = x00Var.e;
                if (w00Var2 == null) {
                    w00Var2 = w00.j;
                }
                if (w00Var2 != null) {
                    v00 v00VarA = w00Var2.a();
                    v00VarA.b = str;
                    w00Var = new w00(v00VarA);
                }
                x00Var.e = w00Var;
                return;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        ewg ewgVar = (ewg) obj;
        switch (this.a) {
            case 6:
                ewgVar.getClass();
                dsd dsdVarC = dsd.c(1, "SELECT upload_status FROM uploads WHERE attach_local_id=?");
                dsdVarC.f(1, this.b);
                return new yr8(new bwg(ewgVar, dsdVarC, 2));
            default:
                ewgVar.getClass();
                return new kk3(2, new jad(ewgVar, 16, this.b));
        }
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        ((fl5) obj).getClass();
        wqi.c("fl5", "videoDebugListener.onVideoDecoderInitialized decoder = " + this.b, new Object[0]);
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        String str = ((tvg) obj).a;
        return str != null && str.equals(this.b);
    }

    public /* synthetic */ zi4(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
