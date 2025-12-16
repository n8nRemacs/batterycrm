package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.ob.C39177uj;

@TargetApi(18)
@DoNotInline
/* loaded from: classes7.dex */
public class Hj extends AbstractC39058pj {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Mj<CellIdentityWcdma> f378273c;

    public Hj() {
        this(A2.a(28) ? new Sj() : new Rj());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void b(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.a(3).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).k(Integer.valueOf(cellIdentity.getPsc())).l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).i(this.f378273c.b(cellIdentity)).j(this.f378273c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void c(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        if (A2.a(24)) {
            aVar.a(Integer.valueOf(Cj.a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }

    @j.k0
    public Hj(@j.N Mj<CellIdentityWcdma> mj2) {
        this.f378273c = mj2;
    }
}
