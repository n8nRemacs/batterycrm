package com.avito.android.profile_vk_linking.generated.api.profile_vk_groups_api;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ProfileVkGroupsApiResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_groups_api/ButtonWithDeeplink;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "title", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_groups_api/ButtonWithDeeplink$Type;", "type", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_groups_api/ButtonWithDeeplink$Type;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_groups_api/ButtonWithDeeplink$Type;", "c", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_groups_api/ButtonWithDeeplink$Type;", "Type", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ButtonWithDeeplink {

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileVkGroupsApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_groups_api/ButtonWithDeeplink$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("primary")
        public static final Type Primary;

        @c("secondary")
        public static final Type Secondary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f231047b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f231048c;

        static {
            Type type = new Type("Primary", 0, "primary");
            Primary = type;
            Type type2 = new Type("Secondary", 1, "secondary");
            Secondary = type2;
            Type[] typeArr = {type, type2};
            f231047b = typeArr;
            f231048c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f231047b.clone();
        }
    }

    public ButtonWithDeeplink(@k DeepLink deepLink, @k String str, @k Type type) {
        this.deeplink = deepLink;
        this.title = str;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
