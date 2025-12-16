package U71;

/* compiled from: MockStrongReference.java */
/* loaded from: classes7.dex */
public class b<T> implements a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f16210b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Object obj) {
        this.f16210b = obj;
    }

    private Object readResolve() {
        return new c(this.f16210b);
    }
}
