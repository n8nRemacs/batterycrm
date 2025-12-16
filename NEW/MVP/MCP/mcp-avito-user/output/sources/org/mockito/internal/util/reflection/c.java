package org.mockito.internal.util.reflection;

import java.lang.reflect.Constructor;
import java.util.Comparator;

/* compiled from: FieldInitializer.java */
/* loaded from: classes7.dex */
public class c {

    /* compiled from: FieldInitializer.java */
    public interface a {
    }

    /* compiled from: FieldInitializer.java */
    public interface b {
    }

    /* compiled from: FieldInitializer.java */
    /* renamed from: org.mockito.internal.util.reflection.c$c, reason: collision with other inner class name */
    public static class C12234c implements b {
    }

    /* compiled from: FieldInitializer.java */
    public static class d implements b {

        /* compiled from: FieldInitializer.java */
        public class a implements Comparator<Constructor<?>> {
            public static int a(Constructor constructor) {
                int i12 = 0;
                for (Class<?> cls : constructor.getParameterTypes()) {
                    if (Y71.h.f19325a.a(cls).a()) {
                        i12++;
                    }
                }
                return i12;
            }

            @Override // java.util.Comparator
            public final int compare(Constructor<?> constructor, Constructor<?> constructor2) {
                Constructor<?> constructor3 = constructor;
                Constructor<?> constructor4 = constructor2;
                int length = constructor4.getParameterTypes().length - constructor3.getParameterTypes().length;
                if (length != 0) {
                    return length;
                }
                return a(constructor4) - a(constructor3);
            }
        }
    }
}
