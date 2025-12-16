package VF0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureCancelV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LVF0/a;", "", "a", "b", "LVF0/a$a;", "LVF0/a$b;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: ApiTrxPromoConfigureCancelV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LVF0/a$a;", "LVF0/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VF0.a$a, reason: collision with other inner class name */
    public static final class C1169a implements a {

        @c("action")
        @k
        private final DeepLink action;

        public C1169a(@k DeepLink deepLink) {
            this.action = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getAction() {
            return this.action;
        }
    }

    /* compiled from: ApiTrxPromoConfigureCancelV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LVF0/a$b;", "LVF0/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @c("message")
        @l
        private final String message;

        public b(@l String str) {
            this.message = str;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }
}
