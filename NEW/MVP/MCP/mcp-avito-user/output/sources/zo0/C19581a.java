package Zo0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiConfirmDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LZo0/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "paymentDeeplink", "", "recipientsCount", "LZo0/b;", "tariff", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;JLZo0/b;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "J", "b", "()J", "LZo0/b;", "c", "()LZo0/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19581a {

    @c("paymentDeeplink")
    @l
    private final DeepLink paymentDeeplink;

    @c("recipientsCount")
    private final long recipientsCount;

    @c("tariff")
    @l
    private final C19582b tariff;

    public C19581a(@l DeepLink deepLink, long j12, @l C19582b c19582b) {
        this.paymentDeeplink = deepLink;
        this.recipientsCount = j12;
        this.tariff = c19582b;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getPaymentDeeplink() {
        return this.paymentDeeplink;
    }

    /* renamed from: b, reason: from getter */
    public final long getRecipientsCount() {
        return this.recipientsCount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C19582b getTariff() {
        return this.tariff;
    }
}
