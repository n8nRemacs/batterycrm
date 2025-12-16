package com.avito.android.messenger.conversation.mvi.new_messages;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: NewMessagesView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/k;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface k extends com.avito.android.mvi.e<b> {

    /* compiled from: NewMessagesView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: NewMessagesView.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b$a;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: NewMessagesView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b$a;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Boolean f193808a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f193809b;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            /* renamed from: a */
            public final int getF193814e() {
                return 0;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            @Y61.l
            /* renamed from: b */
            public final Long getF193815f() {
                return null;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            /* renamed from: c */
            public final boolean getF193812c() {
                return false;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            /* renamed from: d */
            public final int getF193813d() {
                return 0;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            @Y61.k
            /* renamed from: e, reason: from getter */
            public final MessengerUserHashInfo getF193810a() {
                return this.f193809b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f193808a, ((a) obj).f193808a);
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            @Y61.l
            /* renamed from: f, reason: from getter */
            public final Boolean getF193811b() {
                return this.f193808a;
            }

            public final int hashCode() {
                Boolean bool = this.f193808a;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C0.g(new StringBuilder("EmptyUserId(isScrolledToBottom="), this.f193808a, ')');
            }

            public a(@Y61.l Boolean bool) {
                super(null);
                this.f193808a = bool;
                MessengerUserHashInfo.f430678e.getClass();
                this.f193809b = MessengerUserHashInfo.f430679f;
            }

            public /* synthetic */ a(Boolean bool, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : bool);
            }
        }

        /* compiled from: NewMessagesView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b$b;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.new_messages.k$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5730b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f193810a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Boolean f193811b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f193812c;

            /* renamed from: d, reason: collision with root package name */
            public final int f193813d;

            /* renamed from: e, reason: collision with root package name */
            public final int f193814e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final Long f193815f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final Long f193816g;

            public /* synthetic */ C5730b(MessengerUserHashInfo messengerUserHashInfo, Boolean bool, boolean z12, int i12, int i13, Long l12, Long l13, int i14, C42822w c42822w) {
                this(messengerUserHashInfo, bool, (i14 & 4) != 0 ? false : z12, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? null : l12, (i14 & 64) != 0 ? null : l13);
            }

            public static C5730b g(C5730b c5730b, MessengerUserHashInfo messengerUserHashInfo, Boolean bool, int i12, int i13, Long l12, Long l13, int i14) {
                if ((i14 & 1) != 0) {
                    messengerUserHashInfo = c5730b.f193810a;
                }
                MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
                if ((i14 & 2) != 0) {
                    bool = c5730b.f193811b;
                }
                Boolean bool2 = bool;
                boolean z12 = (i14 & 4) != 0 ? c5730b.f193812c : true;
                if ((i14 & 8) != 0) {
                    i12 = c5730b.f193813d;
                }
                int i15 = i12;
                if ((i14 & 16) != 0) {
                    i13 = c5730b.f193814e;
                }
                int i16 = i13;
                if ((i14 & 32) != 0) {
                    l12 = c5730b.f193815f;
                }
                Long l14 = l12;
                if ((i14 & 64) != 0) {
                    l13 = c5730b.f193816g;
                }
                return new C5730b(messengerUserHashInfo2, bool2, z12, i15, i16, l14, l13);
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            /* renamed from: a, reason: from getter */
            public final int getF193814e() {
                return this.f193814e;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            @Y61.l
            /* renamed from: b, reason: from getter */
            public final Long getF193815f() {
                return this.f193815f;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            /* renamed from: c, reason: from getter */
            public final boolean getF193812c() {
                return this.f193812c;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            /* renamed from: d, reason: from getter */
            public final int getF193813d() {
                return this.f193813d;
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            @Y61.k
            /* renamed from: e, reason: from getter */
            public final MessengerUserHashInfo getF193810a() {
                return this.f193810a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5730b)) {
                    return false;
                }
                C5730b c5730b = (C5730b) obj;
                return L.f(this.f193810a, c5730b.f193810a) && L.f(this.f193811b, c5730b.f193811b) && this.f193812c == c5730b.f193812c && this.f193813d == c5730b.f193813d && this.f193814e == c5730b.f193814e && L.f(this.f193815f, c5730b.f193815f) && L.f(this.f193816g, c5730b.f193816g);
            }

            @Override // com.avito.android.messenger.conversation.mvi.new_messages.k.b
            @Y61.l
            /* renamed from: f, reason: from getter */
            public final Boolean getF193811b() {
                return this.f193811b;
            }

            public final int hashCode() {
                int iHashCode = this.f193810a.hashCode() * 31;
                Boolean bool = this.f193811b;
                int iE2 = r.e(this.f193814e, r.e(this.f193813d, r.i((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f193812c), 31), 31);
                Long l12 = this.f193815f;
                int iHashCode2 = (iE2 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Long l13 = this.f193816g;
                return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded(userInfo=");
                sb2.append(this.f193810a);
                sb2.append(", isScrolledToBottom=");
                sb2.append(this.f193811b);
                sb2.append(", initialScrollPerformed=");
                sb2.append(this.f193812c);
                sb2.append(", unreadMessageCount=");
                sb2.append(this.f193813d);
                sb2.append(", buttonLabelUnreadMessageCount=");
                sb2.append(this.f193814e);
                sb2.append(", buttonScrollPerformedLastMessageTimestamp=");
                sb2.append(this.f193815f);
                sb2.append(", lastUnreadMessageTimestamp=");
                return androidx.media3.exoplayer.analytics.m.m(sb2, this.f193816g, ')');
            }

            public C5730b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l Boolean bool, boolean z12, int i12, int i13, @Y61.l Long l12, @Y61.l Long l13) {
                super(null);
                this.f193810a = messengerUserHashInfo;
                this.f193811b = bool;
                this.f193812c = z12;
                this.f193813d = i12;
                this.f193814e = i13;
                this.f193815f = l12;
                this.f193816g = l13;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        /* renamed from: a */
        public abstract int getF193814e();

        @Y61.l
        /* renamed from: b */
        public abstract Long getF193815f();

        /* renamed from: c */
        public abstract boolean getF193812c();

        /* renamed from: d */
        public abstract int getF193813d();

        @Y61.k
        /* renamed from: e */
        public abstract MessengerUserHashInfo getF193810a();

        @Y61.l
        /* renamed from: f */
        public abstract Boolean getF193811b();

        public b() {
        }
    }
}
