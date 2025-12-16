package Pm;

import X41.g;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: Discount.kt */
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LPm/c;", "", "percent", "", "_avito_cart-bundles_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14808c {

    /* renamed from: a, reason: collision with root package name */
    public final int f13270a;

    private /* synthetic */ C14808c(int i12) {
        this.f13270a = i12;
    }

    public static final /* synthetic */ C14808c a(int i12) {
        return new C14808c(i12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14808c) {
            return this.f13270a == ((C14808c) obj).f13270a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13270a);
    }

    public final String toString() {
        return r.t(new StringBuilder("Discount(percent="), this.f13270a, ')');
    }
}
