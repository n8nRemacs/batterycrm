package androidx.compose.foundation.lazy.layout;

import androidx.collection.R0;
import androidx.collection.i1;
import kotlin.Metadata;

/* compiled from: LazyLayoutPrefetchState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/H0;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20709b f29298a = new C20709b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0<Object, C20709b> f29299b = i1.b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object f29300c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C20709b f29301d;

    public final C20709b a(Object obj) {
        C20709b c20709b = this.f29301d;
        if (this.f29300c == obj && c20709b != null) {
            return c20709b;
        }
        R0<Object, C20709b> r02 = this.f29299b;
        C20709b c20709bE = r02.e(obj);
        if (c20709bE == null) {
            C20709b c20709b2 = this.f29298a;
            c20709b2.getClass();
            C20709b c20709b3 = new C20709b();
            c20709b3.f29393a = c20709b2.f29393a;
            c20709b3.f29394b = c20709b2.f29394b;
            r02.m(obj, c20709b3);
            c20709bE = c20709b3;
        }
        C20709b c20709b4 = c20709bE;
        this.f29300c = obj;
        this.f29301d = c20709b4;
        return c20709b4;
    }
}
