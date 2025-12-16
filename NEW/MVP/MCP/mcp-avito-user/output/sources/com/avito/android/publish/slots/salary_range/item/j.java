package com.avito.android.publish.slots.salary_range.item;

import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SalaryRangePresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/item/j;", "Lcom/avito/android/publish/slots/salary_range/item/g;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<c> f244812b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244813c;

    @Inject
    public j() {
        com.jakewharton.rxrelay3.c<c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244812b = cVar;
        this.f244813c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        c cVar = (c) aVar;
        dVar.Ln(cVar.f244799f, new h(cVar, this));
        dVar.tg(cVar.f244800g, new i(cVar, this));
        dVar.Ja(cVar);
    }

    @Override // com.avito.android.publish.slots.salary_range.item.g
    @Y61.k
    public final z<c> b() {
        return this.f244813c;
    }
}
