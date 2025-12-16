package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.e7;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.fb;
import com.yandex.mobile.ads.impl.mo0;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes8.dex */
final class o0 implements mo0 {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final List<eb<?>> f392707a;

    public o0(@P List<eb<?>> list) {
        this.f392707a = list;
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a(@N w wVar) {
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a(@N w wVar, @N C39386b c39386b) {
        List<eb<?>> list = this.f392707a;
        if (list != null) {
            e7 e7Var = new e7(wVar, c39386b);
            for (eb<?> ebVar : list) {
                fb fbVarA = wVar.a(ebVar);
                if (fbVarA != null) {
                    fbVarA.c(ebVar.d());
                    fbVarA.a(ebVar, e7Var);
                }
            }
        }
    }
}
