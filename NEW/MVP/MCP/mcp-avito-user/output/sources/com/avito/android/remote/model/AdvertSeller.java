package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.service_seller_type.ServiceSellerType;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AdvertSeller.kt */
@d
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010)J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010)J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010)J\u0012\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010)J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010)J\u0012\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010)J\u009c\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010)J\u0010\u0010P\u001a\u00020OHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010T\u001a\u00020\u00132\b\u0010S\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020OHÖ\u0001¢\u0006\u0004\bV\u0010QJ \u0010[\u001a\u00020Z2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020OHÖ\u0001¢\u0006\u0004\b[\u0010\\R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010]\u001a\u0004\b^\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010]\u001a\u0004\b_\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010]\u001a\u0004\b`\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010]\u001a\u0004\ba\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010b\u001a\u0004\bc\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\be\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010f\u001a\u0004\bg\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010f\u001a\u0004\bh\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010i\u001a\u0004\bj\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010]\u001a\u0004\bk\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010l\u001a\u0004\bm\u00108R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010n\u001a\u0004\bo\u0010:R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010p\u001a\u0004\bq\u0010<R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010]\u0012\u0004\bs\u0010t\u001a\u0004\br\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\bu\u0010)R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010v\u001a\u0004\b\u0019\u0010@R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010w\u001a\u0004\bx\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010y\u001a\u0004\bz\u0010DR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010{\u001a\u0004\b|\u0010FR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010}\u001a\u0004\b~\u0010HR#\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b$\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010JR\u001d\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b%\u0010]\u001a\u0005\b\u0081\u0001\u0010)¨\u0006\u0082\u0001"}, d2 = {"Lcom/avito/android/remote/model/AdvertSeller;", "Landroid/os/Parcelable;", "", "title", "name", "postfix", "manager", "Lcom/avito/android/remote/model/SellerConnection;", "connection", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "entryPointShowEvent", "Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "sellerType", "summary", "Lcom/avito/android/remote/model/SellerRating;", "rating", "", "online", "Lcom/avito/android/remote/model/SellerReplySpeed;", "replySpeed", "userHashId", "userKey", "isVerified", "Lcom/avito/android/remote/model/SellerSubscriptionInfo;", "subscriptionInfo", "Lcom/avito/android/remote/model/Action;", "ratingAction", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/SellerAvatar;", "avatar", "", "Lcom/avito/android/remote/model/SellerInfoAdvantage;", "advantages", "companyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SellerConnection;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;Ljava/lang/String;Lcom/avito/android/remote/model/SellerRating;ZLcom/avito/android/remote/model/SellerReplySpeed;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/SellerSubscriptionInfo;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/SellerAvatar;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/SellerConnection;", "component6", "()Lcom/avito/android/remote/model/Image;", "component7", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component8", "component9", "()Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "component10", "component11", "()Lcom/avito/android/remote/model/SellerRating;", "component12", "()Z", "component13", "()Lcom/avito/android/remote/model/SellerReplySpeed;", "component14", "component15", "component16", "()Ljava/lang/Boolean;", "component17", "()Lcom/avito/android/remote/model/SellerSubscriptionInfo;", "component18", "()Lcom/avito/android/remote/model/Action;", "component19", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "component20", "()Lcom/avito/android/remote/model/SellerAvatar;", "component21", "()Ljava/util/List;", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SellerConnection;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;Ljava/lang/String;Lcom/avito/android/remote/model/SellerRating;ZLcom/avito/android/remote/model/SellerReplySpeed;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/SellerSubscriptionInfo;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/SellerAvatar;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertSeller;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getName", "getPostfix", "getManager", "Lcom/avito/android/remote/model/SellerConnection;", "getConnection", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "getEntryPointShowEvent", "Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "getSellerType", "getSummary", "Lcom/avito/android/remote/model/SellerRating;", "getRating", "Z", "getOnline", "Lcom/avito/android/remote/model/SellerReplySpeed;", "getReplySpeed", "getUserHashId", "getUserHashId$annotations", "()V", "getUserKey", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/SellerSubscriptionInfo;", "getSubscriptionInfo", "Lcom/avito/android/remote/model/Action;", "getRatingAction", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "Lcom/avito/android/remote/model/SellerAvatar;", "getAvatar", "Ljava/util/List;", "getAdvantages", "getCompanyName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertSeller implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertSeller> CREATOR = new Creator();

    @c("advantages")
    @l
    private final List<SellerInfoAdvantage> advantages;

    @c("avatar")
    @l
    private final SellerAvatar avatar;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c("companyName")
    @l
    private final String companyName;

    @c("connection")
    @l
    private final SellerConnection connection;

    @c("entryPointShowEvent")
    @l
    private final DeepLink entryPointShowEvent;

    @c("images")
    @l
    private final Image image;

    @c("isVerified")
    @l
    private final Boolean isVerified;

    @c("link")
    @l
    private final DeepLink link;

    @c("manager")
    @l
    private final String manager;

    @c("name")
    @l
    private final String name;

    @c("online")
    private final boolean online;

    @c("postfix")
    @l
    private final String postfix;

    @c("rating")
    @l
    private final SellerRating rating;

    @c("ratingAction")
    @l
    private final Action ratingAction;

    @c(ChannelContext.Item.REPLY_TIME)
    @l
    private final SellerReplySpeed replySpeed;

    @c("servicesSellerType")
    @l
    private final ServiceSellerType sellerType;

    @c("subscribeInfo")
    @l
    private final SellerSubscriptionInfo subscriptionInfo;

    @c("summary")
    @l
    private final String summary;

    @c("title")
    @l
    private final String title;

    @c("userHashId")
    @l
    private final String userHashId;

    @c("userHash")
    @l
    private final String userKey;

    /* compiled from: AdvertSeller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertSeller> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSeller createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            boolean z12;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            SellerConnection sellerConnectionCreateFromParcel = parcel.readInt() == 0 ? null : SellerConnection.CREATOR.createFromParcel(parcel);
            Image image = (Image) parcel.readParcelable(AdvertSeller.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(AdvertSeller.class.getClassLoader());
            DeepLink deepLink2 = (DeepLink) parcel.readParcelable(AdvertSeller.class.getClassLoader());
            ServiceSellerType serviceSellerTypeCreateFromParcel = parcel.readInt() == 0 ? null : ServiceSellerType.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            SellerRating sellerRatingCreateFromParcel = parcel.readInt() == 0 ? null : SellerRating.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            boolean z13 = parcel.readInt() != 0;
            SellerReplySpeed sellerReplySpeedCreateFromParcel = parcel.readInt() == 0 ? null : SellerReplySpeed.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            SellerSubscriptionInfo sellerSubscriptionInfoCreateFromParcel = parcel.readInt() == 0 ? null : SellerSubscriptionInfo.CREATOR.createFromParcel(parcel);
            Action action = (Action) parcel.readParcelable(AdvertSeller.class.getClassLoader());
            SerpBadgeBar serpBadgeBarCreateFromParcel = parcel.readInt() == 0 ? null : SerpBadgeBar.CREATOR.createFromParcel(parcel);
            SellerAvatar sellerAvatarCreateFromParcel = parcel.readInt() == 0 ? null : SellerAvatar.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                z12 = z13;
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(SellerInfoAdvantage.CREATOR, parcel, arrayList2, iC2, 1);
                    i12 = i12;
                    z13 = z13;
                }
                z12 = z13;
                arrayList = arrayList2;
            }
            return new AdvertSeller(string, string2, string3, string4, sellerConnectionCreateFromParcel, image, deepLink, deepLink2, serviceSellerTypeCreateFromParcel, string5, sellerRatingCreateFromParcel, z12, sellerReplySpeedCreateFromParcel, string6, string7, boolValueOf, sellerSubscriptionInfoCreateFromParcel, action, serpBadgeBarCreateFromParcel, sellerAvatarCreateFromParcel, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSeller[] newArray(int i12) {
            return new AdvertSeller[i12];
        }
    }

    public AdvertSeller() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final SellerRating getRating() {
        return this.rating;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final SellerReplySpeed getReplySpeed() {
        return this.replySpeed;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final String getUserHashId() {
        return this.userHashId;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final String getUserKey() {
        return this.userKey;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Boolean getIsVerified() {
        return this.isVerified;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final SellerSubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Action getRatingAction() {
        return this.ratingAction;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final SellerAvatar getAvatar() {
        return this.avatar;
    }

    @l
    public final List<SellerInfoAdvantage> component21() {
        return this.advantages;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPostfix() {
        return this.postfix;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getManager() {
        return this.manager;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final SellerConnection getConnection() {
        return this.connection;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final ServiceSellerType getSellerType() {
        return this.sellerType;
    }

    @k
    public final AdvertSeller copy(@l String title, @l String name, @l String postfix, @l String manager, @l SellerConnection connection, @l Image image, @l DeepLink link, @l DeepLink entryPointShowEvent, @l ServiceSellerType sellerType, @l String summary, @l SellerRating rating, boolean online, @l SellerReplySpeed replySpeed, @l String userHashId, @l String userKey, @l Boolean isVerified, @l SellerSubscriptionInfo subscriptionInfo, @l Action ratingAction, @l SerpBadgeBar badgeBar, @l SellerAvatar avatar, @l List<SellerInfoAdvantage> advantages, @l String companyName) {
        return new AdvertSeller(title, name, postfix, manager, connection, image, link, entryPointShowEvent, sellerType, summary, rating, online, replySpeed, userHashId, userKey, isVerified, subscriptionInfo, ratingAction, badgeBar, avatar, advantages, companyName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertSeller)) {
            return false;
        }
        AdvertSeller advertSeller = (AdvertSeller) other;
        return L.f(this.title, advertSeller.title) && L.f(this.name, advertSeller.name) && L.f(this.postfix, advertSeller.postfix) && L.f(this.manager, advertSeller.manager) && L.f(this.connection, advertSeller.connection) && L.f(this.image, advertSeller.image) && L.f(this.link, advertSeller.link) && L.f(this.entryPointShowEvent, advertSeller.entryPointShowEvent) && L.f(this.sellerType, advertSeller.sellerType) && L.f(this.summary, advertSeller.summary) && L.f(this.rating, advertSeller.rating) && this.online == advertSeller.online && L.f(this.replySpeed, advertSeller.replySpeed) && L.f(this.userHashId, advertSeller.userHashId) && L.f(this.userKey, advertSeller.userKey) && L.f(this.isVerified, advertSeller.isVerified) && L.f(this.subscriptionInfo, advertSeller.subscriptionInfo) && L.f(this.ratingAction, advertSeller.ratingAction) && L.f(this.badgeBar, advertSeller.badgeBar) && L.f(this.avatar, advertSeller.avatar) && L.f(this.advantages, advertSeller.advantages) && L.f(this.companyName, advertSeller.companyName);
    }

    @l
    public final List<SellerInfoAdvantage> getAdvantages() {
        return this.advantages;
    }

    @l
    public final SellerAvatar getAvatar() {
        return this.avatar;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final String getCompanyName() {
        return this.companyName;
    }

    @l
    public final SellerConnection getConnection() {
        return this.connection;
    }

    @l
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final DeepLink getLink() {
        return this.link;
    }

    @l
    public final String getManager() {
        return this.manager;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final boolean getOnline() {
        return this.online;
    }

    @l
    public final String getPostfix() {
        return this.postfix;
    }

    @l
    public final SellerRating getRating() {
        return this.rating;
    }

    @l
    public final Action getRatingAction() {
        return this.ratingAction;
    }

    @l
    public final SellerReplySpeed getReplySpeed() {
        return this.replySpeed;
    }

    @l
    public final ServiceSellerType getSellerType() {
        return this.sellerType;
    }

    @l
    public final SellerSubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    @l
    public final String getSummary() {
        return this.summary;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getUserHashId() {
        return this.userHashId;
    }

    @l
    public final String getUserKey() {
        return this.userKey;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postfix;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.manager;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SellerConnection sellerConnection = this.connection;
        int iHashCode5 = (iHashCode4 + (sellerConnection == null ? 0 : sellerConnection.hashCode())) * 31;
        Image image = this.image;
        int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        DeepLink deepLink = this.link;
        int iHashCode7 = (iHashCode6 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.entryPointShowEvent;
        int iHashCode8 = (iHashCode7 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        ServiceSellerType serviceSellerType = this.sellerType;
        int iHashCode9 = (iHashCode8 + (serviceSellerType == null ? 0 : serviceSellerType.hashCode())) * 31;
        String str5 = this.summary;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SellerRating sellerRating = this.rating;
        int i12 = r.i((iHashCode10 + (sellerRating == null ? 0 : sellerRating.hashCode())) * 31, 31, this.online);
        SellerReplySpeed sellerReplySpeed = this.replySpeed;
        int iHashCode11 = (i12 + (sellerReplySpeed == null ? 0 : sellerReplySpeed.hashCode())) * 31;
        String str6 = this.userHashId;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userKey;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isVerified;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        SellerSubscriptionInfo sellerSubscriptionInfo = this.subscriptionInfo;
        int iHashCode15 = (iHashCode14 + (sellerSubscriptionInfo == null ? 0 : sellerSubscriptionInfo.hashCode())) * 31;
        Action action = this.ratingAction;
        int iHashCode16 = (iHashCode15 + (action == null ? 0 : action.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        int iHashCode17 = (iHashCode16 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        SellerAvatar sellerAvatar = this.avatar;
        int iHashCode18 = (iHashCode17 + (sellerAvatar == null ? 0 : sellerAvatar.hashCode())) * 31;
        List<SellerInfoAdvantage> list = this.advantages;
        int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.companyName;
        return iHashCode19 + (str8 != null ? str8.hashCode() : 0);
    }

    @l
    public final Boolean isVerified() {
        return this.isVerified;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertSeller(title=");
        sb2.append(this.title);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", postfix=");
        sb2.append(this.postfix);
        sb2.append(", manager=");
        sb2.append(this.manager);
        sb2.append(", connection=");
        sb2.append(this.connection);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", entryPointShowEvent=");
        sb2.append(this.entryPointShowEvent);
        sb2.append(", sellerType=");
        sb2.append(this.sellerType);
        sb2.append(", summary=");
        sb2.append(this.summary);
        sb2.append(", rating=");
        sb2.append(this.rating);
        sb2.append(", online=");
        sb2.append(this.online);
        sb2.append(", replySpeed=");
        sb2.append(this.replySpeed);
        sb2.append(", userHashId=");
        sb2.append(this.userHashId);
        sb2.append(", userKey=");
        sb2.append(this.userKey);
        sb2.append(", isVerified=");
        sb2.append(this.isVerified);
        sb2.append(", subscriptionInfo=");
        sb2.append(this.subscriptionInfo);
        sb2.append(", ratingAction=");
        sb2.append(this.ratingAction);
        sb2.append(", badgeBar=");
        sb2.append(this.badgeBar);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", advantages=");
        sb2.append(this.advantages);
        sb2.append(", companyName=");
        return C22026a.c(sb2, this.companyName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.name);
        parcel.writeString(this.postfix);
        parcel.writeString(this.manager);
        SellerConnection sellerConnection = this.connection;
        if (sellerConnection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerConnection.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.link, flags);
        parcel.writeParcelable(this.entryPointShowEvent, flags);
        ServiceSellerType serviceSellerType = this.sellerType;
        if (serviceSellerType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceSellerType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.summary);
        SellerRating sellerRating = this.rating;
        if (sellerRating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerRating.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.online ? 1 : 0);
        SellerReplySpeed sellerReplySpeed = this.replySpeed;
        if (sellerReplySpeed == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerReplySpeed.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.userHashId);
        parcel.writeString(this.userKey);
        Boolean bool = this.isVerified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        SellerSubscriptionInfo sellerSubscriptionInfo = this.subscriptionInfo;
        if (sellerSubscriptionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerSubscriptionInfo.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.ratingAction, flags);
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        if (serpBadgeBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeBar.writeToParcel(parcel, flags);
        }
        SellerAvatar sellerAvatar = this.avatar;
        if (sellerAvatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerAvatar.writeToParcel(parcel, flags);
        }
        List<SellerInfoAdvantage> list = this.advantages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SellerInfoAdvantage) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.companyName);
    }

    public AdvertSeller(@l String str, @l String str2, @l String str3, @l String str4, @l SellerConnection sellerConnection, @l Image image, @l DeepLink deepLink, @l DeepLink deepLink2, @l ServiceSellerType serviceSellerType, @l String str5, @l SellerRating sellerRating, boolean z12, @l SellerReplySpeed sellerReplySpeed, @l String str6, @l String str7, @l Boolean bool, @l SellerSubscriptionInfo sellerSubscriptionInfo, @l Action action, @l SerpBadgeBar serpBadgeBar, @l SellerAvatar sellerAvatar, @l List<SellerInfoAdvantage> list, @l String str8) {
        this.title = str;
        this.name = str2;
        this.postfix = str3;
        this.manager = str4;
        this.connection = sellerConnection;
        this.image = image;
        this.link = deepLink;
        this.entryPointShowEvent = deepLink2;
        this.sellerType = serviceSellerType;
        this.summary = str5;
        this.rating = sellerRating;
        this.online = z12;
        this.replySpeed = sellerReplySpeed;
        this.userHashId = str6;
        this.userKey = str7;
        this.isVerified = bool;
        this.subscriptionInfo = sellerSubscriptionInfo;
        this.ratingAction = action;
        this.badgeBar = serpBadgeBar;
        this.avatar = sellerAvatar;
        this.advantages = list;
        this.companyName = str8;
    }

    @InterfaceC42830m
    public static /* synthetic */ void getUserHashId$annotations() {
    }

    public /* synthetic */ AdvertSeller(String str, String str2, String str3, String str4, SellerConnection sellerConnection, Image image, DeepLink deepLink, DeepLink deepLink2, ServiceSellerType serviceSellerType, String str5, SellerRating sellerRating, boolean z12, SellerReplySpeed sellerReplySpeed, String str6, String str7, Boolean bool, SellerSubscriptionInfo sellerSubscriptionInfo, Action action, SerpBadgeBar serpBadgeBar, SellerAvatar sellerAvatar, List list, String str8, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : sellerConnection, (i12 & 32) != 0 ? null : image, (i12 & 64) != 0 ? null : deepLink, (i12 & 128) != 0 ? null : deepLink2, (i12 & 256) != 0 ? null : serviceSellerType, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? null : sellerRating, (i12 & 2048) != 0 ? false : z12, (i12 & 4096) != 0 ? null : sellerReplySpeed, (i12 & 8192) != 0 ? null : str6, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str7, (i12 & 32768) != 0 ? null : bool, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : sellerSubscriptionInfo, (i12 & 131072) != 0 ? null : action, (i12 & 262144) != 0 ? null : serpBadgeBar, (i12 & 524288) != 0 ? null : sellerAvatar, (i12 & 1048576) != 0 ? null : list, (i12 & 2097152) != 0 ? null : str8);
    }
}
