package bU;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GradientStyleProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbU/e;", "", "_design-modules_beduin-v2_renderer-compose_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bU.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C25561e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p<A, Integer, InterfaceC25560d> f57084a;

    /* JADX WARN: Multi-variable type inference failed */
    public C25561e(@Y61.k p<? super A, ? super Integer, ? extends InterfaceC25560d> pVar) {
        this.f57084a = pVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25561e) && L.f(this.f57084a, ((C25561e) obj).f57084a);
    }

    public final int hashCode() {
        return this.f57084a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "GradientStyleProvider(provider=" + this.f57084a + ')';
    }
}
