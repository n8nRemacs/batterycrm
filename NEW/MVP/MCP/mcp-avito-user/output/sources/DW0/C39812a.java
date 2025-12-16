package dw0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.short_term_rent.deeplink.PromoCode;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldw0/a;", "", "", "Lcom/avito/android/short_term_rent/deeplink/PromoCode;", "promoCodes", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getPromoCodes", "()Ljava/util/List;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39812a {

    @c("promoCodes")
    @k
    private final List<PromoCode> promoCodes;

    public C39812a(@k List<PromoCode> list) {
        this.promoCodes = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39812a) && L.f(this.promoCodes, ((C39812a) obj).promoCodes);
    }

    public final int hashCode() {
        return this.promoCodes.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("PromoCodes(promoCodes="), this.promoCodes, ')');
    }
}
