package io.ktor.network.sockets;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CIOReader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Lkotlin/G0;", "invoke", "(Ljava/nio/ByteBuffer;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* renamed from: io.ktor.network.sockets.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41571m extends kotlin.jvm.internal.N implements Y41.l<ByteBuffer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f400255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ReadableByteChannel f400256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41571m(l0.f fVar, ReadableByteChannel readableByteChannel) {
        super(1);
        this.f400255l = fVar;
        this.f400256m = readableByteChannel;
    }

    @Override // Y41.l
    public final G0 invoke(ByteBuffer byteBuffer) {
        this.f400255l.f406840b = this.f400256m.read(byteBuffer);
        return G0.f406611a;
    }
}
