package uo;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiCheckoutSaveV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Luo/a;", "", "a", "b", "Luo/a$a;", "Luo/a$b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC49084a {

    /* compiled from: ApiCheckoutSaveV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luo/a$a;", "Luo/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uo.a$a, reason: collision with other inner class name */
    public static final class C12729a implements InterfaceC49084a {

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public C12729a(@k DeepLink deepLink) {
            this.uri = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    /* compiled from: ApiCheckoutSaveV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Luo/a$b;", "Luo/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "successFinishFlowUri", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uo.a$b */
    public static final class b implements InterfaceC49084a {

        @c("successFinishFlowUri")
        @k
        private final DeepLink successFinishFlowUri;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        public b(@k DeepLink deepLink, @k DeepLink deepLink2) {
            this.successFinishFlowUri = deepLink;
            this.uri = deepLink2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getSuccessFinishFlowUri() {
            return this.successFinishFlowUri;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }
}
