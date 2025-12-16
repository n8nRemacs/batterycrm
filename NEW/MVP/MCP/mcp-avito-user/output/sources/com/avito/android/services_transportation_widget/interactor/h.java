package com.avito.android.services_transportation_widget.interactor;

import Y61.l;
import com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ServiceTransportationWidgetStateObserver.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/services_transportation_widget/interactor/h;", "Lcom/avito/android/services_transportation_widget/interactor/g;", "Lcom/avito/android/services_transportation_widget/interactor/f;", "<init>", "()V", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes3.dex */
public final class h implements g, f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f280526a = f2.b(0, 0, null, 7);

    @Inject
    public h() {
    }

    @Override // com.avito.android.services_transportation_widget.interactor.g
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final e2 getF280526a() {
        return this.f280526a;
    }

    @Override // com.avito.android.services_transportation_widget.interactor.f
    @l
    public final Object b(@l ServiceTransportationWidgetItem serviceTransportationWidgetItem, @Y61.k Continuation<? super G0> continuation) {
        Object objEmit = this.f280526a.emit(serviceTransportationWidgetItem, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }
}
