package com.avito.android.remote.model.messenger.context;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChatReplyTime.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/messenger/context/ChatReplyTime$ActionType;", "actionType", "", "text", "", CrashHianalyticsData.TIME, "<init>", "(Lcom/avito/android/remote/model/messenger/context/ChatReplyTime$ActionType;Ljava/lang/String;Ljava/lang/Long;)V", "", "isActionTypeCall", "()Z", "component1", "()Lcom/avito/android/remote/model/messenger/context/ChatReplyTime$ActionType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "copy", "(Lcom/avito/android/remote/model/messenger/context/ChatReplyTime$ActionType;Ljava/lang/String;Ljava/lang/Long;)Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/context/ChatReplyTime$ActionType;", "getActionType", "Ljava/lang/String;", "getText", "Ljava/lang/Long;", "getTime", "Companion", "ActionType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ChatReplyTime implements Parcelable {

    @k
    private final ActionType actionType;

    @k
    private final String text;

    @l
    private final Long time;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<ChatReplyTime> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatReplyTime.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChatReplyTime$ActionType;", "", "Landroid/os/Parcelable;", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "CALL", "DEFAULT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ActionType implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @k
        public static final Parcelable.Creator<ActionType> CREATOR;

        @k
        private final String key;
        public static final ActionType CALL = new ActionType("CALL", 0, "call");
        public static final ActionType DEFAULT = new ActionType("DEFAULT", 1, "default");

        /* compiled from: ChatReplyTime.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionType createFromParcel(@k Parcel parcel) {
                return ActionType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionType[] newArray(int i12) {
                return new ActionType[i12];
            }
        }

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{CALL, DEFAULT};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = c.a(actionTypeArr$values);
            CREATOR = new Creator();
        }

        private ActionType(String str, int i12, String str2) {
            this.key = str2;
        }

        @k
        public static a<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getKey() {
            return this.key;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ChatReplyTime.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChatReplyTime$Companion;", "", "()V", "fromAssistantReplyTimePlaceholder", "Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;", ChannelContext.Item.ASSISTANT_REPLY_TIME_PLACEHOLDER, "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final ChatReplyTime fromAssistantReplyTimePlaceholder(@k String assistantReplyTimePlaceholder) {
            return new ChatReplyTime(ActionType.DEFAULT, assistantReplyTimePlaceholder, null);
        }

        private Companion() {
        }
    }

    /* compiled from: ChatReplyTime.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChatReplyTime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChatReplyTime createFromParcel(@k Parcel parcel) {
            return new ChatReplyTime(ActionType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChatReplyTime[] newArray(int i12) {
            return new ChatReplyTime[i12];
        }
    }

    public ChatReplyTime(@k ActionType actionType, @k String str, @l Long l12) {
        this.actionType = actionType;
        this.text = str;
        this.time = l12;
    }

    public static /* synthetic */ ChatReplyTime copy$default(ChatReplyTime chatReplyTime, ActionType actionType, String str, Long l12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            actionType = chatReplyTime.actionType;
        }
        if ((i12 & 2) != 0) {
            str = chatReplyTime.text;
        }
        if ((i12 & 4) != 0) {
            l12 = chatReplyTime.time;
        }
        return chatReplyTime.copy(actionType, str, l12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @k
    public final ChatReplyTime copy(@k ActionType actionType, @k String text, @l Long time) {
        return new ChatReplyTime(actionType, text, time);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatReplyTime)) {
            return false;
        }
        ChatReplyTime chatReplyTime = (ChatReplyTime) other;
        return this.actionType == chatReplyTime.actionType && L.f(this.text, chatReplyTime.text) && L.f(this.time, chatReplyTime.time);
    }

    @k
    public final ActionType getActionType() {
        return this.actionType;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iD2 = H.d(this.actionType.hashCode() * 31, 31, this.text);
        Long l12 = this.time;
        return iD2 + (l12 == null ? 0 : l12.hashCode());
    }

    public final boolean isActionTypeCall() {
        return this.actionType == ActionType.CALL;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChatReplyTime(actionType=");
        sb2.append(this.actionType);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", time=");
        return m.m(sb2, this.time, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.actionType.writeToParcel(parcel, flags);
        parcel.writeString(this.text);
        Long l12 = this.time;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
