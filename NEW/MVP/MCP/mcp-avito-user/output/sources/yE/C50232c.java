package ye;

import X41.n;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_contacts.link.AutoContactsPackagesLink;
import com.avito.android.auto_contacts.link.g;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: AutoContactsPackagesDeeplinkModule_ProvideAutoContactsPackagesLinkMappingFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lye/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ye.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50232c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f443409b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f443410a;

    /* compiled from: AutoContactsPackagesDeeplinkModule_ProvideAutoContactsPackagesLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lye/c$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ye.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k g gVar) {
            C50230a.f443406a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(AutoContactsPackagesLink.class, new com.avito.android.auto_contacts.link.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoContactsPackagesLink.class), gVar));
        }

        public a() {
        }
    }

    public C50232c(@k g gVar) {
        this.f443410a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f443410a;
        f443409b.getClass();
        return a.a(gVar);
    }
}
