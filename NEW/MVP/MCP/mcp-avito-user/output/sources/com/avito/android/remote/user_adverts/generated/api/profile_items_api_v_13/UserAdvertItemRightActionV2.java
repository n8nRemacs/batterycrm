package com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13;

import Y61.k;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;", "", "UserAdvertItemRightActionV2Button", "a", "b", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$UserAdvertItemRightActionV2Button;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$a;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$b;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface UserAdvertItemRightActionV2 {

    /* compiled from: ProfileItemsApiV13Response.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$UserAdvertItemRightActionV2Button;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;", "", "slug", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$UserAdvertItemRightActionV2Button$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$UserAdvertItemRightActionV2Button$Style;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$UserAdvertItemRightActionV2Button$Style;", "b", "()Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$UserAdvertItemRightActionV2Button$Style;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "Style", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UserAdvertItemRightActionV2Button implements UserAdvertItemRightActionV2 {

        @c("slug")
        @k
        private final String slug;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final Style style;

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        @c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfileItemsApiV13Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$UserAdvertItemRightActionV2Button$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {

            @c("primary")
            public static final Style Primary;

            @c("secondary")
            public static final Style Secondary;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Style[] f254381b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f254382c;

            static {
                Style style = new Style("Primary", 0, "primary");
                Primary = style;
                Style style2 = new Style("Secondary", 1, "secondary");
                Secondary = style2;
                Style[] styleArr = {style, style2};
                f254381b = styleArr;
                f254382c = kotlin.enums.c.a(styleArr);
            }

            private Style(String str, int i12, String str2) {
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) f254381b.clone();
            }
        }

        public UserAdvertItemRightActionV2Button(@k String str, @k Style style, @k String str2, @k DeepLink deepLink, @k String str3) {
            this.slug = str;
            this.style = style;
            this.title = str2;
            this.uri = deepLink;
            this.url = str3;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final Style getStyle() {
            return this.style;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    /* compiled from: ProfileItemsApiV13Response.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$a;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;", "", "name", "slug", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements UserAdvertItemRightActionV2 {

        @c("name")
        @k
        private final String name;

        @c("slug")
        @k
        private final String slug;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        @c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        public a(@k String str, @k String str2, @k DeepLink deepLink, @k String str3) {
            this.name = str;
            this.slug = str2;
            this.uri = deepLink;
            this.url = str3;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    /* compiled from: ProfileItemsApiV13Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2$b;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;", "", "name", "slug", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements UserAdvertItemRightActionV2 {

        @c("name")
        @k
        private final String name;

        @c("slug")
        @k
        private final String slug;

        public b(@k String str, @k String str2) {
            this.name = str;
            this.slug = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }
    }
}
