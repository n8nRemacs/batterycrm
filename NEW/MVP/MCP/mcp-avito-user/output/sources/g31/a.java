package G31;

import android.os.HandlerThread;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class a extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final a f6270l = new a();

    public a() {
        super(0);
    }

    @Override // Y41.a
    public final Object invoke() {
        InterfaceC42726C interfaceC42726C = b.f6271a;
        HandlerThread handlerThread = new HandlerThread("Timer thread");
        handlerThread.start();
        return new S51.b(handlerThread.getLooper());
    }
}
