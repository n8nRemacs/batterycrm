package q01;

import android.content.Context;
import androidx.appcompat.app.r;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.e;
import com.huawei.hms.framework.network.grs.g.j;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ConcurrentHashMap;
import s01.C47954c;

/* renamed from: q01.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C47180a {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f428944a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f428945b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    public final c f428946c;

    /* renamed from: d, reason: collision with root package name */
    public final c f428947d;

    /* renamed from: e, reason: collision with root package name */
    public final j f428948e;

    public C47180a(c cVar, c cVar2, j jVar) {
        this.f428947d = cVar2;
        this.f428946c = cVar;
        this.f428948e = jVar;
        jVar.f363579d = this;
    }

    public final void a(GrsBaseInfo grsBaseInfo, e eVar, Context context, C47954c c47954c) throws UnsupportedEncodingException {
        if (eVar.f363565h == 2) {
            Logger.w("a", "update cache from server failed");
            return;
        }
        int size = c47954c.f437281c.size();
        c cVar = this.f428946c;
        if (size != 0) {
            cVar.c("geoipCountryCode", eVar.f363564g);
            cVar.c("geoipCountryCodetime", eVar.f363567j);
            return;
        }
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        boolean zB2 = eVar.b();
        ConcurrentHashMap concurrentHashMap = this.f428944a;
        if (zB2) {
            concurrentHashMap.put(grsParasKey, com.huawei.hms.framework.network.grs.b.b(cVar.a(grsParasKey, "")));
        } else {
            cVar.c(grsParasKey, eVar.f363564g);
            concurrentHashMap.put(grsParasKey, com.huawei.hms.framework.network.grs.b.b(eVar.f363564g));
            cVar.c(grsParasKey + "ETag", eVar.f363569l);
        }
        cVar.c(r.q(grsParasKey, CrashHianalyticsData.TIME), eVar.f363567j);
        this.f428945b.put(grsParasKey, Long.valueOf(Long.parseLong(eVar.f363567j)));
    }
}
