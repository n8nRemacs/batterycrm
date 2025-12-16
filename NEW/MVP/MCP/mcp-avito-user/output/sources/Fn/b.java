package Fn;

import Gn.InterfaceC13898a;
import Y61.k;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoriesModule_ProvideCategoriesInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LFn/b;", "Ldagger/internal/h;", "Lcom/avito/android/categories/a;", "a", "_avito-discouraged_avito-api_categories"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements h<com.avito.android.categories.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f5972b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f5973a;

    /* compiled from: CategoriesModule_ProvideCategoriesInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFn/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_categories"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k u uVar) {
        this.f5973a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC13898a interfaceC13898a = (InterfaceC13898a) this.f5973a.get();
        f5972b.getClass();
        int i12 = C13818a.f5971a;
        return new com.avito.android.categories.b(interfaceC13898a);
    }
}
