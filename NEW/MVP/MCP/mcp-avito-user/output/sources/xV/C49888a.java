package xV;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProgressBarState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxV/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C49888a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49889b f442509a;

    public C49888a(@k InterfaceC49889b interfaceC49889b) {
        this.f442509a = interfaceC49889b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49888a) && L.f(this.f442509a, ((C49888a) obj).f442509a);
    }

    public final int hashCode() {
        return this.f442509a.hashCode();
    }

    @k
    public final String toString() {
        return "ProgressBarState(content=" + this.f442509a + ')';
    }
}
