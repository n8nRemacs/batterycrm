package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes8.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f409348b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, h.g<?, ?>> f409349a;

    /* compiled from: ExtensionRegistryLite.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final o f409350a;

        /* renamed from: b, reason: collision with root package name */
        public final int f409351b;

        public a(int i12, o oVar) {
            this.f409350a = oVar;
            this.f409351b = i12;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f409350a == aVar.f409350a && this.f409351b == aVar.f409351b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f409350a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f409351b;
        }
    }

    static {
        new f(0);
    }

    public f() {
        this.f409349a = new HashMap();
    }

    public final void a(h.g<?, ?> gVar) {
        this.f409349a.put(new a(gVar.f409372d.f409366b, gVar.f409369a), gVar);
    }

    public f(int i12) {
        this.f409349a = Collections.emptyMap();
    }
}
