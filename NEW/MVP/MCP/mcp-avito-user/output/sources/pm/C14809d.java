package Pm;

import X41.g;
import Y61.k;
import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerHash.kt */
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LPm/d;", "", "hash", "", "_avito_cart-bundles_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pm.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14809d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f13271a;

    private /* synthetic */ C14809d(String str) {
        this.f13271a = str;
    }

    public static final /* synthetic */ C14809d a(String str) {
        return new C14809d(str);
    }

    public static String b(String str) {
        return C22491k0.a(')', "SellerHash(hash=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14809d) {
            return L.f(this.f13271a, ((C14809d) obj).f13271a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13271a.hashCode();
    }

    public final String toString() {
        return b(this.f13271a);
    }
}
