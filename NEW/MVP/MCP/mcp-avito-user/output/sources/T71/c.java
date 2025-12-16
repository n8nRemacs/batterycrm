package t71;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.koin.core.instance.g;
import p71.InterfaceC46911e;
import w71.InterfaceC49462a;

/* compiled from: Module.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt71/c;", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC48513b
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f439150a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439151b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HashSet<g<?>> f439152c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HashMap<String, org.koin.core.instance.e<?>> f439153d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final HashSet<InterfaceC49462a> f439154e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f439155f;

    public c() {
        this(false, 1, null);
    }

    @InterfaceC46911e
    public final void a(@k org.koin.core.instance.e<?> eVar) {
        org.koin.core.definition.a<?> aVar = eVar.f421460a;
        this.f439153d.put(org.koin.core.definition.b.a(aVar.f421447b, aVar.f421448c, aVar.f421446a), eVar);
    }

    @InterfaceC46911e
    public final void b(@k g<?> gVar) {
        this.f439152c.add(gVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && L.f(this.f439151b, ((c) obj).f439151b);
    }

    public final int hashCode() {
        return this.f439151b.hashCode();
    }

    public c(boolean z12) {
        this.f439150a = z12;
        org.koin.mp.d.f421487a.getClass();
        this.f439151b = UUID.randomUUID().toString();
        this.f439152c = new HashSet<>();
        this.f439153d = new HashMap<>();
        this.f439154e = new HashSet<>();
        this.f439155f = new ArrayList();
    }

    public /* synthetic */ c(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }
}
