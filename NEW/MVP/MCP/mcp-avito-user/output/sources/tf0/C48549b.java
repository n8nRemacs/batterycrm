package tF0;

import Y61.k;
import Y61.l;
import com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.Widget;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\b\u0010\u0018R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"LtF0/b;", "", "", "displayTitle", "", "hasSuggest", "id", "isHighlighted", "isOptional", "", "LtF0/d;", "options", "title", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;", "value", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "c", "h", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;", "f", "()Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget;", "g", "()Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tF0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48549b {

    @com.google.gson.annotations.c("displayTitle")
    @l
    private final String displayTitle;

    @com.google.gson.annotations.c("hasSuggest")
    @l
    private final Boolean hasSuggest;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isHighlighted")
    @l
    private final Boolean isHighlighted;

    @com.google.gson.annotations.c("isOptional")
    @l
    private final Boolean isOptional;

    @com.google.gson.annotations.c("options")
    @l
    private final List<d> options;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.a value;

    @com.google.gson.annotations.c("widget")
    @k
    private final Widget widget;

    public C48549b(@l String str, @l Boolean bool, @k String str2, @l Boolean bool2, @l Boolean bool3, @l List<d> list, @k String str3, @l com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.a aVar, @k Widget widget) {
        this.displayTitle = str;
        this.hasSuggest = bool;
        this.id = str2;
        this.isHighlighted = bool2;
        this.isOptional = bool3;
        this.options = list;
        this.title = str3;
        this.value = aVar;
        this.widget = widget;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<d> d() {
        return this.options;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.a getValue() {
        return this.value;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Boolean getIsHighlighted() {
        return this.isHighlighted;
    }
}
