package com.avito.android.brandspace.di;

import android.os.Bundle;
import com.avito.android.C30828i;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi;
import com.avito.android.brandspace.router.BrandspaceArguments;
import com.avito.android.brandspace.router.BrandspaceFragmentData;
import com.avito.android.brandspace.view.BrandspaceFragment;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements InterfaceC28898u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30828i f107691b;

    public m(C30828i c30828i) {
        this.f107691b = c30828i;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return BrandspaceFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        C30828i c30828i = this.f107691b;
        kotlin.reflect.n<Object> nVar = C30828i.f164256k[8];
        boolean zBooleanValue = ((Boolean) c30828i.f164265j.a().invoke()).booleanValue();
        BrandspaceArguments brandspaceArguments = ((BrandspaceFragmentData) data).f107768b;
        if (zBooleanValue) {
            BrandspaceFragmentMvi.f107581G0.getClass();
            BrandspaceFragmentMvi brandspaceFragmentMvi = new BrandspaceFragmentMvi();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_brandspace_arguments", brandspaceArguments);
            brandspaceFragmentMvi.setArguments(bundle);
            return brandspaceFragmentMvi;
        }
        BrandspaceFragment.f107771D0.getClass();
        BrandspaceFragment brandspaceFragment = new BrandspaceFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("key_brandspace_arguments", brandspaceArguments);
        brandspaceFragment.setArguments(bundle2);
        return brandspaceFragment;
    }
}
