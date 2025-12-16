package K50;

import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MergeAccountsFinishResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LK50/f;", "", "a", "b", "LK50/f$a;", "LK50/f$b;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: MergeAccountsFinishResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK50/f$a;", "LK50/f;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {
    }

    /* compiled from: MergeAccountsFinishResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LK50/f$b;", "LK50/f;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "message", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @Y61.l
        private final DeepLink deeplink;

        @com.google.gson.annotations.c("message")
        @Y61.l
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.deeplink, bVar.deeplink) && L.f(this.message, bVar.message);
        }

        public final int hashCode() {
            DeepLink deepLink = this.deeplink;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            String str = this.message;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Ok(deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }

        public b(@Y61.l DeepLink deepLink, @Y61.l String str) {
            this.deeplink = deepLink;
            this.message = str;
        }

        public /* synthetic */ b(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : deepLink, (i12 & 2) != 0 ? null : str);
        }
    }
}
