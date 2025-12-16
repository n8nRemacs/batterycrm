package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.C39177uj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.sj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39129sj implements Lj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39273yj f381843a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39249xj f381844b;

    public C39129sj() {
        this(new C39273yj(), new C39249xj());
    }

    @Override // com.yandex.metrica.impl.ob.S
    public void a(@j.N Sh sh2) {
        this.f381843a.a(sh2);
    }

    @j.k0
    public C39129sj(@j.N C39273yj c39273yj, @j.N C39249xj c39249xj) {
        this.f381843a = c39273yj;
        this.f381844b = c39249xj;
    }

    @Override // com.yandex.metrica.impl.ob.Lj
    @j.N
    public C39177uj a(@j.N CellInfo cellInfo) {
        C39177uj.a aVar = new C39177uj.a();
        this.f381843a.a(cellInfo, aVar);
        return this.f381844b.a(new C39177uj(aVar));
    }
}
