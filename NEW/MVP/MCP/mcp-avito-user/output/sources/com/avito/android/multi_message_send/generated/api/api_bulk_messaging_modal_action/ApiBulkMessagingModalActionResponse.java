package com.avito.android.multi_message_send.generated.api.api_bulk_messaging_modal_action;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiBulkMessagingModalActionResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/multi_message_send/generated/api/api_bulk_messaging_modal_action/ApiBulkMessagingModalActionResponse;", "", "Lcom/avito/android/multi_message_send/generated/api/api_bulk_messaging_modal_action/ApiBulkMessagingModalActionResponse$ActionType;", "actionType", "", "success", "<init>", "(Lcom/avito/android/multi_message_send/generated/api/api_bulk_messaging_modal_action/ApiBulkMessagingModalActionResponse$ActionType;Z)V", "Lcom/avito/android/multi_message_send/generated/api/api_bulk_messaging_modal_action/ApiBulkMessagingModalActionResponse$ActionType;", "getActionType", "()Lcom/avito/android/multi_message_send/generated/api/api_bulk_messaging_modal_action/ApiBulkMessagingModalActionResponse$ActionType;", "Z", "a", "()Z", "ActionType", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApiBulkMessagingModalActionResponse {

    @c("actionType")
    @k
    private final ActionType actionType;

    @c("success")
    private final boolean success;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiBulkMessagingModalActionResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/multi_message_send/generated/api/api_bulk_messaging_modal_action/ApiBulkMessagingModalActionResponse$ActionType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "IncrementSend", "CheckSend", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        @c("check_send")
        public static final ActionType CheckSend;

        @c("increment_send")
        public static final ActionType IncrementSend;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f206733b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f206734c;

        static {
            ActionType actionType = new ActionType("IncrementSend", 0, "increment_send");
            IncrementSend = actionType;
            ActionType actionType2 = new ActionType("CheckSend", 1, "check_send");
            CheckSend = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f206733b = actionTypeArr;
            f206734c = kotlin.enums.c.a(actionTypeArr);
        }

        private ActionType(String str, int i12, String str2) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f206733b.clone();
        }
    }

    public ApiBulkMessagingModalActionResponse(@k ActionType actionType, boolean z12) {
        this.actionType = actionType;
        this.success = z12;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }
}
