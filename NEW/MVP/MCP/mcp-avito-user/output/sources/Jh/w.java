package jh;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljh/w;", "", "", "title", "Ljh/w$a;", "budgetSection", "Ljh/w$b;", "customBudgetSection", "<init>", "(Ljava/lang/String;Ljh/w$a;Ljh/w$b;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljh/w$a;", "a", "()Ljh/w$a;", "Ljh/w$b;", "b", "()Ljh/w$b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w {

    @com.google.gson.annotations.c("budgetSection")
    @Y61.k
    private final a budgetSection;

    @com.google.gson.annotations.c("customBudgetSection")
    @Y61.k
    private final b customBudgetSection;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* compiled from: BbipPrivateConfiguratorResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Ljh/w$a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "forecastTitle", "Ljh/w$a$a;", "title", "otherBudgetText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljh/w$a$a;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljh/w$a$a;", "c", "()Ljh/w$a$a;", "b", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("forecastTitle")
        @Y61.k
        private final AttributedText forecastTitle;

        @com.google.gson.annotations.c("otherBudgetText")
        @Y61.k
        private final AttributedText otherBudgetText;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final C11573a title;

        /* compiled from: BbipPrivateConfiguratorResult.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljh/w$a$a;", "", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jh.w$a$a, reason: collision with other inner class name */
        public static final class C11573a {

            @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
            @Y61.k
            private final DeepLink deepLink;

            @com.google.gson.annotations.c("text")
            @Y61.k
            private final String text;

            public C11573a(@Y61.k String str, @Y61.k DeepLink deepLink) {
                this.text = str;
                this.deepLink = deepLink;
            }

            @Y61.k
            /* renamed from: a, reason: from getter */
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }
        }

        public a(@Y61.k AttributedText attributedText, @Y61.k C11573a c11573a, @Y61.k AttributedText attributedText2) {
            this.forecastTitle = attributedText;
            this.title = c11573a;
            this.otherBudgetText = attributedText2;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AttributedText getForecastTitle() {
            return this.forecastTitle;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final AttributedText getOtherBudgetText() {
            return this.otherBudgetText;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final C11573a getTitle() {
            return this.title;
        }
    }

    /* compiled from: BbipPrivateConfiguratorResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljh/w$b;", "", "", "forecastSubtitle", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        @com.google.gson.annotations.c("forecastSubtitle")
        @Y61.k
        private final String forecastSubtitle;

        public b(@Y61.k String str) {
            this.forecastSubtitle = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getForecastSubtitle() {
            return this.forecastSubtitle;
        }
    }

    public w(@Y61.k String str, @Y61.k a aVar, @Y61.k b bVar) {
        this.title = str;
        this.budgetSection = aVar;
        this.customBudgetSection = bVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final a getBudgetSection() {
        return this.budgetSection;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final b getCustomBudgetSection() {
        return this.customBudgetSection;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
