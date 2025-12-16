package org.koin.android.ext.koin;

import Y61.k;
import android.app.Application;
import android.content.Context;
import java.util.Collections;
import kotlin.C50385c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;

/* compiled from: KoinExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    @k
    public static final void a(@k o71.e eVar, @k Context context) {
        o71.d dVar = eVar.f419401a;
        AbstractC48011b abstractC48011b = dVar.f419399c;
        Level level = Level.f421466c;
        if (abstractC48011b.b(level)) {
            AbstractC48011b abstractC48011b2 = dVar.f419399c;
            if (abstractC48011b2.b(level)) {
                abstractC48011b2.a(level, "[init] declare Android Context");
            }
        }
        if (context instanceof Application) {
            dVar.c(Collections.singletonList(C50385c.a(new b(context))), true);
        } else {
            dVar.c(Collections.singletonList(C50385c.a(new d(context))), true);
        }
    }
}
