package Ym;

import X41.g;
import Y61.k;
import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserId.kt */
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LYm/b;", "", "id", "", "_avito_cart-recommendations_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ym.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18299b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19647a;

    public static String a(String str) {
        return C22491k0.a(')', "UserId(id=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18299b) {
            return L.f(this.f19647a, ((C18299b) obj).f19647a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19647a.hashCode();
    }

    public final String toString() {
        return a(this.f19647a);
    }
}
