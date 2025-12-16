package ru.rustore.sdk.pushclient.messaging.exception;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.rustore.sdk.core.exception.RuStoreException;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "Lru/rustore/sdk/core/exception/RuStoreException;", "HostAppBackgroundWorkPermissionNotGranted", "HostAppNotInstalledException", "UnauthorizedException", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppBackgroundWorkPermissionNotGranted;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppNotInstalledException;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$UnauthorizedException;", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class RuStorePushClientException extends RuStoreException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppBackgroundWorkPermissionNotGranted;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class HostAppBackgroundWorkPermissionNotGranted extends RuStorePushClientException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$HostAppNotInstalledException;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class HostAppNotInstalledException extends RuStorePushClientException {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f436829b;

        public HostAppNotInstalledException(@k String str) {
            super(str, null);
            this.f436829b = true;
        }

        @Override // ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException
        /* renamed from: a, reason: from getter */
        public final boolean getF436830b() {
            return this.f436829b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException$UnauthorizedException;", "Lru/rustore/sdk/pushclient/messaging/exception/RuStorePushClientException;", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class UnauthorizedException extends RuStorePushClientException {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f436830b;

        public UnauthorizedException(@k String str) {
            super(str, null);
            this.f436830b = true;
        }

        @Override // ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException
        /* renamed from: a, reason: from getter */
        public final boolean getF436830b() {
            return this.f436830b;
        }
    }

    public RuStorePushClientException(String str, C42822w c42822w) {
        super(str);
    }

    /* renamed from: a */
    public boolean getF436830b() {
        return false;
    }
}
