package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 0, 0}, l = {281}, m = "sendCloseSequence", n = {"this", "exception", "reasonToSend"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: io.ktor.websocket.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41721g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41716b f401545q;

    /* renamed from: r, reason: collision with root package name */
    public Throwable f401546r;

    /* renamed from: s, reason: collision with root package name */
    public CloseReason f401547s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f401548t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C41716b f401549u;

    /* renamed from: v, reason: collision with root package name */
    public int f401550v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41721g(C41716b c41716b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401549u = c41716b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401548t = obj;
        this.f401550v |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41716b.f401473l;
        return this.f401549u.f(null, null, this);
    }
}
