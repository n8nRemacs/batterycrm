package wW0;

import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.internal.http2.Http2;

/* compiled from: PooledByteStreams.java */
@Nullsafe
/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f441529a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC49570a f441530b;

    public j(InterfaceC49570a interfaceC49570a) {
        o.a(true);
        this.f441529a = Http2.INITIAL_MAX_FRAME_SIZE;
        this.f441530b = interfaceC49570a;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) {
        InterfaceC49570a interfaceC49570a = this.f441530b;
        int i12 = this.f441529a;
        byte[] bArr = interfaceC49570a.get(i12);
        while (true) {
            try {
                int i13 = inputStream.read(bArr, 0, i12);
                if (i13 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i13);
                }
            } finally {
                interfaceC49570a.a(bArr);
            }
        }
    }
}
