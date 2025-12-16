package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.remote.model.advertising.AvitoTargetingRawResponse;
import kotlin.Metadata;
import retrofit2.y;

/* compiled from: AvitoTargetingBannerLoader.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lretrofit2/y;", "Lcom/avito/android/remote/model/advertising/AvitoTargetingRawResponse;", "it", "Lcom/avito/android/advertising/b;", "apply", "(Lretrofit2/y;)Lcom/avito/android/advertising/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f88043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f88044c;

    public k(i iVar, long j12) {
        this.f88043b = iVar;
        this.f88044c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws AvitoTargetingNoBannerErrorException {
        y yVar = (y) obj;
        i iVar = this.f88043b;
        iVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f88044c;
        int iCode = yVar.f430118a.code();
        if (iCode == 204) {
            throw new AvitoTargetingNoBannerErrorException(jCurrentTimeMillis, Integer.valueOf(iCode), null, 4, null);
        }
        AvitoTargetingRawResponse avitoTargetingRawResponse = (AvitoTargetingRawResponse) yVar.f430119b;
        if (avitoTargetingRawResponse == null) {
            throw new AvitoTargetingBadResponseException(jCurrentTimeMillis, Integer.valueOf(iCode), null, 4, null);
        }
        return iVar.f88036b.d(iVar.f88038d.a(avitoTargetingRawResponse));
    }
}
