package jW0;

import com.bumptech.glide.load.h;
import j.N;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: MediaStoreSignature.java */
/* loaded from: classes5.dex */
public class d implements h {
    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(0L).putInt(0).array());
        throw null;
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        throw null;
    }
}
