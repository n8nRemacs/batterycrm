package KZ;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationImmutableInfoItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKZ/M;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "", "action", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class M {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final String action;

    @com.google.gson.annotations.c("content")
    @Y61.k
    private final AttributedText content;

    public M(@Y61.k AttributedText attributedText, @Y61.k String str) {
        this.content = attributedText;
        this.action = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getContent() {
        return this.content;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m12 = (M) obj;
        return kotlin.jvm.internal.L.f(this.content, m12.content) && kotlin.jvm.internal.L.f(this.action, m12.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.content.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoPreview(content=");
        sb2.append(this.content);
        sb2.append(", action=");
        return C22026a.c(sb2, this.action, ')');
    }
}
