package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextChunkData.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class e {

    /* compiled from: TextChunkData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C22602e f192590a;

        public a(@Y61.k C22602e c22602e) {
            super(null);
            this.f192590a = c22602e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.e
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final C22602e getF192592a() {
            return this.f192590a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f192590a, ((a) obj).f192590a);
        }

        public final int hashCode() {
            return this.f192590a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Emoji(text=" + ((Object) this.f192590a) + ')';
        }
    }

    /* compiled from: TextChunkData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C22602e f192591a;

        public b(@Y61.k C22602e c22602e) {
            super(null);
            this.f192591a = c22602e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.e
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final C22602e getF192592a() {
            return this.f192591a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f192591a, ((b) obj).f192591a);
        }

        public final int hashCode() {
            return this.f192591a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Link(text=" + ((Object) this.f192591a) + ')';
        }
    }

    /* compiled from: TextChunkData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/text_message/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C22602e f192592a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AttributedText f192593b;

        public c(@Y61.k C22602e c22602e, @Y61.l AttributedText attributedText) {
            super(null);
            this.f192592a = c22602e;
            this.f192593b = attributedText;
        }

        @Override // com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.e
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final C22602e getF192592a() {
            return this.f192592a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f192592a, cVar.f192592a) && L.f(this.f192593b, cVar.f192593b);
        }

        public final int hashCode() {
            int iHashCode = this.f192592a.hashCode() * 31;
            AttributedText attributedText = this.f192593b;
            return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Text(text=");
            sb2.append((Object) this.f192592a);
            sb2.append(", attrText=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f192593b, ')');
        }

        public /* synthetic */ c(C22602e c22602e, AttributedText attributedText, int i12, C42822w c42822w) {
            this(c22602e, (i12 & 2) != 0 ? null : attributedText);
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract C22602e getF192592a();

    public e() {
    }
}
