package Sq0;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromotionCondition.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LSq0/b;", "", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f15167a;

    public static String a(AttributedText attributedText) {
        return "PromotionCondition(text=" + attributedText + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return L.f(this.f15167a, ((b) obj).f15167a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15167a.hashCode();
    }

    public final String toString() {
        return a(this.f15167a);
    }
}
