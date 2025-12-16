package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: WebSocketWriter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 0, 0}, l = {121}, m = "drainQueueAndSerialize", n = {"this", "buffer", "flush", "closeSent"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes8.dex */
final class d0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c0 f401517q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f401518r;

    /* renamed from: s, reason: collision with root package name */
    public l0.h f401519s;

    /* renamed from: t, reason: collision with root package name */
    public int f401520t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f401521u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c0 f401522v;

    /* renamed from: w, reason: collision with root package name */
    public int f401523w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401522v = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401521u = obj;
        this.f401523w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401522v.c(null, null, this);
    }
}
