package com.avito.android.ai_assistant.generated.api.send_v_2;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: SendV2Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/b;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$b;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$c;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$d;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b;", "", "isSelected", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        @com.google.gson.annotations.c("isSelected")
        private final boolean isSelected;

        public a(boolean z12) {
            this.isSelected = z12;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$b;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", ContextActionHandler.Link.URL, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.generated.api.send_v_2.b$b, reason: collision with other inner class name */
    public static final class C2639b implements b {

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        public C2639b(@k DeepLink deepLink, @k String str) {
            this.uri = deepLink;
            this.url = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$c;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b;", "", "isSelected", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        @com.google.gson.annotations.c("isSelected")
        private final boolean isSelected;

        public c(boolean z12) {
            this.isSelected = z12;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$d;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b;", "", "value", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        @com.google.gson.annotations.c("value")
        @k
        private final String value;

        public d(@k String str) {
            this.value = str;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/b$e;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/b;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f89089a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1258341286;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
