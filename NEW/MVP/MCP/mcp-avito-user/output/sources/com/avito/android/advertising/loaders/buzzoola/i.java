package com.avito.android.advertising.loaders.buzzoola;

import com.avito.android.remote.model.advertising.BuzzoolaRawResponse;
import kotlin.Metadata;
import retrofit2.y;

/* compiled from: BuzzoolaBannerLoader.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lretrofit2/y;", "Lcom/avito/android/remote/model/advertising/BuzzoolaRawResponse;", "it", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "apply", "(Lretrofit2/y;)Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f88317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f88318c;

    public i(l lVar, long j12) {
        this.f88317b = lVar;
        this.f88318c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws BuzzoolaNoBannerErrorException {
        y yVar = (y) obj;
        l lVar = this.f88317b;
        lVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f88318c;
        int iCode = yVar.f430118a.code();
        if (iCode == 204) {
            throw new BuzzoolaNoBannerErrorException("Response: " + iCode + ", Loading Time: " + jCurrentTimeMillis + " ms");
        }
        BuzzoolaRawResponse buzzoolaRawResponse = (BuzzoolaRawResponse) yVar.f430119b;
        if (buzzoolaRawResponse != null) {
            return lVar.f88324c.d(buzzoolaRawResponse);
        }
        throw new BuzzoolaBadResponseException("Bad Response: " + iCode + ", Loading Time: " + jCurrentTimeMillis + " ms");
    }
}
