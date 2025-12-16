package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.bj;
import com.yandex.mobile.ads.impl.cj;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.i2;
import com.yandex.mobile.ads.impl.j2;
import com.yandex.mobile.ads.impl.n30;
import com.yandex.mobile.ads.impl.tw;
import com.yandex.mobile.ads.impl.tx0;
import j.N;
import j.P;

/* renamed from: com.yandex.mobile.ads.nativeads.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39386b {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final j2 f392599a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private tx0 f392600b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final tw f392601c;

    public C39386b(@N i2 i2Var, @N tx0 tx0Var, @N n30 n30Var) {
        this.f392599a = i2Var;
        this.f392600b = tx0Var;
        this.f392601c = n30Var;
    }

    public final void a(@N eb ebVar, @P h90 h90Var, @N w wVar, @N bj bjVar) {
        if (!ebVar.e() || h90Var == null) {
            return;
        }
        bjVar.a(h90Var, new cj(ebVar, this.f392599a, wVar, this.f392600b, this.f392601c));
    }
}
