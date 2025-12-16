package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.fb;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.mo0;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.rp;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class z implements mo0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final nj0 f392898a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private w f392899b;

    public z(@N nj0 nj0Var) {
        this.f392898a = nj0Var;
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a(@N w wVar) {
        wVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a(@N w wVar, @N C39386b c39386b) {
        this.f392899b = wVar;
        j7 j7Var = new j7(wVar, c39386b, this.f392898a.e());
        for (eb<?> ebVar : this.f392898a.b()) {
            fb fbVarA = wVar.a(ebVar);
            if (fbVarA != null) {
                fbVarA.c(ebVar.d());
                fbVarA.a(ebVar, j7Var);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a() {
        if (this.f392899b != null) {
            for (eb<?> ebVar : this.f392898a.b()) {
                fb fbVarA = this.f392899b.a(ebVar);
                if (fbVarA instanceof rp) {
                    ((rp) fbVarA).b(ebVar.d());
                }
            }
        }
    }
}
