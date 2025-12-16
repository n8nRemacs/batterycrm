package ru.avito.messenger.generated.api.create_item_channel;

import Y61.k;
import Y61.l;
import a91.C19718Q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CreateItemChannelResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u001aB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/MenuElement;", "", "La91/Q;", "confirmation", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lru/avito/messenger/generated/api/create_item_channel/MenuElement$Icon;", "icon", "", "rawDeeplink", "title", "<init>", "(La91/Q;Lcom/avito/android/deep_linking/links/DeepLink;Lru/avito/messenger/generated/api/create_item_channel/MenuElement$Icon;Ljava/lang/String;Ljava/lang/String;)V", "La91/Q;", "a", "()La91/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lru/avito/messenger/generated/api/create_item_channel/MenuElement$Icon;", "c", "()Lru/avito/messenger/generated/api/create_item_channel/MenuElement$Icon;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "Icon", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MenuElement {

    @c("confirmation")
    @l
    private final C19718Q confirmation;

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("icon")
    @k
    private final Icon icon;

    @c("rawDeeplink")
    @l
    private final String rawDeeplink;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateItemChannelResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/MenuElement$Icon;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unknown", "Call", "BlockUser", "ReportUser", "Delete", "Review", "QuestionMark", "MarkAsUnread", "Item", "Pin", "Unpin", "Candidates", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Icon {

        @c("block_user")
        public static final Icon BlockUser;

        @c("call")
        public static final Icon Call;

        @c("candidates")
        public static final Icon Candidates;

        @c("delete")
        public static final Icon Delete;

        @c("item")
        public static final Icon Item;

        @c("mark_as_unread")
        public static final Icon MarkAsUnread;

        @c("pin")
        public static final Icon Pin;

        @c("question_mark")
        public static final Icon QuestionMark;

        @c("report_user")
        public static final Icon ReportUser;

        @c(AvatarStatus.REVIEW)
        public static final Icon Review;

        @c("unknown")
        public static final Icon Unknown;

        @c("unpin")
        public static final Icon Unpin;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Icon[] f430807c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f430808d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f430809b;

        static {
            Icon icon = new Icon("Unknown", 0, "unknown");
            Unknown = icon;
            Icon icon2 = new Icon("Call", 1, "call");
            Call = icon2;
            Icon icon3 = new Icon("BlockUser", 2, "block_user");
            BlockUser = icon3;
            Icon icon4 = new Icon("ReportUser", 3, "report_user");
            ReportUser = icon4;
            Icon icon5 = new Icon("Delete", 4, "delete");
            Delete = icon5;
            Icon icon6 = new Icon("Review", 5, AvatarStatus.REVIEW);
            Review = icon6;
            Icon icon7 = new Icon("QuestionMark", 6, "question_mark");
            QuestionMark = icon7;
            Icon icon8 = new Icon("MarkAsUnread", 7, "mark_as_unread");
            MarkAsUnread = icon8;
            Icon icon9 = new Icon("Item", 8, "item");
            Item = icon9;
            Icon icon10 = new Icon("Pin", 9, "pin");
            Pin = icon10;
            Icon icon11 = new Icon("Unpin", 10, "unpin");
            Unpin = icon11;
            Icon icon12 = new Icon("Candidates", 11, "candidates");
            Candidates = icon12;
            Icon[] iconArr = {icon, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12};
            f430807c = iconArr;
            f430808d = kotlin.enums.c.a(iconArr);
        }

        private Icon(String str, int i12, String str2) {
            this.f430809b = str2;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) f430807c.clone();
        }
    }

    public MenuElement(@l C19718Q c19718q, @k DeepLink deepLink, @k Icon icon, @l String str, @k String str2) {
        this.confirmation = c19718q;
        this.deepLink = deepLink;
        this.icon = icon;
        this.rawDeeplink = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C19718Q getConfirmation() {
        return this.confirmation;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getRawDeeplink() {
        return this.rawDeeplink;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
