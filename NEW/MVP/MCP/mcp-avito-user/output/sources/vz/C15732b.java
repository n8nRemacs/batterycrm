package Vz;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceFormParameters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVz/b;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C15732b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<ParameterSlot> f17536a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C15731a f17537b;

    /* JADX WARN: Multi-variable type inference failed */
    public C15732b(@k List<? extends ParameterSlot> list, @k C15731a c15731a) {
        this.f17536a = list;
        this.f17537b = c15731a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15732b)) {
            return false;
        }
        C15732b c15732b = (C15732b) obj;
        return L.f(this.f17536a, c15732b.f17536a) && L.f(this.f17537b, c15732b.f17537b);
    }

    public final int hashCode() {
        return this.f17537b.hashCode() + (this.f17536a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "EvidenceFormParameters(slots=" + this.f17536a + ", filesConstraints=" + this.f17537b + ')';
    }
}
