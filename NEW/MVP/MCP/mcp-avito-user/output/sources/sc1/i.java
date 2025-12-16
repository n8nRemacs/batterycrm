package sc1;

import android.content.Context;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class i extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final i f437928l = new i();

    public i() {
        super(0);
    }

    @Override // Y41.a
    public final Object invoke() {
        if (o.a()) {
            throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
        }
        return org.koin.java.c.a(Context.class);
    }
}
