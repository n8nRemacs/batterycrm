package com.avito.android.service_booking_schedule_repetition_impl.link;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_schedule_repetition_impl.ServiceBookingScheduleRepetitionSheet;
import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import rv.C47919b;

/* compiled from: ServiceBookingScheduleRepetitionLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/link/b;", "Lev/a;", "Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<ServiceBookingScheduleRepetitionLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f277606f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f277607g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f277608h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f277609i;

    /* compiled from: ServiceBookingScheduleRepetitionLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.link.ServiceBookingScheduleRepetitionLinkHandler$onCreate$1", f = "ServiceBookingScheduleRepetitionLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f277610q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f277610q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC14249c.b aVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C47919b c47919b = (C47919b) this.f277610q;
            b bVar = b.this;
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = c47919b.f437159b;
            Parcelable parcelable = i12 >= 34 ? (Parcelable) bundle.getParcelable("result.key", ServiceBookingScheduleRepetitionSheet.Result.class) : bundle.getParcelable("result.key");
            if (parcelable == null) {
                throw new IllegalArgumentException("Result must be set in bundle by key=result.key");
            }
            ServiceBookingScheduleRepetitionSheet.Result result = (ServiceBookingScheduleRepetitionSheet.Result) parcelable;
            if (result instanceof ServiceBookingScheduleRepetitionSheet.Result.Success) {
                aVar = new ServiceBookingScheduleRepetitionLink.b.C8246b(((ServiceBookingScheduleRepetitionSheet.Result.Success) result).f277543b);
            } else {
                if (!(result instanceof ServiceBookingScheduleRepetitionSheet.Result.Canceled)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new ServiceBookingScheduleRepetitionLink.b.a(((ServiceBookingScheduleRepetitionSheet.Result.Canceled) result).f277542b);
            }
            bVar.j(aVar);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k C25719a c25719a, @k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f277606f = fVar;
        this.f277607g = dVar;
        this.f277608h = c25719a;
        this.f277609i = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingScheduleRepetitionLink serviceBookingScheduleRepetitionLink = (ServiceBookingScheduleRepetitionLink) deepLink;
        this.f277608h.a(serviceBookingScheduleRepetitionLink, this, AuthSource.f92675J, new com.avito.android.service_booking_schedule_repetition_impl.link.a(this, serviceBookingScheduleRepetitionLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new a(null), y.a(this.f277606f.l1(this.f395444b))), this.f277609i);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f277609i, null);
    }
}
