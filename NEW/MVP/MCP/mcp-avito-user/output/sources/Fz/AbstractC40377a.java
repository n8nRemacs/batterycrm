package fZ;

import HY.q;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.widget.chat_list_element.ChatListElement;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsSearchListItem.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LfZ/a;", "Lcom/avito/conveyor_item/a;", "<init>", "()V", "a", "b", "c", "LfZ/a$a;", "LfZ/a$b;", "LfZ/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC40377a implements com.avito.conveyor_item.a {

    /* compiled from: ChannelsSearchListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LfZ/a$a;", "LfZ/a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fZ.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11158a extends AbstractC40377a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f395912b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f395913c;

        /* renamed from: d, reason: collision with root package name */
        public final long f395914d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f395915e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f395916f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f395917g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final C11159a f395918h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final ChatListElement.c f395919i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Image f395920j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f395921k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final ChatListElement.LastMessageType f395922l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final q f395923m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final String f395924n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final String f395925o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f395926p;

        /* renamed from: q, reason: collision with root package name */
        public final long f395927q;

        /* renamed from: r, reason: collision with root package name */
        @k
        public final String f395928r;

        /* compiled from: ChannelsSearchListItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfZ/a$a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: fZ.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11159a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f395929a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f395930b;

            public C11159a(@k String str, @l String str2) {
                this.f395929a = str;
                this.f395930b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11159a)) {
                    return false;
                }
                C11159a c11159a = (C11159a) obj;
                return L.f(this.f395929a, c11159a.f395929a) && L.f(this.f395930b, c11159a.f395930b);
            }

            public final int hashCode() {
                int iHashCode = this.f395929a.hashCode() * 31;
                String str = this.f395930b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ItemInfo(title=");
                sb2.append(this.f395929a);
                sb2.append(", price=");
                return C22026a.c(sb2, this.f395930b, ')');
            }
        }

        public C11158a(@k String str, @l String str2, long j12, @k String str3, boolean z12, @k String str4, @l C11159a c11159a, @k ChatListElement.c cVar, @l Image image, boolean z13, @k ChatListElement.LastMessageType lastMessageType, @k q qVar, @l String str5, @l String str6, boolean z14) {
            super(null);
            this.f395912b = str;
            this.f395913c = str2;
            this.f395914d = j12;
            this.f395915e = str3;
            this.f395916f = z12;
            this.f395917g = str4;
            this.f395918h = c11159a;
            this.f395919i = cVar;
            this.f395920j = image;
            this.f395921k = z13;
            this.f395922l = lastMessageType;
            this.f395923m = qVar;
            this.f395924n = str5;
            this.f395925o = str6;
            this.f395926p = z14;
            this.f395927q = (Math.abs(str.hashCode()) << 31) + Math.abs(str2 != null ? str2.hashCode() : 0);
            this.f395928r = H.i(':', str, str2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11158a)) {
                return false;
            }
            C11158a c11158a = (C11158a) obj;
            return L.f(this.f395912b, c11158a.f395912b) && L.f(this.f395913c, c11158a.f395913c) && this.f395914d == c11158a.f395914d && L.f(this.f395915e, c11158a.f395915e) && this.f395916f == c11158a.f395916f && L.f(this.f395917g, c11158a.f395917g) && L.f(this.f395918h, c11158a.f395918h) && L.f(this.f395919i, c11158a.f395919i) && L.f(this.f395920j, c11158a.f395920j) && this.f395921k == c11158a.f395921k && this.f395922l == c11158a.f395922l && L.f(this.f395923m, c11158a.f395923m) && L.f(this.f395924n, c11158a.f395924n) && L.f(this.f395925o, c11158a.f395925o) && this.f395926p == c11158a.f395926p;
        }

        @Override // fZ.AbstractC40377a, TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF79432j() {
            return this.f395927q;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF163067b() {
            return this.f395928r;
        }

        public final int hashCode() {
            int iHashCode = this.f395912b.hashCode() * 31;
            String str = this.f395913c;
            int iD2 = H.d(r.i(H.d(r.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f395914d), 31, this.f395915e), 31, this.f395916f), 31, this.f395917g);
            C11159a c11159a = this.f395918h;
            int iHashCode2 = (this.f395919i.hashCode() + ((iD2 + (c11159a == null ? 0 : c11159a.hashCode())) * 31)) * 31;
            Image image = this.f395920j;
            int iHashCode3 = (this.f395923m.hashCode() + ((this.f395922l.hashCode() + r.i((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f395921k)) * 31)) * 31;
            String str2 = this.f395924n;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f395925o;
            return Boolean.hashCode(this.f395926p) + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Channel(channelId=");
            sb2.append(this.f395912b);
            sb2.append(", messageId=");
            sb2.append(this.f395913c);
            sb2.append(", timestamp=");
            sb2.append(this.f395914d);
            sb2.append(", dateString=");
            sb2.append(this.f395915e);
            sb2.append(", isActive=");
            sb2.append(this.f395916f);
            sb2.append(", chatTitle=");
            sb2.append(this.f395917g);
            sb2.append(", itemInfo=");
            sb2.append(this.f395918h);
            sb2.append(", featureImage=");
            sb2.append(this.f395919i);
            sb2.append(", avatar=");
            sb2.append(this.f395920j);
            sb2.append(", isRead=");
            sb2.append(this.f395921k);
            sb2.append(", lastMessageType=");
            sb2.append(this.f395922l);
            sb2.append(", lastMessage=");
            sb2.append(this.f395923m);
            sb2.append(", description=");
            sb2.append(this.f395924n);
            sb2.append(", flowId=");
            sb2.append(this.f395925o);
            sb2.append(", showAvatarPlaceholder=");
            return r.x(sb2, this.f395926p, ')');
        }
    }

    /* compiled from: ChannelsSearchListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfZ/a$b;", "LfZ/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fZ.a$b */
    public static final /* data */ class b extends AbstractC40377a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f395931b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final long f395932c = -1;

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final String f395933d = "10b88126-6529-4eab-a254-a796cc8e0ed7";

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // fZ.AbstractC40377a, TV0.a
        /* renamed from: getId */
        public final long getF79432j() {
            return f395932c;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId */
        public final String getF163067b() {
            return f395933d;
        }

        public final int hashCode() {
            return -1750326112;
        }

        @k
        public final String toString() {
            return "Pagination";
        }
    }

    /* compiled from: ChannelsSearchListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfZ/a$c;", "LfZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fZ.a$c */
    public static final /* data */ class c extends AbstractC40377a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f395934b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f395935c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f395936d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f395937e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Image f395938f;

        /* renamed from: g, reason: collision with root package name */
        public final long f395939g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f395940h;

        public c(@k String str, @l String str2, boolean z12, @k String str3, @l Image image) {
            super(null);
            this.f395934b = str;
            this.f395935c = str2;
            this.f395936d = z12;
            this.f395937e = str3;
            this.f395938f = image;
            this.f395939g = (Math.abs(str.hashCode()) << 31) + Math.abs(str2 != null ? str2.hashCode() : 0);
            this.f395940h = H.i(':', str, str2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f395934b, cVar.f395934b) && L.f(this.f395935c, cVar.f395935c) && this.f395936d == cVar.f395936d && L.f(this.f395937e, cVar.f395937e) && L.f(this.f395938f, cVar.f395938f);
        }

        @Override // fZ.AbstractC40377a, TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF79432j() {
            return this.f395939g;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF163067b() {
            return this.f395940h;
        }

        public final int hashCode() {
            int iHashCode = this.f395934b.hashCode() * 31;
            String str = this.f395935c;
            int iD2 = H.d(r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f395936d), 31, this.f395937e);
            Image image = this.f395938f;
            return iD2 + (image != null ? image.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SupportChannel(channelId=");
            sb2.append(this.f395934b);
            sb2.append(", messageId=");
            sb2.append(this.f395935c);
            sb2.append(", isRead=");
            sb2.append(this.f395936d);
            sb2.append(", supportChatTitle=");
            sb2.append(this.f395937e);
            sb2.append(", supportChatIcon=");
            return AK.c.o(sb2, this.f395938f, ')');
        }
    }

    public /* synthetic */ AbstractC40377a(C42822w c42822w) {
        this();
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF79432j() {
        return getF163067b().hashCode();
    }

    public AbstractC40377a() {
    }
}
