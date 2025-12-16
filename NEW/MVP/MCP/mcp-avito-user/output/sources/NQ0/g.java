package nq0;

import Y61.k;
import androidx.recyclerview.widget.C;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectableDistrictsFragmentItemsModule_ProvideListUpdateCallbackFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnq0/g;", "Ldagger/internal/h;", "Landroidx/recyclerview/widget/C;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<C> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f419192b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f419193a;

    /* compiled from: SelectableDistrictsFragmentItemsModule_ProvideListUpdateCallbackFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq0/g$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k u uVar) {
        this.f419193a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f419193a.get();
        f419192b.getClass();
        d.f419184a.getClass();
        return jVar;
    }
}
