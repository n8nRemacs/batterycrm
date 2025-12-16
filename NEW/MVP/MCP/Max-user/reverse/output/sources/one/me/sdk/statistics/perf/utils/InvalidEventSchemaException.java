package one.me.sdk.statistics.perf.utils;

import defpackage.u45;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/statistics/perf/utils/InvalidEventSchemaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "perf"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvalidEventSchemaException extends Exception {
    public InvalidEventSchemaException(String str, String str2) {
        super(u45.k(str, ": ", str2));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
