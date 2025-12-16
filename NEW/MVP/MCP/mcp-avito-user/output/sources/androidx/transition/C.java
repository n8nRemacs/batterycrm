package androidx.transition;

import android.util.Property;

/* compiled from: PathProperty.java */
/* loaded from: classes10.dex */
class C<T> extends Property<T, Float> {

    /* renamed from: a, reason: collision with root package name */
    public float f54644a;

    public C() {
        throw null;
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.f54644a);
    }

    @Override // android.util.Property
    public final void set(Object obj, Float f12) {
        this.f54644a = f12.floatValue();
        throw null;
    }
}
