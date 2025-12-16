package defpackage;

import java.util.Map;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes2.dex */
public final /* synthetic */ class gch implements es8, gu3 {
    public final /* synthetic */ hch a;
    public final /* synthetic */ w10 b;
    public final /* synthetic */ v10 c;

    public /* synthetic */ gch(hch hchVar, v10 v10Var, w10 w10Var) {
        this.a = hchVar;
        this.c = v10Var;
        this.b = w10Var;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        hch hchVar = this.a;
        m3h m3hVar = hchVar.a;
        String str = this.b.r;
        m3hVar.getClass();
        m3h.a.put(str, new l3h((ru5) obj, System.currentTimeMillis()));
        dd ddVar = (dd) hchVar.c.get();
        if (ddVar != null) {
            v10 v10Var = this.c;
            if (l8g.c(v10Var.j)) {
                ddVar.e("ACTION_VIDEO_FETCH_OK");
            } else {
                ddVar.f("ACTION_VIDEO_FETCH_OK", v10Var.j);
            }
        }
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        v10 v10Var = this.c;
        if (!l8g.c(v10Var.h)) {
            if (rr8Var.e()) {
                return;
            }
            FetcherException fetcherException = new FetcherException(5, "Video hosting in black list");
            if (rr8Var.d(fetcherException)) {
                return;
            }
            t8j.a(fetcherException);
            return;
        }
        boolean z = v10Var.g;
        hch hchVar = this.a;
        if (z && v10Var.l > hchVar.f.a.j()) {
            if (rr8Var.e()) {
                return;
            }
            FetcherException fetcherException2 = new FetcherException(7, "live stream not started");
            if (rr8Var.d(fetcherException2)) {
                return;
            }
            t8j.a(fetcherException2);
            return;
        }
        w10 w10Var = this.b;
        String strA = hchVar.a(w10Var);
        if (!l8g.c(strA)) {
            wqi.c("VideoRipper", "getVideoContent: local path = %s", strA);
            if (rr8Var.e()) {
                return;
            }
            rr8Var.b();
            return;
        }
        m3h m3hVar = hchVar.a;
        String str = w10Var.r;
        m3hVar.getClass();
        Map map = m3h.a;
        l3h l3hVar = (l3h) map.get(str);
        ru5 ru5Var = null;
        if (l3hVar != null) {
            if (l3hVar.b + 3600000 > System.currentTimeMillis()) {
                ru5Var = l3hVar.a;
            } else {
                map.remove(str);
            }
        }
        if (ru5Var == null) {
            if (rr8Var.e()) {
                return;
            }
            rr8Var.b();
        } else {
            if (rr8Var.e()) {
                return;
            }
            rr8Var.a(ru5Var);
        }
    }

    public /* synthetic */ gch(hch hchVar, w10 w10Var, v10 v10Var) {
        this.a = hchVar;
        this.b = w10Var;
        this.c = v10Var;
    }
}
