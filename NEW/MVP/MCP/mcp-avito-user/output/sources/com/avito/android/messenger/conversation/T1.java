package com.avito.android.messenger.conversation;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.extended_item_message.ExtendedItemData;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message.FileMessageData;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChannelItem.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/messenger/conversation/T1;", "Lcom/avito/conveyor_item/a;", "a", "c", "d", "e", "f", "g", "h", "i", "Lcom/avito/android/messenger/conversation/T1$d;", "Lcom/avito/android/messenger/conversation/T1$e;", "Lcom/avito/android/messenger/conversation/T1$f;", "Lcom/avito/android/messenger/conversation/T1$g;", "Lcom/avito/android/messenger/conversation/T1$h;", "Lcom/avito/android/messenger/conversation/T1$i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface T1 extends com.avito.conveyor_item.a {

    /* renamed from: S1, reason: collision with root package name */
    @Y61.k
    public static final a f189145S1 = a.f189146a;

    /* compiled from: ChannelItem.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f189146a = new a();
    }

    /* compiled from: ChannelItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: ChannelItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f189147a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f189148b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f189149c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f189150d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f189151e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f189152f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f189153g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f189154h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f189155i;

        public c() {
            this(false, false, false, false, false, false, false, false, false, 511, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f189147a == cVar.f189147a && this.f189148b == cVar.f189148b && this.f189149c == cVar.f189149c && this.f189150d == cVar.f189150d && this.f189151e == cVar.f189151e && this.f189152f == cVar.f189152f && this.f189153g == cVar.f189153g && this.f189154h == cVar.f189154h && this.f189155i == cVar.f189155i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f189155i) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(Boolean.hashCode(this.f189147a) * 31, 31, this.f189148b), 31, this.f189149c), 31, this.f189150d), 31, this.f189151e), 31, this.f189152f), 31, this.f189153g), 31, this.f189154h);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GroupFlags(isAtUserGroupStart=");
            sb2.append(this.f189147a);
            sb2.append(", isAtUserGroupEnd=");
            sb2.append(this.f189148b);
            sb2.append(", isAtDateGroupStart=");
            sb2.append(this.f189149c);
            sb2.append(", isAtDateGroupEnd=");
            sb2.append(this.f189150d);
            sb2.append(", isAfterSystemMessage=");
            sb2.append(this.f189151e);
            sb2.append(", isBeforeSystemMessage=");
            sb2.append(this.f189152f);
            sb2.append(", isFirstNewMessage=");
            sb2.append(this.f189153g);
            sb2.append(", isLastOldMessage=");
            sb2.append(this.f189154h);
            sb2.append(", isUserNameVisible=");
            return androidx.appcompat.app.r.x(sb2, this.f189155i, ')');
        }

        public c(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22) {
            this.f189147a = z12;
            this.f189148b = z13;
            this.f189149c = z14;
            this.f189150d = z15;
            this.f189151e = z16;
            this.f189152f = z17;
            this.f189153g = z18;
            this.f189154h = z19;
            this.f189155i = z22;
        }

        public /* synthetic */ c(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? false : z15, (i12 & 16) != 0 ? false : z16, (i12 & 32) != 0 ? false : z17, (i12 & 64) != 0 ? false : z18, (i12 & 128) != 0 ? false : z19, (i12 & 256) == 0 ? z22 : false);
        }
    }

    /* compiled from: ChannelItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$e;", "Lcom/avito/android/messenger/conversation/T1;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements T1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final e f189197b = new e();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f189198c = "PaginationError";

        /* renamed from: d, reason: collision with root package name */
        public static final long f189199d = -2;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final ChannelItemContentType f189200e = ChannelItemContentType.f189040l;

        @Override // com.avito.android.messenger.conversation.T1
        @Y61.k
        /* renamed from: d */
        public final ChannelItemContentType getF189216f() {
            return f189200e;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF83915c() {
            return f189199d;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF272592b() {
            return f189198c;
        }

        public final int hashCode() {
            return 932925009;
        }

        @Y61.k
        public final String toString() {
            return "PaginationError";
        }
    }

    /* compiled from: ChannelItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$f;", "Lcom/avito/android/messenger/conversation/T1;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements T1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final f f189201b = new f();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f189202c = "PaginationInProgress";

        /* renamed from: d, reason: collision with root package name */
        public static final long f189203d = -3;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final ChannelItemContentType f189204e = ChannelItemContentType.f189041m;

        @Override // com.avito.android.messenger.conversation.T1
        @Y61.k
        /* renamed from: d */
        public final ChannelItemContentType getF189216f() {
            return f189204e;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF83915c() {
            return f189203d;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF272592b() {
            return f189202c;
        }

        public final int hashCode() {
            return 1226770377;
        }

        @Y61.k
        public final String toString() {
            return "PaginationInProgress";
        }
    }

    /* compiled from: ChannelItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$g;", "Lcom/avito/android/messenger/conversation/T1;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements T1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f189205b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f189206c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final a f189207d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ChannelItemContentType f189208e = ChannelItemContentType.f189042n;

        /* renamed from: f, reason: collision with root package name */
        public boolean f189209f;

        /* compiled from: ChannelItem.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$g$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/T1$g$a$a;", "Lcom/avito/android/messenger/conversation/T1$g$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a {

            /* compiled from: ChannelItem.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$g$a$a;", "Lcom/avito/android/messenger/conversation/T1$g$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.T1$g$a$a, reason: collision with other inner class name */
            public static final class C5575a extends a {

                /* renamed from: a, reason: collision with root package name */
                public final boolean f189210a;

                public C5575a(boolean z12) {
                    super(null);
                    this.f189210a = z12;
                }
            }

            /* compiled from: ChannelItem.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$g$a$b;", "Lcom/avito/android/messenger/conversation/T1$g$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f189211a = new b();

                public b() {
                    super(null);
                }
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public g(@Y61.k String str, @Y61.k String str2, @Y61.k a aVar) {
            this.f189205b = str;
            this.f189206c = str2;
            this.f189207d = aVar;
        }

        @Override // com.avito.android.messenger.conversation.T1
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final ChannelItemContentType getF189216f() {
            return this.f189208e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.L.f(this.f189205b, gVar.f189205b) && kotlin.jvm.internal.L.f(this.f189206c, gVar.f189206c) && kotlin.jvm.internal.L.f(this.f189207d, gVar.f189207d);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF83915c() {
            return -6L;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF272592b() {
            return "SpamActions:d2322996-ade8-11e9-a2a3-2a2ae2dbcce4";
        }

        public final int hashCode() {
            return this.f189207d.hashCode() + androidx.compose.foundation.H.d(this.f189205b.hashCode() * 31, 31, this.f189206c);
        }

        @Y61.k
        public final String toString() {
            return "SpamActions(channelId=" + this.f189205b + ", messageRemoteId=" + this.f189206c + ", state=" + this.f189207d + ')';
        }
    }

    /* compiled from: ChannelItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$i;", "Lcom/avito/android/messenger/conversation/T1;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements T1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final i f189217b = new i();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f189218c = "UnreadMessagesDivider";

        /* renamed from: d, reason: collision with root package name */
        public static final long f189219d = -1;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final ChannelItemContentType f189220e = ChannelItemContentType.f189044p;

        @Override // com.avito.android.messenger.conversation.T1
        @Y61.k
        /* renamed from: d */
        public final ChannelItemContentType getF189216f() {
            return f189220e;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF83915c() {
            return f189219d;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF272592b() {
            return f189218c;
        }

        public final int hashCode() {
            return -811908607;
        }

        @Y61.k
        public final String toString() {
            return "UnreadMessagesDivider";
        }
    }

    @Y61.k
    /* renamed from: d */
    ChannelItemContentType getF189216f();

    /* compiled from: ChannelItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$h;", "Lcom/avito/android/messenger/conversation/T1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements T1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f189212b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Image f189213c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f189214d;

        /* renamed from: e, reason: collision with root package name */
        public final long f189215e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ChannelItemContentType f189216f;

        public h(@Y61.k String str, @Y61.l Image image) {
            this.f189212b = str;
            this.f189213c = image;
            this.f189214d = "TypingIndicator:d2322996-ade8-11e9-a2a3-2a2ae2dbcce4";
            this.f189215e = -5L;
            this.f189216f = ChannelItemContentType.f189043o;
        }

        @Override // com.avito.android.messenger.conversation.T1
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final ChannelItemContentType getF189216f() {
            return this.f189216f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.L.f(this.f189212b, hVar.f189212b) && kotlin.jvm.internal.L.f(this.f189213c, hVar.f189213c);
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF83915c() {
            return this.f189215e;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF272592b() {
            return this.f189214d;
        }

        public final int hashCode() {
            int iHashCode = this.f189212b.hashCode() * 31;
            Image image = this.f189213c;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TypingIndicator(typingUserId=");
            sb2.append(this.f189212b);
            sb2.append(", avatar=");
            return AK.c.o(sb2, this.f189213c, ')');
        }

        public /* synthetic */ h(String str, Image image, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : image);
        }
    }

    /* compiled from: ChannelItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$d;", "Lcom/avito/android/messenger/conversation/T1;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements T1 {

        /* renamed from: A, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i f189156A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g f189157B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n f189158C;

        /* renamed from: D, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m f189159D;

        /* renamed from: E, reason: collision with root package name */
        @Y61.l
        public final FileMessageData f189160E;

        /* renamed from: F, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d f189161F;

        /* renamed from: G, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h f189162G;

        /* renamed from: H, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c f189163H;

        /* renamed from: I, reason: collision with root package name */
        @Y61.l
        public final ExtendedItemData f189164I;

        /* renamed from: J, reason: collision with root package name */
        @Y61.l
        public final Integer f189165J;

        /* renamed from: K, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42726C f189166K;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f189167b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final b f189168c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f189169d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f189170e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f189171f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f189172g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final MessageDeliveryStatus f189173h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f189174i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f189175j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Integer f189176k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Integer f189177l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public Image f189178m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public c f189179n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f189180o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.persistence.messenger.Q1 f189181p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final VideoInfo f189182q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final VoiceInfo f189183r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final QuoteViewData f189184s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final String f189185t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k f189186u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f189187v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f189188w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.l
        public a f189189x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.l
        public final String f189190y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public final List<com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.e> f189191z;

        /* compiled from: ChannelItem.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$d$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k f189192a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.messenger.conversation.mvi.messages.composables.other.shapes.k f189193b;

            public a(@Y61.k com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.composables.other.shapes.k kVar2) {
                this.f189192a = kVar;
                this.f189193b = kVar2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f189192a, aVar.f189192a) && kotlin.jvm.internal.L.f(this.f189193b, aVar.f189193b);
            }

            public final int hashCode() {
                return this.f189193b.hashCode() + androidx.appcompat.app.r.e(4, this.f189192a.hashCode() * 31, 31);
            }

            @Y61.k
            public final String toString() {
                return "AvatarOverlay(overlayIcon=" + this.f189192a + ", overlayIconOffsetDp=4, avatarClipShape=" + this.f189193b + ')';
            }
        }

        /* compiled from: ChannelItem.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$d$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/T1$d$b$a;", "Lcom/avito/android/messenger/conversation/T1$d$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: ChannelItem.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$d$b$a;", "Lcom/avito/android/messenger/conversation/T1$d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final MessageBody f189194a;

                public a(@Y61.k MessageBody messageBody) {
                    super(null);
                    this.f189194a = messageBody;
                }

                @Override // com.avito.android.messenger.conversation.T1.d.b
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final MessageBody getF189194a() {
                    return this.f189194a;
                }

                @Override // com.avito.android.messenger.conversation.T1.d.b
                @Y61.l
                /* renamed from: b */
                public final MessageBody.SystemMessageBody.Platform.Bubble getF189195a() {
                    return null;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f189194a, ((a) obj).f189194a);
                }

                public final int hashCode() {
                    return this.f189194a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Body(body = " + this.f189194a + ')';
                }
            }

            /* compiled from: ChannelItem.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/T1$d$b$b;", "Lcom/avito/android/messenger/conversation/T1$d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.T1$d$b$b, reason: collision with other inner class name */
            public static final /* data */ class C5574b extends b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final MessageBody.SystemMessageBody.Platform.Bubble f189195a;

                public C5574b(@Y61.k MessageBody.SystemMessageBody.Platform.Bubble bubble) {
                    super(null);
                    this.f189195a = bubble;
                }

                @Override // com.avito.android.messenger.conversation.T1.d.b
                @Y61.l
                /* renamed from: a */
                public final MessageBody getF189194a() {
                    return null;
                }

                @Override // com.avito.android.messenger.conversation.T1.d.b
                @Y61.k
                /* renamed from: b, reason: from getter */
                public final MessageBody.SystemMessageBody.Platform.Bubble getF189195a() {
                    return this.f189195a;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C5574b) && kotlin.jvm.internal.L.f(this.f189195a, ((C5574b) obj).f189195a);
                }

                public final int hashCode() {
                    return this.f189195a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Bubble(bubble = " + this.f189195a + ')';
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            @Y61.l
            /* renamed from: a */
            public abstract MessageBody getF189194a();

            @Y61.l
            /* renamed from: b */
            public abstract MessageBody.SystemMessageBody.Platform.Bubble getF189195a();

            public b() {
            }
        }

        /* compiled from: ChannelItem.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/messenger/conversation/ChannelItemContentType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<ChannelItemContentType> {
            public c() {
                super(0);
            }

            @Override // Y41.a
            public final ChannelItemContentType invoke() {
                Object next;
                T1.f189145S1.getClass();
                Iterator it = ((AbstractC42738c) ChannelItemContentType.f189047s).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ChannelItemContentType) next).a(d.this)) {
                        break;
                    }
                }
                ChannelItemContentType channelItemContentType = (ChannelItemContentType) next;
                return channelItemContentType == null ? ChannelItemContentType.f189045q : channelItemContentType;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k String str, @Y61.k b bVar, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, boolean z12, @Y61.k MessageDeliveryStatus messageDeliveryStatus, boolean z13, boolean z14, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Image image, @Y61.l c cVar, @Y61.k LocalMessage localMessage, @Y61.l com.avito.android.persistence.messenger.Q1 q12, @Y61.l VideoInfo videoInfo, @Y61.l VoiceInfo voiceInfo, @Y61.l QuoteViewData quoteViewData, @Y61.l String str5, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, boolean z15, boolean z16, @Y61.l a aVar, @Y61.l String str6, @Y61.l List<? extends com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.e> list, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVar, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g gVar, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n nVar, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar, @Y61.l FileMessageData fileMessageData, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVar, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVar, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c cVar2, @Y61.l ExtendedItemData extendedItemData, @Y61.l Integer num3) {
            this.f189167b = str;
            this.f189168c = bVar;
            this.f189169d = str2;
            this.f189170e = str3;
            this.f189171f = str4;
            this.f189172g = z12;
            this.f189173h = messageDeliveryStatus;
            this.f189174i = z13;
            this.f189175j = z14;
            this.f189176k = num;
            this.f189177l = num2;
            this.f189178m = image;
            this.f189179n = cVar;
            this.f189180o = localMessage;
            this.f189181p = q12;
            this.f189182q = videoInfo;
            this.f189183r = voiceInfo;
            this.f189184s = quoteViewData;
            this.f189185t = str5;
            this.f189186u = kVar;
            this.f189187v = z15;
            this.f189188w = z16;
            this.f189189x = aVar;
            this.f189190y = str6;
            this.f189191z = list;
            this.f189156A = iVar;
            this.f189157B = gVar;
            this.f189158C = nVar;
            this.f189159D = mVar;
            this.f189160E = fileMessageData;
            this.f189161F = dVar;
            this.f189162G = hVar;
            this.f189163H = cVar2;
            this.f189164I = extendedItemData;
            this.f189165J = num3;
            this.f189166K = C42727D.c(new c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v18, types: [com.avito.android.messenger.conversation.T1$d$b] */
        public static d a(d dVar, String str, b.C5574b c5574b, boolean z12, Image image, c cVar, LocalMessage localMessage, String str2, List list, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g gVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n nVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar, FileMessageData fileMessageData, com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVar2, com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c cVar2, ExtendedItemData extendedItemData, int i12, int i13) {
            VideoInfo videoInfo;
            String str3;
            String str4 = (i12 & 1) != 0 ? dVar.f189167b : str;
            b.C5574b c5574b2 = (i12 & 2) != 0 ? dVar.f189168c : c5574b;
            String str5 = dVar.f189169d;
            String str6 = dVar.f189170e;
            String str7 = dVar.f189171f;
            boolean z13 = (i12 & 32) != 0 ? dVar.f189172g : z12;
            MessageDeliveryStatus messageDeliveryStatus = dVar.f189173h;
            boolean z14 = dVar.f189174i;
            boolean z15 = dVar.f189175j;
            Integer num = dVar.f189176k;
            Integer num2 = dVar.f189177l;
            Image image2 = (i12 & 2048) != 0 ? dVar.f189178m : image;
            c cVar3 = (i12 & 4096) != 0 ? dVar.f189179n : cVar;
            LocalMessage localMessage2 = (i12 & 8192) != 0 ? dVar.f189180o : localMessage;
            com.avito.android.persistence.messenger.Q1 q12 = dVar.f189181p;
            VideoInfo videoInfo2 = dVar.f189182q;
            VoiceInfo voiceInfo = dVar.f189183r;
            QuoteViewData quoteViewData = dVar.f189184s;
            String str8 = dVar.f189185t;
            com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar = dVar.f189186u;
            boolean z16 = dVar.f189187v;
            boolean z17 = dVar.f189188w;
            a aVar = dVar.f189189x;
            if ((i12 & 8388608) != 0) {
                videoInfo = videoInfo2;
                str3 = dVar.f189190y;
            } else {
                videoInfo = videoInfo2;
                str3 = str2;
            }
            List list2 = (16777216 & i12) != 0 ? dVar.f189191z : list;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVar2 = (33554432 & i12) != 0 ? dVar.f189156A : iVar;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g gVar2 = (67108864 & i12) != 0 ? dVar.f189157B : gVar;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n nVar2 = (134217728 & i12) != 0 ? dVar.f189158C : nVar;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar2 = (268435456 & i12) != 0 ? dVar.f189159D : mVar;
            FileMessageData fileMessageData2 = (536870912 & i12) != 0 ? dVar.f189160E : fileMessageData;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVar3 = (1073741824 & i12) != 0 ? dVar.f189161F : dVar2;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVar2 = (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? dVar.f189162G : hVar;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c cVar4 = (i13 & 1) != 0 ? dVar.f189163H : cVar2;
            ExtendedItemData extendedItemData2 = (i13 & 2) != 0 ? dVar.f189164I : extendedItemData;
            Integer num3 = dVar.f189165J;
            dVar.getClass();
            return new d(str4, c5574b2, str5, str6, str7, z13, messageDeliveryStatus, z14, z15, num, num2, image2, cVar3, localMessage2, q12, videoInfo, voiceInfo, quoteViewData, str8, kVar, z16, z17, aVar, str3, list2, iVar2, gVar2, nVar2, mVar2, fileMessageData2, dVar3, hVar2, cVar4, extendedItemData2, num3);
        }

        @Override // com.avito.android.messenger.conversation.T1
        @Y61.k
        /* renamed from: d */
        public final ChannelItemContentType getF189216f() {
            return (ChannelItemContentType) this.f189166K.getValue();
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.L.f(this.f189167b, dVar.f189167b) && kotlin.jvm.internal.L.f(this.f189168c, dVar.f189168c) && kotlin.jvm.internal.L.f(this.f189169d, dVar.f189169d) && kotlin.jvm.internal.L.f(this.f189170e, dVar.f189170e) && kotlin.jvm.internal.L.f(this.f189171f, dVar.f189171f) && this.f189172g == dVar.f189172g && this.f189173h == dVar.f189173h && this.f189174i == dVar.f189174i && this.f189175j == dVar.f189175j && kotlin.jvm.internal.L.f(this.f189176k, dVar.f189176k) && kotlin.jvm.internal.L.f(this.f189177l, dVar.f189177l) && kotlin.jvm.internal.L.f(this.f189178m, dVar.f189178m) && kotlin.jvm.internal.L.f(this.f189179n, dVar.f189179n) && kotlin.jvm.internal.L.f(this.f189180o, dVar.f189180o) && kotlin.jvm.internal.L.f(this.f189181p, dVar.f189181p) && kotlin.jvm.internal.L.f(this.f189182q, dVar.f189182q) && kotlin.jvm.internal.L.f(this.f189183r, dVar.f189183r) && kotlin.jvm.internal.L.f(this.f189184s, dVar.f189184s) && kotlin.jvm.internal.L.f(this.f189185t, dVar.f189185t) && kotlin.jvm.internal.L.f(this.f189186u, dVar.f189186u) && this.f189187v == dVar.f189187v && this.f189188w == dVar.f189188w && kotlin.jvm.internal.L.f(this.f189189x, dVar.f189189x) && kotlin.jvm.internal.L.f(this.f189190y, dVar.f189190y) && kotlin.jvm.internal.L.f(this.f189191z, dVar.f189191z) && kotlin.jvm.internal.L.f(this.f189156A, dVar.f189156A) && kotlin.jvm.internal.L.f(this.f189157B, dVar.f189157B) && kotlin.jvm.internal.L.f(this.f189158C, dVar.f189158C) && kotlin.jvm.internal.L.f(this.f189159D, dVar.f189159D) && kotlin.jvm.internal.L.f(this.f189160E, dVar.f189160E) && kotlin.jvm.internal.L.f(this.f189161F, dVar.f189161F) && kotlin.jvm.internal.L.f(this.f189162G, dVar.f189162G) && kotlin.jvm.internal.L.f(this.f189163H, dVar.f189163H) && kotlin.jvm.internal.L.f(this.f189164I, dVar.f189164I) && kotlin.jvm.internal.L.f(this.f189165J, dVar.f189165J);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF83915c() {
            return ((4294967295L & this.f189167b.hashCode()) << 32) + (this.f189180o.getCreated() & 4294967295L);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF272592b() {
            return this.f189167b;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d((this.f189168c.hashCode() + (this.f189167b.hashCode() * 31)) * 31, 31, this.f189169d), 31, this.f189170e);
            String str = this.f189171f;
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f189173h.hashCode() + androidx.appcompat.app.r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f189172g)) * 31, 31, this.f189174i), 31, this.f189175j);
            Integer num = this.f189176k;
            int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f189177l;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Image image = this.f189178m;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            c cVar = this.f189179n;
            int iHashCode4 = (this.f189180o.hashCode() + ((iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
            com.avito.android.persistence.messenger.Q1 q12 = this.f189181p;
            int iHashCode5 = (iHashCode4 + (q12 == null ? 0 : q12.hashCode())) * 31;
            VideoInfo videoInfo = this.f189182q;
            int iHashCode6 = (iHashCode5 + (videoInfo == null ? 0 : videoInfo.hashCode())) * 31;
            VoiceInfo voiceInfo = this.f189183r;
            int iHashCode7 = (iHashCode6 + (voiceInfo == null ? 0 : voiceInfo.hashCode())) * 31;
            QuoteViewData quoteViewData = this.f189184s;
            int iHashCode8 = (iHashCode7 + (quoteViewData == null ? 0 : quoteViewData.hashCode())) * 31;
            String str2 = this.f189185t;
            int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar = this.f189186u;
            int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode9 + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f189187v), 31, this.f189188w);
            a aVar = this.f189189x;
            int iHashCode10 = (i13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str3 = this.f189190y;
            int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.e> list = this.f189191z;
            int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVar = this.f189156A;
            int iHashCode13 = (iHashCode12 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g gVar = this.f189157B;
            int iHashCode14 = (iHashCode13 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n nVar = this.f189158C;
            int iHashCode15 = (iHashCode14 + (nVar == null ? 0 : nVar.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar = this.f189159D;
            int iHashCode16 = (iHashCode15 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            FileMessageData fileMessageData = this.f189160E;
            int iHashCode17 = (iHashCode16 + (fileMessageData == null ? 0 : fileMessageData.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVar = this.f189161F;
            int iHashCode18 = (iHashCode17 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVar = this.f189162G;
            int iHashCode19 = (iHashCode18 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c cVar2 = this.f189163H;
            int iHashCode20 = (iHashCode19 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            ExtendedItemData extendedItemData = this.f189164I;
            int iHashCode21 = (iHashCode20 + (extendedItemData == null ? 0 : extendedItemData.f192467a.hashCode())) * 31;
            Integer num3 = this.f189165J;
            return iHashCode21 + (num3 != null ? num3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Message[id=" + this.f189167b + ", bodyOrBubble=" + this.f189168c + ", metaInfo=" + this.f189181p + ']';
        }

        public /* synthetic */ d(String str, b bVar, String str2, String str3, String str4, boolean z12, MessageDeliveryStatus messageDeliveryStatus, boolean z13, boolean z14, Integer num, Integer num2, Image image, c cVar, LocalMessage localMessage, com.avito.android.persistence.messenger.Q1 q12, VideoInfo videoInfo, VoiceInfo voiceInfo, QuoteViewData quoteViewData, String str5, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, boolean z15, boolean z16, a aVar, String str6, List list, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g gVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n nVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar, FileMessageData fileMessageData, com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVar, com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c cVar2, ExtendedItemData extendedItemData, Integer num3, int i12, int i13, C42822w c42822w) {
            this(str, bVar, str2, str3, str4, z12, messageDeliveryStatus, (i12 & 128) != 0 ? true : z13, (i12 & 256) != 0 ? true : z14, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : num2, (i12 & 2048) != 0 ? null : image, (i12 & 4096) != 0 ? null : cVar, localMessage, q12, (32768 & i12) != 0 ? null : videoInfo, (65536 & i12) != 0 ? null : voiceInfo, (131072 & i12) != 0 ? null : quoteViewData, (262144 & i12) != 0 ? null : str5, (524288 & i12) != 0 ? null : kVar, (1048576 & i12) != 0 ? false : z15, (2097152 & i12) != 0 ? false : z16, (4194304 & i12) != 0 ? null : aVar, (8388608 & i12) != 0 ? null : str6, (16777216 & i12) != 0 ? null : list, (33554432 & i12) != 0 ? null : iVar, (67108864 & i12) != 0 ? null : gVar, (134217728 & i12) != 0 ? null : nVar, (268435456 & i12) != 0 ? null : mVar, (536870912 & i12) != 0 ? null : fileMessageData, (1073741824 & i12) != 0 ? null : dVar, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : hVar, (i13 & 1) != 0 ? null : cVar2, (i13 & 2) != 0 ? null : extendedItemData, (i13 & 4) != 0 ? null : num3);
        }
    }
}
