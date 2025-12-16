package androidx.view;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import j.D;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NavAction.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/m;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23379m {

    /* renamed from: a, reason: collision with root package name */
    @D
    public final int f53168a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public C23280B0 f53169b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Bundle f53170c;

    public C23379m(int i12, C23280B0 c23280b0, Bundle bundle, int i13, C42822w c42822w) {
        c23280b0 = (i13 & 2) != 0 ? null : c23280b0;
        bundle = (i13 & 4) != 0 ? null : bundle;
        this.f53168a = i12;
        this.f53169b = c23280b0;
        this.f53170c = bundle;
    }

    public final boolean equals(@l Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23379m)) {
            return false;
        }
        C23379m c23379m = (C23379m) obj;
        if (this.f53168a == c23379m.f53168a && L.f(this.f53169b, c23379m.f53169b)) {
            if (L.f(this.f53170c, c23379m.f53170c)) {
                return true;
            }
            Bundle bundle = this.f53170c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    Bundle bundle2 = this.f53170c;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = c23379m.f53170c;
                    if (!L.f(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.f53168a) * 31;
        C23280B0 c23280b0 = this.f53169b;
        int iHashCode2 = iHashCode + (c23280b0 != null ? c23280b0.hashCode() : 0);
        Bundle bundle = this.f53170c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i12 = iHashCode2 * 31;
                Bundle bundle2 = this.f53170c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i12 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        r.C(C23379m.class, sb2, "(0x");
        sb2.append(Integer.toHexString(this.f53168a));
        sb2.append(")");
        if (this.f53169b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f53169b);
        }
        return sb2.toString();
    }
}
