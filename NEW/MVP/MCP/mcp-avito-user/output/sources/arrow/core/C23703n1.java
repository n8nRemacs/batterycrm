package arrow.core;

import kotlin.Metadata;

/* compiled from: Option.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/n1;", "T", "Larrow/core/Y0;", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* renamed from: arrow.core.n1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C23703n1<T> extends Y0<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f56288b;

    public C23703n1(T t12) {
        super(null);
        this.f56288b = t12;
    }

    @Override // arrow.core.Y0
    public final T a() {
        return this.f56288b;
    }

    @Override // arrow.core.Y0
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C23703n1) && kotlin.jvm.internal.L.f(this.f56288b, ((C23703n1) obj).f56288b);
        }
        return true;
    }

    public final int hashCode() {
        T t12 = this.f56288b;
        if (t12 != null) {
            return t12.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.n(new StringBuilder("Some("), this.f56288b, ')');
    }
}
