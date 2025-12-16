package com.avito.android.service_booking_user_profile.view.mvi;

import com.avito.android.service_booking_user_profile.view.i;
import com.avito.android.service_booking_user_profile.view.mvi.entity.ServiceBookingBlockState;
import com.avito.android.util.R0;
import eu0.InterfaceC40158a;
import eu0.InterfaceC40159b;
import eu0.InterfaceC40160c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingBlockFeatureBuilderImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/l;", "Lcom/avito/android/service_booking_user_profile/view/mvi/p;", "Leu0/c;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends p<InterfaceC40160c> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final R0 f278271k;

    /* compiled from: ServiceBookingBlockFeatureBuilderImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Leu0/a;", "Leu0/c;", "Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState;", "Leu0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40158a, InterfaceC40160c, ServiceBookingBlockState, InterfaceC40159b>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.service_booking_user_profile.view.mvi.a f278272l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ q f278273m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ j f278274n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ R0 f278275o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.service_booking_user_profile.view.mvi.a aVar, q qVar, j jVar, R0 r02) {
            super(1);
            this.f278272l = aVar;
            this.f278273m = qVar;
            this.f278274n = jVar;
            this.f278275o = r02;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40158a, InterfaceC40160c, ServiceBookingBlockState, InterfaceC40159b> qVar) {
            com.avito.android.arch.mvi.q<InterfaceC40158a, InterfaceC40160c, ServiceBookingBlockState, InterfaceC40159b> qVar2 = qVar;
            qVar2.f92009e = this.f278272l;
            qVar2.f92011g = this.f278273m;
            qVar2.f92010f = this.f278274n;
            AW.f fVar = AW.f.f434a;
            com.avito.android.arch.mvi.log.g.f91991f.getClass();
            qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
            qVar2.f92013i = this.f278275o.c();
            return G0.f406611a;
        }
    }

    @Inject
    public l(@Y61.k com.avito.android.service_booking_user_profile.view.i iVar, @Y61.k com.avito.android.service_booking_user_profile.view.mvi.a aVar, @Y61.k q qVar, @Y61.k j jVar, @Y61.k R0 r02) {
        ServiceBookingBlockState serviceBookingBlockState;
        String strA = iVar.a();
        if (iVar instanceof i.a) {
            serviceBookingBlockState = new ServiceBookingBlockState(null, null, null, null, 15, null);
        } else {
            if (!(iVar instanceof i.b)) {
                throw new NoWhenBranchMatchedException();
            }
            serviceBookingBlockState = new ServiceBookingBlockState(null, null, null, null, 14, null);
        }
        super(strA, serviceBookingBlockState, new a(aVar, qVar, jVar, r02));
        this.f278271k = r02;
    }
}
