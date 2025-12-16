package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.splitter.Splitter;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode;
import com.avito.android.iac_dialer.impl_module.camera.IacCameraPosition;
import com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus;
import com.avito.android.iac_dialer.impl_module.device_status.power_status.IacPowerStatus;
import com.avito.android.permissions.PermissionState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;

/* compiled from: Appearance.kt */
@P
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b5\u00104J\u0010\u00106\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bF\u0010=J\u0010\u0010G\u001a\u00020!HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020#HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020%HÆ\u0003¢\u0006\u0004\bK\u0010LJØ\u0001\u0010M\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010T\u001a\u00020\u00162\b\u0010S\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0003H\u0002¢\u0006\u0004\bV\u0010*J#\u0010Y\u001a\u00020\u00032\u0012\u0010X\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030W\"\u00020\u0003H\u0002¢\u0006\u0004\bY\u0010ZR'\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b\\\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010]\u001a\u0004\b^\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010_\u001a\u0004\b`\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010a\u001a\u0004\bb\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010c\u001a\u0004\bd\u00104R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010c\u001a\u0004\be\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010f\u001a\u0004\bg\u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010h\u001a\u0004\bi\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010j\u001a\u0004\bk\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010l\u001a\u0004\b\u0017\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010m\u001a\u0004\bn\u0010?R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010o\u001a\u0004\bp\u0010AR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010q\u001a\u0004\br\u0010CR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010s\u001a\u0004\bt\u0010ER\u0017\u0010 \u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b \u0010l\u001a\u0004\b \u0010=R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010u\u001a\u0004\bv\u0010HR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010w\u001a\u0004\bx\u0010JR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010y\u001a\u0004\bz\u0010L¨\u0006{"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "LdL/d;", "", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "callInits", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ServiceStatus;", "service", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "screen", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "app", "Lcom/avito/android/permissions/PermissionState;", "micPerm", "cameraPerm", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/NotificationsVisibility;", "notifications", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;", "ringingMode", "Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "camera", "", "isGsmBusy", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "network", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ConnectionQuality;", "connectionQuality", "Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;", "power", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;", "storage", "isMiui", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/splitter/Splitter;", "splitter", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Config;", Navigation.CONFIG, "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/StringResources;", "stringResources", "<init>", "(Ljava/util/Map;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ServiceStatus;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;Lcom/avito/android/permissions/PermissionState;Lcom/avito/android/permissions/PermissionState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/NotificationsVisibility;Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;ZLcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ConnectionQuality;Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/splitter/Splitter;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Config;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/StringResources;)V", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/Map;", "component2", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ServiceStatus;", "component3", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "component4", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "component5", "()Lcom/avito/android/permissions/PermissionState;", "component6", "component7", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/NotificationsVisibility;", "component8", "()Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;", "component9", "()Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "component10", "()Z", "component11", "()Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "component12", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ConnectionQuality;", "component13", "()Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;", "component14", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;", "component15", "component16", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/splitter/Splitter;", "component17", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Config;", "component18", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/StringResources;", "copy", "(Ljava/util/Map;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ServiceStatus;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;Lcom/avito/android/permissions/PermissionState;Lcom/avito/android/permissions/PermissionState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/NotificationsVisibility;Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;ZLcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ConnectionQuality;Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/splitter/Splitter;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Config;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/StringResources;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "toStringParams", "", "params", "jointToString", "([Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Map;", "getCallInits", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ServiceStatus;", "getService", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "getScreen", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "getApp", "Lcom/avito/android/permissions/PermissionState;", "getMicPerm", "getCameraPerm", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/NotificationsVisibility;", "getNotifications", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;", "getRingingMode", "Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "getCamera", "Z", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "getNetwork", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ConnectionQuality;", "getConnectionQuality", "Lcom/avito/android/iac_dialer/impl_module/device_status/power_status/IacPowerStatus;", "getPower", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;", "getStorage", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/splitter/Splitter;", "getSplitter", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Config;", "getConfig", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/StringResources;", "getStringResources", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Appearance implements dL.d {
    public static final int $stable = 8;

    @Y61.k
    private final LifecycleStatus.App app;

    @Y61.k
    private final Map<String, CallInit> callInits;

    @Y61.l
    private final IacCameraPosition camera;

    @Y61.k
    private final PermissionState cameraPerm;

    @Y61.k
    private final Config config;

    @Y61.k
    private final ConnectionQuality connectionQuality;
    private final boolean isGsmBusy;
    private final boolean isMiui;

    @Y61.k
    private final PermissionState micPerm;

    @Y61.k
    private final IacConnectionStatus network;

    @Y61.k
    private final NotificationsVisibility notifications;

    @Y61.k
    private final IacPowerStatus power;

    @Y61.k
    private final IacRingingMode ringingMode;

    @Y61.k
    private final LifecycleStatus.Components screen;

    @Y61.l
    private final ServiceStatus service;

    @Y61.k
    private final Splitter splitter;

    @Y61.k
    private final CallStorage storage;

    @Y61.k
    private final StringResources stringResources;

    public Appearance(@Y61.k Map<String, CallInit> map, @Y61.l ServiceStatus serviceStatus, @Y61.k LifecycleStatus.Components components, @Y61.k LifecycleStatus.App app, @Y61.k PermissionState permissionState, @Y61.k PermissionState permissionState2, @Y61.k NotificationsVisibility notificationsVisibility, @Y61.k IacRingingMode iacRingingMode, @Y61.l IacCameraPosition iacCameraPosition, boolean z12, @Y61.k IacConnectionStatus iacConnectionStatus, @Y61.k ConnectionQuality connectionQuality, @Y61.k IacPowerStatus iacPowerStatus, @Y61.k CallStorage callStorage, boolean z13, @Y61.k Splitter splitter, @Y61.k Config config, @Y61.k StringResources stringResources) {
        this.callInits = map;
        this.service = serviceStatus;
        this.screen = components;
        this.app = app;
        this.micPerm = permissionState;
        this.cameraPerm = permissionState2;
        this.notifications = notificationsVisibility;
        this.ringingMode = iacRingingMode;
        this.camera = iacCameraPosition;
        this.isGsmBusy = z12;
        this.network = iacConnectionStatus;
        this.connectionQuality = connectionQuality;
        this.power = iacPowerStatus;
        this.storage = callStorage;
        this.isMiui = z13;
        this.splitter = splitter;
        this.config = config;
        this.stringResources = stringResources;
    }

    private final String jointToString(String... params) {
        return C42756l.P(params, null, null, null, null, 63);
    }

    private final String toStringParams() {
        return jointToString("callInits=" + this.callInits.values(), "service=" + this.service, "screen=" + this.screen, "app=" + this.app, "micPerm=" + this.micPerm, "cameraPerm=" + this.cameraPerm, "notifications=" + this.notifications, "ringingMode=" + this.ringingMode, "camera=" + this.camera, "isGsmBusy=" + this.isGsmBusy, "network=" + this.network, "connectionQuality=" + this.connectionQuality, "power=" + this.power);
    }

    @Y61.k
    public final Map<String, CallInit> component1() {
        return this.callInits;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsGsmBusy() {
        return this.isGsmBusy;
    }

    @Y61.k
    /* renamed from: component11, reason: from getter */
    public final IacConnectionStatus getNetwork() {
        return this.network;
    }

    @Y61.k
    /* renamed from: component12, reason: from getter */
    public final ConnectionQuality getConnectionQuality() {
        return this.connectionQuality;
    }

    @Y61.k
    /* renamed from: component13, reason: from getter */
    public final IacPowerStatus getPower() {
        return this.power;
    }

    @Y61.k
    /* renamed from: component14, reason: from getter */
    public final CallStorage getStorage() {
        return this.storage;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsMiui() {
        return this.isMiui;
    }

    @Y61.k
    /* renamed from: component16, reason: from getter */
    public final Splitter getSplitter() {
        return this.splitter;
    }

    @Y61.k
    /* renamed from: component17, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @Y61.k
    /* renamed from: component18, reason: from getter */
    public final StringResources getStringResources() {
        return this.stringResources;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final ServiceStatus getService() {
        return this.service;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final LifecycleStatus.Components getScreen() {
        return this.screen;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final LifecycleStatus.App getApp() {
        return this.app;
    }

    @Y61.k
    /* renamed from: component5, reason: from getter */
    public final PermissionState getMicPerm() {
        return this.micPerm;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final PermissionState getCameraPerm() {
        return this.cameraPerm;
    }

    @Y61.k
    /* renamed from: component7, reason: from getter */
    public final NotificationsVisibility getNotifications() {
        return this.notifications;
    }

    @Y61.k
    /* renamed from: component8, reason: from getter */
    public final IacRingingMode getRingingMode() {
        return this.ringingMode;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final IacCameraPosition getCamera() {
        return this.camera;
    }

    @Y61.k
    public final Appearance copy(@Y61.k Map<String, CallInit> callInits, @Y61.l ServiceStatus service, @Y61.k LifecycleStatus.Components screen, @Y61.k LifecycleStatus.App app, @Y61.k PermissionState micPerm, @Y61.k PermissionState cameraPerm, @Y61.k NotificationsVisibility notifications, @Y61.k IacRingingMode ringingMode, @Y61.l IacCameraPosition camera, boolean isGsmBusy, @Y61.k IacConnectionStatus network, @Y61.k ConnectionQuality connectionQuality, @Y61.k IacPowerStatus power, @Y61.k CallStorage storage, boolean isMiui, @Y61.k Splitter splitter, @Y61.k Config config, @Y61.k StringResources stringResources) {
        return new Appearance(callInits, service, screen, app, micPerm, cameraPerm, notifications, ringingMode, camera, isGsmBusy, network, connectionQuality, power, storage, isMiui, splitter, config, stringResources);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Appearance)) {
            return false;
        }
        Appearance appearance = (Appearance) other;
        return L.f(this.callInits, appearance.callInits) && L.f(this.service, appearance.service) && L.f(this.screen, appearance.screen) && L.f(this.app, appearance.app) && this.micPerm == appearance.micPerm && this.cameraPerm == appearance.cameraPerm && this.notifications == appearance.notifications && this.ringingMode == appearance.ringingMode && this.camera == appearance.camera && this.isGsmBusy == appearance.isGsmBusy && L.f(this.network, appearance.network) && this.connectionQuality == appearance.connectionQuality && L.f(this.power, appearance.power) && L.f(this.storage, appearance.storage) && this.isMiui == appearance.isMiui && L.f(this.splitter, appearance.splitter) && L.f(this.config, appearance.config) && L.f(this.stringResources, appearance.stringResources);
    }

    @Y61.k
    public final LifecycleStatus.App getApp() {
        return this.app;
    }

    @Y61.k
    public final Map<String, CallInit> getCallInits() {
        return this.callInits;
    }

    @Y61.l
    public final IacCameraPosition getCamera() {
        return this.camera;
    }

    @Y61.k
    public final PermissionState getCameraPerm() {
        return this.cameraPerm;
    }

    @Y61.k
    public final Config getConfig() {
        return this.config;
    }

    @Y61.k
    public final ConnectionQuality getConnectionQuality() {
        return this.connectionQuality;
    }

    @Y61.k
    public final PermissionState getMicPerm() {
        return this.micPerm;
    }

    @Y61.k
    public final IacConnectionStatus getNetwork() {
        return this.network;
    }

    @Y61.k
    public final NotificationsVisibility getNotifications() {
        return this.notifications;
    }

    @Y61.k
    public final IacPowerStatus getPower() {
        return this.power;
    }

    @Y61.k
    public final IacRingingMode getRingingMode() {
        return this.ringingMode;
    }

    @Y61.k
    public final LifecycleStatus.Components getScreen() {
        return this.screen;
    }

    @Y61.l
    public final ServiceStatus getService() {
        return this.service;
    }

    @Y61.k
    public final Splitter getSplitter() {
        return this.splitter;
    }

    @Y61.k
    public final CallStorage getStorage() {
        return this.storage;
    }

    @Y61.k
    public final StringResources getStringResources() {
        return this.stringResources;
    }

    public int hashCode() {
        int iHashCode = this.callInits.hashCode() * 31;
        ServiceStatus serviceStatus = this.service;
        int iHashCode2 = (this.ringingMode.hashCode() + ((this.notifications.hashCode() + ((this.cameraPerm.hashCode() + ((this.micPerm.hashCode() + ((this.app.hashCode() + ((this.screen.hashCode() + ((iHashCode + (serviceStatus == null ? 0 : serviceStatus.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        IacCameraPosition iacCameraPosition = this.camera;
        return this.stringResources.hashCode() + ((this.config.hashCode() + ((this.splitter.hashCode() + androidx.appcompat.app.r.i((this.storage.hashCode() + ((this.power.hashCode() + ((this.connectionQuality.hashCode() + ((this.network.hashCode() + androidx.appcompat.app.r.i((iHashCode2 + (iacCameraPosition != null ? iacCameraPosition.hashCode() : 0)) * 31, 31, this.isGsmBusy)) * 31)) * 31)) * 31)) * 31, 31, this.isMiui)) * 31)) * 31);
    }

    public final boolean isGsmBusy() {
        return this.isGsmBusy;
    }

    public final boolean isMiui() {
        return this.isMiui;
    }

    @Y61.k
    public String toString() {
        return C22026a.c(new StringBuilder("Appearance("), toStringParams(), ')');
    }
}
