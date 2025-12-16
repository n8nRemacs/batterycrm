package XL;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.U;
import kotlin.Metadata;

/* compiled from: IacCanCallInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXL/a;", "", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: IacCanCallInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: XL.a$a, reason: collision with other inner class name */
    public static final class C1329a {
        public static /* synthetic */ I a(a aVar, String str, String str2, String str3, DeepLink deepLink, int i12) {
            if ((i12 & 8) != 0) {
                deepLink = null;
            }
            return aVar.b(deepLink, str, str2, str3, true);
        }
    }

    @k
    String a();

    @k
    I b(@l DeepLink deepLink, @k String str, @k String str2, @k String str3, boolean z12);

    @k
    U c(@k IacCallContext iacCallContext, @l DeepLink deepLink);

    @k
    U d(@k IacCallContext iacCallContext, @l PhoneLink.Call call);
}
