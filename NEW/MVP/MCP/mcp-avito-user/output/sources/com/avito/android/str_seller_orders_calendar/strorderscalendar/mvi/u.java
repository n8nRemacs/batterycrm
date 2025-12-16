package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yF0.InterfaceC50108b;

/* compiled from: StrOrdersCalendarBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/u;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class u implements com.avito.android.arch.mvi.b<StrOrdersCalendarInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    public final int f291164a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f291165b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a f291166c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_core.c f291167d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f291168e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50108b f291169f;

    @Inject
    public u(@Pz0.d int i12, @Y61.k com.avito.android.server_time.f fVar, @Y61.k com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a aVar, @Y61.k com.avito.android.str_core.c cVar, @Y61.k R0 r02, @Y61.k InterfaceC50108b interfaceC50108b) {
        this.f291164a = i12;
        this.f291165b = fVar;
        this.f291166c = aVar;
        this.f291167d = cVar;
        this.f291168e = r02;
        this.f291169f = interfaceC50108b;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrOrdersCalendarInternalAction> a() {
        return C43175k.N(C43175k.G(new t(this, null)), C43175k.G(new s(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
