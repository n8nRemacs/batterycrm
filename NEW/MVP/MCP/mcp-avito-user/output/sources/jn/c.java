package Jn;

import In.C14134a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.categories_global.CategoriesGlobalDeepLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: CategoriesDeepLinkModule_ProvideSomeDeeplinkMappingFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LJn/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f9131b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final In.c f9132a;

    /* compiled from: CategoriesDeepLinkModule_ProvideSomeDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJn/c$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k In.c cVar) {
        this.f9132a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        In.c cVar = this.f9132a;
        f9131b.getClass();
        C14221b.f9130a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CategoriesGlobalDeepLink.class, new C14134a(), new C43834a.b.C11809b(cVar));
    }
}
