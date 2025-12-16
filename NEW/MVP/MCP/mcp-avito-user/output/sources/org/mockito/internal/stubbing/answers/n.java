package org.mockito.internal.stubbing.answers;

import java.lang.reflect.Method;

/* compiled from: AnswerFunctionalInterfaces.java */
/* loaded from: classes7.dex */
public class n {
    public static void a(e81.e eVar, int i12) {
        Method method = eVar.getMethod();
        if (method.isVarArgs() && method.getParameterTypes().length == i12 + 1) {
            Class<?> cls = method.getParameterTypes()[i12];
            throw null;
        }
        eVar.a1(i12);
    }
}
