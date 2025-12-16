package com.avito.android.iac_dialer_watcher.impl_module.api;

import Y61.k;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* compiled from: IacDialerWatcherApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/api/a;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @k
    I<TypedResult<Object>> a(@k MultipartBody.Part part, @k MultipartBody.Part part2, @k MultipartBody.Part part3);
}
