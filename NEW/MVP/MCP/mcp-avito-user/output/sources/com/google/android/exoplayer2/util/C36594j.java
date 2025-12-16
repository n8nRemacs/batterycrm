package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.drm.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset.java */
/* renamed from: com.google.android.exoplayer2.util.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36594j<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f348132b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public final HashMap f348133c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public Set<E> f348134d = Collections.emptySet();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public List<E> f348135e = Collections.emptyList();

    public final int a(e.a aVar) {
        int iIntValue;
        synchronized (this.f348132b) {
            try {
                iIntValue = this.f348133c.containsKey(aVar) ? ((Integer) this.f348133c.get(aVar)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f348132b) {
            it = this.f348135e.iterator();
        }
        return it;
    }
}
