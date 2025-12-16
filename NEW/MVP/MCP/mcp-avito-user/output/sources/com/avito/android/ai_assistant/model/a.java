package com.avito.android.ai_assistant.model;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AssistantChatResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/model/a;", "", "a", "b", "Lcom/avito/android/ai_assistant/model/a$a;", "Lcom/avito/android/ai_assistant/model/a$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/model/a$a;", "Lcom/avito/android/ai_assistant/model/a;", "Lcom/avito/android/remote/model/BeduinV2;", "beduinSnippet", "<init>", "(Lcom/avito/android/remote/model/BeduinV2;)V", "Lcom/avito/android/remote/model/BeduinV2;", "getBeduinSnippet", "()Lcom/avito/android/remote/model/BeduinV2;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.model.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2642a implements a {

        @com.google.gson.annotations.c("beduinSnippet")
        @k
        private final BeduinV2 beduinSnippet;

        public C2642a(@k BeduinV2 beduinV2) {
            this.beduinSnippet = beduinV2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2642a) && L.f(this.beduinSnippet, ((C2642a) obj).beduinSnippet);
        }

        public final int hashCode() {
            return this.beduinSnippet.hashCode();
        }

        @k
        public final String toString() {
            return "BeduinSnippet(beduinSnippet=" + this.beduinSnippet + ')';
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/avito/android/ai_assistant/model/a$b;", "Lcom/avito/android/ai_assistant/model/a;", "", "id", "Lcom/avito/android/remote/model/Image;", "imageBySizes", "", "priceString", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH, "urlPath", "<init>", "(JLcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "J", "getId", "()J", "Lcom/avito/android/remote/model/Image;", "getImageBySizes", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getPriceString", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUriPath", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrlPath", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("imageBySizes")
        @l
        private final Image imageBySizes;

        @com.google.gson.annotations.c("priceString")
        @l
        private final String priceString;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH)
        @k
        private final DeepLink uriPath;

        @com.google.gson.annotations.c("urlPath")
        @k
        private final String urlPath;

        public b(long j12, @l Image image, @l String str, @k String str2, @k DeepLink deepLink, @k String str3) {
            this.id = j12;
            this.imageBySizes = image;
            this.priceString = str;
            this.title = str2;
            this.uriPath = deepLink;
            this.urlPath = str3;
        }
    }
}
