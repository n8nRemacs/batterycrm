package com.avito.android.remote.user_adverts_actions.generated.api.api_profile_item_available_actions;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiProfileItemAvailableActionsResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItem;", "", "", "icon", "id", "title", "Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItem$Type;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItem$Type;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItem$Type;", "d", "()Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItem$Type;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Type", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PostAvailableActionsSuccessActionsItem {

    @c("icon")
    @k
    private final String icon;

    @c("id")
    @k
    private final String id;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiProfileItemAvailableActionsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Default", "Danger", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("danger")
        public static final Type Danger;

        @c("default")
        public static final Type Default;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f254386b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f254387c;

        static {
            Type type = new Type("Default", 0, "default");
            Default = type;
            Type type2 = new Type("Danger", 1, "danger");
            Danger = type2;
            Type[] typeArr = {type, type2};
            f254386b = typeArr;
            f254387c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f254386b.clone();
        }
    }

    public PostAvailableActionsSuccessActionsItem(@k String str, @k String str2, @k String str3, @k Type type, @k DeepLink deepLink) {
        this.icon = str;
        this.id = str2;
        this.title = str3;
        this.type = type;
        this.uri = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
