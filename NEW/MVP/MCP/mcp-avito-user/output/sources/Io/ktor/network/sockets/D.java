package io.ktor.network.sockets;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DatagramSocketImpl.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl", f = "DatagramSocketImpl.kt", i = {0, 0}, l = {88}, m = "receiveSuspend", n = {"this", "buffer"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class D extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public F f400215q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f400216r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400217s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ F f400218t;

    /* renamed from: u, reason: collision with root package name */
    public int f400219u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400218t = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400217s = obj;
        this.f400219u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400218t.f(null, this);
    }
}
