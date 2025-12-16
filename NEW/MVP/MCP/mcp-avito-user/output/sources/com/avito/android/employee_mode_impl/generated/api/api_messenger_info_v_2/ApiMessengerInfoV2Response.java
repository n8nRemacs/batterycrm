package com.avito.android.employee_mode_impl.generated.api.api_messenger_info_v_2;

import Xy.C17060a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UserTypeCode;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiMessengerInfoV2Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response;", "", "Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response$ChatsType;", "chatsType", "LXy/a;", "connect", "", "message", "<init>", "(Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response$ChatsType;LXy/a;Ljava/lang/String;)V", "Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response$ChatsType;", "a", "()Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response$ChatsType;", "LXy/a;", "b", "()LXy/a;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ChatsType", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApiMessengerInfoV2Response {

    @c("chatsType")
    @k
    private final ChatsType chatsType;

    @c("connect")
    @l
    private final C17060a connect;

    @c("message")
    @l
    private final String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiMessengerInfoV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/employee_mode_impl/generated/api/api_messenger_info_v_2/ApiMessengerInfoV2Response$ChatsType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Employee", "Company", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChatsType {

        @c(UserTypeCode.COMPANY)
        public static final ChatsType Company;

        @c("employee")
        public static final ChatsType Employee;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ChatsType[] f147359b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f147360c;

        static {
            ChatsType chatsType = new ChatsType("Employee", 0, "employee");
            Employee = chatsType;
            ChatsType chatsType2 = new ChatsType("Company", 1, UserTypeCode.COMPANY);
            Company = chatsType2;
            ChatsType[] chatsTypeArr = {chatsType, chatsType2};
            f147359b = chatsTypeArr;
            f147360c = kotlin.enums.c.a(chatsTypeArr);
        }

        private ChatsType(String str, int i12, String str2) {
        }

        public static ChatsType valueOf(String str) {
            return (ChatsType) Enum.valueOf(ChatsType.class, str);
        }

        public static ChatsType[] values() {
            return (ChatsType[]) f147359b.clone();
        }
    }

    public ApiMessengerInfoV2Response(@k ChatsType chatsType, @l C17060a c17060a, @l String str) {
        this.chatsType = chatsType;
        this.connect = c17060a;
        this.message = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final ChatsType getChatsType() {
        return this.chatsType;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C17060a getConnect() {
        return this.connect;
    }
}
