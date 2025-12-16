package org.mockito.internal.configuration;

import androidx.appcompat.app.r;
import i81.InterfaceC41242b;
import java.lang.annotation.Annotation;

/* compiled from: DefaultDoNotMockEnforcer.java */
/* loaded from: classes7.dex */
public class c implements InterfaceC41242b {
    @Override // i81.InterfaceC41242b
    public final String a(Class<?> cls) {
        for (Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().getName().endsWith("org.mockito.DoNotMock")) {
                String str = cls + " is annotated with @org.mockito.DoNotMock and can't be mocked.";
                if (!org.mockito.i.class.equals(annotation.annotationType())) {
                    return str;
                }
                StringBuilder sbZ = r.z(str, " ");
                sbZ.append(((org.mockito.i) cls.getAnnotation(org.mockito.i.class)).reason());
                return sbZ.toString();
            }
        }
        return null;
    }
}
