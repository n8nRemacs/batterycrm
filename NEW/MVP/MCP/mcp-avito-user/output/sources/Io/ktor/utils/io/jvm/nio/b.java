package io.ktor.utils.io.jvm.nio;

import Y41.l;
import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: Reading.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "bb", "Lkotlin/G0;", "invoke", "(Ljava/nio/ByteBuffer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class b extends N implements l<ByteBuffer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.g f401166l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l0.g gVar, l0.a aVar) {
        super(1);
        this.f401166l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j12 = 0 - this.f401166l.f406841b;
        if (j12 >= byteBuffer2.remaining()) {
            throw null;
        }
        byteBuffer2.limit();
        byteBuffer2.limit(byteBuffer2.position() + ((int) j12));
        throw null;
    }
}
