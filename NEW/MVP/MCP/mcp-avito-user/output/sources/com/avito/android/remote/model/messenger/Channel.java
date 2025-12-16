package com.avito.android.remote.model.messenger;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Channel.kt */
@d
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b4\u00103J\u0010\u00105\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b5\u00103J\u0010\u00106\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b6\u00103J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010$J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010$J\u0010\u0010=\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bA\u0010BJè\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020\u00112\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020EHÖ\u0001¢\u0006\u0004\bL\u0010GJ \u0010Q\u001a\u00020P2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020EHÖ\u0001¢\u0006\u0004\bQ\u0010RR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bU\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bW\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\bY\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u0010,R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\b\\\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010]\u001a\u0004\b^\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010_\u001a\u0004\b`\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\b\u0012\u00103R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\b\u0013\u00103R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\b\u0014\u00103R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\b\u0015\u00103R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010b\u001a\u0004\bc\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\be\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\bf\u0010$R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010S\u001a\u0004\bg\u0010$R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010h\u001a\u0004\bi\u0010>R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010j\u001a\u0004\bk\u0010@R\u0019\u0010 \u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010l\u001a\u0004\bm\u0010B¨\u0006n"}, d2 = {"Lcom/avito/android/remote/model/messenger/Channel;", "Landroid/os/Parcelable;", "", "channelId", "type", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "lastMessage", "", "Lcom/avito/android/remote/model/User;", "users", "", "created", "updated", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "context", "Lcom/avito/android/remote/model/messenger/ReadOnlyState;", "readOnlyState", "", "isDeleted", "isRead", "isSpam", "isAnswered", "Ljava/util/SortedSet;", "tags", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS, MessageBody.SystemMessageBody.Platform.FLOW, "suspectMessageId", "Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo;", "displayInfo", "Lcom/avito/android/remote/model/messenger/InputState;", MessageBody.SystemMessageBody.Platform.INPUT_STATE, "pinOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/LocalMessage;Ljava/util/List;JJLcom/avito/android/remote/model/messenger/context/ChannelContext;Lcom/avito/android/remote/model/messenger/ReadOnlyState;ZZZZLjava/util/SortedSet;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo;Lcom/avito/android/remote/model/messenger/InputState;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "component4", "()Ljava/util/List;", "component5", "()J", "component6", "component7", "()Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "component8", "()Lcom/avito/android/remote/model/messenger/ReadOnlyState;", "component9", "()Z", "component10", "component11", "component12", "component13", "()Ljava/util/SortedSet;", "component14", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "component15", "component16", "component17", "()Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo;", "component18", "()Lcom/avito/android/remote/model/messenger/InputState;", "component19", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/LocalMessage;Ljava/util/List;JJLcom/avito/android/remote/model/messenger/context/ChannelContext;Lcom/avito/android/remote/model/messenger/ReadOnlyState;ZZZZLjava/util/SortedSet;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo;Lcom/avito/android/remote/model/messenger/InputState;Ljava/lang/Long;)Lcom/avito/android/remote/model/messenger/Channel;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getChannelId", "getType", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "getLastMessage", "Ljava/util/List;", "getUsers", "J", "getCreated", "getUpdated", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "getContext", "Lcom/avito/android/remote/model/messenger/ReadOnlyState;", "getReadOnlyState", "Z", "Ljava/util/SortedSet;", "getTags", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "getContextActions", "getFlow", "getSuspectMessageId", "Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo;", "getDisplayInfo", "Lcom/avito/android/remote/model/messenger/InputState;", "getInputState", "Ljava/lang/Long;", "getPinOrder", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Channel implements Parcelable {

    @k
    public static final Parcelable.Creator<Channel> CREATOR = new Creator();

    @k
    private final String channelId;

    @k
    private final ChannelContext context;

    @l
    private final PlatformActions contextActions;
    private final long created;

    @k
    private final ChannelDisplayInfo displayInfo;

    @l
    private final String flow;

    @l
    private final InputState inputState;
    private final boolean isAnswered;
    private final boolean isDeleted;
    private final boolean isRead;
    private final boolean isSpam;

    @l
    private final LocalMessage lastMessage;

    @l
    private final Long pinOrder;

    @l
    private final ReadOnlyState readOnlyState;

    @l
    private final String suspectMessageId;

    @k
    private final SortedSet<String> tags;

    @k
    private final String type;
    private final long updated;

    @k
    private final List<User> users;

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Channel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Channel createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            LocalMessage localMessageCreateFromParcel = parcel.readInt() == 0 ? null : LocalMessage.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(User.CREATOR, parcel, arrayList, iC2, 1);
            }
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            ChannelContext channelContext = (ChannelContext) parcel.readParcelable(Channel.class.getClassLoader());
            ReadOnlyState readOnlyStateCreateFromParcel = parcel.readInt() == 0 ? null : ReadOnlyState.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = z15;
            TreeSet treeSet = new TreeSet();
            for (int i14 = parcel.readInt(); i13 != i14; i14 = i14) {
                treeSet.add(parcel.readString());
                i13++;
            }
            return new Channel(string, string2, localMessageCreateFromParcel, arrayList, j12, j13, channelContext, readOnlyStateCreateFromParcel, z12, z13, z14, z16, treeSet, (PlatformActions) parcel.readParcelable(Channel.class.getClassLoader()), parcel.readString(), parcel.readString(), ChannelDisplayInfo.CREATOR.createFromParcel(parcel), (InputState) parcel.readParcelable(Channel.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Channel[] newArray(int i12) {
            return new Channel[i12];
        }
    }

    public Channel(@k String str, @k String str2, @l LocalMessage localMessage, @k List<User> list, long j12, long j13, @k ChannelContext channelContext, @l ReadOnlyState readOnlyState, boolean z12, boolean z13, boolean z14, boolean z15, @k SortedSet<String> sortedSet, @l PlatformActions platformActions, @l String str3, @l String str4, @k ChannelDisplayInfo channelDisplayInfo, @l InputState inputState, @l Long l12) {
        this.channelId = str;
        this.type = str2;
        this.lastMessage = localMessage;
        this.users = list;
        this.created = j12;
        this.updated = j13;
        this.context = channelContext;
        this.readOnlyState = readOnlyState;
        this.isDeleted = z12;
        this.isRead = z13;
        this.isSpam = z14;
        this.isAnswered = z15;
        this.tags = sortedSet;
        this.contextActions = platformActions;
        this.flow = str3;
        this.suspectMessageId = str4;
        this.displayInfo = channelDisplayInfo;
        this.inputState = inputState;
        this.pinOrder = l12;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsSpam() {
        return this.isSpam;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsAnswered() {
        return this.isAnswered;
    }

    @k
    public final SortedSet<String> component13() {
        return this.tags;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final PlatformActions getContextActions() {
        return this.contextActions;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final String getSuspectMessageId() {
        return this.suspectMessageId;
    }

    @k
    /* renamed from: component17, reason: from getter */
    public final ChannelDisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final InputState getInputState() {
        return this.inputState;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final Long getPinOrder() {
        return this.pinOrder;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final LocalMessage getLastMessage() {
        return this.lastMessage;
    }

    @k
    public final List<User> component4() {
        return this.users;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUpdated() {
        return this.updated;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final ChannelContext getContext() {
        return this.context;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final ReadOnlyState getReadOnlyState() {
        return this.readOnlyState;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    @k
    public final Channel copy(@k String channelId, @k String type, @l LocalMessage lastMessage, @k List<User> users, long created, long updated, @k ChannelContext context, @l ReadOnlyState readOnlyState, boolean isDeleted, boolean isRead, boolean isSpam, boolean isAnswered, @k SortedSet<String> tags, @l PlatformActions contextActions, @l String flow, @l String suspectMessageId, @k ChannelDisplayInfo displayInfo, @l InputState inputState, @l Long pinOrder) {
        return new Channel(channelId, type, lastMessage, users, created, updated, context, readOnlyState, isDeleted, isRead, isSpam, isAnswered, tags, contextActions, flow, suspectMessageId, displayInfo, inputState, pinOrder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) other;
        return L.f(this.channelId, channel.channelId) && L.f(this.type, channel.type) && L.f(this.lastMessage, channel.lastMessage) && L.f(this.users, channel.users) && this.created == channel.created && this.updated == channel.updated && L.f(this.context, channel.context) && L.f(this.readOnlyState, channel.readOnlyState) && this.isDeleted == channel.isDeleted && this.isRead == channel.isRead && this.isSpam == channel.isSpam && this.isAnswered == channel.isAnswered && L.f(this.tags, channel.tags) && L.f(this.contextActions, channel.contextActions) && L.f(this.flow, channel.flow) && L.f(this.suspectMessageId, channel.suspectMessageId) && L.f(this.displayInfo, channel.displayInfo) && L.f(this.inputState, channel.inputState) && L.f(this.pinOrder, channel.pinOrder);
    }

    @k
    public final String getChannelId() {
        return this.channelId;
    }

    @k
    public final ChannelContext getContext() {
        return this.context;
    }

    @l
    public final PlatformActions getContextActions() {
        return this.contextActions;
    }

    public final long getCreated() {
        return this.created;
    }

    @k
    public final ChannelDisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    @l
    public final String getFlow() {
        return this.flow;
    }

    @l
    public final InputState getInputState() {
        return this.inputState;
    }

    @l
    public final LocalMessage getLastMessage() {
        return this.lastMessage;
    }

    @l
    public final Long getPinOrder() {
        return this.pinOrder;
    }

    @l
    public final ReadOnlyState getReadOnlyState() {
        return this.readOnlyState;
    }

    @l
    public final String getSuspectMessageId() {
        return this.suspectMessageId;
    }

    @k
    public final SortedSet<String> getTags() {
        return this.tags;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public final long getUpdated() {
        return this.updated;
    }

    @k
    public final List<User> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int iD2 = H.d(this.channelId.hashCode() * 31, 31, this.type);
        LocalMessage localMessage = this.lastMessage;
        int iHashCode = (this.context.hashCode() + r.g(r.g(H.e((iD2 + (localMessage == null ? 0 : localMessage.hashCode())) * 31, 31, this.users), 31, this.created), 31, this.updated)) * 31;
        ReadOnlyState readOnlyState = this.readOnlyState;
        int iHashCode2 = (this.tags.hashCode() + r.i(r.i(r.i(r.i((iHashCode + (readOnlyState == null ? 0 : readOnlyState.hashCode())) * 31, 31, this.isDeleted), 31, this.isRead), 31, this.isSpam), 31, this.isAnswered)) * 31;
        PlatformActions platformActions = this.contextActions;
        int iHashCode3 = (iHashCode2 + (platformActions == null ? 0 : platformActions.hashCode())) * 31;
        String str = this.flow;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suspectMessageId;
        int iHashCode5 = (this.displayInfo.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        InputState inputState = this.inputState;
        int iHashCode6 = (iHashCode5 + (inputState == null ? 0 : inputState.hashCode())) * 31;
        Long l12 = this.pinOrder;
        return iHashCode6 + (l12 != null ? l12.hashCode() : 0);
    }

    public final boolean isAnswered() {
        return this.isAnswered;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final boolean isSpam() {
        return this.isSpam;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Channel{id=");
        sb2.append(this.channelId);
        sb2.append(", updated=");
        return r.u(sb2, this.updated, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.channelId);
        parcel.writeString(this.type);
        LocalMessage localMessage = this.lastMessage;
        if (localMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localMessage.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.users, parcel);
        while (itJ.hasNext()) {
            ((User) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeLong(this.created);
        parcel.writeLong(this.updated);
        parcel.writeParcelable(this.context, flags);
        ReadOnlyState readOnlyState = this.readOnlyState;
        if (readOnlyState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            readOnlyState.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeInt(this.isRead ? 1 : 0);
        parcel.writeInt(this.isSpam ? 1 : 0);
        parcel.writeInt(this.isAnswered ? 1 : 0);
        SortedSet<String> sortedSet = this.tags;
        parcel.writeInt(sortedSet.size());
        Iterator<String> it = sortedSet.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        parcel.writeParcelable(this.contextActions, flags);
        parcel.writeString(this.flow);
        parcel.writeString(this.suspectMessageId);
        this.displayInfo.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.inputState, flags);
        Long l12 = this.pinOrder;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
