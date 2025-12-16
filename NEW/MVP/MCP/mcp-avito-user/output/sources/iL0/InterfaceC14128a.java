package Il0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: Api2StrBookingRequestPayPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIl0/a;", "", "a", "b", "LIl0/a$a;", "LIl0/a$b;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Il0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14128a {

    /* compiled from: Api2StrBookingRequestPayPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LIl0/a$a;", "LIl0/a;", "", "orderId", "paymentUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirect", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Il0.a$a, reason: collision with other inner class name */
    public static final class C0486a implements InterfaceC14128a {

        @com.google.gson.annotations.c("orderId")
        @k
        private final String orderId;

        @com.google.gson.annotations.c("paymentUrl")
        @l
        private final String paymentUrl;

        @com.google.gson.annotations.c("redirect")
        @l
        private final DeepLink redirect;

        public C0486a(@k String str, @l String str2, @l DeepLink deepLink) {
            this.orderId = str;
            this.paymentUrl = str2;
            this.redirect = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getPaymentUrl() {
            return this.paymentUrl;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final DeepLink getRedirect() {
            return this.redirect;
        }
    }

    /* compiled from: Api2StrBookingRequestPayPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LIl0/a$b;", "LIl0/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Il0.a$b */
    public static final class b implements InterfaceC14128a {

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public b(@k String str) {
            this.message = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }
}
