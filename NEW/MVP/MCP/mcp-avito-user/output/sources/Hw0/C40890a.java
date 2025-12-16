package hW0;

import com.bumptech.glide.load.data.e;
import j.N;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* renamed from: hW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C40890a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f397217a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: hW0.a$a, reason: collision with other inner class name */
    public static class C11262a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new C40890a(byteBuffer);
        }
    }

    public C40890a(ByteBuffer byteBuffer) {
        this.f397217a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    @N
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f397217a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}
