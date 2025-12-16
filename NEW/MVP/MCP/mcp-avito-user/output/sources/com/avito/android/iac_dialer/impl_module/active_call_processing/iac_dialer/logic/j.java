package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.app_foreground_provider.util_module.AppForegroundStatus;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallStorage;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Config;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.ConnectionQuality;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.NotificationsVisibility;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.StringResources;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.splitter.Splitter;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.idle.IdleNavigation;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode;
import com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus;
import com.avito.android.iac_dialer.impl_module.device_status.power_status.IacPowerStatus;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: IacStateInitialProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/j;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/i;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_foreground_provider.util_module.a f165418a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.device_status.connection_status.a f165419b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.device_status.power_status.a f165420c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.audio.ringtone.c f165421d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PK.a f165422e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z f165423f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final HK.a f165424g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.splitter.features.a f165425h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FK.a f165426i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final HJ.a f165427j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final PL.i f165428k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Context f165429l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f165430m = C42727D.b(LazyThreadSafetyMode.f406614b, new a());

    /* compiled from: IacStateInitialProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$Idle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<IacState.Idle> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final IacState.Idle invoke() {
            IdleNavigation.CloseScreen closeScreen = IdleNavigation.CloseScreen.INSTANCE;
            Map mapC = P0.c();
            LifecycleStatus.Components.Nonexistent nonexistent = LifecycleStatus.Components.Nonexistent.INSTANCE;
            j jVar = j.this;
            AppForegroundStatus status = jVar.f165418a.getStatus();
            LifecycleStatus.App created = status.isForeground() ? LifecycleStatus.App.Started.INSTANCE : new LifecycleStatus.App.Created(status.getWasForeground());
            z zVar = jVar.f165423f;
            PermissionState permissionStateB = zVar.b("android.permission.RECORD_AUDIO");
            PermissionState permissionStateB2 = zVar.b("android.permission.CAMERA");
            NotificationsVisibility notificationsVisibility = NotificationsVisibility.NONE;
            IacRingingMode mode = jVar.f165421d.getMode();
            boolean zC2 = jVar.f165422e.c();
            IacConnectionStatus status2 = jVar.f165419b.getStatus();
            ConnectionQuality connectionQuality = ConnectionQuality.NO_DATA;
            IacPowerStatus status3 = jVar.f165420c.getStatus();
            HK.a aVar = jVar.f165424g;
            CallStorage callStorage = new CallStorage(aVar.l(), aVar.c());
            boolean zF2 = L.f(jVar.f165428k.a(), Boolean.TRUE);
            com.avito.android.iac_dialer.impl_module.splitter.features.a aVar2 = jVar.f165425h;
            aVar2.getClass();
            n<Object> nVar = com.avito.android.iac_dialer.impl_module.splitter.features.a.f166390j[0];
            return new IacState.Idle(new Appearance(mapC, null, nonexistent, created, permissionStateB, permissionStateB2, notificationsVisibility, mode, null, zC2, status2, connectionQuality, status3, callStorage, zF2, new Splitter(((Boolean) aVar2.f166392c.a().invoke()).booleanValue()), new Config(jVar.f165427j.getConfig().f8870a), new StringResources(jVar.f165429l.getString(R.string.iac_dialer_impl_finished_status_error))), closeScreen);
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.app_foreground_provider.util_module.a aVar, @Y61.k com.avito.android.iac_dialer.impl_module.device_status.connection_status.a aVar2, @Y61.k com.avito.android.iac_dialer.impl_module.device_status.power_status.a aVar3, @Y61.k com.avito.android.iac_dialer.impl_module.audio.ringtone.c cVar, @Y61.k PK.a aVar4, @Y61.k z zVar, @Y61.k HK.a aVar5, @Y61.k com.avito.android.iac_dialer.impl_module.splitter.features.a aVar6, @Y61.k FK.a aVar7, @Y61.k HJ.a aVar8, @Y61.k PL.i iVar, @Y61.k Context context) {
        this.f165418a = aVar;
        this.f165419b = aVar2;
        this.f165420c = aVar3;
        this.f165421d = cVar;
        this.f165422e = aVar4;
        this.f165423f = zVar;
        this.f165424g = aVar5;
        this.f165425h = aVar6;
        this.f165426i = aVar7;
        this.f165427j = aVar8;
        this.f165428k = iVar;
        this.f165429l = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.i
    public final IacState.Idle a() {
        return (IacState.Idle) this.f165430m.getValue();
    }
}
