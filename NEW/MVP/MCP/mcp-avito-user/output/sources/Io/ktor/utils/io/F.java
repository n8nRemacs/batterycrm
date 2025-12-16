package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "it", "Lkotlin/G0;", "invoke", "(Ljava/nio/ByteBuffer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class F extends kotlin.jvm.internal.N implements Y41.l<ByteBuffer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f400605l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(l0.a aVar) {
        super(1);
        this.f400605l = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer2.get(byteBuffer2.position()) == 10) {
            byteBuffer2.position(byteBuffer2.position() + 1);
            this.f400605l.f406838b = true;
        }
        return kotlin.G0.f406611a;
    }
}
