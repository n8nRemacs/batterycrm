package io.ktor.client.plugins.logging;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoggingUtils.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", i = {0, 0}, l = {71}, m = "logResponseBody", n = {"$this$logResponseBody_u24lambda_u244", "charset$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class u extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public StringBuilder f399557q;

    /* renamed from: r, reason: collision with root package name */
    public Charset f399558r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399559s;

    /* renamed from: t, reason: collision with root package name */
    public int f399560t;

    public u() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399559s = obj;
        this.f399560t |= BeduinInputModel.MIN_TEXT_VERSION;
        return w.c(null, null, null, this);
    }
}
