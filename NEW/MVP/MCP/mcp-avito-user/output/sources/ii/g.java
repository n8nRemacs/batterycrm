package Ii;

import com.avito.android.beduin.v2.page.impl.BeduinV2TabFragmentData;
import com.avito.android.beduin.v2.page.impl.BeduinV2TabPageFragment;
import com.avito.android.beduin.v2.page.impl.C28869f;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements InterfaceC28898u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28869f f8488b;

    public g(C28869f c28869f) {
        this.f8488b = c28869f;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return BeduinV2TabFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        BeduinV2TabPageFragment beduinV2TabPageFragment = new BeduinV2TabPageFragment();
        beduinV2TabPageFragment.setArguments(this.f8488b.a(((BeduinV2TabFragmentData) data).f104899b));
        return beduinV2TabPageFragment;
    }
}
