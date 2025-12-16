package com.avito.android.service_booking_additional_settings.deeplink.toggle_link;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.BookingToggleToast;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.d;
import com.avito.android.service_booking_additional_settings.deeplink.toggle_service_booking_link.ServiceBookingToggleLink;
import java.util.Collections;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingToggleLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_additional_settings.deeplink.toggle_link.ServiceBookingToggleLinkHandler$doHandleWithAuth$1", f = "ServiceBookingToggleLinkHandler.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275141q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f275142r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingToggleLink f275143s;

    /* compiled from: ServiceBookingToggleLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/d;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f275144b;

        public a(d dVar) {
            this.f275144b = dVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            List listSingletonList;
            com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.d dVar = (com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.d) obj;
            boolean z12 = dVar instanceof d.b;
            d dVar2 = this.f275144b;
            a.g gVar = dVar2.f275148h;
            if (z12) {
                BookingToggleToast bookingToggleToast = ((d.b) dVar).f274887a;
                gVar.g(dVar2.d(), false);
                PrintableText printableTextF = com.avito.android.printable_text.b.f(bookingToggleToast.f274835c);
                ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                f.a aVar = f.a.f125253a;
                String str = bookingToggleToast.f274834b;
                if (str != null) {
                    listSingletonList = Collections.singletonList(new c.a.C3719a(str, bookingToggleToast.f274837e, null, c.f275145l, 4, null));
                } else {
                    listSingletonList = null;
                }
                List list = listSingletonList;
                a.i.C4057a.d(dVar2.f275149i, printableTextF, null, list, aVar, bookingToggleToast.f274836d, toastBarPosition, null, null, 1930);
                dVar2.j(ServiceBookingToggleLink.b.C8159b.f275160b);
            } else if (dVar instanceof d.c) {
                gVar.g(dVar2.d(), true);
            } else if (dVar instanceof d.a) {
                ApiError apiError = ((d.a) dVar).f274886a;
                gVar.g(dVar2.d(), false);
                PrintableText printableTextF2 = com.avito.android.printable_text.b.f(z.k(apiError));
                ToastBarPosition toastBarPosition2 = ToastBarPosition.f181045c;
                f.c.f125255c.getClass();
                a.i.C4057a.d(dVar2.f275149i, printableTextF2, null, null, f.c.a.b(), 2750, toastBarPosition2, null, null, 1934);
                dVar2.j(ServiceBookingToggleLink.b.a.f275159b);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ServiceBookingToggleLink serviceBookingToggleLink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f275142r = dVar;
        this.f275143s = serviceBookingToggleLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f275142r, this.f275143s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275141q;
        if (i12 == 0) {
            C42729a0.b(obj);
            d dVar = this.f275142r;
            InterfaceC43160i<com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.d> interfaceC43160iA = dVar.f275147g.a(this.f275143s.f275158b);
            a aVar = new a(dVar);
            this.f275141q = 1;
            if (interfaceC43160iA.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
