package cn;

import X41.g;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingContent.kt */
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcn/e;", "", "value", "", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cn.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C27226e {

    /* renamed from: a, reason: collision with root package name */
    public final long f58135a;

    private /* synthetic */ C27226e(long j12) {
        this.f58135a = j12;
    }

    public static final /* synthetic */ C27226e a(long j12) {
        return new C27226e(j12);
    }

    public static String b(long j12) {
        return "Price(value=" + j12 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27226e) {
            return this.f58135a == ((C27226e) obj).f58135a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58135a);
    }

    public final String toString() {
        return b(this.f58135a);
    }
}
