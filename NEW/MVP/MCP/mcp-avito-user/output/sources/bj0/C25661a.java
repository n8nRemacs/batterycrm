package bj0;

import Y61.k;
import Y61.l;
import com.avito.android.related_products.RelatedProductsEntryPointState;
import kotlin.Metadata;

/* compiled from: RelatedProductsEntryPointStateListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbj0/a;", "", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bj0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C25661a {

    /* renamed from: a, reason: collision with root package name */
    public final long f57400a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RelatedProductsEntryPointState f57401b;

    public C25661a(long j12, @k RelatedProductsEntryPointState relatedProductsEntryPointState) {
        this.f57400a = j12;
        this.f57401b = relatedProductsEntryPointState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25661a)) {
            return false;
        }
        C25661a c25661a = (C25661a) obj;
        return this.f57400a == c25661a.f57400a && this.f57401b == c25661a.f57401b;
    }

    public final int hashCode() {
        return this.f57401b.hashCode() + (Long.hashCode(this.f57400a) * 31);
    }

    @k
    public final String toString() {
        return "EntryPointStateChange(itemId=" + this.f57400a + ", state=" + this.f57401b + ')';
    }
}
