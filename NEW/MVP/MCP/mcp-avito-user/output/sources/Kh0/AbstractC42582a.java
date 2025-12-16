package kH0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import com.avito.android.util.Kundle;
import fH0.AbstractC40291a;
import fc.C40396a;
import kotlin.Metadata;

/* compiled from: BaseBannerPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkH0/a;", "LfH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kH0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC42582a extends AbstractC40291a {

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Kundle f406221d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f406222e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public MyAdvertDetailsItem f406223f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f406224g;

    public AbstractC42582a(@l Kundle kundle, @k InterfaceC28373a interfaceC28373a) {
        this.f406221d = kundle;
        this.f406222e = interfaceC28373a;
        this.f406224g = kundle != null ? kundle.f318647b.getBoolean("banner_was_tracked", false) : false;
    }

    public final void S(@l MyAdvertDetailsItem myAdvertDetailsItem) {
        if (this.f406224g || myAdvertDetailsItem == null) {
            return;
        }
        this.f406222e.c(new C40396a(myAdvertDetailsItem.f309129b, myAdvertDetailsItem.f309141h, "item-banner", null, 8, null));
        this.f406224g = true;
    }
}
