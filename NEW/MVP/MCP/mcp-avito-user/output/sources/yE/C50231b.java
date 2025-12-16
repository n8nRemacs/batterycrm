package ye;

import X41.n;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_contacts.link.AutoContactsPackagesGetLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: AutoContactsPackagesDeeplinkModule_ProvideAutoContactsPackagesGetLinkMappingFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lye/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ye.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50231b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f443407b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.auto_contacts.link.c f443408a;

    /* compiled from: AutoContactsPackagesDeeplinkModule_ProvideAutoContactsPackagesGetLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lye/b$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ye.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k com.avito.android.auto_contacts.link.c cVar) {
            C50230a.f443406a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(AutoContactsPackagesGetLink.class, new com.avito.android.auto_contacts.link.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoContactsPackagesGetLink.class), cVar));
        }

        public a() {
        }
    }

    public C50231b(@k com.avito.android.auto_contacts.link.c cVar) {
        this.f443408a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.auto_contacts.link.c cVar = this.f443408a;
        f443407b.getClass();
        return a.a(cVar);
    }
}
