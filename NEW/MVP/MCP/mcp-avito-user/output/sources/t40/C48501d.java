package t40;

import Y61.k;
import com.avito.android.util.C;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DebugAppCrasherImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lt40/d;", "Ldagger/internal/h;", "Lt40/b;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: t40.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48501d implements h<C48499b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439144b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C> f439145a;

    /* compiled from: DebugAppCrasherImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt40/d$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t40.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48501d(@k Provider<C> provider) {
        this.f439145a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f439145a.get();
        f439144b.getClass();
        return new C48499b(c12);
    }
}
