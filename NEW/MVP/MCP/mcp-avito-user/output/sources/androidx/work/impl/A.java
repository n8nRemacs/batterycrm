package androidx.work.impl;

import androidx.work.impl.model.C23580w;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StartStopToken.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/A;", "Landroidx/work/impl/y;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class A implements InterfaceC23614y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC23614y f55513b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f55514c = new Object();

    public A(@Y61.k InterfaceC23614y interfaceC23614y) {
        this.f55513b = interfaceC23614y;
    }

    @Override // androidx.work.impl.InterfaceC23614y
    @Y61.l
    public final C23613x a(@Y61.k C23580w c23580w) {
        C23613x c23613xA;
        synchronized (this.f55514c) {
            c23613xA = ((C23615z) this.f55513b).a(c23580w);
        }
        return c23613xA;
    }

    @Override // androidx.work.impl.InterfaceC23614y
    public final boolean c(@Y61.k C23580w c23580w) {
        boolean zContainsKey;
        synchronized (this.f55514c) {
            zContainsKey = ((C23615z) this.f55513b).f56087b.containsKey(c23580w);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.InterfaceC23614y
    @Y61.k
    public final C23613x d(@Y61.k C23580w c23580w) {
        C23613x c23613xD;
        synchronized (this.f55514c) {
            c23613xD = ((C23615z) this.f55513b).d(c23580w);
        }
        return c23613xD;
    }

    @Override // androidx.work.impl.InterfaceC23614y
    @Y61.k
    public final List<C23613x> remove(@Y61.k String str) {
        List<C23613x> listRemove;
        synchronized (this.f55514c) {
            listRemove = ((C23615z) this.f55513b).remove(str);
        }
        return listRemove;
    }
}
