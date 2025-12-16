package Ln;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoriesState.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLn/c;", "", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ln.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14418c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f10113a;

    public C14418c(@k List<C14417b> list) {
        this.f10113a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14418c) && L.f(this.f10113a, ((C14418c) obj).f10113a);
    }

    public final int hashCode() {
        return this.f10113a.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("CategoriesItems(items="), this.f10113a, ')');
    }
}
