package androidx.media3.common.util;

import androidx.media3.exoplayer.drm.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset.java */
@J
/* renamed from: androidx.media3.common.util.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23120k<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f47910b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public final HashMap f47911c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public Set<E> f47912d = Collections.emptySet();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public List<E> f47913e = Collections.emptyList();

    public final int a(f.a aVar) {
        int iIntValue;
        synchronized (this.f47910b) {
            try {
                iIntValue = this.f47911c.containsKey(aVar) ? ((Integer) this.f47911c.get(aVar)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f47910b) {
            it = this.f47913e.iterator();
        }
        return it;
    }
}
