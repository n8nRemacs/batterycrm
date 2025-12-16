package kotlin.properties;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: Delegates.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/properties/d;", "", "T", "Lkotlin/properties/h;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class d<T> implements h<Object, T> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public T f406880b;

    @Override // kotlin.properties.g
    @k
    public final T getValue(@l Object obj, @k n<?> nVar) {
        T t12 = this.f406880b;
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("Property " + nVar.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.h
    public final void setValue(@l Object obj, @k n<?> nVar, @k T t12) {
        this.f406880b = t12;
    }

    @k
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("NotNullProperty(");
        if (this.f406880b != null) {
            str = "value=" + this.f406880b;
        } else {
            str = "value not initialized yet";
        }
        return C22026a.c(sb2, str, ')');
    }
}
