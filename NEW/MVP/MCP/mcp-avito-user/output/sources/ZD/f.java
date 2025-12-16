package Zd;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthParams.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_authorization_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {
    @Y61.k
    public static final String a(@Y61.k com.avito.android.ui.activity.a aVar) {
        String stringExtra = aVar.getIntent().getStringExtra("hash");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalStateException("hash must be specified");
    }

    @Y61.k
    public static final String b(@Y61.k com.avito.android.ui.activity.a aVar) {
        String stringExtra = aVar.getIntent().getStringExtra("login");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalStateException("login must be specified");
    }
}
