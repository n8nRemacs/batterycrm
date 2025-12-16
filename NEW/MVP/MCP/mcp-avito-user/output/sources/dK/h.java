package Dk;

import Y61.l;
import com.avito.android.remote.model.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasBundlesResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LDk/h;", "", "", "title", "description", "LDk/c;", "topBanner", "", "LDk/g;", "list", "Lcom/avito/android/remote/model/Action;", "emptyAction", "", "isEmptyActionFloating", "<init>", "(Ljava/lang/String;Ljava/lang/String;LDk/c;Ljava/util/List;Lcom/avito/android/remote/model/Action;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "a", "LDk/c;", "e", "()LDk/c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Action;", "b", "()Lcom/avito/android/remote/model/Action;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("emptyAction")
    @l
    private final Action emptyAction;

    @com.google.gson.annotations.c("isEmptyActionFloating")
    @l
    private final Boolean isEmptyActionFloating;

    @com.google.gson.annotations.c("list")
    @Y61.k
    private final List<g> list;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("topBanner")
    @l
    private final c topBanner;

    public h(@Y61.k String str, @l String str2, @l c cVar, @Y61.k List<g> list, @l Action action, @l Boolean bool) {
        this.title = str;
        this.description = str2;
        this.topBanner = cVar;
        this.list = list;
        this.emptyAction = action;
        this.isEmptyActionFloating = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Action getEmptyAction() {
        return this.emptyAction;
    }

    @Y61.k
    public final List<g> c() {
        return this.list;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final c getTopBanner() {
        return this.topBanner;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsEmptyActionFloating() {
        return this.isEmptyActionFloating;
    }

    public /* synthetic */ h(String str, String str2, c cVar, List list, Action action, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, cVar, list, action, (i12 & 32) != 0 ? null : bool);
    }
}
