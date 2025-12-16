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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003Ju\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/AdviceDetail;", "", "adviceId", "", "type", "slug", "color", "title", "description", "action", "Lcom/avito/android/remote/model/AdviceAction;", "items", "", "Lcom/avito/android/remote/model/AdviceDetailItem;", "additionalMenu", "Lcom/avito/android/remote/model/MenuAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdviceAction;Ljava/util/List;Ljava/util/List;)V", "getAction", "()Lcom/avito/android/remote/model/AdviceAction;", "getAdditionalMenu", "()Ljava/util/List;", "getAdviceId", "()Ljava/lang/String;", "getColor", "getDescription", "getItems", "getSlug", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdviceDetail {

    @c("action")
    @l
    private final AdviceAction action;

    @c("additionalMenu")
    @l
    private final List<MenuAction> additionalMenu;

    @c("adviceId")
    @k
    private final String adviceId;

    @c("color")
    @k
    private final String color;

    @c("description")
    @k
    private final String description;

    @c("items")
    @l
    private final List<AdviceDetailItem> items;

    @c("slug")
    @k
    private final String slug;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    public AdviceDetail(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @l AdviceAction adviceAction, @l List<AdviceDetailItem> list, @l List<MenuAction> list2) {
        this.adviceId = str;
        this.type = str2;
        this.slug = str3;
        this.color = str4;
        this.title = str5;
        this.description = str6;
        this.action = adviceAction;
        this.items = list;
        this.additionalMenu = list2;
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

    @l
    /* renamed from: component7, reason: from getter */
    public final AdviceAction getAction() {
        return this.action;
    }

    @l
    public final List<AdviceDetailItem> component8() {
        return this.items;
    }

    @l
    public final List<MenuAction> component9() {
        return this.additionalMenu;
    }

    @k
    public final AdviceDetail copy(@k String adviceId, @k String type, @k String slug, @k String color, @k String title, @k String description, @l AdviceAction action, @l List<AdviceDetailItem> items, @l List<MenuAction> additionalMenu) {
        return new AdviceDetail(adviceId, type, slug, color, title, description, action, items, additionalMenu);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdviceDetail)) {
            return false;
        }
        AdviceDetail adviceDetail = (AdviceDetail) other;
        return L.f(this.adviceId, adviceDetail.adviceId) && L.f(this.type, adviceDetail.type) && L.f(this.slug, adviceDetail.slug) && L.f(this.color, adviceDetail.color) && L.f(this.title, adviceDetail.title) && L.f(this.description, adviceDetail.description) && L.f(this.action, adviceDetail.action) && L.f(this.items, adviceDetail.items) && L.f(this.additionalMenu, adviceDetail.additionalMenu);
    }

    @l
    public final AdviceAction getAction() {
        return this.action;
    }

    @l
    public final List<MenuAction> getAdditionalMenu() {
        return this.additionalMenu;
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

    @l
    public final List<AdviceDetailItem> getItems() {
        return this.items;
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
        int iD2 = H.d(H.d(H.d(H.d(H.d(this.adviceId.hashCode() * 31, 31, this.type), 31, this.slug), 31, this.color), 31, this.title), 31, this.description);
        AdviceAction adviceAction = this.action;
        int iHashCode = (iD2 + (adviceAction == null ? 0 : adviceAction.hashCode())) * 31;
        List<AdviceDetailItem> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MenuAction> list2 = this.additionalMenu;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdviceDetail(adviceId=");
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
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", additionalMenu=");
        return H.p(sb2, this.additionalMenu, ')');
    }
}
