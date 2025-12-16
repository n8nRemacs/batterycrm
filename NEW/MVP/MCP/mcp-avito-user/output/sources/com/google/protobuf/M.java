package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes7.dex */
public class M {

    /* renamed from: b, reason: collision with root package name */
    public static volatile M f362710b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f362711c = new M(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map<b, GeneratedMessageLite.g<?, ?>> f362712a;

    /* compiled from: ExtensionRegistryLite.java */
    public static class a {
        static {
            try {
                Class.forName("com.google.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* compiled from: ExtensionRegistryLite.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC37707w0 f362713a;

        /* renamed from: b, reason: collision with root package name */
        public final int f362714b;

        public b(int i12, InterfaceC37707w0 interfaceC37707w0) {
            this.f362713a = interfaceC37707w0;
            this.f362714b = i12;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f362713a == bVar.f362713a && this.f362714b == bVar.f362714b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f362713a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f362714b;
        }
    }

    public M() {
        this.f362712a = new HashMap();
    }

    public static M b() {
        M m12 = f362710b;
        if (m12 == null) {
            synchronized (M.class) {
                try {
                    m12 = f362710b;
                    if (m12 == null) {
                        Class<?> cls = L.f362708a;
                        M m13 = null;
                        if (cls != null) {
                            try {
                                m13 = (M) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (m13 == null) {
                            m13 = f362711c;
                        }
                        f362710b = m13;
                        m12 = m13;
                    }
                } finally {
                }
            }
        }
        return m12;
    }

    public final GeneratedMessageLite.g a(int i12, InterfaceC37707w0 interfaceC37707w0) {
        return this.f362712a.get(new b(i12, interfaceC37707w0));
    }

    public M(int i12) {
        this.f362712a = Collections.emptyMap();
    }
}
