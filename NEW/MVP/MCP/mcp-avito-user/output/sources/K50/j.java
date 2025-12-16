package K50;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportUserDialog.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LK50/j;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "message", "", "Lcom/avito/android/remote/model/Action;", "actions", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j {

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<Action> actions;

    @com.google.gson.annotations.c("message")
    @Y61.k
    private final AttributedText message;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public j(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.l List<Action> list) {
        this.title = str;
        this.message = attributedText;
        this.actions = list;
    }

    @Y61.l
    public final List<Action> a() {
        return this.actions;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getMessage() {
        return this.message;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.title, jVar.title) && L.f(this.message, jVar.message) && L.f(this.actions, jVar.actions);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.title.hashCode() * 31, 31, this.message);
        List<Action> list = this.actions;
        return iB2 + (list == null ? 0 : list.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportUserDialog(title=");
        sb2.append(this.title);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }
}
