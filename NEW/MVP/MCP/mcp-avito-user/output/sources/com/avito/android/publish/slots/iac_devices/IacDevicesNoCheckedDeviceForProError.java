package com.avito.android.publish.slots.iac_devices;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: IacDevicesNoCheckedDeviceForProError.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/IacDevicesNoCheckedDeviceForProError;", "Lcom/avito/android/remote/error/ApiError$Custom;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class IacDevicesNoCheckedDeviceForProError extends ApiError.Custom {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f244063c;

    public IacDevicesNoCheckedDeviceForProError(@k String str) {
        super(null, 1, null);
        this.f244063c = str;
    }

    @Override // com.avito.android.remote.error.ApiError.Custom, com.avito.android.remote.error.q
    @k
    /* renamed from: getMessage, reason: from getter */
    public final String getF244063c() {
        return this.f244063c;
    }
}
