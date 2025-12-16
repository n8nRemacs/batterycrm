package com.avito.android.publish.slots.iac_devices;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: IacPermissionsNotGrantedError.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/IacPermissionsNotGrantedError;", "Lcom/avito/android/remote/error/ApiError$Custom;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class IacPermissionsNotGrantedError extends ApiError.Custom {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IacPermissionRequestSource f244064c;

    public IacPermissionsNotGrantedError(@k IacPermissionRequestSource iacPermissionRequestSource) {
        super(null, 1, null);
        this.f244064c = iacPermissionRequestSource;
    }
}
