package com.avito.android.extended_profile.remote.generated.api.bx_tabs_by_user_hash_api;

import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: BxTabsByUserHashApiResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u001aB9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/avito/android/extended_profile/remote/generated/api/bx_tabs_by_user_hash_api/TabsResponseOkSuccessTabsItem;", "", "", "count", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "title", "Lcom/avito/android/extended_profile/remote/generated/api/bx_tabs_by_user_hash_api/TabsResponseOkSuccessTabsItem$Type;", "type", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/Long;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/extended_profile/remote/generated/api/bx_tabs_by_user_hash_api/TabsResponseOkSuccessTabsItem$Type;Ljava/lang/String;)V", "Ljava/lang/Long;", "getCount", "()Ljava/lang/Long;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/extended_profile/remote/generated/api/bx_tabs_by_user_hash_api/TabsResponseOkSuccessTabsItem$Type;", "c", "()Lcom/avito/android/extended_profile/remote/generated/api/bx_tabs_by_user_hash_api/TabsResponseOkSuccessTabsItem$Type;", "getUrl", "Type", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TabsResponseOkSuccessTabsItem {

    @c("count")
    @l
    private final Long count;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final Type type;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BxTabsByUserHashApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/extended_profile/remote/generated/api/bx_tabs_by_user_hash_api/TabsResponseOkSuccessTabsItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Brand", "Search", "Ratings", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("brand")
        public static final Type Brand;

        @c("ratings")
        public static final Type Ratings;

        @c(SingleLineInputModel.STYLE_SEARCH)
        public static final Type Search;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f150448b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f150449c;

        static {
            Type type = new Type("Brand", 0, "brand");
            Brand = type;
            Type type2 = new Type("Search", 1, SingleLineInputModel.STYLE_SEARCH);
            Search = type2;
            Type type3 = new Type("Ratings", 2, "ratings");
            Ratings = type3;
            Type[] typeArr = {type, type2, type3};
            f150448b = typeArr;
            f150449c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f150448b.clone();
        }
    }

    public TabsResponseOkSuccessTabsItem(@l Long l12, @l DeepLink deepLink, @l String str, @l Type type, @l String str2) {
        this.count = l12;
        this.deeplink = deepLink;
        this.title = str;
        this.type = type;
        this.url = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
