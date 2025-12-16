package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Advices.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/Advice;", "", "adviceId", "", "type", "slug", "color", "title", "description", "headerText", "itemsIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAdviceId", "()Ljava/lang/String;", "getColor", "getDescription", "getHeaderText", "getItemsIds", "()Ljava/util/List;", "getSlug", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Advice {

    @c("adviceId")
    @k
    private final String adviceId;

    @c("color")
    @k
    private final String color;

    @c("description")
    @k
    private final String description;

    @c("headerText")
    @k
    private final String headerText;

    @c("itemsIds")
    @l
    private final List<String> itemsIds;

    @c("slug")
    @k
    private final String slug;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    public Advice(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @k String str7, @l List<String> list) {
        this.adviceId = str;
        this.type = str2;
        this.slug = str3;
        this.color = str4;
        this.title = str5;
        this.description = str6;
        this.headerText = str7;
        this.itemsIds = list;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getAdviceId() {
        return this.adviceId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    @l
    public final List<String> component8() {
        return this.itemsIds;
    }

    @k
    public final Advice copy(@k String adviceId, @k String type, @k String slug, @k String color, @k String title, @k String description, @k String headerText, @l List<String> itemsIds) {
        return new Advice(adviceId, type, slug, color, title, description, headerText, itemsIds);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Advice)) {
            return false;
        }
        Advice advice = (Advice) other;
        return L.f(this.adviceId, advice.adviceId) && L.f(this.type, advice.type) && L.f(this.slug, advice.slug) && L.f(this.color, advice.color) && L.f(this.title, advice.title) && L.f(this.description, advice.description) && L.f(this.headerText, advice.headerText) && L.f(this.itemsIds, advice.itemsIds);
    }

    @k
    public final String getAdviceId() {
        return this.adviceId;
    }

    @k
    public final String getColor() {
        return this.color;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getHeaderText() {
        return this.headerText;
    }

    @l
    public final List<String> getItemsIds() {
        return this.itemsIds;
    }

    @k
    public final String getSlug() {
        return this.slug;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(H.d(H.d(this.adviceId.hashCode() * 31, 31, this.type), 31, this.slug), 31, this.color), 31, this.title), 31, this.description), 31, this.headerText);
        List<String> list = this.itemsIds;
        return iD2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Advice(adviceId=");
        sb2.append(this.adviceId);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", slug=");
        sb2.append(this.slug);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", headerText=");
        sb2.append(this.headerText);
        sb2.append(", itemsIds=");
        return H.p(sb2, this.itemsIds, ')');
    }
}
