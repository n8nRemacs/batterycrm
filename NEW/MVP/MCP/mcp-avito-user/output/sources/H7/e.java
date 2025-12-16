package H7;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UpdateCollectionResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\"\u0010\u001fR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b)\u0010\u001f¨\u0006*"}, d2 = {"LH7/e;", "", "LH7/a;", "actions", "LH7/b;", "author", "LH7/c;", "badge", "", "counterAddToFavorites", "description", "id", "name", "", MessageSuggest.PREVIEW, "", "size", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LH7/a;LH7/b;LH7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;)V", "LH7/a;", "getActions", "()LH7/a;", "LH7/b;", "getAuthor", "()LH7/b;", "LH7/c;", "getBadge", "()LH7/c;", "Ljava/lang/String;", "getCounterAddToFavorites", "()Ljava/lang/String;", "getDescription", "getId", "getName", "Ljava/util/Map;", "getPreview", "()Ljava/util/Map;", "J", "getSize", "()J", "getUri", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    @com.google.gson.annotations.c("actions")
    @l
    private final a actions;

    @com.google.gson.annotations.c("author")
    @l
    private final b author;

    @com.google.gson.annotations.c("badge")
    @l
    private final c badge;

    @com.google.gson.annotations.c("counterAddToFavorites")
    @l
    private final String counterAddToFavorites;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c(MessageSuggest.PREVIEW)
    @l
    private final Map<String, String> preview;

    @com.google.gson.annotations.c("size")
    private final long size;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final String uri;

    public e(@l a aVar, @l b bVar, @l c cVar, @l String str, @l String str2, @k String str3, @k String str4, @l Map<String, String> map, long j12, @k String str5) {
        this.actions = aVar;
        this.author = bVar;
        this.badge = cVar;
        this.counterAddToFavorites = str;
        this.description = str2;
        this.id = str3;
        this.name = str4;
        this.preview = map;
        this.size = j12;
        this.uri = str5;
    }
}
