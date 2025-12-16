package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.extended_item_message;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedItemData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData;", "", "TextFields", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExtendedItemData {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f192467a;

    /* compiled from: ExtendedItemData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields;", "Landroid/os/Parcelable;", "()V", "Content", "Text", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields$Content;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields$Text;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class TextFields implements Parcelable {
        public static final int $stable = 0;

        /* compiled from: ExtendedItemData.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields$Content;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields;", "", "type", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedGeo;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedGeo;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedGeo;", "copy", "(Ljava/lang/String;Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedGeo;)Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields$Content;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedGeo;", "getContent", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Content extends TextFields {
            public static final int $stable = 8;

            @k
            public static final Parcelable.Creator<Content> CREATOR = new a();

            @k
            private final ExtendedGeo content;

            @k
            private final String type;

            /* compiled from: ExtendedItemData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Content> {
                @Override // android.os.Parcelable.Creator
                public final Content createFromParcel(Parcel parcel) {
                    return new Content(parcel.readString(), ExtendedGeo.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Content[] newArray(int i12) {
                    return new Content[i12];
                }
            }

            public Content(@k String str, @k ExtendedGeo extendedGeo) {
                super(null);
                this.type = str;
                this.content = extendedGeo;
            }

            public static /* synthetic */ Content copy$default(Content content, String str, ExtendedGeo extendedGeo, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = content.type;
                }
                if ((i12 & 2) != 0) {
                    extendedGeo = content.content;
                }
                return content.copy(str, extendedGeo);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final ExtendedGeo getContent() {
                return this.content;
            }

            @k
            public final Content copy(@k String type, @k ExtendedGeo content) {
                return new Content(type, content);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return L.f(this.type, content.type) && L.f(this.content, content.content);
            }

            @k
            public final ExtendedGeo getContent() {
                return this.content;
            }

            @k
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                return this.content.hashCode() + (this.type.hashCode() * 31);
            }

            @k
            public String toString() {
                return "Content(type=" + this.type + ", content=" + this.content + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.type);
                this.content.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: ExtendedItemData.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields$Text;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields;", "", "type", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedItemData$TextFields$Text;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/text/AttributedText;", "getContent", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Text extends TextFields {
            public static final int $stable = 8;

            @k
            public static final Parcelable.Creator<Text> CREATOR = new a();

            @k
            private final AttributedText content;

            @k
            private final String type;

            /* compiled from: ExtendedItemData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Text> {
                @Override // android.os.Parcelable.Creator
                public final Text createFromParcel(Parcel parcel) {
                    return new Text(parcel.readString(), (AttributedText) parcel.readParcelable(Text.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Text[] newArray(int i12) {
                    return new Text[i12];
                }
            }

            public Text(@k String str, @k AttributedText attributedText) {
                super(null);
                this.type = str;
                this.content = attributedText;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, AttributedText attributedText, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = text.type;
                }
                if ((i12 & 2) != 0) {
                    attributedText = text.content;
                }
                return text.copy(str, attributedText);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final AttributedText getContent() {
                return this.content;
            }

            @k
            public final Text copy(@k String type, @k AttributedText content) {
                return new Text(type, content);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return L.f(this.type, text.type) && L.f(this.content, text.content);
            }

            @k
            public final AttributedText getContent() {
                return this.content;
            }

            @k
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                return this.content.hashCode() + (this.type.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Text(type=");
                sb2.append(this.type);
                sb2.append(", content=");
                return com.avito.android.actions_sheet.a.w(sb2, this.content, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.type);
                parcel.writeParcelable(this.content, flags);
            }
        }

        public /* synthetic */ TextFields(C42822w c42822w) {
            this();
        }

        private TextFields() {
        }
    }

    public ExtendedItemData(@k List<? extends TextFields> list) {
        this.f192467a = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.extended_item_message.ExtendedItemData$TextFields>] */
    @k
    public final List<TextFields> a() {
        return this.f192467a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtendedItemData) && L.f(this.f192467a, ((ExtendedItemData) obj).f192467a);
    }

    public final int hashCode() {
        return this.f192467a.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("ExtendedItemData(textFields="), this.f192467a, ')');
    }
}
