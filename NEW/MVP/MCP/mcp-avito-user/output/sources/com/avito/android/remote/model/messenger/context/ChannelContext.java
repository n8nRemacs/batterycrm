package com.avito.android.remote.model.messenger.context;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: ChannelContext.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0006\r\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "Lru/avito/messenger/api/entity/context/ChannelContext;", "Landroid/os/Parcelable;", "()V", ChannelContext.ATTACH_MENU, "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "getAttachMenu", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", ChannelContext.MENU, "", "Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", "getMenu", "()Ljava/util/List;", "Companion", "Item", "ReDeal", "System", "Unknown", "UserToUser", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$Item;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$ReDeal;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$System;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$Unknown;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$UserToUser;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ChannelContext implements ru.avito.messenger.api.entity.context.ChannelContext, Parcelable {

    @k
    public static final String ATTACH_MENU = "attachMenu";

    @k
    public static final String AVATAR_USER_ID = "avatarUserId";

    @k
    public static final String HEADER_TITLE_BUTTON = "headerTitleButton";

    @k
    public static final String MENU = "menu";

    @k
    public static final String SHARED_LOCATION = "sharedLocation";

    /* compiled from: ChannelContext.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0001aB§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001fJ\u0010\u00103\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b3\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b6\u00107JÆ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020:HÖ\u0001¢\u0006\u0004\bA\u0010<J \u0010F\u001a\u00020E2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020:HÖ\u0001¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bJ\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bK\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bL\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bM\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bO\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bR\u0010\u001fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010Y\u001a\u0004\bZ\u00101R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\b[\u0010\u001fR\u001a\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\b\\\u0010(R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010]\u001a\u0004\b^\u00105R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010_\u001a\u0004\b`\u00107¨\u0006b"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChannelContext$Item;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "", "id", "categoryId", "category", "title", "price", "Lcom/avito/android/remote/model/Image;", "image", "", "deleted", Item.USER_ID, "", "Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", ChannelContext.MENU, "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", ChannelContext.ATTACH_MENU, "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", ChannelContext.SHARED_LOCATION, "Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;", Item.REPLY_TIME, Item.ASSISTANT_REPLY_TIME_PLACEHOLDER, Item.HIDE_PHONE, "Lcom/avito/android/remote/model/messenger/context/Placeholder;", Item.PLACEHOLDER, "Lcom/avito/android/remote/model/messenger/context/HeaderButton;", "headerButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;ZLjava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;Ljava/lang/String;ZLcom/avito/android/remote/model/messenger/context/Placeholder;Lcom/avito/android/remote/model/messenger/context/HeaderButton;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/Image;", "component7", "()Z", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "component11", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "component12", "()Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;", "component13", "component14", "component15", "()Lcom/avito/android/remote/model/messenger/context/Placeholder;", "component16", "()Lcom/avito/android/remote/model/messenger/context/HeaderButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;ZLjava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;Ljava/lang/String;ZLcom/avito/android/remote/model/messenger/context/Placeholder;Lcom/avito/android/remote/model/messenger/context/HeaderButton;)Lcom/avito/android/remote/model/messenger/context/ChannelContext$Item;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getCategoryId", "getCategory", "getTitle", "getPrice", "Lcom/avito/android/remote/model/Image;", "getImage", "Z", "getDeleted", "getUserId", "Ljava/util/List;", "getMenu", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "getAttachMenu", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "getSharedLocation", "Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;", "getReplyTime", "getAssistantReplyTimePlaceholder", "getHidePhone", "Lcom/avito/android/remote/model/messenger/context/Placeholder;", "getPlaceholder", "Lcom/avito/android/remote/model/messenger/context/HeaderButton;", "getHeaderButton", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Item extends ChannelContext {

        @k
        public static final String ACTIONS = "actions";

        @k
        public static final String ASSISTANT_REPLY_TIME_PLACEHOLDER = "assistantReplyTimePlaceholder";

        @k
        public static final String CATEGORY = "category";

        @k
        public static final String CATEGORY_ID = "categoryId";

        @k
        public static final String DELETED = "deleted";

        @k
        public static final String HEADER_BUTTON = "headerItemButton";

        @k
        public static final String HIDE_PHONE = "hidePhone";

        /* renamed from: ID, reason: collision with root package name */
        @k
        public static final String f253873ID = "id";

        @k
        public static final String IMAGE = "image";

        @k
        public static final String PLACEHOLDER = "placeholder";

        @k
        public static final String PRICE = "priceString";

        @k
        public static final String REPLY_TIME = "replyTime";

        @k
        public static final String TITLE = "title";

        @k
        public static final String TYPE = "item";

        @k
        public static final String USER_ID = "userId";

        @c(ASSISTANT_REPLY_TIME_PLACEHOLDER)
        @l
        private final String assistantReplyTimePlaceholder;

        @c(ChannelContext.ATTACH_MENU)
        @l
        private final AttachMenu attachMenu;

        @c("category")
        @k
        private final String category;

        @c("categoryId")
        @k
        private final String categoryId;

        @c("deleted")
        private final boolean deleted;

        @c(HEADER_BUTTON)
        @l
        private final HeaderButton headerButton;

        @c(HIDE_PHONE)
        private final boolean hidePhone;

        @c("id")
        @k
        private final String id;

        @c("image")
        @l
        private final Image image;

        @c(ChannelContext.MENU)
        @k
        private final List<ChannelMenuAction> menu;

        @c(PLACEHOLDER)
        @l
        private final Placeholder placeholder;

        @c("priceString")
        @k
        private final String price;

        @c(REPLY_TIME)
        @l
        private final ChatReplyTime replyTime;

        @c(ChannelContext.SHARED_LOCATION)
        @l
        private final MessageBody.Location sharedLocation;

        @c("title")
        @k
        private final String title;

        @c(USER_ID)
        @l
        private final String userId;

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        /* compiled from: ChannelContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Image image = (Image) parcel.readParcelable(Item.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                String string6 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ChannelMenuAction.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Item(string, string2, string3, string4, string5, image, z12, string6, arrayList, parcel.readInt() == 0 ? null : AttachMenu.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessageBody.Location.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ChatReplyTime.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Placeholder.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HeaderButton.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public /* synthetic */ Item(String str, String str2, String str3, String str4, String str5, Image image, boolean z12, String str6, List list, AttachMenu attachMenu, MessageBody.Location location, ChatReplyTime chatReplyTime, String str7, boolean z13, Placeholder placeholder, HeaderButton headerButton, int i12, C42822w c42822w) {
            this(str, str2, str3, str4, str5, image, z12, str6, list, attachMenu, location, (i12 & 2048) != 0 ? null : chatReplyTime, (i12 & 4096) != 0 ? null : str7, (i12 & 8192) != 0 ? false : z13, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : placeholder, (i12 & 32768) != 0 ? null : headerButton);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final MessageBody.Location getSharedLocation() {
            return this.sharedLocation;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final ChatReplyTime getReplyTime() {
            return this.replyTime;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final String getAssistantReplyTimePlaceholder() {
            return this.assistantReplyTimePlaceholder;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getHidePhone() {
            return this.hidePhone;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final Placeholder getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final HeaderButton getHeaderButton() {
            return this.headerButton;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getCategoryId() {
            return this.categoryId;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getDeleted() {
            return this.deleted;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @k
        public final List<ChannelMenuAction> component9() {
            return this.menu;
        }

        @k
        public final Item copy(@k String id2, @k String categoryId, @k String category, @k String title, @k String price, @l Image image, boolean deleted, @l String userId, @k List<ChannelMenuAction> menu, @l AttachMenu attachMenu, @l MessageBody.Location sharedLocation, @l ChatReplyTime replyTime, @l String assistantReplyTimePlaceholder, boolean hidePhone, @l Placeholder placeholder, @l HeaderButton headerButton) {
            return new Item(id2, categoryId, category, title, price, image, deleted, userId, menu, attachMenu, sharedLocation, replyTime, assistantReplyTimePlaceholder, hidePhone, placeholder, headerButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return L.f(this.id, item.id) && L.f(this.categoryId, item.categoryId) && L.f(this.category, item.category) && L.f(this.title, item.title) && L.f(this.price, item.price) && L.f(this.image, item.image) && this.deleted == item.deleted && L.f(this.userId, item.userId) && L.f(this.menu, item.menu) && L.f(this.attachMenu, item.attachMenu) && L.f(this.sharedLocation, item.sharedLocation) && L.f(this.replyTime, item.replyTime) && L.f(this.assistantReplyTimePlaceholder, item.assistantReplyTimePlaceholder) && this.hidePhone == item.hidePhone && L.f(this.placeholder, item.placeholder) && L.f(this.headerButton, item.headerButton);
        }

        @l
        public final String getAssistantReplyTimePlaceholder() {
            return this.assistantReplyTimePlaceholder;
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @l
        public AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @k
        public final String getCategory() {
            return this.category;
        }

        @k
        public final String getCategoryId() {
            return this.categoryId;
        }

        public final boolean getDeleted() {
            return this.deleted;
        }

        @l
        public final HeaderButton getHeaderButton() {
            return this.headerButton;
        }

        public final boolean getHidePhone() {
            return this.hidePhone;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @k
        public List<ChannelMenuAction> getMenu() {
            return this.menu;
        }

        @l
        public final Placeholder getPlaceholder() {
            return this.placeholder;
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        @l
        public final ChatReplyTime getReplyTime() {
            return this.replyTime;
        }

        @l
        public final MessageBody.Location getSharedLocation() {
            return this.sharedLocation;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(H.d(H.d(this.id.hashCode() * 31, 31, this.categoryId), 31, this.category), 31, this.title), 31, this.price);
            Image image = this.image;
            int i12 = r.i((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.deleted);
            String str = this.userId;
            int iE2 = H.e((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.menu);
            AttachMenu attachMenu = this.attachMenu;
            int iHashCode = (iE2 + (attachMenu == null ? 0 : attachMenu.hashCode())) * 31;
            MessageBody.Location location = this.sharedLocation;
            int iHashCode2 = (iHashCode + (location == null ? 0 : location.hashCode())) * 31;
            ChatReplyTime chatReplyTime = this.replyTime;
            int iHashCode3 = (iHashCode2 + (chatReplyTime == null ? 0 : chatReplyTime.hashCode())) * 31;
            String str2 = this.assistantReplyTimePlaceholder;
            int i13 = r.i((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.hidePhone);
            Placeholder placeholder = this.placeholder;
            int iHashCode4 = (i13 + (placeholder == null ? 0 : placeholder.hashCode())) * 31;
            HeaderButton headerButton = this.headerButton;
            return iHashCode4 + (headerButton != null ? headerButton.hashCode() : 0);
        }

        @k
        public String toString() {
            return C43066x.F0("ChannelContext.Item(\n                |   id='" + this.id + "',\n                |   categoryId='" + this.categoryId + "',\n                |   category='" + this.category + "',\n                |   title='" + this.title + "',\n                |   price='" + this.price + "',\n                |   image=" + this.image + ",\n                |   deleted=" + this.deleted + ",\n                |   userId=" + this.userId + ",\n                |   menu=" + getMenu() + ",\n                |   attachMenu=" + getAttachMenu() + ",\n                |   sharedLocation=" + this.sharedLocation + ",\n                |   replyTime=" + this.replyTime + ",\n                |   assistantReplyTimePlaceholder=" + this.assistantReplyTimePlaceholder + ",\n                |   hidePhone=" + this.hidePhone + ",\n                |   placeholder=" + this.placeholder + "\n                |)");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.categoryId);
            parcel.writeString(this.category);
            parcel.writeString(this.title);
            parcel.writeString(this.price);
            parcel.writeParcelable(this.image, flags);
            parcel.writeInt(this.deleted ? 1 : 0);
            parcel.writeString(this.userId);
            Iterator itJ = C0.j(this.menu, parcel);
            while (itJ.hasNext()) {
                ((ChannelMenuAction) itJ.next()).writeToParcel(parcel, flags);
            }
            AttachMenu attachMenu = this.attachMenu;
            if (attachMenu == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attachMenu.writeToParcel(parcel, flags);
            }
            MessageBody.Location location = this.sharedLocation;
            if (location == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                location.writeToParcel(parcel, flags);
            }
            ChatReplyTime chatReplyTime = this.replyTime;
            if (chatReplyTime == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                chatReplyTime.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.assistantReplyTimePlaceholder);
            parcel.writeInt(this.hidePhone ? 1 : 0);
            Placeholder placeholder = this.placeholder;
            if (placeholder == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                placeholder.writeToParcel(parcel, flags);
            }
            HeaderButton headerButton = this.headerButton;
            if (headerButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButton.writeToParcel(parcel, flags);
            }
        }

        public Item(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @l Image image, boolean z12, @l String str6, @k List<ChannelMenuAction> list, @l AttachMenu attachMenu, @l MessageBody.Location location, @l ChatReplyTime chatReplyTime, @l String str7, boolean z13, @l Placeholder placeholder, @l HeaderButton headerButton) {
            super(null);
            this.id = str;
            this.categoryId = str2;
            this.category = str3;
            this.title = str4;
            this.price = str5;
            this.image = image;
            this.deleted = z12;
            this.userId = str6;
            this.menu = list;
            this.attachMenu = attachMenu;
            this.sharedLocation = location;
            this.replyTime = chatReplyTime;
            this.assistantReplyTimePlaceholder = str7;
            this.hidePhone = z13;
            this.placeholder = placeholder;
            this.headerButton = headerButton;
        }
    }

    /* compiled from: ChannelContext.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJD\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u000e¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChannelContext$ReDeal;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", ChannelContext.SHARED_LOCATION, "", "Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", ChannelContext.MENU, "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", ChannelContext.ATTACH_MENU, "", ChannelContext.AVATAR_USER_ID, "<init>", "(Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "component4", "copy", "(Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/context/ChannelContext$ReDeal;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "getSharedLocation", "Ljava/util/List;", "getMenu", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "getAttachMenu", "Ljava/lang/String;", "getAvatarUserId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ReDeal extends ChannelContext {

        @k
        public static final String TYPE = "reDeal";

        @c(ChannelContext.ATTACH_MENU)
        @l
        private final AttachMenu attachMenu;

        @c(ChannelContext.AVATAR_USER_ID)
        @l
        private final String avatarUserId;

        @c(ChannelContext.MENU)
        @k
        private final List<ChannelMenuAction> menu;

        @c(ChannelContext.SHARED_LOCATION)
        @l
        private final MessageBody.Location sharedLocation;

        @k
        public static final Parcelable.Creator<ReDeal> CREATOR = new Creator();

        /* compiled from: ChannelContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ReDeal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReDeal createFromParcel(@k Parcel parcel) {
                MessageBody.Location locationCreateFromParcel = parcel.readInt() == 0 ? null : MessageBody.Location.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ChannelMenuAction.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ReDeal(locationCreateFromParcel, arrayList, parcel.readInt() != 0 ? AttachMenu.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReDeal[] newArray(int i12) {
                return new ReDeal[i12];
            }
        }

        public ReDeal(@l MessageBody.Location location, @k List<ChannelMenuAction> list, @l AttachMenu attachMenu, @l String str) {
            super(null);
            this.sharedLocation = location;
            this.menu = list;
            this.attachMenu = attachMenu;
            this.avatarUserId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReDeal copy$default(ReDeal reDeal, MessageBody.Location location, List list, AttachMenu attachMenu, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                location = reDeal.sharedLocation;
            }
            if ((i12 & 2) != 0) {
                list = reDeal.menu;
            }
            if ((i12 & 4) != 0) {
                attachMenu = reDeal.attachMenu;
            }
            if ((i12 & 8) != 0) {
                str = reDeal.avatarUserId;
            }
            return reDeal.copy(location, list, attachMenu, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final MessageBody.Location getSharedLocation() {
            return this.sharedLocation;
        }

        @k
        public final List<ChannelMenuAction> component2() {
            return this.menu;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getAvatarUserId() {
            return this.avatarUserId;
        }

        @k
        public final ReDeal copy(@l MessageBody.Location sharedLocation, @k List<ChannelMenuAction> menu, @l AttachMenu attachMenu, @l String avatarUserId) {
            return new ReDeal(sharedLocation, menu, attachMenu, avatarUserId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReDeal)) {
                return false;
            }
            ReDeal reDeal = (ReDeal) other;
            return L.f(this.sharedLocation, reDeal.sharedLocation) && L.f(this.menu, reDeal.menu) && L.f(this.attachMenu, reDeal.attachMenu) && L.f(this.avatarUserId, reDeal.avatarUserId);
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @l
        public AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @l
        public final String getAvatarUserId() {
            return this.avatarUserId;
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @k
        public List<ChannelMenuAction> getMenu() {
            return this.menu;
        }

        @l
        public final MessageBody.Location getSharedLocation() {
            return this.sharedLocation;
        }

        public int hashCode() {
            MessageBody.Location location = this.sharedLocation;
            int iE2 = H.e((location == null ? 0 : location.hashCode()) * 31, 31, this.menu);
            AttachMenu attachMenu = this.attachMenu;
            int iHashCode = (iE2 + (attachMenu == null ? 0 : attachMenu.hashCode())) * 31;
            String str = this.avatarUserId;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            return C43066x.F0("ChannelContext.ReDeal(\n                |   sharedLocation=" + this.sharedLocation + ",\n                |   menu=" + getMenu() + ", \n                |   attachMenu=" + getAttachMenu() + ",\n                |   avatarUserId=" + this.avatarUserId + ",\n                |)");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            MessageBody.Location location = this.sharedLocation;
            if (location == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                location.writeToParcel(parcel, flags);
            }
            Iterator itJ = C0.j(this.menu, parcel);
            while (itJ.hasNext()) {
                ((ChannelMenuAction) itJ.next()).writeToParcel(parcel, flags);
            }
            AttachMenu attachMenu = this.attachMenu;
            if (attachMenu == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attachMenu.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.avatarUserId);
        }
    }

    /* compiled from: ChannelContext.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJf\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020 HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010\u001d¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChannelContext$System;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "", "name", "status", "description", "Lcom/avito/android/remote/model/Image;", "image", "", "Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", ChannelContext.MENU, "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", ChannelContext.ATTACH_MENU, "Lcom/avito/android/remote/model/messenger/header/HeaderTitleButton;", ChannelContext.HEADER_TITLE_BUTTON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;Lcom/avito/android/remote/model/messenger/header/HeaderTitleButton;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "component7", "()Lcom/avito/android/remote/model/messenger/header/HeaderTitleButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;Lcom/avito/android/remote/model/messenger/header/HeaderTitleButton;)Lcom/avito/android/remote/model/messenger/context/ChannelContext$System;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getStatus", "getDescription", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/util/List;", "getMenu", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "getAttachMenu", "Lcom/avito/android/remote/model/messenger/header/HeaderTitleButton;", "getHeaderTitleButton", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class System extends ChannelContext {

        @k
        public static final String DESCRIPTION = "description";

        @k
        public static final String IMAGE = "image";

        @k
        public static final String NAME = "name";

        @k
        public static final String STATUS = "status";

        @k
        public static final String TYPE = "system";

        @c(ChannelContext.ATTACH_MENU)
        @l
        private final AttachMenu attachMenu;

        @c("description")
        @l
        private final String description;

        @c(ChannelContext.HEADER_TITLE_BUTTON)
        @l
        private final HeaderTitleButton headerTitleButton;

        @c("image")
        @l
        private final Image image;

        @c(ChannelContext.MENU)
        @k
        private final List<ChannelMenuAction> menu;

        @c("name")
        @k
        private final String name;

        @c("status")
        @l
        private final String status;

        @k
        public static final Parcelable.Creator<System> CREATOR = new Creator();

        /* compiled from: ChannelContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<System> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final System createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Image image = (Image) parcel.readParcelable(System.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ChannelMenuAction.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new System(string, string2, string3, image, arrayList, parcel.readInt() == 0 ? null : AttachMenu.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HeaderTitleButton.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final System[] newArray(int i12) {
                return new System[i12];
            }
        }

        public System(@k String str, @l String str2, @l String str3, @l Image image, @k List<ChannelMenuAction> list, @l AttachMenu attachMenu, @l HeaderTitleButton headerTitleButton) {
            super(null);
            this.name = str;
            this.status = str2;
            this.description = str3;
            this.image = image;
            this.menu = list;
            this.attachMenu = attachMenu;
            this.headerTitleButton = headerTitleButton;
        }

        public static /* synthetic */ System copy$default(System system, String str, String str2, String str3, Image image, List list, AttachMenu attachMenu, HeaderTitleButton headerTitleButton, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = system.name;
            }
            if ((i12 & 2) != 0) {
                str2 = system.status;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = system.description;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                image = system.image;
            }
            Image image2 = image;
            if ((i12 & 16) != 0) {
                list = system.menu;
            }
            List list2 = list;
            if ((i12 & 32) != 0) {
                attachMenu = system.attachMenu;
            }
            AttachMenu attachMenu2 = attachMenu;
            if ((i12 & 64) != 0) {
                headerTitleButton = system.headerTitleButton;
            }
            return system.copy(str, str4, str5, image2, list2, attachMenu2, headerTitleButton);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final List<ChannelMenuAction> component5() {
            return this.menu;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final HeaderTitleButton getHeaderTitleButton() {
            return this.headerTitleButton;
        }

        @k
        public final System copy(@k String name, @l String status, @l String description, @l Image image, @k List<ChannelMenuAction> menu, @l AttachMenu attachMenu, @l HeaderTitleButton headerTitleButton) {
            return new System(name, status, description, image, menu, attachMenu, headerTitleButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof System)) {
                return false;
            }
            System system = (System) other;
            return L.f(this.name, system.name) && L.f(this.status, system.status) && L.f(this.description, system.description) && L.f(this.image, system.image) && L.f(this.menu, system.menu) && L.f(this.attachMenu, system.attachMenu) && L.f(this.headerTitleButton, system.headerTitleButton);
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @l
        public AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final HeaderTitleButton getHeaderTitleButton() {
            return this.headerTitleButton;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @k
        public List<ChannelMenuAction> getMenu() {
            return this.menu;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.status;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.image;
            int iE2 = H.e((iHashCode3 + (image == null ? 0 : image.hashCode())) * 31, 31, this.menu);
            AttachMenu attachMenu = this.attachMenu;
            int iHashCode4 = (iE2 + (attachMenu == null ? 0 : attachMenu.hashCode())) * 31;
            HeaderTitleButton headerTitleButton = this.headerTitleButton;
            return iHashCode4 + (headerTitleButton != null ? headerTitleButton.hashCode() : 0);
        }

        @k
        public String toString() {
            return C43066x.F0("ChannelContext.System(\n                |   name='" + this.name + "',\n                |   status=" + this.status + ",\n                |   description=" + this.description + ",\n                |   image=" + this.image + ",\n                |   menu=" + getMenu() + ",\n                |   attachMenu=" + getAttachMenu() + ",\n                |   headerTitleButton=" + this.headerTitleButton + "\n                |)");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.status);
            parcel.writeString(this.description);
            parcel.writeParcelable(this.image, flags);
            Iterator itJ = C0.j(this.menu, parcel);
            while (itJ.hasNext()) {
                ((ChannelMenuAction) itJ.next()).writeToParcel(parcel, flags);
            }
            AttachMenu attachMenu = this.attachMenu;
            if (attachMenu == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attachMenu.writeToParcel(parcel, flags);
            }
            HeaderTitleButton headerTitleButton = this.headerTitleButton;
            if (headerTitleButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerTitleButton.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ChannelContext.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChannelContext$Unknown;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/context/ChannelContext$Unknown;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "", "Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", "getMenu", "()Ljava/util/List;", ChannelContext.MENU, "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "getAttachMenu", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", ChannelContext.ATTACH_MENU, "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unknown extends ChannelContext {

        @k
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        @c("type")
        @k
        private final String type;

        /* compiled from: ChannelContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Unknown createFromParcel(@k Parcel parcel) {
                return new Unknown(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Unknown[] newArray(int i12) {
                return new Unknown[i12];
            }
        }

        public Unknown(@k String str) {
            super(null);
            this.type = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = unknown.type;
            }
            return unknown.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        public final Unknown copy(@k String type) {
            return new Unknown(type);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && L.f(this.type, ((Unknown) other).type);
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @l
        public AttachMenu getAttachMenu() {
            return null;
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @k
        public List<ChannelMenuAction> getMenu() {
            return C42784z0.f406748b;
        }

        @k
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @k
        public String toString() {
            return AK.c.s(new StringBuilder("ChannelContext.Unknown(type='"), this.type, "')");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
        }
    }

    /* compiled from: ChannelContext.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0013¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/ChannelContext$UserToUser;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", ChannelContext.SHARED_LOCATION, "", "Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", ChannelContext.MENU, "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", ChannelContext.ATTACH_MENU, "<init>", "(Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "copy", "(Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;Ljava/util/List;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;)Lcom/avito/android/remote/model/messenger/context/ChannelContext$UserToUser;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "getSharedLocation", "Ljava/util/List;", "getMenu", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "getAttachMenu", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class UserToUser extends ChannelContext {

        @k
        public static final String TYPE = "user";

        @c(ChannelContext.ATTACH_MENU)
        @l
        private final AttachMenu attachMenu;

        @c(ChannelContext.MENU)
        @k
        private final List<ChannelMenuAction> menu;

        @c(ChannelContext.SHARED_LOCATION)
        @l
        private final MessageBody.Location sharedLocation;

        @k
        public static final Parcelable.Creator<UserToUser> CREATOR = new Creator();

        /* compiled from: ChannelContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserToUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UserToUser createFromParcel(@k Parcel parcel) {
                MessageBody.Location locationCreateFromParcel = parcel.readInt() == 0 ? null : MessageBody.Location.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ChannelMenuAction.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new UserToUser(locationCreateFromParcel, arrayList, parcel.readInt() != 0 ? AttachMenu.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UserToUser[] newArray(int i12) {
                return new UserToUser[i12];
            }
        }

        public UserToUser(@l MessageBody.Location location, @k List<ChannelMenuAction> list, @l AttachMenu attachMenu) {
            super(null);
            this.sharedLocation = location;
            this.menu = list;
            this.attachMenu = attachMenu;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserToUser copy$default(UserToUser userToUser, MessageBody.Location location, List list, AttachMenu attachMenu, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                location = userToUser.sharedLocation;
            }
            if ((i12 & 2) != 0) {
                list = userToUser.menu;
            }
            if ((i12 & 4) != 0) {
                attachMenu = userToUser.attachMenu;
            }
            return userToUser.copy(location, list, attachMenu);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final MessageBody.Location getSharedLocation() {
            return this.sharedLocation;
        }

        @k
        public final List<ChannelMenuAction> component2() {
            return this.menu;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @k
        public final UserToUser copy(@l MessageBody.Location sharedLocation, @k List<ChannelMenuAction> menu, @l AttachMenu attachMenu) {
            return new UserToUser(sharedLocation, menu, attachMenu);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserToUser)) {
                return false;
            }
            UserToUser userToUser = (UserToUser) other;
            return L.f(this.sharedLocation, userToUser.sharedLocation) && L.f(this.menu, userToUser.menu) && L.f(this.attachMenu, userToUser.attachMenu);
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @l
        public AttachMenu getAttachMenu() {
            return this.attachMenu;
        }

        @Override // com.avito.android.remote.model.messenger.context.ChannelContext
        @k
        public List<ChannelMenuAction> getMenu() {
            return this.menu;
        }

        @l
        public final MessageBody.Location getSharedLocation() {
            return this.sharedLocation;
        }

        public int hashCode() {
            MessageBody.Location location = this.sharedLocation;
            int iE2 = H.e((location == null ? 0 : location.hashCode()) * 31, 31, this.menu);
            AttachMenu attachMenu = this.attachMenu;
            return iE2 + (attachMenu != null ? attachMenu.hashCode() : 0);
        }

        @k
        public String toString() {
            return C43066x.F0("ChannelContext.UserToUser(\n                |   sharedLocation=" + this.sharedLocation + ",\n                |   menu=" + getMenu() + ", \n                |   attachMenu=" + getAttachMenu() + "\n                |)");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            MessageBody.Location location = this.sharedLocation;
            if (location == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                location.writeToParcel(parcel, flags);
            }
            Iterator itJ = C0.j(this.menu, parcel);
            while (itJ.hasNext()) {
                ((ChannelMenuAction) itJ.next()).writeToParcel(parcel, flags);
            }
            AttachMenu attachMenu = this.attachMenu;
            if (attachMenu == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attachMenu.writeToParcel(parcel, flags);
            }
        }
    }

    public /* synthetic */ ChannelContext(C42822w c42822w) {
        this();
    }

    @l
    public abstract AttachMenu getAttachMenu();

    @k
    public abstract List<ChannelMenuAction> getMenu();

    private ChannelContext() {
    }
}
