package com.avito.android.ai_assistant.generated.api.action;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ActionResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/action/ActionResponse;", "", "Lcom/avito/android/ai_assistant/generated/api/action/ActionResponse$Status;", "status", "<init>", "(Lcom/avito/android/ai_assistant/generated/api/action/ActionResponse$Status;)V", "Lcom/avito/android/ai_assistant/generated/api/action/ActionResponse$Status;", "getStatus", "()Lcom/avito/android/ai_assistant/generated/api/action/ActionResponse$Status;", "Status", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionResponse {

    @c("status")
    @k
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/action/ActionResponse$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ok", "Error", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("error")
        public static final Status Error;

        /* renamed from: Ok, reason: collision with root package name */
        @c("ok")
        public static final Status f89034Ok;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f89035b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f89036c;

        static {
            Status status = new Status("Ok", 0, "ok");
            f89034Ok = status;
            Status status2 = new Status("Error", 1, "error");
            Error = status2;
            Status[] statusArr = {status, status2};
            f89035b = statusArr;
            f89036c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f89035b.clone();
        }
    }

    public ActionResponse(@k Status status) {
        this.status = status;
    }
}
