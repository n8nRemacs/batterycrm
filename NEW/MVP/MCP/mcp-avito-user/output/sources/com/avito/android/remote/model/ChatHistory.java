package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChatHistory.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/ChatHistory;", "Landroid/os/Parcelable;", "", "channelId", "title", "", "Lcom/avito/android/remote/model/ChatHistory$Message;", "messages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getMessages", "()Ljava/util/List;", "Message", "MessageType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChatHistory implements Parcelable {

    @k
    public static final Parcelable.Creator<ChatHistory> CREATOR = new Creator();

    @c("channelId")
    @k
    private final String channelId;

    @c("messages")
    @k
    private final List<Message> messages;

    @c("title")
    @k
    private final String title;

    /* compiled from: ChatHistory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChatHistory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChatHistory createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Message.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ChatHistory(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChatHistory[] newArray(int i12) {
            return new ChatHistory[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatHistory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/ChatHistory$MessageType;", "", "(Ljava/lang/String;I)V", "TEXT", "ITEM", "IMAGE", "LINK", "LOCATION", "FILE", "VIDEO", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MessageType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ MessageType[] $VALUES;

        @c("text")
        public static final MessageType TEXT = new MessageType("TEXT", 0);

        @c("item")
        public static final MessageType ITEM = new MessageType("ITEM", 1);

        @c("image")
        public static final MessageType IMAGE = new MessageType("IMAGE", 2);

        @c("link")
        public static final MessageType LINK = new MessageType("LINK", 3);

        @c("location")
        public static final MessageType LOCATION = new MessageType("LOCATION", 4);

        @c("file")
        public static final MessageType FILE = new MessageType("FILE", 5);

        @c("video")
        public static final MessageType VIDEO = new MessageType("VIDEO", 6);

        private static final /* synthetic */ MessageType[] $values() {
            return new MessageType[]{TEXT, ITEM, IMAGE, LINK, LOCATION, FILE, VIDEO};
        }

        static {
            MessageType[] messageTypeArr$values = $values();
            $VALUES = messageTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(messageTypeArr$values);
        }

        private MessageType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<MessageType> getEntries() {
            return $ENTRIES;
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) $VALUES.clone();
        }
    }

    public ChatHistory(@k String str, @k String str2, @k List<Message> list) {
        this.channelId = str;
        this.title = str2;
        this.messages = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getChannelId() {
        return this.channelId;
    }

    @k
    public final List<Message> getMessages() {
        return this.messages;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.channelId);
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.messages, parcel);
        while (itJ.hasNext()) {
            ((Message) itJ.next()).writeToParcel(parcel, flags);
        }
    }

    /* compiled from: ChatHistory.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/ChatHistory$Message;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ChatHistory$MessageType;", "type", "", "text", "", "timestamp", "", "isSeller", "isRead", "<init>", "(Lcom/avito/android/remote/model/ChatHistory$MessageType;Ljava/lang/String;JZLjava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ChatHistory$MessageType;", "getType", "()Lcom/avito/android/remote/model/ChatHistory$MessageType;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "J", "getTimestamp", "()J", "Z", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Message implements Parcelable {

        @k
        public static final Parcelable.Creator<Message> CREATOR = new Creator();

        @c("isRead")
        @l
        private final Boolean isRead;

        @c("isSeller")
        private final boolean isSeller;

        @c("text")
        @k
        private final String text;

        @c("timestamp")
        private final long timestamp;

        @c("type")
        @l
        private final MessageType type;

        /* compiled from: ChatHistory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Message> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Message createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                MessageType messageTypeValueOf = parcel.readInt() == 0 ? null : MessageType.valueOf(parcel.readString());
                String string = parcel.readString();
                long j12 = parcel.readLong();
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Message(messageTypeValueOf, string, j12, z12, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Message[] newArray(int i12) {
                return new Message[i12];
            }
        }

        public Message(@l MessageType messageType, @k String str, long j12, boolean z12, @l Boolean bool) {
            this.type = messageType;
            this.text = str;
            this.timestamp = j12;
            this.isSeller = z12;
            this.isRead = bool;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @l
        public final MessageType getType() {
            return this.type;
        }

        @l
        /* renamed from: isRead, reason: from getter */
        public final Boolean getIsRead() {
            return this.isRead;
        }

        /* renamed from: isSeller, reason: from getter */
        public final boolean getIsSeller() {
            return this.isSeller;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            MessageType messageType = this.type;
            if (messageType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(messageType.name());
            }
            parcel.writeString(this.text);
            parcel.writeLong(this.timestamp);
            parcel.writeInt(this.isSeller ? 1 : 0);
            Boolean bool = this.isRead;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public /* synthetic */ Message(MessageType messageType, String str, long j12, boolean z12, Boolean bool, int i12, C42822w c42822w) {
            this(messageType, str, j12, z12, (i12 & 16) != 0 ? Boolean.FALSE : bool);
        }
    }
}
