package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.ob.C39177uj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.yj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39273yj implements S {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Jj f382260a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AbstractC39058pj f382261b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AbstractC39058pj f382262c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final AbstractC39058pj f382263d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final AbstractC39058pj f382264e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final S[] f382265f;

    public C39273yj() {
        this(new Aj());
    }

    public void a(CellInfo cellInfo, C39177uj.a aVar) {
        this.f382260a.a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            this.f382261b.a((CellInfoGsm) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.f382262c.a((CellInfoCdma) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoLte) {
            this.f382263d.a((CellInfoLte) cellInfo, aVar);
        } else if (A2.a(18) && (cellInfo instanceof CellInfoWcdma)) {
            this.f382264e.a((CellInfoWcdma) cellInfo, aVar);
        }
    }

    private C39273yj(@j.N AbstractC39058pj abstractC39058pj) {
        this(new Jj(), new Bj(), new C39297zj(), new Gj(), A2.a(18) ? new Hj() : abstractC39058pj);
    }

    @j.k0
    public C39273yj(@j.N Jj jj2, @j.N AbstractC39058pj abstractC39058pj, @j.N AbstractC39058pj abstractC39058pj2, @j.N AbstractC39058pj abstractC39058pj3, @j.N AbstractC39058pj abstractC39058pj4) {
        this.f382260a = jj2;
        this.f382261b = abstractC39058pj;
        this.f382262c = abstractC39058pj2;
        this.f382263d = abstractC39058pj3;
        this.f382264e = abstractC39058pj4;
        this.f382265f = new S[]{abstractC39058pj, abstractC39058pj2, abstractC39058pj4, abstractC39058pj3};
    }

    @Override // com.yandex.metrica.impl.ob.S
    public void a(@j.N Sh sh2) {
        for (S s5 : this.f382265f) {
            s5.a(sh2);
        }
    }
}
