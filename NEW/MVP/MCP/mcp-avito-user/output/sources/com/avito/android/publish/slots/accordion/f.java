package com.avito.android.publish.slots.accordion;

import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AccordionSlotPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/accordion/f;", "Lcom/avito/android/publish/slots/accordion/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<JO.a> f242802b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f242803c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<JO.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f242802b = cVar;
        this.f242803c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        JO.a aVar2 = (JO.a) aVar;
        hVar.setTitle(aVar2.f8934c);
        hVar.s2(aVar2.f8935d);
        hVar.M9(new e(this, aVar2));
    }

    @Override // com.avito.android.publish.slots.accordion.d
    @Y61.k
    public final z<JO.a> b() {
        return this.f242803c;
    }
}
