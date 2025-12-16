package z5;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_apply.GigApplyDeeplink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AdvertGigPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz5/b;", "Lz5/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements InterfaceC50374a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f443834a;

    /* compiled from: AdvertGigPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f443835a;

        static {
            int[] iArr = new int[AdvertDetailsFastOpenParams.GigAction.values().length];
            try {
                AdvertDetailsFastOpenParams.GigAction gigAction = AdvertDetailsFastOpenParams.GigAction.f71346b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f443835a = iArr;
        }
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f443834a = aVar;
    }

    @Override // z5.InterfaceC50374a
    public final void a(@l AdvertDetailsFastOpenParams.GigParams gigParams) {
        String str;
        Long lZ02;
        AdvertDetailsFastOpenParams.GigAction gigAction = gigParams != null ? gigParams.f71350c : null;
        if ((gigAction == null ? -1 : a.f443835a[gigAction.ordinal()]) != 1 || (str = gigParams.f71349b) == null || (lZ02 = C43066x.z0(str)) == null) {
            return;
        }
        b.a.a(this.f443834a, new GigApplyDeeplink(lZ02.longValue(), true), null, null, 6);
    }
}
