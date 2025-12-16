package dX;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceFaq.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LdX/k;", "", "", "LdX/k$a;", "items", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class k {

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<a> items;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: QualityServiceFaq.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LdX/k$a;", "", "", "id", "question", "Lcom/avito/android/remote/model/text/AttributedText;", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c("answer")
        @Y61.l
        private final AttributedText answer;

        @com.google.gson.annotations.c("id")
        @Y61.l
        private final String id;

        @com.google.gson.annotations.c("question")
        @Y61.l
        private final String question;

        public a(@Y61.l String str, @Y61.l String str2, @Y61.l AttributedText attributedText) {
            this.id = str;
            this.question = str2;
            this.answer = attributedText;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final AttributedText getAnswer() {
            return this.answer;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.id, aVar.id) && L.f(this.question, aVar.question) && L.f(this.answer, aVar.answer);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.question;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AttributedText attributedText = this.answer;
            return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FaqItem(id=");
            sb2.append(this.id);
            sb2.append(", question=");
            sb2.append(this.question);
            sb2.append(", answer=");
            return com.avito.android.actions_sheet.a.w(sb2, this.answer, ')');
        }
    }

    public k(@Y61.l List<a> list, @Y61.l String str) {
        this.items = list;
        this.title = str;
    }

    @Y61.l
    public final List<a> a() {
        return this.items;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.items, kVar.items) && L.f(this.title, kVar.title);
    }

    public final int hashCode() {
        List<a> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QualityServiceFaq(items=");
        sb2.append(this.items);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }
}
