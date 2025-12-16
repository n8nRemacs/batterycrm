package Hs;

import X41.n;
import Y61.k;
import com.avito.android.crm.CrmDeeplink;
import com.avito.android.crm.c;
import com.avito.android.crm.d;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: CrmDeeplinkModule_ProvideCrmDeeplinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LHs/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_crm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14029b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f7776b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f7777a;

    /* compiled from: CrmDeeplinkModule_ProvideCrmDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHs/b$a;", "", "<init>", "()V", "_avito_crm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hs.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k c cVar) {
            C14028a.f7775a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(CrmDeeplink.class, new d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CrmDeeplink.class), cVar));
        }

        public a() {
        }
    }

    public C14029b(@k c cVar) {
        this.f7777a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f7777a;
        f7776b.getClass();
        return a.a(cVar);
    }
}
