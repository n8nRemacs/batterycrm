package Jm;

import Y61.k;
import com.avito.android.beduin.v2.page.impl.C28869f;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.cart.CartBeduinV2Fragment;
import com.avito.android.cart.CartBeduinV2TabFragmentData;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14214a implements InterfaceC28898u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28869f f9127b;

    public C14214a(C28869f c28869f) {
        this.f9127b = c28869f;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final Class<?> a() {
        return CartBeduinV2TabFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final TabBaseFragment b(@k TabFragmentFactory.Data data) {
        CartBeduinV2Fragment cartBeduinV2Fragment = new CartBeduinV2Fragment();
        cartBeduinV2Fragment.setArguments(this.f9127b.a(((CartBeduinV2TabFragmentData) data).f115290b));
        return cartBeduinV2Fragment;
    }
}
