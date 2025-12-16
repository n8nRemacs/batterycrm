package com.avito.android.advertising.loaders.buzzoola;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: BuzzoolaExceptions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o {
    public static final void a(long j12, @Y61.k Throwable th2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j12;
        if (th2 instanceof BuzzoolaBadResponseException ? true : th2 instanceof BuzzoolaAssetNotFoundException ? true : th2 instanceof BuzzoolaUnknownErrorException) {
            V2.f318762a.a("buzzoola_error", "", th2);
            return;
        }
        if (th2 instanceof BuzzoolaNoBannerErrorException) {
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
        v22.a("buzzoola_error", "", new BuzzoolaRequestException(sb2.toString(), th2));
    }
}
