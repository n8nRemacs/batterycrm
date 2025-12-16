package Bc1;

import kotlin.jvm.internal.N;
import sc1.o;

/* loaded from: classes9.dex */
public final class c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final c f1563l = new c();

    public c() {
        super(0);
    }

    @Override // Y41.a
    public final Object invoke() {
        if (o.a()) {
            throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
        }
        return org.koin.java.c.a(Gc1.a.class);
    }
}
