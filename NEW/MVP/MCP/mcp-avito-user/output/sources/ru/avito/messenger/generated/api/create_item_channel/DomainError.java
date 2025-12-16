package ru.avito.messenger.generated.api.create_item_channel;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CreateItemChannelResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/DomainError;", "", "Lru/avito/messenger/generated/api/create_item_channel/DomainError$Code;", "code", "", "message", "<init>", "(Lru/avito/messenger/generated/api/create_item_channel/DomainError$Code;Ljava/lang/String;)V", "Lru/avito/messenger/generated/api/create_item_channel/DomainError$Code;", "a", "()Lru/avito/messenger/generated/api/create_item_channel/DomainError$Code;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Code", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DomainError {

    @c("code")
    @k
    private final Code code;

    @c("message")
    @k
    private final String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateItemChannelResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/DomainError$Code;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CoreError", "Forbidden", "NotFound", "NoVerifiedPhones", "EmployeeModeEnabled", "ContactLimitExceeded", "NotAcceptable", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Code {

        @c("ContactLimitExceeded")
        public static final Code ContactLimitExceeded;

        @c("CoreError")
        public static final Code CoreError;

        @c("EmployeeModeEnabled")
        public static final Code EmployeeModeEnabled;

        @c("Forbidden")
        public static final Code Forbidden;

        @c("NoVerifiedPhones")
        public static final Code NoVerifiedPhones;

        @c("NotAcceptable")
        public static final Code NotAcceptable;

        @c("NotFound")
        public static final Code NotFound;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Code[] f430792b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430793c;

        static {
            Code code = new Code("CoreError", 0, "CoreError");
            CoreError = code;
            Code code2 = new Code("Forbidden", 1, "Forbidden");
            Forbidden = code2;
            Code code3 = new Code("NotFound", 2, "NotFound");
            NotFound = code3;
            Code code4 = new Code("NoVerifiedPhones", 3, "NoVerifiedPhones");
            NoVerifiedPhones = code4;
            Code code5 = new Code("EmployeeModeEnabled", 4, "EmployeeModeEnabled");
            EmployeeModeEnabled = code5;
            Code code6 = new Code("ContactLimitExceeded", 5, "ContactLimitExceeded");
            ContactLimitExceeded = code6;
            Code code7 = new Code("NotAcceptable", 6, "NotAcceptable");
            NotAcceptable = code7;
            Code[] codeArr = {code, code2, code3, code4, code5, code6, code7};
            f430792b = codeArr;
            f430793c = kotlin.enums.c.a(codeArr);
        }

        private Code(String str, int i12, String str2) {
        }

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) f430792b.clone();
        }
    }

    public DomainError(@k Code code, @k String str) {
        this.code = code;
        this.message = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Code getCode() {
        return this.code;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }
}
