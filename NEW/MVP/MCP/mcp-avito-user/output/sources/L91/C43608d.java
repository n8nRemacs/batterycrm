package l91;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TypeInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ll91/d;", "T", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l91.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43608d<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<T> f413574a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Object f413575b;

    public C43608d(@k Class<T> cls, @l Object obj) {
        this.f413574a = cls;
        this.f413575b = obj;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return L.f(obj != null ? obj.getClass() : null, C43608d.class) && L.f(this.f413574a, ((C43608d) obj).f413574a);
    }

    public final int hashCode() {
        return this.f413574a.hashCode();
    }

    public /* synthetic */ C43608d(Class cls, Object obj, int i12, C42822w c42822w) {
        this(cls, (i12 & 2) != 0 ? null : obj);
    }
}
