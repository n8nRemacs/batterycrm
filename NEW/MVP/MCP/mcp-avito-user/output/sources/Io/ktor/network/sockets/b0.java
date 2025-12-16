package io.ktor.network.sockets;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: SocketOptionsPlatformCapabilities.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/b0;", "", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Object f400249a;

    static {
        Map mapC;
        new b0();
        try {
            Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
            if (fields != null) {
                ArrayList arrayList = new ArrayList();
                for (Field field : fields) {
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                        arrayList.add(field);
                    }
                }
                int iF2 = P0.f(C42745f0.q(arrayList, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                mapC = new LinkedHashMap(iF2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    mapC.put(((Field) next).getName(), next);
                }
            } else {
                mapC = P0.c();
            }
        } catch (Throwable unused) {
            mapC = P0.c();
        }
        f400249a = mapC;
        try {
            Class<?> cls = Class.forName("java.nio.channels.SocketChannel");
            for (Method method : cls.getMethods()) {
                int modifiers2 = method.getModifiers();
                if (!Modifier.isPublic(modifiers2) || Modifier.isStatic(modifiers2) || !kotlin.jvm.internal.L.f(method.getName(), "setOption") || method.getParameterTypes().length != 2 || !kotlin.jvm.internal.L.f(method.getReturnType(), cls) || !kotlin.jvm.internal.L.f(method.getParameterTypes()[0], SocketOption.class) || !kotlin.jvm.internal.L.f(method.getParameterTypes()[1], Object.class)) {
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            Class<?> cls2 = Class.forName("java.nio.channels.ServerSocketChannel");
            for (Method method2 : cls2.getMethods()) {
                int modifiers3 = method2.getModifiers();
                if (!Modifier.isPublic(modifiers3) || Modifier.isStatic(modifiers3) || !kotlin.jvm.internal.L.f(method2.getName(), "setOption") || method2.getParameterTypes().length != 2 || !kotlin.jvm.internal.L.f(method2.getReturnType(), cls2) || !kotlin.jvm.internal.L.f(method2.getParameterTypes()[0], SocketOption.class) || !kotlin.jvm.internal.L.f(method2.getParameterTypes()[1], Object.class)) {
                }
            }
        } catch (Throwable unused3) {
        }
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            for (Method method3 : cls3.getMethods()) {
                int modifiers4 = method3.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && kotlin.jvm.internal.L.f(method3.getName(), "setOption") && method3.getParameterTypes().length == 2 && kotlin.jvm.internal.L.f(method3.getReturnType(), cls3) && kotlin.jvm.internal.L.f(method3.getParameterTypes()[0], SocketOption.class) && kotlin.jvm.internal.L.f(method3.getParameterTypes()[1], Object.class)) {
                    return;
                }
            }
        } catch (Throwable unused4) {
        }
    }
}
