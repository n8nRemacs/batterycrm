package ru.avito.messenger.generated.api.get_user_visible_messages;

import Y61.k;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/MessageBodyCompositeNullable;", "", "", "Lru/avito/messenger/generated/api/get_user_visible_messages/Chunk;", MessageBody.SystemMessageBody.Platform.CHUNKS, "", "flowName", "Lru/avito/messenger/generated/api/get_user_visible_messages/MessageBodyCompositeNullable$FlowType;", "flowType", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/avito/messenger/generated/api/get_user_visible_messages/MessageBodyCompositeNullable$FlowType;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lru/avito/messenger/generated/api/get_user_visible_messages/MessageBodyCompositeNullable$FlowType;", "getFlowType", "()Lru/avito/messenger/generated/api/get_user_visible_messages/MessageBodyCompositeNullable$FlowType;", "c", "FlowType", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageBodyCompositeNullable {

    @c(MessageBody.SystemMessageBody.Platform.CHUNKS)
    @k
    private final List<Chunk> chunks;

    @c("flowName")
    @k
    private final String flowName;

    @c("flowType")
    @k
    private final FlowType flowType;

    @c("text")
    @k
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetUserVisibleMessagesResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/MessageBodyCompositeNullable$FlowType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FlowType {

        @c("0")
        public static final FlowType Int0;

        @c("1")
        public static final FlowType Int1;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ FlowType[] f431082b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f431083c;

        static {
            FlowType flowType = new FlowType("Int0", 0, 0);
            Int0 = flowType;
            FlowType flowType2 = new FlowType("Int1", 1, 1);
            Int1 = flowType2;
            FlowType[] flowTypeArr = {flowType, flowType2};
            f431082b = flowTypeArr;
            f431083c = kotlin.enums.c.a(flowTypeArr);
        }

        private FlowType(String str, int i12, int i13) {
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) f431082b.clone();
        }
    }

    public MessageBodyCompositeNullable(@k List<Chunk> list, @k String str, @k FlowType flowType, @k String str2) {
        this.chunks = list;
        this.flowName = str;
        this.flowType = flowType;
        this.text = str2;
    }

    @k
    public final List<Chunk> a() {
        return this.chunks;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getFlowName() {
        return this.flowName;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
