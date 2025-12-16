package Nu;

import Ru.InterfaceC15081a;
import Y61.k;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeDeeplinkEventsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNu/a;", "LNu/b;", "_avito_deeplinks_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14611a implements InterfaceC14612b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<InterfaceC14612b> f11797a;

    /* JADX WARN: Multi-variable type inference failed */
    public C14611a(@k Set<? extends InterfaceC14612b> set) {
        this.f11797a = set;
    }

    @Override // Nu.InterfaceC14612b
    public final void a(@k InterfaceC15081a interfaceC15081a) {
        Iterator<T> it = this.f11797a.iterator();
        while (it.hasNext()) {
            ((InterfaceC14612b) it.next()).a(interfaceC15081a);
        }
    }
}
