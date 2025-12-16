package com.avito.android.iac_dialer_watcher.impl_module.api;

import J81.l;
import J81.o;
import J81.q;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* compiled from: IacDialerWatcherRetrofitApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/api/e;", "Lcom/avito/android/iac_dialer_watcher/impl_module/api/a;", "Lokhttp3/MultipartBody$Part;", "uploadId", "file", "header", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "a", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface e extends a {
    @Override // com.avito.android.iac_dialer_watcher.impl_module.api.a
    @o("2/ip-calls/uploadLog")
    @l
    @k
    I<TypedResult<Object>> a(@q @k MultipartBody.Part uploadId, @q @k MultipartBody.Part file, @q @k MultipartBody.Part header);
}
