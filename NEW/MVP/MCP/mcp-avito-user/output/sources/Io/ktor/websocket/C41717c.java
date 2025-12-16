package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0}, l = {327}, m = "checkMaxFrameSize", n = {"size"}, s = {"I$0"})
/* renamed from: io.ktor.websocket.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41717c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public int f401490q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41716b f401492s;

    /* renamed from: t, reason: collision with root package name */
    public int f401493t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41717c(C41716b c41716b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401492s = c41716b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401491r = obj;
        this.f401493t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41716b.b(this.f401492s, null, null, this);
    }
}
