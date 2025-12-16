package hW0;

import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.util.k;
import j.N;

/* compiled from: BytesResource.java */
/* loaded from: classes5.dex */
public class b implements w<byte[]> {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f397218b;

    public b(byte[] bArr) {
        k.c(bArr, "Argument must not be null");
        this.f397218b = bArr;
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<byte[]> b() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final byte[] get() {
        return this.f397218b;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return this.f397218b.length;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void c() {
    }
}
