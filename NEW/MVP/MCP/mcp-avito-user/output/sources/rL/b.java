package RL;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CanRecallResult.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0019\u0014B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"LRL/b;", "", "", "callAvailable", "", "cannotCallReason", "analyticsInfo", "calleeId", "LRL/b$a;", "item", "LRL/b$b;", "peer", "localUserId", "Lcom/avito/android/deep_linking/links/DeepLink;", "callbackDeeplink", "canVideoCall", "callOptionsType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LRL/b$a;LRL/b$b;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "Z", "b", "()Z", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "a", "e", "LRL/b$a;", "h", "()LRL/b$a;", "LRL/b$b;", "j", "()LRL/b$b;", "i", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "c", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    @c("analyticsInfo")
    @l
    private final String analyticsInfo;

    @c("can")
    private final boolean callAvailable;

    @c("callOptionsType")
    @l
    private final String callOptionsType;

    @c("callbackLink")
    @l
    private final DeepLink callbackDeeplink;

    @c("calleeHashId")
    @l
    private final String calleeId;

    @c("canVideoCall")
    @l
    private final Boolean canVideoCall;

    @c("reason")
    @l
    private final String cannotCallReason;

    @c("item")
    @l
    private final a item;

    @c("localUserId")
    @l
    private final String localUserId;

    @c("peer")
    @l
    private final C0954b peer;

    public b(boolean z12, @l String str, @l String str2, @l String str3, @l a aVar, @l C0954b c0954b, @l String str4, @l DeepLink deepLink, @l Boolean bool, @l String str5) {
        this.callAvailable = z12;
        this.cannotCallReason = str;
        this.analyticsInfo = str2;
        this.calleeId = str3;
        this.item = aVar;
        this.peer = c0954b;
        this.localUserId = str4;
        this.callbackDeeplink = deepLink;
        this.canVideoCall = bool;
        this.callOptionsType = str5;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAnalyticsInfo() {
        return this.analyticsInfo;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCallAvailable() {
        return this.callAvailable;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getCallOptionsType() {
        return this.callOptionsType;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DeepLink getCallbackDeeplink() {
        return this.callbackDeeplink;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getCalleeId() {
        return this.calleeId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.callAvailable == bVar.callAvailable && L.f(this.cannotCallReason, bVar.cannotCallReason) && L.f(this.analyticsInfo, bVar.analyticsInfo) && L.f(this.calleeId, bVar.calleeId) && L.f(this.item, bVar.item) && L.f(this.peer, bVar.peer) && L.f(this.localUserId, bVar.localUserId) && L.f(this.callbackDeeplink, bVar.callbackDeeplink) && L.f(this.canVideoCall, bVar.canVideoCall) && L.f(this.callOptionsType, bVar.callOptionsType);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getCanVideoCall() {
        return this.canVideoCall;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getCannotCallReason() {
        return this.cannotCallReason;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final a getItem() {
        return this.item;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.callAvailable) * 31;
        String str = this.cannotCallReason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsInfo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.calleeId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.item;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C0954b c0954b = this.peer;
        int iHashCode6 = (iHashCode5 + (c0954b == null ? 0 : c0954b.hashCode())) * 31;
        String str4 = this.localUserId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeepLink deepLink = this.callbackDeeplink;
        int iHashCode8 = (iHashCode7 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Boolean bool = this.canVideoCall;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.callOptionsType;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final C0954b getPeer() {
        return this.peer;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CanRecallResult(callAvailable=");
        sb2.append(this.callAvailable);
        sb2.append(", cannotCallReason=");
        sb2.append(this.cannotCallReason);
        sb2.append(", analyticsInfo=");
        sb2.append(this.analyticsInfo);
        sb2.append(", calleeId=");
        sb2.append(this.calleeId);
        sb2.append(", item=");
        sb2.append(this.item);
        sb2.append(", peer=");
        sb2.append(this.peer);
        sb2.append(", localUserId=");
        sb2.append(this.localUserId);
        sb2.append(", callbackDeeplink=");
        sb2.append(this.callbackDeeplink);
        sb2.append(", canVideoCall=");
        sb2.append(this.canVideoCall);
        sb2.append(", callOptionsType=");
        return C22026a.c(sb2, this.callOptionsType, ')');
    }

    /* compiled from: CanRecallResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LRL/b$b;", "", "", "peerUserId", "displayName", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RL.b$b, reason: collision with other inner class name */
    public static final class C0954b {

        @c("name")
        @l
        private final String displayName;

        @c("imagePack")
        @l
        private final Image image;

        @c("id")
        @k
        private final String peerUserId;

        public C0954b(@k String str, @l String str2, @l Image image) {
            this.peerUserId = str;
            this.displayName = str2;
            this.image = image;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getPeerUserId() {
            return this.peerUserId;
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Peer(id="), this.peerUserId, ')');
        }

        public /* synthetic */ C0954b(String str, String str2, Image image, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : image);
        }
    }

    /* compiled from: CanRecallResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LRL/b$a;", "", "", "id", "title", "price", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "c", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @c("id")
        @k
        private final String id;

        @c("imagePack")
        @l
        private final Image image;

        @c("price")
        @l
        private final String price;

        @c("title")
        @k
        private final String title;

        public a(@k String str, @k String str2, @l String str3, @l Image image) {
            this.id = str;
            this.title = str2;
            this.price = str3;
            this.image = image;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Item(id="), this.id, ')');
        }

        public /* synthetic */ a(String str, String str2, String str3, Image image, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : image);
        }
    }

    public /* synthetic */ b(boolean z12, String str, String str2, String str3, a aVar, C0954b c0954b, String str4, DeepLink deepLink, Boolean bool, String str5, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : aVar, (i12 & 32) != 0 ? null : c0954b, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : deepLink, (i12 & 256) != 0 ? Boolean.FALSE : bool, (i12 & 512) == 0 ? str5 : null);
    }
}
