package com.avito.android.iac_dialer.impl_module.device_status.power_status;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: IacPowerStatusProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.device_status.power_status.IacPowerStatusProviderImpl$initializeIfNeeded$1", f = "IacPowerStatusProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer.impl_module.device_status.power_status.c f165981q;

    /* compiled from: IacPowerStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/device_status/power_status/b$a", "Landroid/content/BroadcastReceiver;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.device_status.power_status.c f165982a;

        public a(com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar) {
            this.f165982a = cVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@k Context context, @k Intent intent) {
            com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar = this.f165982a;
            cVar.b().setValue(cVar.getStatus());
        }
    }

    /* compiled from: IacPowerStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/device_status/power_status/b$b", "Landroid/content/BroadcastReceiver;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.device_status.power_status.b$b, reason: collision with other inner class name */
    public static final class C4920b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.device_status.power_status.c f165983a;

        public C4920b(com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar) {
            this.f165983a = cVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@k Context context, @k Intent intent) {
            com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar = this.f165983a;
            cVar.b().setValue(cVar.getStatus());
        }
    }

    /* compiled from: IacPowerStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/device_status/power_status/b$c", "Landroid/content/BroadcastReceiver;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.device_status.power_status.c f165984a;

        public c(com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar) {
            this.f165984a = cVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@k Context context, @k Intent intent) {
            com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar = this.f165984a;
            cVar.b().setValue(cVar.getStatus());
        }
    }

    /* compiled from: IacPowerStatusProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/device_status/power_status/b$d", "Landroid/content/BroadcastReceiver;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.device_status.power_status.c f165985a;

        public d(com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar) {
            this.f165985a = cVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@k Context context, @k Intent intent) {
            com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar = this.f165985a;
            cVar.b().setValue(cVar.getStatus());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f165981q = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f165981q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.iac_dialer.impl_module.device_status.power_status.c cVar = this.f165981q;
        cVar.f165986a.registerReceiver(new a(cVar), new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
        int i12 = Build.VERSION.SDK_INT;
        Context context = cVar.f165986a;
        if (i12 >= 33) {
            context.registerReceiver(new C4920b(cVar), new IntentFilter("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED"));
        }
        context.registerReceiver(new c(cVar), new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        if (i12 >= 33) {
            context.registerReceiver(new d(cVar), new IntentFilter("android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED"));
        }
        return G0.f406611a;
    }
}
