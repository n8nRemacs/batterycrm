package sv;

import Y61.k;
import ev.AbstractC40161a;
import kotlin.Metadata;
import okhttp3.internal.http2.Settings;

/* compiled from: RequestCodeGenerator.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_deeplink-handler"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: sv.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C48421d {
    public static final int a(@k AbstractC40161a<?> abstractC40161a) {
        C48420c.f438917a.getClass();
        int iAbs = Math.abs(abstractC40161a.f395444b.hashCode()) % Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return iAbs < 100 ? iAbs + 100 : iAbs;
    }
}
