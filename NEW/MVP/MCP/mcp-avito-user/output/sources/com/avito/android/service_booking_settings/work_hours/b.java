package com.avito.android.service_booking_settings.work_hours;

import Ut0.i;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_settings.ServiceBookingSettingsActivity;
import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursFragment;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.google.android.material.appbar.MaterialToolbar;
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

/* compiled from: ServiceBookingWorkHoursFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursFragment$observeViewModel$2", f = "ServiceBookingWorkHoursFragment.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f277927q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingWorkHoursFragment f277928r;

    /* compiled from: ServiceBookingWorkHoursFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursFragment$observeViewModel$2$1", f = "ServiceBookingWorkHoursFragment.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277929q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ServiceBookingWorkHoursFragment f277930r;

        /* compiled from: ServiceBookingWorkHoursFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUt0/i;", "event", "Lkotlin/G0;", "emit", "(LUt0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.service_booking_settings.work_hours.b$a$a, reason: collision with other inner class name */
        public static final class C8254a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ServiceBookingWorkHoursFragment f277931b;

            public C8254a(ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment) {
                this.f277931b = serviceBookingWorkHoursFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Ut0.i iVar = (Ut0.i) obj;
                boolean z12 = iVar instanceof i.e;
                ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment = this.f277931b;
                if (z12) {
                    String string = serviceBookingWorkHoursFragment.getString(R.string.service_booking_network_error_message);
                    InterfaceC28373a interfaceC28373a = serviceBookingWorkHoursFragment.f277901r0;
                    if (interfaceC28373a == null) {
                        interfaceC28373a = null;
                    }
                    interfaceC28373a.c(new Tt0.c(string));
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    h hVar = serviceBookingWorkHoursFragment.f277907x0;
                    MaterialToolbar materialToolbar = (hVar != null ? hVar : null).f277940f.f278142a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(string);
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, materialToolbar, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                } else if (iVar instanceof i.f) {
                    serviceBookingWorkHoursFragment.requireActivity().setResult(-1);
                    ((i.f) iVar).getClass();
                    String string2 = serviceBookingWorkHoursFragment.getString(0);
                    InterfaceC28373a interfaceC28373a2 = serviceBookingWorkHoursFragment.f277901r0;
                    if (interfaceC28373a2 == null) {
                        interfaceC28373a2 = null;
                    }
                    interfaceC28373a2.c(new Tt0.c(string2));
                    com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                    h hVar2 = serviceBookingWorkHoursFragment.f277907x0;
                    com.avito.android.component.toast.c.b(cVar2, (hVar2 != null ? hVar2 : null).f277940f.f278146e, com.avito.android.printable_text.b.f(string2), null, null, null, null, 0, ToastBarPosition.f181044b, null, false, false, null, null, 4030);
                } else if (iVar instanceof i.d) {
                    serviceBookingWorkHoursFragment.requireActivity().setResult(-1);
                    InterfaceC28373a interfaceC28373a3 = serviceBookingWorkHoursFragment.f277901r0;
                    if (interfaceC28373a3 == null) {
                        interfaceC28373a3 = null;
                    }
                    i.d dVar = (i.d) iVar;
                    dVar.getClass();
                    interfaceC28373a3.c(new Tt0.c(serviceBookingWorkHoursFragment.getString(R.string.service_booking_working_hours_save_success)));
                    com.avito.android.deeplink_handler.handler.composite.a aVar = serviceBookingWorkHoursFragment.f277900q0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, dVar.f16756a, null, null, 6);
                } else if (iVar instanceof i.a) {
                    ActivityC22955m activityC22955mRequireActivity = serviceBookingWorkHoursFragment.requireActivity();
                    ServiceBookingSettingsActivity.a aVar2 = ServiceBookingSettingsActivity.f277768m;
                    ((i.a) iVar).getClass();
                    String string3 = serviceBookingWorkHoursFragment.getString(R.string.service_booking_working_hours_save_success);
                    aVar2.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("result_key.message", string3);
                    activityC22955mRequireActivity.setResult(-1, intent);
                    InterfaceC28373a interfaceC28373a4 = serviceBookingWorkHoursFragment.f277901r0;
                    (interfaceC28373a4 != null ? interfaceC28373a4 : null).c(new Tt0.c(serviceBookingWorkHoursFragment.getString(R.string.service_booking_working_hours_save_success)));
                    serviceBookingWorkHoursFragment.requireActivity().onBackPressed();
                } else if (iVar instanceof i.c) {
                    com.avito.android.select.bottom_sheet.c.a(serviceBookingWorkHoursFragment, ((i.c) iVar).f16755a).show(serviceBookingWorkHoursFragment.getParentFragmentManager(), "select_fragment");
                } else if (iVar instanceof i.b) {
                    BookingSettingsStatus bookingSettingsStatus = ((i.b) iVar).f16754a;
                    ServiceBookingWorkHoursFragment.a aVar3 = ServiceBookingWorkHoursFragment.f277896A0;
                    ActivityC22955m activityC22955mRequireActivity2 = serviceBookingWorkHoursFragment.requireActivity();
                    ServiceBookingSettingsActivity.f277768m.getClass();
                    Intent intent2 = new Intent();
                    intent2.putExtra("result_key.settings_status", bookingSettingsStatus);
                    activityC22955mRequireActivity2.setResult(0, intent2);
                    serviceBookingWorkHoursFragment.requireActivity().onBackPressed();
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f277930r = serviceBookingWorkHoursFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f277930r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277929q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ServiceBookingWorkHoursFragment.a aVar = ServiceBookingWorkHoursFragment.f277896A0;
                ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment = this.f277930r;
                InterfaceC43160i<Ut0.i> events = serviceBookingWorkHoursFragment.q5().getEvents();
                C8254a c8254a = new C8254a(serviceBookingWorkHoursFragment);
                this.f277929q = 1;
                if (events.collect(c8254a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f277928r = serviceBookingWorkHoursFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f277928r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f277927q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment = this.f277928r;
            InterfaceC22983P viewLifecycleOwner = serviceBookingWorkHoursFragment.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(serviceBookingWorkHoursFragment, null);
            this.f277927q = 1;
            if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
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
