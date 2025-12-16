package com.avito.android.permissions;

import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;

/* compiled from: PermissionStateProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/z;", "", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface z {
    @Y61.k
    B0 a();

    @Y61.k
    PermissionState b(@Y61.k String str);

    void c(@Y61.k PermissionState permissionState, @Y61.k String str);
}
