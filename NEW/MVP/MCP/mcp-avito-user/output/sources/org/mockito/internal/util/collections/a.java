package org.mockito.internal.util.collections;

import Y71.h;
import androidx.compose.foundation.H;
import i81.InterfaceC41246f;

/* compiled from: HashCodeAndEqualsMockWrapper.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f421733a;

    public a(Object obj) {
        this.f421733a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f421733a == ((a) obj).f421733a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f421733a);
    }

    public final String toString() {
        Object objB;
        StringBuilder sb2 = new StringBuilder("HashCodeAndEqualsMockWrapper{mockInstance=");
        Object obj = this.f421733a;
        if (obj != null) {
            if (h.f19325a.e(h.c(obj)) != null) {
                objB = h.b(obj);
            }
            return H.n(sb2, objB, '}');
        }
        InterfaceC41246f interfaceC41246f = h.f19325a;
        objB = obj.getClass().getSimpleName() + "(" + System.identityHashCode(obj) + ")";
        return H.n(sb2, objB, '}');
    }
}
