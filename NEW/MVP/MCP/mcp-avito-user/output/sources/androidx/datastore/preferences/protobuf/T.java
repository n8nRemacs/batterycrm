package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public class T {

    /* renamed from: b, reason: collision with root package name */
    public static volatile T f45746b;

    /* renamed from: c, reason: collision with root package name */
    public static final T f45747c;

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.h<?, ?>> f45748a;

    /* compiled from: ExtensionRegistryLite.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final F0 f45749a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45750b;

        public a(int i12, F0 f02) {
            this.f45749a = f02;
            this.f45750b = i12;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f45749a == aVar.f45749a && this.f45750b == aVar.f45750b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f45749a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f45750b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f45747c = new T(0);
    }

    public T() {
        this.f45748a = new HashMap();
    }

    public static T a() {
        T t12 = f45746b;
        if (t12 == null) {
            synchronized (T.class) {
                try {
                    t12 = f45746b;
                    if (t12 == null) {
                        Class<?> cls = S.f45740a;
                        if (cls != null) {
                            try {
                                t12 = (T) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                            f45746b = t12;
                        } else {
                            t12 = f45747c;
                            f45746b = t12;
                        }
                    }
                } finally {
                }
            }
        }
        return t12;
    }

    public T(int i12) {
        this.f45748a = Collections.emptyMap();
    }
}
