package com.avito.android.preloading.coroutines;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PreloadingPromiseAsserts.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/preloading/coroutines/q;", "Lcom/avito/android/preloading/coroutines/p;", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f221835a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f221836b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f221837c;

    public q(boolean z12, @Y61.k String str, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f221835a = z12;
        this.f221836b = str;
        this.f221837c = interfaceC28373a;
    }

    @Override // com.avito.android.preloading.coroutines.p
    public final void a(boolean z12, @Y61.l Y41.l<? super String, ? extends InterfaceC28464o> lVar, @Y61.k Y41.a<String> aVar) {
        InterfaceC28464o interfaceC28464oInvoke;
        if (this.f221835a) {
            if (!z12) {
                throw new IllegalArgumentException(aVar.invoke().toString());
            }
        } else if (!z12) {
            V2.f318762a.d("PreloadingPromise", aVar.invoke());
        }
        if (z12 || lVar == null || (interfaceC28464oInvoke = lVar.invoke(this.f221836b)) == null) {
            return;
        }
        this.f221837c.c(interfaceC28464oInvoke);
    }
}
