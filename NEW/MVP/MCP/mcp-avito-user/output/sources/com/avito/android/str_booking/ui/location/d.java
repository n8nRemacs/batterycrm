package com.avito.android.str_booking.ui.location;

import Y41.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.str_booking.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrBookingLocationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/Coordinates;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements l<Coordinates, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f286105l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f286105l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(Coordinates coordinates) {
        this.f286105l.f286106b.invoke(new a.j(coordinates));
        return G0.f406611a;
    }
}
