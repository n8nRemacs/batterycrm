package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import com.yandex.metrica.impl.ob.C39177uj;

@TargetApi(17)
/* loaded from: classes7.dex */
public class Gj extends AbstractC39058pj {

    /* renamed from: c, reason: collision with root package name */
    private final Mj<CellIdentityLte> f378192c;

    public Gj() {
        this(A2.a(28) ? new Qj() : new Pj());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void b(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.a(4).b(Integer.valueOf(cellIdentity.getCi())).c(Integer.valueOf(cellIdentity.getTac())).k(Integer.valueOf(cellIdentity.getPci())).l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).i(this.f378192c.b(cellIdentity)).j(this.f378192c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void c(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (A2.a(24)) {
            aVar.a(Integer.valueOf(Cj.a(cellInfoLte.getCellIdentity())));
        }
        if (A2.a(26)) {
            aVar.f(Integer.valueOf(Dj.b(cellInfoLte.getCellSignalStrength())));
            aVar.h(Integer.valueOf(Dj.c(cellInfoLte.getCellSignalStrength())));
            aVar.e(Integer.valueOf(Dj.a(cellInfoLte.getCellSignalStrength())));
        }
        if (A2.a(28)) {
            aVar.d(Integer.valueOf(Ej.a(cellInfoLte.getCellIdentity())));
        }
        if (A2.a(29)) {
            aVar.g(Integer.valueOf(Fj.a(cellInfoLte.getCellSignalStrength())));
        }
    }

    @j.k0
    public Gj(@j.N Mj<CellIdentityLte> mj2) {
        this.f378192c = mj2;
    }
}
