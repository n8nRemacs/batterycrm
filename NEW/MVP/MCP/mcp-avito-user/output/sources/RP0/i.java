package rP0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: WalletVerifyPinResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LrP0/i;", "", "a", "b", "LrP0/i$a;", "LrP0/i$b;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface i {

    /* compiled from: WalletVerifyPinResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LrP0/i$a;", "LrP0/i;", "Lcom/avito/android/remote/model/text/AttributedText;", "message", "LrP0/a;", "resultParams", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "_currentAttempt", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LrP0/a;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LrP0/a;", "d", "()LrP0/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Integer;", "get_currentAttempt", "()Ljava/lang/Integer;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements i {

        @com.google.gson.annotations.c("current_pin_attempt")
        @l
        private final Integer _currentAttempt;

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @com.google.gson.annotations.c("message")
        @l
        private final AttributedText message;

        @com.google.gson.annotations.c("resultParams")
        @l
        private final C47582a resultParams;

        public a(@l AttributedText attributedText, @l C47582a c47582a, @l DeepLink deepLink, @l Integer num) {
            this.message = attributedText;
            this.resultParams = c47582a;
            this.deeplink = deepLink;
            this._currentAttempt = num;
        }

        public final int a() {
            Integer num = this._currentAttempt;
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getMessage() {
            return this.message;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final C47582a getResultParams() {
            return this.resultParams;
        }
    }

    /* compiled from: WalletVerifyPinResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LrP0/i$b;", "LrP0/i;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LAP0/a;", "biometry", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LAP0/a;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LAP0/a;", "a", "()LAP0/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements i {

        @com.google.gson.annotations.c("biometry")
        @l
        private final AP0.a biometry;

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        public b(@k DeepLink deepLink, @l AP0.a aVar) {
            this.deeplink = deepLink;
            this.biometry = aVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AP0.a getBiometry() {
            return this.biometry;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }
}
