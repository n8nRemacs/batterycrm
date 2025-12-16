package No0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmDiscountDispatchResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0012B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LNo0/a;", "", "", "ok", "", "recipientsCount", "Lcom/avito/android/deep_linking/links/DeepLink;", "paymentDeeplink", "LNo0/g;", "tariff", "LNo0/a$b;", "error", "<init>", "(Ljava/lang/Boolean;JLcom/avito/android/deep_linking/links/DeepLink;LNo0/g;LNo0/a$b;)V", "Ljava/lang/Boolean;", "getOk", "()Ljava/lang/Boolean;", "J", "b", "()J", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LNo0/g;", "c", "()LNo0/g;", "LNo0/a$b;", "getError", "()LNo0/a$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: No0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14597a {

    @com.google.gson.annotations.c("error")
    @l
    private final b error;

    @com.google.gson.annotations.c("ok")
    @l
    private final Boolean ok;

    @com.google.gson.annotations.c("paymentDeeplink")
    @l
    private final DeepLink paymentDeeplink;

    @com.google.gson.annotations.c("recipientsCount")
    private final long recipientsCount;

    @com.google.gson.annotations.c("tariff")
    @l
    private final g tariff;

    /* compiled from: ConfirmDiscountDispatchResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"LNo0/a$a;", "", "<init>", "()V", "", "ERROR", "Ljava/lang/String;", "OK", "PAYMENT_DEEPLINK", "RECIPIENTS_COUNT", "TARIFF", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: No0.a$a, reason: collision with other inner class name */
    public static final class C0761a {
        public /* synthetic */ C0761a(C42822w c42822w) {
            this();
        }

        public C0761a() {
        }
    }

    /* compiled from: ConfirmDiscountDispatchResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LNo0/a$b;", "", "", "code", "", "message", "<init>", "(JLjava/lang/String;)V", "J", "getCode", "()J", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: No0.a$b */
    public static final /* data */ class b {

        @com.google.gson.annotations.c("code")
        private final long code;

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        /* compiled from: ConfirmDiscountDispatchResponse.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LNo0/a$b$a;", "", "<init>", "()V", "", "CODE", "Ljava/lang/String;", "MESSAGE", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: No0.a$b$a, reason: collision with other inner class name */
        public static final class C0762a {
            public /* synthetic */ C0762a(C42822w c42822w) {
                this();
            }

            public C0762a() {
            }
        }

        static {
            new C0762a(null);
        }

        public b(long j12, @k String str) {
            this.code = j12;
            this.message = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.code == bVar.code && L.f(this.message, bVar.message);
        }

        public final int hashCode() {
            return this.message.hashCode() + (Long.hashCode(this.code) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(code=");
            sb2.append(this.code);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }
    }

    static {
        new C0761a(null);
    }

    public C14597a(@l Boolean bool, long j12, @l DeepLink deepLink, @l g gVar, @l b bVar) {
        this.ok = bool;
        this.recipientsCount = j12;
        this.paymentDeeplink = deepLink;
        this.tariff = gVar;
        this.error = bVar;
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
    public final g getTariff() {
        return this.tariff;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14597a)) {
            return false;
        }
        C14597a c14597a = (C14597a) obj;
        return L.f(this.ok, c14597a.ok) && this.recipientsCount == c14597a.recipientsCount && L.f(this.paymentDeeplink, c14597a.paymentDeeplink) && L.f(this.tariff, c14597a.tariff) && L.f(this.error, c14597a.error);
    }

    public final int hashCode() {
        Boolean bool = this.ok;
        int iG2 = r.g((bool == null ? 0 : bool.hashCode()) * 31, 31, this.recipientsCount);
        DeepLink deepLink = this.paymentDeeplink;
        int iHashCode = (iG2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        g gVar = this.tariff;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        b bVar = this.error;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ConfirmDiscountDispatchResponse(ok=" + this.ok + ", recipientsCount=" + this.recipientsCount + ", paymentDeeplink=" + this.paymentDeeplink + ", tariff=" + this.tariff + ", error=" + this.error + ')';
    }
}
