package EM0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: VerificationViewStartApiV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LEM0/e;", "", "a", "b", "LEM0/e$a;", "LEM0/e$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface e {

    /* compiled from: VerificationViewStartApiV3Response.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LEM0/e$a;", "LEM0/e;", "", "errorId", "LEM0/c;", "observability", "LEM0/a;", "popupProps", "LEM0/b;", "toastProps", "<init>", "(Ljava/lang/String;LEM0/c;LEM0/a;LEM0/b;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LEM0/c;", "getObservability", "()LEM0/c;", "LEM0/a;", "getPopupProps", "()LEM0/a;", "LEM0/b;", "b", "()LEM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e {

        @com.google.gson.annotations.c("errorId")
        @l
        private final String errorId;

        @com.google.gson.annotations.c("observability")
        @l
        private final c observability;

        @com.google.gson.annotations.c("popupProps")
        @l
        private final EM0.a popupProps;

        @com.google.gson.annotations.c("toastProps")
        @l
        private final EM0.b toastProps;

        public a(@l String str, @l c cVar, @l EM0.a aVar, @l EM0.b bVar) {
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
        public final EM0.b getToastProps() {
            return this.toastProps;
        }
    }

    /* compiled from: VerificationViewStartApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LEM0/e$b;", "LEM0/e;", "LEM0/c;", "observability", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LEM0/c;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LEM0/c;", "getObservability", "()LEM0/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements e {

        @com.google.gson.annotations.c("observability")
        @l
        private final c observability;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public b(@l c cVar, @k DeepLink deepLink) {
            this.observability = cVar;
            this.uri = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }
}
