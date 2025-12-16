package P11;

import Y41.l;
import com.vk.id.VKID;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import com.vk.id.group.subscription.xml.GroupSubscriptionSnackbarHost;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.internal.auth.app.SilentAuthInfoUtils;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.app.VkAuthProviderInfo;
import okhttp3.Response;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12782b;

    public /* synthetic */ a(int i12) {
        this.f12782b = i12;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        switch (this.f12782b) {
            case 0:
                return VKIDApiService.wrapTokenToVKIDCall$lambda$6((Response) obj);
            case 1:
                return VKIDApiService.exchangeToken$lambda$2((Response) obj);
            case 2:
                return VKIDApiService.getUserInfo$lambda$0((Response) obj);
            case 3:
                return VKIDApiService.logout$lambda$3((Response) obj);
            case 4:
                return VKID._get_accessToken_$lambda$14((Throwable) obj);
            case 5:
                return VKID._init_$lambda$1((Throwable) obj);
            case 6:
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$30$lambda$29$lambda$27((Throwable) obj);
            case 7:
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$3$lambda$2((VKIDGroupSubscriptionFail) obj);
            case 8:
                return GroupSubscriptionSheetState.showSheet$lambda$0(((Boolean) obj).booleanValue());
            case 9:
                return GroupSubscriptionSheet.onStyleChange$lambda$4((GroupSubscriptionStyle) obj);
            case 10:
                return GroupSubscriptionSheet.onGroupIdChange$lambda$0((String) obj);
            case 11:
                return GroupSubscriptionSheet.onFail$lambda$2((VKIDGroupSubscriptionFail) obj);
            case 12:
                return GroupSubscriptionSheet.onSnackbarHostChange$lambda$3((GroupSubscriptionSnackbarHost) obj);
            case 13:
                return GroupSubscriptionSnackbarHost.onStyleChange$lambda$0((GroupSubscriptionStyle) obj);
            case 14:
                return AuthActivity.finish$lambda$12((Throwable) obj);
            case 15:
                return AuthActivity.onNewIntent$lambda$4((Throwable) obj);
            case 16:
                return AuthActivity.onResume$lambda$6((Throwable) obj);
            case 17:
                return AuthActivity.onCreate$lambda$2((Throwable) obj);
            case 18:
                return AuthActivity.onSaveInstanceState$lambda$10((Throwable) obj);
            case 19:
                return AuthActivity.onStop$lambda$0((Throwable) obj);
            case 20:
                return AuthActivity.onPause$lambda$8((Throwable) obj);
            case 21:
                return AuthActivity.AnonymousClass1.onCustomTabsServiceConnected$lambda$0((Throwable) obj);
            case 22:
                return SilentAuthInfoUtils.calculateDigestHex$lambda$1((byte[]) obj);
            case 23:
                return SilentAuthInfoUtils.calculateDigestBase64$lambda$0((byte[]) obj);
            default:
                return SilentAuthServicesProvider.getSilentAuthServices$lambda$3((VkAuthProviderInfo) obj);
        }
    }
}
