package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class oe1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cda b;

    public /* synthetic */ oe1(cda cdaVar, int i) {
        this.a = i;
        this.b = cdaVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws IOException {
        switch (this.a) {
            case 0:
                ug1 ug1Var = ug1.c;
                pc1 pc1Var = (pc1) this.b;
                String str = pc1Var.b;
                boolean z = pc1Var.c;
                boolean z2 = pc1Var.d;
                boolean z3 = pc1Var.e;
                boolean z4 = pc1Var.f;
                ii4 ii4VarP0 = ug1Var.p0();
                hi4 hi4Var = new hi4();
                hi4Var.a = ":call-join-link";
                hi4Var.c(str, "link");
                hi4Var.c(Boolean.valueOf(z), "is_video_call");
                hi4Var.c(Boolean.valueOf(z2), "video_enabled");
                hi4Var.c(Boolean.valueOf(z3), "microphone_enabled");
                hi4Var.c(Boolean.valueOf(z4), "front_camera_enabled");
                hi4Var.c(Boolean.FALSE, "is_new");
                hi4Var.c(Boolean.TRUE, "replace_top");
                ii4VarP0.c(hi4Var.a(), null);
                break;
            case 1:
                y14 y14Var = y14.c;
                haf hafVar = (haf) this.b;
                y14Var.L0(hafVar.b, hafVar.c);
                break;
            case 2:
                kkc kkcVar = kkc.c;
                ukc ukcVar = (ukc) this.b;
                long j = ukcVar.b;
                boolean z5 = ukcVar.d;
                kkcVar.p0().b(":call-user?opponent_id=" + j + "&video_enabled=" + z5, null);
                break;
            case 3:
                kkc.c.p0().b(":call-join-link?link=".concat(((ukc) this.b).e), null);
                break;
            default:
                kkc kkcVar2 = kkc.c;
                ukc ukcVar2 = (ukc) this.b;
                long j2 = ukcVar2.b;
                boolean z6 = ukcVar2.d;
                kkcVar2.p0().b(":call-chat?chat_id=" + j2 + "&video_enabled=" + z6, null);
                break;
        }
        return qqg.a;
    }
}
