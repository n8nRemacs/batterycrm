package com.avito.android.beduin.common.local_deeplink;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.local_deeplink.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BeduinLocalDeeplinkFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/local_deeplink/c;", "Lcom/avito/android/beduin/common/local_deeplink/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.beduin.common.local_deeplink.b
    @l
    public final a.C3101a a(@k String str) {
        if (C43066x.h0(str, "tabs", false)) {
            return new a.C3101a(C43066x.m0(str, ":", str));
        }
        return null;
    }
}
