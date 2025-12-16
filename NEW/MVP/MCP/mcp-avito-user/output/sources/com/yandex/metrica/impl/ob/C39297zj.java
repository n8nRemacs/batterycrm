package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import com.yandex.metrica.impl.ob.C39177uj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.zj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39297zj extends AbstractC39058pj {
    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void b(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
        aVar.l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.a(2);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39058pj
    public void c(@j.N CellInfo cellInfo, @j.N C39177uj.a aVar) {
    }
}
