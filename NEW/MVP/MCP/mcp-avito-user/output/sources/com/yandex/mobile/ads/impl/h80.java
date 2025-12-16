package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ts0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes8.dex */
public final class h80 extends ts0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f385923i = 0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final Method f385924d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final Method f385925e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final Method f385926f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final Class<?> f385927g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final Class<?> f385928h;

    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final List<String> f385929a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f385930b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        private String f385931c;

        public a(@Y61.k ArrayList arrayList) {
            this.f385929a = arrayList;
        }

        @Y61.l
        public final String a() {
            return this.f385931c;
        }

        public final boolean b() {
            return this.f385930b;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Y61.l
        public final Object invoke(@Y61.k Object obj, @Y61.k Method method, @Y61.l Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (kotlin.jvm.internal.L.f(name, "supports") && kotlin.jvm.internal.L.f(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (kotlin.jvm.internal.L.f(name, "unsupported") && kotlin.jvm.internal.L.f(Void.TYPE, returnType)) {
                this.f385930b = true;
                return null;
            }
            if (kotlin.jvm.internal.L.f(name, "protocols") && objArr.length == 0) {
                return this.f385929a;
            }
            if ((kotlin.jvm.internal.L.f(name, "selectProtocol") || kotlin.jvm.internal.L.f(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i12 = 0;
                        while (true) {
                            String str = (String) list.get(i12);
                            if (!this.f385929a.contains(str)) {
                                if (i12 == size) {
                                    break;
                                }
                                i12++;
                            } else {
                                this.f385931c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f385929a.get(0);
                    this.f385931c = str2;
                    return str2;
                }
            }
            if ((!kotlin.jvm.internal.L.f(name, "protocolSelected") && !kotlin.jvm.internal.L.f(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            this.f385931c = (String) objArr[0];
            return null;
        }
    }

    public static final class b {
        @Y61.l
        public static h80 a() {
            try {
                if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                return new h80(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public h80(@Y61.k Method method, @Y61.k Method method2, @Y61.k Method method3, @Y61.k Class<?> cls, @Y61.k Class<?> cls2) {
        this.f385924d = method;
        this.f385925e = method2;
        this.f385926f = method3;
        this.f385927g = cls;
        this.f385928h = cls2;
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<? extends sv0> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f385924d.invoke(null, sSLSocket, Proxy.newProxyInstance(ts0.class.getClassLoader(), new Class[]{this.f385927g, this.f385928h}, new a(ts0.a.a(list))));
        } catch (IllegalAccessException e12) {
            throw new AssertionError("failed to set ALPN", e12);
        } catch (InvocationTargetException e13) {
            throw new AssertionError("failed to set ALPN", e13);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.l
    public final String b(@Y61.k SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f385925e.invoke(null, sSLSocket));
            if (!aVar.b() && aVar.a() == null) {
                ts0.a(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e12) {
            throw new AssertionError("failed to get ALPN selected protocol", e12);
        } catch (InvocationTargetException e13) {
            throw new AssertionError("failed to get ALPN selected protocol", e13);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final void a(@Y61.k SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f385926f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e12) {
            throw new AssertionError("failed to remove ALPN", e12);
        } catch (InvocationTargetException e13) {
            throw new AssertionError("failed to remove ALPN", e13);
        }
    }
}
