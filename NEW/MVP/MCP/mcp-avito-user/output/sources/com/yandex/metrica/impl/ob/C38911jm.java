package com.yandex.metrica.impl.ob;

import java.util.Locale;
import java.util.UUID;
import kotlin.text.C43066x;

/* renamed from: com.yandex.metrica.impl.ob.jm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38911jm {
    @Y61.k
    public final String a() {
        return C43066x.a0(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.US);
    }
}
