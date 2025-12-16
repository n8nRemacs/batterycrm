package ap0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiCreateAutoDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lap0/a;", "", "", "id", "Lcom/avito/android/deep_linking/links/DeepLink;", "paymentDeeplink", "<init>", "(JLcom/avito/android/deep_linking/links/DeepLink;)V", "J", "a", "()J", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ap0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23649a {

    @c("id")
    private final long id;

    @c("paymentDeeplink")
    @k
    private final DeepLink paymentDeeplink;

    public C23649a(long j12, @k DeepLink deepLink) {
        this.id = j12;
        this.paymentDeeplink = deepLink;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getPaymentDeeplink() {
        return this.paymentDeeplink;
    }
}
