package com.avito.android.messenger.widget.chat_list_element;

import HY.q;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChatListElement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement;", "", "a", "b", "c", "ItemDeliveryStatusType", "LastMessageType", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ChatListElement {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f197463a = b.f197478a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatListElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$ItemDeliveryStatusType;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemDeliveryStatusType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ItemDeliveryStatusType[] f197464b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f197465c;

        static {
            ItemDeliveryStatusType[] itemDeliveryStatusTypeArr = {new ItemDeliveryStatusType("NEUTRAL", 0), new ItemDeliveryStatusType("POSITIVE", 1), new ItemDeliveryStatusType("NEGATIVE", 2), new ItemDeliveryStatusType("NONE", 3)};
            f197464b = itemDeliveryStatusTypeArr;
            f197465c = kotlin.enums.c.a(itemDeliveryStatusTypeArr);
        }

        public ItemDeliveryStatusType() {
            throw null;
        }

        public static ItemDeliveryStatusType valueOf(String str) {
            return (ItemDeliveryStatusType) Enum.valueOf(ItemDeliveryStatusType.class, str);
        }

        public static ItemDeliveryStatusType[] values() {
            return (ItemDeliveryStatusType[]) f197464b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatListElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$LastMessageType;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LastMessageType {

        /* renamed from: b, reason: collision with root package name */
        public static final LastMessageType f197466b;

        /* renamed from: c, reason: collision with root package name */
        public static final LastMessageType f197467c;

        /* renamed from: d, reason: collision with root package name */
        public static final LastMessageType f197468d;

        /* renamed from: e, reason: collision with root package name */
        public static final LastMessageType f197469e;

        /* renamed from: f, reason: collision with root package name */
        public static final LastMessageType f197470f;

        /* renamed from: g, reason: collision with root package name */
        public static final LastMessageType f197471g;

        /* renamed from: h, reason: collision with root package name */
        public static final LastMessageType f197472h;

        /* renamed from: i, reason: collision with root package name */
        public static final LastMessageType f197473i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ LastMessageType[] f197474j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f197475k;

        static {
            LastMessageType lastMessageType = new LastMessageType("INCOMING_UNREAD", 0);
            f197466b = lastMessageType;
            LastMessageType lastMessageType2 = new LastMessageType("INCOMING_READ", 1);
            f197467c = lastMessageType2;
            LastMessageType lastMessageType3 = new LastMessageType("OUTGOING_PENDING", 2);
            f197468d = lastMessageType3;
            LastMessageType lastMessageType4 = new LastMessageType("OUTGOING_READ", 3);
            f197469e = lastMessageType4;
            LastMessageType lastMessageType5 = new LastMessageType("OUTGOING_DELIVERED", 4);
            f197470f = lastMessageType5;
            LastMessageType lastMessageType6 = new LastMessageType("OUTGOING_ERROR", 5);
            f197471g = lastMessageType6;
            LastMessageType lastMessageType7 = new LastMessageType("DRAFT", 6);
            f197472h = lastMessageType7;
            LastMessageType lastMessageType8 = new LastMessageType("EMPTY", 7);
            f197473i = lastMessageType8;
            LastMessageType[] lastMessageTypeArr = {lastMessageType, lastMessageType2, lastMessageType3, lastMessageType4, lastMessageType5, lastMessageType6, lastMessageType7, lastMessageType8};
            f197474j = lastMessageTypeArr;
            f197475k = kotlin.enums.c.a(lastMessageTypeArr);
        }

        public LastMessageType() {
            throw null;
        }

        public static LastMessageType valueOf(String str) {
            return (LastMessageType) Enum.valueOf(LastMessageType.class, str);
        }

        public static LastMessageType[] values() {
            return (LastMessageType[]) f197474j.clone();
        }
    }

    /* compiled from: ChatListElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f197476a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LastMessageType f197477b;

        public a(boolean z12, @k LastMessageType lastMessageType) {
            this.f197476a = z12;
            this.f197477b = lastMessageType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f197476a == aVar.f197476a && this.f197477b == aVar.f197477b;
        }

        public final int hashCode() {
            return this.f197477b.hashCode() + (Boolean.hashCode(this.f197476a) * 31);
        }

        @k
        public final String toString() {
            return "ChatListElementTag(channelIsRead=" + this.f197476a + ", lastMessageType=" + this.f197477b + ')';
        }
    }

    /* compiled from: ChatListElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f197478a = new b();

        public static ChatListElement a(b bVar, View view) {
            bVar.getClass();
            return new com.avito.android.messenger.widget.chat_list_element.b(view);
        }
    }

    /* compiled from: ChatListElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$a;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$b;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$c;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: ChatListElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$a;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Image f197479a;

            public a(@l Image image) {
                super(null);
                this.f197479a = image;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f197479a, ((a) obj).f197479a);
            }

            public final int hashCode() {
                Image image = this.f197479a;
                if (image == null) {
                    return 0;
                }
                return image.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.o(new StringBuilder("Item(image="), this.f197479a, ')');
            }
        }

        /* compiled from: ChatListElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$b;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Image f197480a;

            public b(@l Image image) {
                super(null);
                this.f197480a = image;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f197480a, ((b) obj).f197480a);
            }

            public final int hashCode() {
                Image image = this.f197480a;
                if (image == null) {
                    return 0;
                }
                return image.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.o(new StringBuilder("ReDeal(image="), this.f197480a, ')');
            }
        }

        /* compiled from: ChatListElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$c;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.widget.chat_list_element.ChatListElement$c$c, reason: collision with other inner class name */
        public static final /* data */ class C5817c extends c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Image f197481a;

            public C5817c(@l Image image) {
                super(null);
                this.f197481a = image;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5817c) && L.f(this.f197481a, ((C5817c) obj).f197481a);
            }

            public final int hashCode() {
                Image image = this.f197481a;
                if (image == null) {
                    return 0;
                }
                return image.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.o(new StringBuilder("System(image="), this.f197481a, ')');
            }
        }

        /* compiled from: ChatListElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c$d;", "Lcom/avito/android/messenger/widget/chat_list_element/ChatListElement$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Image f197482a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Image f197483b;

            public d(@l Image image, @l Image image2) {
                super(null);
                this.f197482a = image;
                this.f197483b = image2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f197482a, dVar.f197482a) && L.f(this.f197483b, dVar.f197483b);
            }

            public final int hashCode() {
                Image image = this.f197482a;
                int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
                Image image2 = this.f197483b;
                return iHashCode + (image2 != null ? image2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UserToUser(userImage=");
                sb2.append(this.f197482a);
                sb2.append(", interlocutorImage=");
                return AK.c.o(sb2, this.f197483b, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    void a(boolean z12);

    void b(@k LastMessageType lastMessageType, @k q qVar);

    void b0(@l String str);

    void c(@k Y41.a<G0> aVar);

    void d(@k c cVar);

    void e(boolean z12);

    void f(@l com.avito.android.image_loader.a aVar, boolean z12);

    void g(boolean z12);

    void h(@k List<DockingBadgeItem> list);

    void i(boolean z12);

    void j(@l String str, @l String str2, @l String str3);

    void k(@l String str);

    void l(boolean z12);

    void m(@k View.OnLongClickListener onLongClickListener);

    void n(boolean z12, @k LastMessageType lastMessageType);
}
