package com.avito.android.messenger.channels.adapter;

import HY.q;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.messenger.widget.chat_list_element.ChatListElement;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import j.InterfaceC42150f;
import j.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListItem.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "Lcom/avito/conveyor_item/a;", "<init>", "()V", "a", "b", "c", "d", "e", "NotificationsSettingsBanner", "f", "g", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$a;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$d;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$e;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$NotificationsSettingsBanner;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$f;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ChannelsListItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final c f186778b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final List<String> f186779c = C42745f0.U("dc08f1ff-222c-4b71-9f67-31aa17079506", "d784f7e4-c140-4cad-9f67-147c1a079918");

    /* compiled from: ChannelsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$NotificationsSettingsBanner;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "Type", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotificationsSettingsBanner extends ChannelsListItem {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ChannelsListItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$NotificationsSettingsBanner$Type;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f186780b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f186781c;

            static {
                Type[] typeArr = {new Type("IMPORTANT", 0), new Type("ALL", 1)};
                f186780b = typeArr;
                f186781c = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f186780b.clone();
            }
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsSettingsBanner)) {
                return false;
            }
            ((NotificationsSettingsBanner) obj).getClass();
            return true;
        }

        @Override // com.avito.android.messenger.channels.adapter.ChannelsListItem, TV0.a
        /* renamed from: getId */
        public final long getF270912b() {
            return 0L;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId */
        public final String getF270913c() {
            return null;
        }

        public final int hashCode() {
            Integer.hashCode(0);
            Integer.hashCode(0);
            throw null;
        }

        @k
        public final String toString() {
            return "NotificationsSettingsBanner(messageId=0, actionTextId=0, type=null)";
        }
    }

    /* compiled from: ChannelsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$a;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends ChannelsListItem {

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        public final int f186782d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        public final int f186783e;

        /* renamed from: f, reason: collision with root package name */
        @X41.f
        public final int f186784f;

        /* renamed from: g, reason: collision with root package name */
        @X41.f
        public final int f186785g;

        /* renamed from: h, reason: collision with root package name */
        public final long f186786h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f186787i;

        public a(@e0 int i12, @e0 int i13, @e0 int i14, @InterfaceC42150f int i15) {
            super(null);
            this.f186782d = i12;
            this.f186783e = i13;
            this.f186784f = i14;
            this.f186785g = i15;
            this.f186786h = -5L;
            this.f186787i = "4c2f47f2-a9e5-4bf6-89f2-b442fa14eea7";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f186782d == aVar.f186782d && this.f186783e == aVar.f186783e && this.f186784f == aVar.f186784f && this.f186785g == aVar.f186785g;
        }

        @Override // com.avito.android.messenger.channels.adapter.ChannelsListItem, TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF270912b() {
            return this.f186786h;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270913c() {
            return this.f186787i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f186785g) + r.e(this.f186784f, r.e(this.f186783e, Integer.hashCode(this.f186782d) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutoRepliesBanner(messageId=");
            sb2.append(this.f186782d);
            sb2.append(", titleId=");
            sb2.append(this.f186783e);
            sb2.append(", actionTextId=");
            sb2.append(this.f186784f);
            sb2.append(", imageId=");
            return r.t(sb2, this.f186785g, ')');
        }
    }

    /* compiled from: ChannelsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends ChannelsListItem {

        /* renamed from: A, reason: collision with root package name */
        public final boolean f186788A;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f186789d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final MessengerUserHashInfo f186790e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f186791f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f186792g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final a f186793h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final ChatListElement.c f186794i;

        /* renamed from: j, reason: collision with root package name */
        public final long f186795j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final String f186796k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f186797l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final Image f186798m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f186799n;

        /* renamed from: o, reason: collision with root package name */
        @k
        public final ChatListElement.LastMessageType f186800o;

        /* renamed from: p, reason: collision with root package name */
        @k
        public final q f186801p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f186802q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f186803r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f186804s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final Long f186805t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f186806u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final String f186807v;

        /* renamed from: w, reason: collision with root package name */
        @k
        public final List<DockingBadgeItem> f186808w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public final String f186809x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f186810y;

        /* renamed from: z, reason: collision with root package name */
        @k
        public final String f186811z;

        /* compiled from: ChannelsListItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f186812a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f186813b;

            public a(@k String str, @l String str2) {
                this.f186812a = str;
                this.f186813b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f186812a, aVar.f186812a) && L.f(this.f186813b, aVar.f186813b);
            }

            public final int hashCode() {
                int iHashCode = this.f186812a.hashCode() * 31;
                String str = this.f186813b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ItemInfo(title=");
                sb2.append(this.f186812a);
                sb2.append(", price=");
                return C22026a.c(sb2, this.f186813b, ')');
            }
        }

        public b() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(String str, MessengerUserHashInfo messengerUserHashInfo, boolean z12, String str2, a aVar, ChatListElement.c cVar, long j12, String str3, boolean z13, Image image, boolean z14, ChatListElement.LastMessageType lastMessageType, q qVar, boolean z15, boolean z16, boolean z17, Long l12, boolean z18, String str4, List list, String str5, boolean z19, int i12, C42822w c42822w) {
            boolean z22 = (i12 & 131072) != 0 ? false : z18;
            List list2 = (i12 & 524288) != 0 ? C42784z0.f406748b : list;
            C42822w c42822w2 = null;
            String str6 = (i12 & 1048576) != 0 ? null : str5;
            boolean z23 = (i12 & 2097152) != 0 ? true : z19;
            super(c42822w2);
            this.f186789d = str;
            this.f186790e = messengerUserHashInfo;
            this.f186791f = z12;
            this.f186792g = str2;
            this.f186793h = aVar;
            this.f186794i = cVar;
            this.f186795j = j12;
            this.f186796k = str3;
            this.f186797l = z13;
            this.f186798m = image;
            this.f186799n = z14;
            this.f186800o = lastMessageType;
            this.f186801p = qVar;
            this.f186802q = z15;
            this.f186803r = z16;
            this.f186804s = z17;
            this.f186805t = l12;
            this.f186806u = z22;
            this.f186807v = str4;
            this.f186808w = list2;
            this.f186809x = str6;
            this.f186810y = z23;
            this.f186811z = str;
            this.f186788A = l12 != null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f186789d, bVar.f186789d) && L.f(this.f186790e, bVar.f186790e) && this.f186791f == bVar.f186791f && L.f(this.f186792g, bVar.f186792g) && L.f(this.f186793h, bVar.f186793h) && L.f(this.f186794i, bVar.f186794i) && this.f186795j == bVar.f186795j && L.f(this.f186796k, bVar.f186796k) && this.f186797l == bVar.f186797l && L.f(this.f186798m, bVar.f186798m) && this.f186799n == bVar.f186799n && this.f186800o == bVar.f186800o && L.f(this.f186801p, bVar.f186801p) && this.f186802q == bVar.f186802q && this.f186803r == bVar.f186803r && this.f186804s == bVar.f186804s && L.f(this.f186805t, bVar.f186805t) && this.f186806u == bVar.f186806u && L.f(this.f186807v, bVar.f186807v) && L.f(this.f186808w, bVar.f186808w) && L.f(this.f186809x, bVar.f186809x) && this.f186810y == bVar.f186810y;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270913c() {
            return this.f186811z;
        }

        public final int hashCode() {
            int iD2 = H.d(r.i((this.f186790e.hashCode() + (this.f186789d.hashCode() * 31)) * 31, 31, this.f186791f), 31, this.f186792g);
            a aVar = this.f186793h;
            int i12 = r.i(H.d(r.g((this.f186794i.hashCode() + ((iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.f186795j), 31, this.f186796k), 31, this.f186797l);
            Image image = this.f186798m;
            int i13 = r.i(r.i(r.i((this.f186801p.hashCode() + ((this.f186800o.hashCode() + r.i((i12 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f186799n)) * 31)) * 31, 31, this.f186802q), 31, this.f186803r), 31, this.f186804s);
            Long l12 = this.f186805t;
            int i14 = r.i((i13 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f186806u);
            String str = this.f186807v;
            int iE2 = H.e((i14 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f186808w);
            String str2 = this.f186809x;
            return Boolean.hashCode(this.f186810y) + ((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Channel(channelId=");
            sb2.append(this.f186789d);
            sb2.append(", userInfo=");
            sb2.append(this.f186790e);
            sb2.append(", isActive=");
            sb2.append(this.f186791f);
            sb2.append(", chatTitle=");
            sb2.append(this.f186792g);
            sb2.append(", itemInfo=");
            sb2.append(this.f186793h);
            sb2.append(", featureImage=");
            sb2.append(this.f186794i);
            sb2.append(", date=");
            sb2.append(this.f186795j);
            sb2.append(", dateString=");
            sb2.append(this.f186796k);
            sb2.append(", isOnline=");
            sb2.append(this.f186797l);
            sb2.append(", avatar=");
            sb2.append(this.f186798m);
            sb2.append(", isRead=");
            sb2.append(this.f186799n);
            sb2.append(", lastMessageType=");
            sb2.append(this.f186800o);
            sb2.append(", lastMessage=");
            sb2.append(this.f186801p);
            sb2.append(", isTyping=");
            sb2.append(this.f186802q);
            sb2.append(", markUnreadActionAvailable=");
            sb2.append(this.f186803r);
            sb2.append(", pinUnpinActionsAvailable=");
            sb2.append(this.f186804s);
            sb2.append(", pinOrder=");
            sb2.append(this.f186805t);
            sb2.append(", toBeDeleted=");
            sb2.append(this.f186806u);
            sb2.append(", description=");
            sb2.append(this.f186807v);
            sb2.append(", tags=");
            sb2.append(this.f186808w);
            sb2.append(", flow=");
            sb2.append(this.f186809x);
            sb2.append(", showAvatarPlaceholder=");
            return r.x(sb2, this.f186810y, ')');
        }
    }

    /* compiled from: ChannelsListItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$c;", "", "<init>", "()V", "", "AUTO_REPLIES_BANNER_ID", "Ljava/lang/String;", "IAC_PROBLEM_BANNER_ID", "NOTIFICATION_BANNER_ID", "NOTIFICATION_BANNER_SETTINGS_ID", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: ChannelsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$d;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends ChannelsListItem {

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        public final int f186814d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        public final int f186815e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final UniversalImage f186816f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f186817g;

        public d(@e0 int i12, @e0 int i13, @k UniversalImage universalImage) {
            super(null);
            this.f186814d = i12;
            this.f186815e = i13;
            this.f186816f = universalImage;
            this.f186817g = "d784f7e4-c140-4cad-9f67-147c1a079918";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f186814d == dVar.f186814d && this.f186815e == dVar.f186815e && L.f(this.f186816f, dVar.f186816f);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270913c() {
            return this.f186817g;
        }

        public final int hashCode() {
            return this.f186816f.hashCode() + r.e(this.f186815e, Integer.hashCode(this.f186814d) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IacProblemBanner(messageId=");
            sb2.append(this.f186814d);
            sb2.append(", actionTextId=");
            sb2.append(this.f186815e);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f186816f, ')');
        }
    }

    /* compiled from: ChannelsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$e;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends ChannelsListItem {

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        public final int f186818d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        public final int f186819e;

        /* renamed from: f, reason: collision with root package name */
        @X41.f
        public final int f186820f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final UniversalImage f186821g;

        /* renamed from: h, reason: collision with root package name */
        public final long f186822h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f186823i;

        public e(@e0 int i12, @e0 int i13, @InterfaceC42150f int i14, @k UniversalImage universalImage) {
            super(null);
            this.f186818d = i12;
            this.f186819e = i13;
            this.f186820f = i14;
            this.f186821g = universalImage;
            this.f186822h = -2L;
            this.f186823i = "dc08f1ff-222c-4b71-9f67-31aa17079506";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f186818d == eVar.f186818d && this.f186819e == eVar.f186819e && this.f186820f == eVar.f186820f && L.f(this.f186821g, eVar.f186821g);
        }

        @Override // com.avito.android.messenger.channels.adapter.ChannelsListItem, TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF270912b() {
            return this.f186822h;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270913c() {
            return this.f186823i;
        }

        public final int hashCode() {
            return this.f186821g.hashCode() + r.e(this.f186820f, r.e(this.f186819e, Integer.hashCode(this.f186818d) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotificationsBanner(messageId=");
            sb2.append(this.f186818d);
            sb2.append(", actionTextId=");
            sb2.append(this.f186819e);
            sb2.append(", imageId=");
            sb2.append(this.f186820f);
            sb2.append(", imageForRedesign=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f186821g, ')');
        }
    }

    /* compiled from: ChannelsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$f;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends ChannelsListItem {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final f f186824d = new f();

        /* renamed from: e, reason: collision with root package name */
        public static final long f186825e = -1;

        /* renamed from: f, reason: collision with root package name */
        @k
        public static final String f186826f = "10b88126-6529-4eab-a254-a796cc8e0ed7";

        public f() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // com.avito.android.messenger.channels.adapter.ChannelsListItem, TV0.a
        /* renamed from: getId */
        public final long getF270912b() {
            return f186825e;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId */
        public final String getF270913c() {
            return f186826f;
        }

        public final int hashCode() {
            return -92252976;
        }

        @k
        public final String toString() {
            return "Pagination";
        }
    }

    /* compiled from: ChannelsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$g;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends ChannelsListItem {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f186827d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f186828e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f186829f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Image f186830g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f186831h;

        public g(@k String str, boolean z12, @k String str2, @l Image image) {
            super(null);
            this.f186827d = str;
            this.f186828e = z12;
            this.f186829f = str2;
            this.f186830g = image;
            this.f186831h = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f186827d, gVar.f186827d) && this.f186828e == gVar.f186828e && L.f(this.f186829f, gVar.f186829f) && L.f(this.f186830g, gVar.f186830g);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270913c() {
            return this.f186831h;
        }

        public final int hashCode() {
            int iD2 = H.d(r.i(this.f186827d.hashCode() * 31, 31, this.f186828e), 31, this.f186829f);
            Image image = this.f186830g;
            return iD2 + (image == null ? 0 : image.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SupportChannel(channelId=");
            sb2.append(this.f186827d);
            sb2.append(", isRead=");
            sb2.append(this.f186828e);
            sb2.append(", supportChatTitle=");
            sb2.append(this.f186829f);
            sb2.append(", supportChatIcon=");
            return AK.c.o(sb2, this.f186830g, ')');
        }
    }

    public /* synthetic */ ChannelsListItem(C42822w c42822w) {
        this();
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF270912b() {
        return getF270913c().hashCode();
    }

    public ChannelsListItem() {
    }
}
