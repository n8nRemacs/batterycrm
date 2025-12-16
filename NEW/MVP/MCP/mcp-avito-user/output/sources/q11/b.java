package Q11;

import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.util.MD5;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13422b;

    public /* synthetic */ b(int i12) {
        this.f13422b = i12;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f13422b) {
            case 0:
                return VKIDDepsProd.pkceGenerator$lambda$28();
            case 1:
                return MD5.tmpBuilder_delegate$lambda$0();
            case 2:
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$9$lambda$8();
            case 3:
                return GroupSubscriptionSheetKt.LoadedState$lambda$35$lambda$34();
            case 4:
                return G0.f406611a;
            case 5:
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$7$lambda$6();
            default:
                return GroupSubscriptionSheet.onSuccess$lambda$1();
        }
    }
}
