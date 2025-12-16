package defpackage;

import java.util.List;
import java.util.Locale;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class t00 implements gu3, tm6, m7c, fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ t00(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                to8.u((x00) obj, p10.d, j);
                break;
            case 1:
                ((rv3) obj).r = j;
                break;
            case 2:
                ((rv3) obj).t = j;
                break;
            case 3:
                rv3 rv3Var = (rv3) obj;
                rv3Var.j = 2;
                rv3Var.s = j;
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                ((a5c) obj).Y(j);
                break;
            case 7:
                Locale locale = Locale.ENGLISH;
                wqi.e("vr5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                break;
            case 8:
                Locale locale2 = Locale.ENGLISH;
                wqi.e("gs5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                break;
            case 11:
                Locale locale3 = Locale.ENGLISH;
                wqi.e("ps5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                return new ik3(((zr5) obj).a(), 2, new dr5(3, this.b, true));
            case 5:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return e2f.g(Boolean.FALSE);
                }
                return new zqa(new vr8(e2f.g(list), new vef(8), 3), new t00(this.b, 6));
            case 9:
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    return e2f.g(Boolean.FALSE);
                }
                return new zqa(new vr8(e2f.g(list2), new vef(8), 3), new t00(this.b, 10));
            case 13:
                an9 an9Var = (an9) obj;
                an9Var.getClass();
                dsd dsdVarC = dsd.c(1, "SELECT * FROM message_uploads WHERE message_id = ?");
                dsdVarC.k(1, this.b);
                return new yr8(new zm9(an9Var, dsdVarC, 1));
            default:
                ewg ewgVar = (ewg) obj;
                ewgVar.getClass();
                return new kk3(2, new us5(ewgVar, this.b, 6));
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        switch (this.a) {
            case 6:
                if (((sff) obj).a == this.b) {
                }
                break;
            case 10:
                if (((jef) obj).a == this.b) {
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                u6e u6eVar = (u6e) obj;
                pb2 pb2Var = u6eVar.d;
                if (pb2Var == null || !pb2Var.Q() || u6eVar.d.n().p() != this.b) {
                }
                break;
            default:
                if (((tvg) obj).b == this.b) {
                }
                break;
        }
        return false;
    }
}
