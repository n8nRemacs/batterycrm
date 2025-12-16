package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import com.yandex.metrica.impl.ob.C39177uj;

@TargetApi(17)
/* loaded from: classes7.dex */
public class Bj extends AbstractC39058pj {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Mj<CellIdentityGsm> f377853c;

    public Bj() {
        this(A2.a(28) ? new Oj() : new Nj());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void b(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.a(1).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).i(this.f377853c.b(cellIdentity)).j(this.f377853c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void c(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (A2.a(24)) {
            aVar.a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }

    @j.k0
    public Bj(@j.N Mj<CellIdentityGsm> mj2) {
        this.f377853c = mj2;
    }
}
