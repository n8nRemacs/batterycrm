package Fb1;

import kotlin.jvm.internal.N;
import org.koin.java.c;
import sc1.o;

/* loaded from: classes9.dex */
public final class a extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final a f4798l = new a();

    public a() {
        super(0);
    }

    @Override // Y41.a
    public final Object invoke() {
        if (o.a()) {
            throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
        }
        return c.a(T51.c.class);
    }
}
