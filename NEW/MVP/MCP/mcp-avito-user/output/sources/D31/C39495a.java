package d31;

import android.content.Context;
import kotlin.jvm.internal.N;
import sc1.o;

/* renamed from: d31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39495a extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final C39495a f393645l = new C39495a();

    public C39495a() {
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
