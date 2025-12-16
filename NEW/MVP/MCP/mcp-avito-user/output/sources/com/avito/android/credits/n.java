package com.avito.android.credits;

import Ds.InterfaceC13437a;
import com.avito.android.V;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditCalculatorFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/n;", "LWV0/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final V f129022e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13437a f129023f;

    @Inject
    public n(@Y61.k V v12, @Y61.k InterfaceC13437a interfaceC13437a) {
        super(true, false, 0.0f, 0L, 12, null);
        this.f129022e = v12;
        this.f129023f = interfaceC13437a;
    }

    @Override // WV0.a
    public final boolean a(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof CreditCalculatorItem;
    }

    @Override // WV0.a
    public final void b(int i12, @Y61.k b.InterfaceC10495b interfaceC10495b) {
        this.f129022e.o(this.f129023f.P8().getValue() != 0);
    }
}
