package nt;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CurrencyConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnt/c;", "", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f419206a;

    public c() {
        this(false, 1, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f419206a == ((c) obj).f419206a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f419206a);
    }

    @Y61.k
    public final String toString() {
        return r.x(new StringBuilder("CurrencyConfig(showFraction="), this.f419206a, ')');
    }

    public c(boolean z12) {
        this.f419206a = z12;
    }

    public /* synthetic */ c(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12);
    }
}
