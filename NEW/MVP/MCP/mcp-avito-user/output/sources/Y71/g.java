package Y71;

import java.io.Serializable;

/* compiled from: MockNameImpl.java */
/* loaded from: classes7.dex */
public class g implements h81.b, Serializable {
    private static final long serialVersionUID = 8014974700844306925L;

    /* renamed from: b, reason: collision with root package name */
    public final String f19323b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19324c;

    public g(Class cls) {
        String simpleName = cls.getSimpleName();
        simpleName = simpleName.length() == 0 ? cls.getSuperclass().getSimpleName() : simpleName;
        this.f19323b = simpleName.substring(0, 1).toLowerCase() + simpleName.substring(1);
        this.f19324c = true;
    }

    @Override // h81.b
    public final boolean a() {
        return this.f19324c;
    }

    @Override // h81.b
    public final String toString() {
        return this.f19323b;
    }
}
