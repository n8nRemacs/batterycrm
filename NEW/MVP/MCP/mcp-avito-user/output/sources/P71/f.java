package P71;

import androidx.camera.camera2.internal.G;
import g81.InterfaceC40547a;
import java.io.PrintStream;

/* compiled from: VerboseMockInvocationLogger.java */
/* loaded from: classes7.dex */
public class f implements InterfaceC40547a {

    /* renamed from: a, reason: collision with root package name */
    public final PrintStream f12855a;

    /* renamed from: b, reason: collision with root package name */
    public int f12856b;

    public f() {
        PrintStream printStream = System.out;
        this.f12856b = 0;
        this.f12855a = printStream;
    }

    @Override // g81.InterfaceC40547a
    public final void a(org.mockito.internal.handler.d dVar) {
        String str;
        this.f12856b++;
        String strI = AK.c.i(this.f12856b, " on mock/spy ########", new StringBuilder("############ Logging method invocation #"));
        PrintStream printStream = this.f12855a;
        printStream.println(strI);
        if (dVar.a() != null) {
            b("stubbed: " + dVar.a());
        }
        org.mockito.internal.invocation.e eVar = dVar.f421645a;
        printStream.println(eVar);
        b("invoked: " + eVar.f421657h);
        Throwable th2 = dVar.f421647c;
        str = "";
        if (th2 != null) {
            b("has thrown: " + th2.getClass() + (th2.getMessage() != null ? G.i(th2, new StringBuilder(" with message ")) : ""));
        } else {
            Object obj = dVar.f421646b;
            if (obj != null) {
                str = " (" + obj.getClass().getName() + ")";
            }
            b("has returned: \"" + obj + "\"" + str);
        }
        printStream.println();
    }

    public final void b(String str) {
        this.f12855a.println("   " + str);
    }
}
