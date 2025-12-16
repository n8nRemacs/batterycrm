package com.avito.android.user_address.map.mvi;

import android.app.Activity;
import android.content.res.Resources;
import android.location.Location;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.component.toast.f;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processFindMeButtonClicked$1", f = "UserAddressMapMviActor.kt", i = {}, l = {152, 163, 173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class O extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307695q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307696r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f307697s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAddressAddNewAddressMviState f307698t;

    /* compiled from: UserAddressMapMviActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/location/Location;", "location", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "<anonymous>", "(Landroid/location/Location;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processFindMeButtonClicked$1$1", f = "UserAddressMapMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Location, Continuation<? super InterfaceC43160i<? extends UserAddressMapMviInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f307699q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ B f307700r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ UserAddressAddNewAddressMviState f307701s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState, B b12, Continuation continuation) {
            super(2, continuation);
            this.f307700r = b12;
            this.f307701s = userAddressAddNewAddressMviState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f307701s, this.f307700r, continuation);
            aVar.f307699q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Location location, Continuation<? super InterfaceC43160i<? extends UserAddressMapMviInternalAction>> continuation) {
            return ((a) create(location, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Location location = (Location) this.f307699q;
            AvitoMapPoint avitoMapPoint = new AvitoMapPoint(location.getLatitude(), location.getLongitude(), null, 4, null);
            UserAddressAddNewAddressMviState userAddressAddNewAddressMviState = this.f307701s;
            return this.f307700r.d(new AvitoMapCameraPosition(avitoMapPoint, userAddressAddNewAddressMviState.getF307726c().getZoomLevel(), 0.0f, null, null, 28, null), userAddressAddNewAddressMviState);
        }
    }

    /* compiled from: UserAddressMapMviActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processFindMeButtonClicked$1$2", f = "UserAddressMapMviActor.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f307702q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f307703r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ B f307704s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B b12, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f307704s = b12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(this.f307704s, continuation);
            bVar.f307703r = interfaceC43172j;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Resources.NotFoundException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f307702q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f307703r;
                UserAddressMapMviInternalAction.ShowToastBar showToastBar = new UserAddressMapMviInternalAction.ShowToastBar(f.a.f125253a, this.f307704s.f307645d.getResources().getString(R.string.phone_location_disabled_error_message), true);
                this.f307702q = 1;
                if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
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
    public O(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState, B b12, Continuation continuation) {
        super(2, continuation);
        this.f307697s = b12;
        this.f307698t = userAddressAddNewAddressMviState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        O o12 = new O(this.f307698t, this.f307697s, continuation);
        o12.f307696r = obj;
        return o12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((O) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Resources.NotFoundException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307695q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f307696r;
            B b12 = this.f307697s;
            boolean zD2 = b12.f307648g.d();
            Activity activity = b12.f307645d;
            if (!zD2) {
                UserAddressMapMviInternalAction.ShowToastBar showToastBar = new UserAddressMapMviInternalAction.ShowToastBar(f.a.f125253a, activity.getResources().getString(R.string.phone_location_disabled_error_message), true);
                this.f307695q = 1;
                if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (b12.f307648g.b()) {
                UserAddressMapMviInternalAction.ShowToastBar showToastBar2 = new UserAddressMapMviInternalAction.ShowToastBar(f.a.f125253a, activity.getResources().getString(R.string.phone_location_disabled_error_message), true);
                this.f307695q = 2;
                if (interfaceC43172j.emit(showToastBar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C43152f0 c43152f0 = new C43152f0(C43175k.B(new a(this.f307698t, b12, null), kotlinx.coroutines.rx3.y.a(b12.f307644c.b(activity, (4 & 2) == 0, (4 & 4) == 0))), new b(b12, null));
                this.f307695q = 3;
                if (C43175k.u(this, c43152f0, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
