package com.avito.android.services_transportation_widget.dialog;

import Y41.l;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceTransportationWidgetDialogResolver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;", "value", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements l<ServiceTransportationWidget.CardSelectField.CardSelectValue, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.offlinization.ui.a f280496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceTransportationWidget.CardSelectField f280497m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.offlinization.ui.a aVar, ServiceTransportationWidget.CardSelectField cardSelectField) {
        super(1);
        this.f280496l = aVar;
        this.f280497m = cardSelectField;
    }

    @Override // Y41.l
    public final G0 invoke(ServiceTransportationWidget.CardSelectField.CardSelectValue cardSelectValue) {
        this.f280496l.b(this.f280497m, cardSelectValue);
        return G0.f406611a;
    }
}
