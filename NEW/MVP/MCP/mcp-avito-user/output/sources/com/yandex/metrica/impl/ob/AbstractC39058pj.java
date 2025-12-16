package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.C39177uj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.pj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39058pj implements S {

    /* renamed from: a, reason: collision with root package name */
    private final String f381373a = "[" + getClass().getName() + "]";

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private volatile Sh f381374b;

    private boolean b(@j.N CellInfo cellInfo) {
        Sh sh2 = this.f381374b;
        if (sh2 == null || !sh2.f379411t) {
            return false;
        }
        return !sh2.f379412u || cellInfo.isRegistered();
    }

    public void a(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        b(cellInfo, aVar);
        if (b(cellInfo)) {
            c(cellInfo, aVar);
        }
    }

    public abstract void b(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar);

    public abstract void c(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar);

    @Override // com.yandex.metrica.impl.ob.S
    public void a(@j.N Sh sh2) {
        this.f381374b = sh2;
    }
}
