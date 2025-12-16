package com.avito.android.profile.pro.impl.converters;

import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileProConverter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/e;", "Lcom/avito/android/profile/pro/impl/converters/d;", "Lcom/avito/android/profile/pro/impl/converters/B;", "Lcom/avito/android/profile/pro/impl/converters/H;", "Lcom/avito/android/profile/pro/impl/converters/p;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.pro.impl.converters.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33350e implements InterfaceC33349d, B, H, p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f222449a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f222450b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f222451c;

    @Inject
    public C33350e(@Y61.k p pVar, @Y61.k B b12, @Y61.k H h12) {
        this.f222449a = pVar;
        this.f222450b = b12;
        this.f222451c = h12;
    }

    @Override // com.avito.android.profile.pro.impl.converters.p
    @Y61.k
    public final List a(@Y61.k ArrayList arrayList, @Y61.l OrdersNeedActionResponse ordersNeedActionResponse, @Y61.l TypedResult typedResult, @Y61.k com.avito.android.profile.pro.impl.interactor.a aVar) {
        return this.f222449a.a(arrayList, ordersNeedActionResponse, typedResult, aVar);
    }

    @Override // com.avito.android.profile.pro.impl.converters.B
    @Y61.l
    public final ServiceBookingBlockParams b(@Y61.l ProfileTabWidget.k kVar) {
        return this.f222450b.b(kVar);
    }

    @Override // com.avito.android.profile.pro.impl.converters.H
    @Y61.k
    public final ProfileProWidgetsParams c(@Y61.k B90.a aVar, @Y61.l String str, @Y61.k ProfileTabUserType profileTabUserType) {
        return this.f222451c.c(aVar, str, profileTabUserType);
    }
}
