package Yl0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertCpxPromo;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertItemRightAction;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertItemRightActionV2;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertStatus;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LYl0/l;", "", "a", "b", "LYl0/l$a;", "LYl0/l$b;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yl0.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC18289l {

    /* compiled from: ProfileItemsApiV13Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LYl0/l$a;", "LYl0/l;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yl0.l$a */
    public static final class a implements InterfaceC18289l {

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final String text;

        public a(@Y61.k String str) {
            this.text = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: ProfileItemsApiV13Response.kt */
    @Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bl\u0018\u00002\u00020\u0001BÇ\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\u0004\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\u0006\u0010D\u001a\u00020\u0005\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010RR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\be\u0010[R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010f\u001a\u0004\bg\u0010hR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bi\u0010[R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010m\u001a\u0004\bn\u0010oR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010Y\u001a\u0004\bp\u0010[R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010q\u001a\u0004\br\u0010sR\u001a\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010t\u001a\u0004\bu\u0010vR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010w\u001a\u0004\bx\u0010yR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010f\u001a\u0004\bz\u0010hR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010{\u001a\u0004\b!\u0010|R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010f\u001a\u0004\b}\u0010hR\u001d\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b$\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001d\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b%\u0010Y\u001a\u0005\b\u0081\u0001\u0010[R\u001f\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b'\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b(\u0010Y\u001a\u0005\b\u0085\u0001\u0010[R\u001f\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b*\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b,\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001f\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b.\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001d\u0010/\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b/\u0010Y\u001a\u0005\b\u008f\u0001\u0010[R\u001f\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b1\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b3\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001f\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b5\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001f\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b7\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R#\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b9\u0010S\u001a\u0005\b\u009c\u0001\u0010UR\u001d\u0010:\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b:\u0010Y\u001a\u0005\b\u009d\u0001\u0010[R\u001d\u0010;\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b;\u0010Y\u001a\u0005\b\u009e\u0001\u0010[R\u001f\u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b=\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u0010?\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b?\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001f\u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bA\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bC\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010D\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\bD\u0010Y\u001a\u0005\b«\u0001\u0010[R\u001f\u0010F\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bF\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001d\u0010G\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\r\n\u0004\bG\u0010j\u001a\u0005\b¯\u0001\u0010lR\u001e\u0010I\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bI\u0010°\u0001\u001a\u0005\bt\u0010±\u0001R\u001f\u0010K\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bK\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001f\u0010M\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bM\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001¨\u0006¸\u0001"}, d2 = {"LYl0/l$b;", "LYl0/l;", "LYl0/n;", "actionButton", "", "", "actions", "LYl0/o;", "addressesAdditionalInfo", "availableStocks", "LYl0/p;", "category", "LYl0/q;", "contactsBbl", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo;", "cpxPromo", "declineReason", "", NotificationsSettings.Section.SECTION_DELIVERY, "deliveryAlertText", "Lcom/avito/android/deep_linking/links/DeepLink;", "editDeeplink", "LYl0/s;", "fashionAuthentication", "fillParameters", "LYl0/t;", "hiddenItemReason", "", "id", "LYl0/u;", "images", "isAutoPublishOn", "LYl0/v;", "isHiddenItem", "isModerated", "LYl0/C;", "liquidityStatus", "location", "LYl0/D;", "multiItemsInfo", "price", "LYl0/F;", "priceBadge", "LYl0/G;", "realtyLeadgen", "LYl0/H;", "realtyOwnerBadge", "reservationInfo", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightAction;", "rightAction", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;", "rightActionV2", "Lcom/avito/android/remote/model/text/AttributedText;", "saleInfo", "LYl0/K;", "searchPosition", "LYl0/L;", "services", "shortcut", "shortcutTitle", "LYl0/M;", "space", "LYl0/N;", "stats", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertStatus;", "status", "LYl0/P;", "tip", "title", "LYl0/Q;", "ttl", TooltipAttribute.PARAM_DEEP_LINK, "LYl0/w;", "vacancyRostrudStatus", "LYl0/S;", "verification", "LYl0/T;", "video", "<init>", "(LYl0/n;Ljava/util/List;LYl0/o;Ljava/lang/String;LYl0/p;LYl0/q;Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;LYl0/s;Ljava/lang/String;LYl0/t;JLYl0/u;Ljava/lang/Boolean;LYl0/v;Ljava/lang/Boolean;LYl0/C;Ljava/lang/String;LYl0/D;Ljava/lang/String;LYl0/F;LYl0/G;LYl0/H;Ljava/lang/String;Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightAction;Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;Lcom/avito/android/remote/model/text/AttributedText;LYl0/K;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LYl0/M;LYl0/N;Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertStatus;LYl0/P;Ljava/lang/String;LYl0/Q;Lcom/avito/android/deep_linking/links/DeepLink;LYl0/w;LYl0/S;LYl0/T;)V", "LYl0/n;", "a", "()LYl0/n;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LYl0/o;", "c", "()LYl0/o;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LYl0/p;", "getCategory", "()LYl0/p;", "LYl0/q;", "e", "()LYl0/q;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo;", "f", "()Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo;", "g", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "i", "Lcom/avito/android/deep_linking/links/DeepLink;", "j", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LYl0/s;", "k", "()LYl0/s;", "l", "LYl0/t;", "getHiddenItemReason", "()LYl0/t;", "J", "m", "()J", "LYl0/u;", "n", "()LYl0/u;", "M", "LYl0/v;", "()LYl0/v;", "N", "LYl0/C;", "o", "()LYl0/C;", "p", "LYl0/D;", "q", "()LYl0/D;", "r", "LYl0/F;", "s", "()LYl0/F;", "LYl0/G;", "t", "()LYl0/G;", "LYl0/H;", "u", "()LYl0/H;", "v", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightAction;", "getRightAction", "()Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightAction;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;", "w", "()Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertItemRightActionV2;", "Lcom/avito/android/remote/model/text/AttributedText;", "x", "()Lcom/avito/android/remote/model/text/AttributedText;", "LYl0/K;", "y", "()LYl0/K;", "z", "A", "B", "LYl0/M;", "C", "()LYl0/M;", "LYl0/N;", "D", "()LYl0/N;", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertStatus;", "E", "()Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertStatus;", "LYl0/P;", "F", "()LYl0/P;", "G", "LYl0/Q;", "H", "()LYl0/Q;", "I", "LYl0/w;", "()LYl0/w;", "LYl0/S;", "K", "()LYl0/S;", "LYl0/T;", "L", "()LYl0/T;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yl0.l$b */
    public static final class b implements InterfaceC18289l {

        @com.google.gson.annotations.c("actionButton")
        @Y61.l
        private final C18291n actionButton;

        @com.google.gson.annotations.c("actions")
        @Y61.l
        private final List<String> actions;

        @com.google.gson.annotations.c("addressesAdditionalInfo")
        @Y61.l
        private final C18292o addressesAdditionalInfo;

        @com.google.gson.annotations.c("availableStocks")
        @Y61.l
        private final String availableStocks;

        @com.google.gson.annotations.c("category")
        @Y61.l
        private final C18293p category;

        @com.google.gson.annotations.c("contactsBbl")
        @Y61.l
        private final C18294q contactsBbl;

        @com.google.gson.annotations.c("cpxPromo")
        @Y61.l
        private final UserAdvertCpxPromo cpxPromo;

        @com.google.gson.annotations.c("declineReason")
        @Y61.l
        private final String declineReason;

        @com.google.gson.annotations.c(NotificationsSettings.Section.SECTION_DELIVERY)
        @Y61.l
        private final Boolean delivery;

        @com.google.gson.annotations.c("deliveryAlertText")
        @Y61.l
        private final String deliveryAlertText;

        @com.google.gson.annotations.c("editDeeplink")
        @Y61.l
        private final DeepLink editDeeplink;

        @com.google.gson.annotations.c("fashionAuthentication")
        @Y61.l
        private final C18295s fashionAuthentication;

        @com.google.gson.annotations.c("fillParameters")
        @Y61.l
        private final String fillParameters;

        @com.google.gson.annotations.c("hiddenItemReason")
        @Y61.l
        private final C18296t hiddenItemReason;

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("images")
        @Y61.l
        private final C18297u images;

        @com.google.gson.annotations.c("isAutoPublishOn")
        @Y61.l
        private final Boolean isAutoPublishOn;

        @com.google.gson.annotations.c("isHiddenItem")
        @Y61.l
        private final v isHiddenItem;

        @com.google.gson.annotations.c("isModerated")
        @Y61.l
        private final Boolean isModerated;

        @com.google.gson.annotations.c("liquidityStatus")
        @Y61.l
        private final C18277C liquidityStatus;

        @com.google.gson.annotations.c("location")
        @Y61.l
        private final String location;

        @com.google.gson.annotations.c("multiItemsInfo")
        @Y61.l
        private final D multiItemsInfo;

        @com.google.gson.annotations.c("price")
        @Y61.l
        private final String price;

        @com.google.gson.annotations.c("priceBadge")
        @Y61.l
        private final F priceBadge;

        @com.google.gson.annotations.c("realtyLeadgen")
        @Y61.l
        private final G realtyLeadgen;

        @com.google.gson.annotations.c("realtyOwnerBadge")
        @Y61.l
        private final H realtyOwnerBadge;

        @com.google.gson.annotations.c("reservationInfo")
        @Y61.l
        private final String reservationInfo;

        @com.google.gson.annotations.c("rightAction")
        @Y61.l
        private final UserAdvertItemRightAction rightAction;

        @com.google.gson.annotations.c("rightActionV2")
        @Y61.l
        private final UserAdvertItemRightActionV2 rightActionV2;

        @com.google.gson.annotations.c("saleInfo")
        @Y61.l
        private final AttributedText saleInfo;

        @com.google.gson.annotations.c("searchPosition")
        @Y61.l
        private final K searchPosition;

        @com.google.gson.annotations.c("services")
        @Y61.l
        private final List<L> services;

        @com.google.gson.annotations.c("shortcut")
        @Y61.l
        private final String shortcut;

        @com.google.gson.annotations.c("shortcutTitle")
        @Y61.l
        private final String shortcutTitle;

        @com.google.gson.annotations.c("space")
        @Y61.l
        private final M space;

        @com.google.gson.annotations.c("stats")
        @Y61.l
        private final N stats;

        @com.google.gson.annotations.c("status")
        @Y61.l
        private final UserAdvertStatus status;

        @com.google.gson.annotations.c("tip")
        @Y61.l
        private final P tip;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("ttl")
        @Y61.l
        private final Q ttl;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @Y61.l
        private final DeepLink uri;

        @com.google.gson.annotations.c("vacancyRostrudStatus")
        @Y61.l
        private final w vacancyRostrudStatus;

        @com.google.gson.annotations.c("verification")
        @Y61.l
        private final S verification;

        @com.google.gson.annotations.c("video")
        @Y61.l
        private final T video;

        public b(@Y61.l C18291n c18291n, @Y61.l List<String> list, @Y61.l C18292o c18292o, @Y61.l String str, @Y61.l C18293p c18293p, @Y61.l C18294q c18294q, @Y61.l UserAdvertCpxPromo userAdvertCpxPromo, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3, @Y61.l DeepLink deepLink, @Y61.l C18295s c18295s, @Y61.l String str4, @Y61.l C18296t c18296t, long j12, @Y61.l C18297u c18297u, @Y61.l Boolean bool2, @Y61.l v vVar, @Y61.l Boolean bool3, @Y61.l C18277C c18277c, @Y61.l String str5, @Y61.l D d12, @Y61.l String str6, @Y61.l F f12, @Y61.l G g12, @Y61.l H h12, @Y61.l String str7, @Y61.l UserAdvertItemRightAction userAdvertItemRightAction, @Y61.l UserAdvertItemRightActionV2 userAdvertItemRightActionV2, @Y61.l AttributedText attributedText, @Y61.l K k12, @Y61.l List<L> list2, @Y61.l String str8, @Y61.l String str9, @Y61.l M m12, @Y61.l N n12, @Y61.l UserAdvertStatus userAdvertStatus, @Y61.l P p12, @Y61.k String str10, @Y61.l Q q12, @Y61.l DeepLink deepLink2, @Y61.l w wVar, @Y61.l S s5, @Y61.l T t12) {
            this.actionButton = c18291n;
            this.actions = list;
            this.addressesAdditionalInfo = c18292o;
            this.availableStocks = str;
            this.category = c18293p;
            this.contactsBbl = c18294q;
            this.cpxPromo = userAdvertCpxPromo;
            this.declineReason = str2;
            this.delivery = bool;
            this.deliveryAlertText = str3;
            this.editDeeplink = deepLink;
            this.fashionAuthentication = c18295s;
            this.fillParameters = str4;
            this.hiddenItemReason = c18296t;
            this.id = j12;
            this.images = c18297u;
            this.isAutoPublishOn = bool2;
            this.isHiddenItem = vVar;
            this.isModerated = bool3;
            this.liquidityStatus = c18277c;
            this.location = str5;
            this.multiItemsInfo = d12;
            this.price = str6;
            this.priceBadge = f12;
            this.realtyLeadgen = g12;
            this.realtyOwnerBadge = h12;
            this.reservationInfo = str7;
            this.rightAction = userAdvertItemRightAction;
            this.rightActionV2 = userAdvertItemRightActionV2;
            this.saleInfo = attributedText;
            this.searchPosition = k12;
            this.services = list2;
            this.shortcut = str8;
            this.shortcutTitle = str9;
            this.space = m12;
            this.stats = n12;
            this.status = userAdvertStatus;
            this.tip = p12;
            this.title = str10;
            this.ttl = q12;
            this.uri = deepLink2;
            this.vacancyRostrudStatus = wVar;
            this.verification = s5;
            this.video = t12;
        }

        @Y61.l
        /* renamed from: A, reason: from getter */
        public final String getShortcut() {
            return this.shortcut;
        }

        @Y61.l
        /* renamed from: B, reason: from getter */
        public final String getShortcutTitle() {
            return this.shortcutTitle;
        }

        @Y61.l
        /* renamed from: C, reason: from getter */
        public final M getSpace() {
            return this.space;
        }

        @Y61.l
        /* renamed from: D, reason: from getter */
        public final N getStats() {
            return this.stats;
        }

        @Y61.l
        /* renamed from: E, reason: from getter */
        public final UserAdvertStatus getStatus() {
            return this.status;
        }

        @Y61.l
        /* renamed from: F, reason: from getter */
        public final P getTip() {
            return this.tip;
        }

        @Y61.k
        /* renamed from: G, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.l
        /* renamed from: H, reason: from getter */
        public final Q getTtl() {
            return this.ttl;
        }

        @Y61.l
        /* renamed from: I, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @Y61.l
        /* renamed from: J, reason: from getter */
        public final w getVacancyRostrudStatus() {
            return this.vacancyRostrudStatus;
        }

        @Y61.l
        /* renamed from: K, reason: from getter */
        public final S getVerification() {
            return this.verification;
        }

        @Y61.l
        /* renamed from: L, reason: from getter */
        public final T getVideo() {
            return this.video;
        }

        @Y61.l
        /* renamed from: M, reason: from getter */
        public final Boolean getIsAutoPublishOn() {
            return this.isAutoPublishOn;
        }

        @Y61.l
        /* renamed from: N, reason: from getter */
        public final Boolean getIsModerated() {
            return this.isModerated;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final C18291n getActionButton() {
            return this.actionButton;
        }

        @Y61.l
        public final List<String> b() {
            return this.actions;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final C18292o getAddressesAdditionalInfo() {
            return this.addressesAdditionalInfo;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getAvailableStocks() {
            return this.availableStocks;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final C18294q getContactsBbl() {
            return this.contactsBbl;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final UserAdvertCpxPromo getCpxPromo() {
            return this.cpxPromo;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final String getDeclineReason() {
            return this.declineReason;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final Boolean getDelivery() {
            return this.delivery;
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final String getDeliveryAlertText() {
            return this.deliveryAlertText;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final DeepLink getEditDeeplink() {
            return this.editDeeplink;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final C18295s getFashionAuthentication() {
            return this.fashionAuthentication;
        }

        @Y61.l
        /* renamed from: l, reason: from getter */
        public final String getFillParameters() {
            return this.fillParameters;
        }

        /* renamed from: m, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @Y61.l
        /* renamed from: n, reason: from getter */
        public final C18297u getImages() {
            return this.images;
        }

        @Y61.l
        /* renamed from: o, reason: from getter */
        public final C18277C getLiquidityStatus() {
            return this.liquidityStatus;
        }

        @Y61.l
        /* renamed from: p, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @Y61.l
        /* renamed from: q, reason: from getter */
        public final D getMultiItemsInfo() {
            return this.multiItemsInfo;
        }

        @Y61.l
        /* renamed from: r, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Y61.l
        /* renamed from: s, reason: from getter */
        public final F getPriceBadge() {
            return this.priceBadge;
        }

        @Y61.l
        /* renamed from: t, reason: from getter */
        public final G getRealtyLeadgen() {
            return this.realtyLeadgen;
        }

        @Y61.l
        /* renamed from: u, reason: from getter */
        public final H getRealtyOwnerBadge() {
            return this.realtyOwnerBadge;
        }

        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getReservationInfo() {
            return this.reservationInfo;
        }

        @Y61.l
        /* renamed from: w, reason: from getter */
        public final UserAdvertItemRightActionV2 getRightActionV2() {
            return this.rightActionV2;
        }

        @Y61.l
        /* renamed from: x, reason: from getter */
        public final AttributedText getSaleInfo() {
            return this.saleInfo;
        }

        @Y61.l
        /* renamed from: y, reason: from getter */
        public final K getSearchPosition() {
            return this.searchPosition;
        }

        @Y61.l
        public final List<L> z() {
            return this.services;
        }
    }
}
