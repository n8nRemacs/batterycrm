package M11;

import Y41.l;
import android.content.pm.ResolveInfo;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.timestamp_storage.data.dao.a;
import com.avito.android.timestamp_storage.data.dao.f;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.refresh.VKIDRefreshTokenCallback;
import com.vk.id.refresh.VKIDTokenRefresher;
import java.util.List;
import kotlin.coroutines.Continuation;
import xE0.C49826a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10345d;

    public /* synthetic */ c(int i12, Object obj, Object obj2) {
        this.f10343b = i12;
        this.f10344c = obj;
        this.f10345d = obj2;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        switch (this.f10343b) {
            case 0:
                return GroupSubscriptionAnalytics.SheetScreenShown$lambda$9$lambda$8((InterfaceC22204y1) this.f10344c, (InterfaceC22204y1) this.f10345d, (C22128n0) obj);
            case 1:
                f fVar = (f) this.f10344c;
                fVar.getClass();
                return a.C9223a.a(fVar, (C49826a) this.f10345d, (Continuation) obj);
            case 2:
                return GroupSubscriptionSheetKt.processSheetShow$lambda$72$lambda$71$lambda$70((GroupSubscriptionSheetState) this.f10344c, (l) this.f10345d, (Throwable) obj);
            case 3:
                return SilentAuthServicesProvider.getSilentAuthServices$lambda$0((SilentAuthServicesProvider) this.f10344c, (List) this.f10345d, (ResolveInfo) obj);
            default:
                return VKIDTokenRefresher.refresh$lambda$2$lambda$1((VKIDTokenRefresher) this.f10344c, (VKIDRefreshTokenCallback) this.f10345d, (Throwable) obj);
        }
    }
}
