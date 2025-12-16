package Ym;

import X41.g;
import Y61.k;
import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertId.kt */
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LYm/a;", "", "id", "", "_avito_cart-recommendations_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ym.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18298a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19646a;

    private /* synthetic */ C18298a(String str) {
        this.f19646a = str;
    }

    public static final /* synthetic */ C18298a a(String str) {
        return new C18298a(str);
    }

    public static String b(String str) {
        return C22491k0.a(')', "AdvertId(id=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18298a) {
            return L.f(this.f19646a, ((C18298a) obj).f19646a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19646a.hashCode();
    }

    public final String toString() {
        return b(this.f19646a);
    }
}
