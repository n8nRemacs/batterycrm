package com.avito.android.remote.model.adverts;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PostAdvertResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/adverts/PostAdvertResult;", "", "()V", "InputErrors", "Ok", "Lcom/avito/android/remote/model/adverts/PostAdvertResult$InputErrors;", "Lcom/avito/android/remote/model/adverts/PostAdvertResult$Ok;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PostAdvertResult {

    /* compiled from: PostAdvertResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/adverts/PostAdvertResult$InputErrors;", "Lcom/avito/android/remote/model/adverts/PostAdvertResult;", "messages", "Lcom/avito/android/remote/model/PretendResult;", "(Lcom/avito/android/remote/model/PretendResult;)V", "getMessages", "()Lcom/avito/android/remote/model/PretendResult;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputErrors extends PostAdvertResult {

        @c("messages")
        @k
        private final PretendResult messages;

        public InputErrors(@k PretendResult pretendResult) {
            super(null);
            this.messages = pretendResult;
        }

        public static /* synthetic */ InputErrors copy$default(InputErrors inputErrors, PretendResult pretendResult, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                pretendResult = inputErrors.messages;
            }
            return inputErrors.copy(pretendResult);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final PretendResult getMessages() {
            return this.messages;
        }

        @k
        public final InputErrors copy(@k PretendResult messages) {
            return new InputErrors(messages);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InputErrors) && L.f(this.messages, ((InputErrors) other).messages);
        }

        @k
        public final PretendResult getMessages() {
            return this.messages;
        }

        public int hashCode() {
            return this.messages.hashCode();
        }

        @k
        public String toString() {
            return "InputErrors(messages=" + this.messages + ')';
        }
    }

    /* compiled from: PostAdvertResult.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/PostAdvertResult$Ok;", "Lcom/avito/android/remote/model/adverts/PostAdvertResult;", "postedAdvert", "Lcom/avito/android/remote/model/adverts/PostAdvertResult$Ok$PostedAdvert;", "nextStepUri", "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/remote/model/adverts/PostAdvertResult$Ok$PostedAdvert;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getNextStepUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getPostedAdvert", "()Lcom/avito/android/remote/model/adverts/PostAdvertResult$Ok$PostedAdvert;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "PostedAdvert", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ok extends PostAdvertResult {

        @c("nextStepUri")
        @l
        private final DeepLink nextStepUri;

        @c("item")
        @k
        private final PostedAdvert postedAdvert;

        /* compiled from: PostAdvertResult.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/PostAdvertResult$Ok$PostedAdvert;", "", "id", "", "microCategoryId", "categoryAlias", "Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertisementCategoryAlias;)V", "getCategoryAlias", "()Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "getId", "()Ljava/lang/String;", "getMicroCategoryId", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PostedAdvert {

            @c("category")
            @l
            private final AdvertisementCategoryAlias categoryAlias;

            @c("id")
            @k
            private final String id;

            @c("microCategoryId")
            @l
            private final String microCategoryId;

            public PostedAdvert(@k String str, @l String str2, @l AdvertisementCategoryAlias advertisementCategoryAlias) {
                this.id = str;
                this.microCategoryId = str2;
                this.categoryAlias = advertisementCategoryAlias;
            }

            public static /* synthetic */ PostedAdvert copy$default(PostedAdvert postedAdvert, String str, String str2, AdvertisementCategoryAlias advertisementCategoryAlias, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = postedAdvert.id;
                }
                if ((i12 & 2) != 0) {
                    str2 = postedAdvert.microCategoryId;
                }
                if ((i12 & 4) != 0) {
                    advertisementCategoryAlias = postedAdvert.categoryAlias;
                }
                return postedAdvert.copy(str, str2, advertisementCategoryAlias);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getMicroCategoryId() {
                return this.microCategoryId;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final AdvertisementCategoryAlias getCategoryAlias() {
                return this.categoryAlias;
            }

            @k
            public final PostedAdvert copy(@k String id2, @l String microCategoryId, @l AdvertisementCategoryAlias categoryAlias) {
                return new PostedAdvert(id2, microCategoryId, categoryAlias);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PostedAdvert)) {
                    return false;
                }
                PostedAdvert postedAdvert = (PostedAdvert) other;
                return L.f(this.id, postedAdvert.id) && L.f(this.microCategoryId, postedAdvert.microCategoryId) && this.categoryAlias == postedAdvert.categoryAlias;
            }

            @l
            public final AdvertisementCategoryAlias getCategoryAlias() {
                return this.categoryAlias;
            }

            @k
            public final String getId() {
                return this.id;
            }

            @l
            public final String getMicroCategoryId() {
                return this.microCategoryId;
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.microCategoryId;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AdvertisementCategoryAlias advertisementCategoryAlias = this.categoryAlias;
                return iHashCode2 + (advertisementCategoryAlias != null ? advertisementCategoryAlias.hashCode() : 0);
            }

            @k
            public String toString() {
                return "PostedAdvert(id=" + this.id + ", microCategoryId=" + this.microCategoryId + ", categoryAlias=" + this.categoryAlias + ')';
            }
        }

        public Ok(@k PostedAdvert postedAdvert, @l DeepLink deepLink) {
            super(null);
            this.postedAdvert = postedAdvert;
            this.nextStepUri = deepLink;
        }

        public static /* synthetic */ Ok copy$default(Ok ok2, PostedAdvert postedAdvert, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                postedAdvert = ok2.postedAdvert;
            }
            if ((i12 & 2) != 0) {
                deepLink = ok2.nextStepUri;
            }
            return ok2.copy(postedAdvert, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final PostedAdvert getPostedAdvert() {
            return this.postedAdvert;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getNextStepUri() {
            return this.nextStepUri;
        }

        @k
        public final Ok copy(@k PostedAdvert postedAdvert, @l DeepLink nextStepUri) {
            return new Ok(postedAdvert, nextStepUri);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ok)) {
                return false;
            }
            Ok ok2 = (Ok) other;
            return L.f(this.postedAdvert, ok2.postedAdvert) && L.f(this.nextStepUri, ok2.nextStepUri);
        }

        @l
        public final DeepLink getNextStepUri() {
            return this.nextStepUri;
        }

        @k
        public final PostedAdvert getPostedAdvert() {
            return this.postedAdvert;
        }

        public int hashCode() {
            int iHashCode = this.postedAdvert.hashCode() * 31;
            DeepLink deepLink = this.nextStepUri;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Ok(postedAdvert=");
            sb2.append(this.postedAdvert);
            sb2.append(", nextStepUri=");
            return a.v(sb2, this.nextStepUri, ')');
        }
    }

    public /* synthetic */ PostAdvertResult(C42822w c42822w) {
        this();
    }

    private PostAdvertResult() {
    }
}
