package Sq0;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: DiscountPercents.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LSq0/a;", "", "value", "", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15214a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15166a;

    private /* synthetic */ C15214a(int i12) {
        this.f15166a = i12;
    }

    public static final /* synthetic */ C15214a a(int i12) {
        return new C15214a(i12);
    }

    public static String b(int i12) {
        return r.p("DiscountPercents(value=", i12, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15214a) {
            return this.f15166a == ((C15214a) obj).f15166a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15166a);
    }

    public final String toString() {
        return b(this.f15166a);
    }
}
