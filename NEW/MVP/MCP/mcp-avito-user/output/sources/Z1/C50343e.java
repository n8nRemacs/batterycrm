package z1;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import z1.AbstractC50339a;

/* compiled from: CreationExtras.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz1/e;", "Lz1/a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: z1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50343e extends AbstractC50339a {
    /* JADX WARN: Multi-variable type inference failed */
    public C50343e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // z1.AbstractC50339a
    @l
    public final <T> T a(@k AbstractC50339a.b<T> bVar) {
        return (T) this.f443747a.get(bVar);
    }

    public final <T> void b(@k AbstractC50339a.b<T> bVar, T t12) {
        this.f443747a.put(bVar, t12);
    }

    public C50343e(@k AbstractC50339a abstractC50339a) {
        this.f443747a.putAll(abstractC50339a.f443747a);
    }

    public /* synthetic */ C50343e(AbstractC50339a abstractC50339a, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? AbstractC50339a.C12939a.f443748b : abstractC50339a);
    }
}
