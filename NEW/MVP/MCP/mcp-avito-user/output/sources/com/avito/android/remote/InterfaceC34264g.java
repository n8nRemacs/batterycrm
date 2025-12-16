package com.avito.android.remote;

import com.avito.android.remote.model.ThirdPartyApi;
import e30.InterfaceC39936a;
import kotlin.Metadata;

/* compiled from: AuthTrackerApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/g;", "", "", "uidWithUserHash", "connectionHeaderValue", "Lio/reactivex/rxjava3/core/I;", "Lretrofit2/y;", "Lkotlin/G0;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "uid", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.g, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34264g {

    /* compiled from: AuthTrackerApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.g$a */
    public static final class a {
    }

    @J81.f("https://{uuid}.p.avito.ru")
    @Y61.k
    @ThirdPartyApi
    io.reactivex.rxjava3.core.I<retrofit2.y<kotlin.G0>> a(@J81.s(encoded = true, value = "uuid") @Y61.k String uid);

    @J81.f("https://track.onef.pro/track/reg/v1?1f_pixel_id=bb2e0421-cf41-4e74-b843-b37a9f39e8fa")
    @Y61.k
    @ThirdPartyApi
    io.reactivex.rxjava3.core.I<retrofit2.y<kotlin.G0>> b(@J81.t("internal_id") @Y61.k String uidWithUserHash, @J81.i("Connection") @Y61.k String connectionHeaderValue);
}
