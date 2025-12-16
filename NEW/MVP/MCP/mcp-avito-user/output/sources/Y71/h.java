package Y71;

import i81.InterfaceC41246f;
import i81.InterfaceC41247g;
import java.util.Iterator;
import org.mockito.exceptions.misusing.NotAMockException;

/* compiled from: MockUtil.java */
/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC41246f f19325a = org.mockito.internal.configuration.plugins.j.d();

    public static e81.h<?> a(Object obj) {
        if (obj == null) {
            throw new NotAMockException("Argument should be a mock, but is null!");
        }
        Object objC = c(obj);
        e81.h<?> hVarE = f19325a.e(objC);
        if (hVarE != null) {
            return hVarE;
        }
        throw new NotAMockException("Argument should be a mock, but is: " + objC.getClass());
    }

    public static h81.b b(Object obj) {
        return a(obj).j0().a();
    }

    public static Object c(Object obj) {
        if (obj instanceof Class) {
            return obj;
        }
        Iterator<InterfaceC41247g> it = org.mockito.internal.configuration.plugins.j.e().iterator();
        while (it.hasNext()) {
            obj = it.next().a();
        }
        return obj;
    }
}
