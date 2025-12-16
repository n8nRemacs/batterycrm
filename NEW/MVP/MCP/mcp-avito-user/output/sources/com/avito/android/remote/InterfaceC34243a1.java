package com.avito.android.remote;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;

/* compiled from: SessionsApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J?\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\nJK\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/a1;", "", "", "deviceId", "sessionHashId", "loginType", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", SearchParamsConverterKt.SOURCE, "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-api_sessions"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.a1, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34243a1 {
    @J81.o("1/profile/sessions/delete/other")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> a(@J81.c("deviceId") @Y61.l String deviceId, @J81.c("sessionIdHash") @Y61.l String sessionHashId, @J81.c("loginType") @Y61.l String loginType, @J81.c(SearchParamsConverterKt.SOURCE) @Y61.l String source);

    @J81.o("1/profile/sessions/delete/one")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> b(@J81.c("deviceId") @Y61.l String deviceId, @J81.c("sessionIdHash") @Y61.l String sessionHashId, @J81.c("loginType") @Y61.l String loginType);
}
