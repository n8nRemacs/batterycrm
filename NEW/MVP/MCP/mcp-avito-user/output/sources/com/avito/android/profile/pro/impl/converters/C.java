package com.avito.android.profile.pro.impl.converters;

import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockActionData;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockIcon;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileProSbParamsConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/C;", "Lcom/avito/android/profile/pro/impl/converters/B;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class C implements B {
    @Inject
    public C() {
    }

    @Override // com.avito.android.profile.pro.impl.converters.B
    @Y61.l
    public final ServiceBookingBlockParams b(@Y61.l ProfileTabWidget.k kVar) {
        if (kVar == null) {
            return null;
        }
        ProfileTabWidget.k.b bVar = kVar.f222820d;
        ServiceBookingBlockIcon serviceBookingBlockIcon = bVar == null ? null : new ServiceBookingBlockIcon(bVar.f222826a, bVar.f222827b);
        ProfileTabWidget.k.a aVar = kVar.f222823g;
        return new ServiceBookingBlockParams(kVar.f222819c, "serviceBookingBlock", kVar.f222818b, kVar.f222821e, kVar.f222822f, serviceBookingBlockIcon, aVar != null ? new ServiceBookingBlockActionData(aVar.f222824a, aVar.f222825b) : null);
    }
}
