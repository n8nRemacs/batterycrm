package KG0;

import Y61.k;
import com.avito.android.update_source.c;
import com.avito.android.update_source.d;
import com.avito.android.util.C;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IsAppUpdatedUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LKG0/b;", "Ldagger/internal/h;", "LKG0/a;", "a", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements h<KG0.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f9381c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f9382a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<C> f9383b;

    /* compiled from: IsAppUpdatedUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKG0/b$a;", "", "<init>", "()V", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k d dVar, @k Provider provider) {
        this.f9382a = dVar;
        this.f9383b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f9382a.get();
        C c12 = this.f9383b.get();
        f9381c.getClass();
        return new KG0.a(cVar, c12);
    }
}
