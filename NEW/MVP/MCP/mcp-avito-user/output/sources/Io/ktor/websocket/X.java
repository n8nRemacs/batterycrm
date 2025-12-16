package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketReader.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 0, 1, 1}, l = {92, 100}, m = "parseLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class X extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public V f401460q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f401461r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401462s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V f401463t;

    /* renamed from: u, reason: collision with root package name */
    public int f401464u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(V v12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401463t = v12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401462s = obj;
        this.f401464u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401463t.e(null, this);
    }
}
