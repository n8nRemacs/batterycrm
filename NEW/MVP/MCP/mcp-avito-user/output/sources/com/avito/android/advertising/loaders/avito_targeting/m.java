package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerRawResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AvitoTargetingBannerLoader.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse;", "it", "Lcom/avito/android/advertising/b;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/advertising/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f88046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f88047c;

    public m(i iVar, long j12) {
        this.f88046b = iVar;
        this.f88047c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws AvitoTargetingNoBannerErrorException {
        TypedResult typedResult = (TypedResult) obj;
        i iVar = this.f88046b;
        iVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f88047c;
        if (typedResult instanceof TypedResult.Success) {
            AvitoNetworkBannerRawResponse avitoNetworkBannerRawResponse = (AvitoNetworkBannerRawResponse) ((TypedResult.Success) typedResult).getResult();
            if (avitoNetworkBannerRawResponse instanceof AvitoNetworkBannerRawResponse.Success) {
                return iVar.f88037c.b(((AvitoNetworkBannerRawResponse.Success) avitoNetworkBannerRawResponse).getBanner());
            }
            if (avitoNetworkBannerRawResponse instanceof AvitoNetworkBannerRawResponse.NoContent) {
                throw new AvitoTargetingNoBannerErrorException(jCurrentTimeMillis, null, ((AvitoNetworkBannerRawResponse.NoContent) avitoNetworkBannerRawResponse).getMessage(), 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb2 = new StringBuilder();
        com.avito.android.remote.error.o oVar = com.avito.android.remote.error.o.f253437a;
        TypedResult.Error error = (TypedResult.Error) typedResult;
        ApiError error2 = error.getError();
        oVar.getClass();
        String strC = com.avito.android.remote.error.o.c(error2);
        if (strC == null) {
            strC = "";
        }
        sb2.append(strC);
        sb2.append(' ');
        sb2.append(error.getError().getF244063c());
        throw new AvitoTargetingBadResponseException(jCurrentTimeMillis, null, sb2.toString(), 2, null);
    }
}
