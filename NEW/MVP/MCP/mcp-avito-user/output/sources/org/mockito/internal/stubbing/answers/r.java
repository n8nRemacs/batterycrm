package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.lang.reflect.Method;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;

/* compiled from: DefaultAnswerValidator.java */
/* loaded from: classes7.dex */
public abstract class r {
    public static void a(InterfaceC39968b interfaceC39968b, Object obj) {
        u uVar = new u(interfaceC39968b);
        if (obj == null || uVar.e(obj.getClass())) {
            return;
        }
        Object objV3 = interfaceC39968b.v3();
        Method method = uVar.f421707b;
        String simpleName = method.getReturnType().getSimpleName();
        String simpleName2 = obj.getClass().getSimpleName();
        String name = method.getName();
        throw new WrongTypeOfReturnValue(Y71.l.b("Default answer returned a result with the wrong type:", androidx.media3.exoplayer.analytics.m.l(simpleName2, " cannot be returned by ", name, "()"), androidx.appcompat.app.r.r(name, "() should return ", simpleName), "", "The default answer of " + Y71.h.b(objV3) + " that was configured on the mock is probably incorrectly implemented.", ""));
    }
}
