package com.avito.android.services_transportation_widget.dialog;

import Y41.l;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceTransportationWidgetDialogResolver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;", "value", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<ServiceTransportationWidget.SelectField.SelectValue, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.offlinization.ui.a f280501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceTransportationWidget.SelectField f280502m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.offlinization.ui.a aVar, ServiceTransportationWidget.SelectField selectField) {
        super(1);
        this.f280501l = aVar;
        this.f280502m = selectField;
    }

    @Override // Y41.l
    public final G0 invoke(ServiceTransportationWidget.SelectField.SelectValue selectValue) {
        this.f280501l.b(this.f280502m, selectValue);
        return G0.f406611a;
    }
}
