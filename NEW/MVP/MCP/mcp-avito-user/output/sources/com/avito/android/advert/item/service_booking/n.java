package com.avito.android.advert.item.service_booking;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.analytics.event.service_booking.SbSignUpEvent;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import l41.r;

/* compiled from: ServiceBookingPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/service_booking/n;", "Lcom/avito/android/advert/item/service_booking/m;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f79859a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f79860b = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public W0 f79861c;

    /* compiled from: ServiceBookingPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f79862b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((ContactBar.Button.Target) obj).f125081i == ContactBar.Button.Target.Type.f125086c;
        }
    }

    /* compiled from: ServiceBookingPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Throwable, G0> {
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<ContactBar.Button.Target, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContactBar.Button.Target target) {
            ContactBar.Button.Target target2 = target;
            W0 w02 = n.this.f79861c;
            if (w02 != null) {
                w02.i(target2.f125076d, SbSignUpEvent.ServiceBookingSource.f90136c);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public n(@Y61.k InterfaceC28265d interfaceC28265d) {
        this.f79859a = interfaceC28265d;
    }

    @Override // com.avito.android.advert.item.service_booking.m
    public final void N(@Y61.l W0 w02) {
        this.f79861c = w02;
    }

    @Override // com.avito.android.advert.item.service_booking.m
    public final void a(@Y61.k DeepLink deepLink) {
        W0 w02 = this.f79861c;
        if (w02 != null) {
            w02.i(deepLink, SbSignUpEvent.ServiceBookingSource.f90137d);
        }
    }

    @Override // com.avito.android.advert.item.service_booking.m
    public final void e0() {
        this.f79860b.e();
    }

    @Override // com.avito.android.advert.item.service_booking.m
    public final void i() {
        this.f79860b.b(A1.h(this.f79859a.getF83157A().N(a.f79862b), new b(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new c(), 2));
    }
}
