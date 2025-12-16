package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class fn1 implements sn1<en1> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ko1 f385425a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final n2 f385426b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.banner.f f385427c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private en1 f385428d;

    public fn1(@Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k com.yandex.mobile.ads.banner.f fVar) {
        this.f385425a = ko1Var;
        this.f385426b = n2Var;
        this.f385427c = fVar;
    }

    @Override // com.yandex.mobile.ads.impl.sn1
    public final void a(@Y61.k AdResponse<String> adResponse, @Y61.k SizeInfo sizeInfo, @Y61.k String str, @Y61.k un1<en1> un1Var) {
        Context contextH = this.f385427c.h();
        com.yandex.mobile.ads.banner.h hVarX = this.f385427c.x();
        ih1 ih1VarY = this.f385427c.y();
        en1 en1Var = new en1(contextH, this.f385425a, this.f385426b, adResponse, hVarX, this.f385427c);
        this.f385428d = en1Var;
        en1Var.a(sizeInfo, str, ih1VarY, un1Var);
    }

    @Override // com.yandex.mobile.ads.impl.sn1
    public final void a() {
        en1 en1Var = this.f385428d;
        if (en1Var != null) {
            en1Var.a();
        }
        this.f385428d = null;
    }
}
