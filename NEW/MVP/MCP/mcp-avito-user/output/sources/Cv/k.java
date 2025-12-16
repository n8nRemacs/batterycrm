package cv;

import X41.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C;
import dagger.internal.A;
import dagger.internal.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;
import nv.C44479a;
import nv.C44480b;

/* compiled from: DeeplinkHandlerModule_ProvideDeeplinkMappingsFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001f\u0012\u001b\u0012\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00060\u0001:\u0001\u0007¨\u0006\b"}, d2 = {"Lcv/k;", "Ldagger/internal/h;", "", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Llv/a;", "LX41/o;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<Map<Class<DeepLink>, C43834a>> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f393043d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f393044a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C44480b f393045b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f393046c;

    /* compiled from: DeeplinkHandlerModule_ProvideDeeplinkMappingsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv/k$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k A a12, @Y61.k C44480b c44480b, @Y61.k u uVar) {
        this.f393044a = a12;
        this.f393045b = c44480b;
        this.f393046c = uVar;
    }

    @n
    @Y61.k
    public static final k a(@Y61.k A a12, @Y61.k C44480b c44480b, @Y61.k u uVar) {
        f393043d.getClass();
        return new k(a12, c44480b, uVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f393044a.get();
        this.f393045b.getClass();
        new C44479a();
        C c12 = (C) this.f393046c.get();
        f393043d.getClass();
        i.f393039a.getClass();
        c12.getF125491k().getClass();
        Set set2 = set;
        int iF2 = P0.f(C42745f0.q(set2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : set2) {
            linkedHashMap.put(((C43834a) obj).f414236a, obj);
        }
        return linkedHashMap;
    }
}
