package com.avito.android.silent_update.permissions.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.silent_update.permissions.SilentUpdatePermissions;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PermissionsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "RequestDozeModePermission", "RequestInstallPermission", "RequestStoragePermission", "SendPermissionsResultAndFinish", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$RequestDozeModePermission;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$RequestInstallPermission;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$RequestStoragePermission;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$SendPermissionsResultAndFinish;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PermissionsInternalAction extends n {

    /* compiled from: PermissionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$RequestDozeModePermission;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestDozeModePermission implements PermissionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestDozeModePermission f283733b = new RequestDozeModePermission();

        private RequestDozeModePermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestDozeModePermission);
        }

        public final int hashCode() {
            return 1266370067;
        }

        @k
        public final String toString() {
            return "RequestDozeModePermission";
        }
    }

    /* compiled from: PermissionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$RequestInstallPermission;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestInstallPermission implements PermissionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestInstallPermission f283734b = new RequestInstallPermission();

        private RequestInstallPermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestInstallPermission);
        }

        public final int hashCode() {
            return -751906625;
        }

        @k
        public final String toString() {
            return "RequestInstallPermission";
        }
    }

    /* compiled from: PermissionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$RequestStoragePermission;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestStoragePermission implements PermissionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestStoragePermission f283735b = new RequestStoragePermission();

        private RequestStoragePermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestStoragePermission);
        }

        public final int hashCode() {
            return -547727969;
        }

        @k
        public final String toString() {
            return "RequestStoragePermission";
        }
    }

    /* compiled from: PermissionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction$SendPermissionsResultAndFinish;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendPermissionsResultAndFinish implements PermissionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SilentUpdatePermissions f283736b;

        public SendPermissionsResultAndFinish(@k SilentUpdatePermissions silentUpdatePermissions) {
            this.f283736b = silentUpdatePermissions;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendPermissionsResultAndFinish) && L.f(this.f283736b, ((SendPermissionsResultAndFinish) obj).f283736b);
        }

        public final int hashCode() {
            return this.f283736b.hashCode();
        }

        @k
        public final String toString() {
            return "SendPermissionsResultAndFinish(permissions=" + this.f283736b + ')';
        }
    }
}
