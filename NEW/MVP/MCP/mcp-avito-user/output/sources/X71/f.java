package x71;

import Y61.k;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import w71.C49464c;
import w71.InterfaceC49462a;

/* compiled from: ScopeRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lx71/f;", "", "a", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f442253e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C49464c f442254f = new C49464c();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o71.d f442255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HashSet<InterfaceC49462a> f442256b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConcurrentHashMap f442257c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final org.koin.core.scope.a f442258d;

    /* compiled from: ScopeRegistry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx71/f$a;", "", "<init>", "()V", "", "ROOT_SCOPE_ID", "Ljava/lang/String;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k o71.d dVar) {
        this.f442255a = dVar;
        HashSet<InterfaceC49462a> hashSet = new HashSet<>();
        this.f442256b = hashSet;
        org.koin.mp.d.f421487a.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f442257c = concurrentHashMap;
        C49464c c49464c = f442254f;
        org.koin.core.scope.a aVar = new org.koin.core.scope.a(c49464c, "_root_", true, dVar);
        this.f442258d = aVar;
        hashSet.add(c49464c);
        concurrentHashMap.put("_root_", aVar);
    }
}
