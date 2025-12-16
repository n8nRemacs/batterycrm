package com.avito.avcalls.logger;

import Y61.k;
import Y61.l;
import com.avito.avcalls.logger.b;
import kotlin.Metadata;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/logger/g;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f332960a = new g();

    public static void a(@k String str, @k String str2, @l Exception exc) {
        b.INSTANCE.getClass();
        f fVar = b.Companion.f332946b;
        if (fVar != null) {
            fVar.b(str, LogSeverity.f332939f, str2, exc);
        }
    }

    public static void b(@k String str, @k String str2) {
        b.INSTANCE.getClass();
        f fVar = b.Companion.f332946b;
        if (fVar != null) {
            fVar.b(str, LogSeverity.f332937d, str2, null);
        }
    }
}
