package com.avito.android.str_booking.ui.info;

import Y41.l;
import com.avito.android.str_booking.network.models.sections.InfoContent;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingInfoPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/info/h;", "LTV0/d;", "Lcom/avito/android/str_booking/ui/info/j;", "Lcom/avito/android/str_booking/ui/info/c;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements TV0.d<j, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<com.avito.android.str_booking.mvi.entity.a, G0> f286058b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super com.avito.android.str_booking.mvi.entity.a, G0> lVar) {
        this.f286058b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        jVar.pp(cVar);
        jVar.oD(cVar, new d(this));
        InfoContent infoContent = cVar.f286051b;
        jVar.uG(new e(this), infoContent != null ? infoContent.g() : null);
        jVar.Fh(infoContent != null ? infoContent.getDescription() : null, new f(this));
        if (infoContent != null ? L.f(infoContent.getIsCollapsible(), Boolean.TRUE) : false) {
            jVar.Pe(new g(this, cVar));
        } else {
            jVar.Pe(null);
        }
        jVar.tA(infoContent != null ? infoContent.e() : null);
    }
}
