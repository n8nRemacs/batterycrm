package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoMessageState.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class n {

    /* compiled from: VideoMessageState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f192646a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final PrintableText f192647b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f192648c;

        public a(@InterfaceC42165v @Y61.l Integer num, @Y61.l PrintableText printableText, boolean z12) {
            super(null);
            this.f192646a = num;
            this.f192647b = printableText;
            this.f192648c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f192646a, aVar.f192646a) && L.f(this.f192647b, aVar.f192647b) && this.f192648c == aVar.f192648c;
        }

        public final int hashCode() {
            Integer num = this.f192646a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            PrintableText printableText = this.f192647b;
            return Boolean.hashCode(this.f192648c) + ((iHashCode + (printableText != null ? printableText.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(iconRes=");
            sb2.append(this.f192646a);
            sb2.append(", description=");
            sb2.append(this.f192647b);
            sb2.append(", shouldBeAbleToCancel=");
            return r.x(sb2, this.f192648c, ')');
        }
    }

    /* compiled from: VideoMessageState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f192649a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1421766008;
        }

        @Y61.k
        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: VideoMessageState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends n {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f192650a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final PrintableText f192651b;

        public c(@Y61.l PrintableText printableText, boolean z12) {
            super(null);
            this.f192650a = z12;
            this.f192651b = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f192650a == cVar.f192650a && L.f(this.f192651b, cVar.f192651b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f192650a) * 31;
            PrintableText printableText = this.f192651b;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Progress(shouldShowCancelIcon=");
            sb2.append(this.f192650a);
            sb2.append(", progressDescription=");
            return AK.c.m(sb2, this.f192651b, ')');
        }
    }

    /* compiled from: VideoMessageState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n$d;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/video_message/n;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f192652a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f192653b;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f192652a, dVar.f192652a) && L.f(this.f192653b, dVar.f192653b);
        }

        public final int hashCode() {
            String str = this.f192652a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f192653b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReadyToPlay(thumbnailUrl=");
            sb2.append(this.f192652a);
            sb2.append(", duration=");
            return C22026a.c(sb2, this.f192653b, ')');
        }

        public /* synthetic */ d(String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
        }

        public d(@Y61.l String str, @Y61.l String str2) {
            super(null);
            this.f192652a = str;
            this.f192653b = str2;
        }
    }

    public /* synthetic */ n(C42822w c42822w) {
        this();
    }

    public n() {
    }
}
