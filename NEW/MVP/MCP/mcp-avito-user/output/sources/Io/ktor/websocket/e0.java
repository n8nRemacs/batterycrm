package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: WebSocketWriter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 1, 1}, l = {46, 48}, m = "writeLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class e0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c0 f401536q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f401537r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f401538s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f401539t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c0 f401540u;

    /* renamed from: v, reason: collision with root package name */
    public int f401541v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401540u = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401539t = obj;
        this.f401541v |= BeduinInputModel.MIN_TEXT_VERSION;
        return c0.b(this.f401540u, null, this);
    }
}
