package com.avito.android.image.enhancement;

import com.avito.android.remote.model.ThirdPartyApi;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;

/* compiled from: ImageEnhanceApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/image/enhancement/a;", "", "Lokhttp3/MultipartBody$Part;", "file", "Lio/reactivex/rxjava3/core/I;", "Lokhttp3/ResponseBody;", "a", "(Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.image.enhancement.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC30970a {
    @J81.o("1/image/enhance")
    @J81.l
    @Y61.k
    @ThirdPartyApi
    io.reactivex.rxjava3.core.I<ResponseBody> a(@J81.q @Y61.k MultipartBody.Part file);
}
