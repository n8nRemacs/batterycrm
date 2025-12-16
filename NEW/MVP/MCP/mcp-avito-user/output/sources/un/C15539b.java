package Un;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1PromoCategoryTreeResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LUn/b;", "", "", "childCategories", "", "hasItems", "", "id", "isVertical", "", "name", "<init>", "(Ljava/util/List;ZJZLjava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Z", "b", "()Z", "J", "c", "()J", "e", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Un.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15539b {

    @c("childCategories")
    @l
    private final List<C15539b> childCategories;

    @c("hasItems")
    private final boolean hasItems;

    @c("id")
    private final long id;

    @c("isVertical")
    private final boolean isVertical;

    @c("name")
    @k
    private final String name;

    public C15539b(@l List<C15539b> list, boolean z12, long j12, boolean z13, @k String str) {
        this.childCategories = list;
        this.hasItems = z12;
        this.id = j12;
        this.isVertical = z13;
        this.name = str;
    }

    @l
    public final List<C15539b> a() {
        return this.childCategories;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasItems() {
        return this.hasItems;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }
}
