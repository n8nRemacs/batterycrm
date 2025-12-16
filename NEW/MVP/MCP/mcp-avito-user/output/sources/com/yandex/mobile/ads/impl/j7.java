package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.C39386b;

/* loaded from: classes8.dex */
public final class j7 implements ej1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.w f386768a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39386b f386769b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final h90 f386770c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qj1 f386771d = new qj1();

    public j7(@j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N C39386b c39386b, @j.N h90 h90Var) {
        this.f386768a = wVar;
        this.f386769b = c39386b;
        this.f386770c = h90Var;
    }

    @Override // com.yandex.mobile.ads.impl.ej1
    public final void a(@j.N View view, @j.N eb ebVar) {
        if (view.getTag() == null) {
            qj1 qj1Var = this.f386771d;
            String strB = ebVar.b();
            qj1Var.getClass();
            view.setTag(qj1.a(strB));
        }
    }

    @Override // com.yandex.mobile.ads.impl.ej1
    public final void a(@j.N eb ebVar, @j.N bj bjVar) {
        h90 h90VarA = ebVar.a();
        if (h90VarA == null) {
            h90VarA = this.f386770c;
        }
        this.f386769b.a(ebVar, h90VarA, this.f386768a, bjVar);
    }
}
