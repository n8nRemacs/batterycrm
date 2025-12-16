package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketReader.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 0, 1, 1}, l = {68, 74}, m = "readLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class Y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public V f401465q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f401466r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401467s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V f401468t;

    /* renamed from: u, reason: collision with root package name */
    public int f401469u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(V v12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401468t = v12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401467s = obj;
        this.f401469u |= BeduinInputModel.MIN_TEXT_VERSION;
        return V.b(this.f401468t, null, this);
    }
}
