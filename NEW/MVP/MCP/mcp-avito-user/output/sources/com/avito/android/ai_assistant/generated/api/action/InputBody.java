package com.avito.android.ai_assistant.generated.api.action;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ActionRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/action/InputBody;", "", "Lcom/avito/android/ai_assistant/generated/api/action/InputBody$Action;", "action", "", "chatId", "id", "<init>", "(Lcom/avito/android/ai_assistant/generated/api/action/InputBody$Action;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/ai_assistant/generated/api/action/InputBody$Action;", "getAction", "()Lcom/avito/android/ai_assistant/generated/api/action/InputBody$Action;", "Ljava/lang/String;", "getChatId", "()Ljava/lang/String;", "getId", "Action", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputBody {

    @c("action")
    @k
    private final Action action;

    @c("chatId")
    @k
    private final String chatId;

    @c("id")
    @k
    private final String id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/action/InputBody$Action;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Like", "Unlike", "Dislike", "Undislike", "Delete", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        @c("delete")
        public static final Action Delete;

        @c("dislike")
        public static final Action Dislike;

        @c("like")
        public static final Action Like;

        @c("undislike")
        public static final Action Undislike;

        @c("unlike")
        public static final Action Unlike;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Action[] f89038b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f89039c;

        static {
            Action action = new Action("Like", 0, "like");
            Like = action;
            Action action2 = new Action("Unlike", 1, "unlike");
            Unlike = action2;
            Action action3 = new Action("Dislike", 2, "dislike");
            Dislike = action3;
            Action action4 = new Action("Undislike", 3, "undislike");
            Undislike = action4;
            Action action5 = new Action("Delete", 4, "delete");
            Delete = action5;
            Action[] actionArr = {action, action2, action3, action4, action5};
            f89038b = actionArr;
            f89039c = kotlin.enums.c.a(actionArr);
        }

        private Action(String str, int i12, String str2) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f89038b.clone();
        }
    }

    public InputBody(@k Action action, @k String str, @k String str2) {
        this.action = action;
        this.chatId = str;
        this.id = str2;
    }
}
