package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", i = {0}, l = {120, 121}, m = "close", n = {"$this$close"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class a0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Z f401470q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401471r;

    /* renamed from: s, reason: collision with root package name */
    public int f401472s;

    public a0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401471r = obj;
        this.f401472s |= BeduinInputModel.MIN_TEXT_VERSION;
        return b0.a(null, null, this);
    }
}
