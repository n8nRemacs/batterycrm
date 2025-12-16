package YW0;

import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import uW0.C48986a;

/* compiled from: CloseableImage.java */
@Nullsafe
/* loaded from: classes13.dex */
public abstract class b implements Closeable, f {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f19491c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"));

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19492b = new HashMap();

    public i a() {
        return g.f19507d;
    }

    public abstract int b();

    public final void c(@I41.h Map<String, Object> map) {
        if (map == null) {
            return;
        }
        Iterator it = f19491c.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj != null) {
                this.f19492b.put(str, obj);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        C48986a.l("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // YW0.e
    public final HashMap getExtras() {
        return this.f19492b;
    }

    public abstract boolean isClosed();
}
