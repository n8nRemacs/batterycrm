package eW0;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserStatsTabData.kt */
@com.avito.android.gson.d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LeW0/l;", "", "", "id", "title", "LeW0/c;", ChannelContext.Item.PLACEHOLDER, "", "LeW0/h;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;LeW0/c;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "LeW0/c;", "getPlaceholder", "()LeW0/c;", "Ljava/util/List;", "getData", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l {

    @com.google.gson.annotations.c("data")
    @Y61.l
    private final List<C40065h> data;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.l
    private final C40060c placeholder;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public l(@Y61.k String str, @Y61.k String str2, @Y61.l C40060c c40060c, @Y61.l List<C40065h> list) {
        this.id = str;
        this.title = str2;
        this.placeholder = c40060c;
        this.data = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.id, lVar.id) && L.f(this.title, lVar.title) && L.f(this.placeholder, lVar.placeholder) && L.f(this.data, lVar.data);
    }

    public final int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        C40060c c40060c = this.placeholder;
        int iHashCode = (iD2 + (c40060c == null ? 0 : c40060c.hashCode())) * 31;
        List<C40065h> list = this.data;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserStatsTabData(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", data=");
        return H.p(sb2, this.data, ')');
    }
}
