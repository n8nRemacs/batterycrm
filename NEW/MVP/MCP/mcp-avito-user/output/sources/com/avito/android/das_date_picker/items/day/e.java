package com.avito.android.das_date_picker.items.day;

import Y41.l;
import Y61.k;
import cu.InterfaceC39413a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DasCalendarDayItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/items/day/e;", "LTV0/d;", "Lcom/avito/android/das_date_picker/items/day/g;", "Lcom/avito/android/das_date_picker/items/day/a;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC39413a, G0> f132327b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC39413a, G0> lVar) {
        this.f132327b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.setText(aVar2.f132316c);
        gVar.c8(aVar2.f132319f);
        gVar.Ix(aVar2.f132317d);
        if (aVar2.f132318e) {
            gVar.a(new d(this, aVar2));
        } else {
            gVar.V2();
        }
    }
}
