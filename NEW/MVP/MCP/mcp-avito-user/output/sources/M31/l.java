package m31;

import kotlin.jvm.internal.N;
import sc1.o;

/* loaded from: classes8.dex */
public final class l extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final l f414297l = new l();

    public l() {
        super(0);
    }

    @Override // Y41.a
    public final Object invoke() {
        if (o.a()) {
            throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
        }
        return org.koin.java.c.a(D31.a.class);
    }
}
