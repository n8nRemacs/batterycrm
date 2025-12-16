package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: moduleByClassLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/j0;", "", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WeakReference<ClassLoader> f410382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410383b;

    public j0(@Y61.k ClassLoader classLoader) {
        this.f410382a = new WeakReference<>(classLoader);
        this.f410383b = System.identityHashCode(classLoader);
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof j0) && this.f410382a.get() == ((j0) obj).f410382a.get();
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF410383b() {
        return this.f410383b;
    }

    @Y61.k
    public final String toString() {
        String string;
        ClassLoader classLoader = this.f410382a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
