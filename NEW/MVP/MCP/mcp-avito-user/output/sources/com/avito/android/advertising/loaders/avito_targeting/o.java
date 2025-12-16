package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: AvitoTargetingBannerLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f88050b;

    public o(long j12) {
        this.f88050b = j12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f88050b;
        if (th2 instanceof AvitoTargetingBadResponseException ? true : th2 instanceof AvitoTargetingNoBannerErrorException ? true : th2 instanceof t) {
            V2.f318762a.a("avito_ad_error", "", th2);
            return;
        }
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("Error: ");
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        sb2.append(message);
        sb2.append(", Loading Time: ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms");
        v22.a("avito_ad_error", "", new AvitoAdRequestException(sb2.toString(), th2));
    }
}
