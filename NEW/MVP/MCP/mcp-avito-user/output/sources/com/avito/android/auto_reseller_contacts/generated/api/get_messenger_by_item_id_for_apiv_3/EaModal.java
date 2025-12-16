package com.avito.android.auto_reseller_contacts.generated.api.get_messenger_by_item_id_for_apiv_3;

import We.C15748A;
import We.C15749a;
import We.g;
import We.h;
import We.i;
import We.j;
import We.k;
import We.m;
import We.n;
import We.x;
import Y61.l;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\u0018\u00002\u00020\u0001:\u0002XYBÏ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b3\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\bC\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\bG\u0010/R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010#\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\bT\u0010/R\u001a\u0010$\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010U\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal;", "", "LWe/A;", "action", "LWe/a;", AdFormat.BANNER, "", "countdown", "LWe/h;", "decline", "description", "LWe/n;", "fakedoor", "LWe/i;", "legal", "", "LWe/g;", "legalV2", "", "orderId", "LWe/x;", "packages", "LWe/m;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "LWe/j;", "payment", "paymentType", "Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupType;", "popupType", "Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupTypeV2;", "popupTypeV2", "LWe/k;", "price", "LWe/l;", "remainTime", "title", ChannelContext.Item.USER_ID, "<init>", "(LWe/A;LWe/a;Ljava/lang/String;LWe/h;Ljava/lang/String;LWe/n;LWe/i;Ljava/util/List;Ljava/lang/Long;LWe/x;Ljava/util/List;LWe/j;Ljava/lang/String;Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupType;Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupTypeV2;LWe/k;LWe/l;Ljava/lang/String;J)V", "LWe/A;", "a", "()LWe/A;", "LWe/a;", "b", "()LWe/a;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LWe/h;", "getDecline", "()LWe/h;", "d", "LWe/n;", "e", "()LWe/n;", "LWe/i;", "f", "()LWe/i;", "Ljava/util/List;", "g", "()Ljava/util/List;", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "LWe/x;", "i", "()LWe/x;", "j", "LWe/j;", "getPayment", "()LWe/j;", "getPaymentType", "Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupType;", "getPopupType", "()Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupType;", "Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupTypeV2;", "k", "()Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupTypeV2;", "LWe/k;", "l", "()LWe/k;", "LWe/l;", "getRemainTime", "()LWe/l;", "m", "J", "getUserId", "()J", "PopupType", "PopupTypeV2", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EaModal {

    @c("action")
    @l
    private final C15748A action;

    @c(AdFormat.BANNER)
    @l
    private final C15749a banner;

    @c("countdown")
    @l
    private final String countdown;

    @c("decline")
    @l
    private final h decline;

    @c("description")
    @l
    private final String description;

    @c("fakedoor")
    @l
    private final n fakedoor;

    @c("legal")
    @l
    private final i legal;

    @c("legalV2")
    @l
    private final List<g> legalV2;

    @c("orderId")
    @l
    private final Long orderId;

    @c("packages")
    @l
    private final x packages;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<m> parameters;

    @c("payment")
    @l
    private final j payment;

    @c("paymentType")
    @l
    private final String paymentType;

    @c("popupType")
    @l
    private final PopupType popupType;

    @c("popupTypeV2")
    @l
    private final PopupTypeV2 popupTypeV2;

    @c("price")
    @l
    private final k price;

    @c("remainTime")
    @l
    private final We.l remainTime;

    @c("title")
    @l
    private final String title;

    @c(ChannelContext.Item.USER_ID)
    private final long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetMessengerByItemIdForApiv3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PopupPurchase", "PopupPurchaseNew", "PopupPurchasePackagesShort", "PopupPurchasePackagesLong", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PopupType {

        @c("popupPurchase")
        public static final PopupType PopupPurchase;

        @c("popupPurchaseNew")
        public static final PopupType PopupPurchaseNew;

        @c("popupPurchasePackagesLong")
        public static final PopupType PopupPurchasePackagesLong;

        @c("popupPurchasePackagesShort")
        public static final PopupType PopupPurchasePackagesShort;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PopupType[] f95786b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f95787c;

        static {
            PopupType popupType = new PopupType("PopupPurchase", 0, "popupPurchase");
            PopupPurchase = popupType;
            PopupType popupType2 = new PopupType("PopupPurchaseNew", 1, "popupPurchaseNew");
            PopupPurchaseNew = popupType2;
            PopupType popupType3 = new PopupType("PopupPurchasePackagesShort", 2, "popupPurchasePackagesShort");
            PopupPurchasePackagesShort = popupType3;
            PopupType popupType4 = new PopupType("PopupPurchasePackagesLong", 3, "popupPurchasePackagesLong");
            PopupPurchasePackagesLong = popupType4;
            PopupType[] popupTypeArr = {popupType, popupType2, popupType3, popupType4};
            f95786b = popupTypeArr;
            f95787c = kotlin.enums.c.a(popupTypeArr);
        }

        private PopupType(String str, int i12, String str2) {
        }

        public static PopupType valueOf(String str) {
            return (PopupType) Enum.valueOf(PopupType.class, str);
        }

        public static PopupType[] values() {
            return (PopupType[]) f95786b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetMessengerByItemIdForApiv3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal$PopupTypeV2;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PopupPurchase", "PopupPurchaseNew", "PopupPurchasePackagesShort", "PopupPurchasePackagesLong", "EaBundles", "SecretItems", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PopupTypeV2 {

        @c("eaBundles")
        public static final PopupTypeV2 EaBundles;

        @c("popupPurchase")
        public static final PopupTypeV2 PopupPurchase;

        @c("popupPurchaseNew")
        public static final PopupTypeV2 PopupPurchaseNew;

        @c("popupPurchasePackagesLong")
        public static final PopupTypeV2 PopupPurchasePackagesLong;

        @c("popupPurchasePackagesShort")
        public static final PopupTypeV2 PopupPurchasePackagesShort;

        @c("secretItems")
        public static final PopupTypeV2 SecretItems;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ PopupTypeV2[] f95788c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f95789d;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f95790b;

        static {
            PopupTypeV2 popupTypeV2 = new PopupTypeV2("PopupPurchase", 0, "popupPurchase");
            PopupPurchase = popupTypeV2;
            PopupTypeV2 popupTypeV22 = new PopupTypeV2("PopupPurchaseNew", 1, "popupPurchaseNew");
            PopupPurchaseNew = popupTypeV22;
            PopupTypeV2 popupTypeV23 = new PopupTypeV2("PopupPurchasePackagesShort", 2, "popupPurchasePackagesShort");
            PopupPurchasePackagesShort = popupTypeV23;
            PopupTypeV2 popupTypeV24 = new PopupTypeV2("PopupPurchasePackagesLong", 3, "popupPurchasePackagesLong");
            PopupPurchasePackagesLong = popupTypeV24;
            PopupTypeV2 popupTypeV25 = new PopupTypeV2("EaBundles", 4, "eaBundles");
            EaBundles = popupTypeV25;
            PopupTypeV2 popupTypeV26 = new PopupTypeV2("SecretItems", 5, "secretItems");
            SecretItems = popupTypeV26;
            PopupTypeV2[] popupTypeV2Arr = {popupTypeV2, popupTypeV22, popupTypeV23, popupTypeV24, popupTypeV25, popupTypeV26};
            f95788c = popupTypeV2Arr;
            f95789d = kotlin.enums.c.a(popupTypeV2Arr);
        }

        private PopupTypeV2(String str, int i12, String str2) {
            this.f95790b = str2;
        }

        public static PopupTypeV2 valueOf(String str) {
            return (PopupTypeV2) Enum.valueOf(PopupTypeV2.class, str);
        }

        public static PopupTypeV2[] values() {
            return (PopupTypeV2[]) f95788c.clone();
        }
    }

    public EaModal(@l C15748A c15748a, @l C15749a c15749a, @l String str, @l h hVar, @l String str2, @l n nVar, @l i iVar, @l List<g> list, @l Long l12, @l x xVar, @l List<m> list2, @l j jVar, @l String str3, @l PopupType popupType, @l PopupTypeV2 popupTypeV2, @l k kVar, @l We.l lVar, @l String str4, long j12) {
        this.action = c15748a;
        this.banner = c15749a;
        this.countdown = str;
        this.decline = hVar;
        this.description = str2;
        this.fakedoor = nVar;
        this.legal = iVar;
        this.legalV2 = list;
        this.orderId = l12;
        this.packages = xVar;
        this.parameters = list2;
        this.payment = jVar;
        this.paymentType = str3;
        this.popupType = popupType;
        this.popupTypeV2 = popupTypeV2;
        this.price = kVar;
        this.remainTime = lVar;
        this.title = str4;
        this.userId = j12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C15748A getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C15749a getBanner() {
        return this.banner;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getCountdown() {
        return this.countdown;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final n getFakedoor() {
        return this.fakedoor;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final i getLegal() {
        return this.legal;
    }

    @l
    public final List<g> g() {
        return this.legalV2;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Long getOrderId() {
        return this.orderId;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final x getPackages() {
        return this.packages;
    }

    @l
    public final List<m> j() {
        return this.parameters;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final PopupTypeV2 getPopupTypeV2() {
        return this.popupTypeV2;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final k getPrice() {
        return this.price;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
