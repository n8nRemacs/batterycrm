package com.avito.android.ai_assistant.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AssistantChatResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem;", "", "a", "OkRespDataSuccessElementsItemMessage", "b", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$a;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OkRespDataSuccessElementsItem {

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage$Author;", "author", "", "id", "", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "segments", "<init>", "(Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage$Author;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage$Author;", "a", "()Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage$Author;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Author", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessElementsItemMessage implements OkRespDataSuccessElementsItem {

        @com.google.gson.annotations.c("author")
        @k
        private final Author author;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("segments")
        @k
        private final List<OkRespDataSuccessElementsItemMessageSegmentsItem> segments;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AssistantChatResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage$Author;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "User", "Assistant", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Author {

            @com.google.gson.annotations.c("assistant")
            public static final Author Assistant;

            @com.google.gson.annotations.c(ChannelContext.UserToUser.TYPE)
            public static final Author User;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Author[] f89118b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f89119c;

            static {
                Author author = new Author("User", 0, ChannelContext.UserToUser.TYPE);
                User = author;
                Author author2 = new Author("Assistant", 1, "assistant");
                Assistant = author2;
                Author[] authorArr = {author, author2};
                f89118b = authorArr;
                f89119c = kotlin.enums.c.a(authorArr);
            }

            private Author(String str, int i12, String str2) {
            }

            public static Author valueOf(String str) {
                return (Author) Enum.valueOf(Author.class, str);
            }

            public static Author[] values() {
                return (Author[]) f89118b.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OkRespDataSuccessElementsItemMessage(@k Author author, @k String str, @k List<? extends OkRespDataSuccessElementsItemMessageSegmentsItem> list) {
            this.author = author;
            this.id = str;
            this.segments = list;
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
        public final List<OkRespDataSuccessElementsItemMessageSegmentsItem> c() {
            return this.segments;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$a;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem;", "", "datetime", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getDatetime", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements OkRespDataSuccessElementsItem {

        @com.google.gson.annotations.c("datetime")
        @k
        private final String datetime;

        public a(@k String str) {
            this.datetime = str;
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

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem$b;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItem;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements OkRespDataSuccessElementsItem {
        static {
            new b();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1001787790;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
