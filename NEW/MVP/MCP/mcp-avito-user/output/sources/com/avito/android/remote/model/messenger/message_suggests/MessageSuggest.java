package com.avito.android.remote.model.messenger.message_suggests;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessageSuggest.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002)*B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggest;", "Landroid/os/Parcelable;", "", "id", "", "previewText", "messageText", "Lcom/avito/android/remote/model/RawJson;", "intent", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/RawJson;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/RawJson;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/RawJson;)Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggest;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getPreviewText", "getMessageText", "Lcom/avito/android/remote/model/RawJson;", "getIntent", "Companion", "Intent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MessageSuggest implements Parcelable {

    /* renamed from: ID, reason: collision with root package name */
    @k
    public static final String f253881ID = "id";

    @k
    public static final String INTENT = "intent";

    @k
    public static final String MESSAGE_ID = "message_id";

    @k
    public static final String PREVIEW = "preview";

    @k
    public static final String TEXT = "text";

    @c("id")
    private final int id;

    @c("intent")
    @l
    private final RawJson intent;

    @c("text")
    @k
    private final String messageText;

    @c(PREVIEW)
    @k
    private final String previewText;

    @k
    public static final Parcelable.Creator<MessageSuggest> CREATOR = new Creator();

    /* compiled from: MessageSuggest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageSuggest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MessageSuggest createFromParcel(@k Parcel parcel) {
            return new MessageSuggest(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RawJson.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MessageSuggest[] newArray(int i12) {
            return new MessageSuggest[i12];
        }
    }

    /* compiled from: MessageSuggest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggest$Intent;", "", "intent", "", PlatformActions.MESSAGE_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getIntent", "()Ljava/lang/String;", "getMessageId", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Intent {

        @c("id")
        @l
        private final String intent;

        @c(MessageSuggest.MESSAGE_ID)
        @l
        private final String messageId;

        public Intent(@l String str, @l String str2) {
            this.intent = str;
            this.messageId = str2;
        }

        public static /* synthetic */ Intent copy$default(Intent intent, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = intent.intent;
            }
            if ((i12 & 2) != 0) {
                str2 = intent.messageId;
            }
            return intent.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getIntent() {
            return this.intent;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        @k
        public final Intent copy(@l String intent, @l String messageId) {
            return new Intent(intent, messageId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Intent)) {
                return false;
            }
            Intent intent = (Intent) other;
            return L.f(this.intent, intent.intent) && L.f(this.messageId, intent.messageId);
        }

        @l
        public final String getIntent() {
            return this.intent;
        }

        @l
        public final String getMessageId() {
            return this.messageId;
        }

        public int hashCode() {
            String str = this.intent;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.messageId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Intent(intent=");
            sb2.append(this.intent);
            sb2.append(", messageId=");
            return C22026a.c(sb2, this.messageId, ')');
        }
    }

    public MessageSuggest(int i12, @k String str, @k String str2, @l RawJson rawJson) {
        this.id = i12;
        this.previewText = str;
        this.messageText = str2;
        this.intent = rawJson;
    }

    public static /* synthetic */ MessageSuggest copy$default(MessageSuggest messageSuggest, int i12, String str, String str2, RawJson rawJson, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = messageSuggest.id;
        }
        if ((i13 & 2) != 0) {
            str = messageSuggest.previewText;
        }
        if ((i13 & 4) != 0) {
            str2 = messageSuggest.messageText;
        }
        if ((i13 & 8) != 0) {
            rawJson = messageSuggest.intent;
        }
        return messageSuggest.copy(i12, str, str2, rawJson);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPreviewText() {
        return this.previewText;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final RawJson getIntent() {
        return this.intent;
    }

    @k
    public final MessageSuggest copy(int id2, @k String previewText, @k String messageText, @l RawJson intent) {
        return new MessageSuggest(id2, previewText, messageText, intent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSuggest)) {
            return false;
        }
        MessageSuggest messageSuggest = (MessageSuggest) other;
        return this.id == messageSuggest.id && L.f(this.previewText, messageSuggest.previewText) && L.f(this.messageText, messageSuggest.messageText) && L.f(this.intent, messageSuggest.intent);
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final RawJson getIntent() {
        return this.intent;
    }

    @k
    public final String getMessageText() {
        return this.messageText;
    }

    @k
    public final String getPreviewText() {
        return this.previewText;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(Integer.hashCode(this.id) * 31, 31, this.previewText), 31, this.messageText);
        RawJson rawJson = this.intent;
        return iD2 + (rawJson == null ? 0 : rawJson.hashCode());
    }

    @k
    public String toString() {
        return "MessageSuggest(id=" + this.id + ", previewText=" + this.previewText + ", messageText=" + this.messageText + ", intent=" + this.intent + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.previewText);
        parcel.writeString(this.messageText);
        RawJson rawJson = this.intent;
        if (rawJson == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rawJson.writeToParcel(parcel, flags);
        }
    }
}
