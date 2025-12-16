package O11;

import Y41.l;
import androidx.compose.animation.core.C20281g0;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.layout.K0;
import com.vk.id.exchangetoken.VKIDExchangeTokenCallback;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.compose.progress.CircleProgressKt;
import com.vk.id.group.subscription.compose.util.TightWrapTextKt;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import com.vk.id.internal.api.VKIDApiService;
import okhttp3.Response;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11925c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f11924b = i12;
        this.f11925c = obj;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        switch (this.f11924b) {
            case 0:
                return CircleProgressKt.CircleProgress$lambda$5$lambda$4((C20281g0.a) this.f11925c, (InterfaceC22276o0) obj);
            case 1:
                return VKIDApiService.getSilentAuthProviders$lambda$1((VKIDApiService) this.f11925c, (Response) obj);
            case 2:
                return VKIDTokenExchanger.handleCode$lambda$4$lambda$3((VKIDExchangeTokenCallback) this.f11925c, (Throwable) obj);
            case 3:
                return TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$3((K0) this.f11925c, (K0.a) obj);
            default:
                return GroupSubscriptionSheet.Content$lambda$25$lambda$24((GroupSubscriptionSheet) this.f11925c, (VKIDGroupSubscriptionFail) obj);
        }
    }
}
