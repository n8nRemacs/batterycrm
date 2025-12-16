package com.avito.android.remote.model.job_premoderation;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VacancySimilarItemResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/job_premoderation/VacancySimilarItemResponse;", "", "title", "", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "itemHeader", "item", "Lcom/avito/android/remote/model/job_premoderation/VacancySimilarItemResponse$Item;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/job_premoderation/VacancySimilarItemResponse$Item;)V", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "setDescription", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "getItem", "()Lcom/avito/android/remote/model/job_premoderation/VacancySimilarItemResponse$Item;", "setItem", "(Lcom/avito/android/remote/model/job_premoderation/VacancySimilarItemResponse$Item;)V", "getItemHeader", "()Ljava/lang/String;", "setItemHeader", "(Ljava/lang/String;)V", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Item", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VacancySimilarItemResponse {

    @c("description")
    @l
    private AttributedText description;

    @c("item")
    @l
    private Item item;

    @c("itemHeader")
    @l
    private String itemHeader;

    @c("title")
    @l
    private String title;

    /* compiled from: VacancySimilarItemResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/job_premoderation/VacancySimilarItemResponse$Item;", "", "title", "", "salary", "additionalInfo", "", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getAdditionalInfo", "()Ljava/util/List;", "setAdditionalInfo", "(Ljava/util/List;)V", "getSalary", "()Ljava/lang/String;", "setSalary", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "setUri", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Item {

        @c("additionalInfo")
        @k
        private List<String> additionalInfo;

        @c("salary")
        @k
        private String salary;

        @c("title")
        @k
        private String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private DeepLink uri;

        public Item(@k String str, @k String str2, @k List<String> list, @k DeepLink deepLink) {
            this.title = str;
            this.salary = str2;
            this.additionalInfo = list;
            this.uri = deepLink;
        }

        @k
        public final List<String> getAdditionalInfo() {
            return this.additionalInfo;
        }

        @k
        public final String getSalary() {
            return this.salary;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public final void setAdditionalInfo(@k List<String> list) {
            this.additionalInfo = list;
        }

        public final void setSalary(@k String str) {
            this.salary = str;
        }

        public final void setTitle(@k String str) {
            this.title = str;
        }

        public final void setUri(@k DeepLink deepLink) {
            this.uri = deepLink;
        }
    }

    public VacancySimilarItemResponse(@l String str, @l AttributedText attributedText, @l String str2, @l Item item) {
        this.title = str;
        this.description = attributedText;
        this.itemHeader = str2;
        this.item = item;
    }

    public static /* synthetic */ VacancySimilarItemResponse copy$default(VacancySimilarItemResponse vacancySimilarItemResponse, String str, AttributedText attributedText, String str2, Item item, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = vacancySimilarItemResponse.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = vacancySimilarItemResponse.description;
        }
        if ((i12 & 4) != 0) {
            str2 = vacancySimilarItemResponse.itemHeader;
        }
        if ((i12 & 8) != 0) {
            item = vacancySimilarItemResponse.item;
        }
        return vacancySimilarItemResponse.copy(str, attributedText, str2, item);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getItemHeader() {
        return this.itemHeader;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Item getItem() {
        return this.item;
    }

    @k
    public final VacancySimilarItemResponse copy(@l String title, @l AttributedText description, @l String itemHeader, @l Item item) {
        return new VacancySimilarItemResponse(title, description, itemHeader, item);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VacancySimilarItemResponse)) {
            return false;
        }
        VacancySimilarItemResponse vacancySimilarItemResponse = (VacancySimilarItemResponse) other;
        return L.f(this.title, vacancySimilarItemResponse.title) && L.f(this.description, vacancySimilarItemResponse.description) && L.f(this.itemHeader, vacancySimilarItemResponse.itemHeader) && L.f(this.item, vacancySimilarItemResponse.item);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final Item getItem() {
        return this.item;
    }

    @l
    public final String getItemHeader() {
        return this.itemHeader;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.itemHeader;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Item item = this.item;
        return iHashCode3 + (item != null ? item.hashCode() : 0);
    }

    public final void setDescription(@l AttributedText attributedText) {
        this.description = attributedText;
    }

    public final void setItem(@l Item item) {
        this.item = item;
    }

    public final void setItemHeader(@l String str) {
        this.itemHeader = str;
    }

    public final void setTitle(@l String str) {
        this.title = str;
    }

    @k
    public String toString() {
        return "VacancySimilarItemResponse(title=" + this.title + ", description=" + this.description + ", itemHeader=" + this.itemHeader + ", item=" + this.item + ')';
    }
}
