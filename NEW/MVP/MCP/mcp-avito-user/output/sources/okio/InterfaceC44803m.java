package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

/* compiled from: BufferedSink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/m;", "Lokio/c0;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/l;", "Lokio/X;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC44803m extends c0, WritableByteChannel {
    @Y61.k
    InterfaceC44803m B1(@Y61.k C44805o c44805o);

    @Y61.k
    InterfaceC44803m Q4();

    @Y61.k
    InterfaceC44803m U0(long j12);

    @Y61.k
    InterfaceC44803m W1();

    @Y61.k
    InterfaceC44803m b2(@Y61.k String str);

    @Override // okio.c0, java.io.Flushable
    void flush();

    long h2(@Y61.k e0 e0Var);

    @Y61.k
    InterfaceC44803m k6(int i12, int i13, @Y61.k byte[] bArr);

    @Y61.k
    OutputStream q6();

    @Y61.k
    /* renamed from: v */
    C44802l getF420043c();

    @Y61.k
    InterfaceC44803m write(@Y61.k byte[] bArr);

    @Y61.k
    InterfaceC44803m writeByte(int i12);

    @Y61.k
    InterfaceC44803m writeInt(int i12);

    @Y61.k
    InterfaceC44803m writeLong(long j12);

    @Y61.k
    InterfaceC44803m writeShort(int i12);

    @Y61.k
    InterfaceC44803m z4(long j12);
}
