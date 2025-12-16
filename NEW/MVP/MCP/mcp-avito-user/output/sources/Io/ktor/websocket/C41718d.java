package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 2}, l = {252, 256, 266}, m = "outgoingProcessorLoop", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: io.ktor.websocket.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41718d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41716b f401512q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43125y f401513r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401514s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41716b f401515t;

    /* renamed from: u, reason: collision with root package name */
    public int f401516u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41718d(C41716b c41716b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401515t = c41716b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401514s = obj;
        this.f401516u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41716b.c(this.f401515t, this);
    }
}
