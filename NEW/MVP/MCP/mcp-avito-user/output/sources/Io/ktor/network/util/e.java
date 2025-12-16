package io.ktor.network.util;

import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
final class e extends N implements Y41.a<Long> {
    static {
        new e();
    }

    public e() {
        super(0);
    }

    @Override // Y41.a
    public final Long invoke() {
        TimeZone timeZone = io.ktor.util.date.a.f400455a;
        return Long.valueOf(System.currentTimeMillis());
    }
}
