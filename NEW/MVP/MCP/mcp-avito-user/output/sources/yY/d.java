package YY;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetChannelsCustomTagsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LYY/d;", "", "", "LYY/b;", "taglists", "LYY/c;", "tags", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {

    @com.google.gson.annotations.c("taglists")
    @k
    private final List<b> taglists;

    @com.google.gson.annotations.c("tags")
    @k
    private final List<c> tags;

    public d(@k List<b> list, @k List<c> list2) {
        this.taglists = list;
        this.tags = list2;
    }

    @k
    public final List<b> a() {
        return this.taglists;
    }

    @k
    public final List<c> b() {
        return this.tags;
    }
}
