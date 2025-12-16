package DM0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: VerificationViewRedirectApiV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDM0/e;", "", "a", "b", "LDM0/e$a;", "LDM0/e$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface e {

    /* compiled from: VerificationViewRedirectApiV3Response.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LDM0/e$a;", "LDM0/e;", "", "errorId", "LDM0/c;", "observability", "LDM0/a;", "popupProps", "LDM0/b;", "toastProps", "<init>", "(Ljava/lang/String;LDM0/c;LDM0/a;LDM0/b;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LDM0/c;", "getObservability", "()LDM0/c;", "LDM0/a;", "getPopupProps", "()LDM0/a;", "LDM0/b;", "b", "()LDM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e {

        @com.google.gson.annotations.c("errorId")
        @l
        private final String errorId;

        @com.google.gson.annotations.c("observability")
        @l
        private final c observability;

        @com.google.gson.annotations.c("popupProps")
        @l
        private final DM0.a popupProps;

        @com.google.gson.annotations.c("toastProps")
        @l
        private final DM0.b toastProps;

        public a(@l String str, @l c cVar, @l DM0.a aVar, @l DM0.b bVar) {
            this.errorId = str;
            this.observability = cVar;
            this.popupProps = aVar;
            this.toastProps = bVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getErrorId() {
            return this.errorId;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DM0.b getToastProps() {
            return this.toastProps;
        }
    }

    /* compiled from: VerificationViewRedirectApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LDM0/e$b;", "LDM0/e;", "LDM0/c;", "observability", "", "sendAnalytic", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LDM0/c;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LDM0/c;", "getObservability", "()LDM0/c;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements e {

        @com.google.gson.annotations.c("observability")
        @l
        private final c observability;

        @com.google.gson.annotations.c("sendAnalytic")
        @l
        private final Boolean sendAnalytic;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public b(@l c cVar, @l Boolean bool, @k DeepLink deepLink) {
            this.observability = cVar;
            this.sendAnalytic = bool;
            this.uri = deepLink;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Boolean getSendAnalytic() {
            return this.sendAnalytic;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }
}
