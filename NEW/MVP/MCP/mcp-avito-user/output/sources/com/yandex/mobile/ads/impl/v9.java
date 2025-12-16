package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ts0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes8.dex */
public class v9 implements d61 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private static final u9 f390818f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f390819g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Class<? super SSLSocket> f390820a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Method f390821b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f390822c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f390823d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f390824e;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        public static final v9 a(Class cls) {
            int i12 = v9.f390819g;
            Class superclass = cls;
            while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(androidx.compose.ui.graphics.colorspace.e.k(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                }
            }
            return new v9(superclass);
        }

        @Y61.k
        public static u9 b() {
            return v9.f390818f;
        }

        private a() {
        }

        @Y61.k
        public static u9 a() {
            return new u9();
        }
    }

    static {
        new a(0);
        f390818f = a.a();
    }

    public v9(@Y61.k Class<? super SSLSocket> cls) {
        this.f390820a = cls;
        this.f390821b = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.f390822c = cls.getMethod("setHostname", String.class);
        this.f390823d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f390824e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<? extends sv0> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f390820a.isInstance(sSLSocket)) {
            try {
                this.f390821b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f390822c.invoke(sSLSocket, str);
                }
                Method method = this.f390824e;
                int i12 = ts0.f390303c;
                method.invoke(sSLSocket, ts0.a.b(list));
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            } catch (InvocationTargetException e13) {
                throw new AssertionError(e13);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.d61
    @Y61.l
    public final String b(@Y61.k SSLSocket sSLSocket) {
        if (!this.f390820a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f390823d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e12) {
            throw new AssertionError(e12);
        } catch (NullPointerException e13) {
            if (kotlin.jvm.internal.L.f(e13.getMessage(), "ssl == null")) {
                return null;
            }
            throw e13;
        } catch (InvocationTargetException e14) {
            throw new AssertionError(e14);
        }
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final boolean a() {
        return t9.f390123f;
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final boolean a(@Y61.k SSLSocket sSLSocket) {
        return this.f390820a.isInstance(sSLSocket);
    }
}
