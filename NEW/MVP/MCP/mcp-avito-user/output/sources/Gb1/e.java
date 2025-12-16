package Gb1;

import kotlin.jvm.internal.N;
import sc1.o;

/* loaded from: classes9.dex */
public final class e extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final e f6610l = new e();

    public e() {
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
