package com.avito.android.service_booking_details;

import Bt0.InterfaceC13184a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingItemDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/deep_linking/links/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingItemDetailsActivity f277356b;

    public h(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity) {
        this.f277356b = serviceBookingItemDetailsActivity;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        ServiceBookingItemDetailsActivity.a aVar = ServiceBookingItemDetailsActivity.f277175C;
        this.f277356b.b2().accept(new InterfaceC13184a.d((DeepLink) obj));
        return G0.f406611a;
    }
}
