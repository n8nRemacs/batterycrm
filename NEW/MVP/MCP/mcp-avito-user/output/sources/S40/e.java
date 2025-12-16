package s40;

import Y61.k;
import com.avito.android.offlinization.g;
import com.avito.android.util.C;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RequestInfoProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ls40/e;", "Ldagger/internal/h;", "Ls40/d;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements h<C47997d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f437469c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f437470a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<C> f437471b;

    /* compiled from: RequestInfoProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls40/e$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k g gVar, @k Provider provider) {
        this.f437470a = gVar;
        this.f437471b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.offlinization.e eVar = (com.avito.android.offlinization.e) this.f437470a.get();
        C c12 = this.f437471b.get();
        f437469c.getClass();
        return new C47997d(eVar, c12);
    }
}
