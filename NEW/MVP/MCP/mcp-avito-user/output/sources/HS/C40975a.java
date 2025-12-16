package hs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: AttributedTextWithIconResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhs/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lhs/a$a;", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lhs/a$a;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lhs/a$a;", "a", "()Lhs/a$a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40975a {

    @com.google.gson.annotations.c("icon")
    @l
    private final C11278a icon;

    @com.google.gson.annotations.c("text")
    @k
    private final AttributedText text;

    /* compiled from: AttributedTextWithIconResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhs/a$a;", "", "", "name", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "a", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hs.a$a, reason: collision with other inner class name */
    public static final class C11278a {

        @com.google.gson.annotations.c("color")
        @k
        private final UniversalColor color;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        public C11278a(@k String str, @k UniversalColor universalColor, @l DeepLink deepLink) {
            this.name = str;
            this.color = universalColor;
            this.deepLink = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }
    }

    public C40975a(@k AttributedText attributedText, @l C11278a c11278a) {
        this.text = attributedText;
        this.icon = c11278a;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C11278a getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
