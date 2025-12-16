package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketReader.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0}, l = {115}, m = "handleFrameIfProduced", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class W extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public V f401456q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401457r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ V f401458s;

    /* renamed from: t, reason: collision with root package name */
    public int f401459t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(V v12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401458s = v12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401457r = obj;
        this.f401459t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401458s.c(this);
    }
}
