package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity;

import Y61.k;
import Y61.l;
import ZK.b;
import aL.C19787a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.permissions.PermissionState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedMicRequestScreenInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "a", "HandleDeeplink", "InitScreen", "OnMicPermissionGranted", "RouteToAppSettings", "SendEvent", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$HandleDeeplink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$InitScreen;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$OnMicPermissionGranted;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$RouteToAppSettings;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$SendEvent;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacFinishedMicRequestScreenInternalAction extends n {

    /* compiled from: IacFinishedMicRequestScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$HandleDeeplink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements IacFinishedMicRequestScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final IacPiiDeepLink f166773b;

        public HandleDeeplink(@k IacPiiDeepLink iacPiiDeepLink) {
            this.f166773b = iacPiiDeepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f166773b, ((HandleDeeplink) obj).f166773b);
        }

        public final int hashCode() {
            return this.f166773b.hashCode();
        }

        @k
        public final String toString() {
            return a.f166778a.a(new String[]{"link=" + this.f166773b}, this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$InitScreen;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitScreen implements IacFinishedMicRequestScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PermissionState f166774b;

        public InitScreen(@k PermissionState permissionState) {
            this.f166774b = permissionState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitScreen) && this.f166774b == ((InitScreen) obj).f166774b;
        }

        public final int hashCode() {
            return this.f166774b.hashCode();
        }

        @k
        public final String toString() {
            return a.f166778a.a(new String[]{"micPermissionState=" + this.f166774b}, this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$OnMicPermissionGranted;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnMicPermissionGranted implements IacFinishedMicRequestScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnMicPermissionGranted f166775b = new OnMicPermissionGranted();

        private OnMicPermissionGranted() {
        }

        @k
        public final String toString() {
            return a.f166778a.a(new String[0], this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$RouteToAppSettings;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RouteToAppSettings implements IacFinishedMicRequestScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RouteToAppSettings f166776b = new RouteToAppSettings();

        private RouteToAppSettings() {
        }

        @k
        public final String toString() {
            return a.f166778a.a(new String[0], this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$SendEvent;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendEvent implements IacFinishedMicRequestScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f166777b;

        public SendEvent(@k b bVar) {
            this.f166777b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendEvent) && L.f(this.f166777b, ((SendEvent) obj).f166777b);
        }

        public final int hashCode() {
            return this.f166777b.hashCode();
        }

        @k
        public final String toString() {
            return a.f166778a.a(new String[]{"event=" + this.f166777b}, this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction$a;", "", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C19787a<IacFinishedMicRequestScreenInternalAction> f166778a;

        static {
            new a();
            f166778a = new C19787a<>(IacFinishedMicRequestScreenInternalAction.class);
        }
    }
}
