package com.avito.android.ai_assistant.generated.api.send_v_2;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendV2Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2;", "", "a", "OkRespDataSuccessElementsItem2Message", "b", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$OkRespDataSuccessElementsItem2Message;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OkRespDataSuccessElementsItem2 {

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0019B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$OkRespDataSuccessElementsItem2Message;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$OkRespDataSuccessElementsItem2Message$Author;", "author", "", "id", "", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a;", "segments", "", "timestamp", "<init>", "(Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$OkRespDataSuccessElementsItem2Message$Author;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$OkRespDataSuccessElementsItem2Message$Author;", "a", "()Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$OkRespDataSuccessElementsItem2Message$Author;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "Author", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessElementsItem2Message implements OkRespDataSuccessElementsItem2 {

        @com.google.gson.annotations.c("author")
        @k
        private final Author author;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("segments")
        @k
        private final List<com.avito.android.ai_assistant.generated.api.send_v_2.a> segments;

        @com.google.gson.annotations.c("timestamp")
        @l
        private final Long timestamp;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SendV2Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$OkRespDataSuccessElementsItem2Message$Author;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "User", "Assistant", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Author {

            @com.google.gson.annotations.c("assistant")
            public static final Author Assistant;

            @com.google.gson.annotations.c(ChannelContext.UserToUser.TYPE)
            public static final Author User;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Author[] f89076b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f89077c;

            static {
                Author author = new Author("User", 0, ChannelContext.UserToUser.TYPE);
                User = author;
                Author author2 = new Author("Assistant", 1, "assistant");
                Assistant = author2;
                Author[] authorArr = {author, author2};
                f89076b = authorArr;
                f89077c = kotlin.enums.c.a(authorArr);
            }

            private Author(String str, int i12, String str2) {
            }

            public static Author valueOf(String str) {
                return (Author) Enum.valueOf(Author.class, str);
            }

            public static Author[] values() {
                return (Author[]) f89076b.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OkRespDataSuccessElementsItem2Message(@k Author author, @k String str, @k List<? extends com.avito.android.ai_assistant.generated.api.send_v_2.a> list, @l Long l12) {
            this.author = author;
            this.id = str;
            this.segments = list;
            this.timestamp = l12;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Author getAuthor() {
            return this.author;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        public final List<com.avito.android.ai_assistant.generated.api.send_v_2.a> c() {
            return this.segments;
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$a;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2;", "", "datetime", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements OkRespDataSuccessElementsItem2 {

        @com.google.gson.annotations.c("datetime")
        @k
        private final String datetime;

        public a(@k String str) {
            this.datetime = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getDatetime() {
            return this.datetime;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.datetime, ((a) obj).datetime);
        }

        public final int hashCode() {
            return this.datetime.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Datetime(datetime="), this.datetime, ')');
        }
    }

    /* compiled from: SendV2Response.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2$b;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements OkRespDataSuccessElementsItem2 {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f89078a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2024799076;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
