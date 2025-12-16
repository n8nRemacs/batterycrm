package ru.avito.messenger.generated.api.send_text_message;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import com.huawei.hms.api.FailedBinderCallBack;
import g91.C40558e;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SendTextMessageResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001:\u0002*+B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b&\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable;", "", "Lg91/e;", "call", "", FailedBinderCallBack.CALLER_ID, "Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Direction;", "direction", "", "duration", "", "isVideo", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Status;", "status", "subTitle", "text", "title", "version", "<init>", "(Lg91/e;Ljava/lang/String;Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Direction;Ljava/lang/Long;Ljava/lang/Boolean;Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lg91/e;", "a", "()Lg91/e;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Direction;", "c", "()Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Direction;", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Status;", "e", "()Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Status;", "f", "g", "h", "getVersion", "Direction", "Status", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageBodyAppCallNullable {

    @c("call")
    @l
    private final C40558e call;

    @c(FailedBinderCallBack.CALLER_ID)
    @k
    private final String callId;

    @c("direction")
    @k
    private final Direction direction;

    @c("duration")
    @l
    private final Long duration;

    @c("isVideo")
    @l
    private final Boolean isVideo;

    @c("status")
    @k
    private final Status status;

    @c("subTitle")
    @k
    private final String subTitle;

    @c("text")
    @k
    private final String text;

    @c("title")
    @k
    private final String title;

    @c("version")
    @k
    private final String version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SendTextMessageResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Direction;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "In", "Out", "None", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {

        /* renamed from: In, reason: collision with root package name */
        @c("in")
        public static final Direction f431151In;

        @c("none")
        public static final Direction None;

        @c("out")
        public static final Direction Out;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f431152b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f431153c;

        static {
            Direction direction = new Direction("In", 0, "in");
            f431151In = direction;
            Direction direction2 = new Direction("Out", 1, "out");
            Out = direction2;
            Direction direction3 = new Direction("None", 2, "none");
            None = direction3;
            Direction[] directionArr = {direction, direction2, direction3};
            f431152b = directionArr;
            f431153c = kotlin.enums.c.a(directionArr);
        }

        private Direction(String str, int i12, String str2) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f431152b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SendTextMessageResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unknown", "Success", "Missed", "Cancelled", "Rejected", "RejectedByNoMicAccess", "Busy", "NotDelivered", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("busy")
        public static final Status Busy;

        @c("cancelled")
        public static final Status Cancelled;

        @c("missed")
        public static final Status Missed;

        @c("not_delivered")
        public static final Status NotDelivered;

        @c("rejected")
        public static final Status Rejected;

        @c("rejected_by_no_mic_access")
        public static final Status RejectedByNoMicAccess;

        @c("success")
        public static final Status Success;

        @c("unknown")
        public static final Status Unknown;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f431154b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f431155c;

        static {
            Status status = new Status("Unknown", 0, "unknown");
            Unknown = status;
            Status status2 = new Status("Success", 1, "success");
            Success = status2;
            Status status3 = new Status("Missed", 2, "missed");
            Missed = status3;
            Status status4 = new Status("Cancelled", 3, "cancelled");
            Cancelled = status4;
            Status status5 = new Status("Rejected", 4, "rejected");
            Rejected = status5;
            Status status6 = new Status("RejectedByNoMicAccess", 5, "rejected_by_no_mic_access");
            RejectedByNoMicAccess = status6;
            Status status7 = new Status("Busy", 6, "busy");
            Busy = status7;
            Status status8 = new Status("NotDelivered", 7, "not_delivered");
            NotDelivered = status8;
            Status[] statusArr = {status, status2, status3, status4, status5, status6, status7, status8};
            f431154b = statusArr;
            f431155c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f431154b.clone();
        }
    }

    public MessageBodyAppCallNullable(@l C40558e c40558e, @k String str, @k Direction direction, @l Long l12, @l Boolean bool, @k Status status, @k String str2, @k String str3, @k String str4, @k String str5) {
        this.call = c40558e;
        this.callId = str;
        this.direction = direction;
        this.duration = l12;
        this.isVideo = bool;
        this.status = status;
        this.subTitle = str2;
        this.text = str3;
        this.title = str4;
        this.version = str5;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C40558e getCall() {
        return this.call;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean getIsVideo() {
        return this.isVideo;
    }
}
