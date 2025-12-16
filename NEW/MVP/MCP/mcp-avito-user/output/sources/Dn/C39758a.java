package dn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingModule.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldn/a;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C39758a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f394045a;

    public C39758a(@l String str) {
        this.f394045a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39758a) && L.f(this.f394045a, ((C39758a) obj).f394045a);
    }

    public final int hashCode() {
        String str = this.f394045a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("AvitoSegment(segment="), this.f394045a, ')');
    }
}
