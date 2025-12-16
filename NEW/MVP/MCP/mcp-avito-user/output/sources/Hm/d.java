package Hm;

import Y61.k;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.Z0;
import com.avito.android.beduin.v2.page.BeduinV2FragmentParams;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.beduin.v2.page.o;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.cart.CartBeduinV2Activity;
import com.avito.android.cart.CartBeduinV2TabFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: CartBeduinV2IntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHm/d;", "LHm/c;", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f7680a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Z0 f7681b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final L f7682c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f7683d;

    @Inject
    public d(@k o oVar, @k Z0 z02, @k L l12, @k com.avito.android.navigation.a aVar) {
        this.f7680a = oVar;
        this.f7681b = z02;
        this.f7682c = l12;
        this.f7683d = aVar;
    }

    @Override // Hm.c
    @k
    public final Intent a(@k BeduinV2PageDeepLink beduinV2PageDeepLink) {
        Z0 z02 = this.f7681b;
        z02.getClass();
        n<Object> nVar = Z0.f67595D[18];
        if (!((Boolean) z02.f67618u.a().invoke()).booleanValue()) {
            Intent intentB = this.f7680a.b(beduinV2PageDeepLink, CartBeduinV2Activity.class);
            intentB.setFlags(603979776);
            return intentB;
        }
        BeduinV2FragmentParams beduinV2FragmentParams = new BeduinV2FragmentParams(beduinV2PageDeepLink.f104782b, beduinV2PageDeepLink.f104783c, beduinV2PageDeepLink.f104784d, beduinV2PageDeepLink.f104785e, beduinV2PageDeepLink.f104788h, beduinV2PageDeepLink.f104789i, beduinV2PageDeepLink.f104790j);
        NavigationTabSetItem navigationTabSetItemA = this.f7683d.a();
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = NavigationTab.f106970f;
        }
        return this.f7682c.d(new CartBeduinV2TabFragmentData(beduinV2FragmentParams, navigationTabSetItemA));
    }
}
