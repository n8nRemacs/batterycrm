package net.bytebuddy.utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: Invoker.java */
/* loaded from: classes7.dex */
public interface c {
    Object a(Constructor<?> constructor, Object[] objArr);

    @net.bytebuddy.utility.nullability.b
    Object invoke(@net.bytebuddy.utility.nullability.b Object obj, Method method, @net.bytebuddy.utility.nullability.b Object[] objArr);
}
