package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Advices.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/AdviceDetailItem;", "", "itemId", "", "title", "description", "dateText", "image", "Lcom/avito/android/remote/model/Image;", "stats", "Lcom/avito/android/remote/model/AdviceDetailStats;", "action", "Lcom/avito/android/remote/model/AdviceAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/AdviceDetailStats;Lcom/avito/android/remote/model/AdviceAction;)V", "getAction", "()Lcom/avito/android/remote/model/AdviceAction;", "getDateText", "()Ljava/lang/String;", "getDescription", "getImage", "()Lcom/avito/android/remote/model/Image;", "getItemId", "getStats", "()Lcom/avito/android/remote/model/AdviceDetailStats;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdviceDetailItem {

    @c("action")
    @l
    private final AdviceAction action;

    @c("dateText")
    @k
    private final String dateText;

    @c("description")
    @k
    private final String description;

    @c("image")
    @l
    private final Image image;

    @c("itemId")
    @k
    private final String itemId;

    @c("stats")
    @l
    private final AdviceDetailStats stats;

    @c("title")
    @k
    private final String title;

    public AdviceDetailItem(@k String str, @k String str2, @k String str3, @k String str4, @l Image image, @l AdviceDetailStats adviceDetailStats, @l AdviceAction adviceAction) {
        this.itemId = str;
        this.title = str2;
        this.description = str3;
        this.dateText = str4;
        this.image = image;
        this.stats = adviceDetailStats;
        this.action = adviceAction;
    }

    public static /* synthetic */ AdviceDetailItem copy$default(AdviceDetailItem adviceDetailItem, String str, String str2, String str3, String str4, Image image, AdviceDetailStats adviceDetailStats, AdviceAction adviceAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = adviceDetailItem.itemId;
        }
        if ((i12 & 2) != 0) {
            str2 = adviceDetailItem.title;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = adviceDetailItem.description;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            str4 = adviceDetailItem.dateText;
        }
        String str7 = str4;
        if ((i12 & 16) != 0) {
            image = adviceDetailItem.image;
        }
        Image image2 = image;
        if ((i12 & 32) != 0) {
            adviceDetailStats = adviceDetailItem.stats;
        }
        AdviceDetailStats adviceDetailStats2 = adviceDetailStats;
        if ((i12 & 64) != 0) {
            adviceAction = adviceDetailItem.action;
        }
        return adviceDetailItem.copy(str, str5, str6, str7, image2, adviceDetailStats2, adviceAction);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getDateText() {
        return this.dateText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AdviceDetailStats getStats() {
        return this.stats;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AdviceAction getAction() {
        return this.action;
    }

    @k
    public final AdviceDetailItem copy(@k String itemId, @k String title, @k String description, @k String dateText, @l Image image, @l AdviceDetailStats stats, @l AdviceAction action) {
        return new AdviceDetailItem(itemId, title, description, dateText, image, stats, action);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdviceDetailItem)) {
            return false;
        }
        AdviceDetailItem adviceDetailItem = (AdviceDetailItem) other;
        return L.f(this.itemId, adviceDetailItem.itemId) && L.f(this.title, adviceDetailItem.title) && L.f(this.description, adviceDetailItem.description) && L.f(this.dateText, adviceDetailItem.dateText) && L.f(this.image, adviceDetailItem.image) && L.f(this.stats, adviceDetailItem.stats) && L.f(this.action, adviceDetailItem.action);
    }

    @l
    public final AdviceAction getAction() {
        return this.action;
    }

    @k
    public final String getDateText() {
        return this.dateText;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final AdviceDetailStats getStats() {
        return this.stats;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(H.d(this.itemId.hashCode() * 31, 31, this.title), 31, this.description), 31, this.dateText);
        Image image = this.image;
        int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
        AdviceDetailStats adviceDetailStats = this.stats;
        int iHashCode2 = (iHashCode + (adviceDetailStats == null ? 0 : adviceDetailStats.hashCode())) * 31;
        AdviceAction adviceAction = this.action;
        return iHashCode2 + (adviceAction != null ? adviceAction.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdviceDetailItem(itemId=" + this.itemId + ", title=" + this.title + ", description=" + this.description + ", dateText=" + this.dateText + ", image=" + this.image + ", stats=" + this.stats + ", action=" + this.action + ')';
    }
}
