package jW0;

import androidx.compose.foundation.H;
import com.bumptech.glide.load.h;
import com.bumptech.glide.util.k;
import j.N;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f405624b;

    public e(@N Object obj) {
        k.c(obj, "Argument must not be null");
        this.f405624b = obj;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(this.f405624b.toString().getBytes(h.f339193a));
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f405624b.equals(((e) obj).f405624b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return this.f405624b.hashCode();
    }

    public final String toString() {
        return H.n(new StringBuilder("ObjectKey{object="), this.f405624b, '}');
    }
}
