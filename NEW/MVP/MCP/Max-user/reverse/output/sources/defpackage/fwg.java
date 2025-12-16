package defpackage;

import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import java.io.File;
import java.util.List;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class fwg implements tm6, gu3, snc, n1g, lp5, EngineCore.EventPacker {
    public final /* synthetic */ int a;

    public /* synthetic */ fwg(int i) {
        this.a = i;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                wqi.e("u2h", "clear: failed", (Throwable) obj);
                break;
            case 10:
                wqi.c("u2h", "convertVideo: loaded from storage = %s", (k2h) obj);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                x00 x00Var = (x00) obj;
                x00Var.i = (x00Var.c().g || !l8g.c(x00Var.c().h)) ? p10.a : p10.d;
                break;
            default:
                int i = VideoPlayerSeekBarPreview.D0;
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        int i = 2;
        switch (this.a) {
            case 0:
                ((pb2) obj).b.c0.getClass();
                return hd5.a;
            case 1:
                return new File((String) obj);
            case 2:
                return ((ttg) obj).g;
            case 3:
                ewg ewgVar = (ewg) obj;
                ewgVar.getClass();
                return new kk3(i, new bm4(17, ewgVar));
            case 4:
                return ((OneMeRoomDatabase) obj).V();
            case 5:
                vvg vvgVar = vvg.UNKNOWN;
                ewg ewgVar2 = (ewg) obj;
                ewgVar2.getClass();
                dsd dsdVarC = dsd.c(1, "SELECT * FROM uploads WHERE upload_status=?");
                dsdVarC.k(1, 1);
                return new yr8(new bwg(ewgVar2, dsdVarC, 1));
            case 6:
                cug cugVar = (cug) obj;
                stg stgVar = new stg();
                stgVar.g = vvg.UNKNOWN;
                String str = cugVar.b;
                ey2 ey2Var = cugVar.a;
                tvg tvgVar = null;
                stgVar.a = ey2Var == null ? null : new bug((String) ey2Var.c, ey2Var.b, (wvg) ey2Var.d, str);
                svg svgVar = cugVar.i;
                if (svgVar != null) {
                    svg svgVar2 = new svg();
                    svgVar2.a = svgVar.a;
                    svgVar2.b = svgVar.b;
                    tvgVar = new tvg(svgVar2);
                }
                stgVar.h = tvgVar;
                stgVar.g = cugVar.h;
                stgVar.b = cugVar.c;
                stgVar.c = cugVar.d;
                stgVar.d = cugVar.e;
                stgVar.f = cugVar.g;
                stgVar.e = cugVar.f;
                stgVar.i = cugVar.j;
                return new ttg(stgVar);
            case 7:
                List list = (List) obj;
                return list.isEmpty() ? tr8.a : or8.d(list);
            case 8:
            case 9:
            case 10:
            default:
                return ((nl0) obj).a();
            case 11:
                o2h o2hVar = (o2h) obj;
                o2hVar.getClass();
                return new kk3(i, new bm4(18, o2hVar));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return j8.b((n2h) obj);
            case 13:
                return ((OneMeRoomDatabase) obj).W();
        }
    }

    @Override // defpackage.snc
    public void b(float f) {
        wqi.c("u2h", "convertObs: progress %f", Float.valueOf(f));
    }

    @Override // defpackage.lp5
    public gp5[] c() {
        return new gp5[]{new ikh()};
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        return d.a(insertEventTools);
    }
}
