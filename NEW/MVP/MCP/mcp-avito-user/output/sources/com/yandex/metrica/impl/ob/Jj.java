package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.C39177uj;
import java.util.concurrent.TimeUnit;

@TargetApi(17)
/* loaded from: classes7.dex */
public class Jj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private C38837gm f378650a;

    public Jj() {
        this(new C38837gm());
    }

    public void a(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long lValueOf = null;
        if (timeStamp > 0) {
            C38837gm c38837gm = this.f378650a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jC2 = c38837gm.c(timeStamp, timeUnit);
            if (jC2 > 0 && jC2 < TimeUnit.HOURS.toSeconds(1L)) {
                lValueOf = Long.valueOf(jC2);
            }
            if (lValueOf == null) {
                long jA2 = this.f378650a.a(timeStamp, timeUnit);
                if (jA2 > 0 && jA2 < TimeUnit.HOURS.toSeconds(1L)) {
                    lValueOf = Long.valueOf(jA2);
                }
            }
        }
        aVar.a(lValueOf).a(cellInfo.isRegistered());
    }

    @j.k0
    public Jj(@j.N C38837gm c38837gm) {
        this.f378650a = c38837gm;
    }
}
