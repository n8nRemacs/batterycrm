package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "nioBuffer", "Lkotlin/G0;", "invoke", "(Ljava/nio/ByteBuffer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: io.ktor.utils.io.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41662i extends kotlin.jvm.internal.N implements Y41.l<ByteBuffer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f400998l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f400999m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f401000n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.f f401001o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41662i(long j12, ByteBuffer byteBuffer, long j13, l0.f fVar) {
        super(1);
        this.f400998l = j12;
        this.f400999m = byteBuffer;
        this.f401000n = j13;
        this.f401001o = fVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer2.remaining() > 0) {
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) 0));
            int iLimit = byteBufferDuplicate.limit();
            ByteBuffer byteBuffer3 = this.f400999m;
            long jLimit = byteBuffer3.limit();
            long j12 = this.f401000n;
            byteBufferDuplicate.limit((int) Math.min(byteBufferDuplicate.limit(), Math.min(this.f400998l, jLimit - j12)));
            this.f401001o.f406840b = byteBufferDuplicate.remaining();
            V31.h.b(byteBufferDuplicate, byteBuffer3, (int) j12);
            byteBufferDuplicate.limit(iLimit);
        }
        return kotlin.G0.f406611a;
    }
}
