package Dk;

import Y61.l;
import com.avito.android.remote.model.Action;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VasUnionItemType.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LDk/f;", "", "", "title", "description", "", "LDk/g;", "list", "Lcom/avito/android/remote/model/Action;", "emptyAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/Action;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Action;", "a", "()Lcom/avito/android/remote/model/Action;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("emptyAction")
    @l
    private final Action emptyAction;

    @com.google.gson.annotations.c("list")
    @Y61.k
    private final List<g> list;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public f(@l String str, @l String str2, @Y61.k List<g> list, @l Action action) {
        this.title = str;
        this.description = str2;
        this.list = list;
        this.emptyAction = action;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getEmptyAction() {
        return this.emptyAction;
    }

    @Y61.k
    public final List<g> b() {
        return this.list;
    }
}
