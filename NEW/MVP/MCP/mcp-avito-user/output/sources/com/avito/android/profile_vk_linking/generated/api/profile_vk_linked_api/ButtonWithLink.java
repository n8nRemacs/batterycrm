package com.avito.android.profile_vk_linking.generated.api.profile_vk_linked_api;

import Y61.k;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ProfileVkLinkedApiResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linked_api/ButtonWithLink;", "", "", "title", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linked_api/ButtonWithLink$Type;", "type", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linked_api/ButtonWithLink$Type;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linked_api/ButtonWithLink$Type;", "getType", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linked_api/ButtonWithLink$Type;", "getUrl", "Type", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ButtonWithLink {

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileVkLinkedApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linked_api/ButtonWithLink$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("primary")
        public static final Type Primary;

        @c("secondary")
        public static final Type Secondary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f231065b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f231066c;

        static {
            Type type = new Type("Primary", 0, "primary");
            Primary = type;
            Type type2 = new Type("Secondary", 1, "secondary");
            Secondary = type2;
            Type[] typeArr = {type, type2};
            f231065b = typeArr;
            f231066c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f231065b.clone();
        }
    }

    public ButtonWithLink(@k String str, @k Type type, @k String str2) {
        this.title = str;
        this.type = type;
        this.url = str2;
    }
}
