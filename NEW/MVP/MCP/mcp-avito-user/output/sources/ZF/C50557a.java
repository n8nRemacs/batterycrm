package zf;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UseReportPackageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzf/a;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C50557a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f444129a;

    public C50557a(@k String str) {
        this.f444129a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50557a) && L.f(this.f444129a, ((C50557a) obj).f444129a);
    }

    public final int hashCode() {
        return this.f444129a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("UseReportPackageItem(usagePublicId="), this.f444129a, ')');
    }
}
