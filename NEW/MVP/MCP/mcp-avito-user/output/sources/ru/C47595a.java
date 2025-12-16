package rU;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CartState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrU/a;", "", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rU.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C47595a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f429817a;

    public C47595a(@k ArrayList arrayList) {
        this.f429817a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47595a) && this.f429817a.equals(((C47595a) obj).f429817a);
    }

    public final int hashCode() {
        return this.f429817a.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("CartState(items="), this.f429817a, ')');
    }
}
