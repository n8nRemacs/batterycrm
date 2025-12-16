package r60;

import AK0.l;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.di.module.C30214v6;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MergeKeyStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lr60/f;", "Ldagger/internal/h;", "Lr60/e;", "a", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f429626c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30214v6 f429627a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<E> f429628b;

    /* compiled from: MergeKeyStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr60/f$a;", "", "<init>", "()V", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k C30214v6 c30214v6, @k Provider provider) {
        this.f429627a = c30214v6;
        this.f429628b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f429627a.get();
        E e12 = this.f429628b.get();
        f429626c.getClass();
        return new e(lVar, e12);
    }
}
