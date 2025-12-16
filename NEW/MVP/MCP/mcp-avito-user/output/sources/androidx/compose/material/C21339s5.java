package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/s5;", "T", "Landroidx/compose/material/e3;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21339s5<T> implements InterfaceC21153e3<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f34181a;

    public C21339s5(@Y61.k Map<T, Float> map) {
        this.f34181a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC21153e3
    @Y61.l
    public final T a(float f12) {
        T next;
        Iterator<T> it = this.f34181a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f12 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f12 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC21153e3
    @Y61.l
    public final T b(float f12, boolean z12) {
        T next;
        Iterator<T> it = this.f34181a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f13 = z12 ? fFloatValue - f12 : f12 - fFloatValue;
                if (f13 < 0.0f) {
                    f13 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f14 = z12 ? fFloatValue2 - f12 : f12 - fFloatValue2;
                    if (f14 < 0.0f) {
                        f14 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f13, f14) > 0) {
                        next = next2;
                        f13 = f14;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC21153e3
    public final float c(T t12) {
        Float f12 = (Float) this.f34181a.get(t12);
        if (f12 != null) {
            return f12.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC21153e3
    public final boolean d(T t12) {
        return this.f34181a.containsKey(t12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC21153e3
    public final float e() {
        Float fB02 = C42745f0.b0(this.f34181a.values());
        if (fB02 != null) {
            return fB02.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21339s5)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f34181a, ((C21339s5) obj).f34181a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC21153e3
    public final float f() {
        Float fX2 = C42745f0.X(this.f34181a.values());
        if (fX2 != null) {
            return fX2.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material.InterfaceC21153e3
    public final int getSize() {
        return this.f34181a.size();
    }

    public final int hashCode() {
        return this.f34181a.hashCode() * 31;
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.n(new StringBuilder("MapDraggableAnchors("), this.f34181a, ')');
    }
}
