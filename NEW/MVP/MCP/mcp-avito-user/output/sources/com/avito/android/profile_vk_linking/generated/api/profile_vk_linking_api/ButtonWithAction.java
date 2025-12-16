package com.avito.android.profile_vk_linking.generated.api.profile_vk_linking_api;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ProfileVkLinkingApiResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction;", "", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Action;", "action", "", "title", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Type;", "type", "<init>", "(Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Action;Ljava/lang/String;Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Type;)V", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Action;", "a", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Action;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Type;", "c", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Type;", "Action", "Type", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ButtonWithAction {

    @c("action")
    @k
    private final Action action;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileVkLinkingApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Action;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Finish", "Unlink", "Link", "Next", "Reload", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        @c("finish")
        public static final Action Finish;

        @c("link")
        public static final Action Link;

        @c("next")
        public static final Action Next;

        @c("reload")
        public static final Action Reload;

        @c("unlink")
        public static final Action Unlink;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Action[] f231067b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f231068c;

        static {
            Action action = new Action("Finish", 0, "finish");
            Finish = action;
            Action action2 = new Action("Unlink", 1, "unlink");
            Unlink = action2;
            Action action3 = new Action("Link", 2, "link");
            Link = action3;
            Action action4 = new Action("Next", 3, "next");
            Next = action4;
            Action action5 = new Action("Reload", 4, "reload");
            Reload = action5;
            Action[] actionArr = {action, action2, action3, action4, action5};
            f231067b = actionArr;
            f231068c = kotlin.enums.c.a(actionArr);
        }

        private Action(String str, int i12, String str2) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f231067b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileVkLinkingApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("primary")
        public static final Type Primary;

        @c("secondary")
        public static final Type Secondary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f231069b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f231070c;

        static {
            Type type = new Type("Primary", 0, "primary");
            Primary = type;
            Type type2 = new Type("Secondary", 1, "secondary");
            Secondary = type2;
            Type[] typeArr = {type, type2};
            f231069b = typeArr;
            f231070c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f231069b.clone();
        }
    }

    public ButtonWithAction(@k Action action, @k String str, @k Type type) {
        this.action = action;
        this.title = str;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
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
