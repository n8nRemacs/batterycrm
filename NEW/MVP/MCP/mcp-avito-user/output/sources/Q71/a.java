package Q71;

import P71.d;
import V71.t;
import Y71.h;
import Y71.l;
import androidx.appcompat.app.r;
import e81.InterfaceC39968b;
import e81.f;
import e81.g;
import g81.InterfaceC40547a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.base.MockitoInitializationException;

/* compiled from: Reporter.java */
/* loaded from: classes7.dex */
public class a {
    public static String a(List<f> list) {
        if (list == null) {
            return "\n";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static String b(W71.a aVar, g gVar, List list) {
        String string = gVar.toString();
        String str = "Wanted " + aVar.a() + ".";
        d dVar = new d();
        StringBuilder sb2 = new StringBuilder("But was ");
        int i12 = aVar.f17761a;
        sb2.append(W71.b.a(i12));
        sb2.append(i12 != 0 ? ":" : ".");
        return l.b(string, str, dVar, sb2.toString(), a(list));
    }

    public static MockitoException c(InterfaceC39968b interfaceC39968b) {
        String str = " -> " + h.b(interfaceC39968b.v3()) + "." + interfaceC39968b.getMethod().getName() + "()";
        StringBuilder sbZ = r.z("Wanted parameter at position 0", " but ");
        sbZ.append((Object) h(interfaceC39968b));
        return new MockitoException(l.b("Invalid argument index for the current invocation of method : ", str, "", sbZ.toString(), "The index need to be a positive number that indicates a valid position of the argument in the invocation.", "However it is possible to use the -1 value to indicates that the last argument should be returned.", ""));
    }

    public static MockitoException d(InterfaceC40547a interfaceC40547a, Throwable th2) {
        return new MockitoException(l.b("The invocation listener with type ".concat(interfaceC40547a.getClass().getName()), "threw an exception : " + th2.getClass().getName() + th2.getMessage()), th2);
    }

    public static String e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return l.b(arrayList.toArray());
        }
        ((t) it.next()).getClass();
        throw null;
    }

    public static void f(NoClassDefFoundError noClassDefFoundError) {
        if (noClassDefFoundError.getMessage() != null && noClassDefFoundError.getMessage().startsWith("net/bytebuddy/")) {
            throw new MockitoInitializationException(l.b("It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.", "", "Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.", "For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.", "Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but "), noClassDefFoundError);
        }
    }

    public static G71.d g(InterfaceC39968b interfaceC39968b, List list) {
        new R71.a();
        String strA = R71.a.a(list);
        return new G71.d(l.b("No interactions wanted here:", new d(), "But found this interaction on mock '" + h.b(interfaceC39968b.v3()) + "':", interfaceC39968b.j(), strA));
    }

    public static StringBuilder h(InterfaceC39968b interfaceC39968b) {
        Class<?>[] parameterTypes = interfaceC39968b.getMethod().getParameterTypes();
        if (parameterTypes.length == 0) {
            return new StringBuilder("the method has no arguments.\n");
        }
        StringBuilder sb2 = new StringBuilder("the possible argument indexes for this method are :\n");
        int length = parameterTypes.length;
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append("    [");
            sb2.append(i12);
            if (interfaceC39968b.getMethod().isVarArgs() && i12 == length - 1) {
                sb2.append("+] ");
                sb2.append(parameterTypes[i12].getComponentType().getSimpleName());
                sb2.append("  <- Vararg\n");
            } else {
                sb2.append("] ");
                r.C(parameterTypes[i12], sb2, "\n");
            }
        }
        return sb2;
    }
}
