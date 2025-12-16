package w2;

import android.content.Context;
import kotlin.jvm.internal.N;
import sc1.o;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49427c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final C49427c f441236l = new C49427c();

    public C49427c() {
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
