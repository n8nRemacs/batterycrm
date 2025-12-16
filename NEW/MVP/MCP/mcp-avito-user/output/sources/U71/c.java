package U71;

import java.lang.ref.WeakReference;

/* compiled from: MockWeakReference.java */
/* loaded from: classes7.dex */
public class c<T> implements a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference<T> f16211b;

    public c(T t12) {
        this.f16211b = new WeakReference<>(t12);
    }

    private Object writeReplace() {
        return new b(a());
    }

    public final T a() {
        T t12 = this.f16211b.get();
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("The mock object was garbage collected. This should not happen in normal circumstances when using public API. Typically, the test class keeps strong reference to the mock object and it prevents getting the mock collected. Mockito internally needs to keep weak references to mock objects to avoid memory leaks for certain types of MockMaker implementations. If you see this exception using Mockito public API, please file a bug. For more information see issue #1313.");
    }
}
