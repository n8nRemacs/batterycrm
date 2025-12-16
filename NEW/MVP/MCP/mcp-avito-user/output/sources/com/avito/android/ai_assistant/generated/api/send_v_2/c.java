package com.avito.android.ai_assistant.generated.api.send_v_2;

import Rb.h;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendV2Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/c;", "", "a", "b", "c", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/c$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/c$b;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/c$c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/c$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/c;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public a(@k String str) {
            this.message = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.message, ((a) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Message(message="), this.message, ')');
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/c$b;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/c;", "", "id", "LRb/h;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "version", "<init>", "(JLRb/h;J)V", "J", "a", "()J", "LRb/h;", "b", "()LRb/h;", "c", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
        @l
        private final h parameters;

        @com.google.gson.annotations.c("version")
        private final long version;

        public b(long j12, @l h hVar, long j13) {
            this.id = j12;
            this.parameters = hVar;
            this.version = j13;
        }

        /* renamed from: a, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final h getParameters() {
            return this.parameters;
        }

        /* renamed from: c, reason: from getter */
        public final long getVersion() {
            return this.version;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/c$c;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.generated.api.send_v_2.c$c, reason: collision with other inner class name */
    public static final class C2640c implements c {

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        public C2640c(@k DeepLink deepLink) {
            this.deeplink = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }
}
