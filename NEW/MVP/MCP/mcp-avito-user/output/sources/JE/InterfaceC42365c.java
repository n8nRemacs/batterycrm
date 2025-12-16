package je;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ArCodeConfirmV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lje/c;", "", "a", "b", "Lje/c$a;", "Lje/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: je.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC42365c {

    /* compiled from: ArCodeConfirmV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lje/c$a;", "Lje/c;", "Lje/a;", "messages", "<init>", "(Lje/a;)V", "Lje/a;", "a", "()Lje/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: je.c$a */
    public static final class a implements InterfaceC42365c {

        @com.google.gson.annotations.c("messages")
        @k
        private final C42363a messages;

        public a(@k C42363a c42363a) {
            this.messages = c42363a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C42363a getMessages() {
            return this.messages;
        }
    }

    /* compiled from: ArCodeConfirmV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lje/c$b;", "Lje/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: je.c$b */
    public static final class b implements InterfaceC42365c {

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public b(@k DeepLink deepLink) {
            this.uri = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }
}
