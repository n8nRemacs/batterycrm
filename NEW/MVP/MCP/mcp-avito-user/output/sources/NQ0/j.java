package nq0;

import Y61.k;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.t1;

/* compiled from: SelectableDistrictsFragmentModule_ProvideSearchInteractorScopeFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnq0/j;", "Ldagger/internal/h;", "Lkotlinx/coroutines/T;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f419198b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<R0> f419199a;

    /* compiled from: SelectableDistrictsFragmentModule_ProvideSearchInteractorScopeFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq0/j$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@k Provider<R0> provider) {
        this.f419199a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f419199a.get();
        f419198b.getClass();
        i.f419197a.getClass();
        return U.a(r02.b().plus(t1.b()));
    }
}
