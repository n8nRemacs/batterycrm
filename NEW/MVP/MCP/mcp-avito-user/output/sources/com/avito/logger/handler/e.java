package com.avito.logger.handler;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PrintlnLoggingHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class e extends N implements Y41.a<SimpleDateFormat> {
    static {
        new e();
    }

    public e() {
        super(0);
    }

    @Override // Y41.a
    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("yyyy-MM-dd kk:mm:ss.SSS", Locale.ROOT);
    }
}
